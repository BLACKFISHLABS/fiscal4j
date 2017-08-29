package br.indie.fiscal4j.classes.evento.cancelamento;

import org.junit.Assert;
import org.junit.Test;

public class NFRetornoCancelamentoTest {

    @Test
    public void deveObterInfoCancelamentoComoFoiSetado() {
        final NFRetornoCancelamento cancelamento = new NFRetornoCancelamento();
        final NFRetornoInfoCancelamento infoCancelamento = new NFRetornoInfoCancelamento();
        cancelamento.setInfoCancelamento(infoCancelamento);

        Assert.assertEquals(infoCancelamento, cancelamento.getInfoCancelamento());
    }

    @Test
    public void deveObterVersaoComoFoiSetado() {
        final NFRetornoCancelamento cancelamento = new NFRetornoCancelamento();
        final String versao = "3.10";
        cancelamento.setVersao(versao);
        Assert.assertEquals("3.10", cancelamento.getVersao());
    }
}