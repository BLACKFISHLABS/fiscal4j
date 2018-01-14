package br.indie.fiscal4j.nfe.classes.cadastro;

import org.junit.Assert;
import org.junit.Test;

public class NFRetornoConsultaCadastroTest {

    @Test
    public void deveObterVersaoComoFoiSetado() {
        final NFRetornoConsultaCadastro retornoConsultaCadastro = new NFRetornoConsultaCadastro();
        retornoConsultaCadastro.setVersao("4.00");
        Assert.assertEquals("4.00", retornoConsultaCadastro.getVersao());
    }

    @Test
    public void deveObterDadosComoFoiSetado() {
        final NFRetornoConsultaCadastro retornoConsultaCadastro = new NFRetornoConsultaCadastro();
        final NFRetornoConsultaCadastroDados dados = new NFRetornoConsultaCadastroDados();
        retornoConsultaCadastro.setDados(dados);
        Assert.assertEquals(dados, retornoConsultaCadastro.getDados());
    }
}