package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import br.indie.fiscal4j.common.DFUnidadeFederativa;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoItemProdutoCombustivelTest {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCodigoAutorizacaoCODIFComTamanhoInvalido() {
        try {
            new DFNotaInfoItemProdutoCombustivel().setCodigoAutorizacaoCODIF("");
        } catch (final IllegalStateException e) {
            new DFNotaInfoItemProdutoCombustivel().setCodigoAutorizacaoCODIF("Cirh89sPDDbnFAzZMPpmG1");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCodigoProdutoANPComTamanhoInvalido() {
        try {
            new DFNotaInfoItemProdutoCombustivel().setCodigoProdutoANP("99999999");
        } catch (final IllegalStateException e) {
            new DFNotaInfoItemProdutoCombustivel().setCodigoProdutoANP("9999999999");
        }
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirQuantidadeComTamanhoInvalido() {
        new DFNotaInfoItemProdutoCombustivel().setQuantidade(new BigDecimal("1000000000000"));
    }

    @Test
    public void devePermitirPercentualGasNaturalNulo() {
        final DFNotaInfoItemProdutoCombustivel combustivel = new DFNotaInfoItemProdutoCombustivel();
        combustivel.setCide(FabricaDeObjetosFake.getNFNotaInfoItemProdutoCombustivelCIDE());
        combustivel.setCodigoAutorizacaoCODIF("Cirh89sPDDbnFAzZMPpmG");
        combustivel.setCodigoProdutoANP("999999999");
        combustivel.setQuantidade(new BigDecimal("99999999999.9999"));
        combustivel.setUf(DFUnidadeFederativa.AC);
        combustivel.toString();
    }

    @Test
    public void devePermitirCideNulo() {
        final DFNotaInfoItemProdutoCombustivel combustivel = new DFNotaInfoItemProdutoCombustivel();
        combustivel.setCodigoAutorizacaoCODIF("Cirh89sPDDbnFAzZMPpmG");
        combustivel.setCodigoProdutoANP("999999999");
        combustivel.setQuantidade(new BigDecimal("99999999999.9999"));
        combustivel.setUf(DFUnidadeFederativa.AC);
        combustivel.setPercentualGasNatural(new BigDecimal("99.99"));
        combustivel.toString();
    }

    @Test
    public void devePermitirCodigoAutorizacaoCODIFNulo() {
        final DFNotaInfoItemProdutoCombustivel combustivel = new DFNotaInfoItemProdutoCombustivel();
        combustivel.setCide(FabricaDeObjetosFake.getNFNotaInfoItemProdutoCombustivelCIDE());
        combustivel.setCodigoProdutoANP("999999999");
        combustivel.setQuantidade(new BigDecimal("99999999999.9999"));
        combustivel.setUf(DFUnidadeFederativa.AC);
        combustivel.setPercentualGasNatural(new BigDecimal("99.99"));
        combustivel.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCodigoProdutoANPNulo() {
        final DFNotaInfoItemProdutoCombustivel combustivel = new DFNotaInfoItemProdutoCombustivel();
        combustivel.setCide(FabricaDeObjetosFake.getNFNotaInfoItemProdutoCombustivelCIDE());
        combustivel.setCodigoAutorizacaoCODIF("Cirh89sPDDbnFAzZMPpmG");
        combustivel.setQuantidade(new BigDecimal("99999999999.9999"));
        combustivel.setUf(DFUnidadeFederativa.AC);
        combustivel.setPercentualGasNatural(new BigDecimal("99.99"));
        combustivel.toString();
    }

    @Test
    public void devePermitirQuantidadeNulo() {
        final DFNotaInfoItemProdutoCombustivel combustivel = new DFNotaInfoItemProdutoCombustivel();
        combustivel.setCide(FabricaDeObjetosFake.getNFNotaInfoItemProdutoCombustivelCIDE());
        combustivel.setCodigoAutorizacaoCODIF("Cirh89sPDDbnFAzZMPpmG");
        combustivel.setCodigoProdutoANP("999999999");
        combustivel.setUf(DFUnidadeFederativa.AC);
        combustivel.setPercentualGasNatural(new BigDecimal("99.99"));
        combustivel.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirUFNulo() {
        final DFNotaInfoItemProdutoCombustivel combustivel = new DFNotaInfoItemProdutoCombustivel();
        combustivel.setCide(FabricaDeObjetosFake.getNFNotaInfoItemProdutoCombustivelCIDE());
        combustivel.setCodigoAutorizacaoCODIF("Cirh89sPDDbnFAzZMPpmG");
        combustivel.setCodigoProdutoANP("999999999");
        combustivel.setQuantidade(new BigDecimal("99999999999.9999"));
        combustivel.setPercentualGasNatural(new BigDecimal("99.99"));
        combustivel.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<DFNotaInfoItemProdutoCombustivel><cProdANP>999999999</cProdANP><pMixGN>99.99</pMixGN><CODIF>Cirh89sPDDbnFAzZMPpmG</CODIF><qTemp>99999999999.9999</qTemp><UFCons>RS</UFCons><CIDE><qBCProd>99999999999.9999</qBCProd><vAliqProd>9999999999.9999</vAliqProd><vCIDE>999999999999.99</vCIDE></CIDE></DFNotaInfoItemProdutoCombustivel>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoItemProdutoCombustivel().toString());
    }
}