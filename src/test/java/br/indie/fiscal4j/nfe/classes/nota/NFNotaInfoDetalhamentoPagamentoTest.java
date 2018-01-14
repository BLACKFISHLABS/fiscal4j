package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoDetalhamentoPagamentoTest {

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorPagamentoComTamanhoInvalido() {
        new NFNotaInfoDetalhamentoPagamento().setValorPagamento(new BigDecimal("10000000000000"));
    }

    @Test
    public void devePermitirCartaoNulo() {
        final NFNotaInfoDetalhamentoPagamento pagamento = new NFNotaInfoDetalhamentoPagamento();
        pagamento.setFormaPagamentoMoeda(NFFormaPagamentoMoeda.CARTAO_CREDITO);
        pagamento.setValorPagamento(new BigDecimal("999999999999.99"));
        pagamento.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorPagamentoNulo() {
        final NFNotaInfoDetalhamentoPagamento pagamento = new NFNotaInfoDetalhamentoPagamento();
        pagamento.setFormaPagamentoMoeda(NFFormaPagamentoMoeda.CARTAO_CREDITO);
        pagamento.setCartao(FabricaDeObjetosFake.getNFNotaInfoCartao());
        pagamento.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirFormaPagamentoMoedaNulo() {
        final NFNotaInfoDetalhamentoPagamento pagamento = new NFNotaInfoDetalhamentoPagamento();
        pagamento.setCartao(FabricaDeObjetosFake.getNFNotaInfoCartao());
        pagamento.setValorPagamento(new BigDecimal("999999999999.99"));
        pagamento.toString();
    }

    @Test
    @Ignore
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<NFNotaInfoPagamento><tPag>03</tPag><vPag>999999999999.99</vPag><card><tpIntegra>1</tpIntegra><CNPJ>12345678901234</CNPJ><tBand>02</tBand><cAut>9ItpS1hBk3TyhjUB3I90</cAut></card></NFNotaInfoPagamento>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoPagamento().toString());
    }
}