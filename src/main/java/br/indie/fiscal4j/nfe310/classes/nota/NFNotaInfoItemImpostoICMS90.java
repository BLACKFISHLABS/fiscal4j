package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.nfe310.classes.*;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoICMS90 extends DFBase {
    private static final long serialVersionUID = 5614463736855881160L;

    @Element(name = "orig", required = true)
    private NFOrigem origem;

    @Element(name = "CST", required = true)
    private NFNotaInfoImpostoTributacaoICMS situacaoTributaria;

    @Element(name = "modBC", required = false)
    private NFNotaInfoItemModalidadeBCICMS modalidadeBCICMS;

    @Element(name = "vBC", required = false)
    private String valorBC;

    @Element(name = "pRedBC", required = false)
    private String percentualReducaoBC;

    @Element(name = "pICMS", required = false)
    private String percentualAliquota;

    @Element(name = "vICMS", required = false)
    private String valorTributo;

    @Element(name = "modBCST", required = false)
    private NFNotaInfoItemModalidadeBCICMSST modalidadeBCICMSST;

    @Element(name = "pMVAST", required = false)
    private String percentualMargemValorAdicionadoICMSST;

    @Element(name = "pRedBCST", required = false)
    private String percentualReducaoBCICMSST;

    @Element(name = "vBCST", required = false)
    private String valorBCST;

    @Element(name = "pICMSST", required = false)
    private String percentualAliquotaImpostoICMSST;

    @Element(name = "vICMSST", required = false)
    private String valorICMSST;

    @Element(name = "vICMSDeson", required = false)
    private String valorICMSDesoneracao;

    @Element(name = "motDesICMS", required = false)
    private NFNotaMotivoDesoneracaoICMS desoneracao;

    public void setOrigem(final NFOrigem origem) {
        this.origem = origem;
    }

    public void setSituacaoTributaria(final NFNotaInfoImpostoTributacaoICMS situacaoTributaria) {
        this.situacaoTributaria = situacaoTributaria;
    }

    public void setModalidadeBCICMS(final NFNotaInfoItemModalidadeBCICMS modalidadeBCICMS) {
        this.modalidadeBCICMS = modalidadeBCICMS;
    }

    public void setValorBC(final BigDecimal valorBC) {
        this.valorBC = BigDecimalParser.tamanho15Com2CasasDecimais(valorBC, "Valor BC ICMS90 Item");
    }

    public void setPercentualReducaoBC(final BigDecimal percentualReducaoBC) {
        this.percentualReducaoBC = BigDecimalParser.tamanho7ComAte4CasasDecimais(percentualReducaoBC, "Percentual Reducao BC ICMS90 Item");
    }

    public void setPercentualAliquota(final BigDecimal aliquota) {
        this.percentualAliquota = BigDecimalParser.tamanho7ComAte4CasasDecimais(aliquota, "Aliquota ICMS90 Item");
    }

    public void setValorTributo(final BigDecimal valorTributo) {
        this.valorTributo = BigDecimalParser.tamanho15Com2CasasDecimais(valorTributo, "Valor Tributo ICMS90 Item");
    }

    public void setModalidadeBCICMSST(final NFNotaInfoItemModalidadeBCICMSST modalidadeBCICMSST) {
        this.modalidadeBCICMSST = modalidadeBCICMSST;
    }

    public void setPercentualMargemValorAdicionadoICMSST(final BigDecimal percentualMargemValorAdicionadoICMSST) {
        this.percentualMargemValorAdicionadoICMSST = BigDecimalParser.tamanho7ComAte4CasasDecimais(percentualMargemValorAdicionadoICMSST, "Percentual Margem Valor Adicionado ICMS ST ICMS90 Item");
    }

    public void setPercentualReducaoBCICMSST(final BigDecimal percentualReducaoBCICMSST) {
        this.percentualReducaoBCICMSST = BigDecimalParser.tamanho7ComAte4CasasDecimais(percentualReducaoBCICMSST, "Percentual Reducao BC ICMS ST ICMS90 Item");
    }

    public void setValorBCST(final BigDecimal valorBCST) {
        this.valorBCST = BigDecimalParser.tamanho15Com2CasasDecimais(valorBCST, "Valor BC ST ICMS90 Item");
    }

    public void setPercentualAliquotaImpostoICMSST(final BigDecimal aliquotaImpostoICMSST) {
        this.percentualAliquotaImpostoICMSST = BigDecimalParser.tamanho7ComAte4CasasDecimais(aliquotaImpostoICMSST, "Aliquota Imposto ICMS ST ICMS90 Item");
    }

    public void setValorICMSST(final BigDecimal valorICMSST) {
        this.valorICMSST = BigDecimalParser.tamanho15Com2CasasDecimais(valorICMSST, "Valor ICMS ST ICMS90 Item");
    }

    public void setDesoneracao(final NFNotaMotivoDesoneracaoICMS desoneracao) {
        this.desoneracao = desoneracao;
    }

    public void setValorICMSDesoneracao(final BigDecimal valorICMSDesoneracao) {
        this.valorICMSDesoneracao = BigDecimalParser.tamanho15Com2CasasDecimais(valorICMSDesoneracao, "Valor ICMS Desoneracao ICMS90 Item");
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

    public String getValorBC() {
        return this.valorBC;
    }

    public String getPercentualReducaoBC() {
        return this.percentualReducaoBC;
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

    public String getPercentualMargemValorAdicionadoICMSST() {
        return this.percentualMargemValorAdicionadoICMSST;
    }

    public String getPercentualReducaoBCICMSST() {
        return this.percentualReducaoBCICMSST;
    }

    public String getValorBCST() {
        return this.valorBCST;
    }

    public String getPercentualAliquotaImpostoICMSST() {
        return this.percentualAliquotaImpostoICMSST;
    }

    public String getValorICMSST() {
        return this.valorICMSST;
    }

    public String getValorICMSDesoneracao() {
        return this.valorICMSDesoneracao;
    }

    public NFNotaMotivoDesoneracaoICMS getDesoneracao() {
        return this.desoneracao;
    }
}