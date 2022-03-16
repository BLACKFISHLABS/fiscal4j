package br.indie.fiscal4j.nfe400.classes.evento.averbacaoexportacao;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.nfe400.classes.evento.NFEventoRetorno;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "procEventoNFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class NFProtocoloEventoAverbacaoExportacao extends DFBase {

    private static final long serialVersionUID = -1013510869624617504L;

    @Attribute(name = "versao")
    private String versao;

    @Element(name = "evento")
    private NFEventoAverbacaoExportacao evento;

    @Element(name = "retEvento")
    private NFEventoRetorno eventoRetorno;

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public NFEventoAverbacaoExportacao getEvento() {
        return evento;
    }

    public void setEvento(NFEventoAverbacaoExportacao evento) {
        this.evento = evento;
    }

    public NFEventoRetorno getEventoRetorno() {
        return eventoRetorno;
    }

    public void setEventoRetorno(NFEventoRetorno eventoRetorno) {
        this.eventoRetorno = eventoRetorno;
    }

}
