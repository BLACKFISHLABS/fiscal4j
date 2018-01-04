package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.nfe.classes.NFNotaInfoImpostoTributacaoICMS;
import br.indie.fiscal4j.nfe.classes.NFNotaMotivoDesoneracaoICMS;
import br.indie.fiscal4j.nfe.classes.NFOrigem;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoICMS40Test {

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorICMSComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMS40().setValorICMSDesoneracao(new BigDecimal("10000000000000"));
    }

    @Test
    public void devePermitirValorICMSDesoneracaoNulo() {
        final DFNotaInfoItemImpostoICMS40 icms40 = new DFNotaInfoItemImpostoICMS40();
        icms40.setMotivoDesoneracaoICMS(NFNotaMotivoDesoneracaoICMS.TAXI);
        icms40.setOrigem(NFOrigem.NACIONAL);
        icms40.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.COM_REDUCAO_BASE_CALCULO);
        icms40.setValorICMSDesoneracao(new BigDecimal("99999999999.99"));
        icms40.toString();
    }

    @Test
    public void devePermitirMotivoDesoneracaoICMSNulo() {
        final DFNotaInfoItemImpostoICMS40 icms40 = new DFNotaInfoItemImpostoICMS40();
        icms40.setOrigem(NFOrigem.NACIONAL);
        icms40.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.COM_REDUCAO_BASE_CALCULO);
        icms40.setValorICMSDesoneracao(new BigDecimal("99999999999.99"));
        icms40.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirOrigemNulo() {
        final DFNotaInfoItemImpostoICMS40 icms40 = new DFNotaInfoItemImpostoICMS40();
        icms40.setMotivoDesoneracaoICMS(NFNotaMotivoDesoneracaoICMS.TAXI);
        icms40.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.COM_REDUCAO_BASE_CALCULO);
        icms40.setValorICMSDesoneracao(new BigDecimal("99999999999.99"));
        icms40.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirSituacaoTributariaNulo() {
        final DFNotaInfoItemImpostoICMS40 icms40 = new DFNotaInfoItemImpostoICMS40();
        icms40.setMotivoDesoneracaoICMS(NFNotaMotivoDesoneracaoICMS.TAXI);
        icms40.setOrigem(NFOrigem.NACIONAL);
        icms40.setValorICMSDesoneracao(new BigDecimal("99999999999.99"));
        icms40.toString();
    }

    @Test
    public void devePermitirValorICMSNulo() {
        final DFNotaInfoItemImpostoICMS40 icms40 = new DFNotaInfoItemImpostoICMS40();
        icms40.setMotivoDesoneracaoICMS(NFNotaMotivoDesoneracaoICMS.TAXI);
        icms40.setOrigem(NFOrigem.NACIONAL);
        icms40.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.COM_REDUCAO_BASE_CALCULO);
        icms40.setValorICMSDesoneracao(new BigDecimal("99999999999.99"));
        icms40.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final DFNotaInfoItemImpostoICMS40 icms40 = new DFNotaInfoItemImpostoICMS40();
        icms40.setMotivoDesoneracaoICMS(NFNotaMotivoDesoneracaoICMS.TAXI);
        icms40.setOrigem(NFOrigem.NACIONAL);
        icms40.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.COM_REDUCAO_BASE_CALCULO);
        icms40.setValorICMSDesoneracao(new BigDecimal("99999999999.99"));

        final String xmlEsperado = "<DFNotaInfoItemImpostoICMS40><orig>0</orig><CST>20</CST><vICMSDeson>99999999999.99</vICMSDeson><motDesICMS>1</motDesICMS></DFNotaInfoItemImpostoICMS40>";
        Assert.assertEquals(xmlEsperado, icms40.toString());
    }
}