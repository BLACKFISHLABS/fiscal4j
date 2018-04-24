package br.indie.fiscal4j.nfe400.classes.nota.assinatura;

import org.simpleframework.xml.Attribute;

import java.io.Serializable;

public class NFDigestMethod implements Serializable {
    private static final long serialVersionUID = -2713703913431592721L;

    @Attribute(name = "Algorithm", required = false)
    private String algorithm;

    public String getAlgorithm() {
        return this.algorithm;
    }

    public void setAlgorithm(final String algorithm) {
        this.algorithm = algorithm;
    }

}
