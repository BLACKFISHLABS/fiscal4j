package br.indie.fiscal4j.cte300;

import br.indie.fiscal4j.DFConfig;
import br.indie.fiscal4j.cte300.classes.CTTipoEmissao;

/**
 * Configuracao basica CT-e.
 *
 * @author Jeferson Cruz
 */
public abstract class CTeConfig extends DFConfig {

    public static final String VERSAO = "3.00";
    public static final String NAMESPACE = "http://www.portalfiscal.inf.br/cte";

    /**
     * Tipo da emissao das notas (se normal ou em contingencia).
     *
     * @return Tipo da emissao das notas.
     */
    public CTTipoEmissao getTipoEmissao() {
        return CTTipoEmissao.EMISSAO_NORMAL;
    }
}
