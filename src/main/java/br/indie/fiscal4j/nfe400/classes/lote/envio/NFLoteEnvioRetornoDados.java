package br.indie.fiscal4j.nfe400.classes.lote.envio;

import br.indie.fiscal4j.DFBase;

public class NFLoteEnvioRetornoDados extends DFBase {

    private static final long serialVersionUID = 2276661581444740391L;

    private final NFLoteEnvioRetorno retorno;
    private final NFLoteEnvio loteAssinado;

    public NFLoteEnvioRetornoDados(NFLoteEnvioRetorno retorno, NFLoteEnvio loteAssinado) {
        this.retorno = retorno;
        this.loteAssinado = loteAssinado;
    }

    public NFLoteEnvioRetorno getRetorno() {
        return retorno;
    }

    public NFLoteEnvio getLoteAssinado() {
        return loteAssinado;
    }

}
