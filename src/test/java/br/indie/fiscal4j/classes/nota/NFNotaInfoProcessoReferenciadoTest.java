package br.indie.fiscal4j.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import br.indie.fiscal4j.classes.NFOrigemProcesso;
import org.junit.Assert;
import org.junit.Test;

public class NFNotaInfoProcessoReferenciadoTest {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirIdentificadorProcessoOuAtoConcessorioComTamanhoNaoPermitido() {
        try {
            new NFNotaInfoProcessoReferenciado().setIdentificadorProcessoOuAtoConcessorio("");
            Assert.fail("Validacao nao esta funcionando corretamente");
        } catch (final IllegalStateException e) {
            new NFNotaInfoProcessoReferenciado().setIdentificadorProcessoOuAtoConcessorio("SziSRSIRZvYWlxcbmmJfRZsLgVHaHTurUL9ea1kwFe7fssrxTVSK6uaFwGO51");
        }
        Assert.fail("Validacao nao esta funcionando corretamente");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirIdentificadorProcessoOuAtoConcessorioNulo() {
        final NFNotaInfoProcessoReferenciado processoReferenciado = new NFNotaInfoProcessoReferenciado();
        processoReferenciado.setIdentificadorProcessoOuAtoConcessorio("SziSRSIRZvYWlxcbmmJfRZsLgVHaHTurUL9ea1kwFe7fssrxTVSK6uaFwGO5");
        processoReferenciado.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirIndicadorOrigemProcessoNulo() {
        final NFNotaInfoProcessoReferenciado processoReferenciado = new NFNotaInfoProcessoReferenciado();
        processoReferenciado.setIndicadorOrigemProcesso(NFOrigemProcesso.JUSTICA_FEDERAL);
        processoReferenciado.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEspeardo = "<NFNotaInfoProcessoReferenciado><nProc>SziSRSIRZvYWlxcbmmJfRZsLgVHaHTurUL9ea1kwFe7fssrxTVSK6uaFwGO5</nProc><indProc>1</indProc></NFNotaInfoProcessoReferenciado>";
        Assert.assertEquals(xmlEspeardo, FabricaDeObjetosFake.getNFNotaInfoProcessoReferenciado().toString());
    }
}