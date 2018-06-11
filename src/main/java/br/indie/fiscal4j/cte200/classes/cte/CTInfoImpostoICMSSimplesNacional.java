package br.indie.fiscal4j.cte200.classes.cte;

import org.simpleframework.xml.Element;

import br.indie.fiscal4j.DFBase;

public class CTInfoImpostoICMSSimplesNacional extends DFBase {
    private static final long serialVersionUID = -8159126354158753736L;

    @Element(name = "indSN")
    private String indicadorSimplesNacional;

    public String getIndicadorSimplesNacional() {
        return this.indicadorSimplesNacional;
    }

    public void setIndicadorSimplesNacional(final String indicadorSimplesNacional) {
        this.indicadorSimplesNacional = indicadorSimplesNacional;
    }

}
