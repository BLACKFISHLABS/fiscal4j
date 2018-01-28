package br.indie.fiscal4j.mdfe3.transformers;

import br.indie.fiscal4j.mdfe3.classes.def.MDFTipoEmissao;
import org.simpleframework.xml.transform.Transform;

/**
 * Created by Eldevan Nery Junior on 06/11/17.
 */
public class MDFTipoEmissaoTransformer implements Transform<MDFTipoEmissao> {

    @Override
    public MDFTipoEmissao read(String value) throws Exception {
        return MDFTipoEmissao.valueOfCodigo(value);
    }

    @Override
    public String write(MDFTipoEmissao value) throws Exception {
        return value.getCodigo();
    }
}
