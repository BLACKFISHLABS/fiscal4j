package br.indie.fiscal4j.nfe400.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.nfe400.classes.NFNotaInfoItemModalidadeBCICMSST;
import br.indie.fiscal4j.nfe400.classes.NFNotaSituacaoOperacionalSimplesNacional;
import br.indie.fiscal4j.nfe400.classes.NFOrigem;
import br.indie.fiscal4j.validadores.DFBigDecimalValidador;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoICMSSN201 extends DFBase {
    private static final long serialVersionUID = -1669576908629669970L;

    @Element(name = "orig")
    private NFOrigem origem;

    @Element(name = "CSOSN")
    private NFNotaSituacaoOperacionalSimplesNacional situacaoOperacaoSN;

    @Element(name = "modBCST")
    private NFNotaInfoItemModalidadeBCICMSST modalidadeBCICMSST;

    @Element(name = "pMVAST", required = false)
    private String percentualMargemValorAdicionadoICMSST;

    @Element(name = "pRedBCST", required = false)
    private String percentualReducaoBCICMSST;

    @Element(name = "vBCST")
    private String valorBCICMSST;

    @Element(name = "pICMSST")
    private String percentualAliquotaImpostoICMSST;

    @Element(name = "vICMSST")
    private String valorICMSST;

    @Element(name = "vBCFCPST", required = false)
    private String valorBCFundoCombatePobrezaST;

    @Element(name = "pFCPST", required = false)
    private String percentualFundoCombatePobrezaST;

    @Element(name = "vFCPST", required = false)
    private String valorFundoCombatePobrezaST;

    @Element(name = "pCredSN")
    private String percentualAliquotaAplicavelCalculoCreditoSN;

    @Element(name = "vCredICMSSN")
    private String valorCreditoICMSSN;

    public void setOrigem(final NFOrigem origem) {
        this.origem = origem;
    }

    public void setSituacaoOperacaoSN(final NFNotaSituacaoOperacionalSimplesNacional situacaoOperacaoSN) {
        this.situacaoOperacaoSN = situacaoOperacaoSN;
    }

    public void setModalidadeBCICMSST(final NFNotaInfoItemModalidadeBCICMSST modalidadeBCICMSST) {
        this.modalidadeBCICMSST = modalidadeBCICMSST;
    }

    public void setPercentualMargemValorAdicionadoICMSST(final BigDecimal percentualMargemValorAdicionadoICMSST) {
        this.percentualMargemValorAdicionadoICMSST = DFBigDecimalValidador.tamanho7ComAte4CasasDecimais(percentualMargemValorAdicionadoICMSST, "Percentual Margem Valor Adicionado ICMS ST ICMSSN201");
    }

    public void setPercentualReducaoBCICMSST(final BigDecimal percentualReducaoBCICMSST) {
        this.percentualReducaoBCICMSST = DFBigDecimalValidador.tamanho7ComAte4CasasDecimais(percentualReducaoBCICMSST, "Percentual Reducao BC ICMS ST ICMSSN201");
    }

    public void setValorBCICMSST(final BigDecimal valorBCICMSST) {
        this.valorBCICMSST = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorBCICMSST, "Valor BC ICMS ST ICMSSN201");
    }

    public void setPercentualAliquotaImpostoICMSST(final BigDecimal aliquotaImpostoICMSST) {
        this.percentualAliquotaImpostoICMSST = DFBigDecimalValidador.tamanho7ComAte4CasasDecimais(aliquotaImpostoICMSST, "Aliquota Imposto ICMS ST ICMSSN201");
    }

    public void setValorICMSST(final BigDecimal valorICMSST) {
        this.valorICMSST = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorICMSST, "Valor ICMSST ICMSSN201");
    }

    public void setPercentualAliquotaAplicavelCalculoCreditoSN(final BigDecimal aliquotaAplicavelCalculoCreditoSN) {
        this.percentualAliquotaAplicavelCalculoCreditoSN = DFBigDecimalValidador.tamanho7ComAte4CasasDecimais(aliquotaAplicavelCalculoCreditoSN, "Aliquota Aplicavel Calculo Credito SN ICMSSN201");
    }

    public void setValorCreditoICMSSN(final BigDecimal valorCreditoICMSSN) {
        this.valorCreditoICMSSN = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorCreditoICMSSN, "Valor Credito ICMSSN201");
    }

    public void setValorBCFundoCombatePobrezaST(final BigDecimal valorBCFundoCombatePobrezaST) {
        this.valorBCFundoCombatePobrezaST = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorBCFundoCombatePobrezaST, "Base calculo fundo combate pobreza ST");
    }

    public void setPercentualFundoCombatePobrezaST(final BigDecimal percentualFundoCombatePobrezaST) {
        if (percentualFundoCombatePobrezaST.signum() <= 0) {
            throw new IllegalStateException("Percentual fundo de combate a pobreza precisa ser maior que zero!");
        }
        this.percentualFundoCombatePobrezaST = DFBigDecimalValidador.tamanho7ComAte4CasasDecimais(percentualFundoCombatePobrezaST, "Percentual fundo combate pobreza ST");
    }

    public void setValorFundoCombatePobrezaST(final BigDecimal valorFundoCombatePobrezaST) {
        this.valorFundoCombatePobrezaST = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorFundoCombatePobrezaST, "Valor fundo combate pobreza ST");
    }

    public NFOrigem getOrigem() {
        return this.origem;
    }

    public NFNotaSituacaoOperacionalSimplesNacional getSituacaoOperacaoSN() {
        return this.situacaoOperacaoSN;
    }

    public NFNotaInfoItemModalidadeBCICMSST getModalidadeBCICMSST() {
        return this.modalidadeBCICMSST;
    }

    public String getPercentualMargemValorAdicionadoICMSST() {
        return this.percentualMargemValorAdicionadoICMSST;
    }

    public String getPercentualReducaoBCICMSST() {
        return this.percentualReducaoBCICMSST;
    }

    public String getValorBCICMSST() {
        return this.valorBCICMSST;
    }

    public String getPercentualAliquotaImpostoICMSST() {
        return this.percentualAliquotaImpostoICMSST;
    }

    public String getValorICMSST() {
        return this.valorICMSST;
    }

    public String getPercentualAliquotaAplicavelCalculoCreditoSN() {
        return this.percentualAliquotaAplicavelCalculoCreditoSN;
    }

    public String getValorCreditoICMSSN() {
        return this.valorCreditoICMSSN;
    }

    public String getValorBCFundoCombatePobrezaST() {
        return this.valorBCFundoCombatePobrezaST;
    }

    public String getPercentualFundoCombatePobrezaST() {
        return this.percentualFundoCombatePobrezaST;
    }

    public String getValorFundoCombatePobrezaST() {
        return this.valorFundoCombatePobrezaST;
    }
}