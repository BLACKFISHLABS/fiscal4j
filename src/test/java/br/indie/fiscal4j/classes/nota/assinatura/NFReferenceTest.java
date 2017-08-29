package br.indie.fiscal4j.classes.nota.assinatura;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class NFReferenceTest {

    @Test
    public void deveObterDigestValueComoFoiSetado() {
        final NFReference reference = new NFReference();
        final String digestValue = "digest value";
        reference.setDigestValue(digestValue);
        Assert.assertEquals(digestValue, reference.getDigestValue());
    }

    @Test
    public void deveObterTransformComoFoiSetado() {
        final NFReference reference = new NFReference();
        final List<NFTransform> transform = new ArrayList<>();
        reference.setTransform(transform);
        Assert.assertEquals(transform, reference.getTransform());
    }

    @Test
    public void deveObterUriComoFoiSetado() {
        final NFReference reference = new NFReference();
        final String uri = "uri";
        reference.setUri(uri);
        Assert.assertEquals(uri, reference.getUri());
    }

    @Test
    public void deveObterDigestMethodComoFoiSetado() {
        final NFReference reference = new NFReference();
        final NFDigestMethod digestMethod = new NFDigestMethod();
        digestMethod.setAlgorithm("digest method");
        reference.setDigestMethod(digestMethod);
        Assert.assertEquals(digestMethod, reference.getDigestMethod());
    }
}