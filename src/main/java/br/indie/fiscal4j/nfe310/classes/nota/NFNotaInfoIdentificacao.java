package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFAmbiente;
import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.DFModelo;
import br.indie.fiscal4j.DFUnidadeFederativa;
import br.indie.fiscal4j.nfe310.classes.*;
import br.indie.fiscal4j.validadores.IntegerValidador;
import br.indie.fiscal4j.validadores.ListValidador;
import br.indie.fiscal4j.validadores.StringValidador;
import org.joda.time.DateTime;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

public class NFNotaInfoIdentificacao extends DFBase {
    private static final long serialVersionUID = -2568396066960865875L;

    @Element(name = "cUF", required = true)
    private DFUnidadeFederativa uf;

    @Element(name = "cNF", required = true)
    private String codigoRandomico;

    @Element(name = "natOp", required = true)
    private String naturezaOperacao;

    @Element(name = "indPag", required = true)
    private NFFormaPagamentoPrazo formaPagamento;

    @Element(name = "mod", required = true)
    private DFModelo modelo;

    @Element(name = "serie", required = true)
    private String serie;

    @Element(name = "nNF", required = true)
    private String numeroNota;

    @Element(name = "dhEmi", required = true)
    private DateTime dataHoraEmissao;

    @Element(name = "dhSaiEnt", required = false)
    private DateTime dataHoraSaidaOuEntrada;

    @Element(name = "tpNF", required = true)
    private NFTipo tipo;

    @Element(name = "idDest", required = true)
    private NFIdentificadorLocalDestinoOperacao identificadorLocalDestinoOperacao;

    @Element(name = "cMunFG", required = true)
    private String codigoMunicipio;

    @Element(name = "tpImp", required = true)
    private NFTipoImpressao tipoImpressao;

    @Element(name = "tpEmis", required = true)
    private NFTipoEmissao tipoEmissao;

    @Element(name = "cDV", required = true)
    private Integer digitoVerificador;

    @Element(name = "tpAmb", required = true)
    private DFAmbiente ambiente;

    @Element(name = "finNFe", required = true)
    private NFFinalidade finalidade;

    @Element(name = "indFinal", required = true)
    private NFOperacaoConsumidorFinal operacaoConsumidorFinal;

    @Element(name = "indPres", required = true)
    private NFIndicadorPresencaComprador indicadorPresencaComprador;

    @Element(name = "procEmi", required = true)
    private NFProcessoEmissor programaEmissor;

    @Element(name = "verProc", required = true)
    private String versaoEmissor;

    @Element(name = "dhCont", required = false)
    private DateTime dataHoraContigencia;

    @Element(name = "xJust", required = false)
    private String justificativaEntradaContingencia;

    @ElementList(entry = "NFref", inline = true, required = false)
    private List<NFInfoReferenciada> referenciadas;

    public DFUnidadeFederativa getUf() {
        return this.uf;
    }

    public void setUf(final DFUnidadeFederativa uf) {
        this.uf = uf;
    }

    public String getCodigoRandomico() {
        return this.codigoRandomico;
    }

    public void setCodigoRandomico(final String codigoRandomico) {
        StringValidador.exatamente8(codigoRandomico, "Codigo Randomico");
        this.codigoRandomico = codigoRandomico;
    }

    public String getNaturezaOperacao() {
        return this.naturezaOperacao;
    }

    public void setNaturezaOperacao(final String naturezaOperacao) {
        StringValidador.tamanho60(naturezaOperacao, "Natureza da Operacao");
        this.naturezaOperacao = naturezaOperacao;
    }

    public NFFormaPagamentoPrazo getFormaPagamento() {
        return this.formaPagamento;
    }

