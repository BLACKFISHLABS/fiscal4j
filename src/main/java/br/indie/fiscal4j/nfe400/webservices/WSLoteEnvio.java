package br.indie.fiscal4j.nfe400.webservices;

import br.indie.fiscal4j.DFLog;
import br.indie.fiscal4j.DFModelo;
import br.indie.fiscal4j.nfe.NFTipoEmissao;
import br.indie.fiscal4j.nfe.NFeConfig;
import br.indie.fiscal4j.nfe400.classes.NFAutorizador400;
import br.indie.fiscal4j.nfe400.classes.lote.envio.NFLoteEnvio;
import br.indie.fiscal4j.nfe400.classes.lote.envio.NFLoteEnvioRetorno;
import br.indie.fiscal4j.nfe400.classes.lote.envio.NFLoteEnvioRetornoDados;
import br.indie.fiscal4j.nfe400.classes.nota.NFNota;
import br.indie.fiscal4j.nfe400.classes.nota.NFNotaInfoSuplementar;
import br.indie.fiscal4j.nfe400.utils.NFGeraChave;
import br.indie.fiscal4j.nfe400.utils.qrcode20.NFGeraQRCode20;
import br.indie.fiscal4j.nfe400.utils.qrcode20.NFGeraQRCodeContingenciaOffline20;
import br.indie.fiscal4j.nfe400.utils.qrcode20.NFGeraQRCodeEmissaoNormal20;
import br.indie.fiscal4j.nfe400.webservices.gerado.NFeAutorizacao4Stub;
import br.indie.fiscal4j.nfe400.webservices.gerado.NFeAutorizacao4Stub.NfeResultMsg;
import br.indie.fiscal4j.utils.DFAssinaturaDigital;
import br.indie.fiscal4j.validadores.DFXMLValidador;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import org.apache.commons.lang3.StringUtils;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.StringReader;
import java.util.Iterator;

class WSLoteEnvio implements DFLog {

    private static final String NFE_ELEMENTO = "NFe";
    private final NFeConfig config;

    WSLoteEnvio(final NFeConfig config) {
        this.config = config;
    }

    NFLoteEnvioRetorno enviaLoteAssinado(final String loteAssinadoXml, final DFModelo modelo) throws Exception {
        return this.comunicaLote(loteAssinadoXml, modelo);
    }

    NFLoteEnvioRetornoDados enviaLote(final NFLoteEnvio lote, boolean validarXML) throws Exception {
        final NFLoteEnvio loteAssinado = this.getLoteAssinado(lote);
        final NFLoteEnvioRetorno loteEnvioRetorno = this.comunicaLote(loteAssinado.toString(),
                loteAssinado.getNotas().get(0).getInfo().getIdentificacao().getModelo(), validarXML);
        return new NFLoteEnvioRetornoDados(loteEnvioRetorno, loteAssinado);
    }

    NFLoteEnvioRetornoDados enviaLote(final NFLoteEnvio lote) throws Exception {
        return this.enviaLote(lote, true);
    }

    /**
     * Retorna o Lote assinado.
     */
    NFLoteEnvio getLoteAssinado(final NFLoteEnvio lote) throws Exception {
        // adiciona a chave e o dv antes de assinar
        for (final NFNota nota : lote.getNotas()) {
            final NFGeraChave geraChave = new NFGeraChave(nota);
            nota.getInfo().getIdentificacao().setCodigoRandomico(StringUtils.defaultIfBlank(
                    nota.getInfo().getIdentificacao().getCodigoRandomico(), geraChave.geraCodigoRandomico()));
            nota.getInfo().getIdentificacao().setDigitoVerificador(geraChave.getDV());
            nota.getInfo().setIdentificador(geraChave.getChaveAcesso());
        }
        // assina o lote
        final String documentoAssinado = new DFAssinaturaDigital(this.config).assinarDocumento(lote.toString());
        final NFLoteEnvio loteAssinado = this.config.getPersister().read(NFLoteEnvio.class, documentoAssinado);

        // verifica se nao tem NFCe junto com NFe no lote e gera qrcode (apos assinar
        // mesmo, eh assim)
        int qtdNF = 0, qtdNFC = 0;
        for (final NFNota nota : loteAssinado.getNotas()) {
            switch (nota.getInfo().getIdentificacao().getModelo()) {
                case NFE:
                    qtdNF++;
                    break;
                case NFCE:
                    NFGeraQRCode20 geraQRCode = getNfGeraQRCode20(nota);

                    nota.setInfoSuplementar(new NFNotaInfoSuplementar());
                    nota.getInfoSuplementar().setUrlConsultaChaveAcesso(geraQRCode.urlConsultaChaveAcesso());
                    nota.getInfoSuplementar().setQrCode(geraQRCode.getQRCode());
                    qtdNFC++;
                    break;
                default:
                    throw new IllegalArgumentException(String.format("Modelo de nota desconhecida: %s",
                            nota.getInfo().getIdentificacao().getModelo()));
            }
        }
        // verifica se todas as notas do lote sao do mesmo modelo
        if ((qtdNF > 0) && (qtdNFC > 0)) {
            throw new IllegalArgumentException("Lote contendo notas de modelos diferentes!");
        }
        return loteAssinado;
    }

