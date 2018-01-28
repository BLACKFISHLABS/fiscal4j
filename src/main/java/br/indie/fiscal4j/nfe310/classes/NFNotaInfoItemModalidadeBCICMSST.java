package br.indie.fiscal4j.nfe310.classes;

public enum NFNotaInfoItemModalidadeBCICMSST {

    PRECO_TABELADO("0", "Pre\u00e7o Tabelado"),
    LISTA_NEGATIVA("1", "Lista Negativa"),
    LISTA_POSITIVA("2", "Lista Positiva"),
    LISTA_NEUTRA("3", "Lista Neutra"),
    MARGEM_VALOR_AGREGADO("4", "Margem Valor Agregado"),
    PAUTA("5", "Pauta");

    private String codigo;
    private String descricao;

    NFNotaInfoItemModalidadeBCICMSST(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static NFNotaInfoItemModalidadeBCICMSST valueOfCodigo(final String codigo) {
        for (final NFNotaInfoItemModalidadeBCICMSST modalidadeBCIMSST : NFNotaInfoItemModalidadeBCICMSST.values()) {
            if (modalidadeBCIMSST.getCodigo().equals(codigo)) {
                return modalidadeBCIMSST;
            }
        }
        return null;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public String toString() {
        return codigo + " - " + descricao;
    }
}