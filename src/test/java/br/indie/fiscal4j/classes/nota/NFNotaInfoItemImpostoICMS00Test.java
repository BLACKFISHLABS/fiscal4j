package br.indie.fiscal4j.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import br.indie.fiscal4j.classes.NFNotaInfoImpostoTributacaoICMS;
import br.indie.fiscal4j.classes.NFNotaInfoItemModalidadeBCICMS;
import br.indie.fiscal4j.classes.NFOrigem;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoICMS00Test {

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualAliquotaComTamanhoInvalido() {
        new NFNotaInfoItemImpostoICMS00().setPercentualAliquota(new BigDecimal("1000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorBaseCalculoComTamanhoInvalido() {
        new NFNotaInfoItemImpostoICMS00().setValorBaseCalculo(new BigDecimal("10000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorTributoComTamanhoInvalido() {
        new NFNotaInfoItemImpostoICMS00().setValorTributo(new BigDecimal("10000000000000"));
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirModalidadeBaseCalculoNulo() {
        final NFNotaInfoItemImpostoICMS00 icms00 = new NFNotaInfoItemImpostoICMS00();
        icms00.setOrigem(NFOrigem.NACIONAL);
        icms00.setPercentualAliquota(new BigDecimal("99.99"));
        icms00.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms00.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        icms00.setValorTributo(new BigDecimal("999999999999.99"));
        icms00.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirOrigemNulo() {
        final NFNotaInfoItemImpostoICMS00 icms00 = new NFNotaInfoItemImpostoICMS00();
        icms00.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.PAUTA);
        icms00.setPercentualAliquota(new BigDecimal("99.99"));
        icms00.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms00.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        icms00.setValorTributo(new BigDecimal("999999999999.99"));
        icms00.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPercentualAliquotaNulo() {
        final NFNotaInfoItemImpostoICMS00 icms00 = new NFNotaInfoItemImpostoICMS00();
        icms00.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.PAUTA);
        icms00.setOrigem(NFOrigem.NACIONAL);
        icms00.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms00.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        icms00.setValorTributo(new BigDecimal("999999999999.99"));
        icms00.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirSituacaoTributariaCalculoNulo() {
        final NFNotaInfoItemImpostoICMS00 icms00 = new NFNotaInfoItemImpostoICMS00();
        icms00.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.PAUTA);
        icms00.setOrigem(NFOrigem.NACIONAL);
        icms00.setPercentualAliquota(new BigDecimal("99.99"));
        icms00.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        icms00.setValorTributo(new BigDecimal("999999999999.99"));
        icms00.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorBaseCalculoNulo() {
        final NFNotaInfoItemImpostoICMS00 icms00 = new NFNotaInfoItemImpostoICMS00();
        icms00.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.PAUTA);
        icms00.setOrigem(NFOrigem.NACIONAL);
        icms00.setPercentualAliquota(new BigDecimal("99.99"));
        icms00.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms00.setValorTributo(new BigDecimal("999999999999.99"));
        icms00.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorTributoNulo() {
        final NFNotaInfoItemImpostoICMS00 icms00 = new NFNotaInfoItemImpostoICMS00();
        icms00.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.PAUTA);
        icms00.setOrigem(NFOrigem.NACIONAL);
        icms00.setPercentualAliquota(new BigDecimal("99.99"));
        icms00.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms00.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        icms00.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<NFNotaInfoItemImpostoICMS00><orig>0</orig><CST>00</CST><modBC>1</modBC><vBC>999999999999.99</vBC><pICMS>99.99</pICMS><vICMS>999999999999.99</vICMS></NFNotaInfoItemImpostoICMS00>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoItemImpostoICMS00().toString());
    }
}