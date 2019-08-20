package br.indie.fiscal4j.nfe400.classes;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import br.indie.fiscal4j.DFBase;

@Root(name = "protNFe")
public class NFProtocolo extends DFBase {
    private static final long serialVersionUID = -784305871769382618L;

    @Attribute(name = "versao", required = false)
    private String versao;

    @Element(name = "infProt")
    private NFProtocoloInfo protocoloInfo;

    public void setVersao(final String versao) {
        this.versao = versao;
    }

    public void setProtocoloInfo(final NFProtocoloInfo protocoloInfo) {
        this.protocoloInfo = protocoloInfo;
    }

    public NFProtocoloInfo getProtocoloInfo() {
        return this.protocoloInfo;
    }

    public String getVersao() {
        return this.versao;
    }
}