package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.nfe.classes.NFNotaInfoImpostoTributacaoISSQN;
import org.junit.Assert;
import org.junit.Test;

public class NFNotaInfoImpostoTributacaoISSQNTest {

    @Test
    public void deveRetornarNuloAoPassarCodigoInvalido() {
        Assert.assertNull(NFNotaInfoImpostoTributacaoISSQN.valueOfCodigo(""));
    }

    @Test
    public void deveRetornarTributacaoISSQNaoPassarCodigoValido() {
        Assert.assertNotNull(NFNotaInfoImpostoTributacaoISSQN.valueOfCodigo(NFNotaInfoImpostoTributacaoISSQN.SUBSTITUTA.getCodigo()));
    }
}