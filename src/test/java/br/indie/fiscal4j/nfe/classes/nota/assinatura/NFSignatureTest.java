package br.indie.fiscal4j.nfe.classes.nota.assinatura;

import org.junit.Assert;
import org.junit.Test;

public class NFSignatureTest {

    @Test
    public void deveObterKeyInfoComoFoiSetado() {
        final DFSignature assinatura = new DFSignature();
        final DFKeyInfo keyInfo = new DFKeyInfo();
        assinatura.setKeyInfo(keyInfo);
        Assert.assertEquals(keyInfo, assinatura.getKeyInfo());
    }

    @Test
    public void deveObterSignatureValueComoFoiSetado() {
        final DFSignature assinatura = new DFSignature();
        final String signatureValue = "signature";
        assinatura.setSignatureValue(signatureValue);
        Assert.assertEquals(signatureValue, assinatura.getSignatureValue());
    }

    @Test
    public void deveObterSignedInfoComoFoiSetado() {
        final DFSignature assinatura = new DFSignature();
        final DFSignedInfo signedInfo = new DFSignedInfo();
        assinatura.setSignedInfo(signedInfo);
        Assert.assertEquals(signedInfo, assinatura.getSignedInfo());
    }
}