package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoImportacaoTest {

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorBaseCalculoInvalido() {
        new DFNotaInfoItemImpostoImportacao().setValorBaseCalculo(new BigDecimal("99999999999999"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorDespesaAduaneiraTamanhoInvalido() {
        new DFNotaInfoItemImpostoImportacao().setValorDespesaAduaneira(new BigDecimal("99999999999999"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirImpostoImportacaoTamanhoInvalido() {
        new DFNotaInfoItemImpostoImportacao().setValorImpostoImportacao(new BigDecimal("99999999999999"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorIOFTamanhoInvalido() {
        new DFNotaInfoItemImpostoImportacao().setValorIOF(new BigDecimal("99999999999999"));
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorBaseCalculoNulo() {
        final DFNotaInfoItemImpostoImportacao importacao = new DFNotaInfoItemImpostoImportacao();
        importacao.setValorDespesaAduaneira(new BigDecimal("999999999999.99"));
        importacao.setValorImpostoImportacao(new BigDecimal("999999999999.99"));
        importacao.setValorIOF(new BigDecimal("999999999999.99"));
        importacao.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorDespesaAduaneiraNulo() {
        final DFNotaInfoItemImpostoImportacao importacao = new DFNotaInfoItemImpostoImportacao();
        importacao.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        importacao.setValorImpostoImportacao(new BigDecimal("999999999999.99"));
        importacao.setValorIOF(new BigDecimal("999999999999.99"));
        importacao.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirImpostoImportacaoNulo() {
        final DFNotaInfoItemImpostoImportacao importacao = new DFNotaInfoItemImpostoImportacao();
        importacao.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        importacao.setValorDespesaAduaneira(new BigDecimal("999999999999.99"));
        importacao.setValorIOF(new BigDecimal("999999999999.99"));
        importacao.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorIOFNulo() {
        final DFNotaInfoItemImpostoImportacao importacao = new DFNotaInfoItemImpostoImportacao();
        importacao.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        importacao.setValorDespesaAduaneira(new BigDecimal("999999999999.99"));
        importacao.setValorImpostoImportacao(new BigDecimal("999999999999.99"));
        importacao.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<DFNotaInfoItemImpostoImportacao><vBC>999999999999.99</vBC><vDespAdu>999999999999.99</vDespAdu><vII>999999999999.99</vII><vIOF>999999999999.99</vIOF></DFNotaInfoItemImpostoImportacao>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoItemImpostoImportacao().toString());
    }
}