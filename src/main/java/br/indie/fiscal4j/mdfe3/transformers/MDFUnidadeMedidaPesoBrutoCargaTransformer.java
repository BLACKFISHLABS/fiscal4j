package br.indie.fiscal4j.mdfe3.transformers;

import br.indie.fiscal4j.mdfe3.classes.def.MDFUnidadeMedidaPesoBrutoCarga;
import org.simpleframework.xml.transform.Transform;

/**
 * Created by Eldevan Nery Junior on 06/11/17.
 */
public class MDFUnidadeMedidaPesoBrutoCargaTransformer implements Transform<MDFUnidadeMedidaPesoBrutoCarga> {

    @Override
    public MDFUnidadeMedidaPesoBrutoCarga read(String value) throws Exception {
        return MDFUnidadeMedidaPesoBrutoCarga.valueOfCodigo(value);
    }

    @Override
    public String write(MDFUnidadeMedidaPesoBrutoCarga value) throws Exception {
        return value.getCodigo();
    }
}
