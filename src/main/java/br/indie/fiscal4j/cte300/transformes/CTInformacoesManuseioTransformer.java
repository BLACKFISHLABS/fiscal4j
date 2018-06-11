package br.indie.fiscal4j.cte300.transformes;

import br.indie.fiscal4j.cte300.classes.CTInformacoesManuseio;
import org.simpleframework.xml.transform.Transform;

public class CTInformacoesManuseioTransformer implements Transform<CTInformacoesManuseio> {

    @Override
    public CTInformacoesManuseio read(String arg0) {
        // TODO Auto-generated method stub
        return CTInformacoesManuseio.valueOfCodigo(arg0);
    }

    @Override
    public String write(CTInformacoesManuseio arg0) {
        // TODO Auto-generated method stub
        return arg0.getCodigo();
    }

}
