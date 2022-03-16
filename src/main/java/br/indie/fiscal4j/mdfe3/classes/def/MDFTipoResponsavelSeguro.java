package br.indie.fiscal4j.mdfe3.classes.def;

/**
 * Created by Eldevan Nery Junior on 07/12/17.
 * <p>
 * Responsável pelo seguro
 */
public enum MDFTipoResponsavelSeguro {

    /**
     * Preencher com:
     * 1- Emitente do MDF-e;
     * <p>
     * 2 - Responsável pela contratação do serviço de transporte (contratante)
     * Dados obrigatórios apenas no modal Rodoviário, depois da lei 11.442/07.
     * Para os demais modais esta informação é opcional.
     */
    EMITENTE_MDFE("1", "Emitente do MDF-e"),
    CONTRATANTE_MDFE("2", "Respons\u00e1vel pela contrata\u00e7\u00e3o");

    private final String codigo;
    private final String descricao;

    MDFTipoResponsavelSeguro(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static MDFTipoResponsavelSeguro valueOfCodigo(final String codigo) {
        for (MDFTipoResponsavelSeguro tipoUnidadeCarga : MDFTipoResponsavelSeguro.values()) {
            if (tipoUnidadeCarga.getCodigo().equalsIgnoreCase(codigo)) {
                return tipoUnidadeCarga;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return codigo + " - " + descricao;
    }
}
