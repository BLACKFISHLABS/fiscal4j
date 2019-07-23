package br.indie.fiscal4j.cte300.transformes;

import br.indie.fiscal4j.cte300.classes.CTUnidadeMedida;
import org.simpleframework.xml.transform.Transform;

public class CTUnidadeMedidaTransformer implements Transform<CTUnidadeMedida> {

    @Override
    public CTUnidadeMedida read(String arg0) {
        return CTUnidadeMedida.valueOfCodigo(arg0);
    }

    @Override
    public String write(CTUnidadeMedida arg0) {
        return arg0.getCodigo();
    }
}