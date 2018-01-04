package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import org.junit.Assert;
import org.junit.Test;

public class NFInfoCupomFiscalReferenciadoTest {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirModeloDocumentoFiscalComTamanhoInvalido() {
        try {
            new DFInfoCupomFiscalReferenciado().setModeloDocumentoFiscal("J");
        } catch (final IllegalStateException e) {
            new DFInfoCupomFiscalReferenciado().setModeloDocumentoFiscal("Je1");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNumeroContadorOrdemOperacaoComTamanhoInvalido() {
        try {
            new DFInfoCupomFiscalReferenciado().setNumeroContadorOrdemOperacao("NUQvJ");
        } catch (final IllegalStateException e) {
            new DFInfoCupomFiscalReferenciado().setNumeroContadorOrdemOperacao("NUQvJH1");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNumeroOrdemSequencialECFComTamanhoInvalido() {
        try {
            new DFInfoCupomFiscalReferenciado().setNumeroOrdemSequencialECF("a7");
        } catch (final IllegalStateException e) {
            new DFInfoCupomFiscalReferenciado().setNumeroOrdemSequencialECF("a712");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirModeloDocumentoFiscalNulo() {
        final DFInfoCupomFiscalReferenciado referenciado = new DFInfoCupomFiscalReferenciado();
        referenciado.setNumeroContadorOrdemOperacao("NUQvJH");
        referenciado.setNumeroOrdemSequencialECF("a71");
        referenciado.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNumeroContadorOrdemOperacaoNulo() {
        final DFInfoCupomFiscalReferenciado referenciado = new DFInfoCupomFiscalReferenciado();
        referenciado.setModeloDocumentoFiscal("A2");
        referenciado.setNumeroOrdemSequencialECF("a71");
        referenciado.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNumeroOrdemSequencialECFNulo() {
        final DFInfoCupomFiscalReferenciado referenciado = new DFInfoCupomFiscalReferenciado();
        referenciado.setModeloDocumentoFiscal("A2");
        referenciado.setNumeroContadorOrdemOperacao("NUQvJH");
        referenciado.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<DFInfoCupomFiscalReferenciado><mod>55</mod><nECF>a71</nECF><nCOO>NUQvJH</nCOO></DFInfoCupomFiscalReferenciado>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFInfoCupomFiscalReferenciado().toString());
    }
}