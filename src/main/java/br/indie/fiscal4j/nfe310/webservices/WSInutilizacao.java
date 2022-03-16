package br.indie.fiscal4j.nfe310.webservices;

import br.indie.fiscal4j.DFLog;
import br.indie.fiscal4j.DFModelo;
import br.indie.fiscal4j.nfe.NFeConfig;
import br.indie.fiscal4j.nfe310.classes.NFAutorizador31;
import br.indie.fiscal4j.nfe310.classes.evento.inutilizacao.NFEnviaEventoInutilizacao;
import br.indie.fiscal4j.nfe310.classes.evento.inutilizacao.NFEventoInutilizacaoDados;
import br.indie.fiscal4j.nfe310.classes.evento.inutilizacao.NFRetornoEventoInutilizacao;
import br.indie.fiscal4j.nfe310.webservices.gerado.NfeInutilizacao2Stub;
import br.indie.fiscal4j.nfe310.webservices.gerado.NfeInutilizacao2Stub.NfeCabecMsg;
import br.indie.fiscal4j.nfe310.webservices.gerado.NfeInutilizacao2Stub.NfeCabecMsgE;
import br.indie.fiscal4j.nfe310.webservices.gerado.NfeInutilizacao2Stub.NfeDadosMsg;
import br.indie.fiscal4j.nfe310.webservices.gerado.NfeInutilizacao2Stub.NfeInutilizacaoNF2Result;
import br.indie.fiscal4j.utils.DFAssinaturaDigital;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;

class WSInutilizacao implements DFLog {

    private static final String VERSAO_SERVICO = "3.10";
    private static final String NOME_SERVICO = "INUTILIZAR";
    private final NFeConfig config;

    WSInutilizacao(final NFeConfig config) {
        this.config = config;
    }

    NFRetornoEventoInutilizacao inutilizaNotaAssinada(final String eventoAssinadoXml, final DFModelo modelo) throws Exception {
        final OMElement omElementResult = this.efetuaInutilizacao(eventoAssinadoXml, modelo);
        return this.config.getPersister().read(NFRetornoEventoInutilizacao.class, omElementResult.toString());
    }

    NFRetornoEventoInutilizacao inutilizaNota(final int anoInutilizacaoNumeracao, final String cnpjEmitente, final String serie, final String numeroInicial, final String numeroFinal, final String justificativa, final DFModelo modelo) throws Exception {
        final String inutilizacaoXML = this.geraDadosInutilizacao(anoInutilizacaoNumeracao, cnpjEmitente, serie, numeroInicial, numeroFinal, justificativa, modelo).toString();
        final String inutilizacaoXMLAssinado = new DFAssinaturaDigital(this.config).assinarDocumento(inutilizacaoXML);
        final OMElement omElementResult = this.efetuaInutilizacao(inutilizacaoXMLAssinado, modelo);
        return this.config.getPersister().read(NFRetornoEventoInutilizacao.class, omElementResult.toString());
    }

    private OMElement efetuaInutilizacao(final String inutilizacaoXMLAssinado, final DFModelo modelo) throws Exception {
        final NfeInutilizacao2Stub.NfeCabecMsg cabecalho = new NfeCabecMsg();
        cabecalho.setCUF(this.config.getCUF().getCodigoIbge());
        cabecalho.setVersaoDados(WSInutilizacao.VERSAO_SERVICO);

        final NfeInutilizacao2Stub.NfeCabecMsgE cabecalhoE = new NfeCabecMsgE();
        cabecalhoE.setNfeCabecMsg(cabecalho);

        final NfeInutilizacao2Stub.NfeDadosMsg dados = new NfeDadosMsg();
        final OMElement omElement = AXIOMUtil.stringToOM(inutilizacaoXMLAssinado);
        this.getLogger().debug(omElement.toString());
        dados.setExtraElement(omElement);

        final NFAutorizador31 autorizador = NFAutorizador31.valueOfCodigoUF(this.config.getCUF());
        final String urlWebService = DFModelo.NFE.equals(modelo) ? autorizador.getNfeInutilizacao(this.config.getAmbiente()) : autorizador.getNfceInutilizacao(this.config.getAmbiente());
        final NfeInutilizacaoNF2Result nf2Result = new NfeInutilizacao2Stub(urlWebService, config).nfeInutilizacaoNF2(dados, cabecalhoE);
        final OMElement dadosRetorno = nf2Result.getExtraElement();
        this.getLogger().debug(dadosRetorno.toString());
        return dadosRetorno;
    }

    private NFEnviaEventoInutilizacao geraDadosInutilizacao(final int anoInutilizacaoNumeracao, final String cnpjEmitente, final String serie, final String numeroInicial, final String numeroFinal, final String justificativa, final DFModelo modelo) {
        final NFEnviaEventoInutilizacao inutilizacao = new NFEnviaEventoInutilizacao();
        final NFEventoInutilizacaoDados dados = new NFEventoInutilizacaoDados();
        dados.setAmbiente(this.config.getAmbiente());
        dados.setAno(anoInutilizacaoNumeracao);
        dados.setCnpj(cnpjEmitente);
        dados.setJustificativa(justificativa);
        dados.setModeloDocumentoFiscal(modelo.getCodigo());
        dados.setNomeServico(WSInutilizacao.NOME_SERVICO);
        dados.setNumeroNFInicial(numeroInicial);
        dados.setNumeroNFFinal(numeroFinal);
        dados.setSerie(serie);
        dados.setUf(this.config.getCUF());
        final String numeroInicialTamanhoMaximo = StringUtils.leftPad(numeroInicial, 9, "0");
        final String numeroFinalTamanhoMaximo = StringUtils.leftPad(numeroFinal, 9, "0");
        final String serieTamanhoMaximo = StringUtils.leftPad(serie, 3, "0");
        dados.setIdentificador("ID" + this.config.getCUF().getCodigoIbge() + anoInutilizacaoNumeracao + cnpjEmitente + modelo.getCodigo() + serieTamanhoMaximo + numeroInicialTamanhoMaximo + numeroFinalTamanhoMaximo);

        inutilizacao.setVersao(new BigDecimal(WSInutilizacao.VERSAO_SERVICO));
        inutilizacao.setDados(dados);
        return inutilizacao;
    }
}
