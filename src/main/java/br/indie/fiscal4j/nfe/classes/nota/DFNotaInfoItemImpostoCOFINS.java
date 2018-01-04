package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.common.DFBase;
import org.simpleframework.xml.Element;

public class DFNotaInfoItemImpostoCOFINS extends DFBase {

    @Element(name = "COFINSAliq", required = false)
    private DFNotaInfoItemImpostoCOFINSAliquota aliquota;

    @Element(name = "COFINSQtde", required = false)
    private DFNotaInfoItemImpostoCOFINSQuantidade quantidade;

    @Element(name = "COFINSNT", required = false)
    private DFNotaInfoItemImpostoCOFINSNaoTributavel naoTributavel;

    @Element(name = "COFINSOutr", required = false)
    private DFNotaInfoItemImpostoCOFINSOutrasOperacoes outrasOperacoes;

    public void setAliquota(final DFNotaInfoItemImpostoCOFINSAliquota aliquota) {
        if (this.quantidade != null || this.naoTributavel != null || this.outrasOperacoes != null) {
            throw new IllegalStateException("Aliquota, quantidade, nao tributavel e outras operacoes sao mutuamente exclusivos");
        }
        this.aliquota = aliquota;
    }

    public void setQuantidade(final DFNotaInfoItemImpostoCOFINSQuantidade quantidade) {
        if (this.aliquota != null || this.naoTributavel != null || this.outrasOperacoes != null) {
            throw new IllegalStateException("Aliquota, quantidade, nao tributavel e outras operacoes sao mutuamente exclusivos");
        }
        this.quantidade = quantidade;
    }

    public void setNaoTributavel(final DFNotaInfoItemImpostoCOFINSNaoTributavel naoTributavel) {
        if (this.quantidade != null || this.aliquota != null || this.outrasOperacoes != null) {
            throw new IllegalStateException("Aliquota, quantidade, nao tributavel e outras operacoes sao mutuamente exclusivos");
        }
        this.naoTributavel = naoTributavel;
    }

    public void setOutrasOperacoes(final DFNotaInfoItemImpostoCOFINSOutrasOperacoes outrasOperacoes) {
        if (this.quantidade != null || this.naoTributavel != null || this.aliquota != null) {
            throw new IllegalStateException("Aliquota, quantidade, nao tributavel e outras operacoes sao mutuamente exclusivos");
        }
        this.outrasOperacoes = outrasOperacoes;
    }

    public DFNotaInfoItemImpostoCOFINSAliquota getAliquota() {
        return this.aliquota;
    }

    public DFNotaInfoItemImpostoCOFINSQuantidade getQuantidade() {
        return this.quantidade;
    }

    public DFNotaInfoItemImpostoCOFINSNaoTributavel getNaoTributavel() {
        return this.naoTributavel;
    }

    public DFNotaInfoItemImpostoCOFINSOutrasOperacoes getOutrasOperacoes() {
        return this.outrasOperacoes;
    }
}