package br.indie.fiscal4j.nfe.transformers;

import br.indie.fiscal4j.common.DFAmbiente;
import org.junit.Assert;
import org.junit.Test;

public class DFAmbienteTransformerTest {

    @Test
    public void deveTestarLeitura() throws Exception {
        Assert.assertNull(new NFAmbienteTransformer().read(null));
        Assert.assertEquals(DFAmbiente.PRODUCAO, new NFAmbienteTransformer().read("1"));
        Assert.assertEquals(DFAmbiente.HOMOLOGACAO, new NFAmbienteTransformer().read("2"));
    }

    @Test
    public void deveTestarEscrita() throws Exception {
        Assert.assertEquals("1", new NFAmbienteTransformer().write(DFAmbiente.PRODUCAO));
        Assert.assertEquals("2", new NFAmbienteTransformer().write(DFAmbiente.HOMOLOGACAO));
    }
}