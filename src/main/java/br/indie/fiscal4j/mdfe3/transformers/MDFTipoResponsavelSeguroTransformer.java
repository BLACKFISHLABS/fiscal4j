package br.indie.fiscal4j.mdfe3.transformers;

import br.indie.fiscal4j.mdfe3.classes.def.MDFTipoResponsavelSeguro;
import org.simpleframework.xml.transform.Transform;

public class MDFTipoResponsavelSeguroTransformer implements Transform<MDFTipoResponsavelSeguro> {

    @Override
    public MDFTipoResponsavelSeguro read(String value) throws Exception {
        return MDFTipoResponsavelSeguro.valueOfCodigo(value);
    }

    @Override
    public String write(MDFTipoResponsavelSeguro value) throws Exception {
        return value.getCodigo();
    }
}
