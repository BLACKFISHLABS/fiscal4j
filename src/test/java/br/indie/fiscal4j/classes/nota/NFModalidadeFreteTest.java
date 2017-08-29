package br.indie.fiscal4j.classes.nota;

import br.indie.fiscal4j.classes.NFModalidadeFrete;
import org.junit.Assert;
import org.junit.Test;

public class NFModalidadeFreteTest {

    @Test
    public void deveRetornarNuloAoPassarCodigoInvalido() {
        Assert.assertNull(NFModalidadeFrete.valueOfCodigo(""));
    }

    @Test
    public void deveRetornarModalidadeFreteAoPassarCodigoValido() {
        Assert.assertNotNull(NFModalidadeFrete.valueOfCodigo(NFModalidadeFrete.POR_CONTA_DE_TERCEIROS.getCodigo()));
    }
}