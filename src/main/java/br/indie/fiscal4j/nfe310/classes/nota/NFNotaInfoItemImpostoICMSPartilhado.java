package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.DFUnidadeFederativa;
import br.indie.fiscal4j.nfe310.classes.NFNotaInfoImpostoTributacaoICMS;
import br.indie.fiscal4j.nfe310.classes.NFNotaInfoItemModalidadeBCICMS;
import br.indie.fiscal4j.nfe310.classes.NFNotaInfoItemModalidadeBCICMSST;
import br.indie.fiscal4j.nfe310.classes.NFOrigem;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoICMSPartilhado extends DFBase {
    private static final long serialVersionUID = 3053815337863231705L;

    @Element(name = "orig", required = true)
    private NFOrigem origem;

    @Element(name = "CST", required = true)
    private NFNotaInfoImpostoTributacaoICMS situacaoTributaria;

    @Element(name = "modBC", required = true)
    private NFNotaInfoItemModalidadeBCICMS modalidadeBCICMS;

    @Element(name = "vBC", required = true)
    private String valorBCICMS;

    @Element(name = "pRedBC", required = false)
    private String percentualReducaoBC;

    @Element(name = "pICMS", required = true)
    private String percentualAliquotaImposto;

    @Element(name = "vICMS", required = true)
    private String valorICMS;

    @Element(name = "modBCST", required = true)
    private NFNotaInfoItemModalidadeBCICMSST modalidadeBCICMSST;

    @Element(name = "pMVAST", required = false)
    private String percentualMargemValorAdicionadoICMSST;

    @Element(name = "pRedBCST", required = false)
    private String percentualReducaoBCICMSST;

    @Element(name = "vBCST", required = true)
    private String valorBCICMSST;

    @Element(name = "pICMSST", required = true)
    private String percentualAliquotaImpostoICMSST;

    @Element(name = "vICMSST", required = true)
    private String valorICMSST;

    @Element(name = "pBCOp", required = true)
    private String percentualBCOperacaoPropria;

    @Element(name = "UFST", required = true)
    private String ufICMSST;

    public NFOrigem getOrigem() {
        return this.origem;
    }

    public void setOrigem(final NFOrigem origem) {
        this.origem = origem;
    }

    public NFNotaInfoImpostoTributacaoICMS getSituacaoTributaria() {
        return this.situacaoTributaria;
    }

    public void setSituacaoTributaria(final NFNotaInfoImpostoTributacaoICMS situacaoTributaria) {
        this.situacaoTributaria = situacaoTributaria;
    }

    public NFNotaInfoItemModalidadeBCICMS getModalidadeBCICMS() {
        return this.modalidadeBCICMS;
    }

    public void setModalidadeBCICMS(final NFNotaInfoItemModalidadeBCICMS modalidadeBCICMS) {
        this.modalidadeBCICMS = modalidadeBCICMS;
    }

    public String getValorBCICMS() {
        return this.valorBCICMS;
    }

    public void setValorBCICMS(final BigDecimal valorBCICMS) {
        this.valorBCICMS = BigDecimalParser.tamanho15Com2CasasDecimais(valorBCICMS, "Valor BC ICMS Partilhado");
    }

    public String getPercentualReducaoBC() {
        return this.percentualReducaoBC;
    }

    public void setPercentualReducaoBC(final BigDecimal percentualReducaoBC) {
        this.percentualReducaoBC = BigDecimalParser.tamanho5Com2CasasDecimais(percentualReducaoBC, "Percentual Reducao BC ICMS Partilhado");
    }

    public String getPercentualAliquotaImposto() {
        return this.percentualAliquotaImposto;
    }

    public void setPercentualAliquotaImposto(final BigDecimal percentualAliquotaImposto) {
        this.percentualAliquotaImposto = BigDecimalParser.tamanho7ComAte4CasasDecimais(percentualAliquotaImposto, "Percentual Aliquota Imposto ICMS Partilhado");
    }

    public String getValorICMS() {
        return this.valorICMS;
    }

    public void setValorICMS(final BigDecimal valorICMS) {
        this.valorICMS = BigDecimalParser.tamanho15Com2CasasDecimais(valorICMS, "Valor ICMS Partilhado");
    }

    public NFNotaInfoItemModalidadeBCICMSST getModalidadeBCICMSST() {
        return this.modalidadeBCICMSST;
    }

    public void setModalidadeBCICMSST(final NFNotaInfoItemModalidadeBCICMSST modalidadeBCICMSST) {
        this.modalidadeBCICMSST = modalidadeBCICMSST;
    }

    public String getPercentualMargemValorAdicionadoICMSST() {
        return this.percentualMargemValorAdicionadoICMSST;
    }

    public void setPercentualMargemValorAdicionadoICMSST(final BigDecimal percentualMargemValorAdicionadoICMSST) {
        this.percentualMargemValorAdicionadoICMSST = BigDecimalParser.tamanho7ComAte4CasasDecimais(percentualMargemValorAdicionadoICMSST, "Percentual Margem Valor Adicionado ICMS ST Partilhado");
    }

    public String getPercentualReducaoBCICMSST() {
        return this.percentualReducaoBCICMSST;
    }

    public void setPercentualReducaoBCICMSST(final BigDecimal percentualReducaoBCICMSST) {
        this.percentualReducaoBCICMSST = BigDecimalParser.tamanho7ComAte4CasasDecimais(percentualReducaoBCICMSST, "Percentual Reducao BC ICMS ST Partilhado");
    }

    public String getValorBCICMSST() {
        return this.valorBCICMSST;
    }

    public void setValorBCICMSST(final BigDecimal valorBCICMSST) {
        this.valorBCICMSST = BigDecimalParser.tamanho15Com2CasasDecimais(valorBCICMSST, "Valor BC ICMS ST Partilhado");
    }

    public String getPercentualAliquotaImpostoICMSST() {
        return this.percentualAliquotaImpostoICMSST;
    }

    public void setPercentualAliquotaImpostoICMSST(final BigDecimal percentualAliquotaImpostoICMSST) {
        this.percentualAliquotaImpostoICMSST = BigDecimalParser.tamanho7ComAte4CasasDecimais(percentualAliquotaImpostoICMSST, "Percentual Aliquota Imposto ICMS ST Partilhado");
    }

    public String getValorICMSST() {
        return this.valorICMSST;
    }

    public void setValorICMSST(final BigDecimal valorICMSST) {
        this.valorICMSST = BigDecimalParser.tamanho15Com2CasasDecimais(valorICMSST, "Valor ICMS ST Partilhado");
    }

    public String getPercentualBCOperacaoPropria() {
        return this.percentualBCOperacaoPropria;
    }

    public void setPercentualBCOperacaoPropria(final BigDecimal percentual) {
        this.percentualBCOperacaoPropria = BigDecimalParser.tamanho7ComAte4CasasDecimais(percentual, "Percentual Partilhado");
    }

    public String getUfICMSST() {
        return this.ufICMSST;
    }

    public void setUfICMSST(final DFUnidadeFederativa ufICMSST) {
        this.ufICMSST = ufICMSST.getCodigo();
    }
}