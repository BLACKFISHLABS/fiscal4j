package br.indie.fiscal4j.nfe.classes.lote.envio;

public class NFLoteEnvioRetornoDados {

    private DFLoteEnvioRetorno retorno;
    private DFLoteEnvio loteAssinado;

    public NFLoteEnvioRetornoDados(DFLoteEnvioRetorno retorno, DFLoteEnvio loteAssinado) {
        this.retorno = retorno;
        this.loteAssinado = loteAssinado;
    }

    public DFLoteEnvioRetorno getRetorno() {
        return retorno;
    }

    public DFLoteEnvio getLoteAssinado() {
        return loteAssinado;
    }

}
