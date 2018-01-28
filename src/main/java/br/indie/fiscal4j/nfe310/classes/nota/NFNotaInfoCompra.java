package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Element;

public class NFNotaInfoCompra extends DFBase {
    private static final long serialVersionUID = 6305778041346992962L;

    @Element(name = "xNEmp", required = false)
    private String notaDeEmpenho;

    @Element(name = "xPed", required = false)
    private String pedido;

    @Element(name = "xCont", required = false)
    private String contrato;

    public String getContrato() {
        return this.contrato;
    }

    public void setContrato(final String contrato) {
        StringValidador.tamanho60(contrato, "Contrato");
        this.contrato = contrato;
    }

    public String getNotaDeEmpenho() {
        return this.notaDeEmpenho;
    }

    public void setNotaDeEmpenho(final String notaDeEmpenho) {
        StringValidador.tamanho22(notaDeEmpenho, "Nota de Empenho");
        this.notaDeEmpenho = notaDeEmpenho;
    }

    public String getPedido() {
        return this.pedido;
    }

    public void setPedido(final String pedido) {
        StringValidador.tamanho60(pedido, "Pedido");
        this.pedido = pedido;
    }
}