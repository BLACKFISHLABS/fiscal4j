package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.nfe.classes.NFNotaInfoImpostoTributacaoICMS;
import br.indie.fiscal4j.nfe.classes.NFNotaInfoItemModalidadeBCICMSST;
import br.indie.fiscal4j.nfe.classes.NFNotaMotivoDesoneracaoICMS;
import br.indie.fiscal4j.nfe.classes.NFOrigem;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoICMS30Test {

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualAliquotaImpostoICMSSTComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMS30().setPercentualAliquotaImpostoICMSST(new BigDecimal("1000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualMargemValorAdicionadoICMSSTComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMS30().setPercentualMargemValorAdicionadoICMSST(new BigDecimal("1000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPercentualReducaoBCICMSSTComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMS30().setPercentualReducaoBCICMSST(new BigDecimal("1000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorBCICMSSTComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMS30().setValorBCICMSST(new BigDecimal("10000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorImpostoICMSSTComTamanhoInvalido() {
        new DFNotaInfoItemImpostoICMS30().setValorImpostoICMSST(new BigDecimal("10000000000000"));
    }

    @Test
    public void devePermitirValorICMSDesoneracaoNulo() {
        final DFNotaInfoItemImpostoICMS30 icms30 = new DFNotaInfoItemImpostoICMS30();
        icms30.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms30.setOrigem(NFOrigem.NACIONAL);
        icms30.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms30.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms30.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms30.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms30.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms30.setValorImpostoICMSST(new BigDecimal("99999999999.99"));
        icms30.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms30.toString();
    }

    @Test
    public void devePermitirDesoneracaoNulo() {
        final DFNotaInfoItemImpostoICMS30 icms30 = new DFNotaInfoItemImpostoICMS30();
        icms30.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms30.setOrigem(NFOrigem.NACIONAL);
        icms30.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms30.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms30.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms30.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms30.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms30.setValorImpostoICMSST(new BigDecimal("99999999999.99"));
        icms30.setValorICMSDesoneracao(new BigDecimal("99999999999.99"));
        icms30.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirModalidadeDeterminacaoBCNulo() {
        final DFNotaInfoItemImpostoICMS30 icms30 = new DFNotaInfoItemImpostoICMS30();
        icms30.setOrigem(NFOrigem.NACIONAL);
        icms30.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms30.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms30.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms30.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms30.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms30.setValorImpostoICMSST(new BigDecimal("99999999999.99"));
        icms30.setValorICMSDesoneracao(new BigDecimal("99999999999.99"));
        icms30.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms30.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirOrigemNulo() {
        final DFNotaInfoItemImpostoICMS30 icms30 = new DFNotaInfoItemImpostoICMS30();
        icms30.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms30.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms30.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms30.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms30.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms30.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms30.setValorImpostoICMSST(new BigDecimal("99999999999.99"));
        icms30.setValorICMSDesoneracao(new BigDecimal("99999999999.99"));
        icms30.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms30.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPercentualAliquotaImpostoICMSSTNulo() {
        final DFNotaInfoItemImpostoICMS30 icms30 = new DFNotaInfoItemImpostoICMS30();
        icms30.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms30.setOrigem(NFOrigem.NACIONAL);
        icms30.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms30.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms30.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms30.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms30.setValorImpostoICMSST(new BigDecimal("99999999999.99"));
        icms30.setValorICMSDesoneracao(new BigDecimal("99999999999.99"));
        icms30.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms30.toString();
    }

    @Test
    public void devePermitirPercentualMargemValorAdicionadoICMSSTNulo() {
        final DFNotaInfoItemImpostoICMS30 icms30 = new DFNotaInfoItemImpostoICMS30();
        icms30.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms30.setOrigem(NFOrigem.NACIONAL);
        icms30.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms30.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms30.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms30.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms30.setValorImpostoICMSST(new BigDecimal("99999999999.99"));
        icms30.setValorICMSDesoneracao(new BigDecimal("99999999999.99"));
        icms30.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms30.toString();
    }

    @Test
    public void devePermitirPercentualReducaoBCICMSSTNulo() {
        final DFNotaInfoItemImpostoICMS30 icms30 = new DFNotaInfoItemImpostoICMS30();
        icms30.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms30.setOrigem(NFOrigem.NACIONAL);
        icms30.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms30.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms30.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms30.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms30.setValorImpostoICMSST(new BigDecimal("99999999999.99"));
        icms30.setValorICMSDesoneracao(new BigDecimal("99999999999.99"));
        icms30.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms30.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirSituacaoTributariaNulo() {
        final DFNotaInfoItemImpostoICMS30 icms30 = new DFNotaInfoItemImpostoICMS30();
        icms30.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms30.setOrigem(NFOrigem.NACIONAL);
        icms30.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms30.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms30.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms30.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms30.setValorImpostoICMSST(new BigDecimal("99999999999.99"));
        icms30.setValorICMSDesoneracao(new BigDecimal("99999999999.99"));
        icms30.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms30.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorBCICMSSTNulo() {
        final DFNotaInfoItemImpostoICMS30 icms30 = new DFNotaInfoItemImpostoICMS30();
        icms30.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms30.setOrigem(NFOrigem.NACIONAL);
        icms30.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms30.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms30.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms30.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms30.setValorImpostoICMSST(new BigDecimal("99999999999.99"));
        icms30.setValorICMSDesoneracao(new BigDecimal("99999999999.99"));
        icms30.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms30.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorImpostoICMSSTNulo() {
        final DFNotaInfoItemImpostoICMS30 icms30 = new DFNotaInfoItemImpostoICMS30();
        icms30.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms30.setOrigem(NFOrigem.NACIONAL);
        icms30.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms30.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms30.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms30.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms30.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms30.setValorICMSDesoneracao(new BigDecimal("99999999999.99"));
        icms30.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);
        icms30.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final DFNotaInfoItemImpostoICMS30 icms30 = new DFNotaInfoItemImpostoICMS30();
        icms30.setModalidadeBCICMSST(NFNotaInfoItemModalidadeBCICMSST.LISTA_NEUTRA);
        icms30.setOrigem(NFOrigem.NACIONAL);
        icms30.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms30.setPercentualMargemValorAdicionadoICMSST(new BigDecimal("99.99"));
        icms30.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms30.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms30.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms30.setValorImpostoICMSST(new BigDecimal("99999999999.99"));
        icms30.setValorICMSDesoneracao(new BigDecimal("99999999999.99"));
        icms30.setDesoneracao(NFNotaMotivoDesoneracaoICMS.OUTROS);

        final String xmlEsperado = "<DFNotaInfoItemImpostoICMS30><orig>0</orig><CST>40</CST><modBCST>3</modBCST><pMVAST>99.99</pMVAST><pRedBCST>99.99</pRedBCST><vBCST>999999999999.99</vBCST><pICMSST>99.99</pICMSST><vICMSST>99999999999.99</vICMSST><vICMSDeson>99999999999.99</vICMSDeson><motDesICMS>9</motDesICMS></DFNotaInfoItemImpostoICMS30>";
        Assert.assertEquals(xmlEsperado, icms30.toString());
    }
}