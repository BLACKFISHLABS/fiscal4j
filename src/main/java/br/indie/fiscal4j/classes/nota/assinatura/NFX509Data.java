package br.indie.fiscal4j.classes.nota.assinatura;

import br.indie.fiscal4j.classes.NFBase;
import org.simpleframework.xml.Element;

public class NFX509Data extends NFBase {

    @Element(name = "X509Certificate", required = false)
    private String x509certificate;

    public String getX509certificate() {
        return this.x509certificate;
    }

    public void setX509certificate(final String x509certificate) {
        this.x509certificate = x509certificate;
    }
}