package br.indie.fiscal4j.mdfe3.transformers;

import br.indie.fiscal4j.mdfe3.classes.def.MDFTipoProprietario;
import org.simpleframework.xml.transform.Transform;

public class MDFTipoProprietarioTransformer implements Transform<MDFTipoProprietario> {

    @Override
    public MDFTipoProprietario read(String value) throws Exception {
        return MDFTipoProprietario.valueOfCodigo(value);
    }

    @Override
    public String write(MDFTipoProprietario value) throws Exception {
        return value.getCodigo();
    }
}
