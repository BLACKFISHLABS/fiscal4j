package br.indie.fiscal4j.nfe.classes.distribuicao;

import br.indie.fiscal4j.DFBase;
import org.simpleframework.xml.Element;

public class NFDistribuicaoConsultaNSU extends DFBase {
    private static final long serialVersionUID = -7083100043003754958L;

    @Element(name = "NSU")
    private String nsu;

    public String getNsu() {
        return this.nsu;
    }

    public NFDistribuicaoConsultaNSU setNsu(final String nsu) {
        this.nsu = nsu;
        return this;
    }

}
