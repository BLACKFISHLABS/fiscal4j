package br.indie.fiscal4j.mdfe3.transformers;

import br.indie.fiscal4j.mdfe3.classes.def.MDFTipoInfPagComp;
import org.simpleframework.xml.transform.Transform;

public class MDFTipoInfPagCompTransformer implements Transform<MDFTipoInfPagComp> {

    @Override
    public MDFTipoInfPagComp read(String value) {
        return MDFTipoInfPagComp.valueOfCodigo(value);
    }

    @Override
    public String write(MDFTipoInfPagComp value) {
        return value.getCodigo();
    }
}
