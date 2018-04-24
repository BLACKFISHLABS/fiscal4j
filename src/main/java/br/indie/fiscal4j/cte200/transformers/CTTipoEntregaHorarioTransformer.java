package br.indie.fiscal4j.cte200.transformers;

import br.indie.fiscal4j.cte200.classes.CTTipoEntregaHorario;
import org.simpleframework.xml.transform.Transform;

public class CTTipoEntregaHorarioTransformer implements Transform<CTTipoEntregaHorario> {

    @Override
    public CTTipoEntregaHorario read(final String codigo) throws Exception {
        return CTTipoEntregaHorario.valueOfCodigo(codigo);
    }

    @Override
    public String write(final CTTipoEntregaHorario tipo) throws Exception {
        return tipo.getCodigo();
    }
}