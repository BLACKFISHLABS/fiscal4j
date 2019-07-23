package br.indie.fiscal4j.cte300.transformes;

import br.indie.fiscal4j.cte300.classes.CTTipoUnidadeCarga;
import org.simpleframework.xml.transform.Transform;

public class CTTipoUnidadeCargaTransformer implements Transform<CTTipoUnidadeCarga> {

    @Override
    public CTTipoUnidadeCarga read(String arg0) {
        return CTTipoUnidadeCarga.valueOfCodigo(arg0);
    }

    @Override
    public String write(CTTipoUnidadeCarga arg0) {
        return arg0.getCodigo();
    }
}