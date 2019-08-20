package br.indie.fiscal4j.cte.classes.distribuicao;

import org.simpleframework.xml.Element;

import br.indie.fiscal4j.DFBase;

public class CTDistribuicaoConsultaNSU extends DFBase {
    private static final long serialVersionUID = -582191692175285331L;

    @Element(name = "NSU")
    private String nsu;

    public String getNsu() {
        return this.nsu;
    }

    public void setNsu(final String nsu) {
        this.nsu = nsu;
    }

}
