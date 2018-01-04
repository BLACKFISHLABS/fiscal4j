package br.indie.fiscal4j.nfe.classes.nota.consulta;

import br.indie.fiscal4j.nfe.classes.evento.NFEvento;
import br.indie.fiscal4j.nfe.classes.evento.NFEventoRetorno;
import org.junit.Assert;
import org.junit.Test;

public class NFProtocoloEventoTest {

    @Test
    public void deveObterVersaoComoFoiSetado() {
        final DFProtocoloEvento evento = new DFProtocoloEvento();
        final String versao = "4.00";
        evento.setVersao(versao);
        Assert.assertEquals(versao, evento.getVersao());
    }

    @Test
    public void deveObterEventoComoFoiSetado() {
        final DFProtocoloEvento protocoloEvento = new DFProtocoloEvento();
        final NFEvento evento = new NFEvento();
        protocoloEvento.setEvento(evento);
        Assert.assertEquals(evento, protocoloEvento.getEvento());
    }

    @Test
    public void deveObterRetornoEventoComoFoiSetado() {
        final DFProtocoloEvento protocoloEvento = new DFProtocoloEvento();
        final NFEventoRetorno infoEventoRetorno = new NFEventoRetorno();
        protocoloEvento.setEventoRetorno(infoEventoRetorno);
        Assert.assertEquals(infoEventoRetorno, protocoloEvento.getInfoEventoRetorno());
    }
}