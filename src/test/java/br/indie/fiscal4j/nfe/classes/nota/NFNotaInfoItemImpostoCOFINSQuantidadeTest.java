package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import br.indie.fiscal4j.nfe.classes.NFNotaInfoSituacaoTributariaCOFINS;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoCOFINSQuantidadeTest {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirQuantidadeVendidoNulo() {
        final DFNotaInfoItemImpostoCOFINSQuantidade cofinsQuantidade = new DFNotaInfoItemImpostoCOFINSQuantidade();
        cofinsQuantidade.setSituacaoTributaria(NFNotaInfoSituacaoTributariaCOFINS.OPERACAO_AQUISICAO_ALIQUOTA_ZERO);
        cofinsQuantidade.setValorAliquota(new BigDecimal("9999999999.0000"));
        cofinsQuantidade.setValorTributo(new BigDecimal("999999999999.00"));
        cofinsQuantidade.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorAliquotaNulo() {
        final DFNotaInfoItemImpostoCOFINSQuantidade cofinsQuantidade = new DFNotaInfoItemImpostoCOFINSQuantidade();
        cofinsQuantidade.setQuantidadeVendida(new BigDecimal("99999999999"));
        cofinsQuantidade.setSituacaoTributaria(NFNotaInfoSituacaoTributariaCOFINS.OPERACAO_AQUISICAO_ALIQUOTA_ZERO);
        cofinsQuantidade.setValorTributo(new BigDecimal("999999999999.00"));
        cofinsQuantidade.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorTributoNulo() {
        final DFNotaInfoItemImpostoCOFINSQuantidade cofinsQuantidade = new DFNotaInfoItemImpostoCOFINSQuantidade();
        cofinsQuantidade.setQuantidadeVendida(new BigDecimal("99999999999"));
        cofinsQuantidade.setSituacaoTributaria(NFNotaInfoSituacaoTributariaCOFINS.OPERACAO_AQUISICAO_ALIQUOTA_ZERO);
        cofinsQuantidade.setValorAliquota(new BigDecimal("9999999999.0000"));
        cofinsQuantidade.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<DFNotaInfoItemImpostoCOFINSQuantidade><CST>03</CST><qBCProd>99999999999.9999</qBCProd><vAliqProd>9999999999.0000</vAliqProd><vCOFINS>999999999999.00</vCOFINS></DFNotaInfoItemImpostoCOFINSQuantidade>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSQuantidade().toString());
    }
}