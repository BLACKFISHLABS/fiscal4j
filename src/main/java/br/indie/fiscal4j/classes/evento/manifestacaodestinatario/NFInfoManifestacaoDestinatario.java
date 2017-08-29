package br.indie.fiscal4j.classes.evento.manifestacaodestinatario;

import br.indie.fiscal4j.classes.evento.NFTipoEvento;
import org.simpleframework.xml.Element;

public class NFInfoManifestacaoDestinatario extends NFTipoEvento {

    @Element(name = "xJust", required = false)
    private String justificativa;

    public void setJustificativa(final String justificativa) {
        this.justificativa = justificativa;
    }

    public String getJustificativa() {
        return this.justificativa;
    }

    @Override
    public void setCondicaoUso(final String condicaoUso) {
        throw new UnsupportedOperationException("Evento de cancelamento nao possui condicao de uso");
    }

    @Override
    public void setTextoCorrecao(final String textoCorrecao) {
        throw new UnsupportedOperationException("Evento de cancelamento nao possui texto de correcao");
    }
}