package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.nfe310.classes.NFNotaInfoImpostoTributacaoICMS;
import br.indie.fiscal4j.nfe310.classes.NFNotaInfoItemModalidadeBCICMS;
import br.indie.fiscal4j.nfe310.classes.NFNotaInfoItemModalidadeBCICMSST;
import br.indie.fiscal4j.nfe310.classes.NFOrigem;
import br.indie.fiscal4j.validadores.BigDecimalValidador;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoICMS10 extends DFBase {
    private static final long serialVersionUID = 3531314516853056385L;

    @Element(name = "orig")
    private NFOrigem origem;

    @Element(name = "CST")
    private NFNotaInfoImpostoTributacaoICMS situacaoTributaria;

    @Element(name = "modBC")
    private NFNotaInfoItemModalidadeBCICMS modalidadeBCICMS;

    @Element(name = "vBC")
    private String valorBaseCalculo;

    @Element(name = "pICMS")
    private String percentualAliquota;

    @Element(name = "vICMS")
    private String valorTributo;

    @Element(name = "modBCST")
    private NFNotaInfoItemModalidadeBCICMSST modalidadeBCICMSST;

    @Element(name = "pMVAST", required = false)
    private String percentualMargemValorICMSST;

    @Element(name = "pRedBCST", required = false)
    private String percentualReducaoBCICMSST;

    @Element(name = "vBCST")
    private String valorBCICMSST;

    @Element(name = "pICMSST")
    private String percentualAliquotaImpostoICMSST;

    @Element(name = "vICMSST")
    private String valorICMSST;

    public void setOrigem(final NFOrigem origem) {
        this.origem = origem;
    }

    public void setSituacaoTributaria(final NFNotaInfoImpostoTributacaoICMS situacaoTributaria) {
        this.situacaoTributaria = situacaoTributaria;
    }

    public void setModalidadeBCICMS(final NFNotaInfoItemModalidadeBCICMS modalidadeBCICMS) {
        this.modalidadeBCICMS = modalidadeBCICMS;
    }

    public void setValorBaseCalculo(final BigDecimal valorBaseCalculo) {
        this.valorBaseCalculo = BigDecimalValidador.tamanho15Com2CasasDecimais(valorBaseCalculo, "Valor Base Calculo ICMS10 Item");
    }

    public void setPercentualAliquota(final BigDecimal aliquota) {
        this.percentualAliquota = BigDecimalValidador.tamanho7ComAte4CasasDecimais(aliquota, "Aliquota ICMS10 Item");
    }

    public void setValorTributo(final BigDecimal valorTributo) {
        this.valorTributo = BigDecimalValidador.tamanho15Com2CasasDecimais(valorTributo, "Valor Tributo ICMS10 Item");
    }

    public void setModalidadeBCICMSST(final NFNotaInfoItemModalidadeBCICMSST modalidadeBCICMSST) {
        this.modalidadeBCICMSST = modalidadeBCICMSST;
    }

    public void setPercentualMargemValorICMSST(final BigDecimal percentualMargemValorICMSST) {
        this.percentualMargemValorICMSST = BigDecimalValidador.tamanho7ComAte4CasasDecimais(percentualMargemValorICMSST, "Percentual MVA ICMS ST ICMS10 Item");
    }

    public void setPercentualReducaoBCICMSST(final BigDecimal percentualReducaoBCICMSST) {
        this.percentualReducaoBCICMSST = BigDecimalValidador.tamanho7ComAte4CasasDecimais(percentualReducaoBCICMSST, "Percentual Reducao BC ICMS ST ICMS10 Item");
    }

    public void setValorBCICMSST(final BigDecimal valorBCICMSST) {
        this.valorBCICMSST = BigDecimalValidador.tamanho15Com2CasasDecimais(valorBCICMSST, "Valor BC ICMS ST ICMS10 Item");
    }

    public void setPercentualAliquotaImpostoICMSST(final BigDecimal aliquotaImpostoICMSST) {
        this.percentualAliquotaImpostoICMSST = BigDecimalValidador.tamanho7ComAte4CasasDecimais(aliquotaImpostoICMSST, "Aliquota Imposto ICMS ST ICMS10 Item");
    }

    public void setValorICMSST(final BigDecimal valorICMSST) {
        this.valorICMSST = BigDecimalValidador.tamanho15Com2CasasDecimais(valorICMSST, "Valor ICMS ST ICMS10 Item");
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

    public String getValorBaseCalculo() {
        return this.valorBaseCalculo;
    }

    public String getPercentualAliquota() {
        return this.percentualAliquota;
    }

    public String getValorTributo() {
        return this.valorTributo;
    }

    public NFNotaInfoItemModalidadeBCICMSST getModalidadeBCICMSST() {
        return this.modalidadeBCICMSST;
    }

    public String getPercentualMargemValorICMSST() {
        return this.percentualMargemValorICMSST;
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
}
