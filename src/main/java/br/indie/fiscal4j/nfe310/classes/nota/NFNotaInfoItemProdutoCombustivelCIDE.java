package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NFNotaInfoItemProdutoCombustivelCIDE extends DFBase {
    private static final long serialVersionUID = -2869376510830652913L;

    @Element(name = "qBCProd", required = true)
    private String quantidadeBCCIDE;

    @Element(name = "vAliqProd", required = true)
    private String valorAliquota;

    @Element(name = "vCIDE", required = true)
    private String valor;

    public NFNotaInfoItemProdutoCombustivelCIDE() {
        this.quantidadeBCCIDE = null;
        this.valorAliquota = null;
        this.valor = null;
    }

    public String getQuantidadeBCCIDE() {
        return this.quantidadeBCCIDE;
    }

    public void setQuantidadeBCCIDE(final BigDecimal quantidade) {
        this.quantidadeBCCIDE = BigDecimalParser.tamanho16Com4CasasDecimais(quantidade, "Quantidade Combustivel CIDE");
    }

    public String getValorAliquota() {
        return this.valorAliquota;
    }

    public void setValorAliquota(final BigDecimal valorAliquota) {
        this.valorAliquota = BigDecimalParser.tamanho15Com4CasasDecimais(valorAliquota, "Valor Aliquota Combustivel CIDE");
    }

    public String getValor() {
        return this.valor;
    }

    public void setValor(final BigDecimal valor) {
        this.valor = BigDecimalParser.tamanho15Com2CasasDecimais(valor, "Valor Combustivel CIDE");
    }
}