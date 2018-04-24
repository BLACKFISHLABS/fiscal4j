package br.indie.fiscal4j.cte300.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.cte300.classes.CTTipoPrazoHoraEntrega;
import org.joda.time.LocalTime;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * @author Caio
 * @info Entrega com hora definida
 */

@Root(name = "comHora")
public class CTeNotaInfoDadosComplementaresEntregaComHoraDefinida extends DFBase {
    private static final long serialVersionUID = 563326795168120772L;

    @Element(name = "tpHor", required = true)
    private CTTipoPrazoHoraEntrega tipoPrazoHoraEntrega;

    @Element(name = "hProg", required = true)
    private LocalTime horaProgramada;

    public CTeNotaInfoDadosComplementaresEntregaComHoraDefinida() {
        this.tipoPrazoHoraEntrega = null;
        this.horaProgramada = null;
    }

    public CTTipoPrazoHoraEntrega getTipoPrazoHoraEntrega() {
        return this.tipoPrazoHoraEntrega;
    }

    /**
     * Tipo de hora<br>
     * Preencher com:<br>
     * 1--No horário;<br>
     * 2-Até o horário;<br>
     * 3-A partir do horário
     */
    public void setTipoPrazoHoraEntrega(final CTTipoPrazoHoraEntrega tipoPrazoHoraEntrega) {
        this.tipoPrazoHoraEntrega = tipoPrazoHoraEntrega;
    }

    public LocalTime getHoraProgramada() {
        return this.horaProgramada;
    }

    /**
     * Hora programada<br>
     * Formato HH:MM:SS
     */
    public void setHoraProgramada(final LocalTime horaProgramada) {
        this.horaProgramada = horaProgramada;
    }
}
