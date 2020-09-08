package br.indie.fiscal4j.mdfe3.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by Eldevan Nery Junior on 01/11/17.
 * <h1>Grupo de informações para Agência Reguladora</h1>
 */
@Root(name = "infANTT")
public class MDFInfoModalRodoviarioANTT extends DFBase {
    private static final long serialVersionUID = -5412043951034386272L;
    /**
     * <h1>Registro Nacional de Transportadores Rodoviários de Carga</h1>
     * <p>
     * Registro obrigatório do emitente do MDF-e junto à ANTT para exercer a atividade de transportador rodoviário de cargas por conta de terceiros e mediante remuneração.
     * </p>
     */
    @Element(name = "RNTRC", required = false)
    private String rntrc;
    /**
     * <h1>Dados do CIOT.</h1>
     */
    @ElementList(entry = "infCIOT", inline = true, required = false)
    private List<MDFInfoModalRodoviarioInfCIOT> infCIOT;
    /**
     * Informações de Vale Pedágio
     */
    @Element(name = "valePed", required = false)
    private MDFInfoModalRodoviarioPedagio valePedagio;

    @ElementList(entry = "infContratante", inline = true, required = false)
    protected List<MDFInfoModalRodoviarioInfContratante> infContratante;

    @ElementList(entry = "infPag", inline = true, required = false)
    protected List<MDFInfoModalRodoviarioInfPag> infPag;

    public String getRntrc() {
        return this.rntrc;
    }

    public void setRntrc(final String rntrc) {
        StringValidador.validador(rntrc, "Registro Nacional de Transportadores Rodoviários de Carga(RNTRC) ", 8, true, true);
        this.rntrc = rntrc;
    }

    public List<MDFInfoModalRodoviarioInfCIOT> getInfCIOT() {
        return this.infCIOT;
    }

    public void setInfCIOT(final List<MDFInfoModalRodoviarioInfCIOT> infCIOT) {
        this.infCIOT = infCIOT;
    }

    public MDFInfoModalRodoviarioPedagio getValePedagio() {
        return this.valePedagio;
    }

    public void setValePedagio(final MDFInfoModalRodoviarioPedagio valePedagio) {
        this.valePedagio = valePedagio;
    }

    public List<MDFInfoModalRodoviarioInfContratante> getInfContratante() {
        return this.infContratante;
    }

    public void setInfContratante(final List<MDFInfoModalRodoviarioInfContratante> infContratante) {
        this.infContratante = infContratante;
    }

    public List<MDFInfoModalRodoviarioInfPag> getInfPag() {
        return infPag;
    }

    public void setInfPag(List<MDFInfoModalRodoviarioInfPag> infPag) {
        this.infPag = infPag;
    }
}
