package br.indie.fiscal4j.nfe.classes.lote.envio;

import br.indie.fiscal4j.common.DFBase;
import org.simpleframework.xml.Element;

public class NFLoteEnvioRetornoRecebimentoInfo extends DFBase {

    @Element(name = "nRec", required = true)
    private String recibo;

    @Element(name = "tMed", required = true)
    private String tempoMedio;

    public NFLoteEnvioRetornoRecebimentoInfo() {
        this.recibo = null;
        this.tempoMedio = null;
    }

    public String getRecibo() {
        return this.recibo;
    }

    public void setRecibo(final String recibo) {
        this.recibo = recibo;
    }

    public String getTempoMedio() {
        return this.tempoMedio;
    }

    public void setTempoMedio(final String tempoMedio) {
        this.tempoMedio = tempoMedio;
    }
}