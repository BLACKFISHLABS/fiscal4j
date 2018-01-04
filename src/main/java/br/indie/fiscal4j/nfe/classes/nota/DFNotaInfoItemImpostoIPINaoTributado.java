package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.nfe.classes.NFNotaInfoSituacaoTributariaIPI;
import org.simpleframework.xml.Element;

public class DFNotaInfoItemImpostoIPINaoTributado extends DFBase {

    @Element(name = "CST", required = true)
    private NFNotaInfoSituacaoTributariaIPI situacaoTributaria;

    public DFNotaInfoItemImpostoIPINaoTributado() {
        this.situacaoTributaria = null;
    }

    public void setSituacaoTributaria(final NFNotaInfoSituacaoTributariaIPI situacaoTributaria) {
        this.situacaoTributaria = situacaoTributaria;
    }

    public NFNotaInfoSituacaoTributariaIPI getSituacaoTributaria() {
        return this.situacaoTributaria;
    }
}