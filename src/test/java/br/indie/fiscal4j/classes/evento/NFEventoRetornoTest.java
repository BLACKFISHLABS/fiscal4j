package br.indie.fiscal4j.classes.evento;

import br.indie.fiscal4j.classes.nota.assinatura.NFSignature;
import org.junit.Assert;
import org.junit.Test;

public class NFEventoRetornoTest {

    @Test
    public void deveObterInfoEventoRetornoComoFoiSetado() {
        final NFEventoRetorno retorno = new NFEventoRetorno();
        final NFInfoEventoRetorno infoEventoRetorno = new NFInfoEventoRetorno();
        retorno.setInfoEventoRetorno(infoEventoRetorno);
        Assert.assertEquals(infoEventoRetorno, retorno.getInfoEventoRetorno());
    }

    @Test
    public void deveObterVersaoComoFoiSetado() {
        final NFEventoRetorno retorno = new NFEventoRetorno();
        final String versao = "3.10";
        retorno.setVersao(versao);
        Assert.assertEquals(versao, retorno.getVersao());
    }

    @Test
    public void deveObterAssinaturaComoFoiSetado() {
        final NFEventoRetorno retorno = new NFEventoRetorno();
        final NFSignature assinatura = new NFSignature();
        retorno.setAssinatura(assinatura);
        Assert.assertEquals(assinatura, retorno.getAssinatura());
    }
}