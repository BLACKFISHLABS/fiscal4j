package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.nfe.classes.NFNotaInfoImpostoTributacaoICMS;
import br.indie.fiscal4j.nfe.classes.NFNotaInfoItemModalidadeBCICMS;
import br.indie.fiscal4j.nfe.classes.NFNotaMotivoDesoneracaoICMS;
import br.indie.fiscal4j.nfe.classes.NFOrigem;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoICMS20Test {

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualAliquotaComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMS20().setPercentualAliquota(new BigDecimal("10000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualReducaoBCComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMS20().setPercentualReducaoBC(new BigDecimal("1000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorBCICMSComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMS20().setValorBCICMS(new BigDecimal("10000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorTributoComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMS20().setValorTributo(new BigDecimal("10000000000000"));
    }

    @Test
    public void devePermitirDesoneracaoNulo() {
        final DFNotaInfoItemImpostoICMS20 icms20 = new DFNotaInfoItemImpostoICMS20();
        icms20.setOrigem(NFOrigem.NACIONAL);
        icms20.setPercentualAliquota(new BigDecimal("99.99"));
        icms20.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms20.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms20.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms20.setValorTributo(new BigDecimal("999999999999.99"));
        icms20.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms20.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.PAUTA);
        icms20.toString();
    }

    @Test
    public void devePermitirValorICMSDesoneracaoNulo() {
        final DFNotaInfoItemImpostoICMS20 icms20 = new DFNotaInfoItemImpostoICMS20();
        icms20.setOrigem(NFOrigem.NACIONAL);
        icms20.setPercentualAliquota(new BigDecimal("99.99"));
        icms20.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms20.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms20.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms20.setValorTributo(new BigDecimal("999999999999.99"));
        icms20.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms20.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.PAUTA);
        icms20.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirModalidadeBaseCalculoNulo() {
        final DFNotaInfoItemImpostoICMS20 icms20 = new DFNotaInfoItemImpostoICMS20();
        icms20.setOrigem(NFOrigem.NACIONAL);
        icms20.setPercentualAliquota(new BigDecimal("99.99"));
        icms20.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms20.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms20.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms20.setValorTributo(new BigDecimal("999999999999.99"));
        icms20.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms20.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms20.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirOrigemNulo() {
        final DFNotaInfoItemImpostoICMS20 icms20 = new DFNotaInfoItemImpostoICMS20();
        icms20.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.PAUTA);
        icms20.setPercentualAliquota(new BigDecimal("99.99"));
        icms20.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms20.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms20.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms20.setValorTributo(new BigDecimal("999999999999.99"));
        icms20.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms20.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms20.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPercentualAliquotaNulo() {
        final DFNotaInfoItemImpostoICMS20 icms20 = new DFNotaInfoItemImpostoICMS20();
        icms20.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.PAUTA);
        icms20.setOrigem(NFOrigem.NACIONAL);
        icms20.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms20.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms20.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms20.setValorTributo(new BigDecimal("999999999999.99"));
        icms20.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms20.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms20.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPercentualReducaoBCNulo() {
        final DFNotaInfoItemImpostoICMS20 icms20 = new DFNotaInfoItemImpostoICMS20();
        icms20.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.PAUTA);
        icms20.setOrigem(NFOrigem.NACIONAL);
        icms20.setPercentualAliquota(new BigDecimal("99.99"));
        icms20.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms20.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms20.setValorTributo(new BigDecimal("999999999999.99"));
        icms20.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms20.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms20.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirSituacaoTributariaNulo() {
        final DFNotaInfoItemImpostoICMS20 icms20 = new DFNotaInfoItemImpostoICMS20();
        icms20.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.PAUTA);
        icms20.setOrigem(NFOrigem.NACIONAL);
        icms20.setPercentualAliquota(new BigDecimal("99.99"));
        icms20.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms20.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms20.setValorTributo(new BigDecimal("999999999999.99"));
        icms20.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms20.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms20.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorBCICMSNulo() {
        final DFNotaInfoItemImpostoICMS20 icms20 = new DFNotaInfoItemImpostoICMS20();
        icms20.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.PAUTA);
        icms20.setOrigem(NFOrigem.NACIONAL);
        icms20.setPercentualAliquota(new BigDecimal("99.99"));
        icms20.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms20.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms20.setValorTributo(new BigDecimal("999999999999.99"));
        icms20.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms20.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms20.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorTributoNulo() {
        final DFNotaInfoItemImpostoICMS20 icms20 = new DFNotaInfoItemImpostoICMS20();
        icms20.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.PAUTA);
        icms20.setOrigem(NFOrigem.NACIONAL);
        icms20.setPercentualAliquota(new BigDecimal("99.99"));
        icms20.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms20.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms20.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms20.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms20.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms20.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final DFNotaInfoItemImpostoICMS20 icms20 = new DFNotaInfoItemImpostoICMS20();
        icms20.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.PAUTA);
        icms20.setOrigem(NFOrigem.NACIONAL);
        icms20.setPercentualAliquota(new BigDecimal("99.99"));
        icms20.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms20.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms20.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms20.setValorTributo(new BigDecimal("999999999999.99"));
        icms20.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms20.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));

        final String xmlEsperado = "<DFNotaInfoItemImpostoICMS20><orig>0</orig><CST>40</CST><modBC>1</modBC><pRedBC>99.99</pRedBC><vBC>999999999999.99</vBC><pICMS>99.99</pICMS><vICMS>999999999999.99</vICMS><vICMSDeson>999999999999.99</vICMSDeson><motDesICMS>9</motDesICMS></DFNotaInfoItemImpostoICMS20>";
        Assert.assertEquals(xmlEsperado, icms20.toString());
    }
}