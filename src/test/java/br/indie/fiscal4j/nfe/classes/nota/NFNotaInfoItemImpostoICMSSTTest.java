package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.nfe.classes.NFNotaInfoImpostoTributacaoICMS;
import br.indie.fiscal4j.nfe.classes.NFOrigem;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoICMSSTTest {

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorBCICMSSTRetidoUFRemetenteComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSST().setValorBCICMSSTRetidoUFRemetente(new BigDecimal("10000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorBCICMSSTUFDestinoComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSST().setValorBCICMSSTUFDestino(new BigDecimal("10000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorICMSSTRetidoUFRemetenteComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSST().setValorICMSSTRetidoUFRemetente(new BigDecimal("10000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorICMSSTUFDestinoComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSST().setValorICMSSTUFDestino(new BigDecimal("10000000000000"));
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirSituacaoTributariaNulo() {
        final DFNotaInfoItemImpostoICMSST icmsst = new DFNotaInfoItemImpostoICMSST();
        icmsst.setOrigem(NFOrigem.NACIONAL);
        icmsst.setValorBCICMSSTRetidoUFRemetente(new BigDecimal("999999999999.99"));
        icmsst.setValorBCICMSSTUFDestino(new BigDecimal("999999999999.99"));
        icmsst.setValorICMSSTRetidoUFRemetente(new BigDecimal("999999999999.99"));
        icmsst.setValorICMSSTUFDestino(new BigDecimal("999999999999.99"));
        icmsst.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirOrigemNulo() {
        final DFNotaInfoItemImpostoICMSST icmsst = new DFNotaInfoItemImpostoICMSST();
        icmsst.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.COM_REDUCAO_BASE_CALCULO);
        icmsst.setValorBCICMSSTRetidoUFRemetente(new BigDecimal("999999999999.99"));
        icmsst.setValorBCICMSSTUFDestino(new BigDecimal("999999999999.99"));
        icmsst.setValorICMSSTRetidoUFRemetente(new BigDecimal("999999999999.99"));
        icmsst.setValorICMSSTUFDestino(new BigDecimal("999999999999.99"));
        icmsst.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorBCICMSSTRetidoUFRemetenteNulo() {
        final DFNotaInfoItemImpostoICMSST icmsst = new DFNotaInfoItemImpostoICMSST();
        icmsst.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.COM_REDUCAO_BASE_CALCULO);
        icmsst.setOrigem(NFOrigem.NACIONAL);
        icmsst.setValorBCICMSSTUFDestino(new BigDecimal("999999999999.99"));
        icmsst.setValorICMSSTRetidoUFRemetente(new BigDecimal("999999999999.99"));
        icmsst.setValorICMSSTUFDestino(new BigDecimal("999999999999.99"));
        icmsst.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirBCICMSSTUFDestinoNulo() {
        final DFNotaInfoItemImpostoICMSST icmsst = new DFNotaInfoItemImpostoICMSST();
        icmsst.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.COM_REDUCAO_BASE_CALCULO);
        icmsst.setOrigem(NFOrigem.NACIONAL);
        icmsst.setValorBCICMSSTRetidoUFRemetente(new BigDecimal("999999999999.99"));
        icmsst.setValorICMSSTRetidoUFRemetente(new BigDecimal("999999999999.99"));
        icmsst.setValorICMSSTUFDestino(new BigDecimal("999999999999.99"));
        icmsst.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorICMSSTRetidoUFRemetenteNulo() {
        final DFNotaInfoItemImpostoICMSST icmsst = new DFNotaInfoItemImpostoICMSST();
        icmsst.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.COM_REDUCAO_BASE_CALCULO);
        icmsst.setOrigem(NFOrigem.NACIONAL);
        icmsst.setValorBCICMSSTRetidoUFRemetente(new BigDecimal("999999999999.99"));
        icmsst.setValorBCICMSSTUFDestino(new BigDecimal("999999999999.99"));
        icmsst.setValorICMSSTUFDestino(new BigDecimal("999999999999.99"));
        icmsst.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorICMSUFDestinoNulo() {
        final DFNotaInfoItemImpostoICMSST icmsst = new DFNotaInfoItemImpostoICMSST();
        icmsst.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.COM_REDUCAO_BASE_CALCULO);
        icmsst.setOrigem(NFOrigem.NACIONAL);
        icmsst.setValorBCICMSSTRetidoUFRemetente(new BigDecimal("999999999999.99"));
        icmsst.setValorBCICMSSTUFDestino(new BigDecimal("999999999999.99"));
        icmsst.setValorICMSSTRetidoUFRemetente(new BigDecimal("999999999999.99"));
        icmsst.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final DFNotaInfoItemImpostoICMSST icmsst = new DFNotaInfoItemImpostoICMSST();
        icmsst.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.COM_REDUCAO_BASE_CALCULO);
        icmsst.setOrigem(NFOrigem.NACIONAL);
        icmsst.setValorBCICMSSTRetidoUFRemetente(new BigDecimal("999999999999.99"));
        icmsst.setValorBCICMSSTUFDestino(new BigDecimal("999999999999.99"));
        icmsst.setValorICMSSTRetidoUFRemetente(new BigDecimal("999999999999.99"));
        icmsst.setValorICMSSTUFDestino(new BigDecimal("999999999999.99"));

        final String xmlEsperado = "<DFNotaInfoItemImpostoICMSST><orig>0</orig><CST>20</CST><vBCSTRet>999999999999.99</vBCSTRet><vICMSSTRet>999999999999.99</vICMSSTRet><vBCSTDest>999999999999.99</vBCSTDest><vICMSSTDest>999999999999.99</vICMSSTDest></DFNotaInfoItemImpostoICMSST>";
        Assert.assertEquals(xmlEsperado, icmsst.toString());
    }
}