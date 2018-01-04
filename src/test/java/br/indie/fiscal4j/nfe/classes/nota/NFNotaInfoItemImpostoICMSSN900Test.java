package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.nfe.classes.NFNotaInfoItemModalidadeBCICMS;
import br.indie.fiscal4j.nfe.classes.NFNotaInfoItemModalidadeBCICMSST;
import br.indie.fiscal4j.nfe.classes.NFNotaSituacaoOperacionalSimplesNacional;
import br.indie.fiscal4j.nfe.classes.NFOrigem;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoICMSSN900Test {

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirAliquotaAplicavelCalculoCreditoSNComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSSN900().setPercentualAliquotaAplicavelCalculoCreditoSN(new BigDecimal("1000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirAliquotaImpostoICMSSTComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSSN900().setPercentualAliquotaImpostoICMSST(new BigDecimal("1000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualAliquotaImpostoComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSSN900().setPercentualAliquotaImposto(new BigDecimal("10000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualMargemValorAdicionadoICMSSTComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSSN900().setPercentualMargemValorAdicionadoICMSST(new BigDecimal("1000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualReducaoBCComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSSN900().setPercentualReducaoBC(new BigDecimal("1000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualReducaoBCICMSSTComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSSN900().setPercentualReducaoBCICMSST(new BigDecimal("1000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorBCICMSComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSSN900().setValorBCICMS(new BigDecimal("10000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorBCICMSSTComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSSN900().setValorBCICMSST(new BigDecimal("10000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorCreditoICMSSNComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSSN900().setValorCreditoICMSSN(new BigDecimal("10000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorICMSComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSSN900().setValorICMS(new BigDecimal("10000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorICMSSTComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSSN900().setValorICMSST(new BigDecimal("10000000000000"));
    }

    @Test
    public void devePermitirAliquotaAplicavelCalculoCreditoSNNulo() {
        final DFNotaInfoItemImpostoICMSSN900 icms900 = new DFNotaInfoItemImpostoICMSSN900();
        icms900.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms900.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEGATIVA);
        icms900.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.MVA);
        icms900.setOrigem(NFOrigem.NACIONAL);
        icms900.setPercentualAliquotaImposto(new BigDecimal("99.99"));
        icms900.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms900.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms900.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms900.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.IMUNE);
        icms900.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms900.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms900.setValorCreditoICMSSN(new BigDecimal("999999999999.99"));
        icms900.setValorICMS(new BigDecimal("999999999999.99"));
        icms900.setValorICMSST(new BigDecimal("999999999999.99"));
        icms900.toString();
    }

    @Test
    public void devePermitirAliquotaImpostoICMSSTNulo() {
        final DFNotaInfoItemImpostoICMSSN900 icms900 = new DFNotaInfoItemImpostoICMSSN900();
        icms900.setPercentualAliquotaAplicavelCalculoCreditoSN(new BigDecimal("99.99"));
        icms900.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEGATIVA);
        icms900.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.MVA);
        icms900.setOrigem(NFOrigem.NACIONAL);
        icms900.setPercentualAliquotaImposto(new BigDecimal("99.99"));
        icms900.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms900.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms900.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms900.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.IMUNE);
        icms900.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms900.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms900.setValorCreditoICMSSN(new BigDecimal("999999999999.99"));
        icms900.setValorICMS(new BigDecimal("999999999999.99"));
        icms900.setValorICMSST(new BigDecimal("999999999999.99"));
        icms900.toString();
    }

    @Test
    public void deveModalidadeBCICMSSTNulo() {
        final DFNotaInfoItemImpostoICMSSN900 icms900 = new DFNotaInfoItemImpostoICMSSN900();
        icms900.setPercentualAliquotaAplicavelCalculoCreditoSN(new BigDecimal("99.99"));
        icms900.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms900.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.MVA);
        icms900.setOrigem(NFOrigem.NACIONAL);
        icms900.setPercentualAliquotaImposto(new BigDecimal("99.99"));
        icms900.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms900.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms900.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms900.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.IMUNE);
        icms900.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms900.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms900.setValorCreditoICMSSN(new BigDecimal("999999999999.99"));
        icms900.setValorICMS(new BigDecimal("999999999999.99"));
        icms900.setValorICMSST(new BigDecimal("999999999999.99"));
        icms900.toString();
    }

    @Test
    public void devePermitirModalidadeDeterminacaoBCICMSNulo() {
        final DFNotaInfoItemImpostoICMSSN900 icms900 = new DFNotaInfoItemImpostoICMSSN900();
        icms900.setPercentualAliquotaAplicavelCalculoCreditoSN(new BigDecimal("99.99"));
        icms900.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms900.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEGATIVA);
        icms900.setOrigem(NFOrigem.NACIONAL);
        icms900.setPercentualAliquotaImposto(new BigDecimal("99.99"));
        icms900.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms900.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms900.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms900.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.IMUNE);
        icms900.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms900.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms900.setValorCreditoICMSSN(new BigDecimal("999999999999.99"));
        icms900.setValorICMS(new BigDecimal("999999999999.99"));
        icms900.setValorICMSST(new BigDecimal("999999999999.99"));
        icms900.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirOrigemNulo() {
        final DFNotaInfoItemImpostoICMSSN900 icms900 = new DFNotaInfoItemImpostoICMSSN900();
        icms900.setPercentualAliquotaAplicavelCalculoCreditoSN(new BigDecimal("99.99"));
        icms900.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms900.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEGATIVA);
        icms900.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.MVA);
        icms900.setPercentualAliquotaImposto(new BigDecimal("99.99"));
        icms900.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms900.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms900.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms900.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.IMUNE);
        icms900.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms900.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms900.setValorCreditoICMSSN(new BigDecimal("999999999999.99"));
        icms900.setValorICMS(new BigDecimal("999999999999.99"));
        icms900.setValorICMSST(new BigDecimal("999999999999.99"));
        icms900.toString();
    }

    @Test
    public void devePermitirPercentualAliquotaImpostoNulo() {
        final DFNotaInfoItemImpostoICMSSN900 icms900 = new DFNotaInfoItemImpostoICMSSN900();
        icms900.setPercentualAliquotaAplicavelCalculoCreditoSN(new BigDecimal("99.99"));
        icms900.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms900.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEGATIVA);
        icms900.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.MVA);
        icms900.setOrigem(NFOrigem.NACIONAL);
        icms900.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms900.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms900.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms900.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.IMUNE);
        icms900.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms900.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms900.setValorCreditoICMSSN(new BigDecimal("999999999999.99"));
        icms900.setValorICMS(new BigDecimal("999999999999.99"));
        icms900.setValorICMSST(new BigDecimal("999999999999.99"));
        icms900.toString();
    }

    @Test
    public void devePermitirPercentualMargemValorAdicionadoICMSSTNulo() {
        final DFNotaInfoItemImpostoICMSSN900 icms900 = new DFNotaInfoItemImpostoICMSSN900();
        icms900.setPercentualAliquotaAplicavelCalculoCreditoSN(new BigDecimal("99.99"));
        icms900.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms900.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEGATIVA);
        icms900.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.MVA);
        icms900.setOrigem(NFOrigem.NACIONAL);
        icms900.setPercentualAliquotaImposto(new BigDecimal("99.99"));
        icms900.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms900.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms900.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.IMUNE);
        icms900.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms900.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms900.setValorCreditoICMSSN(new BigDecimal("999999999999.99"));
        icms900.setValorICMS(new BigDecimal("999999999999.99"));
        icms900.setValorICMSST(new BigDecimal("999999999999.99"));
        icms900.toString();
    }

    @Test
    public void devePermitirPercentualReducaoBCNulo() {
        final DFNotaInfoItemImpostoICMSSN900 icms900 = new DFNotaInfoItemImpostoICMSSN900();
        icms900.setPercentualAliquotaAplicavelCalculoCreditoSN(new BigDecimal("99.99"));
        icms900.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms900.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEGATIVA);
        icms900.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.MVA);
        icms900.setOrigem(NFOrigem.NACIONAL);
        icms900.setPercentualAliquotaImposto(new BigDecimal("99.99"));
        icms900.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms900.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms900.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.IMUNE);
        icms900.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms900.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms900.setValorCreditoICMSSN(new BigDecimal("999999999999.99"));
        icms900.setValorICMS(new BigDecimal("999999999999.99"));
        icms900.setValorICMSST(new BigDecimal("999999999999.99"));
        icms900.toString();
    }

    @Test
    public void devePermitirPercentualReducaoBCICMSSTNulo() {
        final DFNotaInfoItemImpostoICMSSN900 icms900 = new DFNotaInfoItemImpostoICMSSN900();
        icms900.setPercentualAliquotaAplicavelCalculoCreditoSN(new BigDecimal("99.99"));
        icms900.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms900.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEGATIVA);
        icms900.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.MVA);
        icms900.setOrigem(NFOrigem.NACIONAL);
        icms900.setPercentualAliquotaImposto(new BigDecimal("99.99"));
        icms900.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms900.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms900.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.IMUNE);
        icms900.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms900.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms900.setValorCreditoICMSSN(new BigDecimal("999999999999.99"));
        icms900.setValorICMS(new BigDecimal("999999999999.99"));
        icms900.setValorICMSST(new BigDecimal("999999999999.99"));
        icms900.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirSituacaoOperacaoSNNulo() {
        final DFNotaInfoItemImpostoICMSSN900 icms900 = new DFNotaInfoItemImpostoICMSSN900();
        icms900.setPercentualAliquotaAplicavelCalculoCreditoSN(new BigDecimal("99.99"));
        icms900.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms900.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEGATIVA);
        icms900.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.MVA);
        icms900.setOrigem(NFOrigem.NACIONAL);
        icms900.setPercentualAliquotaImposto(new BigDecimal("99.99"));
        icms900.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms900.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms900.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms900.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms900.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms900.setValorCreditoICMSSN(new BigDecimal("999999999999.99"));
        icms900.setValorICMS(new BigDecimal("999999999999.99"));
        icms900.setValorICMSST(new BigDecimal("999999999999.99"));
        icms900.toString();
    }

    @Test
    public void devePermitirValorBCICMSNulo() {
        final DFNotaInfoItemImpostoICMSSN900 icms900 = new DFNotaInfoItemImpostoICMSSN900();
        icms900.setPercentualAliquotaAplicavelCalculoCreditoSN(new BigDecimal("99.99"));
        icms900.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms900.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEGATIVA);
        icms900.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.MVA);
        icms900.setOrigem(NFOrigem.NACIONAL);
        icms900.setPercentualAliquotaImposto(new BigDecimal("99.99"));
        icms900.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms900.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms900.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms900.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.IMUNE);
        icms900.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms900.setValorCreditoICMSSN(new BigDecimal("999999999999.99"));
        icms900.setValorICMS(new BigDecimal("999999999999.99"));
        icms900.setValorICMSST(new BigDecimal("999999999999.99"));
        icms900.toString();
    }

    @Test
    public void devePermitirValorBCICMSTNulo() {
        final DFNotaInfoItemImpostoICMSSN900 icms900 = new DFNotaInfoItemImpostoICMSSN900();
        icms900.setPercentualAliquotaAplicavelCalculoCreditoSN(new BigDecimal("99.99"));
        icms900.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms900.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEGATIVA);
        icms900.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.MVA);
        icms900.setOrigem(NFOrigem.NACIONAL);
        icms900.setPercentualAliquotaImposto(new BigDecimal("99.99"));
        icms900.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms900.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms900.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms900.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.IMUNE);
        icms900.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms900.setValorCreditoICMSSN(new BigDecimal("999999999999.99"));
        icms900.setValorICMS(new BigDecimal("999999999999.99"));
        icms900.setValorICMSST(new BigDecimal("999999999999.99"));
        icms900.toString();
    }

    @Test
    public void devePermitirValorBCICMSSTNulo() {
        final DFNotaInfoItemImpostoICMSSN900 icms900 = new DFNotaInfoItemImpostoICMSSN900();
        icms900.setPercentualAliquotaAplicavelCalculoCreditoSN(new BigDecimal("99.99"));
        icms900.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms900.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEGATIVA);
        icms900.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.MVA);
        icms900.setOrigem(NFOrigem.NACIONAL);
        icms900.setPercentualAliquotaImposto(new BigDecimal("99.99"));
        icms900.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms900.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms900.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms900.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.IMUNE);
        icms900.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms900.setValorCreditoICMSSN(new BigDecimal("999999999999.99"));
        icms900.setValorICMS(new BigDecimal("999999999999.99"));
        icms900.setValorICMSST(new BigDecimal("999999999999.99"));
        icms900.toString();
    }

    @Test
    public void devePermitirValorCreditoICMSSNNulo() {
        final DFNotaInfoItemImpostoICMSSN900 icms900 = new DFNotaInfoItemImpostoICMSSN900();
        icms900.setPercentualAliquotaAplicavelCalculoCreditoSN(new BigDecimal("99.99"));
        icms900.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms900.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEGATIVA);
        icms900.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.MVA);
        icms900.setOrigem(NFOrigem.NACIONAL);
        icms900.setPercentualAliquotaImposto(new BigDecimal("99.99"));
        icms900.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms900.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms900.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms900.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.IMUNE);
        icms900.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms900.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms900.setValorICMS(new BigDecimal("999999999999.99"));
        icms900.setValorICMSST(new BigDecimal("999999999999.99"));
        icms900.toString();
    }

    @Test
    public void devePermitirValorICMSNulo() {
        final DFNotaInfoItemImpostoICMSSN900 icms900 = new DFNotaInfoItemImpostoICMSSN900();
        icms900.setPercentualAliquotaAplicavelCalculoCreditoSN(new BigDecimal("99.99"));
        icms900.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms900.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEGATIVA);
        icms900.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.MVA);
        icms900.setOrigem(NFOrigem.NACIONAL);
        icms900.setPercentualAliquotaImposto(new BigDecimal("99.99"));
        icms900.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms900.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms900.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms900.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.IMUNE);
        icms900.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms900.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms900.setValorCreditoICMSSN(new BigDecimal("999999999999.99"));
        icms900.setValorICMSST(new BigDecimal("999999999999.99"));
        icms900.toString();
    }

    @Test
    public void devePermitirValorICMSSTNulo() {
        final DFNotaInfoItemImpostoICMSSN900 icms900 = new DFNotaInfoItemImpostoICMSSN900();
        icms900.setPercentualAliquotaAplicavelCalculoCreditoSN(new BigDecimal("99.99"));
        icms900.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms900.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEGATIVA);
        icms900.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.MVA);
        icms900.setOrigem(NFOrigem.NACIONAL);
        icms900.setPercentualAliquotaImposto(new BigDecimal("99.99"));
        icms900.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms900.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms900.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms900.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.IMUNE);
        icms900.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms900.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms900.setValorCreditoICMSSN(new BigDecimal("999999999999.99"));
        icms900.setValorICMS(new BigDecimal("999999999999.99"));
        icms900.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final DFNotaInfoItemImpostoICMSSN900 icms900 = new DFNotaInfoItemImpostoICMSSN900();
        icms900.setPercentualAliquotaAplicavelCalculoCreditoSN(new BigDecimal("99.99"));
        icms900.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms900.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEGATIVA);
        icms900.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.MVA);
        icms900.setOrigem(NFOrigem.NACIONAL);
        icms900.setPercentualAliquotaImposto(new BigDecimal("99.99"));
        icms900.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms900.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms900.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms900.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.IMUNE);
        icms900.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms900.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms900.setValorCreditoICMSSN(new BigDecimal("999999999999.99"));
        icms900.setValorICMS(new BigDecimal("999999999999.99"));
        icms900.setValorICMSST(new BigDecimal("999999999999.99"));

        final String xmlEsperado = "<DFNotaInfoItemImpostoICMSSN900><orig>0</orig><CSOSN>300</CSOSN><modBC>0</modBC><vBC>999999999999.99</vBC><pRedBC>99.99</pRedBC><pICMS>99.99</pICMS><vICMS>999999999999.99</vICMS><modBCST>1</modBCST><pMVAST>99.99</pMVAST><pRedBCST>99.99</pRedBCST><vBCST>999999999999.99</vBCST><pICMSST>99.99</pICMSST><vICMSST>999999999999.99</vICMSST><pCredSN>99.99</pCredSN><vCredICMSSN>999999999999.99</vCredICMSSN></DFNotaInfoItemImpostoICMSSN900>";
        Assert.assertEquals(xmlEsperado, icms900.toString());
    }
}