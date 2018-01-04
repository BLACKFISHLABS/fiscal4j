package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import org.junit.Assert;
import org.junit.Test;

public class NFNotaInfoCanaFornecimentoDiarioTest {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirDiaAcima31() {
        new DFNotaInfoCanaFornecimentoDiario().setDia(32);
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirDiaMenor1() {
        new DFNotaInfoCanaFornecimentoDiario().setDia(0);
    }

    @Test
    public void devePermitirDiaValido() {
        new DFNotaInfoCanaFornecimentoDiario().setDia(1);
        new DFNotaInfoCanaFornecimentoDiario().setDia(30);
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirQuantidadeNulo() {
        final DFNotaInfoCanaFornecimentoDiario canaFornecimentoDiario = new DFNotaInfoCanaFornecimentoDiario();
        canaFornecimentoDiario.setDia(15);
        canaFornecimentoDiario.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<DFNotaInfoCanaFornecimentoDiario dia=\"15\"><qtde>3</qtde></DFNotaInfoCanaFornecimentoDiario>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoCanaFornecimentoDiario().toString());
    }
}