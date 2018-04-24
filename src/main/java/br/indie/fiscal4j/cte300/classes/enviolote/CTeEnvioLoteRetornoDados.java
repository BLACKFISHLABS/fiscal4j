package br.indie.fiscal4j.cte300.classes.enviolote;

public class CTeEnvioLoteRetornoDados {

    private CTeEnvioLoteRetorno retorno;
    private CTeEnvioLote loteAssinado;

    public CTeEnvioLoteRetornoDados(CTeEnvioLoteRetorno retorno, CTeEnvioLote loteAssinado) {
        this.retorno = retorno;
        this.loteAssinado = loteAssinado;
    }

    public CTeEnvioLoteRetorno getRetorno() {
        return retorno;
    }

    public CTeEnvioLote getLoteAssinado() {
        return loteAssinado;
    }
}
