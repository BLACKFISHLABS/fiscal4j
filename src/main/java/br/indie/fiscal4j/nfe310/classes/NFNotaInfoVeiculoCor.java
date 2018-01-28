package br.indie.fiscal4j.nfe310.classes;

public enum NFNotaInfoVeiculoCor {

    AMARELA("01", "Amarela"),
    AZUL("02", "Azul"),
    BEGE("03", "Bege"),
    BRANCA("04", "Branca"),
    CINZA("05", "Cinza"),
    DOURADA("06", "Dourada"),
    GRENA("07", "Gren\u00e1"),
    LARANJA("08", "Laranja"),
    MARROM("09", "Marrom"),
    PRATA("10", "Prata"),
    PRETA("11", "Preta"),
    ROSA("12", "Rosa"),
    ROXA("13", "Roxa"),
    VERDE("14", "Verde"),
    VERMELHA("15", "Vermelha"),
    FANTASIA("16", "Fantasia");

    private final String codigo;
    private final String descricao;

    NFNotaInfoVeiculoCor(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static NFNotaInfoVeiculoCor valueOfCodigo(final String codigo) {
        for (final NFNotaInfoVeiculoCor veiculoCor : NFNotaInfoVeiculoCor.values()) {
            if (veiculoCor.getCodigo().equals(codigo)) {
                return veiculoCor;
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