package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.common.DFBase;
import org.simpleframework.xml.Element;

public class DFNotaInfoItemImpostoPIS extends DFBase {

    @Element(name = "PISAliq", required = false)
    private DFNotaInfoItemImpostoPISAliquota aliquota;

    @Element(name = "PISQtde", required = false)
    private DFNotaInfoItemImpostoPISQuantidade quantidade;

    @Element(name = "PISNT", required = false)
    private DFNotaInfoItemImpostoPISNaoTributado naoTributado;

    @Element(name = "PISOutr", required = false)
    private DFNotaInfoItemImpostoPISOutrasOperacoes outrasOperacoes;

    public DFNotaInfoItemImpostoPIS() {
        this.aliquota = null;
        this.quantidade = null;
        this.naoTributado = null;
        this.outrasOperacoes = null;
    }

    public void setAliquota(final DFNotaInfoItemImpostoPISAliquota aliquota) {
        if (this.quantidade != null || this.naoTributado != null || this.outrasOperacoes != null) {
            throw new IllegalStateException("Aliquota, quantidade, nao tributado e outras operacoes sao mutuamente exclusivos");
        }
        this.aliquota = aliquota;
    }

    public void setQuantidade(final DFNotaInfoItemImpostoPISQuantidade quantidade) {
        if (this.aliquota != null || this.naoTributado != null || this.outrasOperacoes != null) {
            throw new IllegalStateException("Aliquota, quantidade, nao tributado e outras operacoes sao mutuamente exclusivos");
        }
        this.quantidade = quantidade;
    }

    public void setNaoTributado(final DFNotaInfoItemImpostoPISNaoTributado naoTributado) {
        if (this.aliquota != null || this.quantidade != null || this.outrasOperacoes != null) {
            throw new IllegalStateException("Aliquota, quantidade, nao tributado e outras operacoes sao mutuamente exclusivos");
        }
        this.naoTributado = naoTributado;
    }

    public void setOutrasOperacoes(final DFNotaInfoItemImpostoPISOutrasOperacoes outrasOperacoes) {
        if (this.aliquota != null || this.quantidade != null || this.naoTributado != null) {
            throw new IllegalStateException("Aliquota, quantidade, nao tributado e outras operacoes sao mutuamente exclusivos");
        }
        this.outrasOperacoes = outrasOperacoes;
    }

    public DFNotaInfoItemImpostoPISAliquota getAliquota() {
        return this.aliquota;
    }

    public DFNotaInfoItemImpostoPISQuantidade getQuantidade() {
        return this.quantidade;
    }

    public DFNotaInfoItemImpostoPISNaoTributado getNaoTributado() {
        return this.naoTributado;
    }

    public DFNotaInfoItemImpostoPISOutrasOperacoes getOutrasOperacoes() {
        return this.outrasOperacoes;
    }
}