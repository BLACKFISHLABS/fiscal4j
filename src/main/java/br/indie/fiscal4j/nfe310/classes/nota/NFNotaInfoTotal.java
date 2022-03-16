package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import org.simpleframework.xml.Element;

public class NFNotaInfoTotal extends DFBase {
    private static final long serialVersionUID = 4579495471129802055L;

    @Element(name = "ICMSTot")
    private NFNotaInfoICMSTotal icmsTotal;

    @Element(name = "ISSQNtot", required = false)
    private NFNotaInfoISSQNTotal issqnTotal;

    @Element(name = "retTrib", required = false)
    private NFNotaInfoRetencoesTributos retencoesTributos;

    public void setIcmsTotal(final NFNotaInfoICMSTotal icmsTotal) {
        this.icmsTotal = icmsTotal;
    }

    public void setIssqnTotal(final NFNotaInfoISSQNTotal issqnTotal) {
        this.issqnTotal = issqnTotal;
    }

    public void setRetencoesTributos(final NFNotaInfoRetencoesTributos retencoesTributos) {
        this.retencoesTributos = retencoesTributos;
    }

    public NFNotaInfoICMSTotal getIcmsTotal() {
        return this.icmsTotal;
    }

    public NFNotaInfoISSQNTotal getIssqnTotal() {
        return this.issqnTotal;
    }

    public NFNotaInfoRetencoesTributos getRetencoesTributos() {
        return this.retencoesTributos;
    }
}