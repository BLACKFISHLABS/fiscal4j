package br.indie.fiscal4j.cte200.transformers;

import br.indie.fiscal4j.cte200.classes.CTRetiraMercadoria;
import org.simpleframework.xml.transform.Transform;

public class CTRetiraMercadoriaTransformer implements Transform<CTRetiraMercadoria> {

    @Override
    public CTRetiraMercadoria read(final String codigo) {
        return CTRetiraMercadoria.valueOfCodigo(codigo);
    }

    @Override
    public String write(final CTRetiraMercadoria tipo) {
        return tipo.getCodigo();
    }
}