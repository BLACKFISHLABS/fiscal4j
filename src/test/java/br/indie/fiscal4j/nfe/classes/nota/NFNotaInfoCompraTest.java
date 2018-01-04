package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import org.junit.Assert;
import org.junit.Test;

public class NFNotaInfoCompraTest {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPedidoComTamanhoNaoPermitido() {
        try {
            new DFNotaInfoCompra().setPedido("");
            Assert.fail("Validacao nao esta funcionando corretamente");
        } catch (final IllegalStateException e) {
            new DFNotaInfoCompra().setPedido("9tQtearTIcXmO9vxNr3TPhSaItw5mk3zyTVlf2aIFXqqvtXrHoa0qPWKzUzca");
        }
        Assert.fail("Validacao nao esta funcionando corretamente");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNotaDeEmpenhoComTamanhoNaoPermitido() {
        try {
            new DFNotaInfoCompra().setNotaDeEmpenho("");
            Assert.fail("Validacao nao esta funcionando corretamente");
        } catch (final IllegalStateException e) {
            new DFNotaInfoCompra().setNotaDeEmpenho("uCJhbWe0g8OQ8KtSKlkXpRC");
        }
        Assert.fail("Validacao nao esta funcionando corretamente");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirContratoComTamanhoNaoPermitido() {
        try {
            new DFNotaInfoCompra().setContrato("");
            Assert.fail("Validacao nao esta funcionando corretamente");
        } catch (final IllegalStateException e) {
            new DFNotaInfoCompra().setContrato("9tQtearTIcXmO9vxNr3TPhSaItw5mk3zyTVlf2aIFXqqvtXrHoa0qPWKzUzca");
        }
        Assert.fail("Validacao nao esta funcionando corretamente");
    }

    @Test
    public void deveGerarXMLSemContrato() {
        final DFNotaInfoCompra compra = new DFNotaInfoCompra();
        compra.setNotaDeEmpenho("abcefghijklmnopqrstuvx");
        compra.setPedido("1kG8gghJ0YTrUZnt00BJlOsFCtj43eV5mEHHXUzp3rD6QwwUwX4GPavXkMB1");
        compra.toString();
    }

    @Test
    public void deveGerarXMLSemPedido() {
        final DFNotaInfoCompra compra = new DFNotaInfoCompra();
        compra.setContrato("9tQtearTIcXmO9vxNr3TPhSaItw5mk3zyTVlf2aIFXqqvtXrHoa0qPWKzUzc");
        compra.setNotaDeEmpenho("abcefghijklmnopqrstuvx");
        compra.toString();
    }

    @Test
    public void deveGerarXMLSemNotaDeEmpenho() {
        final DFNotaInfoCompra compra = new DFNotaInfoCompra();
        compra.setContrato("9tQtearTIcXmO9vxNr3TPhSaItw5mk3zyTVlf2aIFXqqvtXrHoa0qPWKzUzc");
        compra.setPedido("1kG8gghJ0YTrUZnt00BJlOsFCtj43eV5mEHHXUzp3rD6QwwUwX4GPavXkMB1");
        compra.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<DFNotaInfoCompra><xNEmp>abcefghijklmnopqrstuvx</xNEmp><xPed>1kG8gghJ0YTrUZnt00BJlOsFCtj43eV5mEHHXUzp3rD6QwwUwX4GPavXkMB1</xPed><xCont>9tQtearTIcXmO9vxNr3TPhSaItw5mk3zyTVlf2aIFXqqvtXrHoa0qPWKzUzc</xCont></DFNotaInfoCompra>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoCompra().toString());
    }
}