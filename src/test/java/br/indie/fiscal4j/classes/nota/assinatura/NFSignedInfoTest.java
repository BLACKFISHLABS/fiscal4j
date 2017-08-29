package br.indie.fiscal4j.classes.nota.assinatura;

import org.junit.Assert;
import org.junit.Test;

public class NFSignedInfoTest {

    @Test
    public void deveObterCanonicalizationMethodComoFoiSetado() {
        final NFSignedInfo info = new NFSignedInfo();
        final NFCanonicalizationMethod canonicalizationMethod = new NFCanonicalizationMethod();
        canonicalizationMethod.setAlgorithm("canonicalization method");
        info.setCanonicalizationMethod(canonicalizationMethod);
        Assert.assertEquals(canonicalizationMethod, info.getCanonicalizationMethod());
    }

    @Test
    public void deveObterReferenceComoFoiSetado() {
        final NFSignedInfo info = new NFSignedInfo();
        final NFReference reference = new NFReference();
        info.setReference(reference);
        Assert.assertEquals(reference, info.getReference());
    }

    @Test
    public void deveObterSignatureMethodComoFoiSetado() {
        final NFSignedInfo info = new NFSignedInfo();
        final NFSignatureMethod signatureMethod = new NFSignatureMethod();
        signatureMethod.setAlgorithm("signature method");
        info.setSignatureMethod(signatureMethod);
        Assert.assertEquals(signatureMethod, info.getSignatureMethod());
    }
}