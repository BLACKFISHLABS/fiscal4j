package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.nfe.validadores.ListValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

public class DFNotaInfoCobranca extends DFBase {
    @Element(name = "fat", required = false)
    private DFNotaInfoFatura fatura;

    @ElementList(entry = "dup", inline = true, required = false)
    private List<DFNotaInfoDuplicata> duplicatas;

    public void setFatura(final DFNotaInfoFatura fatura) {
        this.fatura = fatura;
    }

    public void setDuplicatas(final List<DFNotaInfoDuplicata> duplicatas) {
        ListValidador.tamanho120(duplicatas, "Duplicatas");
        this.duplicatas = duplicatas;
    }

    public DFNotaInfoFatura getFatura() {
        return this.fatura;
    }

    public List<DFNotaInfoDuplicata> getDuplicatas() {
        return this.duplicatas;
    }
}