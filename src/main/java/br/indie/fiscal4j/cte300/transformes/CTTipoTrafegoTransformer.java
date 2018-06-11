package br.indie.fiscal4j.cte300.transformes;

import br.indie.fiscal4j.cte300.classes.CTTipoTrafego;
import org.simpleframework.xml.transform.Transform;

public class CTTipoTrafegoTransformer implements Transform<CTTipoTrafego> {

	@Override
    public CTTipoTrafego read(String arg0) {
		// TODO Auto-generated method stub
		return CTTipoTrafego.valueOfCodigo(arg0);
	}

	@Override
    public String write(CTTipoTrafego arg0) {
		// TODO Auto-generated method stub
		return arg0.getCodigo();
	}

}
