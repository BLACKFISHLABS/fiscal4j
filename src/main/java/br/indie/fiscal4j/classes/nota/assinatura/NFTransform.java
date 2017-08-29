package br.indie.fiscal4j.classes.nota.assinatura;

import br.indie.fiscal4j.classes.NFBase;
import org.simpleframework.xml.Attribute;

public class NFTransform extends NFBase {
    @Attribute(name = "Algorithm", required = false)
    private String algorithm;

    public void setAlgorithm(final String algorithm) {
        this.algorithm = algorithm;
    }

    public String getAlgorithm() {
        return this.algorithm;
    }
}