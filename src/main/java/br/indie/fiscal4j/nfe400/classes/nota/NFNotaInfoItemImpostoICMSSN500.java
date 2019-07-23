package br.indie.fiscal4j.nfe400.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.nfe400.classes.NFNotaSituacaoOperacionalSimplesNacional;
import br.indie.fiscal4j.nfe400.classes.NFOrigem;
import br.indie.fiscal4j.validadores.BigDecimalValidador;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoICMSSN500 extends DFBase {
    private static final long serialVersionUID = 83636755742035633L;

    @Element(name = "orig")
    private NFOrigem origem;

    @Element(name = "CSOSN")
    private NFNotaSituacaoOperacionalSimplesNacional situacaoOperacaoSN;

    @Element(name = "vBCSTRet", required = false)
    private String valorBCICMSSTRetido;

    @Element(name = "pST", required = false)
    private String percentualICMSSTRetido;

    @Element(name = "vICMSSubstituto", required = false)
    private String valorICMSSubstituto;

    @Element(name = "vICMSSTRet", required = false)
    private String valorICMSSTRetido;

    @Element(name = "vBCFCPSTRet", required = false)
    private String valorBCFundoCombatePobrezaRetidoST;

    @Element(name = "pFCPSTRet", required = false)
    private String percentualFundoCombatePobrezaRetidoST;

    @Element(name = "vFCPSTRet", required = false)
    private String valorFundoCombatePobrezaRetidoST;

    @Element(name = "pRedBCEfet", required = false)
    private String percentualReducaoBCEfetiva;

    @Element(name = "vBCEfet", required = false)
    private String valorBCEfetiva;

    @Element(name = "pICMSEfet", required = false)
    private String percentualAliquotaICMSEfetiva;

    @Element(name = "vICMSEfet", required = false)
    private String valorICMSEfetivo;

    public void setOrigem(final NFOrigem origem) {
        this.origem = origem;
    }

    public void setSituacaoOperacaoSN(final NFNotaSituacaoOperacionalSimplesNacional situacaoOperacaoSN) {
        this.situacaoOperacaoSN = situacaoOperacaoSN;
    }

    public void setValorBCICMSSTRetido(final BigDecimal valorBCICMSSTRetido) {
        this.valorBCICMSSTRetido = BigDecimalValidador.tamanho15Com2CasasDecimais(valorBCICMSSTRetido, "Valor BC ICMS ST Retido ICMSSN500");
    }

    public void setPercentualICMSSTRetido(final BigDecimal percentualICMSSTRetido) {
        this.percentualICMSSTRetido = BigDecimalValidador.tamanho7ComAte4CasasDecimais(percentualICMSSTRetido, "Percentual ICMS ST Retido ICMSSN500");
    }

    public void setValorICMSSubstituto(final BigDecimal valorICMSSubstituto) {
        this.valorICMSSubstituto = BigDecimalValidador.tamanho15Com2CasasDecimais(valorICMSSubstituto, "Valor ICMS Substituto ICMS60 Item");
    }

    public void setValorICMSSTRetido(final BigDecimal valorICMSSTRetido) {
        this.valorICMSSTRetido = BigDecimalValidador.tamanho15Com2CasasDecimais(valorICMSSTRetido, "Valor ICMS ST Retido ICMSSN500");
    }

    public void setValorBCFundoCombatePobrezaRetidoST(final BigDecimal valorBCFundoCombatePobrezaRetidoST) {
        this.valorBCFundoCombatePobrezaRetidoST = BigDecimalValidador.tamanho15Com2CasasDecimais(valorBCFundoCombatePobrezaRetidoST, "Valor base calculo fundo combate pobreza retido ST");
    }

    public void setPercentualFundoCombatePobrezaRetidoST(final BigDecimal percentualFundoCombatePobrezaRetidoST) {
        if (percentualFundoCombatePobrezaRetidoST.signum() <= 0) {
            throw new IllegalStateException("Percentual fundo de combate a pobreza precisa ser maior que zero!");
        }
        this.percentualFundoCombatePobrezaRetidoST = BigDecimalValidador.tamanho7ComAte4CasasDecimais(percentualFundoCombatePobrezaRetidoST, "Percentual fundo combate pobreza retido ST");
    }

    public void setValorFundoCombatePobrezaRetidoST(final BigDecimal valorFundoCombatePobrezaRetidoST) {
        this.valorFundoCombatePobrezaRetidoST = BigDecimalValidador.tamanho15Com2CasasDecimais(valorFundoCombatePobrezaRetidoST, "Valor fundo combate pobreza retido ST");
    }

    public void setPercentualReducaoBCEfetiva(final BigDecimal percentualReducaoBCEfetiva) {
        this.percentualReducaoBCEfetiva = BigDecimalValidador.tamanho7ComAte4CasasDecimais(percentualReducaoBCEfetiva, "Percentual reducao BC efetiva");
    }

    public void setValorBCEfetiva(final BigDecimal valorBCEfetiva) {
        this.valorBCEfetiva = BigDecimalValidador.tamanho15Com2CasasDecimais(valorBCEfetiva, "Valor BC efetiva");
    }

    public void setPercentualAliquotaICMSEfetiva(final BigDecimal percentualAliquotaICMSEfetiva) {
        this.percentualAliquotaICMSEfetiva = BigDecimalValidador.tamanho7ComAte4CasasDecimais(percentualAliquotaICMSEfetiva, "Percentual aliquota ICMS efetiva");
    }

    public void setValorICMSEfetivo(final BigDecimal valorICMSEfetivo) {
        this.valorICMSEfetivo = BigDecimalValidador.tamanho15Com2CasasDecimais(valorICMSEfetivo, "Valor ICMS efetivo");
    }

    public NFOrigem getOrigem() {
        return this.origem;
    }

    public NFNotaSituacaoOperacionalSimplesNacional getSituacaoOperacaoSN() {
        return this.situacaoOperacaoSN;
    }

    public String getValorBCICMSSTRetido() {
        return this.valorBCICMSSTRetido;
    }

    public String getPercentualICMSSTRetido() {
        return this.percentualICMSSTRetido;
    }

    public String getValorICMSSubstituto() {
        return this.valorICMSSubstituto;
    }

    public String getValorICMSSTRetido() {
        return this.valorICMSSTRetido;
    }

    public String getValorBCFundoCombatePobrezaRetidoST() {
        return this.valorBCFundoCombatePobrezaRetidoST;
    }

    public String getPercentualFundoCombatePobrezaRetidoST() {
        return this.percentualFundoCombatePobrezaRetidoST;
    }

    public String getValorFundoCombatePobrezaRetidoST() {
        return this.valorFundoCombatePobrezaRetidoST;
    }

    public String getPercentualReducaoBCEfetiva() {
        return this.percentualReducaoBCEfetiva;
    }

    public String getValorBCEfetiva() {
        return this.valorBCEfetiva;
    }

    public String getPercentualAliquotaICMSEfetiva() {
        return this.percentualAliquotaICMSEfetiva;
    }

    public String getValorICMSEfetivo() {
        return this.valorICMSEfetivo;
    }
}