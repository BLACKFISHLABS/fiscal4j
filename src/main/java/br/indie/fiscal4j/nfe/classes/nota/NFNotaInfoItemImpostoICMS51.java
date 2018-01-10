package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.nfe.classes.NFNotaInfoImpostoTributacaoICMS;
import br.indie.fiscal4j.nfe.classes.NFNotaInfoItemModalidadeBCICMS;
import br.indie.fiscal4j.nfe.classes.NFOrigem;
import br.indie.fiscal4j.nfe.validadores.BigDecimalParser;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoICMS51 extends DFBase {
    @Element(name = "orig", required = true)
    private NFOrigem origem;

    @Element(name = "CST", required = true)
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
        this.percentualReducaoBC = BigDecimalParser.tamanho7ComAte4CasasDecimais(percentualReducaoBC, "Percentual Reducao BC ICMS51 Item");
    }

    public void setValorBCICMS(final BigDecimal valorBCICMS) {
        this.valorBCICMS = BigDecimalParser.tamanho15Com2CasasDecimais(valorBCICMS, "Valor BC ICMS ICMS51 Item");
    }

    public void setPercentualICMS(final BigDecimal percentualICMS) {
        this.percentualICMS = BigDecimalParser.tamanho7ComAte4CasasDecimais(percentualICMS, "Percentual ICMS ICMS51 Item");
    }

    public void setValorICMS(final BigDecimal valorICMS) {
        this.valorICMS = BigDecimalParser.tamanho15Com2CasasDecimais(valorICMS, "Valor ICMS ICMS51 Item");
    }

    public void setPercentualDiferimento(final BigDecimal percentualDiferimento) {
        this.percentualDiferimento = BigDecimalParser.tamanho7ComAte4CasasDecimais(percentualDiferimento, "Percentual Diferimento ICMS51 Item");
    }

    public void setValorICMSDiferimento(final BigDecimal valorICMSDiferimento) {
        this.valorICMSDiferimento = BigDecimalParser.tamanho15Com2CasasDecimais(valorICMSDiferimento, "Valor ICMS Diferimento ICMS51 Item");
    }

    public void setValorICMSOperacao(final BigDecimal valorICMSOperacao) {
        this.valorICMSOperacao = BigDecimalParser.tamanho15Com2CasasDecimais(valorICMSOperacao, "Valor ICMS Operacao ICMS51 Item");
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
}