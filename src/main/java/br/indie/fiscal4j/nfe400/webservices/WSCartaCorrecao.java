package br.indie.fiscal4j.nfe400.webservices;

import br.indie.fiscal4j.DFModelo;
import br.indie.fiscal4j.assinatura.AssinaturaDigital;
import br.indie.fiscal4j.nfe.NFeConfig;
import br.indie.fiscal4j.nfe400.classes.NFAutorizador400;
import br.indie.fiscal4j.nfe400.classes.evento.NFEnviaEventoRetorno;
import br.indie.fiscal4j.nfe400.classes.evento.NFEvento;
import br.indie.fiscal4j.nfe400.classes.evento.NFInfoEvento;
import br.indie.fiscal4j.nfe400.classes.evento.NFTipoEvento;
import br.indie.fiscal4j.nfe400.classes.evento.cartacorrecao.NFEnviaEventoCartaCorrecao;
import br.indie.fiscal4j.nfe400.classes.evento.cartacorrecao.NFProtocoloEventoCartaCorrecao;
import br.indie.fiscal4j.nfe400.parsers.DFParser;
import br.indie.fiscal4j.nfe400.parsers.NotaFiscalChaveParser;
import br.indie.fiscal4j.nfe400.webservices.gerado.NFeRecepcaoEvento4Stub;
import br.indie.fiscal4j.nfe400.webservices.gerado.NFeRecepcaoEvento4Stub.NfeResultMsg;
import br.indie.fiscal4j.persister.DFPersister;
import br.indie.fiscal4j.transformers.DFRegistryMatcher;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.Format;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.stream.XMLStreamException;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.time.ZonedDateTime;
import java.util.Collections;

class WSCartaCorrecao {
    private static final BigDecimal VERSAO_LEIAUTE = new BigDecimal("1.00");
    private static final String EVENTO_CODIGO = "110110";
    private static final String EVENTO_DESCRICAO = "Carta de Correcao";
    private static final String EVENTO_CONDICAO_USO = "A Carta de Correcao e disciplinada pelo paragrafo 1o-A do art. 7o do Convenio S/N, de 15 de dezembro de 1970 e pode ser utilizada para regularizacao de erro ocorrido na emissao de documento fiscal, desde que o erro nao esteja relacionado com: I - as variaveis que determinam o valor do imposto tais como: base de calculo, aliquota, diferenca de preco, quantidade, valor da operacao ou da prestacao; II - a correcao de dados cadastrais que implique mudanca do remetente ou do destinatario; III - a data de emissao ou de saida.";
    private final static Logger LOGGER = LoggerFactory.getLogger(WSCartaCorrecao.class);
    private final NFeConfig config;

    WSCartaCorrecao(final NFeConfig config) {
        this.config = config;
    }

    NFEnviaEventoRetorno corrigeNota(final String chaveAcesso, final String textoCorrecao, final int numeroSequencialEvento) throws Exception {
        final String xmlAssinado = getXmlAssinado(chaveAcesso, textoCorrecao, numeroSequencialEvento);
        final OMElement omElementResult = this.efetuaCorrecao(xmlAssinado, chaveAcesso);
        return new Persister(new DFRegistryMatcher(), new Format(0)).read(NFEnviaEventoRetorno.class, omElementResult.toString());
    }

    NFEnviaEventoRetorno corrigeNotaAssinada(final String xmlAssinado) throws Exception {
        final OMElement omElementResult = this.efetuaCorrecao(xmlAssinado, new DFParser()
                .enviaEventoCartaCorrecaoParaObjeto(xmlAssinado).getEvento().get(0).getInfoEvento().getChave());
        return new Persister(new DFRegistryMatcher(), new Format(0)).read(NFEnviaEventoRetorno.class, omElementResult.toString());
    }

    NFProtocoloEventoCartaCorrecao corrigeNotaAssinadaProtocolo(final String xmlAssinado) throws Exception {
        NFEnviaEventoCartaCorrecao evento = new DFParser()
                .enviaEventoCartaCorrecaoParaObjeto(xmlAssinado);
        final OMElement omElementResult = this.efetuaCorrecao(xmlAssinado, evento.getEvento().get(0).getInfoEvento().getChave());
        NFEnviaEventoRetorno retorno = new Persister(new DFRegistryMatcher(), new Format(0)).read(NFEnviaEventoRetorno.class, omElementResult.toString());
        NFProtocoloEventoCartaCorrecao nfProtocoloEventoCartaCorrecao = new NFProtocoloEventoCartaCorrecao();
        nfProtocoloEventoCartaCorrecao.setEvento(evento.getEvento().get(0));
        nfProtocoloEventoCartaCorrecao.setEventoRetorno(retorno.getEventoRetorno().get(0));
        return nfProtocoloEventoCartaCorrecao;
    }

