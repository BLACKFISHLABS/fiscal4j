package br.indie.fiscal4j.nfe400.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Element;

public class NFNotaInfoLacre extends DFBase {
    private static final long serialVersionUID = -5184684979849337146L;

    @Element(name = "nLacre")
    private String numeroLacres;

    public void setNumeroLacre(final String numeroLacres) {
        StringValidador.tamanho60(numeroLacres, "Numero Lacre");
        this.numeroLacres = numeroLacres;
    }

    public String getNumeroLacres() {
        return this.numeroLacres;
    }
}