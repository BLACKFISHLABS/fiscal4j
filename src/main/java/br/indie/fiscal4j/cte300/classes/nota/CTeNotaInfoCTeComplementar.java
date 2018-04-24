package br.indie.fiscal4j.cte300.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * @author Caio
 * @info Detalhamento do CT-e complementado
 */

@Root(name = "infCteComp")
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTeNotaInfoCTeComplementar extends DFBase {
    private static final long serialVersionUID = -5820790322163765078L;
    @Element(name = "chCTe", required = true)
    private String chave;

    public CTeNotaInfoCTeComplementar() {
        this.chave = null;
    }

    public String getChave() {
        return this.chave;
    }

    /**
     * Chave do CT-e complementado
     */
    public void setChave(final String chave) {
        StringValidador.exatamente44N(chave, "Chave do CT-e complementado");
        this.chave = chave;
    }
}
