package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import br.indie.fiscal4j.nfe.classes.NFNotaInfoSituacaoTributariaPIS;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoPISQuantidadeTest {

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorlTributoComTamanhoInvalido() {
        new DFNotaInfoItemImpostoPISQuantidade().setValorTributo(new BigDecimal("99999999999999"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorlAliquotaComTamanhoInvalido() {
        new DFNotaInfoItemImpostoPISQuantidade().setValorAliquota(new BigDecimal("999999999999"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirQuantidadeVendidaComTamanhoInvalido() {
        new DFNotaInfoItemImpostoPISQuantidade().setQuantidadeVendida(new BigDecimal("9999999999999"));
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitrSituacaoTributariaNulo() {
        final DFNotaInfoItemImpostoPISQuantidade pisQuantidade = new DFNotaInfoItemImpostoPISQuantidade();
        pisQuantidade.setQuantidadeVendida(new BigDecimal("99999999999.9999"));
        pisQuantidade.setValorAliquota(new BigDecimal("9999999999.9999"));
        pisQuantidade.setValorTributo(new BigDecimal("999999999999.99"));
        pisQuantidade.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitrQuantidadeVendidaNulo() {
        final DFNotaInfoItemImpostoPISQuantidade pisQuantidade = new DFNotaInfoItemImpostoPISQuantidade();
        pisQuantidade.setSituacaoTributaria(NFNotaInfoSituacaoTributariaPIS.CREDITO_PRESUMIDO_OPERACAO_AQUISICAO_VINCULADA_EXCLUSIVAMENTE_A_RECEITA_NAO_TRIBUTADA_MERCADO_INTERNO);
        pisQuantidade.setValorAliquota(new BigDecimal("9999999999.9999"));
        pisQuantidade.setValorTributo(new BigDecimal("999999999999.99"));
        pisQuantidade.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitrValorAliquotaNulo() {
        final DFNotaInfoItemImpostoPISQuantidade pisQuantidade = new DFNotaInfoItemImpostoPISQuantidade();
        pisQuantidade.setQuantidadeVendida(new BigDecimal("99999999999.9999"));
        pisQuantidade.setSituacaoTributaria(NFNotaInfoSituacaoTributariaPIS.CREDITO_PRESUMIDO_OPERACAO_AQUISICAO_VINCULADA_EXCLUSIVAMENTE_A_RECEITA_NAO_TRIBUTADA_MERCADO_INTERNO);
        pisQuantidade.setValorTributo(new BigDecimal("999999999999.99"));
        pisQuantidade.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitrValorTributoNulo() {
        final DFNotaInfoItemImpostoPISQuantidade pisQuantidade = new DFNotaInfoItemImpostoPISQuantidade();
        pisQuantidade.setQuantidadeVendida(new BigDecimal("99999999999.9999"));
        pisQuantidade.setSituacaoTributaria(NFNotaInfoSituacaoTributariaPIS.CREDITO_PRESUMIDO_OPERACAO_AQUISICAO_VINCULADA_EXCLUSIVAMENTE_A_RECEITA_NAO_TRIBUTADA_MERCADO_INTERNO);
        pisQuantidade.setValorAliquota(new BigDecimal("9999999999.9999"));
        pisQuantidade.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<DFNotaInfoItemImpostoPISQuantidade><CST>03</CST><qBCProd>99999999999.9999</qBCProd><vAliqProd>9999999999.9999</vAliqProd><vPIS>999999999999.99</vPIS></DFNotaInfoItemImpostoPISQuantidade>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISQuantidade().toString());
    }
}