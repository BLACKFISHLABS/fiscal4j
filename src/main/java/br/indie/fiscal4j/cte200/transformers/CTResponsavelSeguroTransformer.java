package br.indie.fiscal4j.cte200.transformers;

import br.indie.fiscal4j.cte200.classes.CTResponsavelSeguro;
import org.simpleframework.xml.transform.Transform;

public class CTResponsavelSeguroTransformer implements Transform<CTResponsavelSeguro> {

    @Override
    public CTResponsavelSeguro read(final String codigo) throws Exception {
        return CTResponsavelSeguro.valueOfCodigo(codigo);
    }

    @Override
    public String write(final CTResponsavelSeguro tipo) throws Exception {
        return tipo.getCodigo();
    }
}