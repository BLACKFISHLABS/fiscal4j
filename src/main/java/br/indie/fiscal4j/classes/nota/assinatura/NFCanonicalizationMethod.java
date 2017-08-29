package br.indie.fiscal4j.classes.nota.assinatura;

import org.simpleframework.xml.Attribute;

public class NFCanonicalizationMethod {

    @Attribute(name = "Algorithm", required = false)
    private String algorithm;

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

}
