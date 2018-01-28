package br.indie.fiscal4j.mdfe3.classes.nota;

import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Element;

/**
 * Created by Eldevan Nery Junior on 06/11/17.
 * <p>
 * Numero lacre de 1 a 60 caracteres.
 * <p>
 * Preechimento opcional para os modais Rodoviário e Ferroviário.
 */
public class MDFInfoLacre1A60 {

    /**
     * Número do Lacre
     */
    @Element(name = "nLacre")
    private String numeroDoLacre;

    public String getNumeroDoLacre() {
        return numeroDoLacre;
    }

    public void setNumeroDoLacre(String numeroDoLacre) {
        StringValidador.validaIntervalo(numeroDoLacre, 1, 60, "numero do lacre modal");
        this.numeroDoLacre = numeroDoLacre;
    }
}