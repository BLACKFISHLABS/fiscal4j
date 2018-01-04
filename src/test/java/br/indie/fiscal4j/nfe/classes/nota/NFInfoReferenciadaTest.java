package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import org.junit.Assert;
import org.junit.Test;

public class NFInfoReferenciadaTest {

    @Test(expected = IllegalStateException.class)
    public void devePermitirSetarApenasUmChaveAcessoCTReferenciada() {
        final DFInfoReferenciada referenciada = new DFInfoReferenciada();
        referenciada.setChaveAcessoCTReferenciada("976491545426199562046180593530960051134629091");
        try {
            referenciada.setCupomFiscalReferenciado(FabricaDeObjetosFake.getNFInfoCupomFiscalReferenciado());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            referenciada.setInfoNFProdutorRuralReferenciada(FabricaDeObjetosFake.getNFInfoProdutorRuralReferenciada());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            referenciada.setChaveAcesso("97649154542619956204618059353096005113462909");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            referenciada.setModelo1por1Referenciada(FabricaDeObjetosFake.getNFInfoModelo1Por1AReferenciada());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
    }

    @Test
    public void devePermitirSetarApenasUmChaveAcesso() {
        final DFInfoReferenciada referenciada = new DFInfoReferenciada();
        referenciada.setChaveAcesso("97649154542619956204618059353096005113462909");
        try {
            referenciada.setCupomFiscalReferenciado(FabricaDeObjetosFake.getNFInfoCupomFiscalReferenciado());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            referenciada.setInfoNFProdutorRuralReferenciada(FabricaDeObjetosFake.getNFInfoProdutorRuralReferenciada());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            referenciada.setChaveAcessoCTReferenciada("976491545426199562046180593530960051134629091");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            referenciada.setModelo1por1Referenciada(FabricaDeObjetosFake.getNFInfoModelo1Por1AReferenciada());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
    }

    @Test
    public void devePermitirSetarApenasUmInfoNFProdutorRuralReferenciada() {
        final DFInfoReferenciada referenciada = new DFInfoReferenciada();
        referenciada.setInfoNFProdutorRuralReferenciada(FabricaDeObjetosFake.getNFInfoProdutorRuralReferenciada());
        try {
            referenciada.setCupomFiscalReferenciado(FabricaDeObjetosFake.getNFInfoCupomFiscalReferenciado());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            referenciada.setChaveAcesso("97649154542619956204618059353096005113462909");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            referenciada.setChaveAcessoCTReferenciada("976491545426199562046180593530960051134629091");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            referenciada.setModelo1por1Referenciada(FabricaDeObjetosFake.getNFInfoModelo1Por1AReferenciada());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
    }

    @Test
    public void devePermitirSetarApenasUmModelo1Por1Referenciada() {
        final DFInfoReferenciada referenciada = new DFInfoReferenciada();
        referenciada.setModelo1por1Referenciada(FabricaDeObjetosFake.getNFInfoModelo1Por1AReferenciada());
        try {
            referenciada.setCupomFiscalReferenciado(FabricaDeObjetosFake.getNFInfoCupomFiscalReferenciado());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            referenciada.setChaveAcesso("97649154542619956204618059353096005113462909");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            referenciada.setChaveAcessoCTReferenciada("976491545426199562046180593530960051134629091");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            referenciada.setInfoNFProdutorRuralReferenciada(FabricaDeObjetosFake.getNFInfoProdutorRuralReferenciada());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
    }

    @Test
    public void devePermitirSetarApenasUmCupomFiscalReferenciadoSetado() {
        final DFInfoReferenciada referenciada = new DFInfoReferenciada();
        referenciada.setCupomFiscalReferenciado(FabricaDeObjetosFake.getNFInfoCupomFiscalReferenciado());
        try {
            referenciada.setModelo1por1Referenciada(FabricaDeObjetosFake.getNFInfoModelo1Por1AReferenciada());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            referenciada.setChaveAcesso("97649154542619956204618059353096005113462909");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            referenciada.setChaveAcessoCTReferenciada("976491545426199562046180593530960051134629091");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            referenciada.setInfoNFProdutorRuralReferenciada(FabricaDeObjetosFake.getNFInfoProdutorRuralReferenciada());
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirChaveAcessoComTamanhoInvalido() {
        try {
            new DFInfoReferenciada().setChaveAcesso("9764915454261995620461805935309600511346290");
        } catch (final IllegalStateException e) {
            new DFInfoReferenciada().setChaveAcesso("976491545426199562046180593530960051134629091");
        }
    }

    @Test
    public void devePermitirModelo1por1ReferenciadaNulo() {
        final DFInfoReferenciada referenciada = new DFInfoReferenciada();
        referenciada.setChaveAcesso("97649154542619956204618059353096005113462909");
        referenciada.toString();
    }

    @Test
    public void devePermitirChaveAcessoNulo() {
        final DFInfoReferenciada referenciada = new DFInfoReferenciada();
        referenciada.setModelo1por1Referenciada(FabricaDeObjetosFake.getNFInfoModelo1Por1AReferenciada());
        referenciada.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final DFInfoReferenciada referenciada = new DFInfoReferenciada();
        referenciada.setModelo1por1Referenciada(FabricaDeObjetosFake.getNFInfoModelo1Por1AReferenciada());
        final String xmlEsperado = "<DFInfoReferenciada><refNF><cUF>43</cUF><AAMM>1408</AAMM><CNPJ>12345678901234</CNPJ><mod>01</mod><serie>999</serie><nNF>999999999</nNF></refNF></DFInfoReferenciada>";
        Assert.assertEquals(xmlEsperado, referenciada.toString());
    }
}