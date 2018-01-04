package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoTest {

    @Test
    public void deveObterNFNotaInfoItemImpostoCOFINSComoFoiSetado() {
        final DFNotaInfoItemImposto imposto = new DFNotaInfoItemImposto();
        final DFNotaInfoItemImpostoCOFINS notaInfoItemImpostoCOFINS = FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINS();
        imposto.setCofins(notaInfoItemImpostoCOFINS);
        Assert.assertEquals(notaInfoItemImpostoCOFINS, imposto.getCofins());
    }

    @Test
    public void deveObterIssqnComoFoiSetado() {
        final DFNotaInfoItemImposto imposto = new DFNotaInfoItemImposto();
        final DFNotaInfoItemImpostoISSQN issqn = FabricaDeObjetosFake.getNFNotaInfoItemImpostoISSQN();
        imposto.setIssqn(issqn);
        Assert.assertEquals(issqn, imposto.getIssqn());
    }

    @Test
    public void deveObterCofinsstComoFoiSetado() {
        final DFNotaInfoItemImposto imposto = new DFNotaInfoItemImposto();
        final DFNotaInfoItemImpostoCOFINSST notaInfoItemImpostoCOFINSST = FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSST();
        imposto.setCofinsst(notaInfoItemImpostoCOFINSST);
        Assert.assertEquals(notaInfoItemImpostoCOFINSST, imposto.getCofinsst());
    }

    @Test
    public void deveObterIcmsComoFoiSetado() {
        final DFNotaInfoItemImposto imposto = new DFNotaInfoItemImposto();
        final DFNotaInfoItemImpostoICMS notaInfoItemImpostoICMS = FabricaDeObjetosFake.getNFNotaInfoItemImpostoICMS();
        imposto.setIcms(notaInfoItemImpostoICMS);
        Assert.assertEquals(notaInfoItemImpostoICMS, imposto.getIcms());
    }

    @Test
    public void deveObterImpostoImportacaoComoFoiSetado() {
        final DFNotaInfoItemImposto imposto = new DFNotaInfoItemImposto();
        final DFNotaInfoItemImpostoImportacao notaInfoItemImpostoImportacao = FabricaDeObjetosFake.getNFNotaInfoItemImpostoImportacao();
        imposto.setImpostoImportacao(notaInfoItemImpostoImportacao);
        Assert.assertEquals(notaInfoItemImpostoImportacao, imposto.getImpostoImportacao());
    }

    @Test
    public void deveObterIpiComoFoiSetado() {
        final DFNotaInfoItemImposto imposto = new DFNotaInfoItemImposto();
        final DFNotaInfoItemImpostoIPI impostoIPI = FabricaDeObjetosFake.getNFNotaInfoItemImpostoIPI();
        imposto.setIpi(impostoIPI);
        Assert.assertEquals(impostoIPI, imposto.getIpi());
    }

    @Test
    public void deveObterPisComoFoiSetado() {
        final DFNotaInfoItemImposto imposto = new DFNotaInfoItemImposto();
        final DFNotaInfoItemImpostoPIS pis = FabricaDeObjetosFake.getNFNotaInfoItemImpostoPIS();
        imposto.setPis(pis);
        Assert.assertEquals(pis, imposto.getPis());
    }

    @Test
    public void deveObterPisstComoFoiSetado() {
        final DFNotaInfoItemImposto imposto = new DFNotaInfoItemImposto();
        final DFNotaInfoItemImpostoPISST pisst = FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISST();
        imposto.setPisst(pisst);
        Assert.assertEquals(pisst, imposto.getPisst());
    }

    @Test
    public void deveObterIcmsUfDestinoComoFoiSetado() {
        final DFNotaInfoItemImposto imposto = new DFNotaInfoItemImposto();
        final DFNotaInfoItemImpostoICMSUFDestino icmsUfDestino = FabricaDeObjetosFake.getNFNotaaInfoItemImpostoICMSUFDestino();
        imposto.setIcmsUfDestino(icmsUfDestino);
        Assert.assertEquals(icmsUfDestino, imposto.getIcmsUfDestino());
    }

    @Test
    public void deveObterValorTotalTributosComoSetado() {
        final DFNotaInfoItemImposto imposto = new DFNotaInfoItemImposto();
        final String valorTotalTributos = "999999999999.99";
        imposto.setValorTotalTributos(new BigDecimal(valorTotalTributos));
        Assert.assertEquals(valorTotalTributos, imposto.getValorTotalTributos());
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorTotalTributosComTamanhoInvalido() {
        new DFNotaInfoItemImposto().setValorTotalTributos(new BigDecimal("10000000000000"));
    }

    @Test
    public void naoDevePermitirICMSouIPIouIICasoISSQNEstejaSetado() {
        final DFNotaInfoItemImposto imposto1 = new DFNotaInfoItemImposto();
        imposto1.setIssqn(FabricaDeObjetosFake.getNFNotaInfoItemImpostoISSQN());

        try {
            imposto1.setIcms(FabricaDeObjetosFake.getNFNotaInfoItemImpostoICMS());
        } catch (final IllegalStateException e) {
        }
        final DFNotaInfoItemImposto imposto2 = new DFNotaInfoItemImposto();
        imposto2.setIssqn(FabricaDeObjetosFake.getNFNotaInfoItemImpostoISSQN());

        try {
            imposto2.setIpi(FabricaDeObjetosFake.getNFNotaInfoItemImpostoIPI());
        } catch (final IllegalStateException e) {
        }

        final DFNotaInfoItemImposto imposto3 = new DFNotaInfoItemImposto();
        imposto3.setIssqn(FabricaDeObjetosFake.getNFNotaInfoItemImpostoISSQN());

        try {
            imposto3.setImpostoImportacao(FabricaDeObjetosFake.getNFNotaInfoItemImpostoImportacao());
        } catch (final IllegalStateException e) {
        }
    }

    @Test
    public void naoDevePermitirSetarISSQNCasoICMSouIPIouIICasoEstejamSetados() {
        final DFNotaInfoItemImposto imposto1 = new DFNotaInfoItemImposto();
        imposto1.setIcms(FabricaDeObjetosFake.getNFNotaInfoItemImpostoICMS());

        try {
            imposto1.setIssqn(FabricaDeObjetosFake.getNFNotaInfoItemImpostoISSQN());
        } catch (final IllegalStateException e) {
        }
        final DFNotaInfoItemImposto imposto2 = new DFNotaInfoItemImposto();
        imposto2.setIpi(FabricaDeObjetosFake.getNFNotaInfoItemImpostoIPI());

        try {
            imposto2.setIssqn(FabricaDeObjetosFake.getNFNotaInfoItemImpostoISSQN());
        } catch (final IllegalStateException e) {
        }

        final DFNotaInfoItemImposto imposto3 = new DFNotaInfoItemImposto();
        imposto3.setImpostoImportacao(FabricaDeObjetosFake.getNFNotaInfoItemImpostoImportacao());

        try {
            imposto3.setIssqn(FabricaDeObjetosFake.getNFNotaInfoItemImpostoISSQN());
        } catch (final IllegalStateException e) {
        }
    }

    @Test
    public void devePermitirValorTotalTributosNulo() {
        final DFNotaInfoItemImposto imposto = new DFNotaInfoItemImposto();
        imposto.setCofins(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINS());
        imposto.setCofinsst(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSST());
        imposto.setIcms(FabricaDeObjetosFake.getNFNotaInfoItemImpostoICMS());
        imposto.setImpostoImportacao(FabricaDeObjetosFake.getNFNotaInfoItemImpostoImportacao());
        imposto.setIpi(FabricaDeObjetosFake.getNFNotaInfoItemImpostoIPI());
        imposto.setPis(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPIS());
        imposto.setPisst(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISST());
        imposto.setIcmsUfDestino(FabricaDeObjetosFake.getNFNotaaInfoItemImpostoICMSUFDestino());
        imposto.toString();
    }

    @Test
    public void devePermitirCofinsNulo() {
        final DFNotaInfoItemImposto imposto = new DFNotaInfoItemImposto();
        imposto.setCofinsst(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSST());
        imposto.setIcms(FabricaDeObjetosFake.getNFNotaInfoItemImpostoICMS());
        imposto.setImpostoImportacao(FabricaDeObjetosFake.getNFNotaInfoItemImpostoImportacao());
        imposto.setIpi(FabricaDeObjetosFake.getNFNotaInfoItemImpostoIPI());
        imposto.setPis(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPIS());
        imposto.setPisst(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISST());
        imposto.setValorTotalTributos(new BigDecimal("999999999999.99"));
        imposto.setIcmsUfDestino(FabricaDeObjetosFake.getNFNotaaInfoItemImpostoICMSUFDestino());
        imposto.toString();
    }

    @Test
    public void devePermitirCofinsstNulo() {
        final DFNotaInfoItemImposto imposto = new DFNotaInfoItemImposto();
        imposto.setCofins(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINS());
        imposto.setIcms(FabricaDeObjetosFake.getNFNotaInfoItemImpostoICMS());
        imposto.setImpostoImportacao(FabricaDeObjetosFake.getNFNotaInfoItemImpostoImportacao());
        imposto.setIpi(FabricaDeObjetosFake.getNFNotaInfoItemImpostoIPI());
        imposto.setPis(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPIS());
        imposto.setPisst(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISST());
        imposto.setValorTotalTributos(new BigDecimal("999999999999.99"));
        imposto.setIcmsUfDestino(FabricaDeObjetosFake.getNFNotaaInfoItemImpostoICMSUFDestino());
        imposto.toString();
    }

    @Test
    public void devePermitirIcmsNulo() {
        final DFNotaInfoItemImposto imposto = new DFNotaInfoItemImposto();
        imposto.setCofins(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINS());
        imposto.setCofinsst(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSST());
        imposto.setImpostoImportacao(FabricaDeObjetosFake.getNFNotaInfoItemImpostoImportacao());
        imposto.setIpi(FabricaDeObjetosFake.getNFNotaInfoItemImpostoIPI());
        imposto.setPis(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPIS());
        imposto.setPisst(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISST());
        imposto.setValorTotalTributos(new BigDecimal("999999999999.99"));
        imposto.setIcmsUfDestino(FabricaDeObjetosFake.getNFNotaaInfoItemImpostoICMSUFDestino());
        imposto.toString();
    }

    @Test
    public void devePermitirImpostoImportacaoNulo() {
        final DFNotaInfoItemImposto imposto = new DFNotaInfoItemImposto();
        imposto.setCofins(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINS());
        imposto.setCofinsst(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSST());
        imposto.setIcms(FabricaDeObjetosFake.getNFNotaInfoItemImpostoICMS());
        imposto.setIpi(FabricaDeObjetosFake.getNFNotaInfoItemImpostoIPI());
        imposto.setPis(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPIS());
        imposto.setPisst(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISST());
        imposto.setValorTotalTributos(new BigDecimal("999999999999.99"));
        imposto.setIcmsUfDestino(FabricaDeObjetosFake.getNFNotaaInfoItemImpostoICMSUFDestino());
        imposto.toString();
    }

    @Test
    public void devePermitirIpiNulo() {
        final DFNotaInfoItemImposto imposto = new DFNotaInfoItemImposto();
        imposto.setCofins(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINS());
        imposto.setCofinsst(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSST());
        imposto.setIcms(FabricaDeObjetosFake.getNFNotaInfoItemImpostoICMS());
        imposto.setImpostoImportacao(FabricaDeObjetosFake.getNFNotaInfoItemImpostoImportacao());
        imposto.setPis(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPIS());
        imposto.setPisst(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISST());
        imposto.setValorTotalTributos(new BigDecimal("999999999999.99"));
        imposto.setIcmsUfDestino(FabricaDeObjetosFake.getNFNotaaInfoItemImpostoICMSUFDestino());
        imposto.toString();
    }

    @Test
    public void devePermitirIssqnNulo() {
        final DFNotaInfoItemImposto imposto = new DFNotaInfoItemImposto();
        imposto.setCofins(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINS());
        imposto.setCofinsst(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSST());
        imposto.setIcms(FabricaDeObjetosFake.getNFNotaInfoItemImpostoICMS());
        imposto.setImpostoImportacao(FabricaDeObjetosFake.getNFNotaInfoItemImpostoImportacao());
        imposto.setIpi(FabricaDeObjetosFake.getNFNotaInfoItemImpostoIPI());
        imposto.setPis(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPIS());
        imposto.setPisst(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISST());
        imposto.setValorTotalTributos(new BigDecimal("999999999999.99"));
        imposto.setIcmsUfDestino(FabricaDeObjetosFake.getNFNotaaInfoItemImpostoICMSUFDestino());
        imposto.toString();
    }

    @Test
    public void devePermitirPisNulo() {
        final DFNotaInfoItemImposto imposto = new DFNotaInfoItemImposto();
        imposto.setCofins(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINS());
        imposto.setCofinsst(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSST());
        imposto.setIcms(FabricaDeObjetosFake.getNFNotaInfoItemImpostoICMS());
        imposto.setImpostoImportacao(FabricaDeObjetosFake.getNFNotaInfoItemImpostoImportacao());
        imposto.setIpi(FabricaDeObjetosFake.getNFNotaInfoItemImpostoIPI());
        imposto.setPisst(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISST());
        imposto.setValorTotalTributos(new BigDecimal("999999999999.99"));
        imposto.setIcmsUfDestino(FabricaDeObjetosFake.getNFNotaaInfoItemImpostoICMSUFDestino());
        imposto.toString();
    }

    @Test
    public void devePermitirPisstNulo() {
        final DFNotaInfoItemImposto imposto = new DFNotaInfoItemImposto();
        imposto.setCofins(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINS());
        imposto.setCofinsst(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSST());
        imposto.setIcms(FabricaDeObjetosFake.getNFNotaInfoItemImpostoICMS());
        imposto.setImpostoImportacao(FabricaDeObjetosFake.getNFNotaInfoItemImpostoImportacao());
        imposto.setIpi(FabricaDeObjetosFake.getNFNotaInfoItemImpostoIPI());
        imposto.setPis(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPIS());
        imposto.setValorTotalTributos(new BigDecimal("999999999999.99"));
        imposto.setIcmsUfDestino(FabricaDeObjetosFake.getNFNotaaInfoItemImpostoICMSUFDestino());
        imposto.toString();
    }

    @Test
    public void devePermitirICmsUfDestinoNulo() {
        final DFNotaInfoItemImposto imposto = new DFNotaInfoItemImposto();
        imposto.setCofins(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINS());
        imposto.setCofinsst(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSST());
        imposto.setIcms(FabricaDeObjetosFake.getNFNotaInfoItemImpostoICMS());
        imposto.setImpostoImportacao(FabricaDeObjetosFake.getNFNotaInfoItemImpostoImportacao());
        imposto.setIpi(FabricaDeObjetosFake.getNFNotaInfoItemImpostoIPI());
        imposto.setPis(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPIS());
        imposto.setValorTotalTributos(new BigDecimal("999999999999.99"));
        imposto.setPisst(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISST());
        imposto.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<DFNotaInfoItemImposto><vTotTrib>999999999999.99</vTotTrib><ICMS><ICMS00><orig>0</orig><CST>00</CST><modBC>1</modBC><vBC>999999999999.99</vBC><pICMS>99.99</pICMS><vICMS>999999999999.99</vICMS></ICMS00></ICMS><IPI><clEnq>157br</clEnq><CNPJProd>12345678901234</CNPJProd><cSelo>iNEFifS1jexTxcCvgjlQ186nR6JAwM2koyjbWKA1DJSLmZy432GoSwoygXc5</cSelo><qSelo>999999999999</qSelo><cEnq>aT2</cEnq><IPITrib><CST>49</CST><vBC>999999999999.99</vBC><pIPI>99.99</pIPI><vIPI>999999999999.99</vIPI></IPITrib></IPI><II><vBC>999999999999.99</vBC><vDespAdu>999999999999.99</vDespAdu><vII>999999999999.99</vII><vIOF>999999999999.99</vIOF></II><PIS><PISAliq><CST>01</CST><vBC>999999999999.99</vBC><pPIS>99.99</pPIS><vPIS>999999999999.99</vPIS></PISAliq></PIS><PISST><qBCProd>99999999999.9999</qBCProd><vAliqProd>9999999999.9999</vAliqProd><vPIS>999999999999.99</vPIS></PISST><COFINS><COFINSAliq><CST>01</CST><vBC>999999999999.99</vBC><pCOFINS>99.99</pCOFINS><vCOFINS>999999999999.99</vCOFINS></COFINSAliq></COFINS><COFINSST><vBC>999999999999.99</vBC><pCOFINS>99.99</pCOFINS><vCOFINS>999999999999.00</vCOFINS></COFINSST><ICMSUFDest><vBCUFDest>9999999999999.99</vBCUFDest><pFCPUFDest>999.9999</pFCPUFDest><pICMSUFDest>999.9999</pICMSUFDest><pICMSInter>7.00</pICMSInter><pICMSInterPart>999.9999</pICMSInterPart><vFCPUFDest>9999999999999.99</vFCPUFDest><vICMSUFDest>9999999999999.99</vICMSUFDest><vICMSUFRemet>9999999999999.99</vICMSUFRemet></ICMSUFDest></DFNotaInfoItemImposto>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoItemImposto().toString());
    }
}