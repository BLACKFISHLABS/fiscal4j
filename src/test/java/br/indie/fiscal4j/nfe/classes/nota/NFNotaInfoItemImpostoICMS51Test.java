package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.nfe.classes.NFNotaInfoImpostoTributacaoICMS;
import br.indie.fiscal4j.nfe.classes.NFNotaInfoItemModalidadeBCICMS;
import br.indie.fiscal4j.nfe.classes.NFOrigem;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoICMS51Test {

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualICMSComTamanhoDiferente() {
        new DFNotaInfoItemImpostoICMS51().setPercentualICMS(new BigDecimal("10000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualReducaoBCComTamanhoDiferente() {
        new DFNotaInfoItemImpostoICMS51().setPercentualReducaoBC(new BigDecimal("1000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorBCICMSComTamanhoDiferente() {
        new DFNotaInfoItemImpostoICMS51().setValorBCICMS(new BigDecimal("10000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorICMSComTamanhoDiferente() {
        new DFNotaInfoItemImpostoICMS51().setValorICMS(new BigDecimal("10000000000000"));
    }

    @Test
    public void naoDevePermitirValorICMSDiferimentoNulo() {
        final DFNotaInfoItemImpostoICMS51 icms51 = new DFNotaInfoItemImpostoICMS51();
        icms51.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms51.setOrigem(NFOrigem.NACIONAL);
        icms51.setPercentualICMS(new BigDecimal("99.99"));
        icms51.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms51.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms51.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms51.setValorICMS(new BigDecimal("999999999999.99"));
        icms51.setPercentualDiferimento(new BigDecimal("99.9999"));
        icms51.setValorICMSOperacao(new BigDecimal("999999999999.99"));
        icms51.toString();
    }

    @Test
    public void naoDevePermitirPercentualDiferimentoNulo() {
        final DFNotaInfoItemImpostoICMS51 icms51 = new DFNotaInfoItemImpostoICMS51();
        icms51.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms51.setOrigem(NFOrigem.NACIONAL);
        icms51.setPercentualICMS(new BigDecimal("99.99"));
        icms51.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms51.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms51.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms51.setValorICMS(new BigDecimal("999999999999.99"));
        icms51.setValorICMSDiferimento(new BigDecimal("999999999999.99"));
        icms51.setValorICMSOperacao(new BigDecimal("999999999999.99"));
        icms51.toString();
    }

    @Test
    public void naoDevePermitirValorICMSOperacaoNulo() {
        final DFNotaInfoItemImpostoICMS51 icms51 = new DFNotaInfoItemImpostoICMS51();
        icms51.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms51.setOrigem(NFOrigem.NACIONAL);
        icms51.setPercentualICMS(new BigDecimal("99.99"));
        icms51.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms51.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms51.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms51.setValorICMS(new BigDecimal("999999999999.99"));
        icms51.setPercentualDiferimento(new BigDecimal("99.9999"));
        icms51.setValorICMSDiferimento(new BigDecimal("999999999999.99"));
        icms51.toString();
    }

    @Test
    public void naoDevePermitirModalidadeBCNulo() {
        final DFNotaInfoItemImpostoICMS51 icms51 = new DFNotaInfoItemImpostoICMS51();
        icms51.setOrigem(NFOrigem.NACIONAL);
        icms51.setPercentualICMS(new BigDecimal("99.99"));
        icms51.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms51.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms51.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms51.setValorICMS(new BigDecimal("999999999999.99"));
        icms51.setPercentualDiferimento(new BigDecimal("99.9999"));
        icms51.setValorICMSDiferimento(new BigDecimal("999999999999.99"));
        icms51.setValorICMSOperacao(new BigDecimal("999999999999.99"));
        icms51.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirOrigemNulo() {
        final DFNotaInfoItemImpostoICMS51 icms51 = new DFNotaInfoItemImpostoICMS51();
        icms51.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms51.setPercentualICMS(new BigDecimal("99.99"));
        icms51.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms51.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms51.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms51.setValorICMS(new BigDecimal("999999999999.99"));
        icms51.setPercentualDiferimento(new BigDecimal("99.9999"));
        icms51.setValorICMSDiferimento(new BigDecimal("999999999999.99"));
        icms51.setValorICMSOperacao(new BigDecimal("999999999999.99"));
        icms51.toString();
    }

    @Test
    public void devePermitirPercentualICMSBCNulo() {
        final DFNotaInfoItemImpostoICMS51 icms51 = new DFNotaInfoItemImpostoICMS51();
        icms51.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms51.setOrigem(NFOrigem.NACIONAL);
        icms51.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms51.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms51.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms51.setValorICMS(new BigDecimal("999999999999.99"));
        icms51.setPercentualDiferimento(new BigDecimal("99.9999"));
        icms51.setValorICMSDiferimento(new BigDecimal("999999999999.99"));
        icms51.setValorICMSOperacao(new BigDecimal("999999999999.99"));
        icms51.toString();
    }

    @Test
    public void devePermitirPercentualReducaoBCNulo() {
        final DFNotaInfoItemImpostoICMS51 icms51 = new DFNotaInfoItemImpostoICMS51();
        icms51.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms51.setOrigem(NFOrigem.NACIONAL);
        icms51.setPercentualICMS(new BigDecimal("99.99"));
        icms51.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms51.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms51.setValorICMS(new BigDecimal("999999999999.99"));
        icms51.setPercentualDiferimento(new BigDecimal("99.9999"));
        icms51.setValorICMSDiferimento(new BigDecimal("999999999999.99"));
        icms51.setValorICMSOperacao(new BigDecimal("999999999999.99"));
        icms51.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirSituacaoTributariaNulo() {
        final DFNotaInfoItemImpostoICMS51 icms51 = new DFNotaInfoItemImpostoICMS51();
        icms51.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms51.setOrigem(NFOrigem.NACIONAL);
        icms51.setPercentualICMS(new BigDecimal("99.99"));
        icms51.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms51.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms51.setValorICMS(new BigDecimal("999999999999.99"));
        icms51.setPercentualDiferimento(new BigDecimal("99.9999"));
        icms51.setValorICMSDiferimento(new BigDecimal("999999999999.99"));
        icms51.setValorICMSOperacao(new BigDecimal("999999999999.99"));
        icms51.toString();
    }

    @Test
    public void devePermitirValorBCICMSNulo() {
        final DFNotaInfoItemImpostoICMS51 icms51 = new DFNotaInfoItemImpostoICMS51();
        icms51.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms51.setOrigem(NFOrigem.NACIONAL);
        icms51.setPercentualICMS(new BigDecimal("99.99"));
        icms51.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms51.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms51.setValorICMS(new BigDecimal("999999999999.99"));
        icms51.setPercentualDiferimento(new BigDecimal("99.9999"));
        icms51.setValorICMSDiferimento(new BigDecimal("999999999999.99"));
        icms51.setValorICMSOperacao(new BigDecimal("999999999999.99"));
        icms51.toString();
    }

    @Test
    public void devePermitirValorICMSNulo() {
        final DFNotaInfoItemImpostoICMS51 icms51 = new DFNotaInfoItemImpostoICMS51();
        icms51.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms51.setOrigem(NFOrigem.NACIONAL);
        icms51.setPercentualICMS(new BigDecimal("99.99"));
        icms51.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms51.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms51.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms51.setPercentualDiferimento(new BigDecimal("99.9999"));
        icms51.setValorICMSDiferimento(new BigDecimal("999999999999.99"));
        icms51.setValorICMSOperacao(new BigDecimal("999999999999.99"));
        icms51.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final DFNotaInfoItemImpostoICMS51 icms51 = new DFNotaInfoItemImpostoICMS51();
        icms51.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms51.setOrigem(NFOrigem.NACIONAL);
        icms51.setPercentualICMS(new BigDecimal("99.99"));
        icms51.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms51.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms51.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms51.setValorICMS(new BigDecimal("999999999999.99"));
        icms51.setPercentualDiferimento(new BigDecimal("99.9999"));
        icms51.setValorICMSDiferimento(new BigDecimal("999999999999.99"));
        icms51.setValorICMSOperacao(new BigDecimal("999999999999.99"));

        final String xmlEsperado = "<DFNotaInfoItemImpostoICMS51><orig>0</orig><CST>40</CST><modBC>3</modBC><pRedBC>99.99</pRedBC><vBC>999999999999.99</vBC><pICMS>99.99</pICMS><vICMSOp>999999999999.99</vICMSOp><pDif>99.9999</pDif><vICMSDif>999999999999.99</vICMSDif><vICMS>999999999999.99</vICMS></DFNotaInfoItemImpostoICMS51>";
        Assert.assertEquals(xmlEsperado, icms51.toString());
    }
}