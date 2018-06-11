package br.indie.fiscal4j.nfe400.classes.nota;

import java.math.BigDecimal;

import org.simpleframework.xml.Element;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.BigDecimalParser;

public class NFInformacaoImpostoDevolvido extends DFBase {
    private static final long serialVersionUID = 4422209113713178240L;

    @Element(name = "vIPIDevol", required = true)
    private String valorIPIDevolvido;

    public String getValorIPIDevolvido() {
        return this.valorIPIDevolvido;
    }

    public void setValorIPIDevolvido(final BigDecimal valorIPIDevolvido) {
        this.valorIPIDevolvido = BigDecimalParser.tamanho15Com2CasasDecimais(valorIPIDevolvido, "Valor IPI Devolvido");
    }

}