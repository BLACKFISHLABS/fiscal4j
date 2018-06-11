package br.indie.fiscal4j.cte200.transformers;

import br.indie.fiscal4j.cte200.classes.CTTipoDocumentoTransporteAnterior;
import org.simpleframework.xml.transform.Transform;

public class CTTipoDocumentoTransporteAnteriorTransformer implements Transform<CTTipoDocumentoTransporteAnterior> {

    @Override
    public CTTipoDocumentoTransporteAnterior read(final String codigo) {
        return CTTipoDocumentoTransporteAnterior.valueOfCodigo(codigo);
    }

    @Override
    public String write(final CTTipoDocumentoTransporteAnterior tipo) {
        return tipo.getCodigo();
    }
}