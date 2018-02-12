package br.indie.fiscal4j.mdfe3.transformers;

import br.indie.fiscal4j.mdfe3.classes.def.MDFTipoCarroceria;
import org.simpleframework.xml.transform.Transform;

public class MDFTipoCarroceriaTransformer implements Transform<MDFTipoCarroceria> {

    @Override
    public MDFTipoCarroceria read(String value) throws Exception {
        return MDFTipoCarroceria.valueOfCodigo(value);
    }

    @Override
    public String write(MDFTipoCarroceria value) throws Exception {
        return value.getCodigo();
    }
}
