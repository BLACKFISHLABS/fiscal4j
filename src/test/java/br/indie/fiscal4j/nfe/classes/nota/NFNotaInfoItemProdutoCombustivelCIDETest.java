package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoItemProdutoCombustivelCIDETest {

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorQuantidadeBCCIDEComTamanhoInvalido() {
        new DFNotaInfoItemProdutoCombustivelCIDE().setQuantidadeBCCIDE(new BigDecimal("1000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorAliquotaComTamanhoInvalido() {
        new DFNotaInfoItemProdutoCombustivelCIDE().setValorAliquota(new BigDecimal("100000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorComTamanhoInvalido() {
        new DFNotaInfoItemProdutoCombustivelCIDE().setValor(new BigDecimal("10000000000000"));
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirQuantidadeBCCIDENulo() {
        final DFNotaInfoItemProdutoCombustivelCIDE cide = new DFNotaInfoItemProdutoCombustivelCIDE();
        cide.setValor(new BigDecimal("999999999999.99"));
        cide.setValorAliquota(new BigDecimal("9999999999.9999"));
        cide.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorNulo() {
        final DFNotaInfoItemProdutoCombustivelCIDE cide = new DFNotaInfoItemProdutoCombustivelCIDE();
        cide.setQuantidadeBCCIDE(new BigDecimal("99999999999.9999"));
        cide.setValorAliquota(new BigDecimal("9999999999.9999"));
        cide.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorAliquotaNulo() {
        final DFNotaInfoItemProdutoCombustivelCIDE cide = new DFNotaInfoItemProdutoCombustivelCIDE();
        cide.setQuantidadeBCCIDE(new BigDecimal("99999999999.9999"));
        cide.setValor(new BigDecimal("999999999999.99"));
        cide.toString();
    }

    @Test
    public void deveObterValorAliquotaComoFoiSetado() {
        final DFNotaInfoItemProdutoCombustivelCIDE cide = new DFNotaInfoItemProdutoCombustivelCIDE();
        cide.setValorAliquota(new BigDecimal("9999999999.9999"));
        Assert.assertEquals("9999999999.9999", cide.getValorAliquota());
    }

    @Test
    public void deveObterValorComoFoiSetado() {
        final DFNotaInfoItemProdutoCombustivelCIDE cide = new DFNotaInfoItemProdutoCombustivelCIDE();
        cide.setValor(new BigDecimal("999999999999.99"));
        Assert.assertEquals("999999999999.99", cide.getValor());
    }

    @Test
    public void deveObterQuantidadeBCCIDEComoFoiSetado() {
        final DFNotaInfoItemProdutoCombustivelCIDE cide = new DFNotaInfoItemProdutoCombustivelCIDE();
        cide.setQuantidadeBCCIDE(new BigDecimal("99999999999.9999"));
        Assert.assertEquals("99999999999.9999", cide.getQuantidadeBCCIDE());
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<DFNotaInfoItemProdutoCombustivelCIDE><qBCProd>99999999999.9999</qBCProd><vAliqProd>9999999999.9999</vAliqProd><vCIDE>999999999999.99</vCIDE></DFNotaInfoItemProdutoCombustivelCIDE>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoItemProdutoCombustivelCIDE().toString());
    }
}