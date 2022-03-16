package br.indie.fiscal4j.cte300.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.DFStringValidador;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * @author Caio
 * @info Campo de uso livre do contribuinte
 */

@Root(name = "ObsCont")
public class CTeNotaInfoDadosComplementaresObservacaoContribuinte extends DFBase {
    private static final long serialVersionUID = -7797475815166947317L;

    @Attribute(name = "xCampo")
    private String campo;

    @Element(name = "xTexto")
    private String texto;

    public CTeNotaInfoDadosComplementaresObservacaoContribuinte() {
        this.campo = null;
        this.texto = null;
    }

    public String getCampo() {
        return this.campo;
    }

    /**
     * Identificação do campo
     */
    public void setCampo(final String campo) {
        DFStringValidador.tamanho20(campo, "Identificação do campo");
        this.campo = campo;
    }

    public String getTexto() {
        return this.texto;
    }

    /**
     * Identificação do texto
     */
    public void setTexto(final String texto) {
        DFStringValidador.tamanho160(texto, "Identificação do texto");
        this.texto = texto;
    }
}
