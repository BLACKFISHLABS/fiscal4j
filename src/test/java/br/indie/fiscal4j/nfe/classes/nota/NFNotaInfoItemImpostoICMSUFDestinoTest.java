package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoICMSUFDestinoTest {

    @Test
    public void deveObterPercentualAliquotaInternaDestinoComoFoiSetado() {
        final DFNotaInfoItemImpostoICMSUFDestino icmsUFDestino = new DFNotaInfoItemImpostoICMSUFDestino();
        final String percentualAliquota = "999.9999";
        icmsUFDestino.setPercentualAliquotaInternaDestino(new BigDecimal(percentualAliquota));
        Assert.assertEquals(percentualAliquota, icmsUFDestino.getPercentualAliquotaInternaDestino());

    }

    @Test
    public void deveObterPercentualInterestadualComoFoiSetado() {
        final DFNotaInfoItemImpostoICMSUFDestino icmsUFDestino = new DFNotaInfoItemImpostoICMSUFDestino();
        final String percentualInterestadual = "999.9999";
        icmsUFDestino.setPercentualInterestadual(new BigDecimal(percentualInterestadual));
        Assert.assertEquals(percentualInterestadual, icmsUFDestino.getPercentualInterestadual());
    }

    @Test
    public void deveObterPercentualProvisorioPartilhaComoFoiSetado() {
        final DFNotaInfoItemImpostoICMSUFDestino icmsUFDestino = new DFNotaInfoItemImpostoICMSUFDestino();
        final String percentualProvisorioPartilha = "999.9999";
        icmsUFDestino.setPercentualProvisorioPartilha(new BigDecimal(percentualProvisorioPartilha));
        Assert.assertEquals(percentualProvisorioPartilha, icmsUFDestino.getPercentualProvisorioPartilha());
    }

    @Test
    public void deveObterPercentualRelativoFundoCombatePobrezaDestinoComoFoiSetado() {
        final DFNotaInfoItemImpostoICMSUFDestino icmsUFDestino = new DFNotaInfoItemImpostoICMSUFDestino();
        final String percentualRelativoFundoCombatePobrezaDestino = "999.9999";
        icmsUFDestino.setPercentualRelativoFundoCombatePobrezaDestino(new BigDecimal(percentualRelativoFundoCombatePobrezaDestino));
        Assert.assertEquals(percentualRelativoFundoCombatePobrezaDestino, icmsUFDestino.getPercentualRelativoFundoCombatePobrezaDestino());
    }

    @Test
    public void deveObterValorBaseCalculoDestinoComoFoiSetado() {
        final DFNotaInfoItemImpostoICMSUFDestino icmsUFDestino = new DFNotaInfoItemImpostoICMSUFDestino();
        final String valorBaseCalculoDestino = "9999999999999.99";
        icmsUFDestino.setValorBaseCalculoDestino(new BigDecimal(valorBaseCalculoDestino));
        Assert.assertEquals(valorBaseCalculoDestino, icmsUFDestino.getValorBaseCalculoDestino());
    }

    @Test
    public void deveObterValorICMSInterestadualDestinoComoFoiSetado() {
        final DFNotaInfoItemImpostoICMSUFDestino icmsUFDestino = new DFNotaInfoItemImpostoICMSUFDestino();
        final String valorICMSInterestadualDestino = "9999999999999.99";
        icmsUFDestino.setValorICMSInterestadualDestino(new BigDecimal(valorICMSInterestadualDestino));
        Assert.assertEquals(valorICMSInterestadualDestino, icmsUFDestino.getValorICMSInterestadualDestino());
    }

    @Test
    public void deveObterValorICMSInterestadualRemetenteComoFoiSetado() {
        final DFNotaInfoItemImpostoICMSUFDestino icmsUFDestino = new DFNotaInfoItemImpostoICMSUFDestino();
        final String valorICMSInterestadualRemetente = "9999999999999.99";
        icmsUFDestino.setValorICMSInterestadualRemetente(new BigDecimal(valorICMSInterestadualRemetente));
        Assert.assertEquals(valorICMSInterestadualRemetente, icmsUFDestino.getValorICMSInterestadualRemetente());
    }

    @Test
    public void deveObterValorRelativoFundoCombatePobrezaDestinoComoFoiSetado() {
        final DFNotaInfoItemImpostoICMSUFDestino icmsUFDestino = new DFNotaInfoItemImpostoICMSUFDestino();
        final String valorRelativoFundoCombatePobrezaDestino = "9999999999999.99";
        icmsUFDestino.setValorRelativoFundoCombatePobrezaDestino(new BigDecimal(valorRelativoFundoCombatePobrezaDestino));
        Assert.assertEquals(valorRelativoFundoCombatePobrezaDestino, icmsUFDestino.getValorRelativoFundoCombatePobrezaDestino());
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPercentualAliquotaInternaDestinoNulo() {
        final DFNotaInfoItemImpostoICMSUFDestino icmsUFDestino = new DFNotaInfoItemImpostoICMSUFDestino();
        icmsUFDestino.setPercentualInterestadual(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualProvisorioPartilha(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualRelativoFundoCombatePobrezaDestino(new BigDecimal("999.9999"));
        icmsUFDestino.setValorBaseCalculoDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualRemetente(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorRelativoFundoCombatePobrezaDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPercentualInterestadualNulo() {
        final DFNotaInfoItemImpostoICMSUFDestino icmsUFDestino = new DFNotaInfoItemImpostoICMSUFDestino();
        icmsUFDestino.setPercentualAliquotaInternaDestino(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualProvisorioPartilha(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualRelativoFundoCombatePobrezaDestino(new BigDecimal("999.9999"));
        icmsUFDestino.setValorBaseCalculoDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualRemetente(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorRelativoFundoCombatePobrezaDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPercentualProvisorioPartilhaNulo() {
        final DFNotaInfoItemImpostoICMSUFDestino icmsUFDestino = new DFNotaInfoItemImpostoICMSUFDestino();
        icmsUFDestino.setPercentualAliquotaInternaDestino(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualInterestadual(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualRelativoFundoCombatePobrezaDestino(new BigDecimal("999.9999"));
        icmsUFDestino.setValorBaseCalculoDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualRemetente(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorRelativoFundoCombatePobrezaDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPercentualRelativoFundoCombatePobrezaDestinoNulo() {
        final DFNotaInfoItemImpostoICMSUFDestino icmsUFDestino = new DFNotaInfoItemImpostoICMSUFDestino();
        icmsUFDestino.setPercentualAliquotaInternaDestino(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualInterestadual(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualProvisorioPartilha(new BigDecimal("999.9999"));
        icmsUFDestino.setValorBaseCalculoDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualRemetente(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorRelativoFundoCombatePobrezaDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorBaseCalculoDestinoNulo() {
        final DFNotaInfoItemImpostoICMSUFDestino icmsUFDestino = new DFNotaInfoItemImpostoICMSUFDestino();
        icmsUFDestino.setPercentualAliquotaInternaDestino(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualInterestadual(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualProvisorioPartilha(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualRelativoFundoCombatePobrezaDestino(new BigDecimal("999.9999"));
        icmsUFDestino.setValorICMSInterestadualDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualRemetente(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorRelativoFundoCombatePobrezaDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorICMSInterestadualDestinoNulo() {
        final DFNotaInfoItemImpostoICMSUFDestino icmsUFDestino = new DFNotaInfoItemImpostoICMSUFDestino();
        icmsUFDestino.setPercentualAliquotaInternaDestino(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualInterestadual(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualProvisorioPartilha(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualRelativoFundoCombatePobrezaDestino(new BigDecimal("999.9999"));
        icmsUFDestino.setValorBaseCalculoDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualRemetente(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorRelativoFundoCombatePobrezaDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorICMSInterestadualRemetenteNulo() {
        final DFNotaInfoItemImpostoICMSUFDestino icmsUFDestino = new DFNotaInfoItemImpostoICMSUFDestino();
        icmsUFDestino.setPercentualAliquotaInternaDestino(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualInterestadual(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualProvisorioPartilha(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualRelativoFundoCombatePobrezaDestino(new BigDecimal("999.9999"));
        icmsUFDestino.setValorBaseCalculoDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorRelativoFundoCombatePobrezaDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorRelativoFundoCombatePobrezaDestinoNulo() {
        final DFNotaInfoItemImpostoICMSUFDestino icmsUFDestino = new DFNotaInfoItemImpostoICMSUFDestino();
        icmsUFDestino.setPercentualAliquotaInternaDestino(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualInterestadual(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualProvisorioPartilha(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualRelativoFundoCombatePobrezaDestino(new BigDecimal("999.9999"));
        icmsUFDestino.setValorBaseCalculoDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualRemetente(new BigDecimal("9999999999999.99"));
        icmsUFDestino.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<DFNotaInfoItemImpostoICMSUFDestino><vBCUFDest>9999999999999.99</vBCUFDest><pFCPUFDest>999.9999</pFCPUFDest><pICMSUFDest>999.9999</pICMSUFDest><pICMSInter>7.00</pICMSInter><pICMSInterPart>999.9999</pICMSInterPart><vFCPUFDest>9999999999999.99</vFCPUFDest><vICMSUFDest>9999999999999.99</vICMSUFDest><vICMSUFRemet>9999999999999.99</vICMSUFRemet></DFNotaInfoItemImpostoICMSUFDestino>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaaInfoItemImpostoICMSUFDestino().toString());
    }
}