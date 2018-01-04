package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoRetencaoICMSTransporteTest {

    @Test
    public void devePermitirAliquotaRetencaoTamanhoValido() {
        new DFNotaInfoRetencaoICMSTransporte().setAliquotaRetencao(new BigDecimal("99.99"));
    }

    @Test
    public void devePermitirValorICMSRetidoTamanhoValido() {
        new DFNotaInfoRetencaoICMSTransporte().setValorICMSRetido(new BigDecimal("999999999999"));
    }

    @Test
    public void devePermitirValorBXRetencaoICMSTamanhoValido() {
        new DFNotaInfoRetencaoICMSTransporte().setBcRetencaoICMS(new BigDecimal("999999999999"));
    }

    @Test
    public void devePermitirValorICMSRetidoValorServicoTamanhoValido() {
        new DFNotaInfoRetencaoICMSTransporte().setValorServico(new BigDecimal("999999999999"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirAliquotaRetencaoTamanhoValido() {
        new DFNotaInfoRetencaoICMSTransporte().setAliquotaRetencao(new BigDecimal("100000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorICMSRetidoTamanhoInvalido() {
        new DFNotaInfoRetencaoICMSTransporte().setValorICMSRetido(new BigDecimal("1000000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirBCRetencaoICMSTamanhoInvalido() {
        new DFNotaInfoRetencaoICMSTransporte().setBcRetencaoICMS(new BigDecimal("1000000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorServicoTamanhoInvalido() {
        new DFNotaInfoRetencaoICMSTransporte().setValorServico(new BigDecimal("1000000000000000"));
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCodigoMunicipioOcorrenciaFatoGeradorICMSTransporteInvalido() {
        new DFNotaInfoRetencaoICMSTransporte().setCodigoMunicipioOcorrenciaFatoGeradorICMSTransporte("10000000");
    }

    @Test
    public void devePermitirCodigoMunicipioOcorrenciaFatoGeradorICMSTransporteValido() {
        new DFNotaInfoRetencaoICMSTransporte().setCodigoMunicipioOcorrenciaFatoGeradorICMSTransporte("9999999");
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirCFOPValorInvalido() {
        new DFNotaInfoRetencaoICMSTransporte().setCfop(10000);
    }

    @Test
    public void devePermitirCFOPValorValido() {
        new DFNotaInfoRetencaoICMSTransporte().setCfop(5351);
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorServicoNulo() {
        final DFNotaInfoRetencaoICMSTransporte retencaoICMSTransporte = new DFNotaInfoRetencaoICMSTransporte();
        retencaoICMSTransporte.setAliquotaRetencao(new BigDecimal("99.99"));
        retencaoICMSTransporte.setBcRetencaoICMS(new BigDecimal("999999999999.99"));
        retencaoICMSTransporte.setCfop(5351);
        retencaoICMSTransporte.setCodigoMunicipioOcorrenciaFatoGeradorICMSTransporte("9999999");
        retencaoICMSTransporte.setValorICMSRetido(new BigDecimal("999999999999.99"));
        retencaoICMSTransporte.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorICMSRetidoNulo() {
        final DFNotaInfoRetencaoICMSTransporte retencaoICMSTransporte = new DFNotaInfoRetencaoICMSTransporte();
        retencaoICMSTransporte.setAliquotaRetencao(new BigDecimal("99.99"));
        retencaoICMSTransporte.setBcRetencaoICMS(new BigDecimal("999999999999.99"));
        retencaoICMSTransporte.setCfop(5351);
        retencaoICMSTransporte.setCodigoMunicipioOcorrenciaFatoGeradorICMSTransporte("9999999");
        retencaoICMSTransporte.setValorServico(new BigDecimal("999999999999.99"));
        retencaoICMSTransporte.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCodigoMunicipioOcorrenciaFatoGeradorICMSTransporteNulo() {
        final DFNotaInfoRetencaoICMSTransporte retencaoICMSTransporte = new DFNotaInfoRetencaoICMSTransporte();
        retencaoICMSTransporte.setAliquotaRetencao(new BigDecimal("99.99"));
        retencaoICMSTransporte.setBcRetencaoICMS(new BigDecimal("999999999999.99"));
        retencaoICMSTransporte.setCfop(5351);
        retencaoICMSTransporte.setValorICMSRetido(new BigDecimal("999999999999.99"));
        retencaoICMSTransporte.setValorServico(new BigDecimal("999999999999.99"));
        retencaoICMSTransporte.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCfopNulo() {
        final DFNotaInfoRetencaoICMSTransporte retencaoICMSTransporte = new DFNotaInfoRetencaoICMSTransporte();
        retencaoICMSTransporte.setAliquotaRetencao(new BigDecimal("99.99"));
        retencaoICMSTransporte.setBcRetencaoICMS(new BigDecimal("999999999999.99"));
        retencaoICMSTransporte.setCodigoMunicipioOcorrenciaFatoGeradorICMSTransporte("9999999");
        retencaoICMSTransporte.setValorICMSRetido(new BigDecimal("999999999999.99"));
        retencaoICMSTransporte.setValorServico(new BigDecimal("999999999999.99"));
        retencaoICMSTransporte.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirBcRetencaOICMSNulo() {
        final DFNotaInfoRetencaoICMSTransporte retencaoICMSTransporte = new DFNotaInfoRetencaoICMSTransporte();
        retencaoICMSTransporte.setAliquotaRetencao(new BigDecimal("99.99"));
        retencaoICMSTransporte.setCfop(5351);
        retencaoICMSTransporte.setCodigoMunicipioOcorrenciaFatoGeradorICMSTransporte("9999999");
        retencaoICMSTransporte.setValorICMSRetido(new BigDecimal("999999999999.99"));
        retencaoICMSTransporte.setValorServico(new BigDecimal("999999999999.99"));
        retencaoICMSTransporte.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirAliquotaRetencaoNulo() {
        final DFNotaInfoRetencaoICMSTransporte retencaoICMSTransporte = new DFNotaInfoRetencaoICMSTransporte();
        retencaoICMSTransporte.setBcRetencaoICMS(new BigDecimal("999999999999.99"));
        retencaoICMSTransporte.setCfop(5351);
        retencaoICMSTransporte.setCodigoMunicipioOcorrenciaFatoGeradorICMSTransporte("9999999");
        retencaoICMSTransporte.setValorICMSRetido(new BigDecimal("999999999999.99"));
        retencaoICMSTransporte.setValorServico(new BigDecimal("999999999999.99"));
        retencaoICMSTransporte.toString();
    }

    @Test
    public void deveObterAliquotaRetencaoComoFoiSetado() {
        final DFNotaInfoRetencaoICMSTransporte retencaoICMSTransporte = new DFNotaInfoRetencaoICMSTransporte();
        retencaoICMSTransporte.setAliquotaRetencao(BigDecimal.ONE);
        Assert.assertEquals("1.00", retencaoICMSTransporte.getAliquotaRetencao());
    }

    @Test
    public void deveObterBcRetencaoICMSComoFoiSetado() {
        final DFNotaInfoRetencaoICMSTransporte retencaoICMSTransporte = new DFNotaInfoRetencaoICMSTransporte();
        retencaoICMSTransporte.setBcRetencaoICMS(BigDecimal.ONE);
        Assert.assertEquals("1.00", retencaoICMSTransporte.getBcRetencaoICMS());
    }

    @Test
    public void deveObterCfopComoFoiSetado() {
        final DFNotaInfoRetencaoICMSTransporte retencaoICMSTransporte = new DFNotaInfoRetencaoICMSTransporte();
        retencaoICMSTransporte.setCfop(193);
        Assert.assertEquals(193, retencaoICMSTransporte.getCfop(), 0);
    }

    @Test
    public void deveObterCodigoMunicioOcorrenciaFatoGeradorICMSTransporteComoFoiSetado() {
        final DFNotaInfoRetencaoICMSTransporte retencaoICMSTransporte = new DFNotaInfoRetencaoICMSTransporte();
        final String codigoMunicioOcorrenciaFatoGeradorICMSTransporte = "9876541";
        retencaoICMSTransporte.setCodigoMunicipioOcorrenciaFatoGeradorICMSTransporte(codigoMunicioOcorrenciaFatoGeradorICMSTransporte);
        Assert.assertEquals(codigoMunicioOcorrenciaFatoGeradorICMSTransporte, retencaoICMSTransporte.getCodigoMunicipioOcorrenciaFatoGeradorICMSTransporte());
    }

    @Test
    public void deveObterValorICMSRetidoComoFoiSetado() {
        final DFNotaInfoRetencaoICMSTransporte retencaoICMSTransporte = new DFNotaInfoRetencaoICMSTransporte();
        retencaoICMSTransporte.setValorICMSRetido(BigDecimal.TEN);
        Assert.assertEquals("10.00", retencaoICMSTransporte.getValorICMSRetido());
    }

    @Test
    public void deveObterValorServicoComoFoiSetado() {
        final DFNotaInfoRetencaoICMSTransporte retencaoICMSTransporte = new DFNotaInfoRetencaoICMSTransporte();
        final String valorServico = "100.00";
        retencaoICMSTransporte.setValorServico(new BigDecimal(valorServico));
        Assert.assertEquals(valorServico, retencaoICMSTransporte.getValorServico());
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<DFNotaInfoRetencaoICMSTransporte><vServ>999999999999.99</vServ><vBCRet>999999999999.99</vBCRet><pICMSRet>99.99</pICMSRet><vICMSRet>999999999999.99</vICMSRet><CFOP>5351</CFOP><cMunFG>9999999</cMunFG></DFNotaInfoRetencaoICMSTransporte>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoRetencaoICMSTransporte().toString());
    }
}