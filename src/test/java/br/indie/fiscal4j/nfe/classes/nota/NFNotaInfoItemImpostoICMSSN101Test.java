package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.nfe.classes.NFNotaSituacaoOperacionalSimplesNacional;
import br.indie.fiscal4j.nfe.classes.NFOrigem;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoICMSSN101Test {

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualAliquotaAplicavelCalculoCreditoSNComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSSN101().setPercentualAliquotaAplicavelCalculoCreditoSN(new BigDecimal("1000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorCreditoICMSSNComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSSN101().setValorCreditoICMSSN(new BigDecimal("10000000000000"));
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCodigoSituacaoOperacaoSNNulo() {
        final DFNotaInfoItemImpostoICMSSN101 icms101 = new DFNotaInfoItemImpostoICMSSN101();
        icms101.setOrigem(NFOrigem.NACIONAL);
        icms101.setPercentualAliquotaAplicavelCalculoCreditoSN(new BigDecimal("99.99"));
        icms101.setValorCreditoICMSSN(new BigDecimal("999999999999.99"));
        icms101.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitiOrigemNulo() {
        final DFNotaInfoItemImpostoICMSSN101 icms101 = new DFNotaInfoItemImpostoICMSSN101();
        icms101.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.ISENCAO_ICMS_FAIXA_RECEITA_BRUTA);
        icms101.setPercentualAliquotaAplicavelCalculoCreditoSN(new BigDecimal("99.99"));
        icms101.setValorCreditoICMSSN(new BigDecimal("999999999999.99"));
        icms101.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPercentualAliquotaAplicavelCalculoCreditoSNNulo() {
        final DFNotaInfoItemImpostoICMSSN101 icms101 = new DFNotaInfoItemImpostoICMSSN101();
        icms101.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.ISENCAO_ICMS_FAIXA_RECEITA_BRUTA);
        icms101.setOrigem(NFOrigem.NACIONAL);
        icms101.setValorCreditoICMSSN(new BigDecimal("999999999999.99"));
        icms101.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorCreditoICMSSNNulo() {
        final DFNotaInfoItemImpostoICMSSN101 icms101 = new DFNotaInfoItemImpostoICMSSN101();
        icms101.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.ISENCAO_ICMS_FAIXA_RECEITA_BRUTA);
        icms101.setOrigem(NFOrigem.NACIONAL);
        icms101.setPercentualAliquotaAplicavelCalculoCreditoSN(new BigDecimal("99.99"));
        icms101.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final DFNotaInfoItemImpostoICMSSN101 icms101 = new DFNotaInfoItemImpostoICMSSN101();
        icms101.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.ISENCAO_ICMS_FAIXA_RECEITA_BRUTA);
        icms101.setOrigem(NFOrigem.NACIONAL);
        icms101.setPercentualAliquotaAplicavelCalculoCreditoSN(new BigDecimal("99.99"));
        icms101.setValorCreditoICMSSN(new BigDecimal("999999999999.99"));

        final String xmlEsperado = "<DFNotaInfoItemImpostoICMSSN101><orig>0</orig><CSOSN>103</CSOSN><pCredSN>99.99</pCredSN><vCredICMSSN>999999999999.99</vCredICMSSN></DFNotaInfoItemImpostoICMSSN101>";
        Assert.assertEquals(xmlEsperado, icms101.toString());
    }
}