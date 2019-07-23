package br.indie.fiscal4j.mdfe3.classes.nota.evento;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.BigDecimalValidador;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

/**
 * Created by Eldevan Nery Junior on 17/11/17.
 */
public class MDFeDetalhamentoEventoRegistroPassagem extends DFBase {
    private static final long serialVersionUID = -7707611175460953442L;

    @Attribute(name = "versaoEvento", required = false)
    private String versaoEvento;

    @Element(name = "evMDFeRegPassagem")
    private MDFeEnviaEventoRegistroPassagem eventoRegistroPassagem;

    public void setVersaoEvento(final BigDecimal versaoEvento) {
        this.versaoEvento = BigDecimalValidador.tamanho5Com2CasasDecimais(versaoEvento, "Versao do Evento");
    }

    public String getVersaoEvento() {
        return this.versaoEvento;
    }

    public MDFeEnviaEventoRegistroPassagem getEventoRegistroPassagem() {
        return this.eventoRegistroPassagem;
    }

    public void setEventoRegistroPassagem(final MDFeEnviaEventoRegistroPassagem eventoRegistroPassagem) {
        this.eventoRegistroPassagem = eventoRegistroPassagem;
    }
}