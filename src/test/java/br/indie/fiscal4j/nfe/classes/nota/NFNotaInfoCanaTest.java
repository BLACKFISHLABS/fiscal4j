package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;

public class NFNotaInfoCanaTest {

    @Test
    public void devePermitirListaDeducoesVazia() {
        final ArrayList<DFNotaInfoCanaFornecimentoDiario> infosCanaFornecimentoDario = new ArrayList<>();
        infosCanaFornecimentoDario.add(FabricaDeObjetosFake.getNFNotaInfoCanaFornecimentoDiario());
        final DFNotaInfoCana infoCana = new DFNotaInfoCana();
        infoCana.setFornecimentosDiario(infosCanaFornecimentoDario);
        infoCana.setSafra("2014");
        infoCana.setReferencia("06/2013");
        infoCana.setValorFornecimento(new BigDecimal("900"));
        infoCana.setValorLiquidoFornecimento(new BigDecimal("980"));
        infoCana.setValorTotalDeducao(new BigDecimal("2000.70"));
        infoCana.setQuantidadeTotalAnterior(new BigDecimal("10"));
        infoCana.setQuantidadeTotalGeral(new BigDecimal("80"));
        infoCana.setQuantidadeTotalMes(new BigDecimal("30.0000001"));
        infoCana.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirListaFornecimentoDiarioVazio() {
        final DFNotaInfoCana infoCana = new DFNotaInfoCana();
        infoCana.setDeducoes(new ArrayList<DFNotaInfoCanaDeducao>());
        infoCana.setSafra("2014");
        infoCana.setReferencia("06/2013");
        infoCana.setValorFornecimento(new BigDecimal("900"));
        infoCana.setValorLiquidoFornecimento(new BigDecimal("980"));
        infoCana.setValorTotalDeducao(new BigDecimal("2000.70"));
        infoCana.setQuantidadeTotalAnterior(new BigDecimal("10"));
        infoCana.setQuantidadeTotalGeral(new BigDecimal("80"));
        infoCana.setQuantidadeTotalMes(new BigDecimal("30.0000001"));
        infoCana.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirSafraNulo() throws ParseException {
        final DFNotaInfoCana infoCana = new DFNotaInfoCana();
        infoCana.setDeducoes(new ArrayList<DFNotaInfoCanaDeducao>());
        final ArrayList<DFNotaInfoCanaFornecimentoDiario> infosCanaFornecimentoDario = new ArrayList<>();
        infosCanaFornecimentoDario.add(FabricaDeObjetosFake.getNFNotaInfoCanaFornecimentoDiario());
        infoCana.setFornecimentosDiario(infosCanaFornecimentoDario);
        infoCana.setReferencia("06/2013");
        infoCana.setValorFornecimento(new BigDecimal("900"));
        infoCana.setValorLiquidoFornecimento(new BigDecimal("980"));
        infoCana.setValorTotalDeducao(new BigDecimal("2000.70"));
        infoCana.setQuantidadeTotalAnterior(new BigDecimal("10"));
        infoCana.setQuantidadeTotalGeral(new BigDecimal("80"));
        infoCana.setQuantidadeTotalMes(new BigDecimal("30.0000001"));
        infoCana.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirReferenciaNulo() throws ParseException {
        final DFNotaInfoCana infoCana = new DFNotaInfoCana();
        infoCana.setDeducoes(new ArrayList<DFNotaInfoCanaDeducao>());
        final ArrayList<DFNotaInfoCanaFornecimentoDiario> infosCanaFornecimentoDario = new ArrayList<>();
        infosCanaFornecimentoDario.add(FabricaDeObjetosFake.getNFNotaInfoCanaFornecimentoDiario());
        infoCana.setFornecimentosDiario(infosCanaFornecimentoDario);
        infoCana.setSafra("2013/2014");
        infoCana.setValorFornecimento(new BigDecimal("900"));
        infoCana.setValorLiquidoFornecimento(new BigDecimal("980"));
        infoCana.setValorTotalDeducao(new BigDecimal("2000.70"));
        infoCana.setQuantidadeTotalAnterior(new BigDecimal("10"));
        infoCana.setQuantidadeTotalGeral(new BigDecimal("80"));
        infoCana.setQuantidadeTotalMes(new BigDecimal("30.0000001"));
        infoCana.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirTotalDeducaoNulo() {
        final DFNotaInfoCana infoCana = new DFNotaInfoCana();
        infoCana.setDeducoes(new ArrayList<DFNotaInfoCanaDeducao>());
        final ArrayList<DFNotaInfoCanaFornecimentoDiario> infosCanaFornecimentoDario = new ArrayList<>();
        infosCanaFornecimentoDario.add(FabricaDeObjetosFake.getNFNotaInfoCanaFornecimentoDiario());
        infoCana.setFornecimentosDiario(infosCanaFornecimentoDario);
        infoCana.setSafra("2013/2014");
        infoCana.setValorFornecimento(new BigDecimal("900"));
        infoCana.setValorLiquidoFornecimento(new BigDecimal("980"));
        infoCana.setQuantidadeTotalAnterior(new BigDecimal("10"));
        infoCana.setQuantidadeTotalGeral(new BigDecimal("80"));
        infoCana.setQuantidadeTotalMes(new BigDecimal("30.0000001"));
        infoCana.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirLiquidoFornecimentoNulo() {
        final DFNotaInfoCana infoCana = new DFNotaInfoCana();
        infoCana.setDeducoes(new ArrayList<DFNotaInfoCanaDeducao>());
        final ArrayList<DFNotaInfoCanaFornecimentoDiario> infosCanaFornecimentoDario = new ArrayList<>();
        infosCanaFornecimentoDario.add(FabricaDeObjetosFake.getNFNotaInfoCanaFornecimentoDiario());
        infoCana.setFornecimentosDiario(infosCanaFornecimentoDario);
        infoCana.setSafra("2013/2014");
        infoCana.setQuantidadeTotalMes(new BigDecimal("30.0000001"));
        infoCana.setValorFornecimento(new BigDecimal("900"));
        infoCana.setValorTotalDeducao(new BigDecimal("2000.70"));
        infoCana.setQuantidadeTotalAnterior(new BigDecimal("10"));
        infoCana.setQuantidadeTotalGeral(new BigDecimal("80"));
        infoCana.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirFornecimentoNulo() {
        final DFNotaInfoCana infoCana = new DFNotaInfoCana();
        infoCana.setDeducoes(new ArrayList<DFNotaInfoCanaDeducao>());
        final ArrayList<DFNotaInfoCanaFornecimentoDiario> infosCanaFornecimentoDario = new ArrayList<>();
        infosCanaFornecimentoDario.add(FabricaDeObjetosFake.getNFNotaInfoCanaFornecimentoDiario());
        infoCana.setFornecimentosDiario(infosCanaFornecimentoDario);
        infoCana.setSafra("2013/2014");
        infoCana.setQuantidadeTotalMes(new BigDecimal("30.0000001"));
        infoCana.setValorLiquidoFornecimento(new BigDecimal("980"));
        infoCana.setValorTotalDeducao(new BigDecimal("2000.70"));
        infoCana.setQuantidadeTotalAnterior(new BigDecimal("10"));
        infoCana.setQuantidadeTotalGeral(new BigDecimal("80"));
        infoCana.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirQtdTotalAnteriorNulo() {
        final DFNotaInfoCana infoCana = new DFNotaInfoCana();
        infoCana.setDeducoes(new ArrayList<DFNotaInfoCanaDeducao>());
        final ArrayList<DFNotaInfoCanaFornecimentoDiario> infosCanaFornecimentoDario = new ArrayList<>();
        infosCanaFornecimentoDario.add(FabricaDeObjetosFake.getNFNotaInfoCanaFornecimentoDiario());
        infoCana.setFornecimentosDiario(infosCanaFornecimentoDario);
        infoCana.setSafra("2013/2014");
        infoCana.setQuantidadeTotalMes(new BigDecimal("30.0000001"));
        infoCana.setValorFornecimento(new BigDecimal("900"));
        infoCana.setValorLiquidoFornecimento(new BigDecimal("980"));
        infoCana.setValorTotalDeducao(new BigDecimal("2000.70"));
        infoCana.setQuantidadeTotalGeral(new BigDecimal("80"));
        infoCana.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirQtdTotalGeralNulo() {
        final DFNotaInfoCana infoCana = new DFNotaInfoCana();
        infoCana.setDeducoes(new ArrayList<DFNotaInfoCanaDeducao>());
        final ArrayList<DFNotaInfoCanaFornecimentoDiario> infosCanaFornecimentoDario = new ArrayList<>();
        infosCanaFornecimentoDario.add(FabricaDeObjetosFake.getNFNotaInfoCanaFornecimentoDiario());
        infoCana.setFornecimentosDiario(infosCanaFornecimentoDario);
        infoCana.setSafra("2013/2014");
        infoCana.setQuantidadeTotalMes(new BigDecimal("30.0000001"));
        infoCana.setValorFornecimento(new BigDecimal("900"));
        infoCana.setValorLiquidoFornecimento(new BigDecimal("980"));
        infoCana.setValorTotalDeducao(new BigDecimal("2000.70"));
        infoCana.setQuantidadeTotalAnterior(new BigDecimal("10"));
        infoCana.toString();

    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirQtdTotalMesNulo() {
        final DFNotaInfoCana infoCana = new DFNotaInfoCana();
        infoCana.setDeducoes(new ArrayList<DFNotaInfoCanaDeducao>());
        final ArrayList<DFNotaInfoCanaFornecimentoDiario> infosCanaFornecimentoDario = new ArrayList<>();
        infosCanaFornecimentoDario.add(FabricaDeObjetosFake.getNFNotaInfoCanaFornecimentoDiario());
        infoCana.setFornecimentosDiario(infosCanaFornecimentoDario);
        infoCana.setSafra("2013/2014");
        infoCana.setValorFornecimento(new BigDecimal("900"));
        infoCana.setValorLiquidoFornecimento(new BigDecimal("980"));
        infoCana.setValorTotalDeducao(new BigDecimal("2000.70"));
        infoCana.setQuantidadeTotalAnterior(new BigDecimal("10"));
        infoCana.setQuantidadeTotalGeral(new BigDecimal("80"));
        infoCana.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirSafraDeFormatoDiferente() {
        new DFNotaInfoCana().setSafra("2014-2015");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirSafraComTamanhoDiferenteQue9() {
        try {
            new DFNotaInfoCana().setSafra("2013/201");
            Assert.fail("Validacao da safra falhou");
        } catch (final IllegalStateException e) {
            new DFNotaInfoCana().setSafra("2013/20140");
        }
        Assert.fail("Validacao da safra falhou");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirSafraComTamanhoDiferenteQue4() {
        try {
            new DFNotaInfoCana().setSafra("201");
            Assert.fail("Validacao da safra falhou");
        } catch (final IllegalStateException e) {
            new DFNotaInfoCana().setSafra("2014/");
        }
        Assert.fail("Validacao da safra falhou");
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<DFNotaInfoCana><safra>2013/2014</safra><ref>06/2013</ref><forDia dia=\"15\"><qtde>3</qtde></forDia><qTotMes>30.0000001</qTotMes><qTotAnt>10</qTotAnt><qTotGer>80</qTotGer><vFor>900.00</vFor><vTotDed>2000.70</vTotDed><vLiqFor>980.00</vLiqFor></DFNotaInfoCana>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoCana().toString());
    }

}