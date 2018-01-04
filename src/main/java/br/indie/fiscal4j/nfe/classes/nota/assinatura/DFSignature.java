package br.indie.fiscal4j.nfe.classes.nota.assinatura;

import br.indie.fiscal4j.common.DFBase;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;

@Namespace(reference = "http://www.w3.org/2000/09/xmldsig#")
public class DFSignature extends DFBase {

    @Element(name = "SignedInfo", required = false)
    private DFSignedInfo signedInfo;

    @Element(name = "SignatureValue", required = false)
    private String signatureValue;

    @Element(name = "KeyInfo", required = false)
    private DFKeyInfo keyInfo;

    public DFSignedInfo getSignedInfo() {
        return this.signedInfo;
    }

    public void setSignedInfo(final DFSignedInfo signedInfo) {
        this.signedInfo = signedInfo;
    }

    public String getSignatureValue() {
        return this.signatureValue;
    }

    public void setSignatureValue(final String signatureValue) {
        this.signatureValue = signatureValue;
    }

    public DFKeyInfo getKeyInfo() {
        return this.keyInfo;
    }

    public void setKeyInfo(final DFKeyInfo keyInfo) {
        this.keyInfo = keyInfo;
    }
}