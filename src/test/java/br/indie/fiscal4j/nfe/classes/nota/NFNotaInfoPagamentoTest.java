package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoPagamentoTest {

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorPagamentoComTamanhoInvalido() {
        new DFNotaInfoPagamento().setValorPagamento(new BigDecimal("10000000000000"));
    }

    @Test
    public void devePermitirCartaoNulo() {
        final DFNotaInfoPagamento pagamento = new DFNotaInfoPagamento();
        pagamento.setFormaPagamentoMoeda(NFFormaPagamentoMoeda.CARTAO_CREDITO);
        pagamento.setValorPagamento(new BigDecimal("999999999999.99"));
        pagamento.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorPagamentoNulo() {
        final DFNotaInfoPagamento pagamento = new DFNotaInfoPagamento();
        pagamento.setFormaPagamentoMoeda(NFFormaPagamentoMoeda.CARTAO_CREDITO);
        pagamento.setCartao(FabricaDeObjetosFake.getNFNotaInfoCartao());
        pagamento.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirFormaPagamentoMoedaNulo() {
        final DFNotaInfoPagamento pagamento = new DFNotaInfoPagamento();
        pagamento.setCartao(FabricaDeObjetosFake.getNFNotaInfoCartao());
        pagamento.setValorPagamento(new BigDecimal("999999999999.99"));
        pagamento.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<DFNotaInfoPagamento><tPag>03</tPag><vPag>999999999999.99</vPag><card><tpIntegra>1</tpIntegra><CNPJ>12345678901234</CNPJ><tBand>02</tBand><cAut>9ItpS1hBk3TyhjUB3I90</cAut></card></DFNotaInfoPagamento>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoPagamento().toString());
    }
}