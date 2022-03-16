package br.indie.fiscal4j.mdfe3.webservices;

import br.indie.fiscal4j.DFLog;
import br.indie.fiscal4j.mdfe3.MDFeConfig;
import br.indie.fiscal4j.mdfe3.classes.MDFAutorizador3;
import br.indie.fiscal4j.mdfe3.classes.nota.evento.MDFeDetalhamentoEvento;
import br.indie.fiscal4j.mdfe3.classes.nota.evento.MDFeEvento;
import br.indie.fiscal4j.mdfe3.classes.nota.evento.MDFeInfoEvento;
import br.indie.fiscal4j.mdfe3.classes.nota.evento.MDFeRetorno;
import br.indie.fiscal4j.mdfe3.classes.nota.evento.cancelamento.MDFeEnviaEventoCancelamento;
import br.indie.fiscal4j.mdfe3.classes.parsers.MDFChaveParser;
import br.indie.fiscal4j.mdfe3.webservices.recepcaoevento.MDFeRecepcaoEventoStub;
import br.indie.fiscal4j.utils.DFAssinaturaDigital;
import br.indie.fiscal4j.validadores.DFBigDecimalValidador;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

/**
 * Created by Eldevan Nery Junior on 17/11/17.
 */
class WSCancelamento implements DFLog {

    private static final String DESCRICAO_EVENTO = "Cancelamento";
    private static final BigDecimal VERSAO_LEIAUTE = new BigDecimal("3.00");
    private static final String EVENTO_CANCELAMENTO = "110111";
    private final MDFeConfig config;

    WSCancelamento(final MDFeConfig config) {
        this.config = config;
    }

    MDFeRetorno cancelaNotaAssinada(final String chaveAcesso, final String eventoAssinadoXml) throws Exception {
        final OMElement omElementResult = this.efetuaCancelamento(eventoAssinadoXml, chaveAcesso);
        return this.config.getPersister().read(MDFeRetorno.class, omElementResult.toString());
    }

    MDFeRetorno cancelaNota(final String chaveAcesso, final String numeroProtocolo, final String motivo) throws Exception {
        final String cancelamentoNotaXML = this.gerarDadosCancelamento(chaveAcesso, numeroProtocolo, motivo).toString();
        final String xmlAssinado = new DFAssinaturaDigital(this.config).assinarDocumento(cancelamentoNotaXML);
        final OMElement omElementResult = this.efetuaCancelamento(xmlAssinado, chaveAcesso);
        return this.config.getPersister().read(MDFeRetorno.class, omElementResult.toString());
    }

    private OMElement efetuaCancelamento(final String xmlAssinado, final String chaveAcesso) throws Exception {
        final MDFChaveParser mdfChaveParser = new MDFChaveParser(chaveAcesso);
        final MDFeRecepcaoEventoStub.MdfeCabecMsg cabec = new MDFeRecepcaoEventoStub.MdfeCabecMsg();
        cabec.setCUF(mdfChaveParser.getNFUnidadeFederativa().getCodigoIbge());
        cabec.setVersaoDados(DFBigDecimalValidador.tamanho5Com2CasasDecimais(VERSAO_LEIAUTE, "Versao do Evento"));

        final MDFeRecepcaoEventoStub.MdfeCabecMsgE cabecE = new MDFeRecepcaoEventoStub.MdfeCabecMsgE();
        cabecE.setMdfeCabecMsg(cabec);

        final MDFeRecepcaoEventoStub.MdfeDadosMsg dados = new MDFeRecepcaoEventoStub.MdfeDadosMsg();
        final OMElement omElementXML = AXIOMUtil.stringToOM(xmlAssinado);
        this.getLogger().debug(omElementXML.toString());
        dados.setExtraElement(omElementXML);

        final MDFAutorizador3 autorizador = MDFAutorizador3.valueOfCodigoUF(mdfChaveParser.getNFUnidadeFederativa());
        final String urlWebService = autorizador.getMDFeRecepcaoEvento(this.config.getAmbiente());
        if (urlWebService == null) {
            throw new IllegalArgumentException("Nao foi possivel encontrar URL para RecepcaoEvento " + mdfChaveParser.getModelo().name() + ", autorizador " + autorizador.name());
        }
        MDFeRecepcaoEventoStub.MdfeRecepcaoEventoResult mdfeRecepcaoEventoResult = new MDFeRecepcaoEventoStub(urlWebService, config).mdfeRecepcaoEvento(dados, cabecE);
        final OMElement omElementResult = mdfeRecepcaoEventoResult.getExtraElement();
        this.getLogger().debug(omElementResult.toString());
        return omElementResult;
    }

    private MDFeEvento gerarDadosCancelamento(final String chaveAcesso, final String numeroProtocolo, final String motivo) {
        final MDFChaveParser chaveParser = new MDFChaveParser(chaveAcesso);

        final MDFeEnviaEventoCancelamento cancelamento = new MDFeEnviaEventoCancelamento();
        cancelamento.setDescricaoEvento(WSCancelamento.DESCRICAO_EVENTO);
        cancelamento.setJustificativa(motivo.trim());
        cancelamento.setProtocoloAutorizacao(numeroProtocolo);

        MDFeDetalhamentoEvento mdFeDetalhamentoEvento = new MDFeDetalhamentoEvento();
        mdFeDetalhamentoEvento.setMdFeEnviaEventoCancelamento(cancelamento);
        mdFeDetalhamentoEvento.setVersaoEvento(WSCancelamento.VERSAO_LEIAUTE);

        final MDFeInfoEvento infoEvento = new MDFeInfoEvento();
        infoEvento.setAmbiente(this.config.getAmbiente());
        infoEvento.setChave(chaveAcesso);
        infoEvento.setCnpj(chaveParser.getCnpjEmitente());
        infoEvento.setDataHoraEvento(ZonedDateTime.now(this.config.getTimeZone().toZoneId()));
        infoEvento.setId(String.format("ID%s%s0%s", WSCancelamento.EVENTO_CANCELAMENTO, chaveAcesso, "1"));
        infoEvento.setNumeroSequencialEvento(1);
        infoEvento.setOrgao(chaveParser.getNFUnidadeFederativa().getCodigoIbge());
        infoEvento.setCodigoEvento(WSCancelamento.EVENTO_CANCELAMENTO);
        infoEvento.setDetEvento(mdFeDetalhamentoEvento);

        MDFeEvento mdfeEventoCancelamento = new MDFeEvento();
        mdfeEventoCancelamento.setInfoEvento(infoEvento);
        mdfeEventoCancelamento.setVersao(WSCancelamento.VERSAO_LEIAUTE);

        return mdfeEventoCancelamento;
    }
}
