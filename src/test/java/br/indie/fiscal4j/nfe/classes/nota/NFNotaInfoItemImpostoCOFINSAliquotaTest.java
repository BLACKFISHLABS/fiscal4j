package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import br.indie.fiscal4j.nfe.classes.NFNotaInfoSituacaoTributariaCOFINS;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoCOFINSAliquotaTest {

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorTamanhoInvalido() {
        new DFNotaInfoItemImpostoCOFINSAliquota().setValor(new BigDecimal("10000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorBaseCaluloTamanhoInvalido() {
        new DFNotaInfoItemImpostoCOFINSAliquota().setValorBaseCalulo(new BigDecimal("10000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualAliquotaTamanhoInvalido() {
        new DFNotaInfoItemImpostoCOFINSAliquota().setPercentualAliquota(new BigDecimal("1000"));
    }

    @Test(expected = IllegalStateException.class)
    public void naoDeveValorBaseCalculoNulo() {
        final DFNotaInfoItemImpostoCOFINSAliquota cofinsAliquota = new DFNotaInfoItemImpostoCOFINSAliquota();
        cofinsAliquota.setPercentualAliquota(new BigDecimal("99.99"));
        cofinsAliquota.setSituacaoTributaria(NFNotaInfoSituacaoTributariaCOFINS.CREDITO_PRESUMIDO_OUTRAS_OPERACOES);
        cofinsAliquota.setValor(new BigDecimal("999999999999.99"));
        cofinsAliquota.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDeveValorAliquotaNulo() {
        final DFNotaInfoItemImpostoCOFINSAliquota cofinsAliquota = new DFNotaInfoItemImpostoCOFINSAliquota();
        cofinsAliquota.setPercentualAliquota(new BigDecimal("99.99"));
        cofinsAliquota.setSituacaoTributaria(NFNotaInfoSituacaoTributariaCOFINS.CREDITO_PRESUMIDO_OUTRAS_OPERACOES);
        cofinsAliquota.setValorBaseCalulo(new BigDecimal("999999999999.99"));
        cofinsAliquota.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDeveSituacaoTributariaAliquotaNulo() {
        final DFNotaInfoItemImpostoCOFINSAliquota cofinsAliquota = new DFNotaInfoItemImpostoCOFINSAliquota();
        cofinsAliquota.setPercentualAliquota(new BigDecimal("99.99"));
        cofinsAliquota.setValor(new BigDecimal("999999999999.99"));
        cofinsAliquota.setValorBaseCalulo(new BigDecimal("999999999999.99"));
        cofinsAliquota.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPercentualAliquotaNulo() {
        final DFNotaInfoItemImpostoCOFINSAliquota cofinsAliquota = new DFNotaInfoItemImpostoCOFINSAliquota();
        cofinsAliquota.setSituacaoTributaria(NFNotaInfoSituacaoTributariaCOFINS.CREDITO_PRESUMIDO_OUTRAS_OPERACOES);
        cofinsAliquota.setValor(new BigDecimal("999999999999.99"));
        cofinsAliquota.setValorBaseCalulo(new BigDecimal("999999999999.99"));
        cofinsAliquota.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<DFNotaInfoItemImpostoCOFINSAliquota><CST>01</CST><vBC>999999999999.99</vBC><pCOFINS>99.99</pCOFINS><vCOFINS>999999999999.99</vCOFINS></DFNotaInfoItemImpostoCOFINSAliquota>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSAliquota().toString());
    }
}