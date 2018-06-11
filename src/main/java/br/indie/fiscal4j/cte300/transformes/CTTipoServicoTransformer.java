package br.indie.fiscal4j.cte300.transformes;

import br.indie.fiscal4j.cte300.classes.CTTipoServico;
import org.simpleframework.xml.transform.Transform;

public class CTTipoServicoTransformer implements Transform<CTTipoServico> {

    @Override
    public CTTipoServico read(String arg0) {
        // TODO Auto-generated method stub
        return CTTipoServico.valueOfCodigo(arg0);
    }

    @Override
    public String write(CTTipoServico arg0) {
        // TODO Auto-generated method stub
        return arg0.getCodigo();
    }

}
