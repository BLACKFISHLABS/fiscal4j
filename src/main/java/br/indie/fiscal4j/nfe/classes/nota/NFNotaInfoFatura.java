package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.nfe.validadores.BigDecimalParser;
import br.indie.fiscal4j.nfe.validadores.StringValidador;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NFNotaInfoFatura extends DFBase {
    @Element(name = "nFat", required = false)
    private String numeroFatura;

    @Element(name = "vOrig", required = false)
    private String valorOriginalFatura;

    @Element(name = "vDesc", required = false)
    private String valorDesconto;

    @Element(name = "vLiq", required = false)
    private String valorLiquidoFatura;

    public void setNumeroFatura(final String numeroFatura) {
        StringValidador.tamanho60(numeroFatura, "Numero Fatura");
        this.numeroFatura = numeroFatura;
    }

    public void setValorOriginalFatura(final BigDecimal valorOriginalFatura) {
        this.valorOriginalFatura = BigDecimalParser.tamanho15Com2CasasDecimais(valorOriginalFatura, "Valor Original Fatura");
    }

    public void setValorDesconto(final BigDecimal valorDesconto) {
        this.valorDesconto = BigDecimalParser.tamanho15Com2CasasDecimais(valorDesconto, "Valor Desconto Fatura");
    }

    public void setValorLiquidoFatura(final BigDecimal valorLiquidoFatura) {
        this.valorLiquidoFatura = BigDecimalParser.tamanho15Com2CasasDecimais(valorLiquidoFatura, "Valor Liquido Fatura");
    }

    public String getValorOriginalFatura() {
        return this.valorOriginalFatura;
    }

    public String getValorDesconto() {
        return this.valorDesconto;
    }

    public String getValorLiquidoFatura() {
        return this.valorLiquidoFatura;
    }

    public String getNumeroFatura() {
        return this.numeroFatura;
    }
}