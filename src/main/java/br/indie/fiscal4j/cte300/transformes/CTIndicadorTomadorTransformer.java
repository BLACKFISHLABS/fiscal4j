package br.indie.fiscal4j.cte300.transformes;

import br.indie.fiscal4j.cte300.classes.CTIndicadorTomador;
import org.simpleframework.xml.transform.Transform;

public class CTIndicadorTomadorTransformer implements Transform<CTIndicadorTomador> {

    @Override
    public CTIndicadorTomador read(String arg0) throws Exception {
        // TODO Auto-generated method stub
        return CTIndicadorTomador.valueOfCodigo(arg0);
    }

    @Override
    public String write(CTIndicadorTomador arg0) throws Exception {
        // TODO Auto-generated method stub
        return arg0.getCodigo();
    }

}
