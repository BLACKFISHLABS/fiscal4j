package br.indie.fiscal4j.nfe.classes.nota;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFInformacaoImpostoDevolvidoTest {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorIPINulo() {
        new NFInformacaoImpostoDevolvido().toString();
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorIPIInvalido() {
        final NFInformacaoImpostoDevolvido informacaoImpostoDevolvido = new NFInformacaoImpostoDevolvido();
        informacaoImpostoDevolvido.setValorIPIDevolvido(new BigDecimal("10000000000000.00"));
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final NFInformacaoImpostoDevolvido informacaoImpostoDevolvido = new NFInformacaoImpostoDevolvido();
        informacaoImpostoDevolvido.setValorIPIDevolvido(new BigDecimal("9999999999999.99"));

        final String xmlEsperado = "<NFInformacaoImpostoDevolvido><vIPIDevol>9999999999999.99</vIPIDevol></NFInformacaoImpostoDevolvido>";
        Assert.assertEquals(xmlEsperado, informacaoImpostoDevolvido.toString());
    }
}