package br.indie.fiscal4j.mdfe3.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.nfe310.classes.nota.assinatura.NFSignature;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * Created by Eldevan Nery Junior on 03/11/17. Tipo Manifesto de Documentos Fiscais Eletrônicos.
 */
@Root(name = "MDFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/mdfe")
public class MDFe extends DFBase {
    private static final long serialVersionUID = -4082665506491508726L;

    public static final String VERSAO = "3.00";

    @Element(name = "infMDFe")
    private MDFInfo info;

    @Element(name = "Signature", required = false)
    private NFSignature assinatura;

    public MDFInfo getInfo() {
        return this.info;
    }

    public void setInfo(final MDFInfo info) {
        this.info = info;
    }

    public NFSignature getAssinatura() {
        return this.assinatura;
    }

    public void setAssinatura(final NFSignature assinatura) {
        this.assinatura = assinatura;
    }
}