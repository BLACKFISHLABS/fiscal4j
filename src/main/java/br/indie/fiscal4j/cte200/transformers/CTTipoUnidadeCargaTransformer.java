package br.indie.fiscal4j.cte200.transformers;

import br.indie.fiscal4j.cte200.classes.CTTipoUnidadeCarga;
import org.simpleframework.xml.transform.Transform;

public class CTTipoUnidadeCargaTransformer implements Transform<CTTipoUnidadeCarga> {

    @Override
    public CTTipoUnidadeCarga read(final String codigo) throws Exception {
        return CTTipoUnidadeCarga.valueOfCodigo(codigo);
    }

    @Override
    public String write(final CTTipoUnidadeCarga tipo) throws Exception {
        return tipo.getCodigo();
    }
}