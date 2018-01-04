package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import org.junit.Assert;
import org.junit.Test;

public class NFNotaInfoObservacaoTest {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirConteudoCampoComTamanhoNaoPermitido() {
        try {
            new DFNotaInfoObservacao().setConteudoCampo("");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
            new DFNotaInfoObservacao().setConteudoCampo("ML73tIXUvsLEMijwgwjHVRfpP6upxiuipvEcQcSp8fpV402GXe3nXEHXJKJo1");
        }
        Assert.fail("Validacao nao funcionou");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirIdentificacaoCampoComTamanhoNaoPermitido() {
        try {
            new DFNotaInfoObservacao().setIdentificacaoCampo("");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
            new DFNotaInfoObservacao().setIdentificacaoCampo("kRkrK4FGWOn27RSjYjMB1");
        }
        Assert.fail("Validacao nao funcionou");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirConteudoCampoNulo() {
        final DFNotaInfoObservacao obsFisco = new DFNotaInfoObservacao();
        obsFisco.setIdentificacaoCampo("kRkrK4FGWOn27RSjYjMB");
        obsFisco.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirIdentificacaoCampoNulo() {
        final DFNotaInfoObservacao obsFisco = new DFNotaInfoObservacao();
        obsFisco.setConteudoCampo("ML73tIXUvsLEMijwgwjHVRfpP6upxiuipvEcQcSp8fpV402GXe3nXEHXJKJo");
        obsFisco.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<DFNotaInfoObservacao xCampo=\"kRkrK4FGWOn27RSjYjMB\"><xTexto>ML73tIXUvsLEMijwgwjHVRfpP6upxiuipvEcQcSp8fpV402GXe3nXEHXJKJo</xTexto></DFNotaInfoObservacao>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoObservacao().toString());
    }
}