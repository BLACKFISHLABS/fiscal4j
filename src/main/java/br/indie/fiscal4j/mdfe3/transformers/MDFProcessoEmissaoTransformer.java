package br.indie.fiscal4j.mdfe3.transformers;

import br.indie.fiscal4j.mdfe3.classes.def.MDFProcessoEmissao;
import org.simpleframework.xml.transform.Transform;

public class MDFProcessoEmissaoTransformer implements Transform<MDFProcessoEmissao> {

    @Override
    public MDFProcessoEmissao read(String value) throws Exception {
        return MDFProcessoEmissao.valueOfCodigo(value);
    }

    @Override
    public String write(MDFProcessoEmissao value) throws Exception {
        return value.getCodigo();
    }
}
