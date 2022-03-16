package br.indie.fiscal4j.nfe310.classes.evento.downloadnf;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.nfe310.classes.NFProtocolo;
import br.indie.fiscal4j.nfe310.classes.nota.NFNota;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "nfeProc")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class Any extends DFBase {
    private static final long serialVersionUID = 4770990764329708815L;

    @Attribute(name = "versao")
    private String versao;

    @Element(name = "NFe", required = false)
    private NFNota nota;

    @Element(name = "protNFe", required = false)
    private NFProtocolo protocolo;

    public Any() {
        this.versao = null;
        this.nota = null;
        this.protocolo = null;
    }

    public String getVersao() {
        return this.versao;
    }

    public void setVersao(final String versao) {
        this.versao = versao;
    }

    public NFNota getNota() {
        return this.nota;
    }

    public void setNota(final NFNota nota) {
        this.nota = nota;
    }

    public NFProtocolo getProtocolo() {
        return this.protocolo;
    }

    public void setProtocolo(final NFProtocolo protocolo) {
        this.protocolo = protocolo;
    }
}
