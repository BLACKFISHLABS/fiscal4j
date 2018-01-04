package br.indie.fiscal4j.nfe.classes.evento.cartacorrecao;

import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.nfe.classes.evento.NFEvento;
import br.indie.fiscal4j.nfe.classes.evento.NFEventoRetorno;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "procEventoNFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class NFProtocoloEventoCartaCorrecao extends DFBase {

    @Attribute(name = "versao", required = true)
    private String versao;

    @Element(name = "evento", required = true)
    private NFEvento evento;

    @Element(name = "retEvento", required = true)
    private NFEventoRetorno eventoRetorno;

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public NFEvento getEvento() {
        return evento;
    }

    public void setEvento(NFEvento evento) {
        this.evento = evento;
    }

    public NFEventoRetorno getEventoRetorno() {
        return eventoRetorno;
    }

    public void setEventoRetorno(NFEventoRetorno eventoRetorno) {
        this.eventoRetorno = eventoRetorno;
    }

}