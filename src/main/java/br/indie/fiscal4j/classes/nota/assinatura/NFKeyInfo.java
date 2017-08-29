package br.indie.fiscal4j.classes.nota.assinatura;

import br.indie.fiscal4j.classes.NFBase;
import org.simpleframework.xml.Element;

public class NFKeyInfo extends NFBase {

    @Element(name = "X509Data", required = false)
    private NFX509Data data;

    public NFX509Data getData() {
        return this.data;
    }

    public void setData(final NFX509Data data) {
        this.data = data;
    }
}