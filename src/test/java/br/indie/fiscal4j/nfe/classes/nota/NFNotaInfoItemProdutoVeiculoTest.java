package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import br.indie.fiscal4j.nfe.classes.*;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoItemProdutoVeiculoTest {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPotenciaComTamanhoInvalido() {
        try {
            new DFNotaInfoItemProdutoVeiculo().setPotencia("ABC");
        } catch (final IllegalStateException e) {
            new DFNotaInfoItemProdutoVeiculo().setTipoPintura("ABCDE");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirTipoPenturaComTamanhoInvalido() {
        try {
            new DFNotaInfoItemProdutoVeiculo().setTipoPintura("");
        } catch (final IllegalStateException e) {
            new DFNotaInfoItemProdutoVeiculo().setTipoPintura("A1");
        }
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPesoLiquidoComTamanhoInvalido() {
        new DFNotaInfoItemProdutoVeiculo().setPesoLiquido(new BigDecimal("100000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPesoBrutoComTamanhoInvalido() {
        new DFNotaInfoItemProdutoVeiculo().setPesoBruto(new BigDecimal("100000"));
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNumeroSerieComTamanhoInvalido() {
        try {
            new DFNotaInfoItemProdutoVeiculo().setNumeroSerie("XBxVyiVV");
        } catch (final IllegalStateException e) {
            new DFNotaInfoItemProdutoVeiculo().setNumeroSerie("XBxVyiVVD1");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNumeroMotorComTamanhoInvalido() {
        try {
            new DFNotaInfoItemProdutoVeiculo().setNumeroMotor("XBxVyiVV");
        } catch (final IllegalStateException e) {
            new DFNotaInfoItemProdutoVeiculo().setNumeroMotor("XBxVyiVVD1");
        }
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirLotacaoComTamanhoInvalido() {
        new DFNotaInfoItemProdutoVeiculo().setLotacao(1000);
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirDistanciaEntreEixosComTamanhoInvalido() {
        try {
            new DFNotaInfoItemProdutoVeiculo().setDistanciaEntreEixos("ABC");
        } catch (final IllegalStateException e) {
            new DFNotaInfoItemProdutoVeiculo().setDistanciaEntreEixos("ABCDE");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirDescricaoCorComTamanhoInvalido() {
        try {
            new DFNotaInfoItemProdutoVeiculo().setDescricaoCor("");
        } catch (final IllegalStateException e) {
            new DFNotaInfoItemProdutoVeiculo().setDescricaoCor("tjRQlvBqVsFLDWUCaOeaXRbV1ipOZH3W5H7Ic2p91");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCodigoMarcaModeloComTamanhoInvalido() {
        try {
            new DFNotaInfoItemProdutoVeiculo().setCodigoMarcaModelo("");
        } catch (final IllegalStateException e) {
            new DFNotaInfoItemProdutoVeiculo().setCodigoMarcaModelo("5425621");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCodigoCorComTamanhoInvalido() {
        try {
            new DFNotaInfoItemProdutoVeiculo().setCodigoCor("");
        } catch (final IllegalStateException e) {
            new DFNotaInfoItemProdutoVeiculo().setCodigoCor("123A1");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCilindradaComTamanhoInvalido() {
        try {
            new DFNotaInfoItemProdutoVeiculo().setCilindrada("");
        } catch (final IllegalStateException e) {
            new DFNotaInfoItemProdutoVeiculo().setCilindrada("ohNx1");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirChassiComTamanhoInvalido() {
        try {
            new DFNotaInfoItemProdutoVeiculo().setChassi("");
        } catch (final IllegalStateException e) {
            new DFNotaInfoItemProdutoVeiculo().setChassi("B31YTE9INXEYDMO4C1");
        }
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirCapacidadeMaximaTracaoComTamanhoInvalido() {
        new DFNotaInfoItemProdutoVeiculo().setCapacidadeMaximaTracao(new BigDecimal("100000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirAnoModeloFabricacaoComTamanhoInvalido() {
        try {
            new DFNotaInfoItemProdutoVeiculo().setAnoModeloFabricacao(999);
        } catch (final NumberFormatException e) {
            new DFNotaInfoItemProdutoVeiculo().setAnoModeloFabricacao(10000);
        }
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirAnoFabricacaoComTamanhoInvalido() {
        try {
            new DFNotaInfoItemProdutoVeiculo().setAnoFabricacao(999);
        } catch (final NumberFormatException e) {
            new DFNotaInfoItemProdutoVeiculo().setAnoFabricacao(10000);
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirAnoFabricacaoNulo() {
        final DFNotaInfoItemProdutoVeiculo produtoVeiculo = new DFNotaInfoItemProdutoVeiculo();
        produtoVeiculo.setAnoModeloFabricacao(2014);
        produtoVeiculo.setCapacidadeMaximaTracao(new BigDecimal("9999.9999"));
        produtoVeiculo.setChassi("B31YTE9INXEYDMO4C");
        produtoVeiculo.setCilindrada("ohNx");
        produtoVeiculo.setCodigoCor("123A");
        produtoVeiculo.setCodigoCorDENATRAN(NFNotaInfoVeiculoCor.FANTASIA);
        produtoVeiculo.setCodigoMarcaModelo("542562");
        produtoVeiculo.setCondicao(NFNotaInfoItemProdutoVeiculoCondicao.ACABADO);
        produtoVeiculo.setCondicaoChassi(NFNotaInfoItemProdutoVeiculoCondicaoChassi.NORMAL);
        produtoVeiculo.setDescricaoCor("tjRQlvBqVsFLDWUCaOeaXRbV1ipOZH3W5H7Ic2p9");
        produtoVeiculo.setDistanciaEntreEixos("9999");
        produtoVeiculo.setEspecieVeiculo(NFNotaInfoEspecieVeiculo.CORRIDA);
        produtoVeiculo.setLotacao(999);
        produtoVeiculo.setNumeroMotor("u1DU8GZRzJZzevuY49IB9");
        produtoVeiculo.setNumeroSerie("XBxVyiVVD");
        produtoVeiculo.setPesoBruto(new BigDecimal("9999.9999"));
        produtoVeiculo.setPesoLiquido(new BigDecimal("9999.9999"));
        produtoVeiculo.setPotencia("GZRz");
        produtoVeiculo.setRestricao(NFNotaInfoItemProdutoVeiculoRestricao.PENHOR);
        produtoVeiculo.setTipoCombustivel(NFNotaInfoCombustivelTipo.GASOLINA);
        produtoVeiculo.setTipoOperacao(NFNotaInfoItemProdutoVeiculoTipoOperacao.OUTROS);
        produtoVeiculo.setTipoPintura("A");
        produtoVeiculo.setTipoVeiculo(NFNotaInfoTipoVeiculo.AUTOMOVEL);
        produtoVeiculo.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirAnoModeloFabricacaoNulo() {
        final DFNotaInfoItemProdutoVeiculo produtoVeiculo = new DFNotaInfoItemProdutoVeiculo();
        produtoVeiculo.setAnoFabricacao(2014);
        produtoVeiculo.setCapacidadeMaximaTracao(new BigDecimal("9999.9999"));
        produtoVeiculo.setChassi("B31YTE9INXEYDMO4C");
        produtoVeiculo.setCilindrada("ohNx");
        produtoVeiculo.setCodigoCor("123A");
        produtoVeiculo.setCodigoCorDENATRAN(NFNotaInfoVeiculoCor.FANTASIA);
        produtoVeiculo.setCodigoMarcaModelo("542562");
        produtoVeiculo.setCondicao(NFNotaInfoItemProdutoVeiculoCondicao.ACABADO);
        produtoVeiculo.setCondicaoChassi(NFNotaInfoItemProdutoVeiculoCondicaoChassi.NORMAL);
        produtoVeiculo.setDescricaoCor("tjRQlvBqVsFLDWUCaOeaXRbV1ipOZH3W5H7Ic2p9");
        produtoVeiculo.setDistanciaEntreEixos("9999");
        produtoVeiculo.setEspecieVeiculo(NFNotaInfoEspecieVeiculo.CORRIDA);
        produtoVeiculo.setLotacao(999);
        produtoVeiculo.setNumeroMotor("u1DU8GZRzJZzevuY49IB9");
        produtoVeiculo.setNumeroSerie("XBxVyiVVD");
        produtoVeiculo.setPesoBruto(new BigDecimal("9999.9999"));
        produtoVeiculo.setPesoLiquido(new BigDecimal("9999.9999"));
        produtoVeiculo.setPotencia("GZRz");
        produtoVeiculo.setRestricao(NFNotaInfoItemProdutoVeiculoRestricao.PENHOR);
        produtoVeiculo.setTipoCombustivel(NFNotaInfoCombustivelTipo.GASOLINA);
        produtoVeiculo.setTipoOperacao(NFNotaInfoItemProdutoVeiculoTipoOperacao.OUTROS);
        produtoVeiculo.setTipoPintura("A");
        produtoVeiculo.setTipoVeiculo(NFNotaInfoTipoVeiculo.AUTOMOVEL);
        produtoVeiculo.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCapacidadeMaximaTracaoNulo() {
        final DFNotaInfoItemProdutoVeiculo produtoVeiculo = new DFNotaInfoItemProdutoVeiculo();
        produtoVeiculo.setAnoFabricacao(2014);
        produtoVeiculo.setAnoModeloFabricacao(2014);
        produtoVeiculo.setChassi("B31YTE9INXEYDMO4C");
        produtoVeiculo.setCilindrada("ohNx");
        produtoVeiculo.setCodigoCor("123A");
        produtoVeiculo.setCodigoCorDENATRAN(NFNotaInfoVeiculoCor.FANTASIA);
        produtoVeiculo.setCodigoMarcaModelo("542562");
        produtoVeiculo.setCondicao(NFNotaInfoItemProdutoVeiculoCondicao.ACABADO);
        produtoVeiculo.setCondicaoChassi(NFNotaInfoItemProdutoVeiculoCondicaoChassi.NORMAL);
        produtoVeiculo.setDescricaoCor("tjRQlvBqVsFLDWUCaOeaXRbV1ipOZH3W5H7Ic2p9");
        produtoVeiculo.setDistanciaEntreEixos("9999");
        produtoVeiculo.setEspecieVeiculo(NFNotaInfoEspecieVeiculo.CORRIDA);
        produtoVeiculo.setLotacao(999);
        produtoVeiculo.setNumeroMotor("u1DU8GZRzJZzevuY49IB9");
        produtoVeiculo.setNumeroSerie("XBxVyiVVD");
        produtoVeiculo.setPesoBruto(new BigDecimal("9999.9999"));
        produtoVeiculo.setPesoLiquido(new BigDecimal("9999.9999"));
        produtoVeiculo.setPotencia("GZRz");
        produtoVeiculo.setRestricao(NFNotaInfoItemProdutoVeiculoRestricao.PENHOR);
        produtoVeiculo.setTipoCombustivel(NFNotaInfoCombustivelTipo.GASOLINA);
        produtoVeiculo.setTipoOperacao(NFNotaInfoItemProdutoVeiculoTipoOperacao.OUTROS);
        produtoVeiculo.setTipoPintura("A");
        produtoVeiculo.setTipoVeiculo(NFNotaInfoTipoVeiculo.AUTOMOVEL);
        produtoVeiculo.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirChassiNulo() {
        final DFNotaInfoItemProdutoVeiculo produtoVeiculo = new DFNotaInfoItemProdutoVeiculo();
        produtoVeiculo.setAnoFabricacao(2014);
        produtoVeiculo.setAnoModeloFabricacao(2014);
        produtoVeiculo.setCapacidadeMaximaTracao(new BigDecimal("9999.9999"));
        produtoVeiculo.setCilindrada("ohNx");
        produtoVeiculo.setCodigoCor("123A");
        produtoVeiculo.setCodigoCorDENATRAN(NFNotaInfoVeiculoCor.FANTASIA);
        produtoVeiculo.setCodigoMarcaModelo("542562");
        produtoVeiculo.setCondicao(NFNotaInfoItemProdutoVeiculoCondicao.ACABADO);
        produtoVeiculo.setCondicaoChassi(NFNotaInfoItemProdutoVeiculoCondicaoChassi.NORMAL);
        produtoVeiculo.setDescricaoCor("tjRQlvBqVsFLDWUCaOeaXRbV1ipOZH3W5H7Ic2p9");
        produtoVeiculo.setDistanciaEntreEixos("9999");
        produtoVeiculo.setEspecieVeiculo(NFNotaInfoEspecieVeiculo.CORRIDA);
        produtoVeiculo.setLotacao(999);
        produtoVeiculo.setNumeroMotor("u1DU8GZRzJZzevuY49IB9");
        produtoVeiculo.setNumeroSerie("XBxVyiVVD");
        produtoVeiculo.setPesoBruto(new BigDecimal("9999.9999"));
        produtoVeiculo.setPesoLiquido(new BigDecimal("9999.9999"));
        produtoVeiculo.setPotencia("GZRz");
        produtoVeiculo.setRestricao(NFNotaInfoItemProdutoVeiculoRestricao.PENHOR);
        produtoVeiculo.setTipoCombustivel(NFNotaInfoCombustivelTipo.GASOLINA);
        produtoVeiculo.setTipoOperacao(NFNotaInfoItemProdutoVeiculoTipoOperacao.OUTROS);
        produtoVeiculo.setTipoPintura("A");
        produtoVeiculo.setTipoVeiculo(NFNotaInfoTipoVeiculo.AUTOMOVEL);
        produtoVeiculo.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCilindradaNulo() {
        final DFNotaInfoItemProdutoVeiculo produtoVeiculo = new DFNotaInfoItemProdutoVeiculo();
        produtoVeiculo.setAnoFabricacao(2014);
        produtoVeiculo.setAnoModeloFabricacao(2014);
        produtoVeiculo.setCapacidadeMaximaTracao(new BigDecimal("9999.9999"));
        produtoVeiculo.setChassi("B31YTE9INXEYDMO4C");
        produtoVeiculo.setCodigoCor("123A");
        produtoVeiculo.setCodigoCorDENATRAN(NFNotaInfoVeiculoCor.FANTASIA);
        produtoVeiculo.setCodigoMarcaModelo("542562");
        produtoVeiculo.setCondicao(NFNotaInfoItemProdutoVeiculoCondicao.ACABADO);
        produtoVeiculo.setCondicaoChassi(NFNotaInfoItemProdutoVeiculoCondicaoChassi.NORMAL);
        produtoVeiculo.setDescricaoCor("tjRQlvBqVsFLDWUCaOeaXRbV1ipOZH3W5H7Ic2p9");
        produtoVeiculo.setDistanciaEntreEixos("9999");
        produtoVeiculo.setEspecieVeiculo(NFNotaInfoEspecieVeiculo.CORRIDA);
        produtoVeiculo.setLotacao(999);
        produtoVeiculo.setNumeroMotor("u1DU8GZRzJZzevuY49IB9");
        produtoVeiculo.setNumeroSerie("XBxVyiVVD");
        produtoVeiculo.setPesoBruto(new BigDecimal("9999.9999"));
        produtoVeiculo.setPesoLiquido(new BigDecimal("9999.9999"));
        produtoVeiculo.setPotencia("GZRz");
        produtoVeiculo.setRestricao(NFNotaInfoItemProdutoVeiculoRestricao.PENHOR);
        produtoVeiculo.setTipoCombustivel(NFNotaInfoCombustivelTipo.GASOLINA);
        produtoVeiculo.setTipoOperacao(NFNotaInfoItemProdutoVeiculoTipoOperacao.OUTROS);
        produtoVeiculo.setTipoPintura("A");
        produtoVeiculo.setTipoVeiculo(NFNotaInfoTipoVeiculo.AUTOMOVEL);
        produtoVeiculo.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCodigoCorNulo() {
        final DFNotaInfoItemProdutoVeiculo produtoVeiculo = new DFNotaInfoItemProdutoVeiculo();
        produtoVeiculo.setAnoFabricacao(2014);
        produtoVeiculo.setAnoModeloFabricacao(2014);
        produtoVeiculo.setCapacidadeMaximaTracao(new BigDecimal("9999.9999"));
        produtoVeiculo.setChassi("B31YTE9INXEYDMO4C");
        produtoVeiculo.setCilindrada("ohNx");
        produtoVeiculo.setCodigoCorDENATRAN(NFNotaInfoVeiculoCor.FANTASIA);
        produtoVeiculo.setCodigoMarcaModelo("542562");
        produtoVeiculo.setCondicao(NFNotaInfoItemProdutoVeiculoCondicao.ACABADO);
        produtoVeiculo.setCondicaoChassi(NFNotaInfoItemProdutoVeiculoCondicaoChassi.NORMAL);
        produtoVeiculo.setDescricaoCor("tjRQlvBqVsFLDWUCaOeaXRbV1ipOZH3W5H7Ic2p9");
        produtoVeiculo.setDistanciaEntreEixos("9999");
        produtoVeiculo.setEspecieVeiculo(NFNotaInfoEspecieVeiculo.CORRIDA);
        produtoVeiculo.setLotacao(999);
        produtoVeiculo.setNumeroMotor("u1DU8GZRzJZzevuY49IB9");
        produtoVeiculo.setNumeroSerie("XBxVyiVVD");
        produtoVeiculo.setPesoBruto(new BigDecimal("9999.9999"));
        produtoVeiculo.setPesoLiquido(new BigDecimal("9999.9999"));
        produtoVeiculo.setPotencia("GZRz");
        produtoVeiculo.setRestricao(NFNotaInfoItemProdutoVeiculoRestricao.PENHOR);
        produtoVeiculo.setTipoCombustivel(NFNotaInfoCombustivelTipo.GASOLINA);
        produtoVeiculo.setTipoOperacao(NFNotaInfoItemProdutoVeiculoTipoOperacao.OUTROS);
        produtoVeiculo.setTipoPintura("A");
        produtoVeiculo.setTipoVeiculo(NFNotaInfoTipoVeiculo.AUTOMOVEL);
        produtoVeiculo.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCodigoCorDENATRANNulo() {
        final DFNotaInfoItemProdutoVeiculo produtoVeiculo = new DFNotaInfoItemProdutoVeiculo();
        produtoVeiculo.setAnoFabricacao(2014);
        produtoVeiculo.setAnoModeloFabricacao(2014);
        produtoVeiculo.setCapacidadeMaximaTracao(new BigDecimal("9999.9999"));
        produtoVeiculo.setChassi("B31YTE9INXEYDMO4C");
        produtoVeiculo.setCilindrada("ohNx");
        produtoVeiculo.setCodigoCor("123A");
        produtoVeiculo.setCodigoMarcaModelo("542562");
        produtoVeiculo.setCondicao(NFNotaInfoItemProdutoVeiculoCondicao.ACABADO);
        produtoVeiculo.setCondicaoChassi(NFNotaInfoItemProdutoVeiculoCondicaoChassi.NORMAL);
        produtoVeiculo.setDescricaoCor("tjRQlvBqVsFLDWUCaOeaXRbV1ipOZH3W5H7Ic2p9");
        produtoVeiculo.setDistanciaEntreEixos("9999");
        produtoVeiculo.setEspecieVeiculo(NFNotaInfoEspecieVeiculo.CORRIDA);
        produtoVeiculo.setLotacao(999);
        produtoVeiculo.setNumeroMotor("u1DU8GZRzJZzevuY49IB9");
        produtoVeiculo.setNumeroSerie("XBxVyiVVD");
        produtoVeiculo.setPesoBruto(new BigDecimal("9999.9999"));
        produtoVeiculo.setPesoLiquido(new BigDecimal("9999.9999"));
        produtoVeiculo.setPotencia("GZRz");
        produtoVeiculo.setRestricao(NFNotaInfoItemProdutoVeiculoRestricao.PENHOR);
        produtoVeiculo.setTipoCombustivel(NFNotaInfoCombustivelTipo.GASOLINA);
        produtoVeiculo.setTipoOperacao(NFNotaInfoItemProdutoVeiculoTipoOperacao.OUTROS);
        produtoVeiculo.setTipoPintura("A");
        produtoVeiculo.setTipoVeiculo(NFNotaInfoTipoVeiculo.AUTOMOVEL);
        produtoVeiculo.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCodigoMarcaModeloNulo() {
        final DFNotaInfoItemProdutoVeiculo produtoVeiculo = new DFNotaInfoItemProdutoVeiculo();
        produtoVeiculo.setAnoFabricacao(2014);
        produtoVeiculo.setAnoModeloFabricacao(2014);
        produtoVeiculo.setCapacidadeMaximaTracao(new BigDecimal("9999.9999"));
        produtoVeiculo.setChassi("B31YTE9INXEYDMO4C");
        produtoVeiculo.setCilindrada("ohNx");
        produtoVeiculo.setCodigoCor("123A");
        produtoVeiculo.setCodigoCorDENATRAN(NFNotaInfoVeiculoCor.FANTASIA);
        produtoVeiculo.setCondicao(NFNotaInfoItemProdutoVeiculoCondicao.ACABADO);
        produtoVeiculo.setCondicaoChassi(NFNotaInfoItemProdutoVeiculoCondicaoChassi.NORMAL);
        produtoVeiculo.setDescricaoCor("tjRQlvBqVsFLDWUCaOeaXRbV1ipOZH3W5H7Ic2p9");
        produtoVeiculo.setDistanciaEntreEixos("9999");
        produtoVeiculo.setEspecieVeiculo(NFNotaInfoEspecieVeiculo.CORRIDA);
        produtoVeiculo.setLotacao(999);
        produtoVeiculo.setNumeroMotor("u1DU8GZRzJZzevuY49IB9");
        produtoVeiculo.setNumeroSerie("XBxVyiVVD");
        produtoVeiculo.setPesoBruto(new BigDecimal("9999.9999"));
        produtoVeiculo.setPesoLiquido(new BigDecimal("9999.9999"));
        produtoVeiculo.setPotencia("GZRz");
        produtoVeiculo.setRestricao(NFNotaInfoItemProdutoVeiculoRestricao.PENHOR);
        produtoVeiculo.setTipoCombustivel(NFNotaInfoCombustivelTipo.GASOLINA);
        produtoVeiculo.setTipoOperacao(NFNotaInfoItemProdutoVeiculoTipoOperacao.OUTROS);
        produtoVeiculo.setTipoPintura("A");
        produtoVeiculo.setTipoVeiculo(NFNotaInfoTipoVeiculo.AUTOMOVEL);
        produtoVeiculo.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCondicaoNulo() {
        final DFNotaInfoItemProdutoVeiculo produtoVeiculo = new DFNotaInfoItemProdutoVeiculo();
        produtoVeiculo.setAnoFabricacao(2014);
        produtoVeiculo.setAnoModeloFabricacao(2014);
        produtoVeiculo.setCapacidadeMaximaTracao(new BigDecimal("9999.9999"));
        produtoVeiculo.setChassi("B31YTE9INXEYDMO4C");
        produtoVeiculo.setCilindrada("ohNx");
        produtoVeiculo.setCodigoCor("123A");
        produtoVeiculo.setCodigoCorDENATRAN(NFNotaInfoVeiculoCor.FANTASIA);
        produtoVeiculo.setCodigoMarcaModelo("542562");
        produtoVeiculo.setCondicaoChassi(NFNotaInfoItemProdutoVeiculoCondicaoChassi.NORMAL);
        produtoVeiculo.setDescricaoCor("tjRQlvBqVsFLDWUCaOeaXRbV1ipOZH3W5H7Ic2p9");
        produtoVeiculo.setDistanciaEntreEixos("9999");
        produtoVeiculo.setEspecieVeiculo(NFNotaInfoEspecieVeiculo.CORRIDA);
        produtoVeiculo.setLotacao(999);
        produtoVeiculo.setNumeroMotor("u1DU8GZRzJZzevuY49IB9");
        produtoVeiculo.setNumeroSerie("XBxVyiVVD");
        produtoVeiculo.setPesoBruto(new BigDecimal("9999.9999"));
        produtoVeiculo.setPesoLiquido(new BigDecimal("9999.9999"));
        produtoVeiculo.setPotencia("GZRz");
        produtoVeiculo.setRestricao(NFNotaInfoItemProdutoVeiculoRestricao.PENHOR);
        produtoVeiculo.setTipoCombustivel(NFNotaInfoCombustivelTipo.GASOLINA);
        produtoVeiculo.setTipoOperacao(NFNotaInfoItemProdutoVeiculoTipoOperacao.OUTROS);
        produtoVeiculo.setTipoPintura("A");
        produtoVeiculo.setTipoVeiculo(NFNotaInfoTipoVeiculo.AUTOMOVEL);
        produtoVeiculo.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCondicaoChassiNulo() {
        final DFNotaInfoItemProdutoVeiculo produtoVeiculo = new DFNotaInfoItemProdutoVeiculo();
        produtoVeiculo.setAnoFabricacao(2014);
        produtoVeiculo.setAnoModeloFabricacao(2014);
        produtoVeiculo.setCapacidadeMaximaTracao(new BigDecimal("9999.9999"));
        produtoVeiculo.setChassi("B31YTE9INXEYDMO4C");
        produtoVeiculo.setCilindrada("ohNx");
        produtoVeiculo.setCodigoCor("123A");
        produtoVeiculo.setCodigoCorDENATRAN(NFNotaInfoVeiculoCor.FANTASIA);
        produtoVeiculo.setCodigoMarcaModelo("542562");
        produtoVeiculo.setCondicao(NFNotaInfoItemProdutoVeiculoCondicao.ACABADO);
        produtoVeiculo.setDescricaoCor("tjRQlvBqVsFLDWUCaOeaXRbV1ipOZH3W5H7Ic2p9");
        produtoVeiculo.setDistanciaEntreEixos("9999");
        produtoVeiculo.setEspecieVeiculo(NFNotaInfoEspecieVeiculo.CORRIDA);
        produtoVeiculo.setLotacao(999);
        produtoVeiculo.setNumeroMotor("u1DU8GZRzJZzevuY49IB9");
        produtoVeiculo.setNumeroSerie("XBxVyiVVD");
        produtoVeiculo.setPesoBruto(new BigDecimal("9999.9999"));
        produtoVeiculo.setPesoLiquido(new BigDecimal("9999.9999"));
        produtoVeiculo.setPotencia("GZRz");
        produtoVeiculo.setRestricao(NFNotaInfoItemProdutoVeiculoRestricao.PENHOR);
        produtoVeiculo.setTipoCombustivel(NFNotaInfoCombustivelTipo.GASOLINA);
        produtoVeiculo.setTipoOperacao(NFNotaInfoItemProdutoVeiculoTipoOperacao.OUTROS);
        produtoVeiculo.setTipoPintura("A");
        produtoVeiculo.setTipoVeiculo(NFNotaInfoTipoVeiculo.AUTOMOVEL);
        produtoVeiculo.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirDescricaoCorNulo() {
        final DFNotaInfoItemProdutoVeiculo produtoVeiculo = new DFNotaInfoItemProdutoVeiculo();
        produtoVeiculo.setAnoFabricacao(2014);
        produtoVeiculo.setAnoModeloFabricacao(2014);
        produtoVeiculo.setCapacidadeMaximaTracao(new BigDecimal("9999.9999"));
        produtoVeiculo.setChassi("B31YTE9INXEYDMO4C");
        produtoVeiculo.setCilindrada("ohNx");
        produtoVeiculo.setCodigoCor("123A");
        produtoVeiculo.setCodigoCorDENATRAN(NFNotaInfoVeiculoCor.FANTASIA);
        produtoVeiculo.setCodigoMarcaModelo("542562");
        produtoVeiculo.setCondicao(NFNotaInfoItemProdutoVeiculoCondicao.ACABADO);
        produtoVeiculo.setCondicaoChassi(NFNotaInfoItemProdutoVeiculoCondicaoChassi.NORMAL);
        produtoVeiculo.setDistanciaEntreEixos("9999");
        produtoVeiculo.setEspecieVeiculo(NFNotaInfoEspecieVeiculo.CORRIDA);
        produtoVeiculo.setLotacao(999);
        produtoVeiculo.setNumeroMotor("u1DU8GZRzJZzevuY49IB9");
        produtoVeiculo.setNumeroSerie("XBxVyiVVD");
        produtoVeiculo.setPesoBruto(new BigDecimal("9999.9999"));
        produtoVeiculo.setPesoLiquido(new BigDecimal("9999.9999"));
        produtoVeiculo.setPotencia("GZRz");
        produtoVeiculo.setRestricao(NFNotaInfoItemProdutoVeiculoRestricao.PENHOR);
        produtoVeiculo.setTipoCombustivel(NFNotaInfoCombustivelTipo.GASOLINA);
        produtoVeiculo.setTipoOperacao(NFNotaInfoItemProdutoVeiculoTipoOperacao.OUTROS);
        produtoVeiculo.setTipoPintura("A");
        produtoVeiculo.setTipoVeiculo(NFNotaInfoTipoVeiculo.AUTOMOVEL);
        produtoVeiculo.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirDistanciaEntreEixosNulo() {
        final DFNotaInfoItemProdutoVeiculo produtoVeiculo = new DFNotaInfoItemProdutoVeiculo();
        produtoVeiculo.setAnoFabricacao(2014);
        produtoVeiculo.setAnoModeloFabricacao(2014);
        produtoVeiculo.setCapacidadeMaximaTracao(new BigDecimal("9999.9999"));
        produtoVeiculo.setChassi("B31YTE9INXEYDMO4C");
        produtoVeiculo.setCilindrada("ohNx");
        produtoVeiculo.setCodigoCor("123A");
        produtoVeiculo.setCodigoCorDENATRAN(NFNotaInfoVeiculoCor.FANTASIA);
        produtoVeiculo.setCodigoMarcaModelo("542562");
        produtoVeiculo.setCondicao(NFNotaInfoItemProdutoVeiculoCondicao.ACABADO);
        produtoVeiculo.setCondicaoChassi(NFNotaInfoItemProdutoVeiculoCondicaoChassi.NORMAL);
        produtoVeiculo.setDescricaoCor("tjRQlvBqVsFLDWUCaOeaXRbV1ipOZH3W5H7Ic2p9");
        produtoVeiculo.setEspecieVeiculo(NFNotaInfoEspecieVeiculo.CORRIDA);
        produtoVeiculo.setLotacao(999);
        produtoVeiculo.setNumeroMotor("u1DU8GZRzJZzevuY49IB9");
        produtoVeiculo.setNumeroSerie("XBxVyiVVD");
        produtoVeiculo.setPesoBruto(new BigDecimal("9999.9999"));
        produtoVeiculo.setPesoLiquido(new BigDecimal("9999.9999"));
        produtoVeiculo.setPotencia("GZRz");
        produtoVeiculo.setRestricao(NFNotaInfoItemProdutoVeiculoRestricao.PENHOR);
        produtoVeiculo.setTipoCombustivel(NFNotaInfoCombustivelTipo.GASOLINA);
        produtoVeiculo.setTipoOperacao(NFNotaInfoItemProdutoVeiculoTipoOperacao.OUTROS);
        produtoVeiculo.setTipoPintura("A");
        produtoVeiculo.setTipoVeiculo(NFNotaInfoTipoVeiculo.AUTOMOVEL);
        produtoVeiculo.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirEspecieVeiculoNulo() {
        final DFNotaInfoItemProdutoVeiculo produtoVeiculo = new DFNotaInfoItemProdutoVeiculo();
        produtoVeiculo.setAnoFabricacao(2014);
        produtoVeiculo.setAnoModeloFabricacao(2014);
        produtoVeiculo.setCapacidadeMaximaTracao(new BigDecimal("9999.9999"));
        produtoVeiculo.setChassi("B31YTE9INXEYDMO4C");
        produtoVeiculo.setCilindrada("ohNx");
        produtoVeiculo.setCodigoCor("123A");
        produtoVeiculo.setCodigoCorDENATRAN(NFNotaInfoVeiculoCor.FANTASIA);
        produtoVeiculo.setCodigoMarcaModelo("542562");
        produtoVeiculo.setCondicao(NFNotaInfoItemProdutoVeiculoCondicao.ACABADO);
        produtoVeiculo.setCondicaoChassi(NFNotaInfoItemProdutoVeiculoCondicaoChassi.NORMAL);
        produtoVeiculo.setDescricaoCor("tjRQlvBqVsFLDWUCaOeaXRbV1ipOZH3W5H7Ic2p9");
        produtoVeiculo.setDistanciaEntreEixos("9999");
        produtoVeiculo.setLotacao(999);
        produtoVeiculo.setNumeroMotor("u1DU8GZRzJZzevuY49IB9");
        produtoVeiculo.setNumeroSerie("XBxVyiVVD");
        produtoVeiculo.setPesoBruto(new BigDecimal("9999.9999"));
        produtoVeiculo.setPesoLiquido(new BigDecimal("9999.9999"));
        produtoVeiculo.setPotencia("GZRz");
        produtoVeiculo.setRestricao(NFNotaInfoItemProdutoVeiculoRestricao.PENHOR);
        produtoVeiculo.setTipoCombustivel(NFNotaInfoCombustivelTipo.GASOLINA);
        produtoVeiculo.setTipoOperacao(NFNotaInfoItemProdutoVeiculoTipoOperacao.OUTROS);
        produtoVeiculo.setTipoPintura("A");
        produtoVeiculo.setTipoVeiculo(NFNotaInfoTipoVeiculo.AUTOMOVEL);
        produtoVeiculo.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirLotacaoNulo() {
        final DFNotaInfoItemProdutoVeiculo produtoVeiculo = new DFNotaInfoItemProdutoVeiculo();
        produtoVeiculo.setAnoFabricacao(2014);
        produtoVeiculo.setAnoModeloFabricacao(2014);
        produtoVeiculo.setCapacidadeMaximaTracao(new BigDecimal("9999.9999"));
        produtoVeiculo.setChassi("B31YTE9INXEYDMO4C");
        produtoVeiculo.setCilindrada("ohNx");
        produtoVeiculo.setCodigoCor("123A");
        produtoVeiculo.setCodigoCorDENATRAN(NFNotaInfoVeiculoCor.FANTASIA);
        produtoVeiculo.setCodigoMarcaModelo("542562");
        produtoVeiculo.setCondicao(NFNotaInfoItemProdutoVeiculoCondicao.ACABADO);
        produtoVeiculo.setCondicaoChassi(NFNotaInfoItemProdutoVeiculoCondicaoChassi.NORMAL);
        produtoVeiculo.setDescricaoCor("tjRQlvBqVsFLDWUCaOeaXRbV1ipOZH3W5H7Ic2p9");
        produtoVeiculo.setDistanciaEntreEixos("9999");
        produtoVeiculo.setEspecieVeiculo(NFNotaInfoEspecieVeiculo.CORRIDA);
        produtoVeiculo.setNumeroMotor("u1DU8GZRzJZzevuY49IB9");
        produtoVeiculo.setNumeroSerie("XBxVyiVVD");
        produtoVeiculo.setPesoBruto(new BigDecimal("9999.9999"));
        produtoVeiculo.setPesoLiquido(new BigDecimal("9999.9999"));
        produtoVeiculo.setPotencia("GZRz");
        produtoVeiculo.setRestricao(NFNotaInfoItemProdutoVeiculoRestricao.PENHOR);
        produtoVeiculo.setTipoCombustivel(NFNotaInfoCombustivelTipo.GASOLINA);
        produtoVeiculo.setTipoOperacao(NFNotaInfoItemProdutoVeiculoTipoOperacao.OUTROS);
        produtoVeiculo.setTipoPintura("A");
        produtoVeiculo.setTipoVeiculo(NFNotaInfoTipoVeiculo.AUTOMOVEL);
        produtoVeiculo.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNumeroMotorNulo() {
        final DFNotaInfoItemProdutoVeiculo produtoVeiculo = new DFNotaInfoItemProdutoVeiculo();
        produtoVeiculo.setAnoFabricacao(2014);
        produtoVeiculo.setAnoModeloFabricacao(2014);
        produtoVeiculo.setCapacidadeMaximaTracao(new BigDecimal("9999.9999"));
        produtoVeiculo.setChassi("B31YTE9INXEYDMO4C");
        produtoVeiculo.setCilindrada("ohNx");
        produtoVeiculo.setCodigoCor("123A");
        produtoVeiculo.setCodigoCorDENATRAN(NFNotaInfoVeiculoCor.FANTASIA);
        produtoVeiculo.setCodigoMarcaModelo("542562");
        produtoVeiculo.setCondicao(NFNotaInfoItemProdutoVeiculoCondicao.ACABADO);
        produtoVeiculo.setCondicaoChassi(NFNotaInfoItemProdutoVeiculoCondicaoChassi.NORMAL);
        produtoVeiculo.setDescricaoCor("tjRQlvBqVsFLDWUCaOeaXRbV1ipOZH3W5H7Ic2p9");
        produtoVeiculo.setDistanciaEntreEixos("9999");
        produtoVeiculo.setEspecieVeiculo(NFNotaInfoEspecieVeiculo.CORRIDA);
        produtoVeiculo.setLotacao(999);
        produtoVeiculo.setNumeroSerie("XBxVyiVVD");
        produtoVeiculo.setPesoBruto(new BigDecimal("9999.9999"));
        produtoVeiculo.setPesoLiquido(new BigDecimal("9999.9999"));
        produtoVeiculo.setPotencia("GZRz");
        produtoVeiculo.setRestricao(NFNotaInfoItemProdutoVeiculoRestricao.PENHOR);
        produtoVeiculo.setTipoCombustivel(NFNotaInfoCombustivelTipo.GASOLINA);
        produtoVeiculo.setTipoOperacao(NFNotaInfoItemProdutoVeiculoTipoOperacao.OUTROS);
        produtoVeiculo.setTipoPintura("A");
        produtoVeiculo.setTipoVeiculo(NFNotaInfoTipoVeiculo.AUTOMOVEL);
        produtoVeiculo.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNumeroSerieNulo() {
        final DFNotaInfoItemProdutoVeiculo produtoVeiculo = new DFNotaInfoItemProdutoVeiculo();
        produtoVeiculo.setAnoFabricacao(2014);
        produtoVeiculo.setAnoModeloFabricacao(2014);
        produtoVeiculo.setCapacidadeMaximaTracao(new BigDecimal("9999.9999"));
        produtoVeiculo.setChassi("B31YTE9INXEYDMO4C");
        produtoVeiculo.setCilindrada("ohNx");
        produtoVeiculo.setCodigoCor("123A");
        produtoVeiculo.setCodigoCorDENATRAN(NFNotaInfoVeiculoCor.FANTASIA);
        produtoVeiculo.setCodigoMarcaModelo("542562");
        produtoVeiculo.setCondicao(NFNotaInfoItemProdutoVeiculoCondicao.ACABADO);
        produtoVeiculo.setCondicaoChassi(NFNotaInfoItemProdutoVeiculoCondicaoChassi.NORMAL);
        produtoVeiculo.setDescricaoCor("tjRQlvBqVsFLDWUCaOeaXRbV1ipOZH3W5H7Ic2p9");
        produtoVeiculo.setDistanciaEntreEixos("9999");
        produtoVeiculo.setEspecieVeiculo(NFNotaInfoEspecieVeiculo.CORRIDA);
        produtoVeiculo.setLotacao(999);
        produtoVeiculo.setNumeroMotor("u1DU8GZRzJZzevuY49IB9");
        produtoVeiculo.setPesoBruto(new BigDecimal("9999.9999"));
        produtoVeiculo.setPesoLiquido(new BigDecimal("9999.9999"));
        produtoVeiculo.setPotencia("GZRz");
        produtoVeiculo.setRestricao(NFNotaInfoItemProdutoVeiculoRestricao.PENHOR);
        produtoVeiculo.setTipoCombustivel(NFNotaInfoCombustivelTipo.GASOLINA);
        produtoVeiculo.setTipoOperacao(NFNotaInfoItemProdutoVeiculoTipoOperacao.OUTROS);
        produtoVeiculo.setTipoPintura("A");
        produtoVeiculo.setTipoVeiculo(NFNotaInfoTipoVeiculo.AUTOMOVEL);
        produtoVeiculo.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPesoBrutoNulo() {
        final DFNotaInfoItemProdutoVeiculo produtoVeiculo = new DFNotaInfoItemProdutoVeiculo();
        produtoVeiculo.setAnoFabricacao(2014);
        produtoVeiculo.setAnoModeloFabricacao(2014);
        produtoVeiculo.setCapacidadeMaximaTracao(new BigDecimal("9999.9999"));
        produtoVeiculo.setChassi("B31YTE9INXEYDMO4C");
        produtoVeiculo.setCilindrada("ohNx");
        produtoVeiculo.setCodigoCor("123A");
        produtoVeiculo.setCodigoCorDENATRAN(NFNotaInfoVeiculoCor.FANTASIA);
        produtoVeiculo.setCodigoMarcaModelo("542562");
        produtoVeiculo.setCondicao(NFNotaInfoItemProdutoVeiculoCondicao.ACABADO);
        produtoVeiculo.setCondicaoChassi(NFNotaInfoItemProdutoVeiculoCondicaoChassi.NORMAL);
        produtoVeiculo.setDescricaoCor("tjRQlvBqVsFLDWUCaOeaXRbV1ipOZH3W5H7Ic2p9");
        produtoVeiculo.setDistanciaEntreEixos("9999");
        produtoVeiculo.setEspecieVeiculo(NFNotaInfoEspecieVeiculo.CORRIDA);
        produtoVeiculo.setLotacao(999);
        produtoVeiculo.setNumeroMotor("u1DU8GZRzJZzevuY49IB9");
        produtoVeiculo.setNumeroSerie("XBxVyiVVD");
        produtoVeiculo.setPesoLiquido(new BigDecimal("9999.9999"));
        produtoVeiculo.setPotencia("GZRz");
        produtoVeiculo.setRestricao(NFNotaInfoItemProdutoVeiculoRestricao.PENHOR);
        produtoVeiculo.setTipoCombustivel(NFNotaInfoCombustivelTipo.GASOLINA);
        produtoVeiculo.setTipoOperacao(NFNotaInfoItemProdutoVeiculoTipoOperacao.OUTROS);
        produtoVeiculo.setTipoPintura("A");
        produtoVeiculo.setTipoVeiculo(NFNotaInfoTipoVeiculo.AUTOMOVEL);
        produtoVeiculo.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPesoLiquidoNulo() {
        final DFNotaInfoItemProdutoVeiculo produtoVeiculo = new DFNotaInfoItemProdutoVeiculo();
        produtoVeiculo.setAnoFabricacao(2014);
        produtoVeiculo.setAnoModeloFabricacao(2014);
        produtoVeiculo.setCapacidadeMaximaTracao(new BigDecimal("9999.9999"));
        produtoVeiculo.setChassi("B31YTE9INXEYDMO4C");
        produtoVeiculo.setCilindrada("ohNx");
        produtoVeiculo.setCodigoCor("123A");
        produtoVeiculo.setCodigoCorDENATRAN(NFNotaInfoVeiculoCor.FANTASIA);
        produtoVeiculo.setCodigoMarcaModelo("542562");
        produtoVeiculo.setCondicao(NFNotaInfoItemProdutoVeiculoCondicao.ACABADO);
        produtoVeiculo.setCondicaoChassi(NFNotaInfoItemProdutoVeiculoCondicaoChassi.NORMAL);
        produtoVeiculo.setDescricaoCor("tjRQlvBqVsFLDWUCaOeaXRbV1ipOZH3W5H7Ic2p9");
        produtoVeiculo.setDistanciaEntreEixos("9999");
        produtoVeiculo.setEspecieVeiculo(NFNotaInfoEspecieVeiculo.CORRIDA);
        produtoVeiculo.setLotacao(999);
        produtoVeiculo.setNumeroMotor("u1DU8GZRzJZzevuY49IB9");
        produtoVeiculo.setNumeroSerie("XBxVyiVVD");
        produtoVeiculo.setPesoBruto(new BigDecimal("9999.9999"));
        produtoVeiculo.setPotencia("GZRz");
        produtoVeiculo.setRestricao(NFNotaInfoItemProdutoVeiculoRestricao.PENHOR);
        produtoVeiculo.setTipoCombustivel(NFNotaInfoCombustivelTipo.GASOLINA);
        produtoVeiculo.setTipoOperacao(NFNotaInfoItemProdutoVeiculoTipoOperacao.OUTROS);
        produtoVeiculo.setTipoPintura("A");
        produtoVeiculo.setTipoVeiculo(NFNotaInfoTipoVeiculo.AUTOMOVEL);
        produtoVeiculo.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPotenciaNulo() {
        final DFNotaInfoItemProdutoVeiculo produtoVeiculo = new DFNotaInfoItemProdutoVeiculo();
        produtoVeiculo.setAnoFabricacao(2014);
        produtoVeiculo.setAnoModeloFabricacao(2014);
        produtoVeiculo.setCapacidadeMaximaTracao(new BigDecimal("9999.9999"));
        produtoVeiculo.setChassi("B31YTE9INXEYDMO4C");
        produtoVeiculo.setCilindrada("ohNx");
        produtoVeiculo.setCodigoCor("123A");
        produtoVeiculo.setCodigoCorDENATRAN(NFNotaInfoVeiculoCor.FANTASIA);
        produtoVeiculo.setCodigoMarcaModelo("542562");
        produtoVeiculo.setCondicao(NFNotaInfoItemProdutoVeiculoCondicao.ACABADO);
        produtoVeiculo.setCondicaoChassi(NFNotaInfoItemProdutoVeiculoCondicaoChassi.NORMAL);
        produtoVeiculo.setDescricaoCor("tjRQlvBqVsFLDWUCaOeaXRbV1ipOZH3W5H7Ic2p9");
        produtoVeiculo.setDistanciaEntreEixos("9999");
        produtoVeiculo.setEspecieVeiculo(NFNotaInfoEspecieVeiculo.CORRIDA);
        produtoVeiculo.setLotacao(999);
        produtoVeiculo.setNumeroMotor("u1DU8GZRzJZzevuY49IB9");
        produtoVeiculo.setNumeroSerie("XBxVyiVVD");
        produtoVeiculo.setPesoBruto(new BigDecimal("9999.9999"));
        produtoVeiculo.setPesoLiquido(new BigDecimal("9999.9999"));
        produtoVeiculo.setRestricao(NFNotaInfoItemProdutoVeiculoRestricao.PENHOR);
        produtoVeiculo.setTipoCombustivel(NFNotaInfoCombustivelTipo.GASOLINA);
        produtoVeiculo.setTipoOperacao(NFNotaInfoItemProdutoVeiculoTipoOperacao.OUTROS);
        produtoVeiculo.setTipoPintura("A");
        produtoVeiculo.setTipoVeiculo(NFNotaInfoTipoVeiculo.AUTOMOVEL);
        produtoVeiculo.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirRestricaoNulo() {
        final DFNotaInfoItemProdutoVeiculo produtoVeiculo = new DFNotaInfoItemProdutoVeiculo();
        produtoVeiculo.setAnoFabricacao(2014);
        produtoVeiculo.setAnoModeloFabricacao(2014);
        produtoVeiculo.setCapacidadeMaximaTracao(new BigDecimal("9999.9999"));
        produtoVeiculo.setChassi("B31YTE9INXEYDMO4C");
        produtoVeiculo.setCilindrada("ohNx");
        produtoVeiculo.setCodigoCor("123A");
        produtoVeiculo.setCodigoCorDENATRAN(NFNotaInfoVeiculoCor.FANTASIA);
        produtoVeiculo.setCodigoMarcaModelo("542562");
        produtoVeiculo.setCondicao(NFNotaInfoItemProdutoVeiculoCondicao.ACABADO);
        produtoVeiculo.setCondicaoChassi(NFNotaInfoItemProdutoVeiculoCondicaoChassi.NORMAL);
        produtoVeiculo.setDescricaoCor("tjRQlvBqVsFLDWUCaOeaXRbV1ipOZH3W5H7Ic2p9");
        produtoVeiculo.setDistanciaEntreEixos("9999");
        produtoVeiculo.setEspecieVeiculo(NFNotaInfoEspecieVeiculo.CORRIDA);
        produtoVeiculo.setLotacao(999);
        produtoVeiculo.setNumeroMotor("u1DU8GZRzJZzevuY49IB9");
        produtoVeiculo.setNumeroSerie("XBxVyiVVD");
        produtoVeiculo.setPesoBruto(new BigDecimal("9999.9999"));
        produtoVeiculo.setPesoLiquido(new BigDecimal("9999.9999"));
        produtoVeiculo.setPotencia("GZRz");
        produtoVeiculo.setTipoCombustivel(NFNotaInfoCombustivelTipo.GASOLINA);
        produtoVeiculo.setTipoOperacao(NFNotaInfoItemProdutoVeiculoTipoOperacao.OUTROS);
        produtoVeiculo.setTipoPintura("A");
        produtoVeiculo.setTipoVeiculo(NFNotaInfoTipoVeiculo.AUTOMOVEL);
        produtoVeiculo.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirTipoCombustivelNulo() {
        final DFNotaInfoItemProdutoVeiculo produtoVeiculo = new DFNotaInfoItemProdutoVeiculo();
        produtoVeiculo.setAnoFabricacao(2014);
        produtoVeiculo.setAnoModeloFabricacao(2014);
        produtoVeiculo.setCapacidadeMaximaTracao(new BigDecimal("9999.9999"));
        produtoVeiculo.setChassi("B31YTE9INXEYDMO4C");
        produtoVeiculo.setCilindrada("ohNx");
        produtoVeiculo.setCodigoCor("123A");
        produtoVeiculo.setCodigoCorDENATRAN(NFNotaInfoVeiculoCor.FANTASIA);
        produtoVeiculo.setCodigoMarcaModelo("542562");
        produtoVeiculo.setCondicao(NFNotaInfoItemProdutoVeiculoCondicao.ACABADO);
        produtoVeiculo.setCondicaoChassi(NFNotaInfoItemProdutoVeiculoCondicaoChassi.NORMAL);
        produtoVeiculo.setDescricaoCor("tjRQlvBqVsFLDWUCaOeaXRbV1ipOZH3W5H7Ic2p9");
        produtoVeiculo.setDistanciaEntreEixos("9999");
        produtoVeiculo.setEspecieVeiculo(NFNotaInfoEspecieVeiculo.CORRIDA);
        produtoVeiculo.setLotacao(999);
        produtoVeiculo.setNumeroMotor("u1DU8GZRzJZzevuY49IB9");
        produtoVeiculo.setNumeroSerie("XBxVyiVVD");
        produtoVeiculo.setPesoBruto(new BigDecimal("9999.9999"));
        produtoVeiculo.setPesoLiquido(new BigDecimal("9999.9999"));
        produtoVeiculo.setPotencia("GZRz");
        produtoVeiculo.setRestricao(NFNotaInfoItemProdutoVeiculoRestricao.PENHOR);
        produtoVeiculo.setTipoOperacao(NFNotaInfoItemProdutoVeiculoTipoOperacao.OUTROS);
        produtoVeiculo.setTipoPintura("A");
        produtoVeiculo.setTipoVeiculo(NFNotaInfoTipoVeiculo.AUTOMOVEL);
        produtoVeiculo.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirTipoOperacaoNulo() {
        final DFNotaInfoItemProdutoVeiculo produtoVeiculo = new DFNotaInfoItemProdutoVeiculo();
        produtoVeiculo.setAnoFabricacao(2014);
        produtoVeiculo.setAnoModeloFabricacao(2014);
        produtoVeiculo.setCapacidadeMaximaTracao(new BigDecimal("9999.9999"));
        produtoVeiculo.setChassi("B31YTE9INXEYDMO4C");
        produtoVeiculo.setCilindrada("ohNx");
        produtoVeiculo.setCodigoCor("123A");
        produtoVeiculo.setCodigoCorDENATRAN(NFNotaInfoVeiculoCor.FANTASIA);
        produtoVeiculo.setCodigoMarcaModelo("542562");
        produtoVeiculo.setCondicao(NFNotaInfoItemProdutoVeiculoCondicao.ACABADO);
        produtoVeiculo.setCondicaoChassi(NFNotaInfoItemProdutoVeiculoCondicaoChassi.NORMAL);
        produtoVeiculo.setDescricaoCor("tjRQlvBqVsFLDWUCaOeaXRbV1ipOZH3W5H7Ic2p9");
        produtoVeiculo.setDistanciaEntreEixos("9999");
        produtoVeiculo.setEspecieVeiculo(NFNotaInfoEspecieVeiculo.CORRIDA);
        produtoVeiculo.setLotacao(999);
        produtoVeiculo.setNumeroMotor("u1DU8GZRzJZzevuY49IB9");
        produtoVeiculo.setNumeroSerie("XBxVyiVVD");
        produtoVeiculo.setPesoBruto(new BigDecimal("9999.9999"));
        produtoVeiculo.setPesoLiquido(new BigDecimal("9999.9999"));
        produtoVeiculo.setPotencia("GZRz");
        produtoVeiculo.setRestricao(NFNotaInfoItemProdutoVeiculoRestricao.PENHOR);
        produtoVeiculo.setTipoCombustivel(NFNotaInfoCombustivelTipo.GASOLINA);
        produtoVeiculo.setTipoPintura("A");
        produtoVeiculo.setTipoVeiculo(NFNotaInfoTipoVeiculo.AUTOMOVEL);
        produtoVeiculo.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirTipoPinturaNulo() {
        final DFNotaInfoItemProdutoVeiculo produtoVeiculo = new DFNotaInfoItemProdutoVeiculo();
        produtoVeiculo.setAnoFabricacao(2014);
        produtoVeiculo.setAnoModeloFabricacao(2014);
        produtoVeiculo.setCapacidadeMaximaTracao(new BigDecimal("9999.9999"));
        produtoVeiculo.setChassi("B31YTE9INXEYDMO4C");
        produtoVeiculo.setCilindrada("ohNx");
        produtoVeiculo.setCodigoCor("123A");
        produtoVeiculo.setCodigoCorDENATRAN(NFNotaInfoVeiculoCor.FANTASIA);
        produtoVeiculo.setCodigoMarcaModelo("542562");
        produtoVeiculo.setCondicao(NFNotaInfoItemProdutoVeiculoCondicao.ACABADO);
        produtoVeiculo.setCondicaoChassi(NFNotaInfoItemProdutoVeiculoCondicaoChassi.NORMAL);
        produtoVeiculo.setDescricaoCor("tjRQlvBqVsFLDWUCaOeaXRbV1ipOZH3W5H7Ic2p9");
        produtoVeiculo.setDistanciaEntreEixos("9999");
        produtoVeiculo.setEspecieVeiculo(NFNotaInfoEspecieVeiculo.CORRIDA);
        produtoVeiculo.setLotacao(999);
        produtoVeiculo.setNumeroMotor("u1DU8GZRzJZzevuY49IB9");
        produtoVeiculo.setNumeroSerie("XBxVyiVVD");
        produtoVeiculo.setPesoBruto(new BigDecimal("9999.9999"));
        produtoVeiculo.setPesoLiquido(new BigDecimal("9999.9999"));
        produtoVeiculo.setPotencia("GZRz");
        produtoVeiculo.setRestricao(NFNotaInfoItemProdutoVeiculoRestricao.PENHOR);
        produtoVeiculo.setTipoCombustivel(NFNotaInfoCombustivelTipo.GASOLINA);
        produtoVeiculo.setTipoOperacao(NFNotaInfoItemProdutoVeiculoTipoOperacao.OUTROS);
        produtoVeiculo.setTipoVeiculo(NFNotaInfoTipoVeiculo.AUTOMOVEL);
        produtoVeiculo.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirTipoVeiculoNulo() {
        final DFNotaInfoItemProdutoVeiculo produtoVeiculo = new DFNotaInfoItemProdutoVeiculo();
        produtoVeiculo.setAnoFabricacao(2014);
        produtoVeiculo.setAnoModeloFabricacao(2014);
        produtoVeiculo.setCapacidadeMaximaTracao(new BigDecimal("9999.9999"));
        produtoVeiculo.setChassi("B31YTE9INXEYDMO4C");
        produtoVeiculo.setCilindrada("ohNx");
        produtoVeiculo.setCodigoCor("123A");
        produtoVeiculo.setCodigoCorDENATRAN(NFNotaInfoVeiculoCor.FANTASIA);
        produtoVeiculo.setCodigoMarcaModelo("542562");
        produtoVeiculo.setCondicao(NFNotaInfoItemProdutoVeiculoCondicao.ACABADO);
        produtoVeiculo.setCondicaoChassi(NFNotaInfoItemProdutoVeiculoCondicaoChassi.NORMAL);
        produtoVeiculo.setDescricaoCor("tjRQlvBqVsFLDWUCaOeaXRbV1ipOZH3W5H7Ic2p9");
        produtoVeiculo.setDistanciaEntreEixos("9999");
        produtoVeiculo.setEspecieVeiculo(NFNotaInfoEspecieVeiculo.CORRIDA);
        produtoVeiculo.setLotacao(999);
        produtoVeiculo.setNumeroMotor("u1DU8GZRzJZzevuY49IB9");
        produtoVeiculo.setNumeroSerie("XBxVyiVVD");
        produtoVeiculo.setPesoBruto(new BigDecimal("9999.9999"));
        produtoVeiculo.setPesoLiquido(new BigDecimal("9999.9999"));
        produtoVeiculo.setPotencia("GZRz");
        produtoVeiculo.setRestricao(NFNotaInfoItemProdutoVeiculoRestricao.PENHOR);
        produtoVeiculo.setTipoCombustivel(NFNotaInfoCombustivelTipo.GASOLINA);
        produtoVeiculo.setTipoOperacao(NFNotaInfoItemProdutoVeiculoTipoOperacao.OUTROS);
        produtoVeiculo.setTipoPintura("A");
        produtoVeiculo.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<DFNotaInfoItemProdutoVeiculo><tpOp>0</tpOp><chassi>B31YTE9INXEYDMO4C</chassi><cCor>123A</cCor><xCor>tjRQlvBqVsFLDWUCaOeaXRbV1ipOZH3W5H7Ic2p9</xCor><pot>GZRz</pot><cilin>ohNx</cilin><pesoL>9999.9999</pesoL><pesoB>9999.9999</pesoB><nSerie>XBxVyiVVD</nSerie><tpComb>02</tpComb><nMotor>u1DU8GZRzJZzevuY49IB9</nMotor><CMT>9999.9999</CMT><dist>9999</dist><anoMod>2014</anoMod><anoFab>2014</anoFab><tpPint>A</tpPint><tpVeic>06</tpVeic><espVeic>4</espVeic><VIN>N</VIN><condVeic>1</condVeic><cMod>542562</cMod><cCorDENATRAN>16</cCorDENATRAN><lota>999</lota><tpRest>4</tpRest></DFNotaInfoItemProdutoVeiculo>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoItemProdutoVeiculo().toString());
    }
}