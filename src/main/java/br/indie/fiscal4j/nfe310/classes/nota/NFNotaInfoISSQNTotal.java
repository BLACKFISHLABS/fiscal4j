package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import org.joda.time.LocalDate;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NFNotaInfoISSQNTotal extends DFBase {
    private static final long serialVersionUID = 5902409212301825888L;

    @Element(name = "vServ", required = false)
    private String valorTotalServicosSobNaoIncidenciaNaoTributadosICMS;

    @Element(name = "vBC", required = false)
    private String baseCalculoISS;

    @Element(name = "vISS", required = false)
    private String valorTotalISS;

    @Element(name = "vPIS", required = false)
    private String valorPISsobreServicos;

    @Element(name = "vCOFINS", required = false)
    private String valorCOFINSsobreServicos;

    @Element(name = "dCompet", required = true)
    private LocalDate dataPrestacaoServico;

    @Element(name = "vDeducao", required = false)
    private String valorDeducao;

    @Element(name = "vOutro", required = false)
    private String valorOutros;

    @Element(name = "vDescIncond", required = false)
    private String valorTotalDescontoIncondicionado;

    @Element(name = "vDescCond", required = false)
    private String valorTotalDescontoCondicionado;

    @Element(name = "vISSRet", required = false)
    private String valorTotalRetencaoISS;

    @Element(name = "cRegTrib", required = false)
    private NFNotaInfoRegimeEspecialTributacao tributacao;

    public String getValorTotalServicosSobNaoIncidenciaNaoTributadosICMS() {
        return this.valorTotalServicosSobNaoIncidenciaNaoTributadosICMS;
    }

    public void setValorTotalServicosSobNaoIncidenciaNaoTributadosICMS(final BigDecimal valorTotalServicosSobNaoIncidenciaNaoTributadosICMS) {
        this.valorTotalServicosSobNaoIncidenciaNaoTributadosICMS = BigDecimalParser.tamanho15Com2CasasDecimais(valorTotalServicosSobNaoIncidenciaNaoTributadosICMS, "Valor Total Servicos Sob Nao Incidencia Nao Tributados ICMS");
    }

    public String getBaseCalculoISS() {
        return this.baseCalculoISS;
    }

    public void setBaseCalculoISS(final BigDecimal baseCalculoISS) {
        this.baseCalculoISS = BigDecimalParser.tamanho15Com2CasasDecimais(baseCalculoISS, "Base de Calculo ISS Total");
    }

    public String getValorTotalISS() {
        return this.valorTotalISS;
    }

    public void setValorTotalISS(final BigDecimal valorTotalISS) {
        this.valorTotalISS = BigDecimalParser.tamanho15Com2CasasDecimais(valorTotalISS, "Valor Total ISS");
    }

    public String getValorPISsobreServicos() {
        return this.valorPISsobreServicos;
    }

    public void setValorPISsobreServicos(final BigDecimal valorPISsobreServicos) {
        this.valorPISsobreServicos = BigDecimalParser.tamanho15Com2CasasDecimais(valorPISsobreServicos, "Valor Total PIS Sobre Servicos");
    }

    public String getValorCOFINSsobreServicos() {
        return this.valorCOFINSsobreServicos;
    }

    public void setValorCOFINSsobreServicos(final BigDecimal valorCOFINSsobreServicos) {
        this.valorCOFINSsobreServicos = BigDecimalParser.tamanho15Com2CasasDecimais(valorCOFINSsobreServicos, "Valor Total COFINS Sobre Servicos");
    }

    public LocalDate getDataPrestacaoServico() {
        return this.dataPrestacaoServico;
    }

    public void setDataPrestacaoServico(final LocalDate dataPrestacaoServico) {
        this.dataPrestacaoServico = dataPrestacaoServico;
    }

    public String getValorDeducao() {
        return this.valorDeducao;
    }

    public void setValorDeducao(final BigDecimal valorDeducao) {
        this.valorDeducao = BigDecimalParser.tamanho15Com2CasasDecimais(valorDeducao, "Valor Total Deducao");
    }

    public String getValorOutros() {
        return this.valorOutros;
    }

    public void setValorOutros(final BigDecimal valorOutros) {
        this.valorOutros = BigDecimalParser.tamanho15Com2CasasDecimais(valorOutros, "Valor Total Outros");
    }

    public String getValorTotalDescontoIncondicionado() {
        return this.valorTotalDescontoIncondicionado;
    }

    public void setValorTotalDescontoIncondicionado(final BigDecimal valorTotalDescontoIncondicionado) {
        this.valorTotalDescontoIncondicionado = BigDecimalParser.tamanho15Com2CasasDecimais(valorTotalDescontoIncondicionado, "Valor Total Desconto Incondicionado");
    }

    public String getValorTotalDescontoCondicionado() {
        return this.valorTotalDescontoCondicionado;
    }

    public void setValorTotalDescontoCondicionado(final BigDecimal valorTotalDescontoCondicionado) {
        this.valorTotalDescontoCondicionado = BigDecimalParser.tamanho15Com2CasasDecimais(valorTotalDescontoCondicionado, "Valor Total Desconto Condicionado");
    }

    public String getValorTotalRetencaoISS() {
        return this.valorTotalRetencaoISS;
    }

    public void setValorTotalRetencaoISS(final BigDecimal valorTotalRetencaoISS) {
        this.valorTotalRetencaoISS = BigDecimalParser.tamanho15Com2CasasDecimais(valorTotalRetencaoISS, "Valor Total Retencao ISS");
    }

    public NFNotaInfoRegimeEspecialTributacao getTributacao() {
        return this.tributacao;
    }

    public void setTributacao(final NFNotaInfoRegimeEspecialTributacao tributacao) {
        this.tributacao = tributacao;
    }
}