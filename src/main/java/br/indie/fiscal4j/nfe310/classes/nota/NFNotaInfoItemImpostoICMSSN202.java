package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.nfe310.classes.NFNotaInfoItemModalidadeBCICMSST;
import br.indie.fiscal4j.nfe310.classes.NFNotaSituacaoOperacionalSimplesNacional;
import br.indie.fiscal4j.nfe310.classes.NFOrigem;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoICMSSN202 extends DFBase {
    private static final long serialVersionUID = -7219850658794969064L;

    @Element(name = "orig", required = true)
    private NFOrigem origem;

    @Element(name = "CSOSN", required = true)
    private NFNotaSituacaoOperacionalSimplesNacional situacaoOperacaoSN;

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

    public NFOrigem getOrigem() {
        return this.origem;
    }

    public void setOrigem(final NFOrigem origem) {
        this.origem = origem;
    }

    public NFNotaSituacaoOperacionalSimplesNacional getSituacaoOperacaoSN() {
        return this.situacaoOperacaoSN;
    }

    public void setSituacaoOperacaoSN(final NFNotaSituacaoOperacionalSimplesNacional situacaoOperacaoSN) {
        this.situacaoOperacaoSN = situacaoOperacaoSN;
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
        this.percentualMargemValorAdicionadoICMSST = BigDecimalParser.tamanho7ComAte4CasasDecimais(percentualMargemValorAdicionadoICMSST, "Percentual Margem Valor Adicionado ICMS ST ICMSSN202");
    }

    public String getPercentualReducaoBCICMSST() {
        return this.percentualReducaoBCICMSST;
    }

    public void setPercentualReducaoBCICMSST(final BigDecimal percentualReducaoBCICMSST) {
        this.percentualReducaoBCICMSST = BigDecimalParser.tamanho7ComAte4CasasDecimais(percentualReducaoBCICMSST, "Percentual Reducao BC ICMSST ICMSSN202");
    }

    public String getValorBCICMSST() {
        return this.valorBCICMSST;
    }

    public void setValorBCICMSST(final BigDecimal valorBCICMSST) {
        this.valorBCICMSST = BigDecimalParser.tamanho15Com2CasasDecimais(valorBCICMSST, "Valor BC ICMS ST ICMSSN202");
    }

    public String getPercentualAliquotaImpostoICMSST() {
        return this.percentualAliquotaImpostoICMSST;
    }

    public void setPercentualAliquotaImpostoICMSST(final BigDecimal percentualAliquotaImpostoICMSST) {
        this.percentualAliquotaImpostoICMSST = BigDecimalParser.tamanho7ComAte4CasasDecimais(percentualAliquotaImpostoICMSST, "Percentual Aliquota Imposto ICMSST ICMSSN202");
    }

    public String getValorICMSST() {
        return this.valorICMSST;
    }

    public void setValorICMSST(final BigDecimal valorICMSST) {
        this.valorICMSST = BigDecimalParser.tamanho15Com2CasasDecimais(valorICMSST, "Valor ICMS ST ICMSSN202");
    }
}