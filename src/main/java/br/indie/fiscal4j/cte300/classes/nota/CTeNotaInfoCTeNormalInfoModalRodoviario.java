package br.indie.fiscal4j.cte300.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.ListValidador;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * @author Caio
 * @info Informações do modal Rodoviário
 */

@Root(name = "rodo")
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTeNotaInfoCTeNormalInfoModalRodoviario extends DFBase {
    private static final long serialVersionUID = 4068566294432201656L;

    @Element(name = "RNTRC")
    private String rntrc;

    @ElementList(name = "occ", inline = true, required = false)
    private List<CTeNotaInfoCTeNormalInfoModalRodoviarioOrdemColetaAssociadas> ordemColetaAssociadas;

    public CTeNotaInfoCTeNormalInfoModalRodoviario() {
        this.rntrc = null;
        this.ordemColetaAssociadas = null;
    }

    public String getRntrc() {
        return this.rntrc;
    }

    /**
     * Registro Nacional de Transportadores Rodoviários de Carga<br>
     * Registro obrigatório do emitente do CT-e junto à ANTT para exercer a atividade de transportador rodoviário de cargas por conta de terceiros e mediante remuneração.
     */
    public void setRntrc(final String rntrc) {
        StringValidador.exatamente8(rntrc, "Registro Nacional de Transportadores Rodoviários de Carga");
        this.rntrc = rntrc;
    }

    public List<CTeNotaInfoCTeNormalInfoModalRodoviarioOrdemColetaAssociadas> getOrdemColetaAssociadas() {
        return this.ordemColetaAssociadas;
    }

    /**
     * Ordens de Coleta associados
     */
    public void setOrdemColetaAssociadas(final List<CTeNotaInfoCTeNormalInfoModalRodoviarioOrdemColetaAssociadas> ordemColetaAssociadas) {
        ListValidador.tamanho10(ordemColetaAssociadas, "Ordens de Coleta associados");
        this.ordemColetaAssociadas = ordemColetaAssociadas;
    }
}
