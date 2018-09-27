package br.indie.fiscal4j.cte200.classes.cte;

import br.indie.fiscal4j.DFBase;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

public class CTProtocolo extends DFBase {
    private static final long serialVersionUID = -8180971313952866825L;

    @Attribute(name = "versao")
    private String versao;

    @Element(name = "infProt")
    private CTProtocoloInfo infProt;

    @Element(name = "Signature", required = false)
    private String signature;

    public String getVersao() {
        return this.versao;
    }

    public void setVersao(final String versao) {
        this.versao = versao;
    }

    public CTProtocoloInfo getInfProt() {
        return this.infProt;
    }

    public void setInfProt(final CTProtocoloInfo infProt) {
        this.infProt = infProt;
    }

    public String getSignature() {
        return this.signature;
    }

    public void setSignature(final String signature) {
        this.signature = signature;
    }

}
