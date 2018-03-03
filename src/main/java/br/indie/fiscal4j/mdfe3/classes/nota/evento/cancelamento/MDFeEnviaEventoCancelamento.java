package br.indie.fiscal4j.mdfe3.classes.nota.evento.cancelamento;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "evCancMDFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/mdfe")
public class MDFeEnviaEventoCancelamento extends DFBase {

    @Element(name = "descEvento")
    private String descricaoEvento = "Cancelamento";

    @Element(name = "nProt")
    private String protocoloAutorizacao;

    @Element(name = "xJust")
    private String justificativa;


    public void setJustificativa(final String justificativa) {
        StringValidador.tamanho15a256(justificativa, "Justificativa");
        this.justificativa = justificativa;
    }

    public void setProtocoloAutorizacao(final String protocoloAutorizacao) {
        StringValidador.exatamente15N(protocoloAutorizacao, "Protocolo de Autorizacao");
        this.protocoloAutorizacao = protocoloAutorizacao;
    }

    public String getJustificativa() {
        return this.justificativa;
    }

    public String getProtocoloAutorizacao() {
        return this.protocoloAutorizacao;
    }

    public void setDescricaoEvento(final String descricaoEvento) {
        String defaultValue = "Cancelamento";
        StringValidador.tamanho12(descricaoEvento, defaultValue);
        StringValidador.equals(defaultValue, descricaoEvento);
        this.descricaoEvento = descricaoEvento;
    }

    public String getDescricaoEvento() {
        return this.descricaoEvento;
    }

}