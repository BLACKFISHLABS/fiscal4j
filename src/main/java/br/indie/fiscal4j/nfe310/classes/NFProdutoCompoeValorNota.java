package br.indie.fiscal4j.nfe310.classes;

public enum NFProdutoCompoeValorNota {

    NAO("0", "N\u00e3o"),
    SIM("1", "Sim");

    private final String codigo;
    private final String descricao;

    NFProdutoCompoeValorNota(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static NFProdutoCompoeValorNota valueOfCodigo(final String codigo) {
        for (final NFProdutoCompoeValorNota produtoCompoeValorNota : NFProdutoCompoeValorNota.values()) {
            if (produtoCompoeValorNota.getCodigo().equals(codigo)) {
                return produtoCompoeValorNota;
            }
        }
        return null;
    }

    public String getCodigo() {
        return this.codigo;
    }

    @Override
    public String toString() {
        return codigo + " - " + descricao;
    }
}