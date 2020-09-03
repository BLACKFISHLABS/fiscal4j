package br.indie.fiscal4j.mdfe3.transformers;

import br.indie.fiscal4j.mdfe3.classes.def.MDFTipoInfPag;
import org.simpleframework.xml.transform.Transform;

public class MDFTipoInfPagTransformer implements Transform<MDFTipoInfPag> {

    @Override
    public MDFTipoInfPag read(String value) {
        return MDFTipoInfPag.valueOfCodigo(value);
    }

    @Override
    public String write(MDFTipoInfPag value) {
        return value.getCodigo();
    }
}
