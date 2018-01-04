package br.indie.fiscal4j.nfe.classes.nota.assinatura;

import br.indie.fiscal4j.common.DFBase;
import org.simpleframework.xml.Element;

public class DFSignedInfo extends DFBase {

    @Element(name = "CanonicalizationMethod", required = false)
    private NFCanonicalizationMethod canonicalizationMethod;

    @Element(name = "SignatureMethod", required = false)
    private NFSignatureMethod signatureMethod;

    @Element(name = "Reference", required = false)
    private DFReference reference;

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

    public DFReference getReference() {
        return this.reference;
    }

    public void setReference(final DFReference reference) {
        this.reference = reference;
    }
}