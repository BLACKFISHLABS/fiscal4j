package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import br.indie.fiscal4j.nfe.classes.NFNotaInfoSituacaoTributariaIPI;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoIPITributadoTest {

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorlTributoComTamanhoInvalido() {
        new DFNotaInfoItemImpostoIPITributado().setValorTributo(new BigDecimal("99999999999999"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualAliquotaComTamanhoInvalido() {
        new DFNotaInfoItemImpostoIPITributado().setPercentualAliquota(new BigDecimal("1000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorBaseCalculoComTamanhoInvalido() {
        new DFNotaInfoItemImpostoIPITributado().setValorBaseCalculo(new BigDecimal("99999999999999"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirQuantidadeComTamanhoInvalido() {
        new DFNotaInfoItemImpostoIPITributado().setQuantidade(new BigDecimal("9999999999999"));
    }

    @Test
    public void naoDevePermitirSetarQuantidadeCasoPercentualAliquotaOuValorBaseCalculoEstejaSetado() {
        final DFNotaInfoItemImpostoIPITributado impostoTributado1 = new DFNotaInfoItemImpostoIPITributado();
        impostoTributado1.setPercentualAliquota(BigDecimal.ONE);
        try {
            impostoTributado1.setQuantidade(BigDecimal.ONE);
            Assert.fail("Nao deve permitir setar valor base calculo se quantidade foi setado");
        } catch (final IllegalStateException e) {
        }

        final DFNotaInfoItemImpostoIPITributado impostoIPITributado2 = new DFNotaInfoItemImpostoIPITributado();
        impostoIPITributado2.setValorBaseCalculo(BigDecimal.ONE);
        try {
            impostoIPITributado2.setQuantidade(BigDecimal.ONE);
            Assert.fail("Nao deve permitir setar valor base calculo se valor unidade tributavel foi setado");
        } catch (final IllegalStateException e) {
        }
    }

    @Test
    public void naoDevePermitirSetarValorUnidadeTributavelCasoPercentualAliquotaOuValorBaseCalculoEstejaSetado() {
        final DFNotaInfoItemImpostoIPITributado impostoTributado1 = new DFNotaInfoItemImpostoIPITributado();
        impostoTributado1.setPercentualAliquota(BigDecimal.ONE);
        try {
            impostoTributado1.setValorUnidadeTributavel(BigDecimal.ONE);
            Assert.fail("Nao deve permitir setar valor base calculo se quantidade foi setado");
        } catch (final IllegalStateException e) {
        }

        final DFNotaInfoItemImpostoIPITributado impostoIPITributado2 = new DFNotaInfoItemImpostoIPITributado();
        impostoIPITributado2.setValorBaseCalculo(BigDecimal.ONE);
        try {
            impostoIPITributado2.setValorUnidadeTributavel(BigDecimal.ONE);
            Assert.fail("Nao deve permitir setar valor base calculo se valor unidade tributavel foi setado");
        } catch (final IllegalStateException e) {
        }
    }

    @Test
    public void naoDevePermitirSetarPercentualAliquotaCasoQuantidadeOuValorUnidadeTributavelEstejaSetado() {
        final DFNotaInfoItemImpostoIPITributado impostoTributado1 = new DFNotaInfoItemImpostoIPITributado();
        impostoTributado1.setQuantidade(BigDecimal.ONE);
        try {
            impostoTributado1.setPercentualAliquota(BigDecimal.ONE);
            Assert.fail("Nao deve permitir setar valor base calculo se quantidade foi setado");
        } catch (final IllegalStateException e) {
        }

        final DFNotaInfoItemImpostoIPITributado impostoIPITributado2 = new DFNotaInfoItemImpostoIPITributado();
        impostoIPITributado2.setValorUnidadeTributavel(BigDecimal.ONE);
        try {
            impostoIPITributado2.setPercentualAliquota(BigDecimal.ONE);
            Assert.fail("Nao deve permitir setar valor base calculo se valor unidade tributavel foi setado");
        } catch (final IllegalStateException e) {
        }
    }

    @Test
    public void naoDevePermitirSetarValorBaseCalculoCasoQuantidadeOuValorUnidadeTributavelEstejaSetado() {
        final DFNotaInfoItemImpostoIPITributado impostoTributado1 = new DFNotaInfoItemImpostoIPITributado();
        impostoTributado1.setQuantidade(BigDecimal.ONE);
        try {
            impostoTributado1.setValorBaseCalculo(BigDecimal.ONE);
            Assert.fail("Nao deve permitir setar valor base calculo se quantidade foi setado");
        } catch (final IllegalStateException e) {
        }

        final DFNotaInfoItemImpostoIPITributado impostoIPITributado2 = new DFNotaInfoItemImpostoIPITributado();
        impostoIPITributado2.setValorUnidadeTributavel(BigDecimal.ONE);
        try {
            impostoIPITributado2.setValorBaseCalculo(BigDecimal.ONE);
            Assert.fail("Nao deve permitir setar valor base calculo se valor unidade tributavel foi setado");
        } catch (final IllegalStateException e) {
        }
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecidoQuantidadeValorUnidadeTributavel() {
        final DFNotaInfoItemImpostoIPITributado ipiTributado = new DFNotaInfoItemImpostoIPITributado();
        ipiTributado.setSituacaoTributaria(NFNotaInfoSituacaoTributariaIPI.OUTRAS_ENTRADAS);
        ipiTributado.setQuantidade(new BigDecimal("99999999999.9999"));
        ipiTributado.setValorUnidadeTributavel(new BigDecimal("9999999999.9999"));
        ipiTributado.setValorTributo(new BigDecimal("999999999999.99"));

        final String xmlEsperado = "<DFNotaInfoItemImpostoIPITributado><CST>49</CST><qUnid>99999999999.9999</qUnid><vUnid>9999999999.9999</vUnid><vIPI>999999999999.99</vIPI></DFNotaInfoItemImpostoIPITributado>";
        Assert.assertEquals(xmlEsperado, ipiTributado.toString());
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecidoPercentualAliquotaBaseCalculo() {
        final String xmlEsperado = "<DFNotaInfoItemImpostoIPITributado><CST>49</CST><vBC>999999999999.99</vBC><pIPI>99.99</pIPI><vIPI>999999999999.99</vIPI></DFNotaInfoItemImpostoIPITributado>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoItemImpostoIPITributado().toString());
    }
}