package br.indie.fiscal4j.nfe.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class NFNotaInfoLacreTest {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNumeroLacreNulo() {
        new DFNotaInfoLacre().toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNumeroLacreComTamanhoInvalido() {
        try {
            new DFNotaInfoLacre().setNumeroLacre("");
            Assert.fail("Validacao falhou");
        } catch (final IllegalStateException e) {
            new DFNotaInfoLacre().setNumeroLacre("su0ue1tNrrSACxDPXEYVFAqtc2IsnlONmb5AIAv24XjKALlpJ8h5HpUviB3p1");
        }
        Assert.fail("Validacao falhou");
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final DFNotaInfoLacre lacre = new DFNotaInfoLacre();
        lacre.setNumeroLacre("su0ue1tNrrSACxDPXEYVFAqtc2IsnlONmb5AIAv24XjKALlpJ8h5HpUviB3p");
        final String xmlEsperado = "<DFNotaInfoLacre><nLacre>su0ue1tNrrSACxDPXEYVFAqtc2IsnlONmb5AIAv24XjKALlpJ8h5HpUviB3p</nLacre></DFNotaInfoLacre>";

        Assert.assertEquals(xmlEsperado, lacre.toString());
    }
}