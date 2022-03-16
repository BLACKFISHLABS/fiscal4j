package br.indie.fiscal4j.cte300.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.DFStringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * @author Caio
 * @info Grupo de informações dos lacres dos cointainers da qtde da carga
 */

@Root(name = "lacre")
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTeNotaInfoCTeNormalInfoModalAquaviarioConteinerLacre extends DFBase {
    private static final long serialVersionUID = 7913872502882601577L;

    @Element(name = "nLacre")
    private String numeroLacre;

    public CTeNotaInfoCTeNormalInfoModalAquaviarioConteinerLacre() {
        this.numeroLacre = null;
    }

    public String getNumeroLacre() {
        return this.numeroLacre;
    }

    /**
     * Lacre
     */
    public void setNumeroLacre(final String numeroLacre) {
        DFStringValidador.tamanho20(numeroLacre, "Lacre");
        this.numeroLacre = numeroLacre;
    }
}
