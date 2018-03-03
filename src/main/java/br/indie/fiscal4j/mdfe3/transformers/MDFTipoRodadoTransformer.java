package br.indie.fiscal4j.mdfe3.transformers;

import br.indie.fiscal4j.mdfe3.classes.def.MDFTipoRodado;
import org.simpleframework.xml.transform.Transform;

/**
 * Created by Eldevan Nery Junior on 06/11/17.
 */
public class MDFTipoRodadoTransformer implements Transform<MDFTipoRodado> {

    @Override
    public MDFTipoRodado read(String value) throws Exception {
        return MDFTipoRodado.valueOfCodigo(value);
    }

    @Override
    public String write(MDFTipoRodado value) throws Exception {
        return value.getCodigo();
    }
}
