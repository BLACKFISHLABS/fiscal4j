package br.indie.fiscal4j.nfe.classes.nota.assinatura;

import br.indie.fiscal4j.common.DFBase;
import org.simpleframework.xml.Attribute;

public class DFTransform extends DFBase {
    @Attribute(name = "Algorithm", required = false)
    private String algorithm;

    public void setAlgorithm(final String algorithm) {
        this.algorithm = algorithm;
    }

    public String getAlgorithm() {
        return this.algorithm;
    }
}