package br.indie.fiscal4j.cte200.transformers;

import br.indie.fiscal4j.cte200.classes.CTTipoDocumentoOutro;
import org.simpleframework.xml.transform.Transform;

public class CTTipoDocumentoOutroTransformer implements Transform<CTTipoDocumentoOutro> {

    @Override
    public CTTipoDocumentoOutro read(final String codigo) throws Exception {
        return CTTipoDocumentoOutro.valueOfCodigo(codigo);
    }

    @Override
    public String write(final CTTipoDocumentoOutro tipo) throws Exception {
        return tipo.getCodigo();
    }
}