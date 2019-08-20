package br.indie.fiscal4j.cte200.classes.cte;

import java.util.List;

import org.simpleframework.xml.ElementList;

import br.indie.fiscal4j.DFBase;

public class CTInfoDocumentoAnterior extends DFBase {
    private static final long serialVersionUID = 4360773314200618795L;

    @ElementList(name = "emiDocAnt", inline = true)
    private List<CTInfoDocumentoAnteriorEmissor> emissorDocumentoAnterior;

    public List<CTInfoDocumentoAnteriorEmissor> getEmissorDocumentoAnterior() {
        return this.emissorDocumentoAnterior;
    }

    public void setEmissorDocumentoAnterior(final List<CTInfoDocumentoAnteriorEmissor> emissorDocumentoAnterior) {
        this.emissorDocumentoAnterior = emissorDocumentoAnterior;
    }

}
