package br.indie.fiscal4j.mdfe3.classes.nota.evento;

import org.simpleframework.xml.Element;

import br.indie.fiscal4j.DFBase;

/**
 * Created by Eldevan Nery Junior on 17/11/17.
 */
public class MDFeEnviaEventoRegistroPassagemAutomatica extends DFBase {
    private static final long serialVersionUID = 1116018734443127135L;

    @Element(name = "descEvento")
    private String descricaoEvento;

    @Element(name = "tpTransm")
    private String tpTransm;

    @Element(name = "infPass")
    private MDFeEnviaEventoRegistroPassagemAutomaticaInfPass infPass;

    public String getDescricaoEvento() {
        return this.descricaoEvento;
    }

    public void setDescricaoEvento(final String descricaoEvento) {
        this.descricaoEvento = descricaoEvento;
    }

    public String getTpTransm() {
        return this.tpTransm;
    }

    public void setTpTransm(final String tpTransm) {
        this.tpTransm = tpTransm;
    }

    public MDFeEnviaEventoRegistroPassagemAutomaticaInfPass getInfPass() {
        return this.infPass;
    }

    public void setInfPass(final MDFeEnviaEventoRegistroPassagemAutomaticaInfPass infPass) {
        this.infPass = infPass;
    }
}
