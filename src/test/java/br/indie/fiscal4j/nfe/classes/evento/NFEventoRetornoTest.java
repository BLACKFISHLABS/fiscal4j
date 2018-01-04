package br.indie.fiscal4j.nfe.classes.evento;

import br.indie.fiscal4j.nfe.classes.nota.assinatura.DFSignature;
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
        final String versao = "4.00";
        retorno.setVersao(versao);
        Assert.assertEquals(versao, retorno.getVersao());
    }

    @Test
    public void deveObterAssinaturaComoFoiSetado() {
        final NFEventoRetorno retorno = new NFEventoRetorno();
        final DFSignature assinatura = new DFSignature();
        retorno.setAssinatura(assinatura);
        Assert.assertEquals(assinatura, retorno.getAssinatura());
    }
}