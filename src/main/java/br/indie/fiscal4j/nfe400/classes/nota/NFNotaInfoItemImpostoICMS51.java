package br.indie.fiscal4j.nfe400.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.nfe400.classes.NFNotaInfoImpostoTributacaoICMS;
import br.indie.fiscal4j.nfe400.classes.NFNotaInfoItemModalidadeBCICMS;
import br.indie.fiscal4j.nfe400.classes.NFOrigem;
import br.indie.fiscal4j.validadores.DFBigDecimalValidador;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoICMS51 extends DFBase {
    private static final long serialVersionUID = -5575047808092974601L;

    @Element(name = "orig")
    private NFOrigem origem;

    @Element(name = "CST")
    private NFNotaInfoImpostoTributacaoICMS situacaoTributaria;

    @Element(name = "modBC", required = false)
    private NFNotaInfoItemModalidadeBCICMS modalidadeBCICMS;

    @Element(name = "pRedBC", required = false)
    private String percentualReducaoBC;

    @Element(name = "vBC", required = false)
    private String valorBCICMS;

    @Element(name = "pICMS", required = false)
    private String percentualICMS;

    @Element(name = "vICMSOp", required = false)
    private String valorICMSOperacao;

    @Element(name = "pDif", required = false)
    private String percentualDiferimento;

    @Element(name = "vICMSDif", required = false)
    private String valorICMSDiferimento;

    @Element(name = "vICMS", required = false)
    private String valorICMS;

    @Element(name = "vBCFCP", required = false)
    private String valorBCFundoCombatePobreza;

    @Element(name = "pFCP", required = false)
    private String percentualFundoCombatePobreza;

    @Element(name = "vFCP", required = false)
    private String valorFundoCombatePobreza;

    public void setOrigem(final NFOrigem origem) {
        this.origem = origem;
    }

    public void setSituacaoTributaria(final NFNotaInfoImpostoTributacaoICMS situacaoTributaria) {
        this.situacaoTributaria = situacaoTributaria;
    }

    public void setModalidadeBCICMS(final NFNotaInfoItemModalidadeBCICMS modalidadeBCICMS) {
        this.modalidadeBCICMS = modalidadeBCICMS;
    }

    public void setPercentualReducaoBC(final BigDecimal percentualReducaoBC) {
        this.percentualReducaoBC = DFBigDecimalValidador.tamanho7ComAte4CasasDecimais(percentualReducaoBC, "Percentual Reducao BC ICMS51 Item");
    }

    public void setValorBCICMS(final BigDecimal valorBCICMS) {
        this.valorBCICMS = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorBCICMS, "Valor BC ICMS ICMS51 Item");
    }

    public void setPercentualICMS(final BigDecimal percentualICMS) {
        this.percentualICMS = DFBigDecimalValidador.tamanho7ComAte4CasasDecimais(percentualICMS, "Percentual ICMS ICMS51 Item");
    }

    public void setValorICMS(final BigDecimal valorICMS) {
        this.valorICMS = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorICMS, "Valor ICMS ICMS51 Item");
    }

    public void setPercentualDiferimento(final BigDecimal percentualDiferimento) {
        this.percentualDiferimento = DFBigDecimalValidador.tamanho7ComAte4CasasDecimais(percentualDiferimento, "Percentual Diferimento ICMS51 Item");
    }

    public void setValorICMSDiferimento(final BigDecimal valorICMSDiferimento) {
        this.valorICMSDiferimento = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorICMSDiferimento, "Valor ICMS Diferimento ICMS51 Item");
    }

    public void setValorICMSOperacao(final BigDecimal valorICMSOperacao) {
        this.valorICMSOperacao = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorICMSOperacao, "Valor ICMS Operacao ICMS51 Item");
    }

    public void setValorBCFundoCombatePobreza(final BigDecimal valorBCFundoCombatePobreza) {
        this.valorBCFundoCombatePobreza = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorBCFundoCombatePobreza, "Valor base calculo fundo combate pobreza");
    }

    public void setPercentualFundoCombatePobreza(final BigDecimal percentualFundoCombatePobreza) {
        if (percentualFundoCombatePobreza.signum() < 0) {
            throw new IllegalStateException("Percentual fundo de combate a pobreza precisa ser maior que zero!");
        }
        this.percentualFundoCombatePobreza = DFBigDecimalValidador.tamanho7ComAte4CasasDecimais(percentualFundoCombatePobreza, "Percentual fundo combate pobreza");
    }

    public void setValorFundoCombatePobreza(final BigDecimal valorFundoCombatePobreza) {
        this.valorFundoCombatePobreza = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorFundoCombatePobreza, "Valor fundo combate pobreza");
    }

    public NFOrigem getOrigem() {
        return this.origem;
    }

    public NFNotaInfoImpostoTributacaoICMS getSituacaoTributaria() {
        return this.situacaoTributaria;
    }

    public NFNotaInfoItemModalidadeBCICMS getModalidadeBCICMS() {
        return this.modalidadeBCICMS;
    }

    public String getPercentualReducaoBC() {
        return this.percentualReducaoBC;
    }

    public String getValorBCICMS() {
        return this.valorBCICMS;
    }

    public String getPercentualICMS() {
        return this.percentualICMS;
    }

    public String getValorICMSOperacao() {
        return this.valorICMSOperacao;
    }

    public String getPercentualDiferimento() {
        return this.percentualDiferimento;
    }

    public String getValorICMSDiferimento() {
        return this.valorICMSDiferimento;
    }

    public String getValorICMS() {
        return this.valorICMS;
    }

    public String getValorBCFundoCombatePobreza() {
        return this.valorBCFundoCombatePobreza;
    }

    public String getPercentualFundoCombatePobreza() {
        return this.percentualFundoCombatePobreza;
    }

    public String getValorFundoCombatePobreza() {
        return this.valorFundoCombatePobreza;
    }
}