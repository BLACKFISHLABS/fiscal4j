package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

public class NFNotaInfoItemDetalheExportacaoTest {

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirNumeroAtoConcessorioDrawbackComTamanhoInvalido() {
        new DFNotaInfoItemDetalheExportacao().setNumeroAtoConcessorioDrawback(new BigInteger("100000000000"));
    }

    @Test
    public void deveObterNumeroAtoConcessorioDrawbackComoFoiSetado() {
        final DFNotaInfoItemDetalheExportacao detalheExportacao = new DFNotaInfoItemDetalheExportacao();
        final BigInteger numeroAtoConcessorioDrawback = new BigInteger("99999999999");
        detalheExportacao.setNumeroAtoConcessorioDrawback(numeroAtoConcessorioDrawback);
        Assert.assertEquals(numeroAtoConcessorioDrawback, detalheExportacao.getAtoConcessorioDrawback());
    }

    @Test
    public void deveObterExportacaoIndiretaComoFoiSetado() {
        final DFNotaInfoItemDetalheExportacao detalheExportacao = new DFNotaInfoItemDetalheExportacao();
        final DFNotaInfoItemExportacaoIndireta itemExportacaoIndireta = FabricaDeObjetosFake.getNFNotaInfoItemExportacaoIndireta();
        detalheExportacao.setExportacaoIndireta(itemExportacaoIndireta);
        Assert.assertEquals(itemExportacaoIndireta, detalheExportacao.getExportacaoIndireta());
    }

    @Test
    public void devePermitirExportacaoIndiretaNulo() {
        final DFNotaInfoItemDetalheExportacao detalheExportacao = new DFNotaInfoItemDetalheExportacao();
        detalheExportacao.setNumeroAtoConcessorioDrawback(new BigInteger("99999999999"));
        detalheExportacao.toString();
    }

    @Test
    public void devePermitirNumeroAtoConcessorioDrawbackNulo() {
        final DFNotaInfoItemDetalheExportacao detalheExportacao = new DFNotaInfoItemDetalheExportacao();
        detalheExportacao.setExportacaoIndireta(FabricaDeObjetosFake.getNFNotaInfoItemExportacaoIndireta());
        detalheExportacao.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final DFNotaInfoItemDetalheExportacao detalheExportacao = new DFNotaInfoItemDetalheExportacao();
        detalheExportacao.setExportacaoIndireta(FabricaDeObjetosFake.getNFNotaInfoItemExportacaoIndireta());
        detalheExportacao.setNumeroAtoConcessorioDrawback(new BigInteger("99999999999"));

        final String xmlEsperado = "<DFNotaInfoItemDetalheExportacao><nDraw>99999999999</nDraw><exportInd><nRE>999999999999</nRE><chNFe>99921995966146649003423495876439081543214139</chNFe><qExport>9999999999.9999</qExport></exportInd></DFNotaInfoItemDetalheExportacao>";
        Assert.assertEquals(xmlEsperado, detalheExportacao.toString());
    }
}