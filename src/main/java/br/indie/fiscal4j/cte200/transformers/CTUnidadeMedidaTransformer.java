package br.indie.fiscal4j.cte200.transformers;

import br.indie.fiscal4j.cte200.classes.CTUnidadeMedida;
import org.simpleframework.xml.transform.Transform;

public class CTUnidadeMedidaTransformer implements Transform<CTUnidadeMedida> {

    @Override
    public CTUnidadeMedida read(final String codigo) throws Exception {
        return CTUnidadeMedida.valueOfCodigo(codigo);
    }

    @Override
    public String write(final CTUnidadeMedida tipo) throws Exception {
        return tipo.getCodigo();
    }
}