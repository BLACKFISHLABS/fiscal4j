package br.indie.fiscal4j.mdfe3.classes.nota.evento;

import br.indie.fiscal4j.DFBase;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

public class MDFeRetorno extends DFBase {

    @Attribute(name = "versao", required = false)
    private String versao;

    @Element(name = "infEvento")
    private MDFeInfoEventoRetorno eventoRetorno;

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public MDFeInfoEventoRetorno getEventoRetorno() {
        return eventoRetorno;
    }

    public void setEventoRetorno(MDFeInfoEventoRetorno eventoRetorno) {
        this.eventoRetorno = eventoRetorno;
    }
}