package br.indie.fiscal4j.nfe310.classes;

public enum NFNotaInfoImpostoTributacaoISSQN {

    NORMAL("N", "Normal"),
    RETIDA("R", "Retida"),
    SUBSTITUTA("S", "Substituta"),
    ISENTA("I", "Isenta");

    private final String codigo;
    private final String descricao;

    NFNotaInfoImpostoTributacaoISSQN(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static NFNotaInfoImpostoTributacaoISSQN valueOfCodigo(final String codigo) {
        for (final NFNotaInfoImpostoTributacaoISSQN impostoTributacaoISSQN : NFNotaInfoImpostoTributacaoISSQN.values()) {
            if (impostoTributacaoISSQN.getCodigo().equals(codigo)) {
                return impostoTributacaoISSQN;
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