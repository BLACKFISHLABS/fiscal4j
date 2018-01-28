package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.nfe310.classes.nota.assinatura.NFSignature;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "NFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class NFNota extends DFBase {
    private static final long serialVersionUID = -6327121382813587248L;

    private long identificadorLocal;

    @Element(name = "infNFe")
    private NFNotaInfo info;

    @Element(name = "infNFeSupl", required = false)
    private NFNotaInfoSuplementar infoSuplementar;

    @Element(name = "Signature", required = false)
    private NFSignature assinatura;

    public NFNotaInfo getInfo() {
        return this.info;
    }

    public void setInfo(final NFNotaInfo info) {
        this.info = info;
    }

    public NFNotaInfoSuplementar getInfoSuplementar() {
        return this.infoSuplementar;
    }

    public void setInfoSuplementar(final NFNotaInfoSuplementar infoSuplementar) {
        this.infoSuplementar = infoSuplementar;
    }

    public long getIdentificadorLocal() {
        return this.identificadorLocal;
    }

    /**
     * Utilizado para identificacao interna do sistema
     *
     * @param identificadorLocal Identificador.
     */
    public void setIdentificadorLocal(final long identificadorLocal) {
        this.identificadorLocal = identificadorLocal;
    }

    public NFSignature getAssinatura() {
        return this.assinatura;
    }

    public void setAssinatura(final NFSignature assinatura) {
        this.assinatura = assinatura;
    }
}