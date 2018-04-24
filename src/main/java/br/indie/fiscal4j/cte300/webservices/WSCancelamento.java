package br.indie.fiscal4j.cte300.webservices;

import br.indie.fiscal4j.assinatura.AssinaturaDigital;
import br.indie.fiscal4j.cte300.CTeConfig;
import br.indie.fiscal4j.cte300.classes.CTAutorizador31;
import br.indie.fiscal4j.cte300.classes.evento.cancelamento.*;
import br.indie.fiscal4j.cte300.parsers.CTChaveParser;
import br.indie.fiscal4j.cte300.webservices.recepcaoevento.RecepcaoEventoStub;
import br.indie.fiscal4j.persister.DFPersister;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

class WSCancelamento {
    private static final String DESCRICAO_EVENTO = "Cancelamento";
    private static final BigDecimal VERSAO_LEIAUTE = new BigDecimal("3.00");
    private static final String EVENTO_CANCELAMENTO = "110111";
    private static final Logger LOGGER = LoggerFactory.getLogger(WSCancelamento.class);
    private final CTeConfig config;

    WSCancelamento(final CTeConfig config) {
        this.config = config;
    }

    CTeRetornoCancelamento cancelaNotaAssinada(final String chaveAcesso, final String eventoAssinadoXml) throws Exception {
        final OMElement omElementResult = this.efetuaCancelamento(eventoAssinadoXml, chaveAcesso);
        return new DFPersister().read(CTeRetornoCancelamento.class, omElementResult.toString());
    }

    CTeRetornoCancelamento cancelaNota(final String chaveAcesso, final String numeroProtocolo, final String motivo) throws Exception {
        final String cancelamentoNotaXML = this.gerarDadosCancelamento(chaveAcesso, numeroProtocolo, motivo).toString();
        final String xmlAssinado = new AssinaturaDigital(this.config).assinarDocumento(cancelamentoNotaXML);
        final OMElement omElementResult = this.efetuaCancelamento(xmlAssinado, chaveAcesso);
        return new DFPersister().read(CTeRetornoCancelamento.class, omElementResult.toString());
    }

    private OMElement efetuaCancelamento(final String xmlAssinado, final String chaveAcesso) throws Exception {
        final CTChaveParser ctChaveParser = new CTChaveParser(chaveAcesso);
        final RecepcaoEventoStub.CteCabecMsg cabec = new RecepcaoEventoStub.CteCabecMsg();
        cabec.setCUF(ctChaveParser.getNFUnidadeFederativa().getCodigoIbge());
        cabec.setVersaoDados(BigDecimalParser.tamanho5Com2CasasDecimais(VERSAO_LEIAUTE, "Versao do Evento"));

        final RecepcaoEventoStub.CteCabecMsgE cabecE = new RecepcaoEventoStub.CteCabecMsgE();
        cabecE.setCteCabecMsg(cabec);

        final RecepcaoEventoStub.CteDadosMsg dados = new RecepcaoEventoStub.CteDadosMsg();
        final OMElement omElementXML = AXIOMUtil.stringToOM(xmlAssinado);
        WSCancelamento.LOGGER.debug(omElementXML.toString());
        dados.setExtraElement(omElementXML);

        WSCancelamento.LOGGER.info(cabec.toString());

        final CTAutorizador31 autorizador = CTAutorizador31.valueOfChaveAcesso(chaveAcesso);
        final String urlWebService = autorizador.getRecepcaoEvento(this.config.getAmbiente());
        if (urlWebService == null) {
            throw new IllegalArgumentException("Nao foi possivel encontrar URL para RecepcaoEvento "
                    + ctChaveParser.getModelo().name() + ", autorizador " + autorizador.name());
        }

        RecepcaoEventoStub.CteRecepcaoEventoResult cteRecepcaoEventoResult = new RecepcaoEventoStub(urlWebService).cteRecepcaoEvento(dados, cabecE);
        final OMElement omElementResult = cteRecepcaoEventoResult.getExtraElement();
        WSCancelamento.LOGGER.debug(omElementResult.toString());
        return omElementResult;
    }

    private CTeProtocoloEventoCancelamento gerarDadosCancelamento(final String chaveAcesso, final String numeroProtocolo, final String motivo) {
        final CTChaveParser chaveParser = new CTChaveParser(chaveAcesso);
        final CTeEnviaEventoCancelamento cancelamento = new CTeEnviaEventoCancelamento();
        cancelamento.setDescricaoEvento(WSCancelamento.DESCRICAO_EVENTO);
        cancelamento.setJustificativa(motivo);
        cancelamento.setProtocoloAutorizacao(numeroProtocolo);
        CTeDetalhamentoEventoCancelamento cTeDetalhamentoEventoCancelamento = new CTeDetalhamentoEventoCancelamento();
        cTeDetalhamentoEventoCancelamento.setVersaoEvento(WSCancelamento.VERSAO_LEIAUTE);
        cTeDetalhamentoEventoCancelamento.setEventoCancelamento(cancelamento);
//        cancelamento.setVersaoEvento(WSCancelamento.VERSAO_LEIAUTE);
        final CTeInfoEventoCancelamento infoEvento = new CTeInfoEventoCancelamento();
        infoEvento.setAmbiente(this.config.getAmbiente());
        infoEvento.setChave(chaveAcesso);
        infoEvento.setCnpj(chaveParser.getCnpjEmitente());
        infoEvento.setDataHoraEvento(DateTime.now());
        infoEvento.setId(String.format("ID%s%s0%s", WSCancelamento.EVENTO_CANCELAMENTO, chaveAcesso, "1"));
        infoEvento.setNumeroSequencialEvento(1);
        infoEvento.setOrgao(chaveParser.getNFUnidadeFederativa());
        infoEvento.setCodigoEvento(WSCancelamento.EVENTO_CANCELAMENTO);
//        infoEvento.setVersaoEvento(WSCancelamento.VERSAO_LEIAUTE);
        infoEvento.setCancelamento(cTeDetalhamentoEventoCancelamento);

        CTeEventoCancelamento cTeEventoCancelamento = new CTeEventoCancelamento();
        cTeEventoCancelamento.setInfoEvento(infoEvento);
        cTeEventoCancelamento.setVersao(WSCancelamento.VERSAO_LEIAUTE);

        CTeProtocoloEventoCancelamento cTeProtocoloEventoCancelamento = new CTeProtocoloEventoCancelamento();
        cTeProtocoloEventoCancelamento.setVersao(WSCancelamento.VERSAO_LEIAUTE);
        cTeProtocoloEventoCancelamento.setEvento(cTeEventoCancelamento);
//        cTeProtocoloEventoCancelamento.setEventoRetorno();

        return cTeProtocoloEventoCancelamento;
    }
}
