package br.indie.fiscal4j.nfe;

public enum NFTipoEmissao {

    EMISSAO_NORMAL("1", "Normal"),
    CONTINGENCIA_FS_IA("2", "Conting\u00eancia FS"),
    REGIME_ESPECIAL_NFF("3", "Regime Especial NFF (NT 2021.002)"),
    CONTINGENCIA_EPEC("4", "Conting\u00eancia EPEC"),
    CONTINGENCIA_FSDA("5", "Conting\u00eancia FSDA"),
    CONTINGENCIA_SVCAN("6", "Conting\u00eancia SVCAN"),
    CONTINGENCIA_SVCRS("7", "Conting\u00eancia SVCRS"),
    CONTIGENCIA_OFFLINE("9", "Contig\u00eancia offline NFC-e");

    private final String codigo;
    private final String descricao;

    NFTipoEmissao(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public static NFTipoEmissao valueOfCodigo(final String codigo) {
        for (final NFTipoEmissao tipo : NFTipoEmissao.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.codigo + " - " + this.descricao;
    }
}