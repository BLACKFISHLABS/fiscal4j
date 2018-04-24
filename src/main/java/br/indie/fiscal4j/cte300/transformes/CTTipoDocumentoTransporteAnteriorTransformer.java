package br.indie.fiscal4j.cte300.transformes;

import br.indie.fiscal4j.cte300.classes.CTTipoDocumentoTransporteAnterior;
import org.simpleframework.xml.transform.Transform;

public class CTTipoDocumentoTransporteAnteriorTransformer implements Transform<CTTipoDocumentoTransporteAnterior> {

    @Override
    public CTTipoDocumentoTransporteAnterior read(String arg0) throws Exception {
        // TODO Auto-generated method stub
        return CTTipoDocumentoTransporteAnterior.valueOfCodigo(arg0);
    }

    @Override
    public String write(CTTipoDocumentoTransporteAnterior arg0) throws Exception {
        // TODO Auto-generated method stub
        return arg0.getCodigo();
    }

}
