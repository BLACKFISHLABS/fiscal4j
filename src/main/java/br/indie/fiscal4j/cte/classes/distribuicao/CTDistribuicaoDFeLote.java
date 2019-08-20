package br.indie.fiscal4j.cte.classes.distribuicao;

import java.util.List;

import org.simpleframework.xml.ElementList;

import br.indie.fiscal4j.DFBase;

public class CTDistribuicaoDFeLote extends DFBase {
    private static final long serialVersionUID = 5213446895183202408L;

    @ElementList(name = "docZip", inline = true, required = false)
    private List<CTDistribuicaoDocumentoZip> docZip;

    public List<CTDistribuicaoDocumentoZip> getDocZip() {
        return this.docZip;
    }

    public CTDistribuicaoDFeLote setDocZip(final List<CTDistribuicaoDocumentoZip> docZip) {
        this.docZip = docZip;
        return this;
    }
}