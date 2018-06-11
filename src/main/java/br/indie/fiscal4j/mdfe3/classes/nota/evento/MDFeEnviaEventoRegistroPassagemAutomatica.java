package br.indie.fiscal4j.mdfe3.classes.nota.evento;

import br.indie.fiscal4j.DFBase;
import org.simpleframework.xml.Element;

/**
 * Created by Eldevan Nery Junior on 17/11/17.
 */
public class MDFeEnviaEventoRegistroPassagemAutomatica extends DFBase{

    @Element(name = "descEvento")
    private String descricaoEvento;

    @Element(name = "tpTransm")
    private String tpTransm;

    @Element(name = "infPass")
    private MDFeEnviaEventoRegistroPassagemAutomaticaInfPass infPass;

    public String getDescricaoEvento() {
        return descricaoEvento;
    }

    public void setDescricaoEvento(String descricaoEvento) {
        this.descricaoEvento = descricaoEvento;
    }

    public String getTpTransm() {
        return tpTransm;
    }

    public void setTpTransm(String tpTransm) {
        this.tpTransm = tpTransm;
    }

    public MDFeEnviaEventoRegistroPassagemAutomaticaInfPass getInfPass() {
        return infPass;
    }

    public void setInfPass(MDFeEnviaEventoRegistroPassagemAutomaticaInfPass infPass) {
        this.infPass = infPass;
    }
}
