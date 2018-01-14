package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.nfe.validadores.BigDecimalParser;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NFNotaInfoICMSTotal extends DFBase {

    @Element(name = "vBC", required = true)
    private String baseCalculoICMS;

    @Element(name = "vICMS", required = true)
    private String valorTotalICMS;

    @Element(name = "vICMSDeson", required = true)
    private String valorICMSDesonerado;

    @Element(name = "vFCP", required = false)
    private String valorTotalFcp;

    @Element(name = "vBCST", required = true)
    private String baseCalculoICMSST;

    @Element(name = "vST", required = true)
    private String valorTotalICMSST;

    @Element(name = "vFCPST", required = false)
    private String valorTotalFcpSt;

    @Element(name = "vFCPSTRet", required = false)
    private String valorTotalFcpStRetido;

    @Element(name = "vProd", required = true)
    private String valorTotalDosProdutosServicos;

    @Element(name = "vFrete", required = true)
    private String valorTotalFrete;

    @Element(name = "vSeg", required = true)
    private String valorTotalSeguro;

    @Element(name = "vDesc", required = true)
    private String valorTotalDesconto;

    @Element(name = "vII", required = true)
    private String valorTotalII;

    @Element(name = "vIPI", required = true)
    private String valorTotalIPI;

    @Element(name = "vIPIDevol", required = false)
    private String valorTotalIPIDevolvido;

    @Element(name = "vPIS", required = true)
    private String valorPIS;

    @Element(name = "vCOFINS", required = true)
    private String valorCOFINS;

    @Element(name = "vOutro", required = true)
    private String outrasDespesasAcessorias;

    @Element(name = "vNF", required = true)
    private String valorTotalNFe;

    @Element(name = "vTotTrib", required = false)
    private String valorTotalTributos;

    public void setBaseCalculoICMS(final BigDecimal baseCalculoICMS) {
        this.baseCalculoICMS
                = BigDecimalParser.tamanho15Com2CasasDecimais(baseCalculoICMS, "Base de Calculo ICMS Total");
    }

    public void setValorTotalICMS(final BigDecimal valorTotalICMS) {
        this.valorTotalICMS = BigDecimalParser.tamanho15Com2CasasDecimais(valorTotalICMS, "Valalor Total ICMS");
    }

    public void setBaseCalculoICMSST(final BigDecimal baseCalculoICMSST) {
        this.baseCalculoICMSST = BigDecimalParser.tamanho15Com2CasasDecimais(baseCalculoICMSST,
                "Base de Calculo ICMS ST Total");
    }

    public void setValorTotalICMSST(final BigDecimal valorTotalICMSST) {
        this.valorTotalICMSST = BigDecimalParser.tamanho15Com2CasasDecimais(valorTotalICMSST, "Valor Total ICMS ST");
    }

    public void setValorTotalDosProdutosServicos(final BigDecimal valorTotalDosProdutosServicos) {
        this.valorTotalDosProdutosServicos = BigDecimalParser.tamanho15Com2CasasDecimais(valorTotalDosProdutosServicos,
                "Valor Total Produtos e Servicos");
    }

    public void setValorTotalFrete(final BigDecimal valorTotalFrete) {
        this.valorTotalFrete = BigDecimalParser.tamanho15Com2CasasDecimais(valorTotalFrete, "Valor Total Frete");
    }

    public void setValorTotalSeguro(final BigDecimal valorTotalSeguro) {
        this.valorTotalSeguro = BigDecimalParser.tamanho15Com2CasasDecimais(valorTotalSeguro, "Valor Total Seguro");
    }

    public void setValorTotalDesconto(final BigDecimal valorTotalDesconto) {
        this.valorTotalDesconto
                = BigDecimalParser.tamanho15Com2CasasDecimais(valorTotalDesconto, "Valor Total Desconto");
    }

    public void setValorTotalII(final BigDecimal valorTotalII) {
        this.valorTotalII = BigDecimalParser.tamanho15Com2CasasDecimais(valorTotalII, "Valor Total II");
    }

    public void setValorTotalIPI(final BigDecimal valorTotalIPI) {
        this.valorTotalIPI = BigDecimalParser.tamanho15Com2CasasDecimais(valorTotalIPI, "Valor Total IPI");
    }

    public void setValorPIS(final BigDecimal valorPIS) {
        this.valorPIS = BigDecimalParser.tamanho15Com2CasasDecimais(valorPIS, "Valor Total PIS");
    }

    public void setValorCOFINS(final BigDecimal valorCOFINS) {
        this.valorCOFINS = BigDecimalParser.tamanho15Com2CasasDecimais(valorCOFINS, "Valor Total COFINS");
    }

    public void setOutrasDespesasAcessorias(final BigDecimal outrasDespesasAcessorias) {
        this.outrasDespesasAcessorias = BigDecimalParser.tamanho15Com2CasasDecimais(outrasDespesasAcessorias,
                "Outras Despesas Acessorias");
    }

    public void setValorTotalNFe(final BigDecimal valorTotalNFe) {
        this.valorTotalNFe = BigDecimalParser.tamanho15Com2CasasDecimais(valorTotalNFe, "Valor Total NFe");
    }

    public void setValorTotalTributos(final BigDecimal valorTotalTributos) {
        this.valorTotalTributos
                = BigDecimalParser.tamanho15Com2CasasDecimais(valorTotalTributos, "Valor Total Tributos");
    }

    public void setValorICMSDesonerado(final BigDecimal valorICMSDesonerado) {
        this.valorICMSDesonerado = BigDecimalParser.tamanho15Com2CasasDecimais(valorICMSDesonerado,
                "Valor ICMS Desonerado");
    }

    public void setValorTotalFcp(final BigDecimal valorTotalFcp) {
        this.valorTotalFcp = BigDecimalParser.tamanho15Com2CasasDecimais(valorTotalFcp,
                "Valor Total do FCP (Fundo de Combate à Pobreza)");
    }

    public void setValorTotalFcpSt(final BigDecimal valorTotalFcpSt) {
        this.valorTotalFcpSt = BigDecimalParser.tamanho15Com2CasasDecimais(valorTotalFcpSt,
                "Valor Total do FCP (Fundo de Combate à Pobreza) retido por substituição tributária");
    }

    public void setValorTotalFcpStRetido(final BigDecimal valorTotalFcpStRetido) {
        this.valorTotalFcpStRetido = BigDecimalParser.tamanho15Com2CasasDecimais(valorTotalFcpStRetido,
                "Valor Total do FCP retido anteriormente por Substituição Tributária");
    }

    public void setValorTotalIPIDevolvido(final BigDecimal valorTotalIPIDevolvido) {
        this.valorTotalIPIDevolvido = BigDecimalParser.tamanho15Com2CasasDecimais(valorTotalIPIDevolvido,
                "Valor Total do IPI devolvido");
    }

    public String getBaseCalculoICMS() {
        return this.baseCalculoICMS;
    }

    public String getValorTotalICMS() {
        return this.valorTotalICMS;
    }

    public String getValorICMSDesonerado() {
        return this.valorICMSDesonerado;
    }

    public String getBaseCalculoICMSST() {
        return this.baseCalculoICMSST;
    }

    public String getValorTotalICMSST() {
        return this.valorTotalICMSST;
    }

    public String getValorTotalDosProdutosServicos() {
        return this.valorTotalDosProdutosServicos;
    }

    public String getValorTotalFrete() {
        return this.valorTotalFrete;
    }

    public String getValorTotalSeguro() {
        return this.valorTotalSeguro;
    }

    public String getValorTotalDesconto() {
        return this.valorTotalDesconto;
    }

    public String getValorTotalII() {
        return this.valorTotalII;
    }

    public String getValorTotalIPI() {
        return this.valorTotalIPI;
    }

    public String getValorPIS() {
        return this.valorPIS;
    }

    public String getValorCOFINS() {
        return this.valorCOFINS;
    }

    public String getOutrasDespesasAcessorias() {
        return this.outrasDespesasAcessorias;
    }

    public String getValorTotalNFe() {
        return this.valorTotalNFe;
    }

    public String getValorTotalTributos() {
        return this.valorTotalTributos;
    }

    public String getValorTotalFcp() {
        return this.valorTotalFcp;
    }

    public void setValorICMSFundoCombatePobreza(final BigDecimal valorTotalFcp) {
        this.valorTotalFcp = BigDecimalParser.tamanho15Com2CasasDecimais(valorTotalFcp,
                "Valor ICMS Fundo Combate a Pobreza");
    }

    public String getValorTotalFcpSt() {
        return valorTotalFcpSt;
    }

    public String getValorTotalFcpStRetido() {
        return valorTotalFcpStRetido;
    }

    public String getValorTotalIPIDevolvido() {
        return valorTotalIPIDevolvido;
    }

}