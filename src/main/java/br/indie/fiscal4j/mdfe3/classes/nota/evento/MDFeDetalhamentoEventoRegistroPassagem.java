package br.indie.fiscal4j.mdfe3.classes.nota.evento;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class MDFeDetalhamentoEventoRegistroPassagem extends DFBase {

    @Attribute(name = "versaoEvento", required = false)
    private String versaoEvento;

    @Element(name = "evMDFeRegPassagem")
    private MDFeEnviaEventoRegistroPassagem eventoRegistroPassagem;

    public String getVersaoEvento() {
        return versaoEvento;
    }

    public void setVersaoEvento(final BigDecimal versaoEvento) {
        this.versaoEvento = BigDecimalParser.tamanho5Com2CasasDecimais(versaoEvento, "Versao do Evento");
    }

    public MDFeEnviaEventoRegistroPassagem getEventoRegistroPassagem() {
        return eventoRegistroPassagem;
    }

    public void setEventoRegistroPassagem(MDFeEnviaEventoRegistroPassagem eventoRegistroPassagem) {
        this.eventoRegistroPassagem = eventoRegistroPassagem;
    }
}