package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import br.indie.fiscal4j.nfe.classes.NFNotaInfoSituacaoTributariaCOFINS;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoCOFINSOutrasOperacoesTest {

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualCOFINSComTamanhoInvalido() {
        new DFNotaInfoItemImpostoCOFINSOutrasOperacoes().setPercentualCOFINS(new BigDecimal("999999"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorBaseCalculoComTamanhoInvalido() {
        new DFNotaInfoItemImpostoCOFINSOutrasOperacoes().setValorBaseCalculo(new BigDecimal("99999999999999"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirQuantidadeVendidaComTamanhoInvalido() {
        new DFNotaInfoItemImpostoCOFINSOutrasOperacoes().setQuantidadeVendida(new BigDecimal("9999999999999"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorCOFINSComTamanhoInvalido() {
        new DFNotaInfoItemImpostoCOFINSOutrasOperacoes().setValorCOFINS(new BigDecimal("99999999999999"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorAliquotaComTamanhoInvalido() {
        new DFNotaInfoItemImpostoCOFINSOutrasOperacoes().setValorAliquota(new BigDecimal("999999999999"));
    }

    @Test
    public void devePermitirPercentualCOFINSNulo() {
        final DFNotaInfoItemImpostoCOFINSOutrasOperacoes outrasOperacoes = new DFNotaInfoItemImpostoCOFINSOutrasOperacoes();
        outrasOperacoes.setQuantidadeVendida(new BigDecimal("99999999999.9999"));
        outrasOperacoes.setSituacaoTributaria(NFNotaInfoSituacaoTributariaCOFINS.OUTRAS_OPERACOES_SAIDA);
        outrasOperacoes.setValorAliquota(new BigDecimal("99999999999"));
        outrasOperacoes.setValorBaseCalculo(new BigDecimal("99999999999"));
        outrasOperacoes.setValorCOFINS(new BigDecimal("999999999999"));
        outrasOperacoes.toString();
    }

    @Test
    public void devePermitirQuantidadeVendidaNulo() {
        final DFNotaInfoItemImpostoCOFINSOutrasOperacoes outrasOperacoes = new DFNotaInfoItemImpostoCOFINSOutrasOperacoes();
        outrasOperacoes.setPercentualCOFINS(new BigDecimal("99.99"));
        outrasOperacoes.setSituacaoTributaria(NFNotaInfoSituacaoTributariaCOFINS.OUTRAS_OPERACOES_SAIDA);
        outrasOperacoes.setValorAliquota(new BigDecimal("99999999999"));
        outrasOperacoes.setValorBaseCalculo(new BigDecimal("99999999999"));
        outrasOperacoes.setValorCOFINS(new BigDecimal("999999999999"));
        outrasOperacoes.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirSituacaoTributariaNulo() {
        final DFNotaInfoItemImpostoCOFINSOutrasOperacoes outrasOperacoes = new DFNotaInfoItemImpostoCOFINSOutrasOperacoes();
        outrasOperacoes.setPercentualCOFINS(new BigDecimal("99.99"));
        outrasOperacoes.setQuantidadeVendida(new BigDecimal("99999999999.9999"));
        outrasOperacoes.setValorAliquota(new BigDecimal("99999999999"));
        outrasOperacoes.setValorBaseCalculo(new BigDecimal("99999999999"));
        outrasOperacoes.setValorCOFINS(new BigDecimal("999999999999"));
        outrasOperacoes.toString();
    }

    @Test
    public void devePermitirValorAliquotaNulo() {
        final DFNotaInfoItemImpostoCOFINSOutrasOperacoes outrasOperacoes = new DFNotaInfoItemImpostoCOFINSOutrasOperacoes();
        outrasOperacoes.setPercentualCOFINS(new BigDecimal("99.99"));
        outrasOperacoes.setQuantidadeVendida(new BigDecimal("99999999999.9999"));
        outrasOperacoes.setSituacaoTributaria(NFNotaInfoSituacaoTributariaCOFINS.OUTRAS_OPERACOES_SAIDA);
        outrasOperacoes.setValorBaseCalculo(new BigDecimal("999999999999"));
        outrasOperacoes.setValorCOFINS(new BigDecimal("999999999999"));
        outrasOperacoes.toString();
    }

    @Test
    public void devePermitirBaseCalculoNulo() {
        final DFNotaInfoItemImpostoCOFINSOutrasOperacoes outrasOperacoes = new DFNotaInfoItemImpostoCOFINSOutrasOperacoes();
        outrasOperacoes.setPercentualCOFINS(new BigDecimal("99.99"));
        outrasOperacoes.setQuantidadeVendida(new BigDecimal("99999999999.9999"));
        outrasOperacoes.setSituacaoTributaria(NFNotaInfoSituacaoTributariaCOFINS.OUTRAS_OPERACOES_SAIDA);
        outrasOperacoes.setValorAliquota(new BigDecimal("99999999999"));
        outrasOperacoes.setValorCOFINS(new BigDecimal("999999999999"));
        outrasOperacoes.toString();
    }

    @Test
    public void naoDevePermitirValorCOFINS() {
        final DFNotaInfoItemImpostoCOFINSOutrasOperacoes outrasOperacoes = new DFNotaInfoItemImpostoCOFINSOutrasOperacoes();
        outrasOperacoes.setPercentualCOFINS(new BigDecimal("99.99"));
        outrasOperacoes.setQuantidadeVendida(new BigDecimal("99999999999.9999"));
        outrasOperacoes.setSituacaoTributaria(NFNotaInfoSituacaoTributariaCOFINS.OUTRAS_OPERACOES_SAIDA);
        outrasOperacoes.setValorAliquota(new BigDecimal("99999999999"));
        outrasOperacoes.setValorBaseCalculo(new BigDecimal("9999999999999"));
        outrasOperacoes.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<DFNotaInfoItemImpostoCOFINSOutrasOperacoes><CST>49</CST><vBC>999999999999.00</vBC><pCOFINS>99.99</pCOFINS><qBCProd>99999999999.9999</qBCProd><vAliqProd>9999999999.0000</vAliqProd><vCOFINS>999999999999.00</vCOFINS></DFNotaInfoItemImpostoCOFINSOutrasOperacoes>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSOutrasOperacoes().toString());
    }
}