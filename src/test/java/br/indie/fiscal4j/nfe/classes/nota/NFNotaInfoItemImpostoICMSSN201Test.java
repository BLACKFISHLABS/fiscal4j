package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.nfe.classes.NFNotaInfoItemModalidadeBCICMSST;
import br.indie.fiscal4j.nfe.classes.NFNotaSituacaoOperacionalSimplesNacional;
import br.indie.fiscal4j.nfe.classes.NFOrigem;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoICMSSN201Test {

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualAliquotaAplicavelCalculoCreditoSNComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSSN201().setPercentualAliquotaAplicavelCalculoCreditoSN(new BigDecimal("1000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualAliquotaImpostoICMSSTComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSSN201().setPercentualAliquotaImpostoICMSST(new BigDecimal("1000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualMargemValorAdicionadoICMSSTComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSSN201().setPercentualMargemValorAdicionadoICMSST(new BigDecimal("1000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualReducaoBCICMSSTComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSSN201().setPercentualReducaoBCICMSST(new BigDecimal("1000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorBCICMSSTComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSSN201().setValorBCICMSST(new BigDecimal("10000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorCreditoICMSSNComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSSN201().setValorCreditoICMSSN(new BigDecimal("10000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorICMSSTComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSSN201().setValorICMSST(new BigDecimal("10000000000000"));
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirModalidadeDeterminacaoBCICMSSTNulo() {
        final DFNotaInfoItemImpostoICMSSN201 icms201 = new DFNotaInfoItemImpostoICMSSN201();
        icms201.setOrigem(NFOrigem.NACIONAL);
        icms201.setPercentualAliquotaAplicavelCalculoCreditoSN(new BigDecimal("99.99"));
        icms201.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms201.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms201.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms201.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.IMUNE);
        icms201.setValorBCICMSST(new BigDecimal("99999999999.99"));
        icms201.setValorCreditoICMSSN(new BigDecimal("99999999999.99"));
        icms201.setValorICMSST(new BigDecimal("99999999999.99"));
        icms201.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirOrigemNulo() {
        final DFNotaInfoItemImpostoICMSSN201 icms201 = new DFNotaInfoItemImpostoICMSSN201();
        icms201.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.PRECO_TABELADO);
        icms201.setPercentualAliquotaAplicavelCalculoCreditoSN(new BigDecimal("99.99"));
        icms201.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms201.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms201.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms201.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.IMUNE);
        icms201.setValorBCICMSST(new BigDecimal("99999999999.99"));
        icms201.setValorCreditoICMSSN(new BigDecimal("99999999999.99"));
        icms201.setValorICMSST(new BigDecimal("99999999999.99"));
        icms201.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirAliquotaAplicavelCalculoCreditoSNNulo() {
        final DFNotaInfoItemImpostoICMSSN201 icms201 = new DFNotaInfoItemImpostoICMSSN201();
        icms201.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.PRECO_TABELADO);
        icms201.setOrigem(NFOrigem.NACIONAL);
        icms201.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms201.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms201.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms201.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.IMUNE);
        icms201.setValorBCICMSST(new BigDecimal("99999999999.99"));
        icms201.setValorCreditoICMSSN(new BigDecimal("99999999999.99"));
        icms201.setValorICMSST(new BigDecimal("99999999999.99"));
        icms201.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPercentualAliquotaImpostoICMSSTNulo() {
        final DFNotaInfoItemImpostoICMSSN201 icms201 = new DFNotaInfoItemImpostoICMSSN201();
        icms201.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.PRECO_TABELADO);
        icms201.setOrigem(NFOrigem.NACIONAL);
        icms201.setPercentualAliquotaAplicavelCalculoCreditoSN(new BigDecimal("99.99"));
        icms201.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms201.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms201.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.IMUNE);
        icms201.setValorBCICMSST(new BigDecimal("99999999999.99"));
        icms201.setValorCreditoICMSSN(new BigDecimal("99999999999.99"));
        icms201.setValorICMSST(new BigDecimal("99999999999.99"));
        icms201.toString();
    }

    @Test
    public void devePermitirPercentualMargemValorAdicionadoICMSSTNulo() {
        final DFNotaInfoItemImpostoICMSSN201 icms201 = new DFNotaInfoItemImpostoICMSSN201();
        icms201.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.PRECO_TABELADO);
        icms201.setOrigem(NFOrigem.NACIONAL);
        icms201.setPercentualAliquotaAplicavelCalculoCreditoSN(new BigDecimal("99.99"));
        icms201.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms201.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms201.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.IMUNE);
        icms201.setValorBCICMSST(new BigDecimal("99999999999.99"));
        icms201.setValorCreditoICMSSN(new BigDecimal("99999999999.99"));
        icms201.setValorICMSST(new BigDecimal("99999999999.99"));
        icms201.toString();
    }

    @Test
    public void devePermitirPercentualReducaoBCICMSSTNulo() {
        final DFNotaInfoItemImpostoICMSSN201 icms201 = new DFNotaInfoItemImpostoICMSSN201();
        icms201.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.PRECO_TABELADO);
        icms201.setOrigem(NFOrigem.NACIONAL);
        icms201.setPercentualAliquotaAplicavelCalculoCreditoSN(new BigDecimal("99.99"));
        icms201.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms201.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms201.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.IMUNE);
        icms201.setValorBCICMSST(new BigDecimal("99999999999.99"));
        icms201.setValorCreditoICMSSN(new BigDecimal("99999999999.99"));
        icms201.setValorICMSST(new BigDecimal("99999999999.99"));
        icms201.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirSituacaoOperacaoSNNulo() {
        final DFNotaInfoItemImpostoICMSSN201 icms201 = new DFNotaInfoItemImpostoICMSSN201();
        icms201.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.PRECO_TABELADO);
        icms201.setOrigem(NFOrigem.NACIONAL);
        icms201.setPercentualAliquotaAplicavelCalculoCreditoSN(new BigDecimal("99.99"));
        icms201.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms201.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms201.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms201.setValorBCICMSST(new BigDecimal("99999999999.99"));
        icms201.setValorCreditoICMSSN(new BigDecimal("99999999999.99"));
        icms201.setValorICMSST(new BigDecimal("99999999999.99"));
        icms201.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorBCICMSSTNulo() {
        final DFNotaInfoItemImpostoICMSSN201 icms201 = new DFNotaInfoItemImpostoICMSSN201();
        icms201.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.PRECO_TABELADO);
        icms201.setOrigem(NFOrigem.NACIONAL);
        icms201.setPercentualAliquotaAplicavelCalculoCreditoSN(new BigDecimal("99.99"));
        icms201.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms201.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms201.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms201.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.IMUNE);
        icms201.setValorCreditoICMSSN(new BigDecimal("99999999999.99"));
        icms201.setValorICMSST(new BigDecimal("99999999999.99"));
        icms201.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorCreditoICMSSNNulo() {
        final DFNotaInfoItemImpostoICMSSN201 icms201 = new DFNotaInfoItemImpostoICMSSN201();
        icms201.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.PRECO_TABELADO);
        icms201.setOrigem(NFOrigem.NACIONAL);
        icms201.setPercentualAliquotaAplicavelCalculoCreditoSN(new BigDecimal("99.99"));
        icms201.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms201.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms201.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms201.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.IMUNE);
        icms201.setValorBCICMSST(new BigDecimal("99999999999.99"));
        icms201.setValorICMSST(new BigDecimal("99999999999.99"));
        icms201.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorICMSSTNulo() {
        final DFNotaInfoItemImpostoICMSSN201 icms201 = new DFNotaInfoItemImpostoICMSSN201();
        icms201.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.PRECO_TABELADO);
        icms201.setOrigem(NFOrigem.NACIONAL);
        icms201.setPercentualAliquotaAplicavelCalculoCreditoSN(new BigDecimal("99.99"));
        icms201.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms201.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms201.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms201.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.IMUNE);
        icms201.setValorBCICMSST(new BigDecimal("99999999999.99"));
        icms201.setValorCreditoICMSSN(new BigDecimal("99999999999.99"));
        icms201.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final DFNotaInfoItemImpostoICMSSN201 icms201 = new DFNotaInfoItemImpostoICMSSN201();
        icms201.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.PRECO_TABELADO);
        icms201.setOrigem(NFOrigem.NACIONAL);
        icms201.setPercentualAliquotaAplicavelCalculoCreditoSN(new BigDecimal("99.99"));
        icms201.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms201.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms201.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms201.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.IMUNE);
        icms201.setValorBCICMSST(new BigDecimal("99999999999.99"));
        icms201.setValorCreditoICMSSN(new BigDecimal("99999999999.99"));
        icms201.setValorICMSST(new BigDecimal("99999999999.99"));

        final String xmlEsperado = "<DFNotaInfoItemImpostoICMSSN201><orig>0</orig><CSOSN>300</CSOSN><modBCST>0</modBCST><pMVAST>99.99</pMVAST><pRedBCST>99.99</pRedBCST><vBCST>99999999999.99</vBCST><pICMSST>99.99</pICMSST><vICMSST>99999999999.99</vICMSST><pCredSN>99.99</pCredSN><vCredICMSSN>99999999999.99</vCredICMSSN></DFNotaInfoItemImpostoICMSSN201>";
        Assert.assertEquals(xmlEsperado, icms201.toString());
    }
}