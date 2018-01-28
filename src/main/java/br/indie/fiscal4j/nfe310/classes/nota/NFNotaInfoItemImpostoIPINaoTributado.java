package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.nfe310.classes.NFNotaInfoSituacaoTributariaIPI;
import org.simpleframework.xml.Element;

public class NFNotaInfoItemImpostoIPINaoTributado extends DFBase {
    private static final long serialVersionUID = 6499358432906573487L;

    @Element(name = "CST", required = true)
    private NFNotaInfoSituacaoTributariaIPI situacaoTributaria;

    public NFNotaInfoItemImpostoIPINaoTributado() {
        this.situacaoTributaria = null;
    }

    public NFNotaInfoSituacaoTributariaIPI getSituacaoTributaria() {
        return this.situacaoTributaria;
    }

    public void setSituacaoTributaria(final NFNotaInfoSituacaoTributariaIPI situacaoTributaria) {
        this.situacaoTributaria = situacaoTributaria;
    }
}