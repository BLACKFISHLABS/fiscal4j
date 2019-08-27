package br.indie.fiscal4j.cte200.classes.cte;

import br.indie.fiscal4j.DFBase;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

public class CTInfoCobranca extends DFBase {
    private static final long serialVersionUID = 700731826125271744L;

    @Element(name = "fat", required = false)
    private CTInfoCobrancaFatura fatura;

    @ElementList(name = "dup", inline = true, required = false)
    private List<CTInfoCobrancaDuplicata> duplicatas;

    public CTInfoCobrancaFatura getFatura() {
        return this.fatura;
    }

    public void setFatura(final CTInfoCobrancaFatura fatura) {
        this.fatura = fatura;
    }

    public List<CTInfoCobrancaDuplicata> getDuplicatas() {
        return this.duplicatas;
    }

    public void setDuplicatas(final List<CTInfoCobrancaDuplicata> duplicatas) {
        this.duplicatas = duplicatas;
    }

}
