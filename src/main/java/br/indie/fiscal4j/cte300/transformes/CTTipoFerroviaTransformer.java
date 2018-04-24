package br.indie.fiscal4j.cte300.transformes;

import br.indie.fiscal4j.cte300.classes.CTTipoFerrovia;
import org.simpleframework.xml.transform.Transform;

public class CTTipoFerroviaTransformer implements Transform<CTTipoFerrovia> {

    @Override
    public CTTipoFerrovia read(String arg0) throws Exception {
        // TODO Auto-generated method stub
        return CTTipoFerrovia.valueOfCodigo(arg0);
    }

    @Override
    public String write(CTTipoFerrovia arg0) throws Exception {
        // TODO Auto-generated method stub
        return arg0.getCodigo();
    }

}
