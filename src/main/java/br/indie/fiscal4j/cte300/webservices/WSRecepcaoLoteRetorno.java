package br.indie.fiscal4j.cte300.webservices;

import br.indie.fiscal4j.DFLog;
import br.indie.fiscal4j.cte300.CTeConfig;
import br.indie.fiscal4j.cte300.classes.CTAutorizador31;
import br.indie.fiscal4j.cte300.classes.enviolote.consulta.CTeConsultaRecLote;
import br.indie.fiscal4j.cte300.classes.enviolote.consulta.CTeConsultaRecLoteRet;
import br.indie.fiscal4j.cte300.webservices.retrecepcao.CteRetRecepcaoStub;
import br.indie.fiscal4j.cte300.webservices.retrecepcao.CteRetRecepcaoStub.CteRetRecepcaoResult;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import java.rmi.RemoteException;

class WSRecepcaoLoteRetorno implements DFLog {

    private final CTeConfig config;

    WSRecepcaoLoteRetorno(final CTeConfig config) {
        this.config = config;
    }

    CTeConsultaRecLoteRet consultaLote(final String numeroRecibo) throws Exception {
        final OMElement omElementConsulta = AXIOMUtil.stringToOM(this.gerarDadosConsulta(numeroRecibo).toString());
        this.getLogger().debug(omElementConsulta.toString());

        final OMElement omElementResult = this.efetuaConsulta(omElementConsulta);
        this.getLogger().debug(omElementResult.toString());

        return this.config.getPersister().read(CTeConsultaRecLoteRet.class, omElementResult.toString());
    }

    private OMElement efetuaConsulta(final OMElement omElement) throws RemoteException {
        final CteRetRecepcaoStub.CteCabecMsg cabec = new CteRetRecepcaoStub.CteCabecMsg();
        cabec.setCUF(this.config.getCUF().getCodigoIbge());
        cabec.setVersaoDados(CTeConfig.VERSAO);

        final CteRetRecepcaoStub.CteCabecMsgE cabecE = new CteRetRecepcaoStub.CteCabecMsgE();
        cabecE.setCteCabecMsg(cabec);

        final CteRetRecepcaoStub.CteDadosMsg dados = new CteRetRecepcaoStub.CteDadosMsg();
        dados.setExtraElement(omElement);

        final CTAutorizador31 autorizador = CTAutorizador31.valueOfCodigoUF(this.config.getCUF());
        final String endpoint = autorizador.getCteRetRecepcao(this.config.getAmbiente());
        if (endpoint == null) {
            throw new IllegalArgumentException("Nao foi possivel encontrar URL para RetRecepcao, autorizador " + autorizador.name() + ", UF " + this.config.getCUF().name());
        }
        final CteRetRecepcaoResult autorizacaoLoteResult = new CteRetRecepcaoStub(endpoint, config).cteRetRecepcao(dados, cabecE);
        return autorizacaoLoteResult.getExtraElement();
    }

    private CTeConsultaRecLote gerarDadosConsulta(final String numeroRecibo) {
        final CTeConsultaRecLote consulta = new CTeConsultaRecLote();
        consulta.setNumeroRecebimento(numeroRecibo);
        consulta.setAmbiente(this.config.getAmbiente());
        consulta.setVersao(CTeConfig.VERSAO);
        return consulta;
    }
}
