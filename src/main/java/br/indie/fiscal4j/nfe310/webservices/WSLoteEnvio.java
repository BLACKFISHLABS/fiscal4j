package br.indie.fiscal4j.nfe310.webservices;

import br.indie.fiscal4j.DFLog;
import br.indie.fiscal4j.DFModelo;
import br.indie.fiscal4j.nfe.NFeConfig;
import br.indie.fiscal4j.nfe310.classes.NFAutorizador31;
import br.indie.fiscal4j.nfe310.classes.lote.envio.NFLoteEnvio;
import br.indie.fiscal4j.nfe310.classes.lote.envio.NFLoteEnvioRetorno;
import br.indie.fiscal4j.nfe310.classes.lote.envio.NFLoteEnvioRetornoDados;
import br.indie.fiscal4j.nfe310.classes.nota.NFNota;
import br.indie.fiscal4j.nfe310.classes.nota.NFNotaInfoSuplementar;
import br.indie.fiscal4j.nfe310.utils.NFGeraChave;
import br.indie.fiscal4j.nfe310.utils.NFGeraQRCode;
import br.indie.fiscal4j.nfe310.webservices.gerado.NfeAutorizacaoStub;
import br.indie.fiscal4j.nfe310.webservices.gerado.NfeAutorizacaoStub.NfeAutorizacaoLoteResult;
import br.indie.fiscal4j.nfe310.webservices.gerado.NfeAutorizacaoStub.NfeCabecMsg;
import br.indie.fiscal4j.nfe310.webservices.gerado.NfeAutorizacaoStub.NfeCabecMsgE;
import br.indie.fiscal4j.nfe310.webservices.gerado.NfeAutorizacaoStub.NfeDadosMsg;
import br.indie.fiscal4j.utils.DFAssinaturaDigital;
import br.indie.fiscal4j.validadores.XMLValidador;
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

    NFLoteEnvioRetornoDados enviaLote(final NFLoteEnvio lote) throws Exception {
        final NFLoteEnvio loteAssinado = this.getLoteAssinado(lote);
        // comunica o lote
        final NFLoteEnvioRetorno loteEnvioRetorno = this.comunicaLote(loteAssinado.toString(), loteAssinado.getNotas().get(0).getInfo().getIdentificacao().getModelo());
        return new NFLoteEnvioRetornoDados(loteEnvioRetorno, loteAssinado);
    }

    /**
     * Retorna o Lote assinado.
     */
    NFLoteEnvio getLoteAssinado(final NFLoteEnvio lote) throws Exception {
        // adiciona a chave e o dv antes de assinar
        for (final NFNota nota : lote.getNotas()) {
            final NFGeraChave geraChave = new NFGeraChave(nota);
            nota.getInfo().getIdentificacao().setCodigoRandomico(StringUtils.defaultIfBlank(nota.getInfo().getIdentificacao().getCodigoRandomico(), geraChave.geraCodigoRandomico()));
            nota.getInfo().getIdentificacao().setDigitoVerificador(geraChave.getDV());
            nota.getInfo().setIdentificador(geraChave.getChaveAcesso());
        }
        // assina o lote
        final String documentoAssinado = new DFAssinaturaDigital(this.config).assinarDocumento(lote.toString());
        //final NFLoteEnvio loteAssinado = new DFParser().loteParaObjeto(documentoAssinado);
        final NFLoteEnvio loteAssinado = this.config.getPersister().read(NFLoteEnvio.class, documentoAssinado);

        // verifica se nao tem NFCe junto com NFe no lote e gera qrcode (apos assinar mesmo, eh assim)
        int qtdNF = 0, qtdNFC = 0;
        for (final NFNota nota : loteAssinado.getNotas()) {
            switch (nota.getInfo().getIdentificacao().getModelo()) {
                case NFE:
                    qtdNF++;
                    break;
                case NFCE:
                    final NFGeraQRCode geraQRCode = new NFGeraQRCode(nota, this.config);
                    nota.setInfoSuplementar(new NFNotaInfoSuplementar());
                    nota.getInfoSuplementar().setQrCode(geraQRCode.getQRCode());
                    qtdNFC++;
                    break;
                default:
                    throw new IllegalArgumentException(String.format("Modelo de nota desconhecida: %s", nota.getInfo().getIdentificacao().getModelo()));
            }
        }
        // verifica se todas as notas do lote sao do mesmo modelo
        if ((qtdNF > 0) && (qtdNFC > 0)) {
            throw new IllegalArgumentException("Lote contendo notas de modelos diferentes!");
        }
        return loteAssinado;
    }

    private NFLoteEnvioRetorno comunicaLote(final String loteAssinadoXml, final DFModelo modelo) throws Exception {
        // valida o lote assinado, para verificar se o xsd foi satisfeito, antes de comunicar com a sefaz
        XMLValidador.validaLote(loteAssinadoXml);

        // envia o lote para a sefaz
        final OMElement omElement = this.nfeToOMElement(loteAssinadoXml);

        final NfeDadosMsg dados = new NfeDadosMsg();
        dados.setExtraElement(omElement);

        final NfeCabecMsgE cabecalhoSOAP = this.getCabecalhoSOAP();
        this.getLogger().debug(omElement.toString());

        // define o tipo de emissao
        final NFAutorizador31 autorizador = NFAutorizador31.valueOfTipoEmissao(this.config.getTipoEmissao(), this.config.getCUF());

        final String endpoint = DFModelo.NFE.equals(modelo) ? autorizador.getNfeAutorizacao(this.config.getAmbiente()) : autorizador.getNfceAutorizacao(this.config.getAmbiente());
        if (endpoint == null) {
            throw new IllegalArgumentException("Nao foi possivel encontrar URL para Autorizacao " + modelo.name() + ", autorizador " + autorizador.name());
        }

        final NfeAutorizacaoLoteResult autorizacaoLoteResult = new NfeAutorizacaoStub(endpoint).nfeAutorizacaoLote(dados, cabecalhoSOAP);
        final NFLoteEnvioRetorno loteEnvioRetorno = this.config.getPersister().read(NFLoteEnvioRetorno.class, autorizacaoLoteResult.getExtraElement().toString());
        this.getLogger().debug(loteEnvioRetorno.toString());
        return loteEnvioRetorno;
    }

    private NfeCabecMsgE getCabecalhoSOAP() {
        final NfeCabecMsg cabecalho = new NfeCabecMsg();
        cabecalho.setCUF(this.config.getCUF().getCodigoIbge());
        cabecalho.setVersaoDados(this.config.getVersao());
        final NfeCabecMsgE cabecalhoSOAP = new NfeCabecMsgE();
        cabecalhoSOAP.setNfeCabecMsg(cabecalho);
        return cabecalhoSOAP;
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
