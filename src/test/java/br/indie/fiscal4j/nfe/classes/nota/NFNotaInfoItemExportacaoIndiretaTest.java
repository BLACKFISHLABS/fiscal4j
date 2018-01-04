package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NFNotaInfoItemExportacaoIndiretaTest {

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirNumeroRegistroExportacaoComTamanhoInvalido() {
        new DFNotaInfoItemExportacaoIndireta().setNumeroRegistroExportacao(new BigInteger("1000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirQuantidadeIemEfetivamenteExportadoComTamanhoInvalido() {
        new DFNotaInfoItemExportacaoIndireta().setQuantidadeItemEfetivamenteExportado(new BigDecimal("100000000000"));
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirChaveAcessoNFeNulo() {
        final DFNotaInfoItemExportacaoIndireta exportacaoIndireta = new DFNotaInfoItemExportacaoIndireta();
        exportacaoIndireta.setNumeroRegistroExportacao(new BigInteger("999999999999"));
        exportacaoIndireta.setQuantidadeItemEfetivamenteExportado(new BigDecimal("9999999999.9999"));
        exportacaoIndireta.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNumeroRegistroExportacaoNulo() {
        final DFNotaInfoItemExportacaoIndireta exportacaoIndireta = new DFNotaInfoItemExportacaoIndireta();
        exportacaoIndireta.setChaveAcessoNFe("99921995966146649003423495876439081543214139");
        exportacaoIndireta.setQuantidadeItemEfetivamenteExportado(new BigDecimal("9999999999.9999"));
        exportacaoIndireta.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirQuantidadeItemEfetivamenteExportadoNulo() {
        final DFNotaInfoItemExportacaoIndireta exportacaoIndireta = new DFNotaInfoItemExportacaoIndireta();
        exportacaoIndireta.setChaveAcessoNFe("99921995966146649003423495876439081543214139");
        exportacaoIndireta.setNumeroRegistroExportacao(new BigInteger("999999999999"));
        exportacaoIndireta.toString();
    }

    @Test
    public void deveObterChaveAcessoNFeComoFoiSetado() {
        final DFNotaInfoItemExportacaoIndireta exportacaoIndireta = new DFNotaInfoItemExportacaoIndireta();
        final String chaveAcessoNFe = "99921995966146649003423495876439081543214139";
        exportacaoIndireta.setChaveAcessoNFe(chaveAcessoNFe);
        Assert.assertEquals(chaveAcessoNFe, exportacaoIndireta.getChaveAcessoNFe());
    }

    @Test
    public void deveObterNumeroRegistroExportacaoComoFoiSetado() {
        final DFNotaInfoItemExportacaoIndireta exportacaoIndireta = new DFNotaInfoItemExportacaoIndireta();
        final BigInteger numeroRegistroExportacao = new BigInteger("999999999999");
        exportacaoIndireta.setNumeroRegistroExportacao(numeroRegistroExportacao);
        Assert.assertEquals(numeroRegistroExportacao, exportacaoIndireta.getNumeroRegistroExportacao());
    }

    @Test
    public void deveObterQuantidadeItemEfetivamenteExportadoComoFoiSetado() {
        final DFNotaInfoItemExportacaoIndireta exportacaoIndireta = new DFNotaInfoItemExportacaoIndireta();
        final String quantidadeItemEfetivamenteExportado = "9999999999.9999";
        exportacaoIndireta.setQuantidadeItemEfetivamenteExportado(new BigDecimal(quantidadeItemEfetivamenteExportado));
        Assert.assertEquals(quantidadeItemEfetivamenteExportado, exportacaoIndireta.getQuantidadeItemEfetivamenteExportado());
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecidoComVagao() {
        final String xmlEsperado = "<DFNotaInfoItemExportacaoIndireta><nRE>999999999999</nRE><chNFe>99921995966146649003423495876439081543214139</chNFe><qExport>9999999999.9999</qExport></DFNotaInfoItemExportacaoIndireta>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoItemExportacaoIndireta().toString());
    }
}