package br.indie.fiscal4j.nfe400.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;
import java.time.LocalDate;

@Root(name = "dup")
public class NFNotaInfoParcela extends DFBase {
    private static final long serialVersionUID = 4401957395684813604L;

    @Element(name = "nDup", required = false)
    private String numeroParcela;

    @Element(name = "dVenc", required = false)
    private LocalDate dataVencimento;

    @Element(name = "vDup", required = true)
    private String valorParcela;

    public void setNumeroParcela(final String numeroParcela) {
        StringValidador.tamanho60(numeroParcela, "Numero da Parcela");
        this.numeroParcela = numeroParcela;
    }

    public void setDataVencimento(final LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public void setValorParcela(final BigDecimal valorParcela) {
        this.valorParcela = BigDecimalParser.tamanho15Com2CasasDecimais(valorParcela, "Valor Parcela");
    }

    public String getValorParcela() {
        return this.valorParcela;
    }

    public String getNumeroParcela() {
        return this.numeroParcela;
    }

    public LocalDate getDataVencimento() {
        return this.dataVencimento;
    }
}