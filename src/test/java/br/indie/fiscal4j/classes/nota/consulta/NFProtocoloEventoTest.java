package br.indie.fiscal4j.classes.nota.consulta;

import br.indie.fiscal4j.classes.evento.NFEvento;
import br.indie.fiscal4j.classes.evento.NFEventoRetorno;
import org.junit.Assert;
import org.junit.Test;

public class NFProtocoloEventoTest {

    @Test
    public void deveObterVersaoComoFoiSetado() {
        final NFProtocoloEvento evento = new NFProtocoloEvento();
        final String versao = "3.10";
        evento.setVersao(versao);
        Assert.assertEquals(versao, evento.getVersao());
    }

    @Test
    public void deveObterEventoComoFoiSetado() {
        final NFProtocoloEvento protocoloEvento = new NFProtocoloEvento();
        final NFEvento evento = new NFEvento();
        protocoloEvento.setEvento(evento);
        Assert.assertEquals(evento, protocoloEvento.getEvento());
    }

    @Test
    public void deveObterRetornoEventoComoFoiSetado() {
        final NFProtocoloEvento protocoloEvento = new NFProtocoloEvento();
        final NFEventoRetorno infoEventoRetorno = new NFEventoRetorno();
        protocoloEvento.setEventoRetorno(infoEventoRetorno);
        Assert.assertEquals(infoEventoRetorno, protocoloEvento.getInfoEventoRetorno());
    }
}