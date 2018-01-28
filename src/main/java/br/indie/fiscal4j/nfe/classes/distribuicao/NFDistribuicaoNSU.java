package br.indie.fiscal4j.nfe.classes.distribuicao;

import br.indie.fiscal4j.DFBase;
import org.simpleframework.xml.Element;

public class NFDistribuicaoNSU extends DFBase {
    private static final long serialVersionUID = -7160177161852010611L;

    @Element(name = "ultNSU")
    private String ultimoNSU;

    public java.lang.String getUltimoNSU() {
        return this.ultimoNSU;
    }

    public NFDistribuicaoNSU setUltimoNSU(final String ultimoNSU) {
        this.ultimoNSU = ultimoNSU;
        return this;
    }

}
