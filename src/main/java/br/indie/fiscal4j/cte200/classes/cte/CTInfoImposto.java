package br.indie.fiscal4j.cte200.classes.cte;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.cte300.classes.nota.CTeNotaInfoInformacoesRelativasImpostosICMSPartilha;
import org.simpleframework.xml.Element;

public class CTInfoImposto extends DFBase {
    private static final long serialVersionUID = -8185617317777830794L;

    @Element(name = "ICMS")
    private CTInfoImpostoICMS icms;

    @Element(name = "vTotTrib", required = false)
    private String vTotTrib;

    @Element(name = "infAdFisco", required = false)
    private String infAdFisco;

    // Elemento da versao 3.0, mas em alguns conhecimentos este campo está vindo.
    @Element(name = "ICMSUFFim", required = false)
    private CTeNotaInfoInformacoesRelativasImpostosICMSPartilha icmsPartilha;

    public CTInfoImpostoICMS getIcms() {
        return this.icms;
    }

    public void setIcms(final CTInfoImpostoICMS icms) {
        this.icms = icms;
    }

    public String getvTotTrib() {
        return this.vTotTrib;
    }

    public void setvTotTrib(final String vTotTrib) {
        this.vTotTrib = vTotTrib;
    }

    public String getInfAdFisco() {
        return this.infAdFisco;
    }

    public void setInfAdFisco(final String infAdFisco) {
        this.infAdFisco = infAdFisco;
    }

}
