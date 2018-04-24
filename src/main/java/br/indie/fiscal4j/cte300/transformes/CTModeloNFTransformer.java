package br.indie.fiscal4j.cte300.transformes;

import br.indie.fiscal4j.cte300.classes.CTModeloNF;
import org.simpleframework.xml.transform.Transform;

public class CTModeloNFTransformer implements Transform<CTModeloNF> {

    @Override
    public CTModeloNF read(String arg0) throws Exception {
        // TODO Auto-generated method stub
        return CTModeloNF.valueOfCodigo(arg0);
    }

    @Override
    public String write(CTModeloNF arg0) throws Exception {
        // TODO Auto-generated method stub
        return arg0.getCodigo();
    }

}
