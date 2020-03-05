package br.indie.fiscal4j.mdfe3.webservices;

import br.indie.fiscal4j.DFLog;
import br.indie.fiscal4j.DFUnidadeFederativa;
import br.indie.fiscal4j.mdfe3.MDFeConfig;
import br.indie.fiscal4j.mdfe3.classes.MDFAutorizador3;
import br.indie.fiscal4j.mdfe3.classes.nota.evento.*;
import br.indie.fiscal4j.mdfe3.classes.parsers.MDFChaveParser;
import br.indie.fiscal4j.mdfe3.webservices.recepcaoevento.MDFeRecepcaoEventoStub;
import br.indie.fiscal4j.utils.DFAssinaturaDigital;
import br.indie.fiscal4j.validadores.BigDecimalValidador;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZonedDateTime;

import static br.indie.fiscal4j.validadores.CNPJValidador.isValidCNPJ;

/**
 * Created by Eldevan Nery Junior on 17/11/17.
 */
class WSEncerramento implements DFLog {

    private static final String DESCRICAO_EVENTO = "Encerramento";
    private static final BigDecimal VERSAO_LEIAUTE = new BigDecimal("3.00");
    private static final String EVENTO_ENCERRAMENTO = "110112";
    private final MDFeConfig config;

    WSEncerramento(final MDFeConfig config) {
        this.config = config;
    }

    MDFeRetorno encerramentoMdfeAssinado(final String chaveAcesso, final String eventoAssinadoXml) throws Exception {
        final OMElement omElementResult = this.efetuaEncerramento(eventoAssinadoXml, chaveAcesso);
        return this.config.getPersister().read(MDFeRetorno.class, omElementResult.toString());
    }

    MDFeRetorno encerraMdfe(final String chaveAcesso, final String numeroProtocolo, final String codigoMunicipio, final LocalDate dataEncerramento, final DFUnidadeFederativa unidadeFederativa) throws Exception {
        final String encerramentoNotaXML = this.gerarDadosEncerramento(chaveAcesso, numeroProtocolo, codigoMunicipio, dataEncerramento, unidadeFederativa).toString();
        final String xmlAssinado = new DFAssinaturaDigital(this.config).assinarDocumento(encerramentoNotaXML);
        final OMElement omElementResult = this.efetuaEncerramento(xmlAssinado, chaveAcesso);
        return this.config.getPersister().read(MDFeRetorno.class, omElementResult.toString());
    }

    private OMElement efetuaEncerramento(final String xmlAssinado, final String chaveAcesso) throws Exception {
        final MDFChaveParser mdfChaveParser = new MDFChaveParser(chaveAcesso);
        final MDFeRecepcaoEventoStub.MdfeCabecMsg cabec = new MDFeRecepcaoEventoStub.MdfeCabecMsg();
        cabec.setCUF(mdfChaveParser.getNFUnidadeFederativa().getCodigoIbge());
        cabec.setVersaoDados(BigDecimalValidador.tamanho5Com2CasasDecimais(WSEncerramento.VERSAO_LEIAUTE, "Versao do Evento"));

        final MDFeRecepcaoEventoStub.MdfeCabecMsgE cabecE = new MDFeRecepcaoEventoStub.MdfeCabecMsgE();
        cabecE.setMdfeCabecMsg(cabec);

        final MDFeRecepcaoEventoStub.MdfeDadosMsg dados = new MDFeRecepcaoEventoStub.MdfeDadosMsg();
        final OMElement omElementXML = AXIOMUtil.stringToOM(xmlAssinado);
        this.getLogger().debug(omElementXML.toString());
        dados.setExtraElement(omElementXML);

        //WSEncerramento.LOGGER.debug(cabec.toString());
        final MDFAutorizador3 autorizador = MDFAutorizador3.valueOfCodigoUF(mdfChaveParser.getNFUnidadeFederativa());
        final String urlWebService = autorizador.getMDFeRecepcaoEvento(this.config.getAmbiente());
        if (urlWebService == null) {
            throw new IllegalArgumentException("Nao foi possivel encontrar URL para RecepcaoEvento " + mdfChaveParser.getModelo().name() + ", autorizador " + autorizador.name());
        }
        final MDFeRecepcaoEventoStub.MdfeRecepcaoEventoResult mdfeRecepcaoEventoResult = new MDFeRecepcaoEventoStub(urlWebService).mdfeRecepcaoEvento(dados, cabecE);
        final OMElement omElementResult = mdfeRecepcaoEventoResult.getExtraElement();
        this.getLogger().debug(omElementResult.toString());
        return omElementResult;
    }

    private MDFeEvento gerarDadosEncerramento(final String chaveAcesso, final String numeroProtocolo, final String codigoMunicipio, final LocalDate dataEncerramento, final DFUnidadeFederativa unidadeFederativa) {
        final MDFChaveParser chaveParser = new MDFChaveParser(chaveAcesso);

        final MDFeEnviaEventoEncerramento encerramento = new MDFeEnviaEventoEncerramento();
        encerramento.setDescricaoEvento(WSEncerramento.DESCRICAO_EVENTO);
        encerramento.setCodigoMunicipio(codigoMunicipio);
        encerramento.setDataEncerramento(dataEncerramento);
        encerramento.setUf(unidadeFederativa);
        encerramento.setProtocoloAutorizacao(numeroProtocolo);

        final MDFeDetalhamentoEvento mdFeDetalhamentoEvento = new MDFeDetalhamentoEvento();
        mdFeDetalhamentoEvento.setEnviaEventoEncerramento(encerramento);
        mdFeDetalhamentoEvento.setVersaoEvento(WSEncerramento.VERSAO_LEIAUTE);

        final MDFeInfoEvento infoEvento = new MDFeInfoEvento();
        infoEvento.setAmbiente(this.config.getAmbiente());
        infoEvento.setChave(chaveAcesso);
        if (isValidCNPJ(chaveParser.getCnpjEmitente())) {
            infoEvento.setCnpj(chaveParser.getCnpjEmitente());
        } else {
            infoEvento.setCpf(chaveParser.getCpfEmitente());
        }
        infoEvento.setDataHoraEvento(ZonedDateTime.now(this.config.getTimeZone().toZoneId()));
        infoEvento.setId(String.format("ID%s%s0%s", WSEncerramento.EVENTO_ENCERRAMENTO, chaveAcesso, "1"));
        infoEvento.setNumeroSequencialEvento(1);
        infoEvento.setOrgao(chaveParser.getNFUnidadeFederativa().getCodigoIbge());
        infoEvento.setCodigoEvento(WSEncerramento.EVENTO_ENCERRAMENTO);
        infoEvento.setDetEvento(mdFeDetalhamentoEvento);

        final MDFeEvento mdfeEventoEncerramento = new MDFeEvento();
        mdfeEventoEncerramento.setInfoEvento(infoEvento);
        mdfeEventoEncerramento.setVersao(WSEncerramento.VERSAO_LEIAUTE);
        return mdfeEventoEncerramento;
    }
}
