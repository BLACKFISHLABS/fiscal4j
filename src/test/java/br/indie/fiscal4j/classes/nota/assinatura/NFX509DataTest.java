package br.indie.fiscal4j.classes.nota.assinatura;

import org.junit.Assert;
import org.junit.Test;

public class NFX509DataTest {

    @Test
    public void deveObterx509certificateComoFoiSetado() {
        final NFX509Data data = new NFX509Data();
        final String x509certificate = "x509Certificate";
        data.setX509certificate(x509certificate);
        Assert.assertEquals(x509certificate, data.getX509certificate());
    }
}