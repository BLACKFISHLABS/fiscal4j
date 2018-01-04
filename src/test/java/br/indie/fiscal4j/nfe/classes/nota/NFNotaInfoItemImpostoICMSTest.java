package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import org.junit.Assert;
import org.junit.Test;

public class NFNotaInfoItemImpostoICMSTest {

    @Test
    public void deveObterIcms00ComoFoiSetado() {
        final DFNotaInfoItemImpostoICMS icms = new DFNotaInfoItemImpostoICMS();
        final DFNotaInfoItemImpostoICMS00 icms00 = FabricaDeObjetosFake.getNFNotaInfoItemImpostoICMS00();
        icms.setIcms00(icms00);
        Assert.assertEquals(icms00, icms.getIcms00());
    }

    @Test
    public void deveObterIcms10ComoFoiSetado() {
        final DFNotaInfoItemImpostoICMS icms = new DFNotaInfoItemImpostoICMS();
        final DFNotaInfoItemImpostoICMS10 icms10 = new DFNotaInfoItemImpostoICMS10();
        icms.setIcms10(icms10);
        Assert.assertEquals(icms10, icms.getIcms10());
    }

    @Test
    public void deveObterIcms20ComoFoiSetado() {
        final DFNotaInfoItemImpostoICMS icms = new DFNotaInfoItemImpostoICMS();
        final DFNotaInfoItemImpostoICMS20 icms20 = new DFNotaInfoItemImpostoICMS20();
        icms.setIcms20(icms20);
        Assert.assertEquals(icms20, icms.getIcms20());
    }

    @Test
    public void deveObterIcms30ComoFoiSetado() {
        final DFNotaInfoItemImpostoICMS icms = new DFNotaInfoItemImpostoICMS();
        final DFNotaInfoItemImpostoICMS30 icmsSetado = new DFNotaInfoItemImpostoICMS30();
        icms.setIcms30(icmsSetado);
        Assert.assertEquals(icmsSetado, icms.getIcms30());
    }

    @Test
    public void deveObterIcms40ComoFoiSetado() {
        final DFNotaInfoItemImpostoICMS icms = new DFNotaInfoItemImpostoICMS();
        final DFNotaInfoItemImpostoICMS40 icmsSetado = new DFNotaInfoItemImpostoICMS40();
        icms.setIcms40(icmsSetado);
        Assert.assertEquals(icmsSetado, icms.getIcms40());
    }

    @Test
    public void deveObterIcms51ComoFoiSetado() {
        final DFNotaInfoItemImpostoICMS icms = new DFNotaInfoItemImpostoICMS();
        final DFNotaInfoItemImpostoICMS51 icmsSetado = new DFNotaInfoItemImpostoICMS51();
        icms.setIcms51(icmsSetado);
        Assert.assertEquals(icmsSetado, icms.getIcms51());
    }

    @Test
    public void deveObterIcms60ComoFoiSetado() {
        final DFNotaInfoItemImpostoICMS icms = new DFNotaInfoItemImpostoICMS();
        final DFNotaInfoItemImpostoICMS60 icmsSetado = new DFNotaInfoItemImpostoICMS60();
        icms.setIcms60(icmsSetado);
        Assert.assertEquals(icmsSetado, icms.getIcms60());
    }

    @Test
    public void deveObterIcms70ComoFoiSetado() {
        final DFNotaInfoItemImpostoICMS icms = new DFNotaInfoItemImpostoICMS();
        final DFNotaInfoItemImpostoICMS70 icmsSetado = new DFNotaInfoItemImpostoICMS70();
        icms.setIcms70(icmsSetado);
        Assert.assertEquals(icmsSetado, icms.getIcms70());
    }

