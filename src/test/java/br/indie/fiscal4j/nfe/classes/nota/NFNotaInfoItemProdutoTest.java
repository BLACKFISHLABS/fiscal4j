package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import br.indie.fiscal4j.nfe.classes.NFProdutoCompoeValorNota;
import br.indie.fiscal4j.nfe.persister.NFPersister;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NFNotaInfoItemProdutoTest {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNomeclaturaForaDoPadrao() {
        new DFNotaInfoItemProduto().setNomeclaturaValorAduaneiroEstatistica(Collections.singletonList("ABC0123"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorUnitarioTributavelComTamanhoInvalido() {
        new DFNotaInfoItemProduto().setValorUnitarioTributavel(new BigDecimal("100000000000"));
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCESTComTamanhoInvalido() {
        try {
            new DFNotaInfoItemProduto().setCodigoEspecificadorSituacaoTributaria("999999");
            Assert.fail();
        } catch (final IllegalStateException e) {
            new DFNotaInfoItemProduto().setCodigoEspecificadorSituacaoTributaria("10000000");
            Assert.fail();
        }
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorUnitarioComTamanhoInvalido() {
        new DFNotaInfoItemProduto().setValorUnitario(new BigDecimal("100000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorTotalBrutoComTamanhoInvalido() {
        new DFNotaInfoItemProduto().setValorTotalBruto(new BigDecimal("10000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorSeguroComTamanhoInvalido() {
        new DFNotaInfoItemProduto().setValorSeguro(new BigDecimal("10000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorOutrasDespesasAcessoriasComTamanhoInvalido() {
        new DFNotaInfoItemProduto().setValorOutrasDespesasAcessorias(new BigDecimal("10000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorFreteComTamanhoInvalido() {
        new DFNotaInfoItemProduto().setValorFrete(new BigDecimal("10000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorDescontoComTamanhoInvalido() {
        new DFNotaInfoItemProduto().setValorDesconto(new BigDecimal("10000000000000"));
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirUnidadeTributavelComTamanhoInvalido() {
        try {
            new DFNotaInfoItemProduto().setUnidadeTributavel("");
        } catch (final IllegalStateException e) {
            new DFNotaInfoItemProduto().setUnidadeTributavel("7wqG4h1");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirUnidadeComercialComTamanhoInvalido() {
        try {
            new DFNotaInfoItemProduto().setUnidadeComercial("");
        } catch (final IllegalStateException e) {
            new DFNotaInfoItemProduto().setUnidadeComercial("7wqG4h1");
        }
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirQuantidadeTributavelComTamanhoInvalido() {
        new DFNotaInfoItemProduto().setQuantidadeTributavel(new BigDecimal("100000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirQuantidadeComercialComTamanhoInvalido() {
        new DFNotaInfoItemProduto().setQuantidadeComercial(new BigDecimal("100000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirNumeroPedidoItemClienteComTamanhoInvalido() {
        new DFNotaInfoItemProduto().setNumeroPedidoItemCliente(1000000);
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNumeroPedidoClienteComTamanhoInvalido() {
        try {
            new DFNotaInfoItemProduto().setNumeroPedidoCliente("");
        } catch (final IllegalStateException e) {
            new DFNotaInfoItemProduto().setNumeroPedidoCliente("NNxQ9nrQ3HCe5Mc1");
        }
    }

    @Test
    public void naoDevePermitirNcmComTamanhoInvalido() {
        try {
            new DFNotaInfoItemProduto().setNcm("999999991");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            new DFNotaInfoItemProduto().setNcm("U0sDjya");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            new DFNotaInfoItemProduto().setNcm("U0s");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            new DFNotaInfoItemProduto().setNcm("U");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirExtipiComTamanhoInvalido() {
        new DFNotaInfoItemProduto().setExtipi("1000");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirDescricaoComTamanhoInvalido() {
        try {
            new DFNotaInfoItemProduto().setDescricao("");
        } catch (final IllegalStateException e) {
            new DFNotaInfoItemProduto().setDescricao("OBS0ztekCoG0DSSVcQwPKRV2fV842Pye7mED13P4zoDczcXi4AMNvQ7BKBLnHtLc2Z9fuIY1pcKmXSK1IJQSLEs5QWvVGyC74DyJuIM0X7L0cqWPZQii5JtP1");
        }
    }

    @Test
    public void naoDeveCodigoDeBarrasTributavelComTamanhoInvalido() {
        try {
            new DFNotaInfoItemProduto().setCodigoDeBarrasTributavel("368119635325051");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            new DFNotaInfoItemProduto().setCodigoDeBarrasTributavel("EyiQt2RGqEJ");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            new DFNotaInfoItemProduto().setCodigoDeBarrasTributavel("EyiQt2RGq");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            new DFNotaInfoItemProduto().setCodigoDeBarrasTributavel("EyiQt2R");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            new DFNotaInfoItemProduto().setCodigoDeBarrasTributavel("E");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
    }

    @Test
    public void naoDeveCodigoDeBarrasComTamanhoInvalido() {
        try {
            new DFNotaInfoItemProduto().setCodigoDeBarras("356472100398615");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            new DFNotaInfoItemProduto().setCodigoDeBarras("EyiQt2RGqEJ");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            new DFNotaInfoItemProduto().setCodigoDeBarras("EyiQt2RGq");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            new DFNotaInfoItemProduto().setCodigoDeBarras("EyiQt2R");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
        try {
            new DFNotaInfoItemProduto().setCodigoDeBarras("E");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCodigoComTamanhoInvalido() {
        try {
            new DFNotaInfoItemProduto().setCodigo("");
        } catch (final IllegalStateException e) {
            new DFNotaInfoItemProduto().setCodigo("ohVRInAS7jw8LNDP4WWjssSjBHK8nJRERnAeRMcsUokF3YItT93fBto3zZcq1");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCfopComTamanhoInvalido() {
        new DFNotaInfoItemProduto().setCfop("13021");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNumeroControleComFormatoInvalido() {
        new DFNotaInfoItemProduto().setNumeroControleFCI("B01F70AFA-10BF-4B1F-848C-65FF57F616F6");
    }

    @Test
    public void devePermitirsetNomeclaturaValorAduaneiroEstatisticaNulo() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        produto.setCfop("1302");
        produto.setCodigo("ohVRInAS7jw8LNDP4WWjssSjBHK8nJRERnAeRMcsUokF3YItT93fBto3zZcq");
        produto.setCodigoDeBarras("36811963532505");
        produto.setCodigoDeBarrasTributavel("36811963532505");
        produto.setCampoeValorNota(NFProdutoCompoeValorNota.SIM);
        produto.setDeclaracoesImportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoDeclaracaoImportacao()));
        produto.setDescricao("OBS0ztekCoG0DSSVcQwPKRV2fV842Pye7mED13P4zoDczcXi4AMNvQ7BKBLnHtLc2Z9fuIY1pcKmXSK1IJQSLEs5QWvVGyC74DyJuIM0X7L0cqWPZQii5JtP");
        produto.setExtipi("999");
        produto.setMedicamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoMedicamento()));
        produto.setNcm("99999999");
        produto.setNumeroPedidoCliente("NNxQ9nrQ3HCe5Mc");
        produto.setNumeroPedidoItemCliente(999999);
        produto.setQuantidadeComercial(new BigDecimal("9999999999.9999"));
        produto.setQuantidadeTributavel(new BigDecimal("9999999999.9999"));
        produto.setUnidadeComercial("Bta64y");
        produto.setUnidadeTributavel("7wqG4h");
        produto.setDetalhesExportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemDetalheExportacao()));
        produto.setValorDesconto(new BigDecimal("999999999999.99"));
        produto.setValorFrete(new BigDecimal("999999999999.99"));
        produto.setValorOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        produto.setValorSeguro(new BigDecimal("999999999999.99"));
        produto.setValorTotalBruto(new BigDecimal("999999999999.99"));
        produto.setValorUnitario(new BigDecimal("9999999999.9999999999"));
        produto.setValorUnitarioTributavel(new BigDecimal("9999999999.9999999999"));
        produto.setNumeroControleFCI("B01F70AF-10BF-4B1F-848C-65FF57F616FE");
        produto.toString();
    }

    @Test
    public void devePermitirArmamentosNulo() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        produto.setCfop("1302");
        produto.setCodigo("ohVRInAS7jw8LNDP4WWjssSjBHK8nJRERnAeRMcsUokF3YItT93fBto3zZcq");
        produto.setCodigoDeBarras("36811963532505");
        produto.setCodigoDeBarrasTributavel("36811963532505");
        produto.setCampoeValorNota(NFProdutoCompoeValorNota.SIM);
        produto.setDeclaracoesImportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoDeclaracaoImportacao()));
        produto.setDescricao("OBS0ztekCoG0DSSVcQwPKRV2fV842Pye7mED13P4zoDczcXi4AMNvQ7BKBLnHtLc2Z9fuIY1pcKmXSK1IJQSLEs5QWvVGyC74DyJuIM0X7L0cqWPZQii5JtP");
        produto.setExtipi("999");
        produto.setMedicamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoMedicamento()));
        produto.setNcm("99999999");
        produto.setNumeroPedidoCliente("NNxQ9nrQ3HCe5Mc");
        produto.setNumeroPedidoItemCliente(999999);
        produto.setQuantidadeComercial(new BigDecimal("9999999999.9999"));
        produto.setQuantidadeTributavel(new BigDecimal("9999999999.9999"));
        produto.setUnidadeComercial("Bta64y");
        produto.setUnidadeTributavel("7wqG4h");
        produto.setValorDesconto(new BigDecimal("999999999999.99"));
        produto.setValorFrete(new BigDecimal("999999999999.99"));
        produto.setValorOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        produto.setValorSeguro(new BigDecimal("999999999999.99"));
        produto.setValorTotalBruto(new BigDecimal("999999999999.99"));
        produto.setDetalhesExportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemDetalheExportacao()));
        produto.setValorUnitario(new BigDecimal("9999999999.9999999999"));
        produto.setValorUnitarioTributavel(new BigDecimal("9999999999.9999999999"));
        produto.setNumeroControleFCI("B01F70AF-10BF-4B1F-848C-65FF57F616FE");
        produto.setNomeclaturaValorAduaneiroEstatistica(Collections.singletonList("AZ0123"));
        produto.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCfopNulo() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        produto.setArmamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoArmamento()));
        produto.setCodigo("ohVRInAS7jw8LNDP4WWjssSjBHK8nJRERnAeRMcsUokF3YItT93fBto3zZcq");
        produto.setCodigoDeBarras("36811963532505");
        produto.setCodigoDeBarrasTributavel("36811963532505");
        produto.setCombustivel(FabricaDeObjetosFake.getNFNotaInfoItemProdutoCombustivel());
        produto.setCampoeValorNota(NFProdutoCompoeValorNota.SIM);
        produto.setDeclaracoesImportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoDeclaracaoImportacao()));
        produto.setDescricao("OBS0ztekCoG0DSSVcQwPKRV2fV842Pye7mED13P4zoDczcXi4AMNvQ7BKBLnHtLc2Z9fuIY1pcKmXSK1IJQSLEs5QWvVGyC74DyJuIM0X7L0cqWPZQii5JtP");
        produto.setExtipi("999");
        produto.setMedicamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoMedicamento()));
        produto.setNcm("99999999");
        produto.setNumeroPedidoCliente("NNxQ9nrQ3HCe5Mc");
        produto.setNumeroPedidoItemCliente(999999);
        produto.setQuantidadeComercial(new BigDecimal("9999999999.9999"));
        produto.setQuantidadeTributavel(new BigDecimal("9999999999.9999"));
        produto.setUnidadeComercial("Bta64y");
        produto.setUnidadeTributavel("7wqG4h");
        produto.setValorDesconto(new BigDecimal("999999999999.99"));
        produto.setValorFrete(new BigDecimal("999999999999.99"));
        produto.setValorOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        produto.setValorSeguro(new BigDecimal("999999999999.99"));
        produto.setValorTotalBruto(new BigDecimal("999999999999.99"));
        produto.setDetalhesExportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemDetalheExportacao()));
        produto.setValorUnitario(new BigDecimal("9999999999.9999999999"));
        produto.setValorUnitarioTributavel(new BigDecimal("9999999999.9999999999"));
        produto.setVeiculo(FabricaDeObjetosFake.getNFNotaInfoItemProdutoVeiculo());
        produto.setNumeroControleFCI("B01F70AF-10BF-4B1F-848C-65FF57F616FE");
        produto.setNomeclaturaValorAduaneiroEstatistica(Collections.singletonList("AZ0123"));
        produto.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCodigoNulo() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        produto.setArmamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoArmamento()));
        produto.setCfop("1302");
        produto.setCodigoDeBarras("36811963532505");
        produto.setCodigoDeBarrasTributavel("36811963532505");
        produto.setCombustivel(FabricaDeObjetosFake.getNFNotaInfoItemProdutoCombustivel());
        produto.setCampoeValorNota(NFProdutoCompoeValorNota.SIM);
        produto.setDeclaracoesImportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoDeclaracaoImportacao()));
        produto.setDescricao("OBS0ztekCoG0DSSVcQwPKRV2fV842Pye7mED13P4zoDczcXi4AMNvQ7BKBLnHtLc2Z9fuIY1pcKmXSK1IJQSLEs5QWvVGyC74DyJuIM0X7L0cqWPZQii5JtP");
        produto.setExtipi("999");
        produto.setMedicamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoMedicamento()));
        produto.setNcm("99999999");
        produto.setNumeroPedidoCliente("NNxQ9nrQ3HCe5Mc");
        produto.setNumeroPedidoItemCliente(999999);
        produto.setQuantidadeComercial(new BigDecimal("9999999999.9999"));
        produto.setQuantidadeTributavel(new BigDecimal("9999999999.9999"));
        produto.setUnidadeComercial("Bta64y");
        produto.setUnidadeTributavel("7wqG4h");
        produto.setValorDesconto(new BigDecimal("999999999999.99"));
        produto.setValorFrete(new BigDecimal("999999999999.99"));
        produto.setValorOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        produto.setDetalhesExportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemDetalheExportacao()));
        produto.setValorSeguro(new BigDecimal("999999999999.99"));
        produto.setValorTotalBruto(new BigDecimal("999999999999.99"));
        produto.setValorUnitario(new BigDecimal("9999999999.9999999999"));
        produto.setValorUnitarioTributavel(new BigDecimal("9999999999.9999999999"));
        produto.setVeiculo(FabricaDeObjetosFake.getNFNotaInfoItemProdutoVeiculo());
        produto.setNumeroControleFCI("B01F70AF-10BF-4B1F-848C-65FF57F616FE");
        produto.setNomeclaturaValorAduaneiroEstatistica(Collections.singletonList("AZ0123"));
        produto.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCodigoDeBarrasNulo() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        produto.setArmamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoArmamento()));
        produto.setCfop("1302");
        produto.setCodigo("ohVRInAS7jw8LNDP4WWjssSjBHK8nJRERnAeRMcsUokF3YItT93fBto3zZcq");
        produto.setCodigoDeBarrasTributavel("36811963532505");
        produto.setCombustivel(FabricaDeObjetosFake.getNFNotaInfoItemProdutoCombustivel());
        produto.setCampoeValorNota(NFProdutoCompoeValorNota.SIM);
        produto.setDeclaracoesImportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoDeclaracaoImportacao()));
        produto.setDescricao("OBS0ztekCoG0DSSVcQwPKRV2fV842Pye7mED13P4zoDczcXi4AMNvQ7BKBLnHtLc2Z9fuIY1pcKmXSK1IJQSLEs5QWvVGyC74DyJuIM0X7L0cqWPZQii5JtP");
        produto.setExtipi("999");
        produto.setMedicamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoMedicamento()));
        produto.setNcm("99999999");
        produto.setNumeroPedidoCliente("NNxQ9nrQ3HCe5Mc");
        produto.setNumeroPedidoItemCliente(999999);
        produto.setQuantidadeComercial(new BigDecimal("9999999999.9999"));
        produto.setQuantidadeTributavel(new BigDecimal("9999999999.9999"));
        produto.setUnidadeComercial("Bta64y");
        produto.setUnidadeTributavel("7wqG4h");
        produto.setValorDesconto(new BigDecimal("999999999999.99"));
        produto.setValorFrete(new BigDecimal("999999999999.99"));
        produto.setDetalhesExportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemDetalheExportacao()));
        produto.setValorOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        produto.setValorSeguro(new BigDecimal("999999999999.99"));
        produto.setValorTotalBruto(new BigDecimal("999999999999.99"));
        produto.setValorUnitario(new BigDecimal("9999999999.9999999999"));
        produto.setValorUnitarioTributavel(new BigDecimal("9999999999.9999999999"));
        produto.setVeiculo(FabricaDeObjetosFake.getNFNotaInfoItemProdutoVeiculo());
        produto.setNumeroControleFCI("B01F70AF-10BF-4B1F-848C-65FF57F616FE");
        produto.setNomeclaturaValorAduaneiroEstatistica(Collections.singletonList("AZ0123"));
        produto.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCodigoDeBarrasTributavelNulo() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        produto.setArmamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoArmamento()));
        produto.setCfop("1302");
        produto.setCodigo("ohVRInAS7jw8LNDP4WWjssSjBHK8nJRERnAeRMcsUokF3YItT93fBto3zZcq");
        produto.setCodigoDeBarras("36811963532505");
        produto.setCombustivel(FabricaDeObjetosFake.getNFNotaInfoItemProdutoCombustivel());
        produto.setCampoeValorNota(NFProdutoCompoeValorNota.SIM);
        produto.setDeclaracoesImportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoDeclaracaoImportacao()));
        produto.setDescricao("OBS0ztekCoG0DSSVcQwPKRV2fV842Pye7mED13P4zoDczcXi4AMNvQ7BKBLnHtLc2Z9fuIY1pcKmXSK1IJQSLEs5QWvVGyC74DyJuIM0X7L0cqWPZQii5JtP");
        produto.setExtipi("999");
        produto.setMedicamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoMedicamento()));
        produto.setNcm("99999999");
        produto.setNumeroPedidoCliente("NNxQ9nrQ3HCe5Mc");
        produto.setNumeroPedidoItemCliente(999999);
        produto.setQuantidadeComercial(new BigDecimal("9999999999.9999"));
        produto.setQuantidadeTributavel(new BigDecimal("9999999999.9999"));
        produto.setUnidadeComercial("Bta64y");
        produto.setUnidadeTributavel("7wqG4h");
        produto.setValorDesconto(new BigDecimal("999999999999.99"));
        produto.setValorFrete(new BigDecimal("999999999999.99"));
        produto.setValorOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        produto.setValorSeguro(new BigDecimal("999999999999.99"));
        produto.setValorTotalBruto(new BigDecimal("999999999999.99"));
        produto.setValorUnitario(new BigDecimal("9999999999.9999999999"));
        produto.setValorUnitarioTributavel(new BigDecimal("9999999999.9999999999"));
        produto.setVeiculo(FabricaDeObjetosFake.getNFNotaInfoItemProdutoVeiculo());
        produto.setNumeroControleFCI("B01F70AF-10BF-4B1F-848C-65FF57F616FE");
        produto.setNomeclaturaValorAduaneiroEstatistica(Collections.singletonList("AZ0123"));
        produto.toString();
    }

    @Test
    public void devePermitirCombustivelNulo() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        produto.setCfop("1302");
        produto.setDetalhesExportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemDetalheExportacao()));
        produto.setCodigo("ohVRInAS7jw8LNDP4WWjssSjBHK8nJRERnAeRMcsUokF3YItT93fBto3zZcq");
        produto.setCodigoDeBarras("36811963532505");
        produto.setCodigoDeBarrasTributavel("36811963532505");
        produto.setCampoeValorNota(NFProdutoCompoeValorNota.SIM);
        produto.setDeclaracoesImportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoDeclaracaoImportacao()));
        produto.setDescricao("OBS0ztekCoG0DSSVcQwPKRV2fV842Pye7mED13P4zoDczcXi4AMNvQ7BKBLnHtLc2Z9fuIY1pcKmXSK1IJQSLEs5QWvVGyC74DyJuIM0X7L0cqWPZQii5JtP");
        produto.setExtipi("999");
        produto.setMedicamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoMedicamento()));
        produto.setNcm("99999999");
        produto.setNumeroPedidoCliente("NNxQ9nrQ3HCe5Mc");
        produto.setNumeroPedidoItemCliente(999999);
        produto.setQuantidadeComercial(new BigDecimal("9999999999.9999"));
        produto.setQuantidadeTributavel(new BigDecimal("9999999999.9999"));
        produto.setUnidadeComercial("Bta64y");
        produto.setUnidadeTributavel("7wqG4h");
        produto.setValorDesconto(new BigDecimal("999999999999.99"));
        produto.setValorFrete(new BigDecimal("999999999999.99"));
        produto.setValorOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        produto.setValorSeguro(new BigDecimal("999999999999.99"));
        produto.setValorTotalBruto(new BigDecimal("999999999999.99"));
        produto.setValorUnitario(new BigDecimal("9999999999.9999999999"));
        produto.setValorUnitarioTributavel(new BigDecimal("9999999999.9999999999"));
        produto.setNumeroControleFCI("B01F70AF-10BF-4B1F-848C-65FF57F616FE");
        produto.setNomeclaturaValorAduaneiroEstatistica(Collections.singletonList("AZ0123"));
        produto.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCompoeValotNotaNulo() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        produto.setCfop("1302");
        produto.setCodigo("ohVRInAS7jw8LNDP4WWjssSjBHK8nJRERnAeRMcsUokF3YItT93fBto3zZcq");
        produto.setCodigoDeBarras("36811963532505");
        produto.setCodigoDeBarrasTributavel("36811963532505");
        produto.setCombustivel(FabricaDeObjetosFake.getNFNotaInfoItemProdutoCombustivel());
        produto.setDeclaracoesImportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoDeclaracaoImportacao()));
        produto.setDescricao("OBS0ztekCoG0DSSVcQwPKRV2fV842Pye7mED13P4zoDczcXi4AMNvQ7BKBLnHtLc2Z9fuIY1pcKmXSK1IJQSLEs5QWvVGyC74DyJuIM0X7L0cqWPZQii5JtP");
        produto.setExtipi("999");
        produto.setDetalhesExportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemDetalheExportacao()));
        produto.setMedicamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoMedicamento()));
        produto.setNcm("99999999");
        produto.setNumeroPedidoCliente("NNxQ9nrQ3HCe5Mc");
        produto.setNumeroPedidoItemCliente(999999);
        produto.setQuantidadeComercial(new BigDecimal("9999999999.9999"));
        produto.setQuantidadeTributavel(new BigDecimal("9999999999.9999"));
        produto.setUnidadeComercial("Bta64y");
        produto.setUnidadeTributavel("7wqG4h");
        produto.setValorDesconto(new BigDecimal("999999999999.99"));
        produto.setValorFrete(new BigDecimal("999999999999.99"));
        produto.setValorOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        produto.setValorSeguro(new BigDecimal("999999999999.99"));
        produto.setValorTotalBruto(new BigDecimal("999999999999.99"));
        produto.setValorUnitario(new BigDecimal("9999999999.9999999999"));
        produto.setValorUnitarioTributavel(new BigDecimal("9999999999.9999999999"));
        produto.setNumeroControleFCI("B01F70AF-10BF-4B1F-848C-65FF57F616FE");
        produto.setNomeclaturaValorAduaneiroEstatistica(Collections.singletonList("AZ0123"));
        produto.toString();
    }

    @Test
    public void devePermitirDeclaracoesImportacaoNulo() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        produto.setCfop("1302");
        produto.setCodigo("ohVRInAS7jw8LNDP4WWjssSjBHK8nJRERnAeRMcsUokF3YItT93fBto3zZcq");
        produto.setCodigoDeBarras("36811963532505");
        produto.setCodigoDeBarrasTributavel("36811963532505");
        produto.setCampoeValorNota(NFProdutoCompoeValorNota.SIM);
        produto.setDescricao("OBS0ztekCoG0DSSVcQwPKRV2fV842Pye7mED13P4zoDczcXi4AMNvQ7BKBLnHtLc2Z9fuIY1pcKmXSK1IJQSLEs5QWvVGyC74DyJuIM0X7L0cqWPZQii5JtP");
        produto.setExtipi("999");
        produto.setMedicamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoMedicamento()));
        produto.setNcm("99999999");
        produto.setNumeroPedidoCliente("NNxQ9nrQ3HCe5Mc");
        produto.setNumeroPedidoItemCliente(999999);
        produto.setQuantidadeComercial(new BigDecimal("9999999999.9999"));
        produto.setQuantidadeTributavel(new BigDecimal("9999999999.9999"));
        produto.setUnidadeComercial("Bta64y");
        produto.setUnidadeTributavel("7wqG4h");
        produto.setDetalhesExportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemDetalheExportacao()));
        produto.setValorDesconto(new BigDecimal("999999999999.99"));
        produto.setValorFrete(new BigDecimal("999999999999.99"));
        produto.setValorOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        produto.setValorSeguro(new BigDecimal("999999999999.99"));
        produto.setValorTotalBruto(new BigDecimal("999999999999.99"));
        produto.setValorUnitario(new BigDecimal("9999999999.9999999999"));
        produto.setValorUnitarioTributavel(new BigDecimal("9999999999.9999999999"));
        produto.setNumeroControleFCI("B01F70AF-10BF-4B1F-848C-65FF57F616FE");
        produto.setNomeclaturaValorAduaneiroEstatistica(Collections.singletonList("AZ0123"));
        produto.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void devePermitirDescricaoNulo() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        produto.setCfop("1302");
        produto.setCodigo("ohVRInAS7jw8LNDP4WWjssSjBHK8nJRERnAeRMcsUokF3YItT93fBto3zZcq");
        produto.setCodigoDeBarras("36811963532505");
        produto.setCodigoDeBarrasTributavel("36811963532505");
        produto.setCampoeValorNota(NFProdutoCompoeValorNota.SIM);
        produto.setDeclaracoesImportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoDeclaracaoImportacao()));
        produto.setExtipi("999");
        produto.setMedicamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoMedicamento()));
        produto.setNcm("99999999");
        produto.setNumeroPedidoCliente("NNxQ9nrQ3HCe5Mc");
        produto.setNumeroPedidoItemCliente(999999);
        produto.setQuantidadeComercial(new BigDecimal("9999999999.9999"));
        produto.setQuantidadeTributavel(new BigDecimal("9999999999.9999"));
        produto.setUnidadeComercial("Bta64y");
        produto.setUnidadeTributavel("7wqG4h");
        produto.setValorDesconto(new BigDecimal("999999999999.99"));
        produto.setValorFrete(new BigDecimal("999999999999.99"));
        produto.setValorOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        produto.setValorSeguro(new BigDecimal("999999999999.99"));
        produto.setValorTotalBruto(new BigDecimal("999999999999.99"));
        produto.setDetalhesExportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemDetalheExportacao()));
        produto.setValorUnitario(new BigDecimal("9999999999.9999999999"));
        produto.setValorUnitarioTributavel(new BigDecimal("9999999999.9999999999"));
        produto.setNumeroControleFCI("B01F70AF-10BF-4B1F-848C-65FF57F616FE");
        produto.toString();
    }

    @Test
    public void devePermitirExtipiNulo() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        produto.setCfop("1302");
        produto.setCodigo("ohVRInAS7jw8LNDP4WWjssSjBHK8nJRERnAeRMcsUokF3YItT93fBto3zZcq");
        produto.setCodigoDeBarras("36811963532505");
        produto.setCodigoDeBarrasTributavel("36811963532505");
        produto.setCampoeValorNota(NFProdutoCompoeValorNota.SIM);
        produto.setDetalhesExportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemDetalheExportacao()));
        produto.setDeclaracoesImportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoDeclaracaoImportacao()));
        produto.setDescricao("OBS0ztekCoG0DSSVcQwPKRV2fV842Pye7mED13P4zoDczcXi4AMNvQ7BKBLnHtLc2Z9fuIY1pcKmXSK1IJQSLEs5QWvVGyC74DyJuIM0X7L0cqWPZQii5JtP");
        produto.setMedicamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoMedicamento()));
        produto.setNcm("99999999");
        produto.setNumeroPedidoCliente("NNxQ9nrQ3HCe5Mc");
        produto.setNumeroPedidoItemCliente(999999);
        produto.setQuantidadeComercial(new BigDecimal("9999999999.9999"));
        produto.setQuantidadeTributavel(new BigDecimal("9999999999.9999"));
        produto.setUnidadeComercial("Bta64y");
        produto.setUnidadeTributavel("7wqG4h");
        produto.setValorDesconto(new BigDecimal("999999999999.99"));
        produto.setValorFrete(new BigDecimal("999999999999.99"));
        produto.setValorOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        produto.setValorSeguro(new BigDecimal("999999999999.99"));
        produto.setValorTotalBruto(new BigDecimal("999999999999.99"));
        produto.setValorUnitario(new BigDecimal("9999999999.9999999999"));
        produto.setValorUnitarioTributavel(new BigDecimal("9999999999.9999999999"));
        produto.setNomeclaturaValorAduaneiroEstatistica(Collections.singletonList("AZ0123"));
        produto.setNumeroControleFCI("B01F70AF-10BF-4B1F-848C-65FF57F616FE");
        produto.toString();
    }

    @Test
    public void devePermitirMedicamentosNulo() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        produto.setCfop("1302");
        produto.setCodigo("ohVRInAS7jw8LNDP4WWjssSjBHK8nJRERnAeRMcsUokF3YItT93fBto3zZcq");
        produto.setDetalhesExportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemDetalheExportacao()));
        produto.setCodigoDeBarras("36811963532505");
        produto.setCodigoDeBarrasTributavel("36811963532505");
        produto.setCampoeValorNota(NFProdutoCompoeValorNota.SIM);
        produto.setDeclaracoesImportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoDeclaracaoImportacao()));
        produto.setDescricao("OBS0ztekCoG0DSSVcQwPKRV2fV842Pye7mED13P4zoDczcXi4AMNvQ7BKBLnHtLc2Z9fuIY1pcKmXSK1IJQSLEs5QWvVGyC74DyJuIM0X7L0cqWPZQii5JtP");
        produto.setExtipi("999");
        produto.setNcm("99999999");
        produto.setNumeroPedidoCliente("NNxQ9nrQ3HCe5Mc");
        produto.setNumeroPedidoItemCliente(999999);
        produto.setQuantidadeComercial(new BigDecimal("9999999999.9999"));
        produto.setQuantidadeTributavel(new BigDecimal("9999999999.9999"));
        produto.setUnidadeComercial("Bta64y");
        produto.setUnidadeTributavel("7wqG4h");
        produto.setValorDesconto(new BigDecimal("999999999999.99"));
        produto.setValorFrete(new BigDecimal("999999999999.99"));
        produto.setValorOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        produto.setValorSeguro(new BigDecimal("999999999999.99"));
        produto.setValorTotalBruto(new BigDecimal("999999999999.99"));
        produto.setValorUnitario(new BigDecimal("9999999999.9999999999"));
        produto.setValorUnitarioTributavel(new BigDecimal("9999999999.9999999999"));
        produto.setVeiculo(FabricaDeObjetosFake.getNFNotaInfoItemProdutoVeiculo());
        produto.setNomeclaturaValorAduaneiroEstatistica(Collections.singletonList("AZ0123"));
        produto.setNumeroControleFCI("B01F70AF-10BF-4B1F-848C-65FF57F616FE");
        produto.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNcmNulo() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        produto.setCfop("1302");
        produto.setCodigo("ohVRInAS7jw8LNDP4WWjssSjBHK8nJRERnAeRMcsUokF3YItT93fBto3zZcq");
        produto.setCodigoDeBarras("36811963532505");
        produto.setCodigoDeBarrasTributavel("36811963532505");
        produto.setCombustivel(FabricaDeObjetosFake.getNFNotaInfoItemProdutoCombustivel());
        produto.setCampoeValorNota(NFProdutoCompoeValorNota.SIM);
        produto.setDeclaracoesImportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoDeclaracaoImportacao()));
        produto.setDescricao("OBS0ztekCoG0DSSVcQwPKRV2fV842Pye7mED13P4zoDczcXi4AMNvQ7BKBLnHtLc2Z9fuIY1pcKmXSK1IJQSLEs5QWvVGyC74DyJuIM0X7L0cqWPZQii5JtP");
        produto.setExtipi("999");
        produto.setMedicamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoMedicamento()));
        produto.setNumeroPedidoCliente("NNxQ9nrQ3HCe5Mc");
        produto.setNumeroPedidoItemCliente(999999);
        produto.setQuantidadeComercial(new BigDecimal("9999999999.9999"));
        produto.setQuantidadeTributavel(new BigDecimal("9999999999.9999"));
        produto.setUnidadeComercial("Bta64y");
        produto.setUnidadeTributavel("7wqG4h");
        produto.setValorDesconto(new BigDecimal("999999999999.99"));
        produto.setValorFrete(new BigDecimal("999999999999.99"));
        produto.setValorOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        produto.setValorSeguro(new BigDecimal("999999999999.99"));
        produto.setValorTotalBruto(new BigDecimal("999999999999.99"));
        produto.setValorUnitario(new BigDecimal("9999999999.9999999999"));
        produto.setValorUnitarioTributavel(new BigDecimal("9999999999.9999999999"));
        produto.setNumeroControleFCI("B01F70AF-10BF-4B1F-848C-65FF57F616FE");
        produto.setNomeclaturaValorAduaneiroEstatistica(Collections.singletonList("AZ0123"));
        produto.setDetalhesExportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemDetalheExportacao()));
        produto.toString();
    }

    @Test
    public void devePermitirNumeroPedidoClienteNulo() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        produto.setCfop("1302");
        produto.setDetalhesExportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemDetalheExportacao()));
        produto.setCodigo("ohVRInAS7jw8LNDP4WWjssSjBHK8nJRERnAeRMcsUokF3YItT93fBto3zZcq");
        produto.setCodigoDeBarras("36811963532505");
        produto.setCodigoDeBarrasTributavel("36811963532505");
        produto.setCampoeValorNota(NFProdutoCompoeValorNota.SIM);
        produto.setDeclaracoesImportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoDeclaracaoImportacao()));
        produto.setDescricao("OBS0ztekCoG0DSSVcQwPKRV2fV842Pye7mED13P4zoDczcXi4AMNvQ7BKBLnHtLc2Z9fuIY1pcKmXSK1IJQSLEs5QWvVGyC74DyJuIM0X7L0cqWPZQii5JtP");
        produto.setExtipi("999");
        produto.setMedicamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoMedicamento()));
        produto.setNcm("99999999");
        produto.setNumeroPedidoItemCliente(999999);
        produto.setQuantidadeComercial(new BigDecimal("9999999999.9999"));
        produto.setQuantidadeTributavel(new BigDecimal("9999999999.9999"));
        produto.setUnidadeComercial("Bta64y");
        produto.setUnidadeTributavel("7wqG4h");
        produto.setValorDesconto(new BigDecimal("999999999999.99"));
        produto.setValorFrete(new BigDecimal("999999999999.99"));
        produto.setValorOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        produto.setValorSeguro(new BigDecimal("999999999999.99"));
        produto.setValorTotalBruto(new BigDecimal("999999999999.99"));
        produto.setValorUnitario(new BigDecimal("9999999999.9999999999"));
        produto.setValorUnitarioTributavel(new BigDecimal("9999999999.9999999999"));
        produto.setNumeroControleFCI("B01F70AF-10BF-4B1F-848C-65FF57F616FE");
        produto.setNomeclaturaValorAduaneiroEstatistica(Collections.singletonList("AZ0123"));
        produto.toString();
    }

    @Test
    public void devePermitirNumeroPedidoItemClienteNulo() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        produto.setCfop("1302");
        produto.setCodigo("ohVRInAS7jw8LNDP4WWjssSjBHK8nJRERnAeRMcsUokF3YItT93fBto3zZcq");
        produto.setCodigoDeBarras("36811963532505");
        produto.setDetalhesExportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemDetalheExportacao()));
        produto.setCodigoDeBarrasTributavel("36811963532505");
        produto.setCampoeValorNota(NFProdutoCompoeValorNota.SIM);
        produto.setDeclaracoesImportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoDeclaracaoImportacao()));
        produto.setDescricao("OBS0ztekCoG0DSSVcQwPKRV2fV842Pye7mED13P4zoDczcXi4AMNvQ7BKBLnHtLc2Z9fuIY1pcKmXSK1IJQSLEs5QWvVGyC74DyJuIM0X7L0cqWPZQii5JtP");
        produto.setExtipi("999");
        produto.setMedicamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoMedicamento()));
        produto.setNcm("99999999");
        produto.setNumeroPedidoCliente("NNxQ9nrQ3HCe5Mc");
        produto.setQuantidadeComercial(new BigDecimal("9999999999.9999"));
        produto.setQuantidadeTributavel(new BigDecimal("9999999999.9999"));
        produto.setUnidadeComercial("Bta64y");
        produto.setUnidadeTributavel("7wqG4h");
        produto.setValorDesconto(new BigDecimal("999999999999.99"));
        produto.setValorFrete(new BigDecimal("999999999999.99"));
        produto.setValorOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        produto.setValorSeguro(new BigDecimal("999999999999.99"));
        produto.setValorTotalBruto(new BigDecimal("999999999999.99"));
        produto.setValorUnitario(new BigDecimal("9999999999.9999999999"));
        produto.setValorUnitarioTributavel(new BigDecimal("9999999999.9999999999"));
        produto.setNumeroControleFCI("B01F70AF-10BF-4B1F-848C-65FF57F616FE");
        produto.setNomeclaturaValorAduaneiroEstatistica(Collections.singletonList("AZ0123"));
        produto.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirQuantidadeComercialNulo() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        produto.setCfop("1302");
        produto.setCodigo("ohVRInAS7jw8LNDP4WWjssSjBHK8nJRERnAeRMcsUokF3YItT93fBto3zZcq");
        produto.setCodigoDeBarras("36811963532505");
        produto.setCodigoDeBarrasTributavel("36811963532505");
        produto.setCampoeValorNota(NFProdutoCompoeValorNota.SIM);
        produto.setDeclaracoesImportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoDeclaracaoImportacao()));
        produto.setDescricao("OBS0ztekCoG0DSSVcQwPKRV2fV842Pye7mED13P4zoDczcXi4AMNvQ7BKBLnHtLc2Z9fuIY1pcKmXSK1IJQSLEs5QWvVGyC74DyJuIM0X7L0cqWPZQii5JtP");
        produto.setExtipi("999");
        produto.setMedicamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoMedicamento()));
        produto.setNcm("99999999");
        produto.setNumeroPedidoCliente("NNxQ9nrQ3HCe5Mc");
        produto.setNumeroPedidoItemCliente(999999);
        produto.setQuantidadeTributavel(new BigDecimal("9999999999.9999"));
        produto.setUnidadeComercial("Bta64y");
        produto.setUnidadeTributavel("7wqG4h");
        produto.setValorDesconto(new BigDecimal("999999999999.99"));
        produto.setValorFrete(new BigDecimal("999999999999.99"));
        produto.setValorOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        produto.setValorSeguro(new BigDecimal("999999999999.99"));
        produto.setValorTotalBruto(new BigDecimal("999999999999.99"));
        produto.setValorUnitario(new BigDecimal("9999999999.9999999999"));
        produto.setDetalhesExportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemDetalheExportacao()));
        produto.setValorUnitarioTributavel(new BigDecimal("9999999999.9999999999"));
        produto.setNumeroControleFCI("B01F70AF-10BF-4B1F-848C-65FF57F616FE");
        produto.setNomeclaturaValorAduaneiroEstatistica(Collections.singletonList("AZ0123"));
        produto.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirQuantidadeTributavelNulo() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        produto.setArmamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoArmamento()));
        produto.setCfop("1302");
        produto.setCodigo("ohVRInAS7jw8LNDP4WWjssSjBHK8nJRERnAeRMcsUokF3YItT93fBto3zZcq");
        produto.setCodigoDeBarras("36811963532505");
        produto.setCodigoDeBarrasTributavel("36811963532505");
        produto.setCombustivel(FabricaDeObjetosFake.getNFNotaInfoItemProdutoCombustivel());
        produto.setCampoeValorNota(NFProdutoCompoeValorNota.SIM);
        produto.setDeclaracoesImportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoDeclaracaoImportacao()));
        produto.setDescricao("OBS0ztekCoG0DSSVcQwPKRV2fV842Pye7mED13P4zoDczcXi4AMNvQ7BKBLnHtLc2Z9fuIY1pcKmXSK1IJQSLEs5QWvVGyC74DyJuIM0X7L0cqWPZQii5JtP");
        produto.setExtipi("999");
        produto.setMedicamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoMedicamento()));
        produto.setNcm("99999999");
        produto.setNumeroPedidoCliente("NNxQ9nrQ3HCe5Mc");
        produto.setNumeroPedidoItemCliente(999999);
        produto.setDetalhesExportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemDetalheExportacao()));
        produto.setQuantidadeComercial(new BigDecimal("9999999999.9999"));
        produto.setUnidadeComercial("Bta64y");
        produto.setUnidadeTributavel("7wqG4h");
        produto.setValorDesconto(new BigDecimal("999999999999.99"));
        produto.setValorFrete(new BigDecimal("999999999999.99"));
        produto.setValorOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        produto.setValorSeguro(new BigDecimal("999999999999.99"));
        produto.setValorTotalBruto(new BigDecimal("999999999999.99"));
        produto.setValorUnitario(new BigDecimal("9999999999.9999999999"));
        produto.setValorUnitarioTributavel(new BigDecimal("9999999999.9999999999"));
        produto.setVeiculo(FabricaDeObjetosFake.getNFNotaInfoItemProdutoVeiculo());
        produto.setNumeroControleFCI("B01F70AF-10BF-4B1F-848C-65FF57F616FE");
        produto.setNomeclaturaValorAduaneiroEstatistica(Collections.singletonList("AZ0123"));
        produto.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirUnidadeComercialNulo() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        produto.setArmamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoArmamento()));
        produto.setCfop("1302");
        produto.setCodigo("ohVRInAS7jw8LNDP4WWjssSjBHK8nJRERnAeRMcsUokF3YItT93fBto3zZcq");
        produto.setCodigoDeBarras("36811963532505");
        produto.setCodigoDeBarrasTributavel("36811963532505");
        produto.setCombustivel(FabricaDeObjetosFake.getNFNotaInfoItemProdutoCombustivel());
        produto.setCampoeValorNota(NFProdutoCompoeValorNota.SIM);
        produto.setDeclaracoesImportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoDeclaracaoImportacao()));
        produto.setDescricao("OBS0ztekCoG0DSSVcQwPKRV2fV842Pye7mED13P4zoDczcXi4AMNvQ7BKBLnHtLc2Z9fuIY1pcKmXSK1IJQSLEs5QWvVGyC74DyJuIM0X7L0cqWPZQii5JtP");
        produto.setExtipi("999");
        produto.setMedicamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoMedicamento()));
        produto.setNcm("99999999");
        produto.setNumeroPedidoCliente("NNxQ9nrQ3HCe5Mc");
        produto.setNumeroPedidoItemCliente(999999);
        produto.setQuantidadeComercial(new BigDecimal("9999999999.9999"));
        produto.setQuantidadeTributavel(new BigDecimal("9999999999.9999"));
        produto.setUnidadeTributavel("7wqG4h");
        produto.setValorDesconto(new BigDecimal("999999999999.99"));
        produto.setValorFrete(new BigDecimal("999999999999.99"));
        produto.setDetalhesExportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemDetalheExportacao()));
        produto.setValorOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        produto.setValorSeguro(new BigDecimal("999999999999.99"));
        produto.setValorTotalBruto(new BigDecimal("999999999999.99"));
        produto.setValorUnitario(new BigDecimal("9999999999.9999999999"));
        produto.setValorUnitarioTributavel(new BigDecimal("9999999999.9999999999"));
        produto.setVeiculo(FabricaDeObjetosFake.getNFNotaInfoItemProdutoVeiculo());
        produto.setNomeclaturaValorAduaneiroEstatistica(Collections.singletonList("AZ0123"));
        produto.setNumeroControleFCI("B01F70AF-10BF-4B1F-848C-65FF57F616FE");
        produto.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirUnidadeTributavelNulo() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        produto.setArmamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoArmamento()));
        produto.setCfop("1302");
        produto.setCodigo("ohVRInAS7jw8LNDP4WWjssSjBHK8nJRERnAeRMcsUokF3YItT93fBto3zZcq");
        produto.setCodigoDeBarras("36811963532505");
        produto.setCodigoDeBarrasTributavel("36811963532505");
        produto.setCombustivel(FabricaDeObjetosFake.getNFNotaInfoItemProdutoCombustivel());
        produto.setCampoeValorNota(NFProdutoCompoeValorNota.SIM);
        produto.setDeclaracoesImportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoDeclaracaoImportacao()));
        produto.setDescricao("OBS0ztekCoG0DSSVcQwPKRV2fV842Pye7mED13P4zoDczcXi4AMNvQ7BKBLnHtLc2Z9fuIY1pcKmXSK1IJQSLEs5QWvVGyC74DyJuIM0X7L0cqWPZQii5JtP");
        produto.setExtipi("999");
        produto.setDetalhesExportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemDetalheExportacao()));
        produto.setMedicamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoMedicamento()));
        produto.setNcm("99999999");
        produto.setNumeroPedidoCliente("NNxQ9nrQ3HCe5Mc");
        produto.setNumeroPedidoItemCliente(999999);
        produto.setQuantidadeComercial(new BigDecimal("9999999999.9999"));
        produto.setQuantidadeTributavel(new BigDecimal("9999999999.9999"));
        produto.setUnidadeComercial("Bta64y");
        produto.setValorDesconto(new BigDecimal("999999999999.99"));
        produto.setValorFrete(new BigDecimal("999999999999.99"));
        produto.setValorOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        produto.setValorSeguro(new BigDecimal("999999999999.99"));
        produto.setValorTotalBruto(new BigDecimal("999999999999.99"));
        produto.setValorUnitario(new BigDecimal("9999999999.9999999999"));
        produto.setValorUnitarioTributavel(new BigDecimal("9999999999.9999999999"));
        produto.setVeiculo(FabricaDeObjetosFake.getNFNotaInfoItemProdutoVeiculo());
        produto.setNumeroControleFCI("B01F70AF-10BF-4B1F-848C-65FF57F616FE");
        produto.setNomeclaturaValorAduaneiroEstatistica(Collections.singletonList("AZ0123"));
        produto.toString();
    }

    @Test
    public void devePermitirValorDescontoNulo() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        produto.setCfop("1302");
        produto.setCodigo("ohVRInAS7jw8LNDP4WWjssSjBHK8nJRERnAeRMcsUokF3YItT93fBto3zZcq");
        produto.setCodigoDeBarras("36811963532505");
        produto.setCodigoDeBarrasTributavel("36811963532505");
        produto.setCampoeValorNota(NFProdutoCompoeValorNota.SIM);
        produto.setDeclaracoesImportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoDeclaracaoImportacao()));
        produto.setDescricao("OBS0ztekCoG0DSSVcQwPKRV2fV842Pye7mED13P4zoDczcXi4AMNvQ7BKBLnHtLc2Z9fuIY1pcKmXSK1IJQSLEs5QWvVGyC74DyJuIM0X7L0cqWPZQii5JtP");
        produto.setExtipi("999");
        produto.setMedicamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoMedicamento()));
        produto.setNcm("99999999");
        produto.setNumeroPedidoCliente("NNxQ9nrQ3HCe5Mc");
        produto.setNumeroPedidoItemCliente(999999);
        produto.setQuantidadeComercial(new BigDecimal("9999999999.9999"));
        produto.setQuantidadeTributavel(new BigDecimal("9999999999.9999"));
        produto.setUnidadeComercial("Bta64y");
        produto.setDetalhesExportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemDetalheExportacao()));
        produto.setUnidadeTributavel("7wqG4h");
        produto.setValorFrete(new BigDecimal("999999999999.99"));
        produto.setValorOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        produto.setValorSeguro(new BigDecimal("999999999999.99"));
        produto.setValorTotalBruto(new BigDecimal("999999999999.99"));
        produto.setValorUnitario(new BigDecimal("9999999999.9999999999"));
        produto.setValorUnitarioTributavel(new BigDecimal("9999999999.9999999999"));
        produto.setNumeroControleFCI("B01F70AF-10BF-4B1F-848C-65FF57F616FE");
        produto.setNomeclaturaValorAduaneiroEstatistica(Collections.singletonList("AZ0123"));
        produto.toString();
    }

    @Test
    public void devePermitirValorFreteNulo() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        produto.setCfop("1302");
        produto.setCodigo("ohVRInAS7jw8LNDP4WWjssSjBHK8nJRERnAeRMcsUokF3YItT93fBto3zZcq");
        produto.setCodigoDeBarras("36811963532505");
        produto.setCodigoDeBarrasTributavel("36811963532505");
        produto.setCampoeValorNota(NFProdutoCompoeValorNota.SIM);
        produto.setDeclaracoesImportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoDeclaracaoImportacao()));
        produto.setDescricao("OBS0ztekCoG0DSSVcQwPKRV2fV842Pye7mED13P4zoDczcXi4AMNvQ7BKBLnHtLc2Z9fuIY1pcKmXSK1IJQSLEs5QWvVGyC74DyJuIM0X7L0cqWPZQii5JtP");
        produto.setExtipi("999");
        produto.setDetalhesExportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemDetalheExportacao()));
        produto.setMedicamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoMedicamento()));
        produto.setNcm("99999999");
        produto.setNumeroPedidoCliente("NNxQ9nrQ3HCe5Mc");
        produto.setNumeroPedidoItemCliente(999999);
        produto.setQuantidadeComercial(new BigDecimal("9999999999.9999"));
        produto.setQuantidadeTributavel(new BigDecimal("9999999999.9999"));
        produto.setUnidadeComercial("Bta64y");
        produto.setUnidadeTributavel("7wqG4h");
        produto.setValorDesconto(new BigDecimal("999999999999.99"));
        produto.setValorOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        produto.setValorSeguro(new BigDecimal("999999999999.99"));
        produto.setValorTotalBruto(new BigDecimal("999999999999.99"));
        produto.setValorUnitario(new BigDecimal("9999999999.9999999999"));
        produto.setValorUnitarioTributavel(new BigDecimal("9999999999.9999999999"));
        produto.setNumeroControleFCI("B01F70AF-10BF-4B1F-848C-65FF57F616FE");
        produto.setNomeclaturaValorAduaneiroEstatistica(Collections.singletonList("AZ0123"));
        produto.toString();
    }

    @Test
    public void devePermitirValorOutrasDespesasAcessoriasNulo() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        produto.setCfop("1302");
        produto.setCodigo("ohVRInAS7jw8LNDP4WWjssSjBHK8nJRERnAeRMcsUokF3YItT93fBto3zZcq");
        produto.setCodigoDeBarras("36811963532505");
        produto.setCodigoDeBarrasTributavel("36811963532505");
        produto.setCampoeValorNota(NFProdutoCompoeValorNota.SIM);
        produto.setDeclaracoesImportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoDeclaracaoImportacao()));
        produto.setDescricao("OBS0ztekCoG0DSSVcQwPKRV2fV842Pye7mED13P4zoDczcXi4AMNvQ7BKBLnHtLc2Z9fuIY1pcKmXSK1IJQSLEs5QWvVGyC74DyJuIM0X7L0cqWPZQii5JtP");
        produto.setExtipi("999");
        produto.setDetalhesExportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemDetalheExportacao()));
        produto.setMedicamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoMedicamento()));
        produto.setNcm("99999999");
        produto.setNumeroPedidoCliente("NNxQ9nrQ3HCe5Mc");
        produto.setNumeroPedidoItemCliente(999999);
        produto.setQuantidadeComercial(new BigDecimal("9999999999.9999"));
        produto.setQuantidadeTributavel(new BigDecimal("9999999999.9999"));
        produto.setUnidadeComercial("Bta64y");
        produto.setUnidadeTributavel("7wqG4h");
        produto.setValorDesconto(new BigDecimal("999999999999.99"));
        produto.setValorFrete(new BigDecimal("999999999999.99"));
        produto.setValorSeguro(new BigDecimal("999999999999.99"));
        produto.setValorTotalBruto(new BigDecimal("999999999999.99"));
        produto.setValorUnitario(new BigDecimal("9999999999.9999999999"));
        produto.setValorUnitarioTributavel(new BigDecimal("9999999999.9999999999"));
        produto.setNomeclaturaValorAduaneiroEstatistica(Collections.singletonList("AZ0123"));
        produto.toString();
    }

    @Test
    public void devePermitirValorSeguroNulo() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        produto.setCfop("1302");
        produto.setCodigo("ohVRInAS7jw8LNDP4WWjssSjBHK8nJRERnAeRMcsUokF3YItT93fBto3zZcq");
        produto.setCodigoDeBarras("36811963532505");
        produto.setCodigoDeBarrasTributavel("36811963532505");
        produto.setCampoeValorNota(NFProdutoCompoeValorNota.SIM);
        produto.setDeclaracoesImportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoDeclaracaoImportacao()));
        produto.setDescricao("OBS0ztekCoG0DSSVcQwPKRV2fV842Pye7mED13P4zoDczcXi4AMNvQ7BKBLnHtLc2Z9fuIY1pcKmXSK1IJQSLEs5QWvVGyC74DyJuIM0X7L0cqWPZQii5JtP");
        produto.setExtipi("999");
        produto.setDetalhesExportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemDetalheExportacao()));
        produto.setMedicamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoMedicamento()));
        produto.setNcm("99999999");
        produto.setNumeroPedidoCliente("NNxQ9nrQ3HCe5Mc");
        produto.setNumeroPedidoItemCliente(999999);
        produto.setQuantidadeComercial(new BigDecimal("9999999999.9999"));
        produto.setQuantidadeTributavel(new BigDecimal("9999999999.9999"));
        produto.setUnidadeComercial("Bta64y");
        produto.setUnidadeTributavel("7wqG4h");
        produto.setValorDesconto(new BigDecimal("999999999999.99"));
        produto.setValorFrete(new BigDecimal("999999999999.99"));
        produto.setValorOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        produto.setValorTotalBruto(new BigDecimal("999999999999.99"));
        produto.setValorUnitario(new BigDecimal("9999999999.9999999999"));
        produto.setValorUnitarioTributavel(new BigDecimal("9999999999.9999999999"));
        produto.setNumeroControleFCI("B01F70AF-10BF-4B1F-848C-65FF57F616FE");
        produto.setNomeclaturaValorAduaneiroEstatistica(Collections.singletonList("AZ0123"));
        produto.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorTotalBrutoNulo() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        produto.setCfop("1302");
        produto.setCodigo("ohVRInAS7jw8LNDP4WWjssSjBHK8nJRERnAeRMcsUokF3YItT93fBto3zZcq");
        produto.setCodigoDeBarras("36811963532505");
        produto.setCodigoDeBarrasTributavel("36811963532505");
        produto.setCampoeValorNota(NFProdutoCompoeValorNota.SIM);
        produto.setDeclaracoesImportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoDeclaracaoImportacao()));
        produto.setDescricao("OBS0ztekCoG0DSSVcQwPKRV2fV842Pye7mED13P4zoDczcXi4AMNvQ7BKBLnHtLc2Z9fuIY1pcKmXSK1IJQSLEs5QWvVGyC74DyJuIM0X7L0cqWPZQii5JtP");
        produto.setExtipi("999");
        produto.setMedicamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoMedicamento()));
        produto.setNcm("99999999");
        produto.setDetalhesExportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemDetalheExportacao()));
        produto.setNumeroPedidoCliente("NNxQ9nrQ3HCe5Mc");
        produto.setNumeroPedidoItemCliente(999999);
        produto.setQuantidadeComercial(new BigDecimal("9999999999.9999"));
        produto.setQuantidadeTributavel(new BigDecimal("9999999999.9999"));
        produto.setUnidadeComercial("Bta64y");
        produto.setUnidadeTributavel("7wqG4h");
        produto.setValorDesconto(new BigDecimal("999999999999.99"));
        produto.setValorFrete(new BigDecimal("999999999999.99"));
        produto.setValorOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        produto.setValorSeguro(new BigDecimal("999999999999.99"));
        produto.setValorUnitario(new BigDecimal("9999999999.9999999999"));
        produto.setValorUnitarioTributavel(new BigDecimal("9999999999.9999999999"));
        produto.setNumeroControleFCI("B01F70AF-10BF-4B1F-848C-65FF57F616FE");
        produto.setNomeclaturaValorAduaneiroEstatistica(Collections.singletonList("AZ0123"));
        produto.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorUnitarioNulo() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        produto.setArmamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoArmamento()));
        produto.setCfop("1302");
        produto.setCodigo("ohVRInAS7jw8LNDP4WWjssSjBHK8nJRERnAeRMcsUokF3YItT93fBto3zZcq");
        produto.setCodigoDeBarras("36811963532505");
        produto.setCodigoDeBarrasTributavel("36811963532505");
        produto.setCombustivel(FabricaDeObjetosFake.getNFNotaInfoItemProdutoCombustivel());
        produto.setCampoeValorNota(NFProdutoCompoeValorNota.SIM);
        produto.setDeclaracoesImportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoDeclaracaoImportacao()));
        produto.setDescricao("OBS0ztekCoG0DSSVcQwPKRV2fV842Pye7mED13P4zoDczcXi4AMNvQ7BKBLnHtLc2Z9fuIY1pcKmXSK1IJQSLEs5QWvVGyC74DyJuIM0X7L0cqWPZQii5JtP");
        produto.setExtipi("999");
        produto.setDetalhesExportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemDetalheExportacao()));
        produto.setMedicamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoMedicamento()));
        produto.setNcm("99999999");
        produto.setNumeroPedidoCliente("NNxQ9nrQ3HCe5Mc");
        produto.setNumeroPedidoItemCliente(999999);
        produto.setQuantidadeComercial(new BigDecimal("9999999999.9999"));
        produto.setQuantidadeTributavel(new BigDecimal("9999999999.9999"));
        produto.setUnidadeComercial("Bta64y");
        produto.setUnidadeTributavel("7wqG4h");
        produto.setValorDesconto(new BigDecimal("999999999999.99"));
        produto.setValorFrete(new BigDecimal("999999999999.99"));
        produto.setValorOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        produto.setValorSeguro(new BigDecimal("999999999999.99"));
        produto.setValorTotalBruto(new BigDecimal("999999999999.99"));
        produto.setValorUnitarioTributavel(new BigDecimal("9999999999.9999999999"));
        produto.setVeiculo(FabricaDeObjetosFake.getNFNotaInfoItemProdutoVeiculo());
        produto.setNumeroControleFCI("B01F70AF-10BF-4B1F-848C-65FF57F616FE");
        produto.setNomeclaturaValorAduaneiroEstatistica(Collections.singletonList("AZ0123"));
        produto.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorUnitarioTributavelNulo() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        produto.setArmamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoArmamento()));
        produto.setCfop("1302");
        produto.setCodigo("ohVRInAS7jw8LNDP4WWjssSjBHK8nJRERnAeRMcsUokF3YItT93fBto3zZcq");
        produto.setCodigoDeBarras("36811963532505");
        produto.setCodigoDeBarrasTributavel("36811963532505");
        produto.setCombustivel(FabricaDeObjetosFake.getNFNotaInfoItemProdutoCombustivel());
        produto.setCampoeValorNota(NFProdutoCompoeValorNota.SIM);
        produto.setDeclaracoesImportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoDeclaracaoImportacao()));
        produto.setDescricao("OBS0ztekCoG0DSSVcQwPKRV2fV842Pye7mED13P4zoDczcXi4AMNvQ7BKBLnHtLc2Z9fuIY1pcKmXSK1IJQSLEs5QWvVGyC74DyJuIM0X7L0cqWPZQii5JtP");
        produto.setExtipi("999");
        produto.setMedicamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoMedicamento()));
        produto.setNcm("99999999");
        produto.setNumeroPedidoCliente("NNxQ9nrQ3HCe5Mc");
        produto.setNumeroPedidoItemCliente(999999);
        produto.setQuantidadeComercial(new BigDecimal("9999999999.9999"));
        produto.setQuantidadeTributavel(new BigDecimal("9999999999.9999"));
        produto.setUnidadeComercial("Bta64y");
        produto.setUnidadeTributavel("7wqG4h");
        produto.setValorDesconto(new BigDecimal("999999999999.99"));
        produto.setValorFrete(new BigDecimal("999999999999.99"));
        produto.setValorOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        produto.setValorSeguro(new BigDecimal("999999999999.99"));
        produto.setValorTotalBruto(new BigDecimal("999999999999.99"));
        produto.setValorUnitario(new BigDecimal("9999999999.9999999999"));
        produto.setVeiculo(FabricaDeObjetosFake.getNFNotaInfoItemProdutoVeiculo());
        produto.setNumeroControleFCI("B01F70AF-10BF-4B1F-848C-65FF57F616FE");
        produto.setNomeclaturaValorAduaneiroEstatistica(Collections.singletonList("AZ0123"));
        produto.toString();
    }

    @Test
    public void naoDevePermitirSetarVeiculoCasoArmamentoOuCombustivelOuRECOPISetado() {
        try {
            final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
            produto.setNumeroRECOPI("13245678901234567890");
            produto.setVeiculo(new DFNotaInfoItemProdutoVeiculo());
            Assert.fail();
        } catch (final IllegalStateException e) {
        }
        try {
            final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
            produto.setArmamentos(new ArrayList<DFNotaInfoItemProdutoArmamento>());
            produto.setVeiculo(new DFNotaInfoItemProdutoVeiculo());
            Assert.fail();
        } catch (final IllegalStateException e) {
        }
        try {
            final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
            produto.setCombustivel(new DFNotaInfoItemProdutoCombustivel());
            produto.setVeiculo(new DFNotaInfoItemProdutoVeiculo());
            Assert.fail();
        } catch (final IllegalStateException e) {
        }
        try {
            final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
            produto.setMedicamentos(new ArrayList<DFNotaInfoItemProdutoMedicamento>());
            produto.setVeiculo(new DFNotaInfoItemProdutoVeiculo());
            Assert.fail();
        } catch (final IllegalStateException e) {
        }
    }

    @Test
    public void naoDevePermitirSetarArmamentoCasoVeiculoMedicamentoCombustivelOuRECOPISetado() {
        try {
            final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
            produto.setArmamentos(new ArrayList<DFNotaInfoItemProdutoArmamento>());
            produto.setVeiculo(new DFNotaInfoItemProdutoVeiculo());
            Assert.fail();
        } catch (final IllegalStateException e) {
        }
        try {
            final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
            produto.setArmamentos(new ArrayList<DFNotaInfoItemProdutoArmamento>());
            produto.setMedicamentos(new ArrayList<DFNotaInfoItemProdutoMedicamento>());
            Assert.fail();
        } catch (final IllegalStateException e) {
        }
        try {
            final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
            produto.setArmamentos(new ArrayList<DFNotaInfoItemProdutoArmamento>());
            produto.setCombustivel(new DFNotaInfoItemProdutoCombustivel());
            Assert.fail();
        } catch (final IllegalStateException e) {
        }
        try {
            final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
            produto.setArmamentos(new ArrayList<DFNotaInfoItemProdutoArmamento>());
            produto.setNumeroRECOPI("12346578901234567890");
            Assert.fail();
        } catch (final IllegalStateException e) {
        }
    }

    @Test
    public void naoDevePermitirSetarRECOPICasoVeiculoMedicamentoCombustivelSetadoOuArmamento() {
        try {
            final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
            produto.setNumeroRECOPI("12346578901234567890");
            produto.setVeiculo(new DFNotaInfoItemProdutoVeiculo());
            Assert.fail();
        } catch (final IllegalStateException e) {
        }
        try {
            final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
            produto.setNumeroRECOPI("12346578901234567890");
            produto.setMedicamentos(new ArrayList<DFNotaInfoItemProdutoMedicamento>());
            Assert.fail();
        } catch (final IllegalStateException e) {
        }
        try {
            final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
            produto.setNumeroRECOPI("12346578901234567890");
            produto.setCombustivel(new DFNotaInfoItemProdutoCombustivel());
            Assert.fail();
        } catch (final IllegalStateException e) {
        }
        try {
            final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
            produto.setNumeroRECOPI("12346578901234567890");
            produto.setArmamentos(new ArrayList<DFNotaInfoItemProdutoArmamento>());
            Assert.fail();
        } catch (final IllegalStateException e) {
        }
    }

    @Test
    public void naoDevePermitirSetarMedicamentoCasoVeiculoArmamentoCombustivelOuRECOPISetado() {
        try {
            final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
            produto.setVeiculo(new DFNotaInfoItemProdutoVeiculo());
            produto.setMedicamentos(new ArrayList<DFNotaInfoItemProdutoMedicamento>());
            Assert.fail();
        } catch (final IllegalStateException e) {
        }
        try {
            final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
            produto.setArmamentos(new ArrayList<DFNotaInfoItemProdutoArmamento>());
            produto.setMedicamentos(new ArrayList<DFNotaInfoItemProdutoMedicamento>());
            Assert.fail();
        } catch (final IllegalStateException e) {
        }
        try {
            final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
            produto.setNumeroRECOPI("013246578901234657890");
            produto.setMedicamentos(new ArrayList<DFNotaInfoItemProdutoMedicamento>());
            Assert.fail();
        } catch (final IllegalStateException e) {
        }
        try {
            final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
            produto.setCombustivel(new DFNotaInfoItemProdutoCombustivel());
            produto.setMedicamentos(new ArrayList<DFNotaInfoItemProdutoMedicamento>());
            Assert.fail();
        } catch (final IllegalStateException e) {
        }
    }

    @Test
    public void devePermitirVeiculoNulo() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        produto.setCfop("1302");
        produto.setCodigo("ohVRInAS7jw8LNDP4WWjssSjBHK8nJRERnAeRMcsUokF3YItT93fBto3zZcq");
        produto.setCodigoDeBarras("36811963532505");
        produto.setCodigoDeBarrasTributavel("36811963532505");
        produto.setCampoeValorNota(NFProdutoCompoeValorNota.SIM);
        produto.setDeclaracoesImportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoDeclaracaoImportacao()));
        produto.setDescricao("OBS0ztekCoG0DSSVcQwPKRV2fV842Pye7mED13P4zoDczcXi4AMNvQ7BKBLnHtLc2Z9fuIY1pcKmXSK1IJQSLEs5QWvVGyC74DyJuIM0X7L0cqWPZQii5JtP");
        produto.setExtipi("999");
        produto.setMedicamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoMedicamento()));
        produto.setNcm("99999999");
        produto.setNumeroPedidoCliente("NNxQ9nrQ3HCe5Mc");
        produto.setNumeroPedidoItemCliente(999999);
        produto.setQuantidadeComercial(new BigDecimal("9999999999.9999"));
        produto.setQuantidadeTributavel(new BigDecimal("9999999999.9999"));
        produto.setUnidadeComercial("Bta64y");
        produto.setUnidadeTributavel("7wqG4h");
        produto.setValorDesconto(new BigDecimal("999999999999.99"));
        produto.setValorFrete(new BigDecimal("999999999999.99"));
        produto.setDetalhesExportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemDetalheExportacao()));
        produto.setValorOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        produto.setValorSeguro(new BigDecimal("999999999999.99"));
        produto.setValorTotalBruto(new BigDecimal("999999999999.99"));
        produto.setValorUnitario(new BigDecimal("9999999999.9999999999"));
        produto.setValorUnitarioTributavel(new BigDecimal("9999999999.9999999999"));
        produto.setNumeroControleFCI("B01F70AF-10BF-4B1F-848C-65FF57F616FE");
        produto.setNomeclaturaValorAduaneiroEstatistica(Collections.singletonList("AZ0123"));
        produto.toString();
    }

    @Test
    public void devePermitirDetalhesExportacaoNulo() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        produto.setCfop("1302");
        produto.setCodigo("ohVRInAS7jw8LNDP4WWjssSjBHK8nJRERnAeRMcsUokF3YItT93fBto3zZcq");
        produto.setCodigoDeBarras("36811963532505");
        produto.setCodigoDeBarrasTributavel("36811963532505");
        produto.setCampoeValorNota(NFProdutoCompoeValorNota.SIM);
        produto.setDeclaracoesImportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoDeclaracaoImportacao()));
        produto.setDescricao("OBS0ztekCoG0DSSVcQwPKRV2fV842Pye7mED13P4zoDczcXi4AMNvQ7BKBLnHtLc2Z9fuIY1pcKmXSK1IJQSLEs5QWvVGyC74DyJuIM0X7L0cqWPZQii5JtP");
        produto.setExtipi("999");
        produto.setCodigoEspecificadorSituacaoTributaria("9999999");
        produto.setMedicamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoMedicamento()));
        produto.setNcm("99999999");
        produto.setNumeroPedidoCliente("NNxQ9nrQ3HCe5Mc");
        produto.setNumeroPedidoItemCliente(999999);
        produto.setQuantidadeComercial(new BigDecimal("9999999999.9999"));
        produto.setQuantidadeTributavel(new BigDecimal("9999999999.9999"));
        produto.setUnidadeComercial("Bta64y");
        produto.setUnidadeTributavel("7wqG4h");
        produto.setValorDesconto(new BigDecimal("999999999999.99"));
        produto.setValorFrete(new BigDecimal("999999999999.99"));
        produto.setValorOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        produto.setValorSeguro(new BigDecimal("999999999999.99"));
        produto.setValorTotalBruto(new BigDecimal("999999999999.99"));
        produto.setValorUnitario(new BigDecimal("9999999999.9999999999"));
        produto.setNomeclaturaValorAduaneiroEstatistica(Collections.singletonList("AZ0123"));
        produto.setValorUnitarioTributavel(new BigDecimal("9999999999.9999999999"));
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirDetalhesImportacaoTamanhoInvalido() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();

        final List<DFNotaInfoItemDetalheExportacao> detalhes = new ArrayList<>();
        for (int i = 0; i < 501; i++) {
            detalhes.add(FabricaDeObjetosFake.getNFNotaInfoItemDetalheExportacao());
        }
        produto.setDetalhesExportacao(detalhes);
    }

    @Test
    public void deveObterCfopComoFoiSetado() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        final String cfop = "1302";
        produto.setCfop(cfop);
        Assert.assertEquals(cfop, produto.getCfop());
    }

    @Test
    public void deveObterCodigoComoFoiSetado() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        final String codigo = "ohVRInAS7jw8LNDP4WWjssSjBHK8nJRERnAeRMcsUokF3YItT93fBto3zZcq";
        produto.setCodigo(codigo);
        Assert.assertEquals(codigo, produto.getCodigo());
    }

    @Test
    public void deveObterCodigoDeBarrasComoFoiSetado() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        final String codigoDeBarras = "36811963532505";
        produto.setCodigoDeBarras(codigoDeBarras);
        Assert.assertEquals(codigoDeBarras, produto.getCodigoDeBarras());
    }

    @Test
    public void deveObterCodigoDeBarrasTributavelComoFoiSetado() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        final String codigoDeBarrasTributavel = "36811963532505";
        produto.setCodigoDeBarrasTributavel(codigoDeBarrasTributavel);
        Assert.assertEquals(codigoDeBarrasTributavel, produto.getCodigoDeBarrasTributavel());
    }

    @Test
    public void deveObterCampoeValorNotaComoFoiSetado() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        final NFProdutoCompoeValorNota compoeValorNota = NFProdutoCompoeValorNota.SIM;
        produto.setCampoeValorNota(compoeValorNota);
        Assert.assertEquals(compoeValorNota, produto.getCompoeValorNota());
    }

    @Test
    public void deveObterDeclaracoesImportacaoComoFoiSetado() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        final List<DFNotaInfoItemProdutoDeclaracaoImportacao> declaracoesImportacao = Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoDeclaracaoImportacao());
        produto.setDeclaracoesImportacao(declaracoesImportacao);
        Assert.assertEquals(declaracoesImportacao, produto.getDeclaracoesImportacao());
    }

    @Test
    public void deveObterDescricaoComoFoiSetado() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        final String descricao = "OBS0ztekCoG0DSSVcQwPKRV2fV842Pye7mED13P4zoDczcXi4AMNvQ7BKBLnHtLc2Z9fuIY1pcKmXSK1IJQSLEs5QWvVGyC74DyJuIM0X7L0cqWPZQii5JtP";
        produto.setDescricao(descricao);
        Assert.assertEquals(descricao, produto.getDescricao());
    }

    @Test
    public void deveObterExtipiComoFoiSetado() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        final String extipi = "999";
        produto.setExtipi(extipi);
        Assert.assertEquals(extipi, produto.getExtipi());
    }

    @Test
    public void deveObterCodigoEspecificadorSituacaoTributariaComoFoiSetado() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        final String codigoEspecificadorSituacaoTributaria = "9999999";
        produto.setCodigoEspecificadorSituacaoTributaria(codigoEspecificadorSituacaoTributaria);
        Assert.assertEquals(codigoEspecificadorSituacaoTributaria, produto.getCodigoEspecificadorSituacaoTributaria());
    }

    @Test
    public void deveObterMedicamentosComoFoiSetado() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        final List<DFNotaInfoItemProdutoMedicamento> medicamentos = Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoMedicamento());
        produto.setMedicamentos(medicamentos);
        Assert.assertEquals(medicamentos, produto.getMedicamentos());
    }

    @Test
    public void deveObterNcmComoFoiSetado() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        final String ncm = "99999999";
        produto.setNcm(ncm);
        Assert.assertEquals(ncm, produto.getNcm());
    }

    @Test
    public void deveObterNumeroPedidoClienteComoFoiSetado() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        final String numeroPedidoCliente = "NNxQ9nrQ3HCe5Mc";
        produto.setNumeroPedidoCliente(numeroPedidoCliente);
        Assert.assertEquals(numeroPedidoCliente, produto.getNumeroPedidoCliente());
    }

    @Test
    public void deveObterNumeroPedidoItemClienteComoFoiSetado() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        final Integer numeroPedidoItemCliente = 999999;
        produto.setNumeroPedidoItemCliente(numeroPedidoItemCliente);
        Assert.assertEquals(numeroPedidoItemCliente, produto.getNumeroPedidoItemCliente());
    }

    @Test
    public void deveObterQuantidadeComercialComoFoiSetado() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        final BigDecimal quantidadeComercial = new BigDecimal("9999999999.9999");
        produto.setQuantidadeComercial(quantidadeComercial);
        Assert.assertEquals("9999999999.9999", produto.getQuantidadeComercial());
    }

    @Test
    public void deveObterQuantidadeTributavelComoFoiSetado() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        final BigDecimal quantidadeTributavel = new BigDecimal("9999999999.9999");
        produto.setQuantidadeTributavel(quantidadeTributavel);
        Assert.assertEquals("9999999999.9999", produto.getQuantidadeTributavel());
    }

    @Test
    public void deveObterNnidadeComercialComoFoiSetado() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        final String unidadeComercial = "Bta64y";
        produto.setUnidadeComercial(unidadeComercial);
        Assert.assertEquals(unidadeComercial, produto.getUnidadeComercial());
    }

    @Test
    public void deveObterNnidadeTributavelComoFoiSetado() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        final String unidadeTributavel = "7wqG4h";
        produto.setUnidadeTributavel(unidadeTributavel);
        Assert.assertEquals(unidadeTributavel, produto.getUnidadeTributavel());
    }

    @Test
    public void deveObterValorDescontoComoFoiSetado() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        final BigDecimal valorDesconto = new BigDecimal("999999999999.99");
        produto.setValorDesconto(valorDesconto);
        Assert.assertEquals("999999999999.99", produto.getValorDesconto());
    }

    @Test
    public void deveObterValorFreteComoFoiSetado() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        final BigDecimal valorFrete = new BigDecimal("999999999999.99");
        produto.setValorFrete(valorFrete);
        Assert.assertEquals("999999999999.99", produto.getValorFrete());
    }

    @Test
    public void deveObterValorOutrasDespesasAcessoriasComoFoiSetado() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        final BigDecimal valorOutrasDespesasAcessorias = new BigDecimal("999999999999.99");
        produto.setValorOutrasDespesasAcessorias(valorOutrasDespesasAcessorias);
        Assert.assertEquals("999999999999.99", produto.getValorOutrasDespesasAcessorias());
    }

    @Test
    public void deveObterValorSeguroComoFoiSetado() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        final BigDecimal valorSeguro = new BigDecimal("999999999999.99");
        produto.setValorSeguro(valorSeguro);
        Assert.assertEquals("999999999999.99", produto.getValorSeguro());
    }

    @Test
    public void deveObterValorTotalBrutoComoFoiSetado() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        final BigDecimal valorTotalBruto = new BigDecimal("999999999999.99");
        produto.setValorTotalBruto(valorTotalBruto);
        Assert.assertEquals("999999999999.99", produto.getValorTotalBruto());
    }

    @Test
    public void deveObterValorUnitarioComoFoiSetado() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        final BigDecimal valorUnitario = new BigDecimal("9999999999.9999999999");
        produto.setValorUnitario(valorUnitario);
        Assert.assertEquals("9999999999.9999999999", produto.getValorUnitario());
    }

    @Test
    public void deveObterNomeclaturaValorAduaneiroEstatisticaComoFoiSetado() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        final List<String> nomeclaturaValorAduaneiroEstatistica = Collections.singletonList("AZ0123");
        produto.setNomeclaturaValorAduaneiroEstatistica(nomeclaturaValorAduaneiroEstatistica);
        Assert.assertEquals(nomeclaturaValorAduaneiroEstatistica, produto.getNomeclaturaValorAduaneiroEstatistica());
    }

    @Test
    public void deveObterValorUnitarioTributavelComoFoiSetado() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        final BigDecimal valorUnitarioTributavel = new BigDecimal("9999999999.9999999999");
        produto.setValorUnitarioTributavel(valorUnitarioTributavel);
        Assert.assertEquals("9999999999.9999999999", produto.getValorUnitarioTributavel());
    }

    @Test
    public void deveObterDetalhesExportacaoComoFoiSetado() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        final List<DFNotaInfoItemDetalheExportacao> detalhesExportacao = Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemDetalheExportacao());
        produto.setDetalhesExportacao(detalhesExportacao);
        Assert.assertEquals(detalhesExportacao, produto.getDetalhesExportacao());
    }

    @Test
    public void deveObterNumeroControleFCIComoFoiSetado() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        final String numeroControleFCI = "B01F70AF-10BF-4B1F-848C-65FF57F616FE";
        produto.setNumeroControleFCI(numeroControleFCI);
        Assert.assertEquals(numeroControleFCI, produto.getNumeroControleFCI());
    }

    @Test
    public void deveObterArmamentosComoFoiSetado() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        final List<DFNotaInfoItemProdutoArmamento> armamentos = Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoArmamento());
        produto.setArmamentos(armamentos);
        Assert.assertEquals(armamentos, produto.getArmamentos());
    }

    @Test
    public void deveObterVeiculoComoFoiSetado() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        final DFNotaInfoItemProdutoVeiculo veiculo = FabricaDeObjetosFake.getNFNotaInfoItemProdutoVeiculo();
        produto.setVeiculo(veiculo);
        Assert.assertEquals(veiculo, produto.getVeiculo());
    }

    @Test
    public void deveObterCombustivelComoFoiSetado() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        final DFNotaInfoItemProdutoCombustivel combustivel = FabricaDeObjetosFake.getNFNotaInfoItemProdutoCombustivel();
        produto.setCombustivel(combustivel);
        Assert.assertEquals(combustivel, produto.getCombustivel());
    }

    @Test
    public void deveObterNumeroRECOPIComoFoiSetado() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        final String numeroRECOPI = "13245678901234567890";
        produto.setNumeroRECOPI(numeroRECOPI);
        Assert.assertEquals(numeroRECOPI, produto.getNumeroRECOPI());
    }

    @Test
    public void deveRetornarVazioCasoNaoPossuaCodigoDeBarras() {
        Assert.assertEquals("", new DFNotaInfoItemProduto().getCodigoDeBarras());
    }

    @Test
    public void deveGerarTagsCeansVaziasQuandoProdutoNaoPossuiCodigoDeBarras() {
        final DFNotaInfoItemProduto notaInfoItemProduto = FabricaDeObjetosFake.getNFNotaInfoItemProduto();
        notaInfoItemProduto.setCodigoDeBarrasTributavel("");
        notaInfoItemProduto.setCodigoDeBarras("");

        final String xmlEsperado = "<DFNotaInfoItemProduto><cProd>ohVRInAS7jw8LNDP4WWjssSjBHK8nJRERnAeRMcsUokF3YItT93fBto3zZcq</cProd><cEAN></cEAN><xProd>OBS0ztekCoG0DSSVcQwPKRV2fV842Pye7mED13P4zoDczcXi4AMNvQ7BKBLnHtLc2Z9fuIY1pcKmXSK1IJQSLEs5QWvVGyC74DyJuIM0X7L0cqWPZQii5JtP</xProd><NCM>99999999</NCM><NVE>AZ0123</NVE><CEST>9999999</CEST><EXTIPI>999</EXTIPI><CFOP>1302</CFOP><uCom>Bta64y</uCom><qCom>9999999999.9999</qCom><vUnCom>9999999999.9999999999</vUnCom><vProd>999999999999.99</vProd><cEANTrib></cEANTrib><uTrib>7wqG4h</uTrib><qTrib>9999999999.9999</qTrib><vUnTrib>9999999999.9999999999</vUnTrib><vFrete>999999999999.99</vFrete><vSeg>999999999999.99</vSeg><vDesc>999999999999.99</vDesc><vOutro>999999999999.99</vOutro><indTot>1</indTot><DI><nDI>ZRJihqWLyHnb</nDI><dDI>2014-02-02</dDI><xLocDesemb>kiVfWKB94ggsrWND0XBXwEjJkoiTXhkmX9qKGKzjpnEHHp852bDkYeEUkzpU</xLocDesemb><UFDesemb>RS</UFDesemb><dDesemb>2014-01-01</dDesemb><tpViaTransp>4</tpViaTransp><vAFRMM>999999999999.99</vAFRMM><tpIntermedio>3</tpIntermedio><CNPJ>12345678901234</CNPJ><UFTerceiro>RS</UFTerceiro><cExportador>E9jBqM65b0MiCiRnYil203iNGJOSZs8iU1KGmQsj2N0kw6QMuvhbsQosFGcU</cExportador><adi><nAdicao>999</nAdicao><nSeqAdic>999</nSeqAdic><cFabricante>sA2FBRFMMNgF1AKRDDXYOlc3zGvzEc69l6zQ5O5uAUe82XZ3szQfw01DW0Ki</cFabricante><vDescDI>999999999999.99</vDescDI><nDraw>99999999999</nDraw></adi></DI><xPed>NNxQ9nrQ3HCe5Mc</xPed><nItemPed>999999</nItemPed><med><nLote>yq50jVDZsvQVNuWoS45U</nLote><qLote>9999999.999</qLote><dFab>2014-01-01</dFab><dVal>2015-01-01</dVal><vPMC>999999999999.99</vPMC></med></DFNotaInfoItemProduto>";
        Assert.assertEquals(xmlEsperado, notaInfoItemProduto.toString());
    }

    @Test
    public void deveGerarXMLComCeanECeanTribVaziosCasoSejaNuloAoSerParseado() throws Exception {
        final String xml = "<DFNotaInfoItemProduto><cProd>ohVRInAS7jw8LNDP4WWjssSjBHK8nJRERnAeRMcsUokF3YItT93fBto3zZcq</cProd><cEAN></cEAN><xProd>OBS0ztekCoG0DSSVcQwPKRV2fV842Pye7mED13P4zoDczcXi4AMNvQ7BKBLnHtLc2Z9fuIY1pcKmXSK1IJQSLEs5QWvVGyC74DyJuIM0X7L0cqWPZQii5JtP</xProd><NCM>99999999</NCM><NVE>AZ0123</NVE><CEST>9999999</CEST><EXTIPI>999</EXTIPI><CFOP>1302</CFOP><uCom>Bta64y</uCom><qCom>9999999999.9999</qCom><vUnCom>9999999999.9999999999</vUnCom><vProd>999999999999.99</vProd><cEANTrib></cEANTrib><uTrib>7wqG4h</uTrib><qTrib>9999999999.9999</qTrib><vUnTrib>9999999999.9999999999</vUnTrib><vFrete>999999999999.99</vFrete><vSeg>999999999999.99</vSeg><vDesc>999999999999.99</vDesc><vOutro>999999999999.99</vOutro><indTot>1</indTot><DI><nDI>ZRJihqWLyHnb</nDI><dDI>2014-02-02</dDI><xLocDesemb>kiVfWKB94ggsrWND0XBXwEjJkoiTXhkmX9qKGKzjpnEHHp852bDkYeEUkzpU</xLocDesemb><UFDesemb>RS</UFDesemb><dDesemb>2014-01-01</dDesemb><tpViaTransp>4</tpViaTransp><vAFRMM>999999999999.99</vAFRMM><tpIntermedio>3</tpIntermedio><CNPJ>12345678901234</CNPJ><UFTerceiro>RS</UFTerceiro><cExportador>E9jBqM65b0MiCiRnYil203iNGJOSZs8iU1KGmQsj2N0kw6QMuvhbsQosFGcU</cExportador><adi><nAdicao>999</nAdicao><nSeqAdic>999</nSeqAdic><cFabricante>sA2FBRFMMNgF1AKRDDXYOlc3zGvzEc69l6zQ5O5uAUe82XZ3szQfw01DW0Ki</cFabricante><vDescDI>999999999999.99</vDescDI><nDraw>99999999999</nDraw></adi></DI><xPed>NNxQ9nrQ3HCe5Mc</xPed><nItemPed>999999</nItemPed><med><nLote>yq50jVDZsvQVNuWoS45U</nLote><qLote>9999999.999</qLote><dFab>2014-01-01</dFab><dVal>2015-01-01</dVal><vPMC>999999999999.99</vPMC></med></DFNotaInfoItemProduto>";
        final DFNotaInfoItemProduto notaInfoItemProduto = new NFPersister().read(DFNotaInfoItemProduto.class, xml);
        Assert.assertEquals(xml, notaInfoItemProduto.toString());
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<DFNotaInfoItemProduto><cProd>ohVRInAS7jw8LNDP4WWjssSjBHK8nJRERnAeRMcsUokF3YItT93fBto3zZcq</cProd><cEAN>36811963532505</cEAN><xProd>OBS0ztekCoG0DSSVcQwPKRV2fV842Pye7mED13P4zoDczcXi4AMNvQ7BKBLnHtLc2Z9fuIY1pcKmXSK1IJQSLEs5QWvVGyC74DyJuIM0X7L0cqWPZQii5JtP</xProd><NCM>99999999</NCM><NVE>AZ0123</NVE><CEST>9999999</CEST><EXTIPI>999</EXTIPI><CFOP>1302</CFOP><uCom>Bta64y</uCom><qCom>9999999999.9999</qCom><vUnCom>9999999999.9999999999</vUnCom><vProd>999999999999.99</vProd><cEANTrib>36811963532505</cEANTrib><uTrib>7wqG4h</uTrib><qTrib>9999999999.9999</qTrib><vUnTrib>9999999999.9999999999</vUnTrib><vFrete>999999999999.99</vFrete><vSeg>999999999999.99</vSeg><vDesc>999999999999.99</vDesc><vOutro>999999999999.99</vOutro><indTot>1</indTot><DI><nDI>ZRJihqWLyHnb</nDI><dDI>2014-02-02</dDI><xLocDesemb>kiVfWKB94ggsrWND0XBXwEjJkoiTXhkmX9qKGKzjpnEHHp852bDkYeEUkzpU</xLocDesemb><UFDesemb>RS</UFDesemb><dDesemb>2014-01-01</dDesemb><tpViaTransp>4</tpViaTransp><vAFRMM>999999999999.99</vAFRMM><tpIntermedio>3</tpIntermedio><CNPJ>12345678901234</CNPJ><UFTerceiro>RS</UFTerceiro><cExportador>E9jBqM65b0MiCiRnYil203iNGJOSZs8iU1KGmQsj2N0kw6QMuvhbsQosFGcU</cExportador><adi><nAdicao>999</nAdicao><nSeqAdic>999</nSeqAdic><cFabricante>sA2FBRFMMNgF1AKRDDXYOlc3zGvzEc69l6zQ5O5uAUe82XZ3szQfw01DW0Ki</cFabricante><vDescDI>999999999999.99</vDescDI><nDraw>99999999999</nDraw></adi></DI><xPed>NNxQ9nrQ3HCe5Mc</xPed><nItemPed>999999</nItemPed><med><nLote>yq50jVDZsvQVNuWoS45U</nLote><qLote>9999999.999</qLote><dFab>2014-01-01</dFab><dVal>2015-01-01</dVal><vPMC>999999999999.99</vPMC></med></DFNotaInfoItemProduto>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoItemProduto().toString());
    }
}