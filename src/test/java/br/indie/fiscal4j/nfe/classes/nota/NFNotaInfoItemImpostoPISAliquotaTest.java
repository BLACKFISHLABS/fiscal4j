package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import br.indie.fiscal4j.nfe.classes.NFNotaInfoSituacaoTributariaPIS;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoPISAliquotaTest {

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorlTributoComTamanhoInvalido() {
        new DFNotaInfoItemImpostoPISAliquota().setValorTributo(new BigDecimal("99999999999999"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorlAliquotaComTamanhoInvalido() {
        new DFNotaInfoItemImpostoPISAliquota().setPercentualAliquota(new BigDecimal("9999"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirQuantidadeVendidaComTamanhoInvalido() {
        new DFNotaInfoItemImpostoPISAliquota().setValorBaseCalculo(new BigDecimal("99999999999999"));
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitrValorTributoNulo() {
        final DFNotaInfoItemImpostoPISAliquota pisAliquota = new DFNotaInfoItemImpostoPISAliquota();
        pisAliquota.setPercentualAliquota(new BigDecimal("99.99"));
        pisAliquota.setSituacaoTributaria(NFNotaInfoSituacaoTributariaPIS.CREDITO_PRESUMIDO_OPERACAO_AQUISICAO_VINCULADA_RECEITAS_NAO_TRIBUTADAS_MERCADO_INTERNO_EXPORTACAO);
        pisAliquota.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        pisAliquota.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitrValorBaseCalculoNulo() {
        final DFNotaInfoItemImpostoPISAliquota pisAliquota = new DFNotaInfoItemImpostoPISAliquota();
        pisAliquota.setPercentualAliquota(new BigDecimal("99.99"));
        pisAliquota.setSituacaoTributaria(NFNotaInfoSituacaoTributariaPIS.CREDITO_PRESUMIDO_OPERACAO_AQUISICAO_VINCULADA_RECEITAS_NAO_TRIBUTADAS_MERCADO_INTERNO_EXPORTACAO);
        pisAliquota.setValorTributo(new BigDecimal("999999999999.99"));
        pisAliquota.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitrSituacaoTributariaNulo() {
        final DFNotaInfoItemImpostoPISAliquota pisAliquota = new DFNotaInfoItemImpostoPISAliquota();
        pisAliquota.setPercentualAliquota(new BigDecimal("99.99"));
        pisAliquota.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        pisAliquota.setValorTributo(new BigDecimal("999999999999.99"));
        pisAliquota.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitrPercentualAliquotaNulo() {
        final DFNotaInfoItemImpostoPISAliquota pisAliquota = new DFNotaInfoItemImpostoPISAliquota();
        pisAliquota.setSituacaoTributaria(NFNotaInfoSituacaoTributariaPIS.CREDITO_PRESUMIDO_OPERACAO_AQUISICAO_VINCULADA_RECEITAS_NAO_TRIBUTADAS_MERCADO_INTERNO_EXPORTACAO);
        pisAliquota.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        pisAliquota.setValorTributo(new BigDecimal("999999999999.99"));
        pisAliquota.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<DFNotaInfoItemImpostoPISAliquota><CST>01</CST><vBC>999999999999.99</vBC><pPIS>99.99</pPIS><vPIS>999999999999.99</vPIS></DFNotaInfoItemImpostoPISAliquota>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISAliquota().toString());
    }
}