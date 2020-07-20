package br.indie.fiscal4j.nfe400.webservices;

import br.indie.fiscal4j.DFLog;
import br.indie.fiscal4j.DFUnidadeFederativa;
import br.indie.fiscal4j.nfe.NFeConfig;
import br.indie.fiscal4j.nfe400.classes.NFAutorizador400;
import br.indie.fiscal4j.nfe400.classes.cadastro.NFConsultaCadastro;
import br.indie.fiscal4j.nfe400.classes.cadastro.NFInfoConsultaCadastro;
import br.indie.fiscal4j.nfe400.classes.cadastro.NFRetornoConsultaCadastro;
import br.indie.fiscal4j.nfe400.webservices.consultacadastro.CadConsultaCadastro4Stub;
import br.indie.fiscal4j.nfe400.webservices.consultacadastro.CadConsultaCadastro4Stub.NfeDadosMsg;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

class WSConsultaCadastro implements DFLog {

    private static final String NOME_SERVICO = "CONS-CAD";
    private static final String VERSAO_SERVICO = "2.00";
    private final NFeConfig config;

    WSConsultaCadastro(final NFeConfig config) {
        this.config = config;
    }

    NFRetornoConsultaCadastro consultaCadastro(final String cnpj, final DFUnidadeFederativa uf) throws Exception {
        final NFConsultaCadastro dadosConsulta = this.getDadosConsulta(cnpj, uf);
        final String xmlConsulta = dadosConsulta.toString();
        this.getLogger().debug(xmlConsulta);

        final OMElement omElementConsulta = AXIOMUtil.stringToOM(xmlConsulta);
        final OMElement resultado = this.efetuaConsulta(uf, omElementConsulta);
        this.getLogger().debug(resultado.toString());

        return this.config.getPersister().read(NFRetornoConsultaCadastro.class, resultado.toString());
    }

    private OMElement efetuaConsulta(final DFUnidadeFederativa uf, final OMElement omElementConsulta) throws Exception {
        final NFAutorizador400 autorizador = NFAutorizador400.valueOfCodigoUF(uf);
        if (autorizador == null) {
            throw new IllegalStateException(String.format("UF %s nao possui autorizador para este servico", uf.getDescricao()));
        }

        // estados que ainda nao possuem versao 4
        final String url = autorizador.getConsultaCadastro(this.config.getAmbiente());
//        if (Arrays.asList(DFUnidadeFederativa.AM, DFUnidadeFederativa.MG, DFUnidadeFederativa.PE).contains(uf)) {
//            final CadConsultaCadastro2Stub.NfeCabecMsg cabec = new NfeCabecMsg();
//            cabec.setCUF(uf.getCodigoIbge());
//            cabec.setVersaoDados(WSConsultaCadastro.VERSAO_SERVICO);
//
//            final NfeCabecMsgE cabecE = new NfeCabecMsgE();
//            cabecE.setNfeCabecMsg(cabec);
//
//            final br.indie.fiscal4j.nfe400.webservices.gerado.CadConsultaCadastro2Stub.NfeDadosMsg nfeDadosMsg = new br.indie.fiscal4j.nfe400.webservices.gerado.CadConsultaCadastro2Stub.NfeDadosMsg();
//            nfeDadosMsg.setExtraElement(omElementConsulta);
//            return new CadConsultaCadastro2Stub(url).consultaCadastro2(nfeDadosMsg, cabecE).getExtraElement();
//        } else {
        final NfeDadosMsg nfeDadosMsg_type0 = new NfeDadosMsg();
        nfeDadosMsg_type0.setExtraElement(omElementConsulta);
        return new CadConsultaCadastro4Stub(url).consultaCadastro(nfeDadosMsg_type0).getExtraElement();
//        }
    }

    private NFConsultaCadastro getDadosConsulta(final String cnpj, final DFUnidadeFederativa uf) {
        final NFConsultaCadastro consulta = new NFConsultaCadastro();
        consulta.setVersao(WSConsultaCadastro.VERSAO_SERVICO);
        consulta.setConsultaCadastro(new NFInfoConsultaCadastro());
        consulta.getConsultaCadastro().setCnpj(cnpj);
        consulta.getConsultaCadastro().setServico(WSConsultaCadastro.NOME_SERVICO);
        consulta.getConsultaCadastro().setUf(uf.getCodigo());
        return consulta;
    }
}
