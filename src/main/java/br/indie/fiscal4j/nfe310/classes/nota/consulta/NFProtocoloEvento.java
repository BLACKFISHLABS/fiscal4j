package br.indie.fiscal4j.nfe310.classes.nota.consulta;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.nfe310.classes.evento.NFEvento;
import br.indie.fiscal4j.nfe310.classes.evento.NFEventoRetorno;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "procEventoNFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class NFProtocoloEvento extends DFBase {
    private static final long serialVersionUID = -1075773716893722198L;

    @Attribute(name = "versao")
    private String versao;

    @Element(name = "evento")
    private NFEvento evento;

    @Element(name = "retEvento")
    private NFEventoRetorno eventoRetorno;

    public NFEvento getEvento() {
        return this.evento;
    }

    public void setEvento(final NFEvento evento) {
        this.evento = evento;
    }

    public NFEventoRetorno getInfoEventoRetorno() {
        return this.eventoRetorno;
    }

    public void setEventoRetorno(final NFEventoRetorno infoEventoRetorno) {
        this.eventoRetorno = infoEventoRetorno;
    }

    public String getVersao() {
        return this.versao;
    }

    public void setVersao(final String versao) {
        this.versao = versao;
    }
}