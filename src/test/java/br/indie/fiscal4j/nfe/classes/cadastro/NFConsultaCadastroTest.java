package br.indie.fiscal4j.nfe.classes.cadastro;

import org.junit.Assert;
import org.junit.Test;

public class NFConsultaCadastroTest {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirVersaoNulo() {
        final NFConsultaCadastro consultaCadastro = new NFConsultaCadastro();
        consultaCadastro.setConsultaCadastro(new NFInfoConsultaCadastro());
        consultaCadastro.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirInfoConsultaCadastroNulo() {
        final NFConsultaCadastro consultaCadastro = new NFConsultaCadastro();
        consultaCadastro.setVersao("4.00");
        consultaCadastro.toString();
    }

    @Test
    public void deveObterOMesmoValorSetadoParaConsultaCadastro() {
        final NFConsultaCadastro consultaCadastro = new NFConsultaCadastro();
        final NFInfoConsultaCadastro infoConsultaCadastro = new NFInfoConsultaCadastro();
        consultaCadastro.setConsultaCadastro(infoConsultaCadastro);

        Assert.assertEquals(infoConsultaCadastro, consultaCadastro.getConsultaCadastro());
    }

    @Test
    public void deveObterOMesmoValorSetadoParaVersao() {
        final NFConsultaCadastro consultaCadastro = new NFConsultaCadastro();
        consultaCadastro.setVersao("4.00");
        Assert.assertEquals("4.00", consultaCadastro.getVersao());
    }
}