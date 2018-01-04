package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NFNotaInfoItemProdutoDeclaracaoImportacaoAdicaoTest {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCodigoFabricanteComTamanhoInvalido() {
        try {
            new DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao().setCodigoFabricante("");
        } catch (final IllegalStateException e) {
            new DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao().setCodigoFabricante("sA2FBRFMMNgF1AKRDDXYOlc3zGvzEc69l6zQ5O5uAUe82XZ3szQfw01DW0Ki1");
        }
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirNumeroAtoConcessorioDrawbackComTamanhoInvalido() {
        new DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao().setNumeroAtoConcessorioDrawback(new BigInteger("100000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirDescontoComTamanhoInvalido() {
        new DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao().setDesconto(new BigDecimal("10000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirNumeroComTamanhoInvalido() {
        new DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao().setNumero(1000);
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirSequencialComTamanhoInvalido() {
        new DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao().setSequencial(1000);
    }

    @Test
    public void devePermitirNumeroAtoConcessorioDrawbackNulo() {
        final DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao importacaoAdicao = new DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao();
        importacaoAdicao.setCodigoFabricante("sA2FBRFMMNgF1AKRDDXYOlc3zGvzEc69l6zQ5O5uAUe82XZ3szQfw01DW0Ki");
        importacaoAdicao.setDesconto(new BigDecimal("999999999999.99"));
        importacaoAdicao.setNumero(999);
        importacaoAdicao.setSequencial(999);
        importacaoAdicao.setNumeroAtoConcessorioDrawback(new BigInteger("99999999999"));
        importacaoAdicao.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCodigoFabricanteNulo() {
        final DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao importacaoAdicao = new DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao();
        importacaoAdicao.setDesconto(new BigDecimal("999999999999.99"));
        importacaoAdicao.setNumero(999);
        importacaoAdicao.setSequencial(999);
        importacaoAdicao.setNumeroAtoConcessorioDrawback(new BigInteger("99999999999"));
        importacaoAdicao.toString();
    }

    @Test
    public void devePermitirDescontoNulo() {
        final DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao importacaoAdicao = new DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao();
        importacaoAdicao.setCodigoFabricante("sA2FBRFMMNgF1AKRDDXYOlc3zGvzEc69l6zQ5O5uAUe82XZ3szQfw01DW0Ki");
        importacaoAdicao.setNumero(999);
        importacaoAdicao.setSequencial(999);
        importacaoAdicao.setNumeroAtoConcessorioDrawback(new BigInteger("99999999999"));
        importacaoAdicao.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNumeroNulo() {
        final DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao importacaoAdicao = new DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao();
        importacaoAdicao.setCodigoFabricante("sA2FBRFMMNgF1AKRDDXYOlc3zGvzEc69l6zQ5O5uAUe82XZ3szQfw01DW0Ki");
        importacaoAdicao.setDesconto(new BigDecimal("999999999999.99"));
        importacaoAdicao.setSequencial(999);
        importacaoAdicao.setNumeroAtoConcessorioDrawback(new BigInteger("99999999999"));
        importacaoAdicao.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirSequencialNulo() {
        final DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao importacaoAdicao = new DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao();
        importacaoAdicao.setCodigoFabricante("sA2FBRFMMNgF1AKRDDXYOlc3zGvzEc69l6zQ5O5uAUe82XZ3szQfw01DW0Ki");
        importacaoAdicao.setDesconto(new BigDecimal("999999999999.99"));
        importacaoAdicao.setNumero(999);
        importacaoAdicao.setNumeroAtoConcessorioDrawback(new BigInteger("99999999999"));
        importacaoAdicao.toString();
    }

    @Test
    public void devePermitirItemPedidoCompraNulo() {
        final DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao importacaoAdicao = new DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao();
        importacaoAdicao.setCodigoFabricante("sA2FBRFMMNgF1AKRDDXYOlc3zGvzEc69l6zQ5O5uAUe82XZ3szQfw01DW0Ki");
        importacaoAdicao.setDesconto(new BigDecimal("999999999999.99"));
        importacaoAdicao.setNumero(999);
        importacaoAdicao.setSequencial(999);
        importacaoAdicao.setNumeroAtoConcessorioDrawback(new BigInteger("99999999999"));
        importacaoAdicao.toString();
    }

    @Test
    public void devePermitirNumeroPedidoCompraNulo() {
        final DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao importacaoAdicao = new DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao();
        importacaoAdicao.setCodigoFabricante("sA2FBRFMMNgF1AKRDDXYOlc3zGvzEc69l6zQ5O5uAUe82XZ3szQfw01DW0Ki");
        importacaoAdicao.setDesconto(new BigDecimal("999999999999.99"));
        importacaoAdicao.setNumero(999);
        importacaoAdicao.setSequencial(999);
        importacaoAdicao.setNumeroAtoConcessorioDrawback(new BigInteger("99999999999"));
        importacaoAdicao.toString();
    }

    @Test
    public void deveObterCodigoFabricanteComoFoiSetado() {
        final DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao importacaoAdicao = new DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao();
        final String codigoFabricante = "sA2FBRFMMNgF1AKRDDXYOlc3zGvzEc69l6zQ5O5uAUe82XZ3szQfw01DW0Ki";
        importacaoAdicao.setCodigoFabricante(codigoFabricante);
        Assert.assertEquals(codigoFabricante, importacaoAdicao.getCodigoFabricante());
    }

    @Test
    public void deveObterDescontoComoFoiSetado() {
        final DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao importacaoAdicao = new DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao();
        importacaoAdicao.setDesconto(new BigDecimal("999999999999.99"));
        Assert.assertEquals("999999999999.99", importacaoAdicao.getDesconto());
    }

    @Test
    public void deveObterNumeroComoFoiSetado() {
        final DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao importacaoAdicao = new DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao();
        final Integer numero = 999;
        importacaoAdicao.setNumero(numero);
        Assert.assertEquals(numero, importacaoAdicao.getNumero());
    }

    @Test
    public void deveObterNumeroAtoConcessorioDrawbackComoFoiSetado() {
        final DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao importacaoAdicao = new DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao();
        final BigInteger numeroAtoConcessorioDrawback = new BigInteger("99999999999");
        importacaoAdicao.setNumeroAtoConcessorioDrawback(numeroAtoConcessorioDrawback);
        Assert.assertEquals(numeroAtoConcessorioDrawback, importacaoAdicao.getNumeroAtoConcessorioDrawback());
    }

    @Test
    public void deveObterSequencialComoFoiSetado() {
        final DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao importacaoAdicao = new DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao();
        final Integer sequencial = 999;
        importacaoAdicao.setSequencial(sequencial);
        Assert.assertEquals(sequencial, importacaoAdicao.getSequencial());
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao><nAdicao>999</nAdicao><nSeqAdic>999</nSeqAdic><cFabricante>sA2FBRFMMNgF1AKRDDXYOlc3zGvzEc69l6zQ5O5uAUe82XZ3szQfw01DW0Ki</cFabricante><vDescDI>999999999999.99</vDescDI><nDraw>99999999999</nDraw></DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoItemProdutoDeclaracaoImportacaoAdicao().toString());
    }
}