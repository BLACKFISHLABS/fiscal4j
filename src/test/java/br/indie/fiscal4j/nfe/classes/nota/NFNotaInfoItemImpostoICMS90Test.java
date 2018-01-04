package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.nfe.classes.*;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoICMS90Test {

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualAliquota() {
        new DFNotaInfoItemImpostoICMS90().setPercentualAliquota(new BigDecimal("10000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualAliquotaImpostoICMSST() {
        new DFNotaInfoItemImpostoICMS90().setPercentualAliquotaImpostoICMSST(new BigDecimal("1000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualMargemValorAdicionadoICMSST() {
        new DFNotaInfoItemImpostoICMS90().setPercentualMargemValorAdicionadoICMSST(new BigDecimal("1000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualReducaoBC() {
        new DFNotaInfoItemImpostoICMS90().setPercentualReducaoBC(new BigDecimal("1000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualReducaoBCICMSST() {
        new DFNotaInfoItemImpostoICMS90().setPercentualReducaoBCICMSST(new BigDecimal("1000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorBCTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMS90().setValorBC(new BigDecimal("10000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorBCSTTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMS90().setValorBCST(new BigDecimal("10000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorICMSSTTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMS90().setValorICMSST(new BigDecimal("10000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorTributoTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMS90().setValorTributo(new BigDecimal("10000000000000"));
    }

    @Test
    public void devePermitirICMSDesoneracaoNulo() {
        final DFNotaInfoItemImpostoICMS90 icms90 = new DFNotaInfoItemImpostoICMS90();
        icms90.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.OUTROS);
        icms90.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms90.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms90.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms90.setPercentualAliquota(new BigDecimal("99.99"));
        icms90.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms90.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms90.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms90.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms90.setValorBC(new BigDecimal("999999999999.99"));
        icms90.setValorBCST(new BigDecimal("999999999999.99"));
        icms90.setValorICMSST(new BigDecimal("999999999999.99"));
        icms90.setValorTributo(new BigDecimal("999999999999.99"));
        icms90.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms90.toString();
    }

    @Test
    public void devePermitirDenoracaoNulo() {
        final DFNotaInfoItemImpostoICMS90 icms90 = new DFNotaInfoItemImpostoICMS90();
        icms90.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.OUTROS);
        icms90.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms90.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms90.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms90.setPercentualAliquota(new BigDecimal("99.99"));
        icms90.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms90.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms90.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms90.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms90.setValorBC(new BigDecimal("999999999999.99"));
        icms90.setValorBCST(new BigDecimal("999999999999.99"));
        icms90.setValorICMSST(new BigDecimal("999999999999.99"));
        icms90.setValorTributo(new BigDecimal("999999999999.99"));
        icms90.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms90.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirSituacaoTributariaNulo() {
        final DFNotaInfoItemImpostoICMS90 icms90 = new DFNotaInfoItemImpostoICMS90();
        icms90.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms90.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms90.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms90.setPercentualAliquota(new BigDecimal("99.99"));
        icms90.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms90.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms90.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms90.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms90.setValorBC(new BigDecimal("999999999999.99"));
        icms90.setValorBCST(new BigDecimal("999999999999.99"));
        icms90.setValorICMSST(new BigDecimal("999999999999.99"));
        icms90.setValorTributo(new BigDecimal("999999999999.99"));
        icms90.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms90.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms90.toString();
    }

    @Test
    public void devePermitirModalidadeBCNulo() {
        final DFNotaInfoItemImpostoICMS90 icms90 = new DFNotaInfoItemImpostoICMS90();
        icms90.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.OUTROS);
        icms90.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms90.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms90.setPercentualAliquota(new BigDecimal("99.99"));
        icms90.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms90.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms90.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms90.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms90.setValorBC(new BigDecimal("999999999999.99"));
        icms90.setValorBCST(new BigDecimal("999999999999.99"));
        icms90.setValorICMSST(new BigDecimal("999999999999.99"));
        icms90.setValorTributo(new BigDecimal("999999999999.99"));
        icms90.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms90.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms90.toString();
    }

    @Test
    public void devePermitirModalidadeDeterminacaoBCICMSSTNulo() {
        final DFNotaInfoItemImpostoICMS90 icms90 = new DFNotaInfoItemImpostoICMS90();
        icms90.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.OUTROS);
        icms90.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms90.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms90.setPercentualAliquota(new BigDecimal("99.99"));
        icms90.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms90.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms90.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms90.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms90.setValorBC(new BigDecimal("999999999999.99"));
        icms90.setValorBCST(new BigDecimal("999999999999.99"));
        icms90.setValorICMSST(new BigDecimal("999999999999.99"));
        icms90.setValorTributo(new BigDecimal("999999999999.99"));
        icms90.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms90.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms90.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirOrigemNulo() {
        final DFNotaInfoItemImpostoICMS90 icms90 = new DFNotaInfoItemImpostoICMS90();
        icms90.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.OUTROS);
        icms90.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms90.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms90.setPercentualAliquota(new BigDecimal("99.99"));
        icms90.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms90.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms90.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms90.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms90.setValorBC(new BigDecimal("999999999999.99"));
        icms90.setValorBCST(new BigDecimal("999999999999.99"));
        icms90.setValorICMSST(new BigDecimal("999999999999.99"));
        icms90.setValorTributo(new BigDecimal("999999999999.99"));
        icms90.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms90.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms90.toString();
    }

    @Test
    public void devePermitirPercentualAliquotaNulo() {
        final DFNotaInfoItemImpostoICMS90 icms90 = new DFNotaInfoItemImpostoICMS90();
        icms90.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.OUTROS);
        icms90.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms90.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms90.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms90.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms90.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms90.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms90.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms90.setValorBC(new BigDecimal("999999999999.99"));
        icms90.setValorBCST(new BigDecimal("999999999999.99"));
        icms90.setValorICMSST(new BigDecimal("999999999999.99"));
        icms90.setValorTributo(new BigDecimal("999999999999.99"));
        icms90.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms90.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms90.toString();
    }

    @Test
    public void devePermitirPercentualAliquotaImpostoICMSSTNulo() {
        final DFNotaInfoItemImpostoICMS90 icms90 = new DFNotaInfoItemImpostoICMS90();
        icms90.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.OUTROS);
        icms90.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms90.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms90.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms90.setPercentualAliquota(new BigDecimal("99.99"));
        icms90.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms90.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms90.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms90.setValorBC(new BigDecimal("999999999999.99"));
        icms90.setValorBCST(new BigDecimal("999999999999.99"));
        icms90.setValorICMSST(new BigDecimal("999999999999.99"));
        icms90.setValorTributo(new BigDecimal("999999999999.99"));
        icms90.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms90.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms90.toString();
    }

    @Test
    public void devePermitirPercentualMargemValorAdicionadoICMSSTNulo() {
        final DFNotaInfoItemImpostoICMS90 icms90 = new DFNotaInfoItemImpostoICMS90();
        icms90.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.OUTROS);
        icms90.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms90.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms90.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms90.setPercentualAliquota(new BigDecimal("99.99"));
        icms90.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms90.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms90.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms90.setValorBC(new BigDecimal("999999999999.99"));
        icms90.setValorBCST(new BigDecimal("999999999999.99"));
        icms90.setValorICMSST(new BigDecimal("999999999999.99"));
        icms90.setValorTributo(new BigDecimal("999999999999.99"));
        icms90.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms90.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms90.toString();
    }

    @Test
    public void devePermitirPercentualReducaoBCNulo() {
        final DFNotaInfoItemImpostoICMS90 icms90 = new DFNotaInfoItemImpostoICMS90();
        icms90.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.OUTROS);
        icms90.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms90.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms90.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms90.setPercentualAliquota(new BigDecimal("99.99"));
        icms90.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms90.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms90.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms90.setValorBC(new BigDecimal("999999999999.99"));
        icms90.setValorBCST(new BigDecimal("999999999999.99"));
        icms90.setValorICMSST(new BigDecimal("999999999999.99"));
        icms90.setValorTributo(new BigDecimal("999999999999.99"));
        icms90.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms90.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms90.toString();
    }

    @Test
    public void devePermitirPercentualReducaoBCICMSSTNulo() {
        final DFNotaInfoItemImpostoICMS90 icms90 = new DFNotaInfoItemImpostoICMS90();
        icms90.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.OUTROS);
        icms90.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms90.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms90.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms90.setPercentualAliquota(new BigDecimal("99.99"));
        icms90.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms90.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms90.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms90.setValorBC(new BigDecimal("999999999999.99"));
        icms90.setValorBCST(new BigDecimal("999999999999.99"));
        icms90.setValorICMSST(new BigDecimal("999999999999.99"));
        icms90.setValorTributo(new BigDecimal("999999999999.99"));
        icms90.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms90.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms90.toString();
    }

    @Test
    public void devePermitirValorBCNulo() {
        final DFNotaInfoItemImpostoICMS90 icms90 = new DFNotaInfoItemImpostoICMS90();
        icms90.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.OUTROS);
        icms90.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms90.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms90.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms90.setPercentualAliquota(new BigDecimal("99.99"));
        icms90.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms90.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms90.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms90.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms90.setValorBCST(new BigDecimal("999999999999.99"));
        icms90.setValorICMSST(new BigDecimal("999999999999.99"));
        icms90.setValorTributo(new BigDecimal("999999999999.99"));
        icms90.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms90.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms90.toString();
    }

    @Test
    public void devePermitirValorBCSTNulo() {
        final DFNotaInfoItemImpostoICMS90 icms90 = new DFNotaInfoItemImpostoICMS90();
        icms90.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.OUTROS);
        icms90.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms90.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms90.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms90.setPercentualAliquota(new BigDecimal("99.99"));
        icms90.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms90.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms90.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms90.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms90.setValorBC(new BigDecimal("999999999999.99"));
        icms90.setValorICMSST(new BigDecimal("999999999999.99"));
        icms90.setValorTributo(new BigDecimal("999999999999.99"));
        icms90.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms90.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms90.toString();
    }

    @Test
    public void devePermitirValorICMSSTNulo() {
        final DFNotaInfoItemImpostoICMS90 icms90 = new DFNotaInfoItemImpostoICMS90();
        icms90.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.OUTROS);
        icms90.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms90.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms90.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms90.setPercentualAliquota(new BigDecimal("99.99"));
        icms90.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms90.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms90.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms90.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms90.setValorBC(new BigDecimal("999999999999.99"));
        icms90.setValorBCST(new BigDecimal("999999999999.99"));
        icms90.setValorTributo(new BigDecimal("999999999999.99"));
        icms90.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms90.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms90.toString();
    }

    @Test
    public void devePermitirValorTributoNulo() {
        final DFNotaInfoItemImpostoICMS90 icms90 = new DFNotaInfoItemImpostoICMS90();
        icms90.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.OUTROS);
        icms90.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms90.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms90.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms90.setPercentualAliquota(new BigDecimal("99.99"));
        icms90.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms90.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms90.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms90.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms90.setValorBC(new BigDecimal("999999999999.99"));
        icms90.setValorBCST(new BigDecimal("999999999999.99"));
        icms90.setValorICMSST(new BigDecimal("999999999999.99"));
        icms90.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms90.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms90.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final DFNotaInfoItemImpostoICMS90 icms90 = new DFNotaInfoItemImpostoICMS90();
        icms90.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.OUTROS);
        icms90.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.VALOR_OPERACAO);
        icms90.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms90.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms90.setPercentualAliquota(new BigDecimal("99.99"));
        icms90.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms90.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms90.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms90.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms90.setValorBC(new BigDecimal("999999999999.99"));
        icms90.setValorBCST(new BigDecimal("999999999999.99"));
        icms90.setValorICMSST(new BigDecimal("999999999999.99"));
        icms90.setValorTributo(new BigDecimal("999999999999.99"));
        icms90.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms90.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));

        final String xmlEsperado = "<DFNotaInfoItemImpostoICMS90><orig>2</orig><CST>90</CST><modBC>3</modBC><vBC>999999999999.99</vBC><pRedBC>99.99</pRedBC><pICMS>99.99</pICMS><vICMS>999999999999.99</vICMS><modBCST>3</modBCST><pMVAST>99.99</pMVAST><pRedBCST>99.99</pRedBCST><vBCST>999999999999.99</vBCST><pICMSST>99.99</pICMSST><vICMSST>999999999999.99</vICMSST><vICMSDeson>999999999999.99</vICMSDeson><motDesICMS>9</motDesICMS></DFNotaInfoItemImpostoICMS90>";
        Assert.assertEquals(xmlEsperado, icms90.toString());
    }
}