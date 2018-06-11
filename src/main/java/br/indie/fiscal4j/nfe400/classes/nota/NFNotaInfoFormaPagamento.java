package br.indie.fiscal4j.nfe400.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.nfe400.classes.NFIndicadorFormaPagamento;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NFNotaInfoFormaPagamento extends DFBase {
    private static final long serialVersionUID = 8908558834476720280L;

    @Element(name = "indPag", required = false)
    private NFIndicadorFormaPagamento indicadorFormaPagamento;
    
    @Element(name = "tPag")
    private NFFormaPagamentoMoeda formaPagamentoMoeda;

    @Element(name = "vPag")
    private String valorPagamento;

    @Element(name = "card", required = false)
    private NFNotaInfoCartao cartao;

    public void setCartao(final NFNotaInfoCartao cartao) {
        this.cartao = cartao;
    }

    public NFNotaInfoCartao getCartao() {
        return this.cartao;
    }

    public void setIndicadorFormaPagamento(final NFIndicadorFormaPagamento indicadorFormaPagamento) {
        this.indicadorFormaPagamento = indicadorFormaPagamento;
    }

    public void setFormaPagamentoMoeda(final NFFormaPagamentoMoeda formaPagamentoMoeda) {
        this.formaPagamentoMoeda = formaPagamentoMoeda;
    }

    public void setValorPagamento(final BigDecimal valorPagamento) {
        this.valorPagamento = BigDecimalParser.tamanho15Com2CasasDecimais(valorPagamento, "Valor Pagamento");
    }

    public NFIndicadorFormaPagamento getIndicadorFormaPagamento() {
        return indicadorFormaPagamento;
    }

    public NFFormaPagamentoMoeda getFormaPagamentoMoeda() {
        return this.formaPagamentoMoeda;
    }

    public String getValorPagamento() {
        return this.valorPagamento;
    }

}