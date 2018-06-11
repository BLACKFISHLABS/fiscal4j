package br.indie.fiscal4j.nfe400.classes.nota.assinatura;

import org.simpleframework.xml.Attribute;

import br.indie.fiscal4j.DFBase;

public class NFTransform extends DFBase {
    private static final long serialVersionUID = -6622849156031856228L;

    @Attribute(name = "Algorithm", required = false)
    private String algorithm;

    public void setAlgorithm(final String algorithm) {
        this.algorithm = algorithm;
    }

    public String getAlgorithm() {
        return this.algorithm;
    }
}