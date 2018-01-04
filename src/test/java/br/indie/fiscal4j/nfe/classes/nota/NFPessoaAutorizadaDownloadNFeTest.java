package br.indie.fiscal4j.nfe.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class NFPessoaAutorizadaDownloadNFeTest {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCNPJComTamanhoInvalido() {
        try {
            new DFPessoaAutorizadaDownloadNFe().setCnpj("1234567890123");
        } catch (final IllegalStateException e) {
            new DFPessoaAutorizadaDownloadNFe().setCnpj("123456789012345");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCPFComTamanhoInvalido() {
        try {
            new DFPessoaAutorizadaDownloadNFe().setCpf("1234567890");
        } catch (final IllegalStateException e) {
            new DFPessoaAutorizadaDownloadNFe().setCpf("123456789012");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCNPJSetadoQuandoCPFEstaSetado() {
        final DFPessoaAutorizadaDownloadNFe autorizadaDownloadNFe = new DFPessoaAutorizadaDownloadNFe();
        autorizadaDownloadNFe.setCpf("12345678901");
        autorizadaDownloadNFe.setCnpj("12345678901234");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCPFSetadoQuandoCNPJEstaSetado() {
        final DFPessoaAutorizadaDownloadNFe autorizadaDownloadNFe = new DFPessoaAutorizadaDownloadNFe();
        autorizadaDownloadNFe.setCnpj("12345678901234");
        autorizadaDownloadNFe.setCpf("12345678901");
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final DFPessoaAutorizadaDownloadNFe autorizadaDownloadNFe = new DFPessoaAutorizadaDownloadNFe();
        autorizadaDownloadNFe.setCnpj("12345678901234");

        final String xmlEsperado = "<DFPessoaAutorizadaDownloadNFe><CNPJ>12345678901234</CNPJ></DFPessoaAutorizadaDownloadNFe>";
        Assert.assertEquals(xmlEsperado, autorizadaDownloadNFe.toString());
    }
}