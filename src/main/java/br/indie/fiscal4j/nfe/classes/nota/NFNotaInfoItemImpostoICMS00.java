package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.nfe.classes.NFNotaInfoImpostoTributacaoICMS;
import br.indie.fiscal4j.nfe.classes.NFNotaInfoItemModalidadeBCICMS;
import br.indie.fiscal4j.nfe.classes.NFOrigem;
import br.indie.fiscal4j.nfe.validadores.BigDecimalParser;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoICMS00 extends DFBase {

    @Element(name = "orig", required = true)
    private NFOrigem origem;

    @Element(name = "CST", required = true)
    private NFNotaInfoImpostoTributacaoICMS situacaoTributaria;

    @Element(name = "modBC", required = true)
    private NFNotaInfoItemModalidadeBCICMS modalidadeBCICMS;

    @Element(name = "vBC", required = true)
    private String valorBaseCalculo;

    @Element(name = "pICMS", required = true)
    private String percentualAliquota;

    @Element(name = "vICMS", required = true)
    private String valorTributo;

    @Element(name = "pFCP", required = false)
    private String percentualFcp;

    @Element(name = "vFCP", required = false)
    private String valorFcp;

    public void setOrigem(final NFOrigem origem) {
        this.origem = origem;
    }

    public void setSituacaoTributaria(final NFNotaInfoImpostoTributacaoICMS situacaoTributaria) {
        if (!situacaoTributaria.equals(NFNotaInfoImpostoTributacaoICMS.TRIBUTACAO_INTEGRALMENTE)) {
            throw new IllegalStateException("Situacao tributaria invalida");
        }
        this.situacaoTributaria = situacaoTributaria;
    }

    public void setModalidadeBCICMS(final NFNotaInfoItemModalidadeBCICMS modalidadeBCICMS) {
        this.modalidadeBCICMS = modalidadeBCICMS;
    }

    public void setValorBaseCalculo(final BigDecimal valorBaseCalculo) {
        this.valorBaseCalculo = BigDecimalParser.tamanho15Com2CasasDecimais(valorBaseCalculo, "Valor Base Calculo ICMS00 Item");
    }

    public void setPercentualAliquota(final BigDecimal aliquota) {
        this.percentualAliquota = BigDecimalParser.tamanho7ComAte4CasasDecimais(aliquota, "Aliquota ICMS00 Item");
    }

    public void setValorTributo(final BigDecimal valorTributo) {
        this.valorTributo = BigDecimalParser.tamanho15Com2CasasDecimais(valorTributo, "Valor Tributo ICMS00 Item");
    }

    public void setPercentualFcp(final BigDecimal percentualFcp) {
        this.percentualFcp = BigDecimalParser.tamanho7ComAte4CasasDecimais(percentualFcp,
                "Percentual do ICMS relativo ao Fundo de Combate à Pobreza (FCP)");
    }

    public void setValorFcp(BigDecimal valorFcp) {
        this.valorFcp = BigDecimalParser.tamanho15Com2CasasDecimais(valorFcp,
                "Valor do ICMS relativo ao Fundo de Combate à Pobreza (FCP)");

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

    public String getPercentualFcp() {
        return percentualFcp;
    }

    public String getValorFcp() {
        return valorFcp;
    }
}
