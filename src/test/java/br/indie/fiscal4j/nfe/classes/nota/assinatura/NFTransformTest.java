package br.indie.fiscal4j.nfe.classes.nota.assinatura;

import org.junit.Assert;
import org.junit.Test;

public class NFTransformTest {

    @Test
    public void deveObterAlgorithmComoFoiSetado() {
        final DFTransform transform = new DFTransform();
        final String algorithm = "Algorithm";
        transform.setAlgorithm(algorithm);
        Assert.assertEquals(algorithm, transform.getAlgorithm());
    }
}