    @Test
    public void deveObterIcms90ComoFoiSetado() {
        final DFNotaInfoItemImpostoICMS icms = new DFNotaInfoItemImpostoICMS();
        final DFNotaInfoItemImpostoICMS90 icmsSetado = new DFNotaInfoItemImpostoICMS90();
        icms.setIcms90(icmsSetado);
        Assert.assertEquals(icmsSetado, icms.getIcms90());
    }

    @Test
    public void deveObterIcmsPartilhadoComoFoiSetado() {
        final DFNotaInfoItemImpostoICMS icms = new DFNotaInfoItemImpostoICMS();
        final DFNotaInfoItemImpostoICMSPartilhado icmsSetado = new DFNotaInfoItemImpostoICMSPartilhado();
        icms.setIcmsPartilhado(icmsSetado);
        Assert.assertEquals(icmsSetado, icms.getIcmsPartilhado());
    }

    @Test
    public void deveObterIcmsSN101ComoFoiSetado() {
        final DFNotaInfoItemImpostoICMS icms = new DFNotaInfoItemImpostoICMS();
        final DFNotaInfoItemImpostoICMSSN101 icmsSetado = new DFNotaInfoItemImpostoICMSSN101();
        icms.setIcmssn101(icmsSetado);
        Assert.assertEquals(icmsSetado, icms.getIcmssn101());
    }

    @Test
    public void deveObterIcmsSN102ComoFoiSetado() {
        final DFNotaInfoItemImpostoICMS icms = new DFNotaInfoItemImpostoICMS();
        final DFNotaInfoItemImpostoICMSSN102 icmsSetado = new DFNotaInfoItemImpostoICMSSN102();
        icms.setIcmssn102(icmsSetado);
        Assert.assertEquals(icmsSetado, icms.getIcmssn102());
    }

    @Test
    public void deveObterIcmsSN201ComoFoiSetado() {
        final DFNotaInfoItemImpostoICMS icms = new DFNotaInfoItemImpostoICMS();
        final DFNotaInfoItemImpostoICMSSN201 icmsSetado = new DFNotaInfoItemImpostoICMSSN201();
        icms.setIcmssn201(icmsSetado);
        Assert.assertEquals(icmsSetado, icms.getIcmssn201());
    }

    @Test
    public void deveObterIcmsSN202ComoFoiSetado() {
        final DFNotaInfoItemImpostoICMS icms = new DFNotaInfoItemImpostoICMS();
        final DFNotaInfoItemImpostoICMSSN202 icmsSetado = new DFNotaInfoItemImpostoICMSSN202();
        icms.setIcmssn202(icmsSetado);
        Assert.assertEquals(icmsSetado, icms.getIcmssn202());
    }

    @Test
    public void deveObterIcmsSN500ComoFoiSetado() {
        final DFNotaInfoItemImpostoICMS icms = new DFNotaInfoItemImpostoICMS();
        final DFNotaInfoItemImpostoICMSSN500 icmsSetado = new DFNotaInfoItemImpostoICMSSN500();
        icms.setIcmssn500(icmsSetado);
        Assert.assertEquals(icmsSetado, icms.getIcmssn500());
    }

    @Test
    public void deveObterIcmsSN900ComoFoiSetado() {
        final DFNotaInfoItemImpostoICMS icms = new DFNotaInfoItemImpostoICMS();
        final DFNotaInfoItemImpostoICMSSN900 icmsSetado = new DFNotaInfoItemImpostoICMSSN900();
        icms.setIcmssn900(icmsSetado);
        Assert.assertEquals(icmsSetado, icms.getIcmssn900());
    }

    @Test
    public void deveObterIcmsSTComoFoiSetado() {
        final DFNotaInfoItemImpostoICMS icms = new DFNotaInfoItemImpostoICMS();
        final DFNotaInfoItemImpostoICMSST icmsSetado = new DFNotaInfoItemImpostoICMSST();
        icms.setIcmsst(icmsSetado);
        Assert.assertEquals(icmsSetado, icms.getIcmsst());
    }

