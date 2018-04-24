package br.indie.fiscal4j.cte200.classes.cte;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.cte200.classes.CTTipoEntregaHorario;
import org.joda.time.LocalTime;
import org.simpleframework.xml.Element;

public class CTInfoEntregaNoInter extends DFBase {
    private static final long serialVersionUID = -4692215517978664073L;

    @Element(name = "tpHor")
    private CTTipoEntregaHorario tipoHorario;

    @Element(name = "hIni")
    private LocalTime horarioInicial;

    @Element(name = "hFim")
    private LocalTime horarioFinal;

    public LocalTime getHorarioInicial() {
        return this.horarioInicial;
    }

    public void setHorarioInicial(final LocalTime horarioInicial) {
        this.horarioInicial = horarioInicial;
    }

    public LocalTime getHorarioFinal() {
        return this.horarioFinal;
    }

    public void setHorarioFinal(final LocalTime horarioFinal) {
        this.horarioFinal = horarioFinal;
    }

    public CTTipoEntregaHorario getTipoHorario() {
        return this.tipoHorario;
    }

    public void setTipoHorario(final CTTipoEntregaHorario tipoHorario) {
        if (!CTTipoEntregaHorario.NO_INTERVALO.equals(tipoHorario)) {
            throw new IllegalArgumentException("O tipo de per\u00edodo programado para entrega deve ser no intervalo");
        }
        this.tipoHorario = tipoHorario;
    }

}
