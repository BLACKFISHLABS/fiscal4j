package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoISSQNTest {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirItemListaServicosComTamanhoInvalido() {
        try {
            new DFNotaInfoItemImpostoISSQN().setItemListaServicos("12.A3");
        } catch (final IllegalStateException e) {
            new DFNotaInfoItemImpostoISSQN().setItemListaServicos("AA.AA");
        }
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirCodigoMunicipioComTamanhoInvalido() {
        try {
            new DFNotaInfoItemImpostoISSQN().setCodigoMunicipio(999999);
        } catch (final NumberFormatException e) {
            new DFNotaInfoItemImpostoISSQN().setCodigoMunicipio(10000000);
        }
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirAliquotaISSQNComTamanhoNulo() {
        new DFNotaInfoItemImpostoISSQN().setValorAliquota(new BigDecimal("100000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorBaseCalculoComTamanhoInvalido() {
        new DFNotaInfoItemImpostoISSQN().setValorBaseCalculo(new BigDecimal("1000000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorComTamanhoInvalido() {
        new DFNotaInfoItemImpostoISSQN().setValor(new BigDecimal("1000000000000000"));
    }

    @Test
    public void devePermitirCodigoMunicipioIncidenciaImpostoNulo() {
        final DFNotaInfoItemImpostoISSQN impostoISSQN = new DFNotaInfoItemImpostoISSQN();
        impostoISSQN.setCodigoMunicipio(9999999);
        impostoISSQN.setItemListaServicos("12.34");
        impostoISSQN.setValor(new BigDecimal("999999999999.99"));
        impostoISSQN.setValorAliquota(new BigDecimal("99.99"));
        impostoISSQN.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        impostoISSQN.setCodigoPais("8486");
        impostoISSQN.setCodigoServico("VfsQTgAm60yAqyOMUOIp");
        impostoISSQN.setIndicadorExigibilidadeISS(NFNotaInfoItemIndicadorExigibilidadeISS.EXIGIVEL);
        impostoISSQN.setIndicadorIncentivoFiscal(NFNotaInfoItemIndicadorIncentivoFiscal.SIM);
        impostoISSQN.setNumeroProcesso("Sw4CSjke5lhAzlBrzFgKuNjtrRSVfO");
        impostoISSQN.setValorDeducao(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorDescontoCondicionado(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorDescontoIncondicionado(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorOutro(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorRetencaoISS(new BigDecimal("99999999999.99"));
        impostoISSQN.toString();
    }

    @Test
    public void devePermitirCodigoPaisNulo() {
        final DFNotaInfoItemImpostoISSQN impostoISSQN = new DFNotaInfoItemImpostoISSQN();
        impostoISSQN.setCodigoMunicipio(9999999);
        impostoISSQN.setItemListaServicos("12.34");
        impostoISSQN.setValor(new BigDecimal("999999999999.99"));
        impostoISSQN.setValorAliquota(new BigDecimal("99.99"));
        impostoISSQN.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        impostoISSQN.setCodigoMunicipioIncidenciaImposto("3813816");
        impostoISSQN.setCodigoServico("VfsQTgAm60yAqyOMUOIp");
        impostoISSQN.setIndicadorExigibilidadeISS(NFNotaInfoItemIndicadorExigibilidadeISS.EXIGIVEL);
        impostoISSQN.setIndicadorIncentivoFiscal(NFNotaInfoItemIndicadorIncentivoFiscal.SIM);
        impostoISSQN.setNumeroProcesso("Sw4CSjke5lhAzlBrzFgKuNjtrRSVfO");
        impostoISSQN.setValorDeducao(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorDescontoCondicionado(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorDescontoIncondicionado(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorOutro(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorRetencaoISS(new BigDecimal("99999999999.99"));
        impostoISSQN.toString();
    }

    @Test
    public void devePermitirCodigoServicoNulo() {
        final DFNotaInfoItemImpostoISSQN impostoISSQN = new DFNotaInfoItemImpostoISSQN();
        impostoISSQN.setCodigoMunicipio(9999999);
        impostoISSQN.setItemListaServicos("12.34");
        impostoISSQN.setValor(new BigDecimal("999999999999.99"));
        impostoISSQN.setValorAliquota(new BigDecimal("99.99"));
        impostoISSQN.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        impostoISSQN.setCodigoMunicipioIncidenciaImposto("3813816");
        impostoISSQN.setCodigoPais("8486");
        impostoISSQN.setIndicadorExigibilidadeISS(NFNotaInfoItemIndicadorExigibilidadeISS.EXIGIVEL);
        impostoISSQN.setIndicadorIncentivoFiscal(NFNotaInfoItemIndicadorIncentivoFiscal.SIM);
        impostoISSQN.setNumeroProcesso("Sw4CSjke5lhAzlBrzFgKuNjtrRSVfO");
        impostoISSQN.setValorDeducao(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorDescontoCondicionado(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorDescontoIncondicionado(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorOutro(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorRetencaoISS(new BigDecimal("99999999999.99"));
        impostoISSQN.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirIndicadorExigibilidadeISSNulo() {
        final DFNotaInfoItemImpostoISSQN impostoISSQN = new DFNotaInfoItemImpostoISSQN();
        impostoISSQN.setCodigoMunicipio(9999999);
        impostoISSQN.setItemListaServicos("12.34");
        impostoISSQN.setValor(new BigDecimal("999999999999.99"));
        impostoISSQN.setValorAliquota(new BigDecimal("99.99"));
        impostoISSQN.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        impostoISSQN.setCodigoMunicipioIncidenciaImposto("3813816");
        impostoISSQN.setCodigoPais("8486");
        impostoISSQN.setCodigoServico("VfsQTgAm60yAqyOMUOIp");
        impostoISSQN.setIndicadorIncentivoFiscal(NFNotaInfoItemIndicadorIncentivoFiscal.SIM);
        impostoISSQN.setNumeroProcesso("Sw4CSjke5lhAzlBrzFgKuNjtrRSVfO");
        impostoISSQN.setValorDeducao(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorDescontoCondicionado(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorDescontoIncondicionado(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorOutro(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorRetencaoISS(new BigDecimal("99999999999.99"));
        impostoISSQN.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirIncentivoFiscalNulo() {
        final DFNotaInfoItemImpostoISSQN impostoISSQN = new DFNotaInfoItemImpostoISSQN();
        impostoISSQN.setCodigoMunicipio(9999999);
        impostoISSQN.setItemListaServicos("12.34");
        impostoISSQN.setValor(new BigDecimal("999999999999.99"));
        impostoISSQN.setValorAliquota(new BigDecimal("99.99"));
        impostoISSQN.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        impostoISSQN.setCodigoMunicipioIncidenciaImposto("3813816");
        impostoISSQN.setCodigoPais("8486");
        impostoISSQN.setCodigoServico("VfsQTgAm60yAqyOMUOIp");
        impostoISSQN.setIndicadorExigibilidadeISS(NFNotaInfoItemIndicadorExigibilidadeISS.EXIGIVEL);
        impostoISSQN.setNumeroProcesso("Sw4CSjke5lhAzlBrzFgKuNjtrRSVfO");
        impostoISSQN.setValorDeducao(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorDescontoCondicionado(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorDescontoIncondicionado(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorOutro(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorRetencaoISS(new BigDecimal("99999999999.99"));
        impostoISSQN.toString();
    }

    @Test
    public void devePermitirNumeroProcessoNulo() {
        final DFNotaInfoItemImpostoISSQN impostoISSQN = new DFNotaInfoItemImpostoISSQN();
        impostoISSQN.setCodigoMunicipio(9999999);
        impostoISSQN.setItemListaServicos("12.34");
        impostoISSQN.setValor(new BigDecimal("999999999999.99"));
        impostoISSQN.setValorAliquota(new BigDecimal("99.99"));
        impostoISSQN.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        impostoISSQN.setCodigoMunicipioIncidenciaImposto("3813816");
        impostoISSQN.setCodigoPais("8486");
        impostoISSQN.setCodigoServico("VfsQTgAm60yAqyOMUOIp");
        impostoISSQN.setIndicadorExigibilidadeISS(NFNotaInfoItemIndicadorExigibilidadeISS.EXIGIVEL);
        impostoISSQN.setIndicadorIncentivoFiscal(NFNotaInfoItemIndicadorIncentivoFiscal.SIM);
        impostoISSQN.setValorDeducao(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorDescontoCondicionado(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorDescontoIncondicionado(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorOutro(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorRetencaoISS(new BigDecimal("99999999999.99"));
        impostoISSQN.toString();
    }

    @Test
    public void devePermitirValorDeducaoNulo() {
        final DFNotaInfoItemImpostoISSQN impostoISSQN = new DFNotaInfoItemImpostoISSQN();
        impostoISSQN.setCodigoMunicipio(9999999);
        impostoISSQN.setItemListaServicos("12.34");
        impostoISSQN.setValor(new BigDecimal("999999999999.99"));
        impostoISSQN.setValorAliquota(new BigDecimal("99.99"));
        impostoISSQN.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        impostoISSQN.setCodigoMunicipioIncidenciaImposto("3813816");
        impostoISSQN.setCodigoPais("8486");
        impostoISSQN.setCodigoServico("VfsQTgAm60yAqyOMUOIp");
        impostoISSQN.setIndicadorExigibilidadeISS(NFNotaInfoItemIndicadorExigibilidadeISS.EXIGIVEL);
        impostoISSQN.setIndicadorIncentivoFiscal(NFNotaInfoItemIndicadorIncentivoFiscal.SIM);
        impostoISSQN.setNumeroProcesso("Sw4CSjke5lhAzlBrzFgKuNjtrRSVfO");
        impostoISSQN.setValorDescontoCondicionado(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorDescontoIncondicionado(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorOutro(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorRetencaoISS(new BigDecimal("99999999999.99"));
        impostoISSQN.toString();
    }

    @Test
    public void devePermitirValorDescontoCondicionadoISSNulo() {
        final DFNotaInfoItemImpostoISSQN impostoISSQN = new DFNotaInfoItemImpostoISSQN();
        impostoISSQN.setCodigoMunicipio(9999999);
        impostoISSQN.setItemListaServicos("12.34");
        impostoISSQN.setValor(new BigDecimal("999999999999.99"));
        impostoISSQN.setValorAliquota(new BigDecimal("99.99"));
        impostoISSQN.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        impostoISSQN.setCodigoMunicipioIncidenciaImposto("3813816");
        impostoISSQN.setCodigoPais("8486");
        impostoISSQN.setCodigoServico("VfsQTgAm60yAqyOMUOIp");
        impostoISSQN.setIndicadorExigibilidadeISS(NFNotaInfoItemIndicadorExigibilidadeISS.EXIGIVEL);
        impostoISSQN.setIndicadorIncentivoFiscal(NFNotaInfoItemIndicadorIncentivoFiscal.SIM);
        impostoISSQN.setNumeroProcesso("Sw4CSjke5lhAzlBrzFgKuNjtrRSVfO");
        impostoISSQN.setValorDeducao(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorDescontoIncondicionado(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorOutro(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorRetencaoISS(new BigDecimal("99999999999.99"));
        impostoISSQN.toString();
    }

    @Test
    public void devePermitirValorDescontoIncondicionadoISSNulo() {
        final DFNotaInfoItemImpostoISSQN impostoISSQN = new DFNotaInfoItemImpostoISSQN();
        impostoISSQN.setCodigoMunicipio(9999999);
        impostoISSQN.setItemListaServicos("12.34");
        impostoISSQN.setValor(new BigDecimal("999999999999.99"));
        impostoISSQN.setValorAliquota(new BigDecimal("99.99"));
        impostoISSQN.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        impostoISSQN.setCodigoMunicipioIncidenciaImposto("3813816");
        impostoISSQN.setCodigoPais("8486");
        impostoISSQN.setCodigoServico("VfsQTgAm60yAqyOMUOIp");
        impostoISSQN.setIndicadorExigibilidadeISS(NFNotaInfoItemIndicadorExigibilidadeISS.EXIGIVEL);
        impostoISSQN.setIndicadorIncentivoFiscal(NFNotaInfoItemIndicadorIncentivoFiscal.SIM);
        impostoISSQN.setNumeroProcesso("Sw4CSjke5lhAzlBrzFgKuNjtrRSVfO");
        impostoISSQN.setValorDeducao(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorDescontoCondicionado(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorOutro(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorRetencaoISS(new BigDecimal("99999999999.99"));
        impostoISSQN.toString();
    }

    @Test
    public void devePermitirValorOutroISSNulo() {
        final DFNotaInfoItemImpostoISSQN impostoISSQN = new DFNotaInfoItemImpostoISSQN();
        impostoISSQN.setCodigoMunicipio(9999999);
        impostoISSQN.setItemListaServicos("12.34");
        impostoISSQN.setValor(new BigDecimal("999999999999.99"));
        impostoISSQN.setValorAliquota(new BigDecimal("99.99"));
        impostoISSQN.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        impostoISSQN.setCodigoMunicipioIncidenciaImposto("3813816");
        impostoISSQN.setCodigoPais("8486");
        impostoISSQN.setCodigoServico("VfsQTgAm60yAqyOMUOIp");
        impostoISSQN.setIndicadorExigibilidadeISS(NFNotaInfoItemIndicadorExigibilidadeISS.EXIGIVEL);
        impostoISSQN.setIndicadorIncentivoFiscal(NFNotaInfoItemIndicadorIncentivoFiscal.SIM);
        impostoISSQN.setNumeroProcesso("Sw4CSjke5lhAzlBrzFgKuNjtrRSVfO");
        impostoISSQN.setValorDeducao(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorDescontoCondicionado(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorDescontoIncondicionado(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorRetencaoISS(new BigDecimal("99999999999.99"));
        impostoISSQN.toString();
    }

    @Test
    public void devePermitirValorRetencaoISSNulo() {
        final DFNotaInfoItemImpostoISSQN impostoISSQN = new DFNotaInfoItemImpostoISSQN();
        impostoISSQN.setCodigoMunicipio(9999999);
        impostoISSQN.setItemListaServicos("12.34");
        impostoISSQN.setValor(new BigDecimal("999999999999.99"));
        impostoISSQN.setValorAliquota(new BigDecimal("99.99"));
        impostoISSQN.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        impostoISSQN.setCodigoMunicipioIncidenciaImposto("3813816");
        impostoISSQN.setCodigoPais("8486");
        impostoISSQN.setCodigoServico("VfsQTgAm60yAqyOMUOIp");
        impostoISSQN.setIndicadorExigibilidadeISS(NFNotaInfoItemIndicadorExigibilidadeISS.EXIGIVEL);
        impostoISSQN.setIndicadorIncentivoFiscal(NFNotaInfoItemIndicadorIncentivoFiscal.SIM);
        impostoISSQN.setNumeroProcesso("Sw4CSjke5lhAzlBrzFgKuNjtrRSVfO");
        impostoISSQN.setValorDeducao(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorDescontoCondicionado(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorDescontoIncondicionado(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorOutro(new BigDecimal("99999999999.99"));
        impostoISSQN.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCodigoMunicipioNulo() {
        final DFNotaInfoItemImpostoISSQN impostoISSQN = new DFNotaInfoItemImpostoISSQN();
        impostoISSQN.setItemListaServicos("12.34");
        impostoISSQN.setValor(new BigDecimal("999999999999.99"));
        impostoISSQN.setValorAliquota(new BigDecimal("99.99"));
        impostoISSQN.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        impostoISSQN.setCodigoMunicipioIncidenciaImposto("3813816");
        impostoISSQN.setCodigoPais("8486");
        impostoISSQN.setCodigoServico("VfsQTgAm60yAqyOMUOIp");
        impostoISSQN.setIndicadorExigibilidadeISS(NFNotaInfoItemIndicadorExigibilidadeISS.EXIGIVEL);
        impostoISSQN.setIndicadorIncentivoFiscal(NFNotaInfoItemIndicadorIncentivoFiscal.SIM);
        impostoISSQN.setNumeroProcesso("Sw4CSjke5lhAzlBrzFgKuNjtrRSVfO");
        impostoISSQN.setValorDeducao(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorDescontoCondicionado(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorDescontoIncondicionado(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorOutro(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorRetencaoISS(new BigDecimal("99999999999.99"));
        impostoISSQN.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirItemListaServicosNulo() {
        final DFNotaInfoItemImpostoISSQN impostoISSQN = new DFNotaInfoItemImpostoISSQN();
        impostoISSQN.setCodigoMunicipio(9999999);
        impostoISSQN.setValor(new BigDecimal("999999999999.99"));
        impostoISSQN.setValorAliquota(new BigDecimal("99.99"));
        impostoISSQN.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        impostoISSQN.setCodigoMunicipioIncidenciaImposto("3813816");
        impostoISSQN.setCodigoPais("8486");
        impostoISSQN.setCodigoServico("VfsQTgAm60yAqyOMUOIp");
        impostoISSQN.setIndicadorExigibilidadeISS(NFNotaInfoItemIndicadorExigibilidadeISS.EXIGIVEL);
        impostoISSQN.setIndicadorIncentivoFiscal(NFNotaInfoItemIndicadorIncentivoFiscal.SIM);
        impostoISSQN.setNumeroProcesso("Sw4CSjke5lhAzlBrzFgKuNjtrRSVfO");
        impostoISSQN.setValorDeducao(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorDescontoCondicionado(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorDescontoIncondicionado(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorOutro(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorRetencaoISS(new BigDecimal("99999999999.99"));
        impostoISSQN.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorNulo() {
        final DFNotaInfoItemImpostoISSQN impostoISSQN = new DFNotaInfoItemImpostoISSQN();
        impostoISSQN.setCodigoMunicipio(9999999);
        impostoISSQN.setItemListaServicos("12.34");
        impostoISSQN.setValorAliquota(new BigDecimal("99.99"));
        impostoISSQN.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        impostoISSQN.setCodigoMunicipioIncidenciaImposto("3813816");
        impostoISSQN.setCodigoPais("8486");
        impostoISSQN.setCodigoServico("VfsQTgAm60yAqyOMUOIp");
        impostoISSQN.setIndicadorExigibilidadeISS(NFNotaInfoItemIndicadorExigibilidadeISS.EXIGIVEL);
        impostoISSQN.setIndicadorIncentivoFiscal(NFNotaInfoItemIndicadorIncentivoFiscal.SIM);
        impostoISSQN.setNumeroProcesso("Sw4CSjke5lhAzlBrzFgKuNjtrRSVfO");
        impostoISSQN.setValorDeducao(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorDescontoCondicionado(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorDescontoIncondicionado(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorOutro(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorRetencaoISS(new BigDecimal("99999999999.99"));
        impostoISSQN.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorAliquotaNulo() {
        final DFNotaInfoItemImpostoISSQN impostoISSQN = new DFNotaInfoItemImpostoISSQN();
        impostoISSQN.setCodigoMunicipio(9999999);
        impostoISSQN.setItemListaServicos("12.34");
        impostoISSQN.setValor(new BigDecimal("999999999999.99"));
        impostoISSQN.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        impostoISSQN.setCodigoMunicipioIncidenciaImposto("3813816");
        impostoISSQN.setCodigoPais("8486");
        impostoISSQN.setCodigoServico("VfsQTgAm60yAqyOMUOIp");
        impostoISSQN.setIndicadorExigibilidadeISS(NFNotaInfoItemIndicadorExigibilidadeISS.EXIGIVEL);
        impostoISSQN.setIndicadorIncentivoFiscal(NFNotaInfoItemIndicadorIncentivoFiscal.SIM);
        impostoISSQN.setNumeroProcesso("Sw4CSjke5lhAzlBrzFgKuNjtrRSVfO");
        impostoISSQN.setValorDeducao(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorDescontoCondicionado(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorDescontoIncondicionado(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorOutro(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorRetencaoISS(new BigDecimal("99999999999.99"));
        impostoISSQN.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorBaseCalculoNulo() {
        final DFNotaInfoItemImpostoISSQN impostoISSQN = new DFNotaInfoItemImpostoISSQN();
        impostoISSQN.setCodigoMunicipio(9999999);
        impostoISSQN.setItemListaServicos("12.34");
        impostoISSQN.setValor(new BigDecimal("999999999999.99"));
        impostoISSQN.setValorAliquota(new BigDecimal("99.99"));
        impostoISSQN.setCodigoMunicipioIncidenciaImposto("3813816");
        impostoISSQN.setCodigoPais("8486");
        impostoISSQN.setCodigoServico("VfsQTgAm60yAqyOMUOIp");
        impostoISSQN.setIndicadorExigibilidadeISS(NFNotaInfoItemIndicadorExigibilidadeISS.EXIGIVEL);
        impostoISSQN.setIndicadorIncentivoFiscal(NFNotaInfoItemIndicadorIncentivoFiscal.SIM);
        impostoISSQN.setNumeroProcesso("Sw4CSjke5lhAzlBrzFgKuNjtrRSVfO");
        impostoISSQN.setValorDeducao(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorDescontoCondicionado(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorDescontoIncondicionado(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorOutro(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorRetencaoISS(new BigDecimal("99999999999.99"));
        impostoISSQN.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<DFNotaInfoItemImpostoISSQN><vBC>999999999999.99</vBC><vAliq>99.99</vAliq><vISSQN>999999999999.99</vISSQN><cMunFG>9999999</cMunFG><cListServ>25.01</cListServ><vDeducao>99999999999.99</vDeducao><vOutro>99999999999.99</vOutro><vDescIncond>99999999999.99</vDescIncond><vDescCond>99999999999.99</vDescCond><vISSRet>99999999999.99</vISSRet><indISS>1</indISS><cServico>VfsQTgAm60yAqyOMUOIp</cServico><cMun>3813816</cMun><cPais>8486</cPais><nProcesso>Sw4CSjke5lhAzlBrzFgKuNjtrRSVfO</nProcesso><indIncentivo>1</indIncentivo></DFNotaInfoItemImpostoISSQN>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoItemImpostoISSQN().toString());
    }
}