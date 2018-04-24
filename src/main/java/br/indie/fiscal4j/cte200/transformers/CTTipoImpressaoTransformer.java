package br.indie.fiscal4j.cte200.transformers;

import br.indie.fiscal4j.cte200.classes.CTTipoImpressao;
import org.simpleframework.xml.transform.Transform;

public class CTTipoImpressaoTransformer implements Transform<CTTipoImpressao> {

    @Override
    public CTTipoImpressao read(final String codigo) throws Exception {
        return CTTipoImpressao.valueOfCodigo(codigo);
    }

    @Override
    public String write(final CTTipoImpressao tipo) throws Exception {
        return tipo.getCodigo();
    }
}