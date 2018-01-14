package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import br.indie.fiscal4j.common.DFUnidadeFederativa;
import org.junit.Assert;
import org.junit.Test;

public class NFNotaInfoReboqueTest {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPlacaVeiculoInvalido() {
        try {
            new NFNotaInfoReboque().setPlacaVeiculo("");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
            new NFNotaInfoReboque().setPlacaVeiculo("MKZY0123");
        }
        Assert.fail("Validacao nao funcionou");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirUFNulo() {
        final NFNotaInfoReboque reboque = new NFNotaInfoReboque();
        reboque.setPlacaVeiculo("MKZ4891");
        reboque.setRegistroNacionalTransportadorCarga("8fFAKefiBQIDTkCCSQk3");
        reboque.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPlacaNulo() {
        final NFNotaInfoReboque reboque = new NFNotaInfoReboque();
        reboque.setUf(DFUnidadeFederativa.SC);
        reboque.setRegistroNacionalTransportadorCarga("8fFAKefiBQIDTkCCSQk3");
        reboque.toString();
    }

    @Test
    public void devePermitirRegistroNacionaltransportadorCargaNulo() {
        final NFNotaInfoReboque reboque = new NFNotaInfoReboque();
        reboque.setPlacaVeiculo("MKZ4891");
        reboque.setUf(DFUnidadeFederativa.SC);
        reboque.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecidoComRNTC() {
        final NFNotaInfoReboque reboque = new NFNotaInfoReboque();
        reboque.setPlacaVeiculo("MKZ4891");
        reboque.setUf(DFUnidadeFederativa.SC);
        reboque.setRegistroNacionalTransportadorCarga("8fFAKefiBQIDTkCCSQk3");

        final String xmlEsperado = "<NFNotaInfoReboque><placa>MKZ4891</placa><UF>SC</UF><RNTC>8fFAKefiBQIDTkCCSQk3</RNTC></NFNotaInfoReboque>";
        Assert.assertEquals(xmlEsperado, reboque.toString());
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecidoComVagao() {
        final String xmlEsperado = "<NFNotaInfoReboque><placa>MKZ4891</placa><UF>SC</UF></NFNotaInfoReboque>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoReboque().toString());
    }
}