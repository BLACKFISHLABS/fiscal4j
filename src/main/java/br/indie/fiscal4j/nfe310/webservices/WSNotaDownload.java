package br.indie.fiscal4j.nfe310.webservices;

import br.indie.fiscal4j.DFLog;
import br.indie.fiscal4j.nfe.NFeConfig;
import br.indie.fiscal4j.nfe310.classes.NFAutorizador31;
import br.indie.fiscal4j.nfe310.classes.evento.downloadnf.NFDownloadNFe;
import br.indie.fiscal4j.nfe310.classes.evento.downloadnf.NFDownloadNFeRetorno;
import br.indie.fiscal4j.nfe310.webservices.downloadnf.NfeDownloadNFStub;
import br.indie.fiscal4j.nfe310.webservices.downloadnf.NfeDownloadNFStub.NfeCabecMsg;
import br.indie.fiscal4j.nfe310.webservices.downloadnf.NfeDownloadNFStub.NfeCabecMsgE;
import br.indie.fiscal4j.nfe310.webservices.downloadnf.NfeDownloadNFStub.NfeDadosMsg;
import br.indie.fiscal4j.nfe310.webservices.downloadnf.NfeDownloadNFStub.NfeDownloadNFResult;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import java.math.BigDecimal;
import java.rmi.RemoteException;

class WSNotaDownload implements DFLog {

    private static final BigDecimal VERSAO_LEIAUTE = new BigDecimal("1.00");
    private static final String NOME_SERVICO = "DOWNLOAD NFE";
    private final NFeConfig config;

    WSNotaDownload(final NFeConfig config) {
        this.config = config;
    }

    NFDownloadNFeRetorno downloadNota(final String cnpj, final String chave) throws Exception {
        final OMElement omElementConsulta = AXIOMUtil.stringToOM(this.gerarDadosDownloadNF(cnpj, chave).toString());
        this.getLogger().debug(omElementConsulta.toString());

        final OMElement omElementRetorno = this.efetuaDownloadNF(omElementConsulta);
        this.getLogger().debug(omElementRetorno.toString());

        return this.config.getPersister().read(NFDownloadNFeRetorno.class, omElementRetorno.toString());
    }

    private OMElement efetuaDownloadNF(final OMElement omElementConsulta) throws RemoteException {
        final NfeCabecMsg cabec = new NfeCabecMsg();
        cabec.setCUF(this.config.getCUF().getCodigoIbge());
        cabec.setVersaoDados(WSNotaDownload.VERSAO_LEIAUTE.toPlainString());

        final NfeDownloadNFStub.NfeCabecMsgE cabecE = new NfeCabecMsgE();
        cabecE.setNfeCabecMsg(cabec);

        final NfeDownloadNFStub.NfeDadosMsg dados = new NfeDadosMsg();
        dados.setExtraElement(omElementConsulta);

        final NFAutorizador31 autorizador = NFAutorizador31.valueOfCodigoUF(this.config.getCUF());
        final String endpoint = autorizador.getNfeDownloadNF(this.config.getAmbiente());
        if (endpoint == null) {
            throw new IllegalArgumentException("Nao foi possivel encontrar URL para DownloadNF, autorizador " + autorizador.name());
        }

        final NfeDownloadNFResult nfeDownloadNFResult = new NfeDownloadNFStub(endpoint, config).nfeDownloadNF(dados, cabecE);
        return nfeDownloadNFResult.getExtraElement();
    }

    private NFDownloadNFe gerarDadosDownloadNF(final String cnpj, final String chave) {
        final NFDownloadNFe nfDownloadNFe = new NFDownloadNFe();
        nfDownloadNFe.setVersao(WSNotaDownload.VERSAO_LEIAUTE.toPlainString());
        nfDownloadNFe.setAmbiente(this.config.getAmbiente());
        nfDownloadNFe.setServico(WSNotaDownload.NOME_SERVICO);
        nfDownloadNFe.setCnpj(cnpj);
        nfDownloadNFe.setChave(chave);
        return nfDownloadNFe;
    }
}
