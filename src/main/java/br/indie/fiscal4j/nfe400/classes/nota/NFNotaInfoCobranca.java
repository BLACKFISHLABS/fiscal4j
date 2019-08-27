package br.indie.fiscal4j.nfe400.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.ListValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

public class NFNotaInfoCobranca extends DFBase {
    private static final long serialVersionUID = -2471735975201108151L;

    @Element(name = "fat", required = false)
    private NFNotaInfoFatura fatura;

    @ElementList(entry = "dup", inline = true, required = false)
    private List<NFNotaInfoParcela> parcelas;

    public void setFatura(final NFNotaInfoFatura fatura) {
        this.fatura = fatura;
    }

    public void setParcelas(final List<NFNotaInfoParcela> parcelas) {
        ListValidador.tamanho120(parcelas, "Parcelas");
        this.parcelas = parcelas;
    }

    public NFNotaInfoFatura getFatura() {
        return this.fatura;
    }

    public List<NFNotaInfoParcela> getParcelas() {
        return this.parcelas;
    }
}