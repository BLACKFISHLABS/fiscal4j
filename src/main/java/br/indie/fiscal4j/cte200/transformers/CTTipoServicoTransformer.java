package br.indie.fiscal4j.cte200.transformers;

import br.indie.fiscal4j.cte200.classes.CTTipoServico;
import org.simpleframework.xml.transform.Transform;

public class CTTipoServicoTransformer implements Transform<CTTipoServico> {

    @Override
    public CTTipoServico read(final String codigo) throws Exception {
        return CTTipoServico.valueOfCodigo(codigo);
    }

    @Override
    public String write(final CTTipoServico tipo) throws Exception {
        return tipo.getCodigo();
    }
}