    NFEnviaEventoRetorno corrigeNotaAssinada(final String chaveAcesso, final String eventoAssinadoXml) throws Exception {
        final OMElement omElementResult = this.efetuaCorrecao(eventoAssinadoXml, chaveAcesso);
        return new DFPersister().read(NFEnviaEventoRetorno.class, omElementResult.toString());
    }

    private OMElement efetuaCorrecao(final String xmlAssinado, final String chaveAcesso) throws XMLStreamException, RemoteException {
        final NFeRecepcaoEvento4Stub.NfeDadosMsg dados = new NFeRecepcaoEvento4Stub.NfeDadosMsg();
        final OMElement omElementXML = AXIOMUtil.stringToOM(xmlAssinado);
        WSCartaCorrecao.LOGGER.debug(omElementXML.toString());
        dados.setExtraElement(omElementXML);

        final NotaFiscalChaveParser parser = new NotaFiscalChaveParser(chaveAcesso);

        final NFAutorizador400 autorizacao = NFAutorizador400.valueOfCodigoUF(this.config.getCUF());
        final String urlWebService = DFModelo.NFCE.equals(parser.getModelo()) ? autorizacao.getNfceRecepcaoEvento(this.config.getAmbiente()) : autorizacao.getRecepcaoEvento(this.config.getAmbiente());
        if (urlWebService == null) {
            throw new IllegalArgumentException("Nao foi possivel encontrar URL para RecepcaoEvento " + parser.getModelo().name() + ", autorizador " + autorizacao.name());
        }

        final NfeResultMsg nfeRecepcaoEvento = new NFeRecepcaoEvento4Stub(urlWebService).nfeRecepcaoEvento(dados);
        final OMElement omElementResult = nfeRecepcaoEvento.getExtraElement();
        WSCartaCorrecao.LOGGER.debug(omElementResult.toString());
        return omElementResult;
    }

    /**
     * Retorna XML assinado para uso externo.
     * @param chaveAcesso
     * @param textoCorrecao
     * @param numeroSequencialEvento
     * @return
     * @throws Exception
     */
    public String getXmlAssinado(final String chaveAcesso, final String textoCorrecao, final int numeroSequencialEvento) throws Exception {
        final String cartaCorrecaoXML = this.gerarDadosCartaCorrecao(chaveAcesso, textoCorrecao, numeroSequencialEvento).toString();
        return new AssinaturaDigital(this.config).assinarDocumento(cartaCorrecaoXML);
    }

    public NFEnviaEventoCartaCorrecao gerarDadosCartaCorrecao(final String chaveAcesso, final String textoCorrecao, final int numeroSequencialEvento) {
        final NotaFiscalChaveParser chaveParser = new NotaFiscalChaveParser(chaveAcesso);

        final NFTipoEvento cartaCorrecao = new NFTipoEvento();
        cartaCorrecao.setVersao(WSCartaCorrecao.VERSAO_LEIAUTE);
        cartaCorrecao.setDescricaoEvento(WSCartaCorrecao.EVENTO_DESCRICAO);
        cartaCorrecao.setCondicaoUso(WSCartaCorrecao.EVENTO_CONDICAO_USO);
        cartaCorrecao.setTextoCorrecao(textoCorrecao);

        final NFInfoEvento infoEvento = new NFInfoEvento();
        infoEvento.setAmbiente(this.config.getAmbiente());
        infoEvento.setDadosEvento(cartaCorrecao);
        infoEvento.setChave(chaveAcesso);
        infoEvento.setCnpj(chaveParser.getCnpjEmitente());
        infoEvento.setDataHoraEvento(ZonedDateTime.now(this.config.getTimeZone().toZoneId()));
        infoEvento.setId(String.format("ID%s%s%02d", WSCartaCorrecao.EVENTO_CODIGO, chaveAcesso, numeroSequencialEvento));
        infoEvento.setNumeroSequencialEvento(numeroSequencialEvento);
        infoEvento.setOrgao(chaveParser.getNFUnidadeFederativa());
        infoEvento.setTipoEvento(WSCartaCorrecao.EVENTO_CODIGO);
        infoEvento.setVersaoEvento(WSCartaCorrecao.VERSAO_LEIAUTE);

        final NFEvento evento = new NFEvento();
        evento.setInfoEvento(infoEvento);
        evento.setVersao(WSCartaCorrecao.VERSAO_LEIAUTE);

        final NFEnviaEventoCartaCorrecao enviaEvento = new NFEnviaEventoCartaCorrecao();
        enviaEvento.setEvento(Collections.singletonList(evento));
        enviaEvento.setIdLote(Long.toString(ZonedDateTime.now(this.config.getTimeZone().toZoneId()).toInstant().toEpochMilli()));
        enviaEvento.setVersao(WSCartaCorrecao.VERSAO_LEIAUTE);
        return enviaEvento;
    }
}
