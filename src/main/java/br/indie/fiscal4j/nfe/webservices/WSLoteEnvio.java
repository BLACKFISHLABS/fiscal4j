package br.indie.fiscal4j.nfe.webservices;

import br.indie.fiscal4j.common.DFModelo;
import br.indie.fiscal4j.nfe.NFeConfig;
import br.indie.fiscal4j.nfe.assinatura.AssinaturaDigital;
import br.indie.fiscal4j.nfe.classes.NFAutorizador4;
import br.indie.fiscal4j.nfe.classes.lote.envio.NFLoteEnvio;
import br.indie.fiscal4j.nfe.classes.lote.envio.NFLoteEnvioRetorno;
import br.indie.fiscal4j.nfe.classes.lote.envio.NFLoteEnvioRetornoDados;
import br.indie.fiscal4j.nfe.classes.nota.NFNota;
import br.indie.fiscal4j.nfe.classes.nota.NFNotaInfoSuplementar;
import br.indie.fiscal4j.nfe.parsers.NotaParser;
import br.indie.fiscal4j.nfe.persister.NFPersister;
import br.indie.fiscal4j.nfe.utils.NFGeraChave;
import br.indie.fiscal4j.nfe.utils.NFGeraQRCode;
import br.indie.fiscal4j.nfe.validadores.xsd.XMLValidador;
import br.indie.fiscal4j.nfe.webservices.gerado.NfeAutorizacaoStub;
import br.indie.fiscal4j.nfe.webservices.gerado.NfeAutorizacaoStub.NfeAutorizacaoLoteResult;
import br.indie.fiscal4j.nfe.webservices.gerado.NfeAutorizacaoStub.NfeCabecMsg;
import br.indie.fiscal4j.nfe.webservices.gerado.NfeAutorizacaoStub.NfeCabecMsgE;
import br.indie.fiscal4j.nfe.webservices.gerado.NfeAutorizacaoStub.NfeDadosMsg;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.StringReader;
import java.util.Iterator;

class WSLoteEnvio {

    private static final String NFE_ELEMENTO = "NFe";
    private static final Logger LOGGER = LoggerFactory.getLogger(WSLoteEnvio.class);
    private final NFeConfig config;

    WSLoteEnvio(final NFeConfig config) {
        this.config = config;
    }

    NFLoteEnvioRetorno enviaLoteAssinado(final String loteAssinadoXml, final DFModelo modelo) throws Exception {
        return this.comunicaLote(loteAssinadoXml, modelo);
    }

    String assinarLoteParaContingencia(final NFLoteEnvio lote) throws Exception {
        // adiciona a chave e o dv antes de assinar
        final NFLoteEnvio loteAssinado = assinarLote(lote);

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

        return loteAssinado.toString();
    }

    NFLoteEnvioRetornoDados enviaLote(final NFLoteEnvio lote) throws Exception {
        // adiciona a chave e o dv antes de assinar
        final NFLoteEnvio loteAssinado = assinarLote(lote);

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

        // guarda o modelo das notas
        final DFModelo modelo = qtdNFC > 0 ? DFModelo.NFCE : DFModelo.NFE;

        // comunica o lote
        final NFLoteEnvioRetorno loteEnvioRetorno = this.comunicaLote(loteAssinado.toString(), modelo);
        return new NFLoteEnvioRetornoDados(loteEnvioRetorno, loteAssinado);
    }

    private NFLoteEnvio assinarLote(NFLoteEnvio lote) throws Exception {
        for (final NFNota nota : lote.getNotas()) {
            final NFGeraChave geraChave = new NFGeraChave(nota);
            nota.getInfo().getIdentificacao().setCodigoRandomico(StringUtils.defaultIfBlank(nota.getInfo().getIdentificacao().getCodigoRandomico(), geraChave.geraCodigoRandomico()));
            nota.getInfo().getIdentificacao().setDigitoVerificador(geraChave.getDV());
            nota.getInfo().setIdentificador(geraChave.getChaveAcesso());
        }

        // assina o lote
        final String documentoAssinado = new AssinaturaDigital(this.config).assinarDocumento(lote.toString());
        return new NotaParser().loteParaObjeto(documentoAssinado);
    }

    private NFLoteEnvioRetorno comunicaLote(final String loteAssinadoXml, final DFModelo modelo) throws Exception {
        //valida o lote assinado, para verificar se o xsd foi satisfeito, antes de comunicar com a sefaz
        XMLValidador.validaLote(loteAssinadoXml);

        //envia o lote para a sefaz
        final OMElement omElement = this.nfeToOMElement(loteAssinadoXml);

        final NfeDadosMsg dados = new NfeDadosMsg();
        dados.setExtraElement(omElement);

        final NfeCabecMsgE cabecalhoSOAP = this.getCabecalhoSOAP();
        WSLoteEnvio.LOGGER.debug(omElement.toString());

        //define o tipo de emissao
        final NFAutorizador4 autorizador = NFAutorizador4.valueOfTipoEmissao(this.config.getTipoEmissao(), this.config.getCUF());

        final String endpoint = DFModelo.NFE.equals(modelo) ? autorizador.getNfeAutorizacao(this.config.getAmbiente()) : autorizador.getNfceAutorizacao(this.config.getAmbiente());
        if (endpoint == null) {
            throw new IllegalArgumentException("Nao foi possivel encontrar URL para Autorizacao " + modelo.name() + ", autorizador " + autorizador.name());
        }

        final NfeAutorizacaoLoteResult autorizacaoLoteResult = new NfeAutorizacaoStub(endpoint).nfeAutorizacaoLote(dados, cabecalhoSOAP);
        final NFLoteEnvioRetorno loteEnvioRetorno = new NFPersister().read(NFLoteEnvioRetorno.class, autorizacaoLoteResult.getExtraElement().toString());
        WSLoteEnvio.LOGGER.info(loteEnvioRetorno.toString());
        return loteEnvioRetorno;
    }

    private NfeCabecMsgE getCabecalhoSOAP() {
        final NfeCabecMsg cabecalho = new NfeCabecMsg();
        cabecalho.setCUF(this.config.getCUF().getCodigoIbge());
        cabecalho.setVersaoDados(NFeConfig.VERSAO_NFE);
        final NfeCabecMsgE cabecalhoSOAP = new NfeCabecMsgE();
        cabecalhoSOAP.setNfeCabecMsg(cabecalho);
        return cabecalhoSOAP;
    }

    private OMElement nfeToOMElement(final String documento) throws XMLStreamException {
        final XMLInputFactory factory = XMLInputFactory.newInstance();
        factory.setProperty(XMLInputFactory.IS_COALESCING, false);
        XMLStreamReader reader = factory.createXMLStreamReader(new StringReader(documento));
        StAXOMBuilder builder = new StAXOMBuilder(reader);
        final OMElement ome = builder.getDocumentElement();
        final Iterator<?> children = ome.getChildrenWithLocalName(WSLoteEnvio.NFE_ELEMENTO);
        while (children.hasNext()) {
            final OMElement omElement = (OMElement) children.next();
            if ((omElement != null) && (WSLoteEnvio.NFE_ELEMENTO.equals(omElement.getLocalName()))) {
                omElement.addAttribute("xmlns", NFeConfig.NFE_NAMESPACE, null);
            }
        }
        return ome;
    }
}
