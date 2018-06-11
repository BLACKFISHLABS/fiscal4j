package br.indie.fiscal4j.nfe400.classes.nota;

import java.math.BigDecimal;

import org.simpleframework.xml.Element;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import br.indie.fiscal4j.validadores.StringValidador;

public class NFNotaInfoItemProdutoMedicamento extends DFBase {
    private static final long serialVersionUID = 3127772234811692432L;

    @Element(name = "cProdANVISA", required = true)
    private String codigoProdutoAnvisa;

    @Element(name = "vPMC", required = true)
    private String precoMaximoConsumidor;

    public NFNotaInfoItemProdutoMedicamento() {
        this.codigoProdutoAnvisa = null;
        this.precoMaximoConsumidor = null;
    }

    public void setCodigoProdutoAnvisa(final String codigoProdutoAnvisa) {
        StringValidador.exatamente13(codigoProdutoAnvisa, "C\u00f3digo produto anvisa");
        this.codigoProdutoAnvisa = codigoProdutoAnvisa;
    }

    public void setPrecoMaximoConsumidor(final BigDecimal precoMaximoConsumidor) {
        this.precoMaximoConsumidor = BigDecimalParser.tamanho15Com2CasasDecimais(precoMaximoConsumidor, "Preco Maximo Consumidor Medicamento");
    }

    public String getCodigoProdutoAnvisa() {
        return this.codigoProdutoAnvisa;
    }

    public String getPrecoMaximoConsumidor() {
        return this.precoMaximoConsumidor;
    }
}