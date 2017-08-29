package br.indie.fiscal4j.webservices;

import br.indie.fiscal4j.NFeConfig;
import br.indie.fiscal4j.classes.NFAutorizador31;
import br.indie.fiscal4j.classes.NFModelo;
import br.indie.fiscal4j.classes.NFUnidadeFederativa;
import br.indie.fiscal4j.classes.nota.consulta.NFNotaConsulta;
import br.indie.fiscal4j.classes.nota.consulta.NFNotaConsultaRetorno;
import br.indie.fiscal4j.parsers.NotaFiscalChaveParser;
import br.indie.fiscal4j.transformers.NFRegistryMatcher;
import br.indie.fiscal4j.webservices.gerado.NfeConsulta2Stub;
import br.indie.fiscal4j.webservices.gerado.NfeConsulta2Stub.NfeConsultaNF2Result;
import br.indie.fiscal4j.webservices.nota.consulta.NfeConsultaStub;
import br.indie.fiscal4j.webservices.nota.consulta.NfeConsultaStub.NfeConsultaNFResult;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.Format;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.rmi.RemoteException;

class WSNotaConsulta {
    private static final String NOME_SERVICO = "CONSULTAR";
    private static final String VERSAO_SERVICO = "3.10";
    private final static Logger LOGGER = LoggerFactory.getLogger(WSNotaConsulta.class);
    private final NFeConfig config;

    WSNotaConsulta(final NFeConfig config) {
        this.config = config;
    }

    NFNotaConsultaRetorno consultaNota(final String chaveDeAcesso) throws Exception {
        final OMElement omElementConsulta = AXIOMUtil.stringToOM(this.gerarDadosConsulta(chaveDeAcesso).toString());
        WSNotaConsulta.LOGGER.debug(omElementConsulta.toString());

        final OMElement omElementRetorno = this.efetuaConsulta(omElementConsulta, chaveDeAcesso);
        WSNotaConsulta.LOGGER.debug(omElementRetorno.toString());
        return new Persister(new NFRegistryMatcher(), new Format(0)).read(NFNotaConsultaRetorno.class, omElementRetorno.toString());
    }

    private OMElement efetuaConsulta(final OMElement omElementConsulta, final String chaveDeAcesso) throws Exception {
        final NotaFiscalChaveParser notaFiscalChaveParser = new NotaFiscalChaveParser(chaveDeAcesso);

        boolean consultaNFeBahia = NFUnidadeFederativa.BA.equals(notaFiscalChaveParser.getNFUnidadeFederativa()) && NFModelo.NFE.equals(notaFiscalChaveParser.getModelo());
        if (consultaNFeBahia) {
            return efetuaConsultaBA(omElementConsulta, chaveDeAcesso);
        } else {
            return efetuaConsultaSVRS(omElementConsulta, chaveDeAcesso);
        }

    }

    private OMElement efetuaConsultaSVRS(final OMElement omElementConsulta, final String chaveDeAcesso) throws RemoteException {
        final NotaFiscalChaveParser notaFiscalChaveParser = new NotaFiscalChaveParser(chaveDeAcesso);
        final NfeConsulta2Stub.NfeCabecMsg cabec = new NfeConsulta2Stub.NfeCabecMsg();
        cabec.setCUF(notaFiscalChaveParser.getNFUnidadeFederativa().getCodigoIbge());
        cabec.setVersaoDados(WSNotaConsulta.VERSAO_SERVICO);

        final NfeConsulta2Stub.NfeCabecMsgE cabecE = new NfeConsulta2Stub.NfeCabecMsgE();
        cabecE.setNfeCabecMsg(cabec);

        final NfeConsulta2Stub.NfeDadosMsg dados = new NfeConsulta2Stub.NfeDadosMsg();
        dados.setExtraElement(omElementConsulta);


        NFAutorizador31 autorizador = NFAutorizador31.valueOfChaveAcesso(chaveDeAcesso);
        final String endpoint = NFModelo.NFCE.equals(notaFiscalChaveParser.getModelo()) ? autorizador.getNfceConsultaProtocolo(config.getAmbiente()) : autorizador.getNfeConsultaProtocolo(config.getAmbiente());
        if (endpoint == null) {
            throw new IllegalArgumentException("Nao foi possivel encontrar URL para ConsultaProtocolo " + notaFiscalChaveParser.getModelo().name() + ", autorizador " + autorizador.name());
        }

        final NfeConsultaNF2Result consultaNF2Result = new NfeConsulta2Stub(endpoint).nfeConsultaNF2(dados, cabecE);
        return consultaNF2Result.getExtraElement();
    }

    private OMElement efetuaConsultaBA(final OMElement omElementConsulta, final String chaveDeAcesso) throws RemoteException {
        final NotaFiscalChaveParser notaFiscalChaveParser = new NotaFiscalChaveParser(chaveDeAcesso);
        final NfeConsultaStub.NfeCabecMsg cabec = new NfeConsultaStub.NfeCabecMsg();
        cabec.setCUF(notaFiscalChaveParser.getNFUnidadeFederativa().getCodigoIbge());
        cabec.setVersaoDados(WSNotaConsulta.VERSAO_SERVICO);

        final NfeConsultaStub.NfeCabecMsgE cabecE = new NfeConsultaStub.NfeCabecMsgE();
        cabecE.setNfeCabecMsg(cabec);

        final NfeConsultaStub.NfeDadosMsg dados = new NfeConsultaStub.NfeDadosMsg();
        dados.setExtraElement(omElementConsulta);


        NFAutorizador31 autorizador = NFAutorizador31.valueOfChaveAcesso(chaveDeAcesso);
        final String endpoint = NFModelo.NFCE.equals(notaFiscalChaveParser.getModelo()) ? autorizador.getNfceConsultaProtocolo(config.getAmbiente()) : autorizador.getNfeConsultaProtocolo(config.getAmbiente());
        if (endpoint == null) {
            throw new IllegalArgumentException("Nao foi possivel encontrar URL para ConsultaProtocolo " + notaFiscalChaveParser.getModelo().name() + ", autorizador " + autorizador.name());
        }

        final NfeConsultaNFResult consultaNFResult = new NfeConsultaStub(endpoint).nfeConsultaNF(dados, cabecE);
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
