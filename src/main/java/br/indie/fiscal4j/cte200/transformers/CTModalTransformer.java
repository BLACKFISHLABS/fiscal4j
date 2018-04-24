package br.indie.fiscal4j.cte200.transformers;

import br.indie.fiscal4j.cte200.classes.CTModal;
import org.simpleframework.xml.transform.Transform;

public class CTModalTransformer implements Transform<CTModal> {

    @Override
    public CTModal read(final String codigo) throws Exception {
        return CTModal.valueOfCodigo(codigo);
    }

    @Override
    public String write(final CTModal tipo) throws Exception {
        return tipo.getCodigo();
    }
}