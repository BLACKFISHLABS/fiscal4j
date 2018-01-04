package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import br.indie.fiscal4j.nfe.classes.NFNotaInfoSituacaoTributariaPIS;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoPISOutrasOperacoesTest {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirSituacaoTributariaNulo() {
        final DFNotaInfoItemImpostoPISOutrasOperacoes pisOutrasOperacoes = new DFNotaInfoItemImpostoPISOutrasOperacoes();
        pisOutrasOperacoes.setQuantidadeVendida(new BigDecimal("99999999999.9999"));
        pisOutrasOperacoes.setValorAliquota(new BigDecimal("9999999999.9999"));
        pisOutrasOperacoes.setValorTributo(new BigDecimal("999999999999.99"));
        pisOutrasOperacoes.toString();
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorlTributoComTamanhoInvalido() {
        new DFNotaInfoItemImpostoPISOutrasOperacoes().setValorTributo(new BigDecimal("99999999999999"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorlAliquotaComTamanhoInvalido() {
        new DFNotaInfoItemImpostoPISOutrasOperacoes().setValorAliquota(new BigDecimal("999999999999"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualAliquotaComTamanhoInvalido() {
        new DFNotaInfoItemImpostoPISOutrasOperacoes().setPercentualAliquota(new BigDecimal("9999"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorBaseCalculoComTamanhoInvalido() {
        new DFNotaInfoItemImpostoPISOutrasOperacoes().setValorBaseCalculo(new BigDecimal("99999999999999"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirQuantidadeVendidaComTamanhoInvalido() {
        new DFNotaInfoItemImpostoPISOutrasOperacoes().setQuantidadeVendida(new BigDecimal("9999999999999"));
    }

    @Test
    public void naoDevePermitirSetarQuantidadeVendidaCasoPercentualAliquotaOuValorBaseCalculoEstejaSetado() {
        final DFNotaInfoItemImpostoPISOutrasOperacoes impostoOutrasOperacoes1 = new DFNotaInfoItemImpostoPISOutrasOperacoes();
        impostoOutrasOperacoes1.setValorBaseCalculo(BigDecimal.ONE);
        try {
            impostoOutrasOperacoes1.setQuantidadeVendida(BigDecimal.ONE);
            Assert.fail("Nao deve permitir setar percentual aliquota se valor aliquota foi setado");
        } catch (final IllegalStateException e) {
        }

        final DFNotaInfoItemImpostoPISOutrasOperacoes impostoOutrasOperacoes2 = new DFNotaInfoItemImpostoPISOutrasOperacoes();
        impostoOutrasOperacoes2.setPercentualAliquota(BigDecimal.ONE);
        try {
            impostoOutrasOperacoes2.setQuantidadeVendida(BigDecimal.ONE);
            Assert.fail("Nao deve permitir setar percentual aliquota se quantidade vendida foi setado");
        } catch (final IllegalStateException e) {
        }
    }

    @Test
    public void naoDevePermitirSetarValorBaseCalculoCasoValorAliquotaOuQuantidadeVendidaEstejaSetado() {
        final DFNotaInfoItemImpostoPISOutrasOperacoes impostoOutrasOperacoes1 = new DFNotaInfoItemImpostoPISOutrasOperacoes();
        impostoOutrasOperacoes1.setQuantidadeVendida(BigDecimal.ONE);
        try {
            impostoOutrasOperacoes1.setValorBaseCalculo(BigDecimal.ONE);
            Assert.fail("Nao deve permitir setar percentual aliquota se valor aliquota foi setado");
        } catch (final IllegalStateException e) {
        }

        final DFNotaInfoItemImpostoPISOutrasOperacoes impostoOutrasOperacoes2 = new DFNotaInfoItemImpostoPISOutrasOperacoes();
        impostoOutrasOperacoes2.setValorAliquota(BigDecimal.ONE);
        try {
            impostoOutrasOperacoes2.setValorBaseCalculo(BigDecimal.ONE);
            Assert.fail("Nao deve permitir setar percentual aliquota se quantidade vendida foi setado");
        } catch (final IllegalStateException e) {
        }
    }

    @Test
    public void naoDevePermitirSetarValorAliquotaCasoPercentualAliquotaOuValorBaseCalculoEstejaSetado() {
        final DFNotaInfoItemImpostoPISOutrasOperacoes impostoOutrasOperacoes1 = new DFNotaInfoItemImpostoPISOutrasOperacoes();
        impostoOutrasOperacoes1.setPercentualAliquota(BigDecimal.ONE);
        try {
            impostoOutrasOperacoes1.setValorAliquota(BigDecimal.ONE);
            Assert.fail("Nao deve permitir setar percentual aliquota se valor aliquota foi setado");
        } catch (final IllegalStateException e) {
        }

        final DFNotaInfoItemImpostoPISOutrasOperacoes impostoOutrasOperacoes2 = new DFNotaInfoItemImpostoPISOutrasOperacoes();
        impostoOutrasOperacoes2.setValorBaseCalculo(BigDecimal.ONE);
        try {
            impostoOutrasOperacoes2.setValorAliquota(BigDecimal.ONE);
            Assert.fail("Nao deve permitir setar percentual aliquota se quantidade vendida foi setado");
        } catch (final IllegalStateException e) {
        }
    }

    @Test
    public void naoDevePermitirSetarPercentualAliquotaCasoValorAliquotaOuQuantidadeVendidaEstejaSetado() {
        final DFNotaInfoItemImpostoPISOutrasOperacoes impostoOutrasOperacoes1 = new DFNotaInfoItemImpostoPISOutrasOperacoes();
        impostoOutrasOperacoes1.setValorAliquota(BigDecimal.ONE);
        try {
            impostoOutrasOperacoes1.setPercentualAliquota(BigDecimal.ONE);
            Assert.fail("Nao deve permitir setar percentual aliquota se valor aliquota foi setado");
        } catch (final IllegalStateException e) {
        }

        final DFNotaInfoItemImpostoPISOutrasOperacoes impostoOutrasOperacoes2 = new DFNotaInfoItemImpostoPISOutrasOperacoes();
        impostoOutrasOperacoes2.setQuantidadeVendida(BigDecimal.ONE);
        try {
            impostoOutrasOperacoes2.setPercentualAliquota(BigDecimal.ONE);
            Assert.fail("Nao deve permitir setar percentual aliquota se quantidade vendida foi setado");
        } catch (final IllegalStateException e) {
        }
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecidoBCAliquotaPercentual() {
        final DFNotaInfoItemImpostoPISOutrasOperacoes pisOutrasOperacoes = new DFNotaInfoItemImpostoPISOutrasOperacoes();
        pisOutrasOperacoes.setSituacaoTributaria(NFNotaInfoSituacaoTributariaPIS.OUTRAS_OPERACOES_SAIDA);
        pisOutrasOperacoes.setPercentualAliquota(new BigDecimal("99.99"));
        pisOutrasOperacoes.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        pisOutrasOperacoes.setValorTributo(new BigDecimal("999999999999.99"));

        final String xmlEsperado = "<DFNotaInfoItemImpostoPISOutrasOperacoes><CST>49</CST><vBC>999999999999.99</vBC><pPIS>99.99</pPIS><vPIS>999999999999.99</vPIS></DFNotaInfoItemImpostoPISOutrasOperacoes>";
        Assert.assertEquals(xmlEsperado, pisOutrasOperacoes.toString());
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecidoQuantidadeVendaAliquota() {
        final String xmlEsperado = "<DFNotaInfoItemImpostoPISOutrasOperacoes><CST>49</CST><qBCProd>99999999999.9999</qBCProd><vAliqProd>9999999999.9999</vAliqProd><vPIS>999999999999.99</vPIS></DFNotaInfoItemImpostoPISOutrasOperacoes>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISOutrasOperacoes().toString());
    }
}