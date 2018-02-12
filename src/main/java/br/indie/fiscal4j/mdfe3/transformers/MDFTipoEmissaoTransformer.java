package br.indie.fiscal4j.mdfe3.transformers;

import br.indie.fiscal4j.mdfe3.classes.def.MDFTipoEmissao;
import org.simpleframework.xml.transform.Transform;

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
