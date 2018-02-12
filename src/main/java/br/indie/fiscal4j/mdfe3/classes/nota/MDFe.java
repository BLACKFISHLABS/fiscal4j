package br.indie.fiscal4j.mdfe3.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.nfe310.classes.nota.assinatura.NFSignature;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "MDFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/mdfe")
public class MDFe extends DFBase {

    public static final String VERSAO = "3.00";

    @Element(name = "infMDFe")
    private MDFInfo info;

    @Element(name = "Signature", required = false)
    private NFSignature assinatura;

    public MDFInfo getInfo() {
        return info;
    }

    public void setInfo(MDFInfo info) {
        this.info = info;
    }

    public NFSignature getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(NFSignature assinatura) {
        this.assinatura = assinatura;
    }
}