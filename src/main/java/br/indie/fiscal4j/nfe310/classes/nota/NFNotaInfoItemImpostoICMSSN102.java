package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.nfe310.classes.NFNotaSituacaoOperacionalSimplesNacional;
import br.indie.fiscal4j.nfe310.classes.NFOrigem;
import org.simpleframework.xml.Element;

public class NFNotaInfoItemImpostoICMSSN102 extends DFBase {
    private static final long serialVersionUID = 8991323254446222797L;

    @Element(name = "orig")
    private NFOrigem origem;

    @Element(name = "CSOSN")
    private NFNotaSituacaoOperacionalSimplesNacional situacaoOperacaoSN;

    public void setOrigem(final NFOrigem origem) {
        this.origem = origem;
    }

    public void setSituacaoOperacaoSN(final NFNotaSituacaoOperacionalSimplesNacional situacaoOperacaoSN) {
        this.situacaoOperacaoSN = situacaoOperacaoSN;
    }

    public NFOrigem getOrigem() {
        return this.origem;
    }

    public NFNotaSituacaoOperacionalSimplesNacional getSituacaoOperacaoSN() {
        return this.situacaoOperacaoSN;
    }
}