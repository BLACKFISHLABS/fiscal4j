package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

public class NFNotaInfoItemImpostoIPITest {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirClasseEnquadramentoTamanhoInvalido() {
        new DFNotaInfoItemImpostoIPI().setClasseEnquadramento("NEFiL1");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCodigoEnquadramentoTamanhoInvalido() {
        new DFNotaInfoItemImpostoIPI().setCodigoEnquadramento("iNEF");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCodigoSeloTamanhoInvalido() {
        new DFNotaInfoItemImpostoIPI().setCodigoSelo("iNEFifS1jexTxcCvgjlQ186nR6JAwM2koyjbWKA1DJSLmZy432GoSwoygXc51");
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirQuantidadeSeloTamanhoInvalido() {
        new DFNotaInfoItemImpostoIPI().setQuantidadeSelo(new BigInteger("1000000000000"));
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirSetarNaoTributadoCasoTributadoEstejaSetado() {
        final DFNotaInfoItemImpostoIPI impostoIPI = new DFNotaInfoItemImpostoIPI();
        impostoIPI.setTributado(FabricaDeObjetosFake.getNFNotaInfoItemImpostoIPITributado());
        impostoIPI.setNaoTributado(FabricaDeObjetosFake.getNFNotaInfoItemImpostoIPINaoTributado());
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirSetarTributadoCasoNaoTributadoEstejaSetado() {
        final DFNotaInfoItemImpostoIPI impostoIPI = new DFNotaInfoItemImpostoIPI();
        impostoIPI.setNaoTributado(FabricaDeObjetosFake.getNFNotaInfoItemImpostoIPINaoTributado());
        impostoIPI.setTributado(FabricaDeObjetosFake.getNFNotaInfoItemImpostoIPITributado());
    }

    @Test
    public void devePermitirClasseEnquadramentoNulo() {
        final DFNotaInfoItemImpostoIPI ipi = new DFNotaInfoItemImpostoIPI();
        ipi.setCnpjProdutor("12345678901234");
        ipi.setCodigoEnquadramento("aT2");
        ipi.setCodigoSelo("iNEFifS1jexTxcCvgjlQ186nR6JAwM2koyjbWKA1DJSLmZy432GoSwoygXc5");
        ipi.setNaoTributado(FabricaDeObjetosFake.getNFNotaInfoItemImpostoIPINaoTributado());
        ipi.setQuantidadeSelo(new BigInteger("999999999999"));
        ipi.toString();
    }

    @Test
    public void devePermitirCnojProdutorNulo() {
        final DFNotaInfoItemImpostoIPI ipi = new DFNotaInfoItemImpostoIPI();
        ipi.setClasseEnquadramento("157br");
        ipi.setCodigoEnquadramento("aT2");
        ipi.setCodigoSelo("iNEFifS1jexTxcCvgjlQ186nR6JAwM2koyjbWKA1DJSLmZy432GoSwoygXc5");
        ipi.setQuantidadeSelo(new BigInteger("999999999999"));
        ipi.setTributado(FabricaDeObjetosFake.getNFNotaInfoItemImpostoIPITributado());
        ipi.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCodigoEnquadramentoNulo() {
        final DFNotaInfoItemImpostoIPI ipi = new DFNotaInfoItemImpostoIPI();
        ipi.setClasseEnquadramento("157br");
        ipi.setCnpjProdutor("12345678901234");
        ipi.setCodigoSelo("iNEFifS1jexTxcCvgjlQ186nR6JAwM2koyjbWKA1DJSLmZy432GoSwoygXc5");
        ipi.setNaoTributado(FabricaDeObjetosFake.getNFNotaInfoItemImpostoIPINaoTributado());
        ipi.setQuantidadeSelo(new BigInteger("999999999999"));
        ipi.setTributado(FabricaDeObjetosFake.getNFNotaInfoItemImpostoIPITributado());
        ipi.toString();
    }

    @Test
    public void devePermitirCodigoSeloNulo() {
        final DFNotaInfoItemImpostoIPI ipi = new DFNotaInfoItemImpostoIPI();
        ipi.setClasseEnquadramento("157br");
        ipi.setCnpjProdutor("12345678901234");
        ipi.setCodigoEnquadramento("aT2");
        ipi.setNaoTributado(FabricaDeObjetosFake.getNFNotaInfoItemImpostoIPINaoTributado());
        ipi.setQuantidadeSelo(new BigInteger("999999999999"));
        ipi.toString();
    }

    @Test
    public void devePermitirNaoTributadoNulo() {
        final DFNotaInfoItemImpostoIPI ipi = new DFNotaInfoItemImpostoIPI();
        ipi.setClasseEnquadramento("157br");
        ipi.setCnpjProdutor("12345678901234");
        ipi.setCodigoEnquadramento("aT2");
        ipi.setCodigoSelo("iNEFifS1jexTxcCvgjlQ186nR6JAwM2koyjbWKA1DJSLmZy432GoSwoygXc5");
        ipi.setQuantidadeSelo(new BigInteger("999999999999"));
        ipi.setTributado(FabricaDeObjetosFake.getNFNotaInfoItemImpostoIPITributado());
        ipi.toString();
    }

    @Test
    public void devePermitirQuantidadeSeloNulo() {
        final DFNotaInfoItemImpostoIPI ipi = new DFNotaInfoItemImpostoIPI();
        ipi.setClasseEnquadramento("157br");
        ipi.setCnpjProdutor("12345678901234");
        ipi.setCodigoEnquadramento("aT2");
        ipi.setCodigoSelo("iNEFifS1jexTxcCvgjlQ186nR6JAwM2koyjbWKA1DJSLmZy432GoSwoygXc5");
        ipi.setNaoTributado(FabricaDeObjetosFake.getNFNotaInfoItemImpostoIPINaoTributado());
        ipi.toString();
    }

    @Test
    public void devePermitirTributadoNulo() {
        final DFNotaInfoItemImpostoIPI ipi = new DFNotaInfoItemImpostoIPI();
        ipi.setClasseEnquadramento("157br");
        ipi.setCnpjProdutor("12345678901234");
        ipi.setCodigoEnquadramento("aT2");
        ipi.setCodigoSelo("iNEFifS1jexTxcCvgjlQ186nR6JAwM2koyjbWKA1DJSLmZy432GoSwoygXc5");
        ipi.setNaoTributado(FabricaDeObjetosFake.getNFNotaInfoItemImpostoIPINaoTributado());
        ipi.setQuantidadeSelo(new BigInteger("999999999999"));
        ipi.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<DFNotaInfoItemImpostoIPI><clEnq>157br</clEnq><CNPJProd>12345678901234</CNPJProd><cSelo>iNEFifS1jexTxcCvgjlQ186nR6JAwM2koyjbWKA1DJSLmZy432GoSwoygXc5</cSelo><qSelo>999999999999</qSelo><cEnq>aT2</cEnq><IPITrib><CST>49</CST><vBC>999999999999.99</vBC><pIPI>99.99</pIPI><vIPI>999999999999.99</vIPI></IPITrib></DFNotaInfoItemImpostoIPI>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoItemImpostoIPI().toString());
    }
}