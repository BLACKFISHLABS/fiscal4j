package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoPISSTTest {

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorlTributoComTamanhoInvalido() {
        new DFNotaInfoItemImpostoPISST().setValorTributo(new BigDecimal("99999999999999"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorlAliquotaComTamanhoInvalido() {
        new DFNotaInfoItemImpostoPISST().setValorAliquota(new BigDecimal("999999999999"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualAliquotaComTamanhoInvalido() {
        new DFNotaInfoItemImpostoPISST().setPercentualAliquota(new BigDecimal("1000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorBaseCalculoComTamanhoInvalido() {
        new DFNotaInfoItemImpostoPISST().setValorBaseCalculo(new BigDecimal("99999999999999"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirQuantidadeVendidaComTamanhoInvalido() {
        new DFNotaInfoItemImpostoPISST().setQuantidadeVendida(new BigDecimal("9999999999999"));
    }

    @Test
    public void naoDevePermitirSetarQuantidadeVendidaCasoPercentualAliquotaOuValorBaseCalculoEstejaSetado() {
        final DFNotaInfoItemImpostoPISST impostoPISST1 = new DFNotaInfoItemImpostoPISST();
        impostoPISST1.setValorBaseCalculo(BigDecimal.ONE);
        try {
            impostoPISST1.setQuantidadeVendida(BigDecimal.ONE);
            Assert.fail("Nao deve permitir setar percentual aliquota se valor aliquota foi setado");
        } catch (final IllegalStateException e) {
        }

        final DFNotaInfoItemImpostoPISST impostoPISST2 = new DFNotaInfoItemImpostoPISST();
        impostoPISST2.setPercentualAliquota(BigDecimal.ONE);
        try {
            impostoPISST2.setQuantidadeVendida(BigDecimal.ONE);
            Assert.fail("Nao deve permitir setar percentual aliquota se quantidade vendida foi setado");
        } catch (final IllegalStateException e) {
        }
    }

    @Test
    public void naoDevePermitirSetarValorBaseCalculoCasoValorAliquotaOuQuantidadeVendidaEstejaSetado() {
        final DFNotaInfoItemImpostoPISST impostoPISST1 = new DFNotaInfoItemImpostoPISST();
        impostoPISST1.setQuantidadeVendida(BigDecimal.ONE);
        try {
            impostoPISST1.setValorBaseCalculo(BigDecimal.ONE);
            Assert.fail("Nao deve permitir setar percentual aliquota se valor aliquota foi setado");
        } catch (final IllegalStateException e) {
        }

        final DFNotaInfoItemImpostoPISST impostoPISST2 = new DFNotaInfoItemImpostoPISST();
        impostoPISST2.setValorAliquota(BigDecimal.ONE);
        try {
            impostoPISST2.setValorBaseCalculo(BigDecimal.ONE);
            Assert.fail("Nao deve permitir setar percentual aliquota se quantidade vendida foi setado");
        } catch (final IllegalStateException e) {
        }
    }

    @Test
    public void naoDevePermitirSetarValorAliquotaCasoPercentualAliquotaOuValorBaseCalculoEstejaSetado() {
        final DFNotaInfoItemImpostoPISST impostoPISST1 = new DFNotaInfoItemImpostoPISST();
        impostoPISST1.setPercentualAliquota(BigDecimal.ONE);
        try {
            impostoPISST1.setValorAliquota(BigDecimal.ONE);
            Assert.fail("Nao deve permitir setar percentual aliquota se valor aliquota foi setado");
        } catch (final IllegalStateException e) {
        }

        final DFNotaInfoItemImpostoPISST impostoPISST2 = new DFNotaInfoItemImpostoPISST();
        impostoPISST2.setValorBaseCalculo(BigDecimal.ONE);
        try {
            impostoPISST2.setValorAliquota(BigDecimal.ONE);
            Assert.fail("Nao deve permitir setar percentual aliquota se quantidade vendida foi setado");
        } catch (final IllegalStateException e) {
        }
    }

    @Test
    public void naoDevePermitirSetarPercentualAliquotaCasoValorAliquotaOuQuantidadeVendidaEstejaSetado() {
        final DFNotaInfoItemImpostoPISST impostoPISST1 = new DFNotaInfoItemImpostoPISST();
        impostoPISST1.setValorAliquota(BigDecimal.ONE);
        try {
            impostoPISST1.setPercentualAliquota(BigDecimal.ONE);
            Assert.fail("Nao deve permitir setar percentual aliquota se valor aliquota foi setado");
        } catch (final IllegalStateException e) {
        }

        final DFNotaInfoItemImpostoPISST impostoPISST2 = new DFNotaInfoItemImpostoPISST();
        impostoPISST2.setQuantidadeVendida(BigDecimal.ONE);
        try {
            impostoPISST2.setPercentualAliquota(BigDecimal.ONE);
            Assert.fail("Nao deve permitir setar percentual aliquota se quantidade vendida foi setado");
        } catch (final IllegalStateException e) {
        }
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecidoBCAliquotaPercentual() {
        final DFNotaInfoItemImpostoPISST impostoPISST = new DFNotaInfoItemImpostoPISST();
        impostoPISST.setPercentualAliquota(new BigDecimal("99.99"));
        impostoPISST.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        impostoPISST.setValorTributo(new BigDecimal("999999999999.99"));

        final String xmlEsperado = "<DFNotaInfoItemImpostoPISST><vBC>999999999999.99</vBC><pPIS>99.99</pPIS><vPIS>999999999999.99</vPIS></DFNotaInfoItemImpostoPISST>";
        Assert.assertEquals(xmlEsperado, impostoPISST.toString());
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecidoQuantidadeVendaAliquota() {
        final String xmlEsperado = "<DFNotaInfoItemImpostoPISST><qBCProd>99999999999.9999</qBCProd><vAliqProd>9999999999.9999</vAliqProd><vPIS>999999999999.99</vPIS></DFNotaInfoItemImpostoPISST>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISST().toString());
    }
}