package br.indie.fiscal4j.cte300.transformes;

import br.indie.fiscal4j.cte300.classes.CTClasseTarifa;
import org.simpleframework.xml.transform.Transform;

public class CTClasseTarifaTransformer implements Transform<CTClasseTarifa> {

    @Override
    public CTClasseTarifa read(String arg0) throws Exception {
        // TODO Auto-generated method stub
        return CTClasseTarifa.valueOfCodigo(arg0);
    }

    @Override
    public String write(CTClasseTarifa arg0) throws Exception {
        // TODO Auto-generated method stub
        return arg0.getCodigo();
    }

}
