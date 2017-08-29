package br.indie.fiscal4j.classes.nota.assinatura;

import br.indie.fiscal4j.classes.NFBase;
import org.simpleframework.xml.Element;

public class NFSignedInfo extends NFBase {

    @Element(name = "CanonicalizationMethod", required = false)
    private NFCanonicalizationMethod canonicalizationMethod;

    @Element(name = "SignatureMethod", required = false)
    private NFSignatureMethod signatureMethod;

    @Element(name = "Reference", required = false)
    private NFReference reference;

    public NFCanonicalizationMethod getCanonicalizationMethod() {
        return this.canonicalizationMethod;
    }

    public void setCanonicalizationMethod(final NFCanonicalizationMethod canonicalizationMethod) {
        this.canonicalizationMethod = canonicalizationMethod;
    }

    public NFSignatureMethod getSignatureMethod() {
        return this.signatureMethod;
    }

    public void setSignatureMethod(final NFSignatureMethod signatureMethod) {
        this.signatureMethod = signatureMethod;
    }

    public NFReference getReference() {
        return this.reference;
    }

    public void setReference(final NFReference reference) {
        this.reference = reference;
    }
}