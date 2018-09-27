package br.indie.fiscal4j.cte300.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.cte300.classes.CTTipoPrazoHoraEntrega;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * @author Jeferson Cruz
 * @info Entrega sem hora definida
 */

@Root(name = "semHora")
public class CTeNotaInfoDadosComplementaresEntregaSemHoraDefinida extends DFBase {
    private static final long serialVersionUID = 8715534516011562469L;

    @Element(name = "tpHor", required = true)
    private CTTipoPrazoHoraEntrega tipoPrazoHoraEntrega;

    public CTeNotaInfoDadosComplementaresEntregaSemHoraDefinida() {
        this.tipoPrazoHoraEntrega = null;
    }

    public CTTipoPrazoHoraEntrega getTipoPrazoHoraEntrega() {
        return this.tipoPrazoHoraEntrega;
    }

    /**
     * Tipo de hora<br>
     * 0 - Sem hora definida
     */
    public void setTipoPrazoHoraEntrega(final CTTipoPrazoHoraEntrega tipoPrazoHoraEntrega) {
        this.tipoPrazoHoraEntrega = tipoPrazoHoraEntrega;
    }
}
