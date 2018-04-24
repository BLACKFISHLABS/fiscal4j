package br.indie.fiscal4j.cte200.classes.cte;

import br.indie.fiscal4j.DFBase;
import org.simpleframework.xml.Element;

public class CTInfoTomadorNaoICMS extends DFBase {
    private static final long serialVersionUID = 6237954593598100438L;

    @Element(name = "refCteAnu")
    private String chaveAcessoCteAnulacao;

    public String getChaveAcessoCteAnulacao() {
        return this.chaveAcessoCteAnulacao;
    }

    public void setChaveAcessoCteAnulacao(final String chaveAcessoCteAnulacao) {
        this.chaveAcessoCteAnulacao = chaveAcessoCteAnulacao;
    }

}
