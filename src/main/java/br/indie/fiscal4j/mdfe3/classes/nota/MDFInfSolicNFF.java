package br.indie.fiscal4j.mdfe3.classes.nota;

import org.simpleframework.xml.Element;

public class MDFInfSolicNFF {
    /**
     * Solicitação do Pedido da Emissão NFF. Dados no formato Json
     */
    @Element(name = "xSolic", required = true)
    protected String xSolic;

    public String getXSolic() {
        return xSolic;
    }

    public void setXSolic(String xSolic) {
        this.xSolic = xSolic;
    }
}
