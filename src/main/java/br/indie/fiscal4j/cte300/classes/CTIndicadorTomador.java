package br.indie.fiscal4j.cte300.classes;

public enum CTIndicadorTomador {

    CONTRIBUINTE_ICMS("1", "Contribuinte ICMS"),
    CONTRIBUINTE_ISENTO("2", "Contribuinte isento de inscri\u00e7\u00e3o"),
    NAO_CONTRIBUINTE("9", "N\u00e3o contribuinte");

    private final String codigo;
    private final String descricao;

    CTIndicadorTomador(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public static CTIndicadorTomador valueOfCodigo(final String codigo) {
        for (final CTIndicadorTomador tipo : CTIndicadorTomador.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return codigo + " - " + descricao;
    }
}