package br.indie.fiscal4j.nfe400.webservices;

import br.indie.fiscal4j.DFLog;
import br.indie.fiscal4j.DFModelo;
import br.indie.fiscal4j.nfe.NFeConfig;
import br.indie.fiscal4j.nfe400.NotaFiscalChaveParser;
import br.indie.fiscal4j.nfe400.classes.NFAutorizador400;
import br.indie.fiscal4j.nfe400.classes.nota.consulta.NFNotaConsulta;
import br.indie.fiscal4j.nfe400.classes.nota.consulta.NFNotaConsultaRetorno;
import br.indie.fiscal4j.nfe400.webservices.gerado.NFeConsultaProtocolo4Stub;
import br.indie.fiscal4j.nfe400.webservices.gerado.NFeConsultaProtocolo4Stub.NfeConsultaNFResult;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import java.math.BigDecimal;

class WSNotaConsulta implements DFLog {
    private static final String NOME_SERVICO = "CONSULTAR";
    private static final String VERSAO_SERVICO = "4.00";
    private final NFeConfig config;

    WSNotaConsulta(final NFeConfig config) {
        this.config = config;
    }

    NFNotaConsultaRetorno consultaNota(final String chaveDeAcesso) throws Exception {
        return this.config.getPersister().read(NFNotaConsultaRetorno.class, consultaNotaAsString(chaveDeAcesso));
    }

    public String consultaNotaAsString(String chaveDeAcesso) throws Exception {
        final OMElement omElementConsulta = AXIOMUtil.stringToOM(this.gerarDadosConsulta(chaveDeAcesso).toString());
        this.getLogger().debug(omElementConsulta.toString());

        final OMElement omElementRetorno = this.efetuaConsulta(omElementConsulta, chaveDeAcesso);
        this.getLogger().debug(omElementRetorno.toString());
        return omElementRetorno.toString();
    }

    private OMElement efetuaConsulta(final OMElement omElementConsulta, final String chaveDeAcesso) throws Exception {
        final NotaFiscalChaveParser notaFiscalChaveParser = new NotaFiscalChaveParser(chaveDeAcesso);

        final NFeConsultaProtocolo4Stub.NfeDadosMsg dados = new NFeConsultaProtocolo4Stub.NfeDadosMsg();
        dados.setExtraElement(omElementConsulta);

        final NFAutorizador400 autorizador = NFAutorizador400.valueOfChaveAcesso(chaveDeAcesso);
        final String endpoint = DFModelo.NFCE.equals(notaFiscalChaveParser.getModelo()) ? autorizador.getNfceConsultaProtocolo(this.config.getAmbiente()) : autorizador.getNfeConsultaProtocolo(this.config.getAmbiente());
        if (endpoint == null) {
            throw new IllegalArgumentException("Nao foi possivel encontrar URL para ConsultaProtocolo " + notaFiscalChaveParser.getModelo().name() + ", autorizador " + autorizador.name());
        }
        final NfeConsultaNFResult consultaNFResult = new NFeConsultaProtocolo4Stub(endpoint, config).nfeConsultaNF(dados);
        return consultaNFResult.getExtraElement();
    }

    private NFNotaConsulta gerarDadosConsulta(final String chaveDeAcesso) {
        final NFNotaConsulta notaConsulta = new NFNotaConsulta();
        notaConsulta.setAmbiente(this.config.getAmbiente());
        notaConsulta.setChave(chaveDeAcesso);
        notaConsulta.setServico(WSNotaConsulta.NOME_SERVICO);
        notaConsulta.setVersao(new BigDecimal(WSNotaConsulta.VERSAO_SERVICO));
        return notaConsulta;
    }
}