package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.nfe.classes.NFNotaInfoSituacaoTributariaIPI;
import org.junit.Assert;
import org.junit.Test;

public class NFNotaInfoItemImpostoIPINTTest {

    @Test
    public void deveObterNFNotaInfoSituacaoTributariaIPIComoFoiSetado() {
        final DFNotaInfoItemImpostoIPINT itemImpostoIPINT = new DFNotaInfoItemImpostoIPINT();
        final NFNotaInfoSituacaoTributariaIPI entradaIsenta = NFNotaInfoSituacaoTributariaIPI.ENTRADA_ISENTA;
        itemImpostoIPINT.setSituacaoTributariaIPI(entradaIsenta);
        Assert.assertEquals(entradaIsenta, itemImpostoIPINT.getSituacaoTributariaIPI());
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final DFNotaInfoItemImpostoIPINT itemImpostoIPINT = new DFNotaInfoItemImpostoIPINT();
        itemImpostoIPINT.setSituacaoTributariaIPI(NFNotaInfoSituacaoTributariaIPI.ENTRADA_ISENTA);

        final String xmlEsperado = "<DFNotaInfoItemImpostoIPINT><IPINT>02</IPINT></DFNotaInfoItemImpostoIPINT>";
        Assert.assertEquals(xmlEsperado, itemImpostoIPINT.toString());
    }
}