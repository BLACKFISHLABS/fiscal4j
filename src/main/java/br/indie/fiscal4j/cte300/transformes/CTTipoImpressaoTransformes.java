package br.indie.fiscal4j.cte300.transformes;

import br.indie.fiscal4j.cte300.classes.CTTipoImpressao;
import org.simpleframework.xml.transform.Transform;

public class CTTipoImpressaoTransformes implements Transform<CTTipoImpressao> {

    @Override
    public CTTipoImpressao read(String arg0) {
        return CTTipoImpressao.valueOfCodigo(arg0);
    }

    @Override
    public String write(CTTipoImpressao arg0) {
        return arg0.getCodigo();
    }
}