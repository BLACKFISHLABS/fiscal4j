package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.nfe.classes.*;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoICMS70Test {

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualAliquotaComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMS70().setPercentualAliquota(new BigDecimal("10000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualAliquotaImpostoICMSSTComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMS70().setPercentualAliquotaImpostoICMSST(new BigDecimal("1000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualMargemValorAdicionadoICMSSTComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMS70().setPercentualMargemValorAdicionadoICMSST(new BigDecimal("1000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualReducaoBCComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMS70().setPercentualReducaoBC(new BigDecimal("1000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualReducaoBCICMSSTComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMS70().setPercentualReducaoBCICMSST(new BigDecimal("1000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorBCComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMS70().setValorBC(new BigDecimal("10000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorBCSTComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMS70().setValorBCST(new BigDecimal("10000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorICMSSTComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMS70().setValorICMSST(new BigDecimal("10000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorTributoComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMS70().setValorTributo(new BigDecimal("10000000000000"));
    }

    @Test
    public void devePermitirValorICMSDesoneracaoNulo() {
        final DFNotaInfoItemImpostoICMS70 icms70 = new DFNotaInfoItemImpostoICMS70();
        icms70.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.COM_REDUCAO_BASE_CALCULO);
        icms70.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms70.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms70.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms70.setPercentualAliquota(new BigDecimal("99.99"));
        icms70.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms70.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms70.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms70.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms70.setValorBC(new BigDecimal("999999999999.99"));
        icms70.setValorBCST(new BigDecimal("999999999999.99"));
        icms70.setValorICMSST(new BigDecimal("999999999999.99"));
        icms70.setValorTributo(new BigDecimal("999999999999.99"));
        icms70.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms70.toString();
    }

    @Test
    public void devePermitirDesoneracaoNulo() {
        final DFNotaInfoItemImpostoICMS70 icms70 = new DFNotaInfoItemImpostoICMS70();
        icms70.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.COM_REDUCAO_BASE_CALCULO);
        icms70.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms70.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms70.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms70.setPercentualAliquota(new BigDecimal("99.99"));
        icms70.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms70.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms70.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms70.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms70.setValorBC(new BigDecimal("999999999999.99"));
        icms70.setValorBCST(new BigDecimal("999999999999.99"));
        icms70.setValorICMSST(new BigDecimal("999999999999.99"));
        icms70.setValorTributo(new BigDecimal("999999999999.99"));
        icms70.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms70.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirSituacaoTributariaNulo() {
        final DFNotaInfoItemImpostoICMS70 icms70 = new DFNotaInfoItemImpostoICMS70();
        icms70.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms70.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms70.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms70.setPercentualAliquota(new BigDecimal("99.99"));
        icms70.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms70.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms70.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms70.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms70.setValorBC(new BigDecimal("999999999999.99"));
        icms70.setValorBCST(new BigDecimal("999999999999.99"));
        icms70.setValorICMSST(new BigDecimal("999999999999.99"));
        icms70.setValorTributo(new BigDecimal("999999999999.99"));
        icms70.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms70.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms70.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirModalidadeBCNulo() {
        final DFNotaInfoItemImpostoICMS70 icms70 = new DFNotaInfoItemImpostoICMS70();
        icms70.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.COM_REDUCAO_BASE_CALCULO);
        icms70.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms70.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms70.setPercentualAliquota(new BigDecimal("99.99"));
        icms70.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms70.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms70.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms70.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms70.setValorBC(new BigDecimal("999999999999.99"));
        icms70.setValorBCST(new BigDecimal("999999999999.99"));
        icms70.setValorICMSST(new BigDecimal("999999999999.99"));
        icms70.setValorTributo(new BigDecimal("999999999999.99"));
        icms70.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms70.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms70.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirModalidadeDeterminacaoBCICMSSTNulo() {
        final DFNotaInfoItemImpostoICMS70 icms70 = new DFNotaInfoItemImpostoICMS70();
        icms70.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.COM_REDUCAO_BASE_CALCULO);
        icms70.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms70.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms70.setPercentualAliquota(new BigDecimal("99.99"));
        icms70.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms70.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms70.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms70.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms70.setValorBC(new BigDecimal("999999999999.99"));
        icms70.setValorBCST(new BigDecimal("999999999999.99"));
        icms70.setValorICMSST(new BigDecimal("999999999999.99"));
        icms70.setValorTributo(new BigDecimal("999999999999.99"));
        icms70.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms70.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms70.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirOrigemNulo() {
        final DFNotaInfoItemImpostoICMS70 icms70 = new DFNotaInfoItemImpostoICMS70();
        icms70.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.COM_REDUCAO_BASE_CALCULO);
        icms70.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms70.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms70.setPercentualAliquota(new BigDecimal("99.99"));
        icms70.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms70.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms70.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms70.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms70.setValorBC(new BigDecimal("999999999999.99"));
        icms70.setValorBCST(new BigDecimal("999999999999.99"));
        icms70.setValorICMSST(new BigDecimal("999999999999.99"));
        icms70.setValorTributo(new BigDecimal("999999999999.99"));
        icms70.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms70.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms70.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPercentualAliquotaNulo() {
        final DFNotaInfoItemImpostoICMS70 icms70 = new DFNotaInfoItemImpostoICMS70();
        icms70.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.COM_REDUCAO_BASE_CALCULO);
        icms70.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms70.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms70.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms70.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms70.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms70.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms70.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms70.setValorBC(new BigDecimal("999999999999.99"));
        icms70.setValorBCST(new BigDecimal("999999999999.99"));
        icms70.setValorICMSST(new BigDecimal("999999999999.99"));
        icms70.setValorTributo(new BigDecimal("999999999999.99"));
        icms70.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms70.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms70.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPercentualAliquotaImpostoICMSSTNulo() {
        final DFNotaInfoItemImpostoICMS70 icms70 = new DFNotaInfoItemImpostoICMS70();
        icms70.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.COM_REDUCAO_BASE_CALCULO);
        icms70.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms70.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms70.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms70.setPercentualAliquota(new BigDecimal("99.99"));
        icms70.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms70.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms70.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms70.setValorBC(new BigDecimal("999999999999.99"));
        icms70.setValorBCST(new BigDecimal("999999999999.99"));
        icms70.setValorICMSST(new BigDecimal("999999999999.99"));
        icms70.setValorTributo(new BigDecimal("999999999999.99"));
        icms70.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms70.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms70.toString();
    }

    @Test
    public void devePermitirPercentualMargemValorAdicionadoICMSSTNulo() {
        final DFNotaInfoItemImpostoICMS70 icms70 = new DFNotaInfoItemImpostoICMS70();
        icms70.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.COM_REDUCAO_BASE_CALCULO);
        icms70.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms70.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms70.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms70.setPercentualAliquota(new BigDecimal("99.99"));
        icms70.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms70.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms70.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms70.setValorBC(new BigDecimal("999999999999.99"));
        icms70.setValorBCST(new BigDecimal("999999999999.99"));
        icms70.setValorICMSST(new BigDecimal("999999999999.99"));
        icms70.setValorTributo(new BigDecimal("999999999999.99"));
        icms70.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms70.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms70.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void devePermitirPercentualReducaoBCNulo() {
        final DFNotaInfoItemImpostoICMS70 icms70 = new DFNotaInfoItemImpostoICMS70();
        icms70.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.COM_REDUCAO_BASE_CALCULO);
        icms70.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms70.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms70.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms70.setPercentualAliquota(new BigDecimal("99.99"));
        icms70.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms70.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms70.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms70.setValorBC(new BigDecimal("999999999999.99"));
        icms70.setValorBCST(new BigDecimal("999999999999.99"));
        icms70.setValorICMSST(new BigDecimal("999999999999.99"));
        icms70.setValorTributo(new BigDecimal("999999999999.99"));
        icms70.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms70.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms70.toString();
    }

    @Test
    public void devePermitirPercentualReducaoBCICMSSTNulo() {
        final DFNotaInfoItemImpostoICMS70 icms70 = new DFNotaInfoItemImpostoICMS70();
        icms70.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.COM_REDUCAO_BASE_CALCULO);
        icms70.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms70.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms70.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms70.setPercentualAliquota(new BigDecimal("99.99"));
        icms70.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms70.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms70.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms70.setValorBC(new BigDecimal("999999999999.99"));
        icms70.setValorBCST(new BigDecimal("999999999999.99"));
        icms70.setValorICMSST(new BigDecimal("999999999999.99"));
        icms70.setValorTributo(new BigDecimal("999999999999.99"));
        icms70.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms70.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms70.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorBCNulo() {
        final DFNotaInfoItemImpostoICMS70 icms70 = new DFNotaInfoItemImpostoICMS70();
        icms70.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.COM_REDUCAO_BASE_CALCULO);
        icms70.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms70.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms70.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms70.setPercentualAliquota(new BigDecimal("99.99"));
        icms70.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms70.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms70.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms70.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms70.setValorBCST(new BigDecimal("999999999999.99"));
        icms70.setValorICMSST(new BigDecimal("999999999999.99"));
        icms70.setValorTributo(new BigDecimal("999999999999.99"));
        icms70.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms70.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms70.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorBCSTNulo() {
        final DFNotaInfoItemImpostoICMS70 icms70 = new DFNotaInfoItemImpostoICMS70();
        icms70.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.COM_REDUCAO_BASE_CALCULO);
        icms70.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms70.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms70.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms70.setPercentualAliquota(new BigDecimal("99.99"));
        icms70.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms70.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms70.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms70.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms70.setValorBC(new BigDecimal("999999999999.99"));
        icms70.setValorICMSST(new BigDecimal("999999999999.99"));
        icms70.setValorTributo(new BigDecimal("999999999999.99"));
        icms70.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms70.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms70.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorICMSSTNulo() {
        final DFNotaInfoItemImpostoICMS70 icms70 = new DFNotaInfoItemImpostoICMS70();
        icms70.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.COM_REDUCAO_BASE_CALCULO);
        icms70.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms70.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms70.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms70.setPercentualAliquota(new BigDecimal("99.99"));
        icms70.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms70.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms70.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms70.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms70.setValorBC(new BigDecimal("999999999999.99"));
        icms70.setValorBCST(new BigDecimal("999999999999.99"));
        icms70.setValorTributo(new BigDecimal("999999999999.99"));
        icms70.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms70.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms70.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorTributoNulo() {
        final DFNotaInfoItemImpostoICMS70 icms70 = new DFNotaInfoItemImpostoICMS70();
        icms70.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.COM_REDUCAO_BASE_CALCULO);
        icms70.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms70.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms70.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms70.setPercentualAliquota(new BigDecimal("99.99"));
        icms70.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms70.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms70.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms70.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms70.setValorBC(new BigDecimal("999999999999.99"));
        icms70.setValorBCST(new BigDecimal("999999999999.99"));
        icms70.setValorICMSST(new BigDecimal("999999999999.99"));
        icms70.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms70.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms70.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final DFNotaInfoItemImpostoICMS70 icms70 = new DFNotaInfoItemImpostoICMS70();
        icms70.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.COM_REDUCAO_BASE_CALCULO);
        icms70.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms70.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms70.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms70.setPercentualAliquota(new BigDecimal("99.99"));
        icms70.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms70.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms70.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms70.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms70.setValorBC(new BigDecimal("999999999999.99"));
        icms70.setValorBCST(new BigDecimal("999999999999.99"));
        icms70.setValorICMSST(new BigDecimal("999999999999.99"));
        icms70.setValorTributo(new BigDecimal("999999999999.99"));
        icms70.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms70.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));

        final String xmlEsperado = "<DFNotaInfoItemImpostoICMS70><orig>2</orig><CST>20</CST><modBC>3</modBC><pRedBC>99.99</pRedBC><vBC>999999999999.99</vBC><pICMS>99.99</pICMS><vICMS>999999999999.99</vICMS><modBCST>3</modBCST><pMVAST>99.99</pMVAST><pRedBCST>99.99</pRedBCST><vBCST>999999999999.99</vBCST><pICMSST>99.99</pICMSST><vICMSST>999999999999.99</vICMSST><vICMSDeson>999999999999.99</vICMSDeson><motDesICMS>9</motDesICMS></DFNotaInfoItemImpostoICMS70>";
        Assert.assertEquals(xmlEsperado, icms70.toString());
    }
}