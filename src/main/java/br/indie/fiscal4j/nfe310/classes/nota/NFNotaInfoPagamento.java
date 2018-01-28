package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NFNotaInfoPagamento extends DFBase {
    private static final long serialVersionUID = -2613537583415054150L;

    @Element(name = "tPag", required = true)
    private NFFormaPagamentoMoeda formaPagamentoMoeda;

    @Element(name = "vPag", required = true)
    private String valorPagamento;

    @Element(name = "card", required = false)
    private NFNotaInfoCartao cartao;

    public NFFormaPagamentoMoeda getFormaPagamentoMoeda() {
        return this.formaPagamentoMoeda;
    }

    public void setFormaPagamentoMoeda(final NFFormaPagamentoMoeda formaPagamentoMoeda) {
        this.formaPagamentoMoeda = formaPagamentoMoeda;
    }

    public String getValorPagamento() {
        return this.valorPagamento;
    }

    public void setValorPagamento(final BigDecimal valorPagamento) {
        this.valorPagamento = BigDecimalParser.tamanho15Com2CasasDecimais(valorPagamento, "Valor Pagamento");
    }

    public NFNotaInfoCartao getCartao() {
        return this.cartao;
    }

    public void setCartao(final NFNotaInfoCartao cartao) {
        this.cartao = cartao;
    }
}