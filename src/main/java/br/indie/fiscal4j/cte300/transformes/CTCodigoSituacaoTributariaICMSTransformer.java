package br.indie.fiscal4j.cte300.transformes;

import br.indie.fiscal4j.cte300.classes.CTCodigoSituacaoTributariaICMS;
import org.simpleframework.xml.transform.Transform;

public class CTCodigoSituacaoTributariaICMSTransformer implements Transform<CTCodigoSituacaoTributariaICMS> {

    @Override
    public CTCodigoSituacaoTributariaICMS read(String arg0) {
        // TODO Auto-generated method stub
        return CTCodigoSituacaoTributariaICMS.valueOfCodigo(arg0);
    }

    @Override
    public String write(CTCodigoSituacaoTributariaICMS arg0) {
        // TODO Auto-generated method stub
        return arg0.getCodigo();
    }

}
