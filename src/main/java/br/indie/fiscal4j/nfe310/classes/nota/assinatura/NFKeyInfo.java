package br.indie.fiscal4j.nfe310.classes.nota.assinatura;

import br.indie.fiscal4j.DFBase;
import org.simpleframework.xml.Element;

public class NFKeyInfo extends DFBase {
    private static final long serialVersionUID = 7949034334524924221L;

    @Element(name = "X509Data", required = false)
    private NFX509Data data;

    public NFX509Data getData() {
        return this.data;
    }

    public void setData(final NFX509Data data) {
        this.data = data;
    }
}