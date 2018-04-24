package br.indie.fiscal4j.nfe400.webservices;

import br.indie.fiscal4j.DFUnidadeFederativa;
import br.indie.fiscal4j.assinatura.AssinaturaDigital;
import br.indie.fiscal4j.nfe.NFeConfig;
import br.indie.fiscal4j.nfe400.classes.NFAutorizador400;
import br.indie.fiscal4j.nfe400.classes.evento.NFEnviaEventoRetorno;
import br.indie.fiscal4j.nfe400.classes.evento.manifestacaodestinatario.*;
import br.indie.fiscal4j.nfe400.parsers.NotaFiscalChaveParser;
import br.indie.fiscal4j.nfe400.webservices.gerado.NFeRecepcaoEvento4Stub;
import br.indie.fiscal4j.nfe400.webservices.gerado.NFeRecepcaoEvento4Stub.NfeResultMsg;
import br.indie.fiscal4j.persister.DFPersister;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.Collections;

public class WSManifestacaoDestinatario {

    private static final BigDecimal VERSAO_LEIAUTE = new BigDecimal("1.00");
    private static final Logger LOGGER = LoggerFactory.getLogger(WSManifestacaoDestinatario.class);
    private final NFeConfig config;

    public WSManifestacaoDestinatario(final NFeConfig config) {
        this.config = config;
    }

    NFEnviaEventoRetorno manifestaDestinatarioNotaAssinada(final String chaveAcesso, final String eventoAssinadoXml) throws Exception {
        final OMElement omElementResult = this.efetuaManifestacaoDestinatario(eventoAssinadoXml, chaveAcesso);
        return new DFPersister().read(NFEnviaEventoRetorno.class, omElementResult.toString());
    }

    NFEnviaEventoRetorno manifestaDestinatarioNota(final String chaveAcesso, final NFTipoEventoManifestacaoDestinatario tipoEvento, final String motivo, final String cnpj) throws Exception {
        final String manifestacaoDestinatarioNotaXML = this.gerarDadosManifestacaoDestinatario(chaveAcesso, tipoEvento, motivo, cnpj).toString();
        final String xmlAssinado = new AssinaturaDigital(this.config).assinarDocumento(manifestacaoDestinatarioNotaXML);
        final OMElement omElementResult = this.efetuaManifestacaoDestinatario(xmlAssinado, chaveAcesso);
        return new DFPersister().read(NFEnviaEventoRetorno.class, omElementResult.toString());
    }

    private OMElement efetuaManifestacaoDestinatario(final String xmlAssinado, final String chaveAcesso) throws Exception {
        final NFeRecepcaoEvento4Stub.NfeDadosMsg dados = new NFeRecepcaoEvento4Stub.NfeDadosMsg();
        final OMElement omElementXML = AXIOMUtil.stringToOM(xmlAssinado);
        WSManifestacaoDestinatario.LOGGER.debug(omElementXML.toString());
        dados.setExtraElement(omElementXML);

        final NotaFiscalChaveParser parser = new NotaFiscalChaveParser(chaveAcesso);
        final NFAutorizador400 autorizador = NFAutorizador400.valueOfChaveAcesso(chaveAcesso);
        final String urlWebService = autorizador.getRecepcaoEventoAN(this.config.getAmbiente());
        if (urlWebService == null) {
            throw new IllegalArgumentException("Nao foi possivel encontrar URL para RecepcaoEvento " + parser.getModelo().name() + ", autorizador " + autorizador.name());
        }

        final NfeResultMsg nfeRecepcaoEvento = new NFeRecepcaoEvento4Stub(urlWebService).nfeRecepcaoEvento(dados);
        final OMElement omElementResult = nfeRecepcaoEvento.getExtraElement();
        WSManifestacaoDestinatario.LOGGER.debug(omElementResult.toString());
        return omElementResult;
    }

    private NFEnviaEventoManifestacaoDestinatario gerarDadosManifestacaoDestinatario(final String chaveAcesso, final NFTipoEventoManifestacaoDestinatario tipoEvento, final String motivo, final String cnpj) {
        // final NotaFiscalChaveParser chaveParser = new NotaFiscalChaveParser(chaveAcesso);

        final NFInfoManifestacaoDestinatario manifestacaoDestinatario = new NFInfoManifestacaoDestinatario();
        manifestacaoDestinatario.setDescricaoEvento(tipoEvento.getDescricao());
        manifestacaoDestinatario.setVersao(WSManifestacaoDestinatario.VERSAO_LEIAUTE);
        manifestacaoDestinatario.setJustificativa(motivo);

        final NFInfoEventoManifestacaoDestinatario infoEvento = new NFInfoEventoManifestacaoDestinatario();
        infoEvento.setAmbiente(this.config.getAmbiente());
        infoEvento.setChave(chaveAcesso);
        infoEvento.setCnpj(cnpj);
        infoEvento.setDataHoraEvento(DateTime.now());
        infoEvento.setId(String.format("ID%s%s0%s", tipoEvento.getCodigo(), chaveAcesso, "1"));
        infoEvento.setNumeroSequencialEvento(1);
        infoEvento.setOrgao(DFUnidadeFederativa.RFB);
        infoEvento.setCodigoEvento(tipoEvento.getCodigo());
        infoEvento.setVersaoEvento(WSManifestacaoDestinatario.VERSAO_LEIAUTE);
        infoEvento.setManifestacaoDestinatario(manifestacaoDestinatario);

        final NFEventoManifestacaoDestinatario evento = new NFEventoManifestacaoDestinatario();
        evento.setInfoEvento(infoEvento);
        evento.setVersao(WSManifestacaoDestinatario.VERSAO_LEIAUTE);

        final NFEnviaEventoManifestacaoDestinatario enviaEvento = new NFEnviaEventoManifestacaoDestinatario();
        enviaEvento.setEvento(Collections.singletonList(evento));
        enviaEvento.setIdLote(Long.toString(DateTime.now().getMillis()));
        enviaEvento.setVersao(WSManifestacaoDestinatario.VERSAO_LEIAUTE);
        return enviaEvento;
    }

}