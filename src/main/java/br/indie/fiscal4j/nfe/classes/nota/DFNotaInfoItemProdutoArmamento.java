package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.nfe.classes.NFNotaInfoItemProdutoArmamentoTipo;
import br.indie.fiscal4j.nfe.validadores.StringValidador;
import org.simpleframework.xml.Element;

public class DFNotaInfoItemProdutoArmamento extends DFBase {

    @Element(name = "tpArma", required = true)
    private NFNotaInfoItemProdutoArmamentoTipo tipo;

    @Element(name = "nSerie", required = true)
    private String numeroSerieArma;

    @Element(name = "nCano", required = true)
    private String numeroSerieCano;

    @Element(name = "descr", required = true)
    private String descricao;

    public void setTipo(final NFNotaInfoItemProdutoArmamentoTipo tipo) {
        this.tipo = tipo;
    }

    public void setNumeroSerieArma(final String numeroSerieArma) {
        StringValidador.tamanho15(numeroSerieArma, "Numero Serie Arma Armamento");
        this.numeroSerieArma = numeroSerieArma;
    }

    public void setNumeroSerieCano(final String numeroSerieCano) {
        StringValidador.tamanho15(numeroSerieCano, "Numero Serie Cano Armamento");
        this.numeroSerieCano = numeroSerieCano;
    }

    public void setDescricao(final String descricao) {
        StringValidador.tamanho256(descricao, "Descricao Armamento");
        this.descricao = descricao;
    }

    public NFNotaInfoItemProdutoArmamentoTipo getTipo() {
        return this.tipo;
    }

    public String getNumeroSerieArma() {
        return this.numeroSerieArma;
    }

    public String getNumeroSerieCano() {
        return this.numeroSerieCano;
    }

    public String getDescricao() {
        return this.descricao;
    }
}