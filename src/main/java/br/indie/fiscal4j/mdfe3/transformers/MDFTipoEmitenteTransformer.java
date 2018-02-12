package br.indie.fiscal4j.mdfe3.transformers;

import br.indie.fiscal4j.mdfe3.classes.def.MDFTipoEmitente;
import org.simpleframework.xml.transform.Transform;

public class MDFTipoEmitenteTransformer implements Transform<MDFTipoEmitente> {

    @Override
    public MDFTipoEmitente read(String value) throws Exception {
        return MDFTipoEmitente.valueOfCodigo(value);
    }

    @Override
    public String write(MDFTipoEmitente value) throws Exception {
        return value.getCodigo();
    }
}
