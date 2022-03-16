package br.indie.fiscal4j.nfe400.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.DFBigDecimalValidador;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoCOFINSST extends DFBase {
    private static final long serialVersionUID = -5116872172037197633L;

    @Element(name = "vBC", required = false)
    private String valorBaseCalculo;

    @Element(name = "pCOFINS", required = false)
    private String percentualAliquota;

    @Element(name = "qBCProd", required = false)
    private String quantidadeVendida;

    @Element(name = "vAliqProd", required = false)
    private String valorAliquotaCOFINS;

    @Element(name = "vCOFINS")
    private String valorCOFINS;

    @Element(name = "indSomaCOFINSST", required = false)
    private NFIndicadorSomaCofinsST indicadorSomaCOFINSST;

    public NFNotaInfoItemImpostoCOFINSST() {
        this.valorBaseCalculo = null;
        this.percentualAliquota = null;
        this.quantidadeVendida = null;
        this.valorAliquotaCOFINS = null;
        this.valorCOFINS = null;
    }

    public void setValorBaseCalculo(final BigDecimal valorBaseCalculo) {
        if (this.quantidadeVendida != null || this.valorAliquotaCOFINS != null) {
            throw new IllegalStateException("Ja foi setado quantidade vendida ou valor aliquota COFINS");
        }
        this.valorBaseCalculo = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorBaseCalculo, "Valor Base Calculo COFINS ST Item");
    }

    public void setPercentualAliquota(final BigDecimal aliquota) {
        if (this.quantidadeVendida != null || this.valorAliquotaCOFINS != null) {
            throw new IllegalStateException("Ja foi setado quantidade vendida ou valor aliquota COFINS");
        }
        this.percentualAliquota = DFBigDecimalValidador.tamanho7ComAte4CasasDecimais(aliquota, "Aliquota COFINS ST Item");
    }

    public void setQuantidadeVendida(final BigDecimal quantidadeVendida) {
        if (this.valorBaseCalculo != null || this.percentualAliquota != null) {
            throw new IllegalStateException("Ja foi setado valor da base de calculo ou percentual aliquota COFINS");
        }
        this.quantidadeVendida = DFBigDecimalValidador.tamanho16ComAte4CasasDecimais(quantidadeVendida, "Quantidade COFINS ST Item");
    }

    public void setValorAliquotaCOFINS(final BigDecimal valorAliquota) {
        if (this.valorBaseCalculo != null || this.percentualAliquota != null) {
            throw new IllegalStateException("Ja foi setado valor da base de calculo ou percentual aliquota COFINS");
        }
        this.valorAliquotaCOFINS = DFBigDecimalValidador.tamanho15Com4CasasDecimais(valorAliquota, "Valor Aliquota COFINS ST Item");
    }

    public void setValorCOFINS(final BigDecimal valorTributo) {
        this.valorCOFINS = DFBigDecimalValidador.tamanho15Com2CasasDecimais(valorTributo, "Valor Tributo COFINS ST Item");
    }

    public void setIndicadorSomaCOFINSST(NFIndicadorSomaCofinsST indicadorSomaCOFINSST) {
        this.indicadorSomaCOFINSST = indicadorSomaCOFINSST;
    }

    public String getValorBaseCalculo() {
        return this.valorBaseCalculo;
    }

    public String getPercentualAliquota() {
        return this.percentualAliquota;
    }

    public String getQuantidadeVendida() {
        return this.quantidadeVendida;
    }

    public String getValorAliquotaCOFINS() {
        return this.valorAliquotaCOFINS;
    }

    public String getValorCOFINS() {
        return this.valorCOFINS;
    }

    public NFIndicadorSomaCofinsST getIndicadorSomaCOFINSST() {
        return indicadorSomaCOFINSST;
    }
}