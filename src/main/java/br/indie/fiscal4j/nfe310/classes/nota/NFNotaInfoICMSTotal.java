package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.BigDecimalValidador;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NFNotaInfoICMSTotal extends DFBase {
    private static final long serialVersionUID = 1644701343314788528L;

    @Element(name = "vBC")
    private String baseCalculoICMS;

    @Element(name = "vICMS")
    private String valorTotalICMS;

    @Element(name = "vICMSDeson")
    private String valorICMSDesonerado;

    @Element(name = "vFCPUFDest", required = false)
    private String valorICMSFundoCombatePobreza;

    @Element(name = "vICMSUFDest", required = false)
    private String valorICMSPartilhaDestinatario;

    @Element(name = "vICMSUFRemet", required = false)
    private String valorICMSPartilhaRementente;

    @Element(name = "vBCST")
    private String baseCalculoICMSST;

    @Element(name = "vST")
    private String valorTotalICMSST;

    @Element(name = "vProd")
    private String valorTotalDosProdutosServicos;

    @Element(name = "vFrete")
    private String valorTotalFrete;

    @Element(name = "vSeg")
    private String valorTotalSeguro;

    @Element(name = "vDesc")
    private String valorTotalDesconto;

    @Element(name = "vII")
    private String valorTotalII;

    @Element(name = "vIPI")
    private String valorTotalIPI;

    @Element(name = "vPIS")
    private String valorPIS;

    @Element(name = "vCOFINS")
    private String valorCOFINS;

    @Element(name = "vOutro")
    private String outrasDespesasAcessorias;

    @Element(name = "vNF")
    private String valorTotalNFe;

    @Element(name = "vTotTrib", required = false)
    private String valorTotalTributos;

    public void setBaseCalculoICMS(final BigDecimal baseCalculoICMS) {
        this.baseCalculoICMS = BigDecimalValidador.tamanho15Com2CasasDecimais(baseCalculoICMS, "Base de Calculo ICMS Total");
    }

    public void setValorTotalICMS(final BigDecimal valorTotalICMS) {
        this.valorTotalICMS = BigDecimalValidador.tamanho15Com2CasasDecimais(valorTotalICMS, "Valalor Total ICMS");
    }

    public void setBaseCalculoICMSST(final BigDecimal baseCalculoICMSST) {
        this.baseCalculoICMSST = BigDecimalValidador.tamanho15Com2CasasDecimais(baseCalculoICMSST, "Base de Calculo ICMS ST Total");
    }

    public void setValorTotalICMSST(final BigDecimal valorTotalICMSST) {
        this.valorTotalICMSST = BigDecimalValidador.tamanho15Com2CasasDecimais(valorTotalICMSST, "Valor Total ICMS ST");
    }

    public void setValorTotalDosProdutosServicos(final BigDecimal valorTotalDosProdutosServicos) {
        this.valorTotalDosProdutosServicos = BigDecimalValidador.tamanho15Com2CasasDecimais(valorTotalDosProdutosServicos, "Valor Total Produtos e Servicos");
    }

    public void setValorTotalFrete(final BigDecimal valorTotalFrete) {
        this.valorTotalFrete = BigDecimalValidador.tamanho15Com2CasasDecimais(valorTotalFrete, "Valor Total Frete");
    }

    public void setValorTotalSeguro(final BigDecimal valorTotalSeguro) {
        this.valorTotalSeguro = BigDecimalValidador.tamanho15Com2CasasDecimais(valorTotalSeguro, "Valor Total Seguro");
    }

    public void setValorTotalDesconto(final BigDecimal valorTotalDesconto) {
        this.valorTotalDesconto = BigDecimalValidador.tamanho15Com2CasasDecimais(valorTotalDesconto, "Valor Total Desconto");
    }

    public void setValorTotalII(final BigDecimal valorTotalII) {
        this.valorTotalII = BigDecimalValidador.tamanho15Com2CasasDecimais(valorTotalII, "Valor Total II");
    }

    public void setValorTotalIPI(final BigDecimal valorTotalIPI) {
        this.valorTotalIPI = BigDecimalValidador.tamanho15Com2CasasDecimais(valorTotalIPI, "Valor Total IPI");
    }

    public void setValorPIS(final BigDecimal valorPIS) {
        this.valorPIS = BigDecimalValidador.tamanho15Com2CasasDecimais(valorPIS, "Valor Total PIS");
    }

    public void setValorCOFINS(final BigDecimal valorCOFINS) {
        this.valorCOFINS = BigDecimalValidador.tamanho15Com2CasasDecimais(valorCOFINS, "Valor Total COFINS");
    }

    public void setOutrasDespesasAcessorias(final BigDecimal outrasDespesasAcessorias) {
        this.outrasDespesasAcessorias = BigDecimalValidador.tamanho15Com2CasasDecimais(outrasDespesasAcessorias, "Outras Despesas Acessorias");
    }

    public void setValorTotalNFe(final BigDecimal valorTotalNFe) {
        this.valorTotalNFe = BigDecimalValidador.tamanho15Com2CasasDecimais(valorTotalNFe, "Valor Total NFe");
    }

    public void setValorTotalTributos(final BigDecimal valorTotalTributos) {
        this.valorTotalTributos = BigDecimalValidador.tamanho15Com2CasasDecimais(valorTotalTributos, "Valor Total Tributos");
    }

    public void setValorICMSDesonerado(final BigDecimal valorICMSDesonerado) {
        this.valorICMSDesonerado = BigDecimalValidador.tamanho15Com2CasasDecimais(valorICMSDesonerado, "Valor ICMS Desonerado");
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

    public String getValorICMSFundoCombatePobreza() {
        return this.valorICMSFundoCombatePobreza;
    }

    public void setValorICMSFundoCombatePobreza(final BigDecimal valorICMSFundoCombatePobreza) {
        this.valorICMSFundoCombatePobreza = BigDecimalValidador.tamanho15Com2CasasDecimais(valorICMSFundoCombatePobreza, "Valor ICMS Fundo Combate a Pobreza");
    }

    public String getValorICMSPartilhaDestinatario() {
        return this.valorICMSPartilhaDestinatario;
    }

    public void setValorICMSPartilhaDestinatario(final BigDecimal valorICMSPartilhaDestinatario) {
        this.valorICMSPartilhaDestinatario = BigDecimalValidador.tamanho15Com2CasasDecimais(valorICMSPartilhaDestinatario, "Valor ICMS Partilha Destinatario");
    }

    public String getValorICMSPartilhaRementente() {
        return this.valorICMSPartilhaRementente;
    }

    public void setValorICMSPartilhaRementente(final BigDecimal valorICMSPartilhaRementente) {
        this.valorICMSPartilhaRementente = BigDecimalValidador.tamanho15Com2CasasDecimais(valorICMSPartilhaRementente, "Valor ICMS Partilha Remetente");
    }
}