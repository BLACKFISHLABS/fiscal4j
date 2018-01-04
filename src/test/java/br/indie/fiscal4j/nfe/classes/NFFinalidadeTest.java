package br.indie.fiscal4j.nfe.classes;

import org.junit.Assert;
import org.junit.Test;

public class NFFinalidadeTest {

    @Test
    public void deveRepresentarOCodigoCorretamente() {
        Assert.assertEquals("1", NFFinalidade.NORMAL.getCodigo());
        Assert.assertEquals("2", NFFinalidade.COMPLEMENTAR.getCodigo());
        Assert.assertEquals("3", NFFinalidade.AJUSTE.getCodigo());
        Assert.assertEquals("4", NFFinalidade.DEVOLUCAO_OU_RETORNO.getCodigo());
    }
}