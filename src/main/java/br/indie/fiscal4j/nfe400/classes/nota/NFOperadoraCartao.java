package br.indie.fiscal4j.nfe400.classes.nota;

public enum NFOperadoraCartao {

    VISA("01", "Visa"),
    MASTERCARD("02", "Mastercard"),
    AMERICAN_EXPRESS("03", "American Express"),
    SOROCRED("04", "Sorocred"),
    DINERS_CLUB("05", "Diners Club"),
    ELO("06", "Elo"),
    HIPERCARD("07", "Hibercard"),
    AURA("08", "Aura"),
    CABAL("09", "Cabal"),
    OUTROS("99", "Outros");

    private final String codigo;
    private final String descricao;

    NFOperadoraCartao(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static NFOperadoraCartao valueOfCodigo(final String codigo) {
        for (final NFOperadoraCartao operadora : NFOperadoraCartao.values()) {
            if (operadora.getCodigo().equals(codigo)) {
                return operadora;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.codigo + " - " + this.descricao;
    }
}