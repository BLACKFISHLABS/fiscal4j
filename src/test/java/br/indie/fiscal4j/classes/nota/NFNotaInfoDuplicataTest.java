package br.indie.fiscal4j.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import org.joda.time.LocalDate;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoDuplicataTest {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNumeroDuplicataTamanhoInvalido() {
        new NFNotaInfoDuplicata().setNumeroDuplicata("TQ49cyOL5KtBAUTF0LShhThpUbtCK1fQH1PH4AMcKzMNLxyDbV957IRhWK8Z1");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorDuplicataNulo() {
        final NFNotaInfoDuplicata duplicata = new NFNotaInfoDuplicata();
        duplicata.setDataVencimento(new LocalDate(2014, 7, 10));
        duplicata.setNumeroDuplicata("TQ49cyOL5KtBAUTF0LShhThpUbtCK1fQH1PH4AMcKzMNLxyDbV957IRhWK8Z");
        duplicata.toString();
    }

    @Test
    public void devePermitirNumeroDuplicataNulo() {
        final NFNotaInfoDuplicata duplicata = new NFNotaInfoDuplicata();
        duplicata.setDataVencimento(new LocalDate(2014, 7, 10));
        duplicata.setValorDuplicata(new BigDecimal("999999.99"));
        duplicata.toString();
    }

    @Test
    public void devePermitirDataVencimentoNulo() {
        final NFNotaInfoDuplicata duplicata = new NFNotaInfoDuplicata();
        duplicata.setNumeroDuplicata("TQ49cyOL5KtBAUTF0LShhThpUbtCK1fQH1PH4AMcKzMNLxyDbV957IRhWK8Z");
        duplicata.setValorDuplicata(new BigDecimal("999999.99"));
        duplicata.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<NFNotaInfoDuplicata><nDup>TQ49cyOL5KtBAUTF0LShhThpUbtCK1fQH1PH4AMcKzMNLxyDbV957IRhWK8Z</nDup><dVenc>2014-07-10</dVenc><vDup>999999.99</vDup></NFNotaInfoDuplicata>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoDuplicata().toString());
    }
}