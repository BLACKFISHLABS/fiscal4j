package br.indie.fiscal4j.nfe.classes.nota.assinatura;

import org.junit.Assert;
import org.junit.Test;

public class NFSignedInfoTest {

    @Test
    public void deveObterCanonicalizationMethodComoFoiSetado() {
        final DFSignedInfo info = new DFSignedInfo();
        final NFCanonicalizationMethod canonicalizationMethod = new NFCanonicalizationMethod();
        canonicalizationMethod.setAlgorithm("canonicalization method");
        info.setCanonicalizationMethod(canonicalizationMethod);
        Assert.assertEquals(canonicalizationMethod, info.getCanonicalizationMethod());
    }

    @Test
    public void deveObterReferenceComoFoiSetado() {
        final DFSignedInfo info = new DFSignedInfo();
        final DFReference reference = new DFReference();
        info.setReference(reference);
        Assert.assertEquals(reference, info.getReference());
    }

    @Test
    public void deveObterSignatureMethodComoFoiSetado() {
        final DFSignedInfo info = new DFSignedInfo();
        final NFSignatureMethod signatureMethod = new NFSignatureMethod();
        signatureMethod.setAlgorithm("signature method");
        info.setSignatureMethod(signatureMethod);
        Assert.assertEquals(signatureMethod, info.getSignatureMethod());
    }
}