package br.indie.fiscal4j.cte300.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * @author Jeferson Cruz
 * @info Informações do CT-e Globalizado
 */

@Root(name = "infGlobalizado")
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTeNotaInfoCTeNormalInfoGlobalizado extends DFBase {
    private static final long serialVersionUID = -2117514135660749569L;

    @Element(name = "xObs", required = true)
    private String Observacao;

    public CTeNotaInfoCTeNormalInfoGlobalizado() {
        this.Observacao = null;
    }

    public String getObservacao() {
        return this.Observacao;
    }

    /**
     * Preencher com informações adicionais, legislação do regime especial, etc
     */
    public void setObservacao(final String observacao) {
        StringValidador.tamanho15a256(observacao, "Preencher com informações adicionais, legislação do regime especial, etc");
        this.Observacao = observacao;
    }
}
