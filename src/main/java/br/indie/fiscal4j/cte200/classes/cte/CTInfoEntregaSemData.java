package br.indie.fiscal4j.cte200.classes.cte;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.cte200.classes.CTTipoEntregaData;
import org.simpleframework.xml.Element;

public class CTInfoEntregaSemData extends DFBase {
    private static final long serialVersionUID = 4799720133563113665L;

    @Element(name = "tpPer")
    private CTTipoEntregaData tipoPeriodo;

    public void setTipoPeriodo(final CTTipoEntregaData tipoPeriodo) {
        if (!CTTipoEntregaData.SEM_DATA.equals(tipoPeriodo)) {
            throw new IllegalArgumentException("O tipo de per\u00edodo programado para entrega deve ser sem data");
        }
        this.tipoPeriodo = tipoPeriodo;
    }

    public CTTipoEntregaData getTipoPeriodo() {
        return this.tipoPeriodo;
    }
}
