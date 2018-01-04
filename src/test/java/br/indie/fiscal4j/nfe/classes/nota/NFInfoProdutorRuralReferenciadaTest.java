package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.common.DFUnidadeFederativa;
import org.junit.Assert;
import org.junit.Test;

public class NFInfoProdutorRuralReferenciadaTest {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCNPJComTamanhoInvalido() {
        try {
            new DFInfoProdutorRuralReferenciada().setCnpjEmitente("1234567890123");
        } catch (final IllegalStateException e) {
            new DFInfoProdutorRuralReferenciada().setCnpjEmitente("123456789012345");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCPFComTamanhoInvalido() {
        try {
            new DFInfoProdutorRuralReferenciada().setCpfEmitente("1234567890");
        } catch (final IllegalStateException e) {
            new DFInfoProdutorRuralReferenciada().setCpfEmitente("123456789012");
        }
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirSerieDocumentoFiscalComTamanhoInvalido() {
        new DFInfoProdutorRuralReferenciada().setSerieDocumentoFiscal(1000);
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirNumeroDocumentoFiscalComTamanhoInvalido() {
        new DFInfoProdutorRuralReferenciada().setNumeroDocumentoFiscal(1000000);
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirModeloDocumentoFiscalComTamanhoInvalido() {
        try {
            new DFInfoProdutorRuralReferenciada().setModeloDocumentoFiscal("I");
        } catch (final IllegalStateException e) {
            new DFInfoProdutorRuralReferenciada().setModeloDocumentoFiscal("IE1");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCNPJSetadoQuandoCPFEstaSetado() {
        final DFInfoProdutorRuralReferenciada referenciada = new DFInfoProdutorRuralReferenciada();
        referenciada.setCpfEmitente("12345678901");
        referenciada.setCnpjEmitente("12345678901234");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCPFSetadoQuandoCNPJEstaSetado() {
        final DFInfoProdutorRuralReferenciada referenciada = new DFInfoProdutorRuralReferenciada();
        referenciada.setCnpjEmitente("12345678901234");
        referenciada.setCpfEmitente("12345678901");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirAnoMesEmissaoReferenciadaNulo() {
        final DFInfoProdutorRuralReferenciada referenciada = new DFInfoProdutorRuralReferenciada();
        referenciada.setCnpjEmitente("12345678901234");
        referenciada.setIeEmitente("ISENTO");
        referenciada.setModeloDocumentoFiscal("IE");
        referenciada.setNumeroDocumentoFiscal(999999);
        referenciada.setSerieDocumentoFiscal(999);
        referenciada.setUfEmitente(DFUnidadeFederativa.SC);
        referenciada.toString();
    }

    @Test
    public void devePermitirCpfEmitenteNulo() {
        final DFInfoProdutorRuralReferenciada referenciada = new DFInfoProdutorRuralReferenciada();
        referenciada.setAnoMesEmissao("1402");
        referenciada.setCnpjEmitente("12345678901234");
        referenciada.setIeEmitente("ISENTO");
        referenciada.setModeloDocumentoFiscal("IE");
        referenciada.setNumeroDocumentoFiscal(999999);
        referenciada.setSerieDocumentoFiscal(999);
        referenciada.setUfEmitente(DFUnidadeFederativa.SC);
        referenciada.toString();
    }

    @Test
    public void devePermitirCnpjEmitenteNulo() {
        final DFInfoProdutorRuralReferenciada referenciada = new DFInfoProdutorRuralReferenciada();
        referenciada.setAnoMesEmissao("1402");
        referenciada.setCpfEmitente("12345678901");
        referenciada.setIeEmitente("ISENTO");
        referenciada.setModeloDocumentoFiscal("IE");
        referenciada.setNumeroDocumentoFiscal(999999);
        referenciada.setSerieDocumentoFiscal(999);
        referenciada.setUfEmitente(DFUnidadeFederativa.SC);
        referenciada.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirIeEmitenteNulo() {
        final DFInfoProdutorRuralReferenciada referenciada = new DFInfoProdutorRuralReferenciada();
        referenciada.setAnoMesEmissao("1402");
        referenciada.setCnpjEmitente("12345678901234");
        referenciada.setModeloDocumentoFiscal("IE");
        referenciada.setNumeroDocumentoFiscal(999999);
        referenciada.setSerieDocumentoFiscal(999);
        referenciada.setUfEmitente(DFUnidadeFederativa.SC);
        referenciada.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirModeloDocumentoFiscalNulo() {
        final DFInfoProdutorRuralReferenciada referenciada = new DFInfoProdutorRuralReferenciada();
        referenciada.setAnoMesEmissao("1402");
        referenciada.setCnpjEmitente("12345678901234");
        referenciada.setIeEmitente("ISENTO");
        referenciada.setNumeroDocumentoFiscal(999999);
        referenciada.setSerieDocumentoFiscal(999);
        referenciada.setUfEmitente(DFUnidadeFederativa.SC);
        referenciada.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNumeroDocumentoFiscalNulo() {
        final DFInfoProdutorRuralReferenciada referenciada = new DFInfoProdutorRuralReferenciada();
        referenciada.setAnoMesEmissao("1402");
        referenciada.setCnpjEmitente("12345678901234");
        referenciada.setIeEmitente("ISENTO");
        referenciada.setModeloDocumentoFiscal("IE");
        referenciada.setSerieDocumentoFiscal(999);
        referenciada.setUfEmitente(DFUnidadeFederativa.SC);
        referenciada.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirSerieDocumentoFiscalNulo() {
        final DFInfoProdutorRuralReferenciada referenciada = new DFInfoProdutorRuralReferenciada();
        referenciada.setAnoMesEmissao("1402");
        referenciada.setCnpjEmitente("12345678901234");
        referenciada.setIeEmitente("ISENTO");
        referenciada.setModeloDocumentoFiscal("IE");
        referenciada.setNumeroDocumentoFiscal(999999);
        referenciada.setUfEmitente(DFUnidadeFederativa.SC);
        referenciada.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirUfEmitenteNulo() {
        final DFInfoProdutorRuralReferenciada referenciada = new DFInfoProdutorRuralReferenciada();
        referenciada.setAnoMesEmissao("1402");
        referenciada.setCnpjEmitente("12345678901234");
        referenciada.setIeEmitente("ISENTO");
        referenciada.setModeloDocumentoFiscal("IE");
        referenciada.setNumeroDocumentoFiscal(999999);
        referenciada.setSerieDocumentoFiscal(999);
        referenciada.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final DFInfoProdutorRuralReferenciada referenciada = new DFInfoProdutorRuralReferenciada();
        referenciada.setAnoMesEmissao("1402");
        referenciada.setCnpjEmitente("12345678901234");
        referenciada.setIeEmitente("ISENTO");
        referenciada.setModeloDocumentoFiscal("IE");
        referenciada.setNumeroDocumentoFiscal(999999);
        referenciada.setSerieDocumentoFiscal(999);
        referenciada.setUfEmitente(DFUnidadeFederativa.SC);

        final String xmlEsperado = "<DFInfoProdutorRuralReferenciada><cUF>42</cUF><AAMM>1402</AAMM><CNPJ>12345678901234</CNPJ><IE>ISENTO</IE><mod>IE</mod><serie>999</serie><nNF>999999</nNF></DFInfoProdutorRuralReferenciada>";
        Assert.assertEquals(xmlEsperado, referenciada.toString());
    }
}