package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.nfe.validadores.BigDecimalParser;
import br.indie.fiscal4j.nfe.validadores.StringValidador;
import org.joda.time.LocalDate;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class DFNotaInfoDuplicata extends DFBase {
    @Element(name = "nDup", required = false)
    private String numeroDuplicata;

    @Element(name = "dVenc", required = false)
    private LocalDate dataVencimento;

    @Element(name = "vDup", required = true)
    private String valorDuplicata;

    public void setNumeroDuplicata(final String numeroDuplicata) {
        StringValidador.tamanho60(numeroDuplicata, "Numero Duplicata");
        this.numeroDuplicata = numeroDuplicata;
    }

    public void setDataVencimento(final LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public void setValorDuplicata(final BigDecimal valorDuplicata) {
        this.valorDuplicata = BigDecimalParser.tamanho15Com2CasasDecimais(valorDuplicata, "Valor Duplicata");
    }

    public String getValorDuplicata() {
        return this.valorDuplicata;
    }

    public void setValorDuplicata(final String valorDuplicata) {
        this.valorDuplicata = valorDuplicata;
    }

    public String getNumeroDuplicata() {
        return this.numeroDuplicata;
    }

    public LocalDate getDataVencimento() {
        return this.dataVencimento;
    }
}