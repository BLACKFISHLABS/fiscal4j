package br.indie.fiscal4j.mdfe3.classes.def;

public enum MDFTipoInfPag {
    A_VISTA("0", "Pagamento à Vista"),
    A_PRAZO("1", "Pagamento a Prazo");

    private final String codigo;
    private final String descricao;

    MDFTipoInfPag(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static MDFTipoInfPag valueOfCodigo(final String codigo) {
        for (MDFTipoInfPag tipoEmitente : MDFTipoInfPag.values()) {
            if (tipoEmitente.getCodigo().equalsIgnoreCase(codigo)) {
                return tipoEmitente;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return codigo + " - " + descricao;
    }
}
