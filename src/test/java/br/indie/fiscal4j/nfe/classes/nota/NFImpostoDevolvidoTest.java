package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFImpostoDevolvidoTest {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorIPIDevolvidoNula() {
        final DFImpostoDevolvido impostoDevolvido = new DFImpostoDevolvido();
        impostoDevolvido.setPercentualDevolucao(new BigDecimal("999.99"));
        impostoDevolvido.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPercentualDevolucaoNula() {
        final DFImpostoDevolvido impostoDevolvido = new DFImpostoDevolvido();
        impostoDevolvido.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirImportacaoPIPDevolvidaNula() {
        final DFImpostoDevolvido impostoDevolvido = new DFImpostoDevolvido();
        impostoDevolvido.setPercentualDevolucao(new BigDecimal("100"));
        impostoDevolvido.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<DFImpostoDevolvido><pDevol>100.00</pDevol><IPI><vIPIDevol>9999999999999.99</vIPIDevol></IPI></DFImpostoDevolvido>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFImpostoDevolvido().toString());
    }
}