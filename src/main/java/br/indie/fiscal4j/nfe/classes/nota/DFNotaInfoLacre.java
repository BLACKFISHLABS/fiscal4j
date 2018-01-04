package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.nfe.validadores.StringValidador;
import org.simpleframework.xml.Element;

public class DFNotaInfoLacre extends DFBase {
    @Element(name = "nLacre", required = true)
    private String numeroLacres;

    public void setNumeroLacre(final String numeroLacres) {
        StringValidador.tamanho60(numeroLacres, "Numero Lacre");
        this.numeroLacres = numeroLacres;
    }

    public String getNumeroLacres() {
        return this.numeroLacres;
    }
}