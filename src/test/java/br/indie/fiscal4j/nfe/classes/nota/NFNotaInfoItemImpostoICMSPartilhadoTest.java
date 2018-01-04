package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.common.DFUnidadeFederativa;
import br.indie.fiscal4j.nfe.classes.NFNotaInfoImpostoTributacaoICMS;
import br.indie.fiscal4j.nfe.classes.NFNotaInfoItemModalidadeBCICMS;
import br.indie.fiscal4j.nfe.classes.NFNotaInfoItemModalidadeBCICMSST;
import br.indie.fiscal4j.nfe.classes.NFOrigem;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoICMSPartilhadoTest {

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualAliquotaImpostoComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSPartilhado().setPercentualAliquotaImposto(new BigDecimal("10000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualAliquotaImpostoICMSSTComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSPartilhado().setPercentualAliquotaImpostoICMSST(new BigDecimal("1000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualBCOperacaoPropriaComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSPartilhado().setPercentualBCOperacaoPropria(new BigDecimal("1000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualMargemValorAdicionadoICMSSTComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSPartilhado().setPercentualMargemValorAdicionadoICMSST(new BigDecimal("1000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualReducaoBCComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSPartilhado().setPercentualReducaoBC(new BigDecimal("10000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualReducaoBCICMSSTComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSPartilhado().setPercentualReducaoBCICMSST(new BigDecimal("1000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorBCICMSComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSPartilhado().setValorBCICMS(new BigDecimal("10000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorBCICMSSTComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSPartilhado().setValorBCICMSST(new BigDecimal("10000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorICMSComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSPartilhado().setValorICMS(new BigDecimal("10000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorICMSSTComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMSPartilhado().setValorICMSST(new BigDecimal("10000000000000"));
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirSituacaoTributariaNulo() {
        final DFNotaInfoItemImpostoICMSPartilhado icmsPartilhado = new DFNotaInfoItemImpostoICMSPartilhado();
        icmsPartilhado.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icmsPartilhado.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.PAUTA);
        icmsPartilhado.setOrigem(NFOrigem.NACIONAL);
        icmsPartilhado.setPercentualAliquotaImposto(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualBCOperacaoPropria(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualReducaoBC(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setUfICMSST(DFUnidadeFederativa.TO);
        icmsPartilhado.setValorBCICMS(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorICMS(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorICMSST(new BigDecimal("999999999999.99"));
        icmsPartilhado.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirModalidadeBCICMSSTNulo() {
        final DFNotaInfoItemImpostoICMSPartilhado icmsPartilhado = new DFNotaInfoItemImpostoICMSPartilhado();
        icmsPartilhado.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.OUTROS);
        icmsPartilhado.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.PAUTA);
        icmsPartilhado.setOrigem(NFOrigem.NACIONAL);
        icmsPartilhado.setPercentualAliquotaImposto(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualBCOperacaoPropria(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualReducaoBC(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setUfICMSST(DFUnidadeFederativa.TO);
        icmsPartilhado.setValorBCICMS(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorICMS(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorICMSST(new BigDecimal("999999999999.99"));
        icmsPartilhado.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirModalidadeDeterminacaoBCICMSNulo() {
        final DFNotaInfoItemImpostoICMSPartilhado icmsPartilhado = new DFNotaInfoItemImpostoICMSPartilhado();
        icmsPartilhado.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.OUTROS);
        icmsPartilhado.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icmsPartilhado.setOrigem(NFOrigem.NACIONAL);
        icmsPartilhado.setPercentualAliquotaImposto(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualBCOperacaoPropria(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualReducaoBC(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setUfICMSST(DFUnidadeFederativa.TO);
        icmsPartilhado.setValorBCICMS(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorICMS(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorICMSST(new BigDecimal("999999999999.99"));
        icmsPartilhado.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirOrigemNulo() {
        final DFNotaInfoItemImpostoICMSPartilhado icmsPartilhado = new DFNotaInfoItemImpostoICMSPartilhado();
        icmsPartilhado.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.OUTROS);
        icmsPartilhado.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icmsPartilhado.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.PAUTA);
        icmsPartilhado.setPercentualAliquotaImposto(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualBCOperacaoPropria(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualReducaoBC(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setUfICMSST(DFUnidadeFederativa.TO);
        icmsPartilhado.setValorBCICMS(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorICMS(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorICMSST(new BigDecimal("999999999999.99"));
        icmsPartilhado.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPercentualAliquotaImpostoNulo() {
        final DFNotaInfoItemImpostoICMSPartilhado icmsPartilhado = new DFNotaInfoItemImpostoICMSPartilhado();
        icmsPartilhado.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.OUTROS);
        icmsPartilhado.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icmsPartilhado.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.PAUTA);
        icmsPartilhado.setOrigem(NFOrigem.NACIONAL);
        icmsPartilhado.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualBCOperacaoPropria(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualReducaoBC(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setUfICMSST(DFUnidadeFederativa.TO);
        icmsPartilhado.setValorBCICMS(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorICMS(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorICMSST(new BigDecimal("999999999999.99"));
        icmsPartilhado.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPercentualAliquotaImpostoICMSSTNulo() {
        final DFNotaInfoItemImpostoICMSPartilhado icmsPartilhado = new DFNotaInfoItemImpostoICMSPartilhado();
        icmsPartilhado.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.OUTROS);
        icmsPartilhado.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icmsPartilhado.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.PAUTA);
        icmsPartilhado.setOrigem(NFOrigem.NACIONAL);
        icmsPartilhado.setPercentualAliquotaImposto(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualBCOperacaoPropria(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualReducaoBC(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setUfICMSST(DFUnidadeFederativa.TO);
        icmsPartilhado.setValorBCICMS(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorICMS(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorICMSST(new BigDecimal("999999999999.99"));
        icmsPartilhado.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPercentualBCOperacaoPropriaNulo() {
        final DFNotaInfoItemImpostoICMSPartilhado icmsPartilhado = new DFNotaInfoItemImpostoICMSPartilhado();
        icmsPartilhado.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.OUTROS);
        icmsPartilhado.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icmsPartilhado.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.PAUTA);
        icmsPartilhado.setOrigem(NFOrigem.NACIONAL);
        icmsPartilhado.setPercentualAliquotaImposto(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualReducaoBC(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setUfICMSST(DFUnidadeFederativa.TO);
        icmsPartilhado.setValorBCICMS(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorICMS(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorICMSST(new BigDecimal("999999999999.99"));
        icmsPartilhado.toString();
    }

    @Test
    public void devePermitirPercentualMargemValorAdicionadoICMSSTNulo() {
        final DFNotaInfoItemImpostoICMSPartilhado icmsPartilhado = new DFNotaInfoItemImpostoICMSPartilhado();
        icmsPartilhado.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.OUTROS);
        icmsPartilhado.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icmsPartilhado.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.PAUTA);
        icmsPartilhado.setOrigem(NFOrigem.NACIONAL);
        icmsPartilhado.setPercentualAliquotaImposto(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualBCOperacaoPropria(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualReducaoBC(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setUfICMSST(DFUnidadeFederativa.TO);
        icmsPartilhado.setValorBCICMS(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorICMS(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorICMSST(new BigDecimal("999999999999.99"));
        icmsPartilhado.toString();
    }

    @Test
    public void devePermitirPercentualReducaoBCNulo() {
        final DFNotaInfoItemImpostoICMSPartilhado icmsPartilhado = new DFNotaInfoItemImpostoICMSPartilhado();
        icmsPartilhado.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.OUTROS);
        icmsPartilhado.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icmsPartilhado.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.PAUTA);
        icmsPartilhado.setOrigem(NFOrigem.NACIONAL);
        icmsPartilhado.setPercentualAliquotaImposto(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualBCOperacaoPropria(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setUfICMSST(DFUnidadeFederativa.TO);
        icmsPartilhado.setValorBCICMS(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorICMS(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorICMSST(new BigDecimal("999999999999.99"));
        icmsPartilhado.toString();
    }

    @Test
    public void devePermitirPercentualReducaoBCICMSSTNulo() {
        final DFNotaInfoItemImpostoICMSPartilhado icmsPartilhado = new DFNotaInfoItemImpostoICMSPartilhado();
        icmsPartilhado.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.OUTROS);
        icmsPartilhado.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icmsPartilhado.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.PAUTA);
        icmsPartilhado.setOrigem(NFOrigem.NACIONAL);
        icmsPartilhado.setPercentualAliquotaImposto(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualBCOperacaoPropria(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualReducaoBC(new BigDecimal("99.99"));
        icmsPartilhado.setUfICMSST(DFUnidadeFederativa.TO);
        icmsPartilhado.setValorBCICMS(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorICMS(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorICMSST(new BigDecimal("999999999999.99"));
        icmsPartilhado.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirUfICMSSTNulo() {
        final DFNotaInfoItemImpostoICMSPartilhado icmsPartilhado = new DFNotaInfoItemImpostoICMSPartilhado();
        icmsPartilhado.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.OUTROS);
        icmsPartilhado.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icmsPartilhado.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.PAUTA);
        icmsPartilhado.setOrigem(NFOrigem.NACIONAL);
        icmsPartilhado.setPercentualAliquotaImposto(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualBCOperacaoPropria(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualReducaoBC(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setValorBCICMS(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorICMS(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorICMSST(new BigDecimal("999999999999.99"));
        icmsPartilhado.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorBCICMSNulo() {
        final DFNotaInfoItemImpostoICMSPartilhado icmsPartilhado = new DFNotaInfoItemImpostoICMSPartilhado();
        icmsPartilhado.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.OUTROS);
        icmsPartilhado.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icmsPartilhado.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.PAUTA);
        icmsPartilhado.setOrigem(NFOrigem.NACIONAL);
        icmsPartilhado.setPercentualAliquotaImposto(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualBCOperacaoPropria(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualReducaoBC(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setUfICMSST(DFUnidadeFederativa.TO);
        icmsPartilhado.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorICMS(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorICMSST(new BigDecimal("999999999999.99"));
        icmsPartilhado.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorBCICMSSTNulo() {
        final DFNotaInfoItemImpostoICMSPartilhado icmsPartilhado = new DFNotaInfoItemImpostoICMSPartilhado();
        icmsPartilhado.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.OUTROS);
        icmsPartilhado.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icmsPartilhado.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.PAUTA);
        icmsPartilhado.setOrigem(NFOrigem.NACIONAL);
        icmsPartilhado.setPercentualAliquotaImposto(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualBCOperacaoPropria(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualReducaoBC(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setUfICMSST(DFUnidadeFederativa.TO);
        icmsPartilhado.setValorBCICMS(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorICMS(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorICMSST(new BigDecimal("999999999999.99"));
        icmsPartilhado.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorICMSNulo() {
        final DFNotaInfoItemImpostoICMSPartilhado icmsPartilhado = new DFNotaInfoItemImpostoICMSPartilhado();
        icmsPartilhado.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.OUTROS);
        icmsPartilhado.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icmsPartilhado.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.PAUTA);
        icmsPartilhado.setOrigem(NFOrigem.NACIONAL);
        icmsPartilhado.setPercentualAliquotaImposto(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualBCOperacaoPropria(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualReducaoBC(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setUfICMSST(DFUnidadeFederativa.TO);
        icmsPartilhado.setValorBCICMS(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorICMSST(new BigDecimal("999999999999.99"));
        icmsPartilhado.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorICMSSTNulo() {
        final DFNotaInfoItemImpostoICMSPartilhado icmsPartilhado = new DFNotaInfoItemImpostoICMSPartilhado();
        icmsPartilhado.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.OUTROS);
        icmsPartilhado.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icmsPartilhado.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.PAUTA);
        icmsPartilhado.setOrigem(NFOrigem.NACIONAL);
        icmsPartilhado.setPercentualAliquotaImposto(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualBCOperacaoPropria(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualReducaoBC(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setUfICMSST(DFUnidadeFederativa.TO);
        icmsPartilhado.setValorBCICMS(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorICMS(new BigDecimal("999999999999.99"));
        icmsPartilhado.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final DFNotaInfoItemImpostoICMSPartilhado icmsPartilhado = new DFNotaInfoItemImpostoICMSPartilhado();
        icmsPartilhado.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.OUTROS);
        icmsPartilhado.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icmsPartilhado.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.PAUTA);
        icmsPartilhado.setOrigem(NFOrigem.NACIONAL);
        icmsPartilhado.setPercentualAliquotaImposto(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualBCOperacaoPropria(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualReducaoBC(new BigDecimal("99.99"));
        icmsPartilhado.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icmsPartilhado.setUfICMSST(DFUnidadeFederativa.TO);
        icmsPartilhado.setValorBCICMS(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorICMS(new BigDecimal("999999999999.99"));
        icmsPartilhado.setValorICMSST(new BigDecimal("999999999999.99"));

        final String xmlEsperado = "<DFNotaInfoItemImpostoICMSPartilhado><orig>0</orig><CST>90</CST><modBC>1</modBC><vBC>999999999999.99</vBC><pRedBC>99.99</pRedBC><pICMS>99.99</pICMS><vICMS>999999999999.99</vICMS><modBCST>3</modBCST><pMVAST>99.99</pMVAST><pRedBCST>99.99</pRedBCST><vBCST>999999999999.99</vBCST><pICMSST>99.99</pICMSST><vICMSST>999999999999.99</vICMSST><pBCOp>99.99</pBCOp><UFST>TO</UFST></DFNotaInfoItemImpostoICMSPartilhado>";
        Assert.assertEquals(xmlEsperado, icmsPartilhado.toString());
    }
}