package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.nfe.classes.NFNotaInfoImpostoTributacaoICMS;
import br.indie.fiscal4j.nfe.classes.NFOrigem;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoICMS60Test {

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorBCICMSSTRetidoComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMS60().setValorBCICMSSTRetido(new BigDecimal("10000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorICMSSTRetidoComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMS60().setValorICMSSTRetido(new BigDecimal("10000000000000"));
    }

    @Test(expected = IllegalStateException.class)
    public void naoDeveSituacaoTributariaNulo() {
        final DFNotaInfoItemImpostoICMS60 icms60 = new DFNotaInfoItemImpostoICMS60();
        icms60.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms60.setValorBCICMSSTRetido(new BigDecimal("999999999999.99"));
        icms60.setValorICMSSTRetido(new BigDecimal("999999999999.99"));
        icms60.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirOrigemNulo() {
        final DFNotaInfoItemImpostoICMS60 icms60 = new DFNotaInfoItemImpostoICMS60();
        icms60.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA_OU_NAO_TRIBUTADA_COM_COBRANCA_ICMS_POR_SUBSTITUICAO_TRIBUTARIA);
        icms60.setValorBCICMSSTRetido(new BigDecimal("999999999999.99"));
        icms60.setValorICMSSTRetido(new BigDecimal("999999999999.99"));
        icms60.toString();
    }

    @Test
    public void devePermitirValorBCICMSSTRetidoNulo() {
        final DFNotaInfoItemImpostoICMS60 icms60 = new DFNotaInfoItemImpostoICMS60();
        icms60.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA_OU_NAO_TRIBUTADA_COM_COBRANCA_ICMS_POR_SUBSTITUICAO_TRIBUTARIA);
        icms60.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms60.setValorICMSSTRetido(new BigDecimal("999999999999.99"));
        icms60.toString();
    }

    @Test
    public void devePermitirValorICMSSTRetidoNulo() {
        final DFNotaInfoItemImpostoICMS60 icms60 = new DFNotaInfoItemImpostoICMS60();
        icms60.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA_OU_NAO_TRIBUTADA_COM_COBRANCA_ICMS_POR_SUBSTITUICAO_TRIBUTARIA);
        icms60.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms60.setValorBCICMSSTRetido(new BigDecimal("999999999999.99"));
        icms60.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final DFNotaInfoItemImpostoICMS60 icms60 = new DFNotaInfoItemImpostoICMS60();
        icms60.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA_OU_NAO_TRIBUTADA_COM_COBRANCA_ICMS_POR_SUBSTITUICAO_TRIBUTARIA);
        icms60.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms60.setValorBCICMSSTRetido(new BigDecimal("999999999999.99"));
        icms60.setValorICMSSTRetido(new BigDecimal("999999999999.99"));

        final String xmlEsperado = "<DFNotaInfoItemImpostoICMS60><orig>2</orig><CST>30</CST><vBCSTRet>999999999999.99</vBCSTRet><vICMSSTRet>999999999999.99</vICMSSTRet></DFNotaInfoItemImpostoICMS60>";
        Assert.assertEquals(xmlEsperado, icms60.toString());
    }
}