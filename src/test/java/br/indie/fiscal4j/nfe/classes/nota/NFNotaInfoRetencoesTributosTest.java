package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoRetencoesTributosTest {

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorRetidoPISInvalidosMonetarios() {
        new DFNotaInfoRetencoesTributos().setValorRetidoPIS(new BigDecimal("1000000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorRetidoIRRFInvalidosMonetarios() {
        new DFNotaInfoRetencoesTributos().setValorRetidoIRRF(new BigDecimal("1000000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorRetidoCSLLInvalidosMonetarios() {
        new DFNotaInfoRetencoesTributos().setValorRetidoCSLL(new BigDecimal("1000000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorRetidoCOFINSInvalidosMonetarios() {
        new DFNotaInfoRetencoesTributos().setValorRetidoCOFINS(new BigDecimal("1000000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorRetencaoPrevidenciaSocialInvalidosMonetarios() {
        new DFNotaInfoRetencoesTributos().setValorRetencaoPrevidenciaSocial(new BigDecimal("1000000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirCalculoRetencaoPrevidenciaSocialInvalidosMonetarios() {
        new DFNotaInfoRetencoesTributos().setBaseCalculoRetencaoPrevidenciaSocial(new BigDecimal("1000000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirCalculoIRRFInvalidosMonetarios() {
        new DFNotaInfoRetencoesTributos().setBaseCalculoIRRF(new BigDecimal("1000000000000000"));
    }

    @Test
    public void devePermitirValoresValidosMonetarios() {
        final DFNotaInfoRetencoesTributos retencoesTributos = new DFNotaInfoRetencoesTributos();
        retencoesTributos.setBaseCalculoIRRF(new BigDecimal("999999999999.99"));
        retencoesTributos.setBaseCalculoRetencaoPrevidenciaSocial(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetencaoPrevidenciaSocial(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetidoCOFINS(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetidoCSLL(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetidoIRRF(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetidoPIS(new BigDecimal("999999999999.99"));

        retencoesTributos.setBaseCalculoIRRF(new BigDecimal("0.01"));
        retencoesTributos.setBaseCalculoRetencaoPrevidenciaSocial(new BigDecimal("1"));
        retencoesTributos.setValorRetencaoPrevidenciaSocial(new BigDecimal("1"));
        retencoesTributos.setValorRetidoCOFINS(new BigDecimal("0.01"));
        retencoesTributos.setValorRetidoCSLL(new BigDecimal("0.01"));
        retencoesTributos.setValorRetidoIRRF(new BigDecimal("0.01"));
        retencoesTributos.setValorRetidoPIS(new BigDecimal("0.1"));
    }

    @Test
    public void devePermitirBaseCalculoIRRFNulo() {
        final DFNotaInfoRetencoesTributos retencoesTributos = new DFNotaInfoRetencoesTributos();
        retencoesTributos.setBaseCalculoRetencaoPrevidenciaSocial(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetencaoPrevidenciaSocial(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetidoCOFINS(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetidoCSLL(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetidoIRRF(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetidoPIS(new BigDecimal("999999999999.99"));
        retencoesTributos.toString();
    }

    @Test
    public void devePermitirValorRetencaoPrevidenciaSocialNulo() {
        final DFNotaInfoRetencoesTributos retencoesTributos = new DFNotaInfoRetencoesTributos();
        retencoesTributos.setBaseCalculoIRRF(new BigDecimal("999999999999.99"));
        retencoesTributos.setBaseCalculoRetencaoPrevidenciaSocial(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetidoCOFINS(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetidoCSLL(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetidoIRRF(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetidoPIS(new BigDecimal("999999999999.99"));
        retencoesTributos.toString();
    }

    @Test
    public void devePermitirValorRetidoCOFINSNulo() {
        final DFNotaInfoRetencoesTributos retencoesTributos = new DFNotaInfoRetencoesTributos();
        retencoesTributos.setBaseCalculoIRRF(new BigDecimal("999999999999.99"));
        retencoesTributos.setBaseCalculoRetencaoPrevidenciaSocial(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetencaoPrevidenciaSocial(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetidoCSLL(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetidoIRRF(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetidoPIS(new BigDecimal("999999999999.99"));
        retencoesTributos.toString();
    }

    @Test
    public void devePermitirValorRetidoCSLLNulo() {
        final DFNotaInfoRetencoesTributos retencoesTributos = new DFNotaInfoRetencoesTributos();
        retencoesTributos.setBaseCalculoIRRF(new BigDecimal("999999999999.99"));
        retencoesTributos.setBaseCalculoRetencaoPrevidenciaSocial(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetencaoPrevidenciaSocial(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetidoCOFINS(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetidoIRRF(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetidoPIS(new BigDecimal("999999999999.99"));
        retencoesTributos.toString();
    }

    @Test
    public void devePermitirValorRetidoIRRFNulo() {
        final DFNotaInfoRetencoesTributos retencoesTributos = new DFNotaInfoRetencoesTributos();
        retencoesTributos.setBaseCalculoIRRF(new BigDecimal("999999999999.99"));
        retencoesTributos.setBaseCalculoRetencaoPrevidenciaSocial(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetencaoPrevidenciaSocial(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetidoCOFINS(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetidoCSLL(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetidoPIS(new BigDecimal("999999999999.99"));
        retencoesTributos.toString();
    }

    @Test
    public void devePermitirValorRetidoPISNulo() {
        final DFNotaInfoRetencoesTributos retencoesTributos = new DFNotaInfoRetencoesTributos();
        retencoesTributos.setBaseCalculoIRRF(new BigDecimal("999999999999.99"));
        retencoesTributos.setBaseCalculoRetencaoPrevidenciaSocial(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetencaoPrevidenciaSocial(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetidoCOFINS(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetidoCSLL(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetidoIRRF(new BigDecimal("999999999999.99"));
        retencoesTributos.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecidoComVagao() {
        final String xmlEsperado = "<DFNotaInfoRetencoesTributos><vRetPIS>999999999999.99</vRetPIS><vRetCOFINS>999999999999.99</vRetCOFINS><vRetCSLL>999999999999.99</vRetCSLL><vBCIRRF>999999999999.99</vBCIRRF><vIRRF>999999999999.99</vIRRF><vBCRetPrev>999999999999.99</vBCRetPrev><vRetPrev>999999999999.99</vRetPrev></DFNotaInfoRetencoesTributos>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoRetencoesTributos().toString());
    }
}