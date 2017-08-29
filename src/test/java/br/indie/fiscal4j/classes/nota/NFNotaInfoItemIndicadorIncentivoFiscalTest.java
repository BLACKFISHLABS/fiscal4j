package br.indie.fiscal4j.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class NFNotaInfoItemIndicadorIncentivoFiscalTest {

    @Test
    public void deveObterTipoApartirDoSeuCodigo() {
        Assert.assertEquals(NFNotaInfoItemIndicadorIncentivoFiscal.SIM, NFNotaInfoItemIndicadorIncentivoFiscal.valueOfCodigo("1"));
        Assert.assertEquals(NFNotaInfoItemIndicadorIncentivoFiscal.NAO, NFNotaInfoItemIndicadorIncentivoFiscal.valueOfCodigo("2"));
        Assert.assertNull(NFNotaInfoItemIndicadorIncentivoFiscal.valueOfCodigo("3"));
    }

    @Test
    public void deveRepresentarOCodigoCorretamente() {
        Assert.assertEquals("1", NFNotaInfoItemIndicadorIncentivoFiscal.SIM.getCodigo());
        Assert.assertEquals("2", NFNotaInfoItemIndicadorIncentivoFiscal.NAO.getCodigo());
    }

    @Test
    public void deveObterStringficadoCorretamente() {
        Assert.assertEquals("1 - Sim", NFNotaInfoItemIndicadorIncentivoFiscal.SIM.toString());
    }
}