    public void setFormaPagamento(final NFFormaPagamentoPrazo formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public DFModelo getModelo() {
        return this.modelo;
    }

    public void setModelo(final DFModelo modelo) {
        this.modelo = modelo;
    }

    public String getSerie() {
        return this.serie;
    }

    public void setSerie(final String serie) {
        StringValidador.tamanho3(serie, "Serie");
        this.serie = serie;
    }

    public String getNumeroNota() {
        return this.numeroNota;
    }

    public void setNumeroNota(final String numeroNota) {
        StringValidador.tamanho9(numeroNota, "Numero da Nota");
        this.numeroNota = numeroNota;
    }

    public DateTime getDataHoraEmissao() {
        return this.dataHoraEmissao;
    }

    public void setDataHoraEmissao(final DateTime dataEmissao) {
        this.dataHoraEmissao = dataEmissao;
    }

    public DateTime getDataHoraSaidaOuEntrada() {
        return this.dataHoraSaidaOuEntrada;
    }

    public void setDataHoraSaidaOuEntrada(final DateTime dataHoraSaidaOuEntrada) {
        this.dataHoraSaidaOuEntrada = dataHoraSaidaOuEntrada;
    }

    public NFTipo getTipo() {
        return this.tipo;
    }

    public void setTipo(final NFTipo tipo) {
        this.tipo = tipo;
    }

    public NFIdentificadorLocalDestinoOperacao getIdentificadorLocalDestinoOperacao() {
        return this.identificadorLocalDestinoOperacao;
    }

    public void setIdentificadorLocalDestinoOperacao(final NFIdentificadorLocalDestinoOperacao identificadorLocalDestinoOperacao) {
        this.identificadorLocalDestinoOperacao = identificadorLocalDestinoOperacao;
    }

    public String getCodigoMunicipio() {
        return this.codigoMunicipio;
    }

    public void setCodigoMunicipio(final String codigoMunicipio) {
        StringValidador.exatamente7N(codigoMunicipio, "Codigo Municipio");
        this.codigoMunicipio = codigoMunicipio;
    }

    public NFTipoImpressao getTipoImpressao() {
        return this.tipoImpressao;
    }

    public void setTipoImpressao(final NFTipoImpressao tipoImpressao) {
        this.tipoImpressao = tipoImpressao;
    }

    public NFTipoEmissao getTipoEmissao() {
        return this.tipoEmissao;
    }

    public void setTipoEmissao(final NFTipoEmissao tipoEmissao) {
        this.tipoEmissao = tipoEmissao;
    }

    public Integer getDigitoVerificador() {
        return this.digitoVerificador;
    }

    public void setDigitoVerificador(final Integer digitoVerificador) {
        IntegerValidador.exatamente1(digitoVerificador, "DV");
        this.digitoVerificador = digitoVerificador;
    }

    public DFAmbiente getAmbiente() {
        return this.ambiente;
    }

    public void setAmbiente(final DFAmbiente ambiente) {
        this.ambiente = ambiente;
    }

    public NFFinalidade getFinalidade() {
        return this.finalidade;
    }

    public void setFinalidade(final NFFinalidade finalidade) {
        this.finalidade = finalidade;
    }

    public NFOperacaoConsumidorFinal getOperacaoConsumidorFinal() {
        return this.operacaoConsumidorFinal;
    }

    public void setOperacaoConsumidorFinal(final NFOperacaoConsumidorFinal operacaoConsumidorFinal) {
        this.operacaoConsumidorFinal = operacaoConsumidorFinal;
    }

    public NFIndicadorPresencaComprador getIndicadorPresencaComprador() {
        return this.indicadorPresencaComprador;
    }

    public void setIndicadorPresencaComprador(final NFIndicadorPresencaComprador indicadorPresencaComprador) {
        this.indicadorPresencaComprador = indicadorPresencaComprador;
    }

    public NFProcessoEmissor getProgramaEmissor() {
        return this.programaEmissor;
    }

    public void setProgramaEmissor(final NFProcessoEmissor programaEmissor) {
        this.programaEmissor = programaEmissor;
    }

    public String getVersaoEmissor() {
        return this.versaoEmissor;
    }

    public void setVersaoEmissor(final String versaoEmissor) {
        StringValidador.tamanho20(versaoEmissor, "Versao Emissor");
        this.versaoEmissor = versaoEmissor;
    }

    public DateTime getDataHoraContigencia() {
        return this.dataHoraContigencia;
    }

    public void setDataHoraContigencia(final DateTime dataHoraContigencia) {
        this.dataHoraContigencia = dataHoraContigencia;
    }

    public String getJustificativaEntradaContingencia() {
        return this.justificativaEntradaContingencia;
    }

    public void setJustificativaEntradaContingencia(final String justificativaEntradaContingencia) {
        StringValidador.tamanho15a256(justificativaEntradaContingencia, "Justificativa Entrada Contingencia");
        this.justificativaEntradaContingencia = justificativaEntradaContingencia;
    }

    public List<NFInfoReferenciada> getReferenciadas() {
        return this.referenciadas;
    }

    public void setReferenciadas(final List<NFInfoReferenciada> referenciadas) {
        ListValidador.tamanho500(referenciadas, "Referenciadas");
        this.referenciadas = referenciadas;
    }
}