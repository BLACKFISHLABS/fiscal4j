package br.indie.fiscal4j.nfe.classes.nota.assinatura;

import org.junit.Assert;
import org.junit.Test;

public class NFKeyInfoTest {

    @Test
    public void deveObterComoFoiSetado() {
        final NFKeyInfo keyInfo = new NFKeyInfo();
        final NFX509Data data = new NFX509Data();
        keyInfo.setData(data);
        Assert.assertEquals(data, keyInfo.getData());
    }
}