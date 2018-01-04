package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.nfe.classes.NFNotaSituacaoOperacionalSimplesNacional;
import br.indie.fiscal4j.nfe.classes.NFOrigem;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoICMSSN500Test {

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorICMSSTRetidoTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSSN500().setValorICMSSTRetido(new BigDecimal("10000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorBCICMSSTRetidoTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSSN500().setValorBCICMSSTRetido(new BigDecimal("10000000000000"));
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirOrigemSNNulo() {
        final DFNotaInfoItemImpostoICMSSN500 icms500 = new DFNotaInfoItemImpostoICMSSN500();
        icms500.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.IMUNE);
        icms500.setValorBCICMSSTRetido(new BigDecimal("999999999999.99"));
        icms500.setValorICMSSTRetido(new BigDecimal("999999999999.99"));
        icms500.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirSituacaoOperacaoSNNulo() {
        final DFNotaInfoItemImpostoICMSSN500 icms500 = new DFNotaInfoItemImpostoICMSSN500();
        icms500.setOrigem(NFOrigem.NACIONAL);
        icms500.setValorBCICMSSTRetido(new BigDecimal("999999999999.99"));
        icms500.setValorICMSSTRetido(new BigDecimal("999999999999.99"));
        icms500.toString();
    }

    @Test
    public void devePermitirValorBCICMSSTRetidoNulo() {
        final DFNotaInfoItemImpostoICMSSN500 icms500 = new DFNotaInfoItemImpostoICMSSN500();
        icms500.setOrigem(NFOrigem.NACIONAL);
        icms500.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.IMUNE);
        icms500.setValorICMSSTRetido(new BigDecimal("999999999999.99"));
        icms500.toString();
    }

    @Test
    public void devePermitirValorICMSSTRetidoNulo() {
        final DFNotaInfoItemImpostoICMSSN500 icms500 = new DFNotaInfoItemImpostoICMSSN500();
        icms500.setOrigem(NFOrigem.NACIONAL);
        icms500.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.IMUNE);
        icms500.setValorBCICMSSTRetido(new BigDecimal("999999999999.99"));
        icms500.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final DFNotaInfoItemImpostoICMSSN500 icms500 = new DFNotaInfoItemImpostoICMSSN500();
        icms500.setOrigem(NFOrigem.NACIONAL);
        icms500.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.IMUNE);
        icms500.setValorBCICMSSTRetido(new BigDecimal("999999999999.99"));
        icms500.setValorICMSSTRetido(new BigDecimal("999999999999.99"));

        final String xmlEsperado = "<DFNotaInfoItemImpostoICMSSN500><orig>0</orig><CSOSN>300</CSOSN><vBCSTRet>999999999999.99</vBCSTRet><vICMSSTRet>999999999999.99</vICMSSTRet></DFNotaInfoItemImpostoICMSSN500>";
        Assert.assertEquals(xmlEsperado, icms500.toString());
    }
}