package br.indie.fiscal4j.nfe.classes.nota.assinatura;

import org.simpleframework.xml.Attribute;

public class NFDigestMethod {

    @Attribute(name = "Algorithm", required = false)
    private String algorithm;

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

}
