package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import br.indie.fiscal4j.common.DFUnidadeFederativa;
import org.junit.Assert;
import org.junit.Test;

public class NFNotaInfoVeiculoTest {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPlacaFormatoInvalido() {
        try {
            new DFNotaInfoVeiculo().setPlacaVeiculo("MK881");
            Assert.fail("Validacao nao funfou");
        } catch (final IllegalStateException e) {
            new DFNotaInfoVeiculo().setPlacaVeiculo("MKZT8859");
        }
        Assert.fail("Validacao nao funfou");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirRNCTComTamanhoInvalido() {
        try {
            new DFNotaInfoVeiculo().setRegistroNacionalTransportadorCarga("");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
            new DFNotaInfoVeiculo().setRegistroNacionalTransportadorCarga("8Io5YKSKW1qy3v7zGwLx1");
        }
        Assert.fail("Validacao nao funcionou");
    }

    @Test
    public void devePermitirRNCTNulo() {
        final DFNotaInfoVeiculo veiculo = new DFNotaInfoVeiculo();
        veiculo.setPlacaVeiculo("MKZ8159");
        veiculo.setUf(DFUnidadeFederativa.SP);
        veiculo.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirUFNulo() {
        final DFNotaInfoVeiculo veiculo = new DFNotaInfoVeiculo();
        veiculo.setPlacaVeiculo("MKZ8159");
        veiculo.setRegistroNacionalTransportadorCarga("8Io5YKSKW1qy3v7zGwLx");
        veiculo.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPlacaNulo() {
        final DFNotaInfoVeiculo veiculo = new DFNotaInfoVeiculo();
        veiculo.setRegistroNacionalTransportadorCarga("8Io5YKSKW1qy3v7zGwLx");
        veiculo.setUf(DFUnidadeFederativa.SP);
        veiculo.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEspeardo = "<DFNotaInfoVeiculo><placa>MKZ8159</placa><UF>SP</UF><RNTC>8Io5YKSKW1qy3v7zGwLx</RNTC></DFNotaInfoVeiculo>";
        Assert.assertEquals(xmlEspeardo, FabricaDeObjetosFake.getNFNotaInfoVeiculo().toString());
    }
}