    private NFGeraQRCode20 getNfGeraQRCode20(NFNota nota) {
        if (NFTipoEmissao.EMISSAO_NORMAL.equals(nota.getInfo().getIdentificacao().getTipoEmissao())) {
            return new NFGeraQRCodeEmissaoNormal20(nota, this.config);
        } else if (NFTipoEmissao.CONTIGENCIA_OFFLINE.equals(nota.getInfo().getIdentificacao().getTipoEmissao())) {
            return new NFGeraQRCodeContingenciaOffline20(nota, this.config);
        } else {
            throw new IllegalArgumentException("QRCode 2.0 Tipo Emissao nao implementado: "
                    + nota.getInfo().getIdentificacao().getTipoEmissao().getDescricao());
        }
    }

    private NFLoteEnvioRetorno comunicaLote(final String loteAssinadoXml, final DFModelo modelo, boolean validarXML)
            throws Exception {
        final NfeResultMsg autorizacaoLoteResult = comunicaLoteRaw(loteAssinadoXml, modelo, validarXML);
        final NFLoteEnvioRetorno loteEnvioRetorno = this.config.getPersister().read(NFLoteEnvioRetorno.class,
                autorizacaoLoteResult.getExtraElement().toString());
        this.getLogger().debug(loteEnvioRetorno.toString());
        return loteEnvioRetorno;
    }

    private NFLoteEnvioRetorno comunicaLote(final String loteAssinadoXml, final DFModelo modelo) throws Exception {
        return this.comunicaLote(loteAssinadoXml, modelo, true);
    }

    NfeResultMsg comunicaLoteRaw(final String loteAssinadoXml, final DFModelo modelo, boolean validarXML)
            throws Exception {

        if (validarXML) {
            // valida o lote assinado, para verificar se o xsd foi satisfeito, antes de
            // comunicar com a sefaz
            DFXMLValidador.validaLote400(loteAssinadoXml);
        }

        // envia o lote para a sefaz
        final OMElement omElement = this.nfeToOMElement(loteAssinadoXml);

        final NFeAutorizacao4Stub.NfeDadosMsg dados = new NFeAutorizacao4Stub.NfeDadosMsg();
        dados.setExtraElement(omElement);

        // define o tipo de emissao
        final NFAutorizador400 autorizador = NFAutorizador400.valueOfTipoEmissao(this.config.getTipoEmissao(),
                this.config.getCUF());

        final String endpoint = DFModelo.NFE.equals(modelo) ? autorizador.getNfeAutorizacao(this.config.getAmbiente())
                : autorizador.getNfceAutorizacao(this.config.getAmbiente());
        if (endpoint == null) {
            throw new IllegalArgumentException("Nao foi possivel encontrar URL para Autorizacao " + modelo.name()
                    + ", autorizador " + autorizador.name());
        }

        return new NFeAutorizacao4Stub(endpoint, config).nfeAutorizacaoLote(dados);
    }

    private OMElement nfeToOMElement(final String documento) throws XMLStreamException {
        final XMLInputFactory factory = XMLInputFactory.newInstance();
        factory.setProperty(XMLInputFactory.IS_COALESCING, false);
        final XMLStreamReader reader = factory.createXMLStreamReader(new StringReader(documento));
        final StAXOMBuilder builder = new StAXOMBuilder(reader);
        final OMElement ome = builder.getDocumentElement();
        final Iterator<?> children = ome.getChildrenWithLocalName(WSLoteEnvio.NFE_ELEMENTO);
        while (children.hasNext()) {
            final OMElement omElement = (OMElement) children.next();
            if ((omElement != null) && (WSLoteEnvio.NFE_ELEMENTO.equals(omElement.getLocalName()))) {
                omElement.addAttribute("xmlns", NFeConfig.NAMESPACE, null);
            }
        }
        return ome;
    }
}
