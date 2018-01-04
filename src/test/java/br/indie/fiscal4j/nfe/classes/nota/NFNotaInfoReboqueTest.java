package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import br.indie.fiscal4j.common.DFUnidadeFederativa;
import org.junit.Assert;
import org.junit.Test;

public class NFNotaInfoReboqueTest {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPlacaVeiculoInvalido() {
        try {
            new DFNotaInfoReboque().setPlacaVeiculo("");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
            new DFNotaInfoReboque().setPlacaVeiculo("MKZY0123");
        }
        Assert.fail("Validacao nao funcionou");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirUFNulo() {
        final DFNotaInfoReboque reboque = new DFNotaInfoReboque();
        reboque.setPlacaVeiculo("MKZ4891");
        reboque.setRegistroNacionalTransportadorCarga("8fFAKefiBQIDTkCCSQk3");
        reboque.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPlacaNulo() {
        final DFNotaInfoReboque reboque = new DFNotaInfoReboque();
        reboque.setUf(DFUnidadeFederativa.SC);
        reboque.setRegistroNacionalTransportadorCarga("8fFAKefiBQIDTkCCSQk3");
        reboque.toString();
    }

    @Test
    public void devePermitirRegistroNacionaltransportadorCargaNulo() {
        final DFNotaInfoReboque reboque = new DFNotaInfoReboque();
        reboque.setPlacaVeiculo("MKZ4891");
        reboque.setUf(DFUnidadeFederativa.SC);
        reboque.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecidoComRNTC() {
        final DFNotaInfoReboque reboque = new DFNotaInfoReboque();
        reboque.setPlacaVeiculo("MKZ4891");
        reboque.setUf(DFUnidadeFederativa.SC);
        reboque.setRegistroNacionalTransportadorCarga("8fFAKefiBQIDTkCCSQk3");

        final String xmlEsperado = "<DFNotaInfoReboque><placa>MKZ4891</placa><UF>SC</UF><RNTC>8fFAKefiBQIDTkCCSQk3</RNTC></DFNotaInfoReboque>";
        Assert.assertEquals(xmlEsperado, reboque.toString());
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecidoComVagao() {
        final String xmlEsperado = "<DFNotaInfoReboque><placa>MKZ4891</placa><UF>SC</UF></DFNotaInfoReboque>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoReboque().toString());
    }
}