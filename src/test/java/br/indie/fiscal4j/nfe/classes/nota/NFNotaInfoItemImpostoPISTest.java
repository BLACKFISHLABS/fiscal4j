package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import org.junit.Assert;
import org.junit.Test;

public class NFNotaInfoItemImpostoPISTest {

    @Test
    public void devePermitirApenasUmAliquota() {
        final DFNotaInfoItemImpostoPIS pis = new DFNotaInfoItemImpostoPIS();
        pis.setAliquota(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISAliquota());

        try {
            pis.setNaoTributado(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISNaoTributado());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            pis.setOutrasOperacoes(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISOutrasOperacoes());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            pis.setQuantidade(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISQuantidade());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
    }

    @Test
    public void devePermitirApenasUmNaoTributado() {
        final DFNotaInfoItemImpostoPIS pis = new DFNotaInfoItemImpostoPIS();
        pis.setNaoTributado(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISNaoTributado());

        try {
            pis.setAliquota(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISAliquota());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            pis.setOutrasOperacoes(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISOutrasOperacoes());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            pis.setQuantidade(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISQuantidade());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
    }

    @Test
    public void devePermitirApenasUmOutrasOperacoes() {
        final DFNotaInfoItemImpostoPIS pis = new DFNotaInfoItemImpostoPIS();
        pis.setOutrasOperacoes(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISOutrasOperacoes());

        try {
            pis.setAliquota(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISAliquota());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            pis.setNaoTributado(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISNaoTributado());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            pis.setQuantidade(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISQuantidade());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
    }

    @Test
    public void devePermitirApenasUmQuantidade() {
        final DFNotaInfoItemImpostoPIS pis = new DFNotaInfoItemImpostoPIS();
        pis.setQuantidade(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISQuantidade());

        try {
            pis.setAliquota(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISAliquota());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            pis.setNaoTributado(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISNaoTributado());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            pis.setOutrasOperacoes(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISOutrasOperacoes());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<DFNotaInfoItemImpostoPIS><PISAliq><CST>01</CST><vBC>999999999999.99</vBC><pPIS>99.99</pPIS><vPIS>999999999999.99</vPIS></PISAliq></DFNotaInfoItemImpostoPIS>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoItemImpostoPIS().toString());
    }
}