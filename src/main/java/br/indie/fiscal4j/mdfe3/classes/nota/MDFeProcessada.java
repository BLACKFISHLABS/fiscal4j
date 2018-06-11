package br.indie.fiscal4j.mdfe3.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.mdfe3.classes.MDFProtocolo;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "mdfeProc")
@Namespace(reference = "http://www.portalfiscal.inf.br/mdfe")
public class MDFeProcessada extends DFBase {
    private static final long serialVersionUID = 201803031531L;

    @Element(name = "MDFe")
    private MDFe mdFe;
    @Element(name = "protMDFe")
    private MDFProtocolo protMDFe;
    @Attribute(name = "versao")
    private String versao;
    @Attribute(name = "ipTransmissor")
    private String ipTransmissor;

    public MDFe getMdFe() {
        return mdFe;
    }

    public void setMdFe(MDFe mdFe) {
        this.mdFe = mdFe;
    }

    public MDFProtocolo getProtMDFe() {
        return protMDFe;
    }

    public void setProtMDFe(MDFProtocolo protMDFe) {
        this.protMDFe = protMDFe;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getIpTransmissor() {
        return ipTransmissor;
    }

    public void setIpTransmissor(String ipTransmissor) {
        this.ipTransmissor = ipTransmissor;
    }

}