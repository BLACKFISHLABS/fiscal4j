package br.indie.fiscal4j.mdfe3.classes.nota.evento;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoCondutor;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * Created by Edivaldo Merlo Stens on 13/10/18.
 */
@Root(name = " evIncCondutorMDFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/mdfe")
public class MDFeEnviaEventoIncluirCondutor extends DFBase {

    private static final long serialVersionUID = -6894944230355205786L;

    @Element(name = "descEvento")
    private String descricaoEvento = "Inclusao Condutor";

    @Element(name = "condutor")
    private MDFInfoModalRodoviarioVeiculoCondutor condutor;

    public void setDescricaoEvento(final String descricaoEvento) {
        final String defaultValue = "Inclusao Condutor";
        StringValidador.equals(defaultValue, descricaoEvento);
        this.descricaoEvento = descricaoEvento;
    }

    public String getDescricaoEvento() {
        return this.descricaoEvento;
    }

    public MDFInfoModalRodoviarioVeiculoCondutor getCondutor() {
        return condutor;
    }

    public void setCondutor(MDFInfoModalRodoviarioVeiculoCondutor condutor) {
        this.condutor = condutor;
    }

}
