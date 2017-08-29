package br.indie.fiscal4j.classes.nota.assinatura;

import org.junit.Assert;
import org.junit.Test;

public class NFTransformTest {

    @Test
    public void deveObterAlgorithmComoFoiSetado() {
        final NFTransform transform = new NFTransform();
        final String algorithm = "Algorithm";
        transform.setAlgorithm(algorithm);
        Assert.assertEquals(algorithm, transform.getAlgorithm());
    }
}