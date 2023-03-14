package br.indie.fiscal4j.mdfe3.classes.lote.envio;

import br.indie.fiscal4j.DFBase;

/**
 * Created by Eldevan Nery Junior on 14/11/17.
 * <p>
 * Retorno do envio de Lote MDF-e.
 */
public class MDFEnvioLoteRetornoDados extends DFBase {

    private final MDFEnvioLoteRetorno retorno;
    private final MDFEnvioLote loteAssinado;

    public MDFEnvioLoteRetornoDados(MDFEnvioLoteRetorno retorno, MDFEnvioLote loteAssinado) {
        this.retorno = retorno;
        this.loteAssinado = loteAssinado;
    }

    public MDFEnvioLoteRetorno getRetorno() {
        return retorno;
    }

    public MDFEnvioLote getLoteAssinado() {
        return loteAssinado;
    }
}
