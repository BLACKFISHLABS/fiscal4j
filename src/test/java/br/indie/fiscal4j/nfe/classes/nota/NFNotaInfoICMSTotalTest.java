package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoICMSTotalTest {

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorTotalTributosInvalido() {
        new DFNotaInfoICMSTotal().setValorTotalTributos(new BigDecimal("1000000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorTotalSeguroInvalidoMonetario() {
        new DFNotaInfoICMSTotal().setValorTotalSeguro(new BigDecimal("1000000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorTotalNFeInvalidoMonetario() {
        new DFNotaInfoICMSTotal().setValorTotalNFe(new BigDecimal("1000000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorTotalIPIInvalidoMonetario() {
        new DFNotaInfoICMSTotal().setValorTotalIPI(new BigDecimal("1000000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorTotalIIInvalidoMonetario() {
        new DFNotaInfoICMSTotal().setValorTotalII(new BigDecimal("1000000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorTotalICMSSTInvalidoMonetario() {
        new DFNotaInfoICMSTotal().setValorTotalICMSST(new BigDecimal("1000000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorTotalICMSInvalidoMonetario() {
        new DFNotaInfoICMSTotal().setValorTotalICMS(new BigDecimal("1000000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorTotalFreteInvalidoMonetario() {
        new DFNotaInfoICMSTotal().setValorTotalFrete(new BigDecimal("1000000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorTotalDosProdutosServicosInvalidoMonetario() {
        new DFNotaInfoICMSTotal().setValorTotalDosProdutosServicos(new BigDecimal("1000000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorTotalDescontoInvalidoMonetario() {
        new DFNotaInfoICMSTotal().setValorTotalDesconto(new BigDecimal("1000000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorPISInvalidoMonetario() {
        new DFNotaInfoICMSTotal().setValorPIS(new BigDecimal("1000000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorCOFINSInvalidoMonetario() {
        new DFNotaInfoICMSTotal().setValorCOFINS(new BigDecimal("1000000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorInvalidoMonetario() {
        new DFNotaInfoICMSTotal().setBaseCalculoICMSST(new BigDecimal("1000000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirOutrasDespesasAcessoriasInvalidoMonetario() {
        new DFNotaInfoICMSTotal().setOutrasDespesasAcessorias(new BigDecimal("1000000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirBaseCalculoICMSInvalidoMonetario() {
        new DFNotaInfoICMSTotal().setBaseCalculoICMS(new BigDecimal("1000000000000000"));
    }

    @Test
    public void devePermitirValorICMSDesoneradoNulo() {
        final DFNotaInfoICMSTotal icmsTotal = new DFNotaInfoICMSTotal();
        icmsTotal.setBaseCalculoICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        icmsTotal.setBaseCalculoICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorCOFINS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorPIS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDesconto(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDosProdutosServicos(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalFrete(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalII(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalIPI(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalNFe(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalSeguro(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSDesonerado(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalTributos(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSFundoCombatePobreza(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaDestinatario(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaRementente(new BigDecimal("999999999999.99"));
        icmsTotal.toString();
    }

    @Test
    public void devePermitirValorTotalTributosNulo() {
        final DFNotaInfoICMSTotal icmsTotal = new DFNotaInfoICMSTotal();
        icmsTotal.setBaseCalculoICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        icmsTotal.setBaseCalculoICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorCOFINS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorPIS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDesconto(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDosProdutosServicos(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalFrete(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalII(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalIPI(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalNFe(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalSeguro(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSDesonerado(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSFundoCombatePobreza(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaDestinatario(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaRementente(new BigDecimal("999999999999.99"));
        icmsTotal.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirBaseCalculoICMSNulo() {
        final DFNotaInfoICMSTotal icmsTotal = new DFNotaInfoICMSTotal();
        icmsTotal.setOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        icmsTotal.setBaseCalculoICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorCOFINS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorPIS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDesconto(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDosProdutosServicos(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalFrete(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalII(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalIPI(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalNFe(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalSeguro(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalTributos(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSDesonerado(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSFundoCombatePobreza(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaDestinatario(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaRementente(new BigDecimal("999999999999.99"));
        icmsTotal.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirOutrasDespesasAcessoriasNulo() {
        final DFNotaInfoICMSTotal icmsTotal = new DFNotaInfoICMSTotal();
        icmsTotal.setBaseCalculoICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setBaseCalculoICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorCOFINS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorPIS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDesconto(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDosProdutosServicos(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalFrete(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalII(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalIPI(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalNFe(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalSeguro(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalTributos(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSDesonerado(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSFundoCombatePobreza(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaDestinatario(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaRementente(new BigDecimal("999999999999.99"));
        icmsTotal.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorNulo() {
        final DFNotaInfoICMSTotal icmsTotal = new DFNotaInfoICMSTotal();
        icmsTotal.setBaseCalculoICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        icmsTotal.setValorCOFINS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorPIS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDesconto(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDosProdutosServicos(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalFrete(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalII(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalIPI(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalNFe(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalSeguro(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalTributos(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSDesonerado(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSFundoCombatePobreza(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaDestinatario(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaRementente(new BigDecimal("999999999999.99"));
        icmsTotal.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCOFINSNulo() {
        final DFNotaInfoICMSTotal icmsTotal = new DFNotaInfoICMSTotal();
        icmsTotal.setBaseCalculoICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        icmsTotal.setBaseCalculoICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorPIS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDesconto(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDosProdutosServicos(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalFrete(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalII(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalIPI(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalNFe(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalSeguro(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalTributos(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSDesonerado(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSFundoCombatePobreza(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaDestinatario(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaRementente(new BigDecimal("999999999999.99"));
        icmsTotal.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirTotalPISNulo() {
        final DFNotaInfoICMSTotal icmsTotal = new DFNotaInfoICMSTotal();
        icmsTotal.setBaseCalculoICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        icmsTotal.setBaseCalculoICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorCOFINS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDesconto(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDosProdutosServicos(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalFrete(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalII(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalIPI(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalNFe(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalSeguro(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalTributos(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSDesonerado(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSFundoCombatePobreza(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaDestinatario(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaRementente(new BigDecimal("999999999999.99"));
        icmsTotal.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirTotalDescontoNulo() {
        final DFNotaInfoICMSTotal icmsTotal = new DFNotaInfoICMSTotal();
        icmsTotal.setBaseCalculoICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        icmsTotal.setBaseCalculoICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorCOFINS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorPIS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDosProdutosServicos(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalFrete(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalII(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalIPI(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalNFe(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalSeguro(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalTributos(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSDesonerado(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSFundoCombatePobreza(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaDestinatario(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaRementente(new BigDecimal("999999999999.99"));
        icmsTotal.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitrValorTotalDosProdutosServicosNulo() {
        final DFNotaInfoICMSTotal icmsTotal = new DFNotaInfoICMSTotal();
        icmsTotal.setBaseCalculoICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        icmsTotal.setBaseCalculoICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorCOFINS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorPIS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDesconto(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalFrete(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalII(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalIPI(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalNFe(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalSeguro(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalTributos(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSDesonerado(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSFundoCombatePobreza(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaDestinatario(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaRementente(new BigDecimal("999999999999.99"));
        icmsTotal.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirFreteNulo() {
        final DFNotaInfoICMSTotal icmsTotal = new DFNotaInfoICMSTotal();
        icmsTotal.setBaseCalculoICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        icmsTotal.setBaseCalculoICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorCOFINS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorPIS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDesconto(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDosProdutosServicos(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalII(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalIPI(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalNFe(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalSeguro(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalTributos(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSDesonerado(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSFundoCombatePobreza(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaDestinatario(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaRementente(new BigDecimal("999999999999.99"));
        icmsTotal.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirICMSNulo() {
        final DFNotaInfoICMSTotal icmsTotal = new DFNotaInfoICMSTotal();
        icmsTotal.setBaseCalculoICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        icmsTotal.setBaseCalculoICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorCOFINS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorPIS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDesconto(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDosProdutosServicos(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalFrete(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalII(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalIPI(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalNFe(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalSeguro(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalTributos(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSDesonerado(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSFundoCombatePobreza(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaDestinatario(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaRementente(new BigDecimal("999999999999.99"));
        icmsTotal.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirICMSSTNulo() {
        final DFNotaInfoICMSTotal icmsTotal = new DFNotaInfoICMSTotal();
        icmsTotal.setBaseCalculoICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        icmsTotal.setBaseCalculoICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorCOFINS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorPIS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDesconto(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDosProdutosServicos(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalFrete(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalII(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalIPI(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalNFe(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalSeguro(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalTributos(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSDesonerado(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSFundoCombatePobreza(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaDestinatario(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaRementente(new BigDecimal("999999999999.99"));
        icmsTotal.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorTotalIINulo() {
        final DFNotaInfoICMSTotal icmsTotal = new DFNotaInfoICMSTotal();
        icmsTotal.setBaseCalculoICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        icmsTotal.setBaseCalculoICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorCOFINS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorPIS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDesconto(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDosProdutosServicos(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalFrete(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalIPI(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalNFe(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalSeguro(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalTributos(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSDesonerado(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSFundoCombatePobreza(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaDestinatario(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaRementente(new BigDecimal("999999999999.99"));
        icmsTotal.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorTotalIPINulo() {
        final DFNotaInfoICMSTotal icmsTotal = new DFNotaInfoICMSTotal();
        icmsTotal.setBaseCalculoICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        icmsTotal.setBaseCalculoICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorCOFINS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorPIS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDesconto(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDosProdutosServicos(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalFrete(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalII(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalNFe(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalSeguro(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalTributos(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSDesonerado(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSFundoCombatePobreza(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaDestinatario(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaRementente(new BigDecimal("999999999999.99"));
        icmsTotal.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorTotalNFeNulo() {
        final DFNotaInfoICMSTotal icmsTotal = new DFNotaInfoICMSTotal();
        icmsTotal.setBaseCalculoICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        icmsTotal.setBaseCalculoICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorCOFINS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorPIS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDesconto(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDosProdutosServicos(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalFrete(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalII(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalIPI(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalSeguro(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalTributos(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSDesonerado(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSFundoCombatePobreza(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaDestinatario(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaRementente(new BigDecimal("999999999999.99"));
        icmsTotal.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorTotalSeguroNulo() {
        final DFNotaInfoICMSTotal icmsTotal = new DFNotaInfoICMSTotal();
        icmsTotal.setBaseCalculoICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        icmsTotal.setBaseCalculoICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorCOFINS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorPIS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDesconto(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDosProdutosServicos(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalFrete(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalII(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalIPI(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalNFe(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalTributos(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSDesonerado(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSFundoCombatePobreza(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaDestinatario(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaRementente(new BigDecimal("999999999999.99"));
        icmsTotal.toString();
    }

    @Test
    public void devePermitirICMSFundoCombatePobrezaNulo() {
        final DFNotaInfoICMSTotal icmsTotal = new DFNotaInfoICMSTotal();
        icmsTotal.setBaseCalculoICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        icmsTotal.setBaseCalculoICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorCOFINS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorPIS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDesconto(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDosProdutosServicos(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalFrete(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalII(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalIPI(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalNFe(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalSeguro(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSDesonerado(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaDestinatario(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaRementente(new BigDecimal("999999999999.99"));
        icmsTotal.toString();
    }

    @Test
    public void devePermitirICMSPartilhaDestinatarioNulo() {
        final DFNotaInfoICMSTotal icmsTotal = new DFNotaInfoICMSTotal();
        icmsTotal.setBaseCalculoICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        icmsTotal.setBaseCalculoICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorCOFINS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorPIS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDesconto(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDosProdutosServicos(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalFrete(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalII(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalIPI(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalNFe(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalSeguro(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSDesonerado(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSFundoCombatePobreza(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaRementente(new BigDecimal("999999999999.99"));
        icmsTotal.toString();
    }

    @Test
    public void devePermitirICMSPartilhaRemententeNulo() {
        final DFNotaInfoICMSTotal icmsTotal = new DFNotaInfoICMSTotal();
        icmsTotal.setBaseCalculoICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        icmsTotal.setBaseCalculoICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorCOFINS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorPIS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDesconto(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDosProdutosServicos(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalFrete(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalII(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalIPI(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalNFe(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalSeguro(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSDesonerado(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSFundoCombatePobreza(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaDestinatario(new BigDecimal("999999999999.99"));
        icmsTotal.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<DFNotaInfoICMSTotal><vBC>999999999999.99</vBC><vICMS>999999999999.99</vICMS><vICMSDeson>999999999999.99</vICMSDeson><vFCPUFDest>999999999999.99</vFCPUFDest><vICMSUFDest>999999999999.99</vICMSUFDest><vICMSUFRemet>999999999999.99</vICMSUFRemet><vBCST>999999999999.99</vBCST><vST>999999999999.99</vST><vProd>999999999999.99</vProd><vFrete>999999999999.99</vFrete><vSeg>999999999999.99</vSeg><vDesc>999999999999.99</vDesc><vII>999999999999.99</vII><vIPI>999999999999.99</vIPI><vPIS>999999999999.99</vPIS><vCOFINS>999999999999.99</vCOFINS><vOutro>999999999999.99</vOutro><vNF>999999999999.99</vNF></DFNotaInfoICMSTotal>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoICMSTotal().toString());
    }
}