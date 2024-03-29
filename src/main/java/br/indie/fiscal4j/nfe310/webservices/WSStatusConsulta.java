package br.indie.fiscal4j.nfe310.webservices;

import br.indie.fiscal4j.DFLog;
import br.indie.fiscal4j.DFModelo;
import br.indie.fiscal4j.DFUnidadeFederativa;
import br.indie.fiscal4j.nfe.NFeConfig;
import br.indie.fiscal4j.nfe310.classes.NFAutorizador31;
import br.indie.fiscal4j.nfe310.classes.statusservico.consulta.NFStatusServicoConsulta;
import br.indie.fiscal4j.nfe310.classes.statusservico.consulta.NFStatusServicoConsultaRetorno;
import br.indie.fiscal4j.nfe310.webservices.statusservico.consulta.NfeStatusServico2Stub;
import br.indie.fiscal4j.nfe310.webservices.statusservico.consulta.NfeStatusServicoStub;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import java.rmi.RemoteException;

class WSStatusConsulta implements DFLog {

    private static final String NOME_SERVICO = "STATUS";
    private final NFeConfig config;

    WSStatusConsulta(final NFeConfig config) {
        this.config = config;
    }

    NFStatusServicoConsultaRetorno consultaStatus(final DFUnidadeFederativa uf, final DFModelo modelo) throws Exception {
        final OMElement omElementConsulta = AXIOMUtil.stringToOM(this.gerarDadosConsulta(uf).toString());
        this.getLogger().debug(omElementConsulta.toString());

        final boolean consultaNotaBahiaWorkaround = DFUnidadeFederativa.BA.equals(uf) && DFModelo.NFE.equals(modelo);
        final OMElement omElementResult = consultaNotaBahiaWorkaround ? this.efetuaConsultaStatusBahia(omElementConsulta) : this.efetuaConsultaStatus(omElementConsulta, uf, modelo);
        this.getLogger().debug(omElementResult.toString());

        return this.config.getPersister().read(NFStatusServicoConsultaRetorno.class, omElementResult.toString());
    }

    private NFStatusServicoConsulta gerarDadosConsulta(final DFUnidadeFederativa unidadeFederativa) {
        final NFStatusServicoConsulta consStatServ = new NFStatusServicoConsulta();
        consStatServ.setUf(unidadeFederativa);
        consStatServ.setAmbiente(this.config.getAmbiente());
        consStatServ.setVersao(this.config.getVersao());
        consStatServ.setServico(WSStatusConsulta.NOME_SERVICO);
        return consStatServ;
    }

    private OMElement efetuaConsultaStatus(final OMElement omElement, final DFUnidadeFederativa unidadeFederativa, final DFModelo modelo) throws RemoteException {
        final NfeStatusServico2Stub.NfeCabecMsg cabec = new NfeStatusServico2Stub.NfeCabecMsg();
        cabec.setCUF(unidadeFederativa.getCodigoIbge());
        cabec.setVersaoDados(this.config.getVersao());

        final NfeStatusServico2Stub.NfeCabecMsgE cabecEnv = new NfeStatusServico2Stub.NfeCabecMsgE();
        cabecEnv.setNfeCabecMsg(cabec);

        final NfeStatusServico2Stub.NfeDadosMsg dados = new NfeStatusServico2Stub.NfeDadosMsg();
        dados.setExtraElement(omElement);

        final NFAutorizador31 autorizador = NFAutorizador31.valueOfCodigoUF(unidadeFederativa);
        final String endpoint = DFModelo.NFCE.equals(modelo) ? autorizador.getNfceStatusServico(this.config.getAmbiente()) : autorizador.getNfeStatusServico(this.config.getAmbiente());
        if (endpoint == null) {
            throw new IllegalArgumentException("Nao foi possivel encontrar URL para StatusServico " + modelo.name() + ", autorizador " + autorizador.name() + ", UF " + unidadeFederativa.name());
        }
        return new NfeStatusServico2Stub(endpoint, config).nfeStatusServicoNF2(dados, cabecEnv).getExtraElement();
    }

    // este metodo teve que ser implementado pois a Bahia trata de forma diferente
    private OMElement efetuaConsultaStatusBahia(final OMElement omElement) throws RemoteException {
        final NfeStatusServicoStub.NfeCabecMsg cabec = new NfeStatusServicoStub.NfeCabecMsg();
        cabec.setCUF(DFUnidadeFederativa.BA.getCodigoIbge());
        cabec.setVersaoDados(this.config.getVersao());

        final NfeStatusServicoStub.NfeCabecMsgE cabecEnv = new NfeStatusServicoStub.NfeCabecMsgE();
        cabecEnv.setNfeCabecMsg(cabec);

        final NfeStatusServicoStub.NfeDadosMsg dados = new NfeStatusServicoStub.NfeDadosMsg();
        dados.setExtraElement(omElement);

        final NFAutorizador31 autorizador = NFAutorizador31.valueOfCodigoUF(DFUnidadeFederativa.BA);
        final String endpoint = autorizador.getNfeStatusServico(this.config.getAmbiente());
        if (endpoint == null) {
            throw new IllegalArgumentException("Nao foi possivel encontrar URL para StatusServico " + DFModelo.NFE.name() + ", autorizador " + autorizador.name() + ", UF " + DFUnidadeFederativa.BA.name());
        }
        return new NfeStatusServicoStub(endpoint, config).nfeStatusServicoNF(dados, cabecEnv).getExtraElement();
    }
}
