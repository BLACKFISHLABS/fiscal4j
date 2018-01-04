package br.indie.fiscal4j.nfe.classes.nota.assinatura;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class NFReferenceTest {

    @Test
    public void deveObterDigestValueComoFoiSetado() {
        final DFReference reference = new DFReference();
        final String digestValue = "digest value";
        reference.setDigestValue(digestValue);
        Assert.assertEquals(digestValue, reference.getDigestValue());
    }

    @Test
    public void deveObterTransformComoFoiSetado() {
        final DFReference reference = new DFReference();
        final List<DFTransform> transform = new ArrayList<>();
        reference.setTransform(transform);
        Assert.assertEquals(transform, reference.getTransform());
    }

    @Test
    public void deveObterUriComoFoiSetado() {
        final DFReference reference = new DFReference();
        final String uri = "uri";
        reference.setUri(uri);
        Assert.assertEquals(uri, reference.getUri());
    }

    @Test
    public void deveObterDigestMethodComoFoiSetado() {
        final DFReference reference = new DFReference();
        final NFDigestMethod digestMethod = new NFDigestMethod();
        digestMethod.setAlgorithm("digest method");
        reference.setDigestMethod(digestMethod);
        Assert.assertEquals(digestMethod, reference.getDigestMethod());
    }
}