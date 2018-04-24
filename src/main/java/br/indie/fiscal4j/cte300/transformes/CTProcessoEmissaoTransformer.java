package br.indie.fiscal4j.cte300.transformes;

import br.indie.fiscal4j.cte300.classes.CTProcessoEmissao;
import org.simpleframework.xml.transform.Transform;

public class CTProcessoEmissaoTransformer implements Transform<CTProcessoEmissao> {

    @Override
    public CTProcessoEmissao read(String arg0) throws Exception {
        // TODO Auto-generated method stub
        return CTProcessoEmissao.valueOfCodigo(arg0);
    }

    @Override
    public String write(CTProcessoEmissao arg0) throws Exception {
        // TODO Auto-generated method stub
        return arg0.getCodigo();
    }

}
