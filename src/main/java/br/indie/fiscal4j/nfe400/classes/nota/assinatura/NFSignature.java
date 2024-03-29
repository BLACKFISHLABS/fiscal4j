package br.indie.fiscal4j.nfe400.classes.nota.assinatura;

import br.indie.fiscal4j.DFBase;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;

@Namespace(reference = "http://www.w3.org/2000/09/xmldsig#")
public class NFSignature extends DFBase {
    private static final long serialVersionUID = 4057860940440076358L;

    @Attribute(name = "Id", required = false)
    private String id;

    @Element(name = "SignedInfo", required = false)
    private NFSignedInfo signedInfo;

    @Element(name = "SignatureValue", required = false)
    private String signatureValue;

    @Element(name = "KeyInfo", required = false)
    private NFKeyInfo keyInfo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NFSignedInfo getSignedInfo() {
        return this.signedInfo;
    }

    public void setSignedInfo(final NFSignedInfo signedInfo) {
        this.signedInfo = signedInfo;
    }

    public String getSignatureValue() {
        return this.signatureValue;
    }

    public void setSignatureValue(final String signatureValue) {
        this.signatureValue = signatureValue;
    }

    public NFKeyInfo getKeyInfo() {
        return this.keyInfo;
    }

    public void setKeyInfo(final NFKeyInfo keyInfo) {
        this.keyInfo = keyInfo;
    }
}