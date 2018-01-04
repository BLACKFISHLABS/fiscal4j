package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import org.junit.Assert;
import org.junit.Test;

public class NFNotaInfoItemImpostoCOFINSTest {

    @Test
    public void devePermitirApenasUmQuantidade() {
        final DFNotaInfoItemImpostoCOFINS cofins = new DFNotaInfoItemImpostoCOFINS();
        cofins.setQuantidade(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSQuantidade());
        try {
            cofins.setAliquota(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSAliquota());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            cofins.setNaoTributavel(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSNaoTributavel());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            cofins.setOutrasOperacoes(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSOutrasOperacoes());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
    }

    @Test
    public void devePermitirApenasUmAliquota() {
        final DFNotaInfoItemImpostoCOFINS cofins = new DFNotaInfoItemImpostoCOFINS();
        cofins.setAliquota(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSAliquota());
        try {
            cofins.setQuantidade(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSQuantidade());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            cofins.setNaoTributavel(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSNaoTributavel());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            cofins.setOutrasOperacoes(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSOutrasOperacoes());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
    }

    @Test
    public void devePermitirApenasUmNaoTributavel() {
        final DFNotaInfoItemImpostoCOFINS cofins = new DFNotaInfoItemImpostoCOFINS();
        cofins.setNaoTributavel(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSNaoTributavel());
        try {
            cofins.setQuantidade(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSQuantidade());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            cofins.setAliquota(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSAliquota());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            cofins.setOutrasOperacoes(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSOutrasOperacoes());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
    }

    @Test
    public void devePermitirApenasUmOutrasOperacoes() {
        final DFNotaInfoItemImpostoCOFINS cofins = new DFNotaInfoItemImpostoCOFINS();
        cofins.setNaoTributavel(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSNaoTributavel());
        try {
            cofins.setQuantidade(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSQuantidade());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            cofins.setAliquota(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSAliquota());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            cofins.setOutrasOperacoes(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSOutrasOperacoes());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<DFNotaInfoItemImpostoCOFINS><COFINSAliq><CST>01</CST><vBC>999999999999.99</vBC><pCOFINS>99.99</pCOFINS><vCOFINS>999999999999.99</vCOFINS></COFINSAliq></DFNotaInfoItemImpostoCOFINS>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINS().toString());
    }
}