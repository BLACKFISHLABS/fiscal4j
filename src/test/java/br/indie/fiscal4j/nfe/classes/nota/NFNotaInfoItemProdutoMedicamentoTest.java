package br.indie.fiscal4j.nfe.classes.nota;

import org.joda.time.LocalDate;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoItemProdutoMedicamentoTest {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirLoteComTamanhoInvalido() {
        try {
            new DFNotaInfoItemProdutoMedicamento().setLote("");
        } catch (final IllegalStateException e) {
            new DFNotaInfoItemProdutoMedicamento().setLote("yq50jVDZsvQVNuWoS45U1");
        }
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirPrecoMaximoConsumidorComTamanhoInvalido() {
        new DFNotaInfoItemProdutoMedicamento().setPrecoMaximoConsumidor(new BigDecimal("10000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirQuantidadeComTamanhoInvalido() {
        new DFNotaInfoItemProdutoMedicamento().setQuantidade(new BigDecimal("100000000"));
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirDataFabricacaoNulo() {
        final DFNotaInfoItemProdutoMedicamento medicamento = new DFNotaInfoItemProdutoMedicamento();
        medicamento.setDataValidade(new LocalDate(2015, 1, 1));
        medicamento.setLote("yq50jVDZsvQVNuWoS45U");
        medicamento.setPrecoMaximoConsumidor(new BigDecimal("999999999999.99"));
        medicamento.setQuantidade(new BigDecimal("9999999.999"));
        medicamento.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirDataValidadeNulo() {
        final DFNotaInfoItemProdutoMedicamento medicamento = new DFNotaInfoItemProdutoMedicamento();
        medicamento.setDataFabricacao(new LocalDate(2014, 1, 1));
        medicamento.setLote("yq50jVDZsvQVNuWoS45U");
        medicamento.setPrecoMaximoConsumidor(new BigDecimal("999999999999.99"));
        medicamento.setQuantidade(new BigDecimal("9999999.999"));
        medicamento.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirLoteNulo() {
        final DFNotaInfoItemProdutoMedicamento medicamento = new DFNotaInfoItemProdutoMedicamento();
        medicamento.setDataFabricacao(new LocalDate(2014, 1, 1));
        medicamento.setDataValidade(new LocalDate(2015, 1, 1));
        medicamento.setPrecoMaximoConsumidor(new BigDecimal("999999999999.99"));
        medicamento.setQuantidade(new BigDecimal("9999999.999"));
        medicamento.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPrecoMaximoConsumidorNulo() {
        final DFNotaInfoItemProdutoMedicamento medicamento = new DFNotaInfoItemProdutoMedicamento();
        medicamento.setDataFabricacao(new LocalDate(2014, 1, 1));
        medicamento.setDataValidade(new LocalDate(2015, 1, 1));
        medicamento.setLote("yq50jVDZsvQVNuWoS45U");
        medicamento.setQuantidade(new BigDecimal("9999999.999"));
        medicamento.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirQuantidadeNulo() {
        final DFNotaInfoItemProdutoMedicamento medicamento = new DFNotaInfoItemProdutoMedicamento();
        medicamento.setDataFabricacao(new LocalDate(2014, 1, 1));
        medicamento.setDataValidade(new LocalDate(2015, 1, 1));
        medicamento.setLote("yq50jVDZsvQVNuWoS45U");
        medicamento.setPrecoMaximoConsumidor(new BigDecimal("999999999999.99"));
        medicamento.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final DFNotaInfoItemProdutoMedicamento medicamento = new DFNotaInfoItemProdutoMedicamento();
        medicamento.setDataFabricacao(new LocalDate(2014, 1, 1));
        medicamento.setDataValidade(new LocalDate(2015, 1, 1));
        medicamento.setLote("yq50jVDZsvQVNuWoS45U");
        medicamento.setPrecoMaximoConsumidor(new BigDecimal("999999999999.99"));
        medicamento.setQuantidade(new BigDecimal("9999999.999"));

        final String xmlEsperado = "<DFNotaInfoItemProdutoMedicamento><nLote>yq50jVDZsvQVNuWoS45U</nLote><qLote>9999999.999</qLote><dFab>2014-01-01</dFab><dVal>2015-01-01</dVal><vPMC>999999999999.99</vPMC></DFNotaInfoItemProdutoMedicamento>";
        Assert.assertEquals(xmlEsperado, medicamento.toString());
    }
}