package br.indie.fiscal4j.mdfe3.transformers;

import br.indie.fiscal4j.mdfe3.classes.def.MDFTipoUnidadeTransporte;
import org.simpleframework.xml.transform.Transform;

public class MDFTipoUnidadeTransporteTransformer implements Transform<MDFTipoUnidadeTransporte> {

    @Override
    public MDFTipoUnidadeTransporte read(String value) throws Exception {
        return MDFTipoUnidadeTransporte.valueOfCodigo(value);
    }

    @Override
    public String write(MDFTipoUnidadeTransporte value) throws Exception {
        return value.getCodigo();
    }
}
