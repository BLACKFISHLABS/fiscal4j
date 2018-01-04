package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.nfe.validadores.StringValidador;
import org.simpleframework.xml.Element;

public class DFNotaInfoCompra extends DFBase {

    @Element(name = "xNEmp", required = false)
    private String notaDeEmpenho;

    @Element(name = "xPed", required = false)
    private String pedido;

    @Element(name = "xCont", required = false)
    private String contrato;

    public void setNotaDeEmpenho(final String notaDeEmpenho) {
        StringValidador.tamanho22(notaDeEmpenho, "Nota de Empenho");
        this.notaDeEmpenho = notaDeEmpenho;
    }

    public void setPedido(final String pedido) {
        StringValidador.tamanho60(pedido, "Pedido");
        this.pedido = pedido;
    }

    public void setContrato(final String contrato) {
        StringValidador.tamanho60(contrato, "Contrato");
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