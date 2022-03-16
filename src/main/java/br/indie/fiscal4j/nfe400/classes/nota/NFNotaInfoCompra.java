package br.indie.fiscal4j.nfe400.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.DFStringValidador;
import org.simpleframework.xml.Element;

public class NFNotaInfoCompra extends DFBase {
    private static final long serialVersionUID = 6305778041346992962L;

    @Element(name = "xNEmp", required = false)
    private String notaDeEmpenho;

    @Element(name = "xPed", required = false)
    private String pedido;

    @Element(name = "xCont", required = false)
    private String contrato;

    public void setNotaDeEmpenho(final String notaDeEmpenho) {
        DFStringValidador.tamanho22(notaDeEmpenho, "Nota de Empenho");
        this.notaDeEmpenho = notaDeEmpenho;
    }

    public void setPedido(final String pedido) {
        DFStringValidador.tamanho60(pedido, "Pedido");
        this.pedido = pedido;
    }

    public void setContrato(final String contrato) {
        DFStringValidador.tamanho60(contrato, "Contrato");
        this.contrato = contrato;
    }

    public String getContrato() {
        return this.contrato;
    }

    public String getNotaDeEmpenho() {
        return this.notaDeEmpenho;
    }

    public String getPedido() {
        return this.pedido;
    }
}