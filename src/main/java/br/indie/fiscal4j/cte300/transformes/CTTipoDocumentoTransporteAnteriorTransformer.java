package br.indie.fiscal4j.cte300.transformes;

import br.indie.fiscal4j.cte300.classes.CTTipoDocumentoTransporteAnterior;
import org.simpleframework.xml.transform.Transform;

public class CTTipoDocumentoTransporteAnteriorTransformer implements Transform<CTTipoDocumentoTransporteAnterior> {

    @Override
    public CTTipoDocumentoTransporteAnterior read(String arg0) {
        return CTTipoDocumentoTransporteAnterior.valueOfCodigo(arg0);
    }

    @Override
    public String write(CTTipoDocumentoTransporteAnterior arg0) {
        return arg0.getCodigo();
    }
}