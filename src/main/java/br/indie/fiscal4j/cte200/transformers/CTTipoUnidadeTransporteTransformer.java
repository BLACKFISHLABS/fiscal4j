package br.indie.fiscal4j.cte200.transformers;

import br.indie.fiscal4j.cte200.classes.CTTipoUnidadeTransporte;
import org.simpleframework.xml.transform.Transform;

public class CTTipoUnidadeTransporteTransformer implements Transform<CTTipoUnidadeTransporte> {

    @Override
    public CTTipoUnidadeTransporte read(final String codigo) throws Exception {
        return CTTipoUnidadeTransporte.valueOfCodigo(codigo);
    }

    @Override
    public String write(final CTTipoUnidadeTransporte tipo) throws Exception {
        return tipo.getCodigo();
    }
}