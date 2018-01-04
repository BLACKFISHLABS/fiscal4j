package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoCOFINSSTTest {

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorCOFINSForaoDoLimite() {
        new DFNotaInfoItemImpostoCOFINSST().setValorCOFINS(new BigDecimal("99999999999999999"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorAliquotaCOFINSForaoDoLimite() {
        new DFNotaInfoItemImpostoCOFINSST().setValorAliquotaCOFINS(new BigDecimal("99999999999999999"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirQuantidadeVendidaForaDoLimite() {
        new DFNotaInfoItemImpostoCOFINSST().setQuantidadeVendida(new BigDecimal("999999999999999999"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorPercentualAliquotaCOFINSForaDoLimite() {
        new DFNotaInfoItemImpostoCOFINSST().setPercentualAliquota(new BigDecimal("1000.01"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorBaseCalculoForaDoLimite() {
        new DFNotaInfoItemImpostoCOFINSST().setValorBaseCalculo(new BigDecimal("99999999999999999"));
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<DFNotaInfoItemImpostoCOFINSST><vBC>999999999999.99</vBC><pCOFINS>99.99</pCOFINS><vCOFINS>999999999999.00</vCOFINS></DFNotaInfoItemImpostoCOFINSST>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSST().toString());
    }
}