package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.nfe.validadores.BigDecimalParser;
import br.indie.fiscal4j.nfe.validadores.StringValidador;
import org.joda.time.LocalDate;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class DFNotaInfoItemProdutoMedicamento extends DFBase {

    @Element(name = "nLote", required = true)
    private String lote;

    @Element(name = "qLote", required = true)
    private String quantidade;

    @Element(name = "dFab", required = true)
    private LocalDate dataFabricacao;

    @Element(name = "dVal", required = true)
    private LocalDate dataValidade;

    @Element(name = "vPMC", required = true)
    private String precoMaximoConsumidor;

    public DFNotaInfoItemProdutoMedicamento() {
        this.lote = null;
        this.quantidade = null;
        this.dataFabricacao = null;
        this.dataValidade = null;
        this.precoMaximoConsumidor = null;
    }

    public void setLote(final String lote) {
        StringValidador.tamanho20(lote, "Lote Medicamento");
        this.lote = lote;
    }

    public void setQuantidade(final BigDecimal quantidade) {
        this.quantidade = BigDecimalParser.tamanho11Com3CasasDecimais(quantidade, "Quantidade Medicamento");
    }

    public void setDataFabricacao(final LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public void setDataValidade(final LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public void setPrecoMaximoConsumidor(final BigDecimal precoMaximoConsumidor) {
        this.precoMaximoConsumidor = BigDecimalParser.tamanho15Com2CasasDecimais(precoMaximoConsumidor, "Preco Maximo Consumidor Medicamento");
    }

    public String getLote() {
        return this.lote;
    }

    public String getQuantidade() {
        return this.quantidade;
    }

    public LocalDate getDataFabricacao() {
        return this.dataFabricacao;
    }

    public LocalDate getDataValidade() {
        return this.dataValidade;
    }

    public String getPrecoMaximoConsumidor() {
        return this.precoMaximoConsumidor;
    }
}