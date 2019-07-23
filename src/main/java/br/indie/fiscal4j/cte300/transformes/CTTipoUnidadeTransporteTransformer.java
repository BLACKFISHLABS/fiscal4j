package br.indie.fiscal4j.cte300.transformes;

import br.indie.fiscal4j.cte300.classes.CTTipoUnidadeTransporte;
import org.simpleframework.xml.transform.Transform;

public class CTTipoUnidadeTransporteTransformer implements Transform<CTTipoUnidadeTransporte> {

    @Override
    public CTTipoUnidadeTransporte read(String arg0) {
        return CTTipoUnidadeTransporte.valueOfCodigo(arg0);
    }

    @Override
    public String write(CTTipoUnidadeTransporte arg0) {
        return arg0.getCodigo();
    }
}