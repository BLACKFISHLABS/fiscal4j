package br.indie.fiscal4j.nfe310.classes.evento.cancelamento;

import br.indie.fiscal4j.nfe310.classes.evento.NFTipoEvento;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Element;

public class NFInfoCancelamento extends NFTipoEvento {
    private static final long serialVersionUID = 7427073073940993756L;

    @Element(name = "nProt", required = true)
    private String protocoloAutorizacao;

    @Element(name = "xJust", required = true)
    private String justificativa;

    public String getJustificativa() {
        return this.justificativa;
    }

    public void setJustificativa(final String justificativa) {
        StringValidador.tamanho15a256(justificativa, "Justificativa");
        this.justificativa = justificativa;
    }

    public String getProtocoloAutorizacao() {
        return this.protocoloAutorizacao;
    }

    public void setProtocoloAutorizacao(final String protocoloAutorizacao) {
        StringValidador.exatamente15N(protocoloAutorizacao, "Protocolo de Autorizacao");
        this.protocoloAutorizacao = protocoloAutorizacao;
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