    @Test
    public void devePermitirApenasUmICMSSelecionado() {
        final DFNotaInfoItemImpostoICMS icms = new DFNotaInfoItemImpostoICMS();
        icms.setIcms00(new DFNotaInfoItemImpostoICMS00());

        try {
            icms.setIcms10(new DFNotaInfoItemImpostoICMS10());
            Assert.fail("So pode permitir um icms cadastrado");
        } catch (final IllegalStateException e) {
        }
        try {
            icms.setIcms20(new DFNotaInfoItemImpostoICMS20());
            Assert.fail("So pode permitir um icms cadastrado");
        } catch (final IllegalStateException e) {
        }
        try {
            icms.setIcms30(new DFNotaInfoItemImpostoICMS30());
            Assert.fail("So pode permitir um icms cadastrado");
        } catch (final IllegalStateException e) {
        }
        try {
            icms.setIcms40(new DFNotaInfoItemImpostoICMS40());
            Assert.fail("So pode permitir um icms cadastrado");
        } catch (final IllegalStateException e) {
        }
        try {
            icms.setIcms51(new DFNotaInfoItemImpostoICMS51());
            Assert.fail("So pode permitir um icms cadastrado");
        } catch (final IllegalStateException e) {
        }
        try {
            icms.setIcms60(new DFNotaInfoItemImpostoICMS60());
            Assert.fail("So pode permitir um icms cadastrado");
        } catch (final IllegalStateException e) {
        }
        try {
            icms.setIcms70(new DFNotaInfoItemImpostoICMS70());
            Assert.fail("So pode permitir um icms cadastrado");
        } catch (final IllegalStateException e) {
        }
        try {
            icms.setIcms90(new DFNotaInfoItemImpostoICMS90());
            Assert.fail("So pode permitir um icms cadastrado");
        } catch (final IllegalStateException e) {
        }
        try {
            icms.setIcmsPartilhado(new DFNotaInfoItemImpostoICMSPartilhado());
            Assert.fail("So pode permitir um icms cadastrado");
        } catch (final IllegalStateException e) {
        }
        try {
            icms.setIcmssn101(new DFNotaInfoItemImpostoICMSSN101());
            Assert.fail("So pode permitir um icms cadastrado");
        } catch (final IllegalStateException e) {
        }
        try {
            icms.setIcmssn102(new DFNotaInfoItemImpostoICMSSN102());
            Assert.fail("So pode permitir um icms cadastrado");
        } catch (final IllegalStateException e) {
        }
        try {
            icms.setIcmssn201(new DFNotaInfoItemImpostoICMSSN201());
            Assert.fail("So pode permitir um icms cadastrado");
        } catch (final IllegalStateException e) {
        }
        try {
            icms.setIcmssn202(new DFNotaInfoItemImpostoICMSSN202());
            Assert.fail("So pode permitir um icms cadastrado");
        } catch (final IllegalStateException e) {
        }
        try {
            icms.setIcmssn500(new DFNotaInfoItemImpostoICMSSN500());
            Assert.fail("So pode permitir um icms cadastrado");
        } catch (final IllegalStateException e) {
        }
        try {
            icms.setIcmssn900(new DFNotaInfoItemImpostoICMSSN900());
            Assert.fail("So pode permitir um icms cadastrado");
        } catch (final IllegalStateException e) {
        }
    }

    @Test
    public void deveEstarSelecionadoCasoTenhaUmICMSSetado() {
        final DFNotaInfoItemImpostoICMS icms = new DFNotaInfoItemImpostoICMS();
        icms.setIcms00(new DFNotaInfoItemImpostoICMS00());
        Assert.assertTrue(icms.isSelecionado());
    }

    @Test
    public void naoDeveEstarSelecionadoCasoNaoTenhaICMSSetado() {
        final DFNotaInfoItemImpostoICMS icms = new DFNotaInfoItemImpostoICMS();
        Assert.assertFalse(icms.isSelecionado());
    }
}