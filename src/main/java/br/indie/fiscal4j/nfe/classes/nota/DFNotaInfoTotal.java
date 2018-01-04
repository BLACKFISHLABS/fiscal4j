package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.common.DFBase;
import org.simpleframework.xml.Element;

public class DFNotaInfoTotal extends DFBase {

    @Element(name = "ICMSTot", required = true)
    private DFNotaInfoICMSTotal icmsTotal;

    @Element(name = "ISSQNtot", required = false)
    private DFNotaInfoISSQNTotal issqnTotal;

    @Element(name = "retTrib", required = false)
    private DFNotaInfoRetencoesTributos retencoesTributos;

    public void setIcmsTotal(final DFNotaInfoICMSTotal icmsTotal) {
        this.icmsTotal = icmsTotal;
    }

    public void setIssqnTotal(final DFNotaInfoISSQNTotal issqnTotal) {
        this.issqnTotal = issqnTotal;
    }

    public void setRetencoesTributos(final DFNotaInfoRetencoesTributos retencoesTributos) {
        this.retencoesTributos = retencoesTributos;
    }

    public DFNotaInfoICMSTotal getIcmsTotal() {
        return this.icmsTotal;
    }

    public DFNotaInfoISSQNTotal getIssqnTotal() {
        return this.issqnTotal;
    }

    public DFNotaInfoRetencoesTributos getRetencoesTributos() {
        return this.retencoesTributos;
    }
}