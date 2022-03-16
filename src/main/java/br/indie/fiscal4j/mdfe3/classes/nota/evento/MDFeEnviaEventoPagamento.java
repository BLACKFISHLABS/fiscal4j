package br.indie.fiscal4j.mdfe3.classes.nota.evento;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.mdfe3.classes.nota.MDFInfoModalRodoviarioInfPag;
import br.indie.fiscal4j.mdfe3.classes.nota.MDFInfoModalRodoviarioInfViagens;
import br.indie.fiscal4j.validadores.DFStringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * No manual o nome da tag root é evPagtoMDFe, mas no xsd está evPagtoOperMDFe.
 * Verificar se vai haver uma correção no futuro.
 * Created by Edivaldo Merlo Stens on 29/06/20.
 */
@Root(name = "evPagtoOperMDFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/mdfe")
public class MDFeEnviaEventoPagamento extends DFBase {

    private static final long serialVersionUID = -6894944230355205787L;

    @Element(name = "descEvento")
    private String descricaoEvento = "Pagamento Operação MDF-e";

    @Element(name = "nProt")
    private String nProt;

    @ElementList(entry = "infViagens", inline = true, required = true)
    protected List<MDFInfoModalRodoviarioInfViagens> infViagens;

    @ElementList(entry = "infPag", inline = true, required = true)
    protected List<MDFInfoModalRodoviarioInfPag> infPag;

    public void setDescricaoEvento(final String descricaoEvento) {
        final String defaultValue = "Pagamento Operação MDF-e";
        DFStringValidador.equals(defaultValue, descricaoEvento);
        this.descricaoEvento = descricaoEvento;
    }

    public String getDescricaoEvento() {
        return this.descricaoEvento;
    }

    public String getNProt() {
        return nProt;
    }

    public void setNProt(String nProt) {
        this.nProt = nProt;
    }

    public List<MDFInfoModalRodoviarioInfViagens> getInfViagens() {
        return infViagens;
    }

    public void setInfViagens(List<MDFInfoModalRodoviarioInfViagens> infViagens) {
        this.infViagens = infViagens;
    }

    public List<MDFInfoModalRodoviarioInfPag> getInfPag() {
        return infPag;
    }

    public void setInfPag(List<MDFInfoModalRodoviarioInfPag> infPag) {
        this.infPag = infPag;
    }

}
