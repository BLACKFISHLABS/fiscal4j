package br.indie.fiscal4j.nfe.webservices;

import br.indie.fiscal4j.common.DFModelo;
import br.indie.fiscal4j.nfe.NFeConfig;
import br.indie.fiscal4j.nfe.classes.NFAutorizador4;
import br.indie.fiscal4j.nfe.classes.lote.consulta.DFLoteConsulta;
import br.indie.fiscal4j.nfe.classes.lote.consulta.DFLoteConsultaRetorno;
import br.indie.fiscal4j.nfe.transformers.NFRegistryMatcher;
import br.indie.fiscal4j.nfe.webservices.gerado.NfeRetAutorizacaoStub;
import br.indie.fiscal4j.nfe.webservices.gerado.NfeRetAutorizacaoStub.NfeRetAutorizacaoLoteResult;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.Format;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.rmi.RemoteException;

class WSLoteConsulta {

    final private static Logger LOGGER = LoggerFactory.getLogger(WSLoteConsulta.class);
    private final NFeConfig config;

    WSLoteConsulta(final NFeConfig config) {
        this.config = config;
    }

    DFLoteConsultaRetorno consultaLote(final String numeroRecibo, final DFModelo modelo) throws Exception {
        final OMElement omElementConsulta = AXIOMUtil.stringToOM(this.gerarDadosConsulta(numeroRecibo).toString());
        WSLoteConsulta.LOGGER.debug(omElementConsulta.toString());

        final OMElement omElementResult = this.efetuaConsulta(omElementConsulta, modelo);
        WSLoteConsulta.LOGGER.debug(omElementResult.toString());

        return new Persister(new NFRegistryMatcher(), new Format(0)).read(DFLoteConsultaRetorno.class, omElementResult.toString());
    }

    private OMElement efetuaConsulta(final OMElement omElement, final DFModelo modelo) throws RemoteException {
        final NfeRetAutorizacaoStub.NfeCabecMsg cabec = new NfeRetAutorizacaoStub.NfeCabecMsg();
        cabec.setCUF(this.config.getCUF().getCodigoIbge());
        cabec.setVersaoDados(NFeConfig.VERSAO_NFE);

        final NfeRetAutorizacaoStub.NfeCabecMsgE cabecE = new NfeRetAutorizacaoStub.NfeCabecMsgE();
        cabecE.setNfeCabecMsg(cabec);

        final NfeRetAutorizacaoStub.NfeDadosMsg dados = new NfeRetAutorizacaoStub.NfeDadosMsg();
        dados.setExtraElement(omElement);

        final NFAutorizador4 autorizador = NFAutorizador4.valueOfTipoEmissao(this.config.getTipoEmissao(), this.config.getCUF());
        final String urlWebService = DFModelo.NFCE.equals(modelo) ? autorizador.getNfceRetAutorizacao(this.config.getAmbiente()) : autorizador.getNfeRetAutorizacao(this.config.getAmbiente());
        if (urlWebService == null) {
            throw new IllegalArgumentException("Nao foi possivel encontrar URL para RetAutorizacao " + modelo.name() + ", autorizador " + autorizador.name());
        }

        final NfeRetAutorizacaoLoteResult autorizacaoLoteResult = new NfeRetAutorizacaoStub(urlWebService).nfeRetAutorizacaoLote(dados, cabecE);
        return autorizacaoLoteResult.getExtraElement();
    }

    private DFLoteConsulta gerarDadosConsulta(final String numeroRecibo) {
        final DFLoteConsulta consulta = new DFLoteConsulta();
        consulta.setRecibo(numeroRecibo);
        consulta.setAmbiente(this.config.getAmbiente());
        consulta.setVersao(new BigDecimal(NFeConfig.VERSAO_NFE));
        return consulta;
    }
}
