package br.indie.fiscal4j.mdfe3.transformers;

import br.indie.fiscal4j.mdfe3.classes.def.MDFTipoProprietario;
import org.simpleframework.xml.transform.Transform;

/**
 * Created by Eldevan Nery Junior on 06/11/17.
 */
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
