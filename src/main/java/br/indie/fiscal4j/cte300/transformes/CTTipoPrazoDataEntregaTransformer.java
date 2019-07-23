package br.indie.fiscal4j.cte300.transformes;

import br.indie.fiscal4j.cte300.classes.CTTipoPrazoDataEntrega;
import org.simpleframework.xml.transform.Transform;

public class CTTipoPrazoDataEntregaTransformer implements Transform<CTTipoPrazoDataEntrega> {

    @Override
    public CTTipoPrazoDataEntrega read(String arg0) {
        return CTTipoPrazoDataEntrega.valueOfCodigo(arg0);
    }

    @Override
    public String write(CTTipoPrazoDataEntrega arg0) {
        return arg0.getCodigo();
    }
}
