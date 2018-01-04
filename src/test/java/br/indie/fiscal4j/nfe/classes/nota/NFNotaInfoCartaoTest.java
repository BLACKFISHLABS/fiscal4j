package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import org.junit.Assert;
import org.junit.Test;

public class NFNotaInfoCartaoTest {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNumeroAutorizacaoOperacaoCartaoComTamanhoInvalido() {
        new DFNotaInfoCartao().setNumeroAutorizacaoOperacaoCartao("9ItpS1hBk3TyhjUB3I901");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCNPJComTamanhoInvalido() {
        try {
            new DFNotaInfoCartao().setCnpj("1234567890123");
        } catch (final IllegalStateException e) {
            new DFNotaInfoCartao().setCnpj("123456789012345");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCNPJNulo() {
        final DFNotaInfoCartao cartao = new DFNotaInfoCartao();
        cartao.setNumeroAutorizacaoOperacaoCartao("9ItpS1hBk3TyhjUB3I90");
        cartao.setOperadoraCartao(NFOperadoraCartao.MASTERCARD);
        cartao.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNumeroAutorizacaoOperacaoCartaoNulo() {
        final DFNotaInfoCartao cartao = new DFNotaInfoCartao();
        cartao.setCnpj("12345678901234");
        cartao.setOperadoraCartao(NFOperadoraCartao.MASTERCARD);
        cartao.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirOperadoraCartaoNulo() {
        final DFNotaInfoCartao cartao = new DFNotaInfoCartao();
        cartao.setCnpj("12345678901234");
        cartao.setNumeroAutorizacaoOperacaoCartao("9ItpS1hBk3TyhjUB3I90");
        cartao.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<DFNotaInfoCartao><tpIntegra>1</tpIntegra><CNPJ>12345678901234</CNPJ><tBand>02</tBand><cAut>9ItpS1hBk3TyhjUB3I90</cAut></DFNotaInfoCartao>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoCartao().toString());
    }
}