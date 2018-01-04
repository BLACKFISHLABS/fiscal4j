package br.indie.fiscal4j.nfe.utils;

import br.indie.fiscal4j.common.DFAmbiente;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Diego Fincatto on 07/05/16.
 */
public class NFGeraCadeiaCertificadosTest {

    @Test
    public void geraCadeiaCertificadoHomologacao() throws Exception {
        final byte[] cadeia = NFGeraCadeiaCertificados.geraCadeiaCertificados(DFAmbiente.HOMOLOGACAO, "senha");
        Assert.assertTrue(cadeia.length > 0);
    }

    @Test
    public void geraCadeiaCertificadoProducao() throws Exception {
        final byte[] cadeia = NFGeraCadeiaCertificados.geraCadeiaCertificados(DFAmbiente.PRODUCAO, "senha");
        Assert.assertTrue(cadeia.length > 0);
    }
}