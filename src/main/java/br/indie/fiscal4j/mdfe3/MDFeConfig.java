package br.indie.fiscal4j.mdfe3;

import br.indie.fiscal4j.DFConfig;
import br.indie.fiscal4j.DFModelo;
import br.indie.fiscal4j.mdfe3.classes.def.MDFTipoEmissao;

/**
 * <p>
 * Configuracão padrão do MDF-e.
 */
public abstract class MDFeConfig extends DFConfig {

    public static final String VERSAO = "3.00";
    public static final String NAMESPACE = "http://www.portalfiscal.inf.br/mdfe";


    public MDFTipoEmissao getTipoEmissao() {
        return MDFTipoEmissao.NORMAL;
    }

    @Override
    public DFModelo getModelo() {
        return DFModelo.MDFE;
    }

}
