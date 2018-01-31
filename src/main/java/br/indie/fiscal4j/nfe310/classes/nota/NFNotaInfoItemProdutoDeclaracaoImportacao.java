package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.DFUnidadeFederativa;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import br.indie.fiscal4j.validadores.StringValidador;
import org.joda.time.LocalDate;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.math.BigDecimal;
import java.util.List;

public class NFNotaInfoItemProdutoDeclaracaoImportacao extends DFBase {
    private static final long serialVersionUID = 4173954108879768633L;

    @Element(name = "nDI", required = true)
    private String numeroRegistro;

    @Element(name = "dDI", required = true)
    private LocalDate dataRegistro;

    @Element(name = "xLocDesemb", required = true)
    private String localDesembaraco;

    @Element(name = "UFDesemb", required = true)
    private String ufDesembaraco;

    @Element(name = "dDesemb", required = true)
    private LocalDate dataDesembaraco;

    @Element(name = "tpViaTransp", required = true)
    private NFViaTransporteInternacional transporteInternacional;

    @Element(name = "vAFRMM", required = false)
    private String valorAFRMM;

    @Element(name = "tpIntermedio", required = true)
    private NFFormaImportacaoIntermediacao formaImportacaoIntermediacao;

    @Element(name = "CNPJ", required = false)
    private String cnpj;

    @Element(name = "UFTerceiro", required = false)
    private String ufTerceiro;

    @Element(name = "cExportador", required = true)
    private String codigoExportador;

    @ElementList(entry = "adi", inline = true, required = true)
    private List<NFNotaInfoItemProdutoDeclaracaoImportacaoAdicao> adicoes;

    public String getNumeroRegistro() {
        return this.numeroRegistro;
    }

    public void setNumeroRegistro(final String numeroRegistro) {
        StringValidador.tamanho12(numeroRegistro, "Numero Registro Declaracao Importacao");
        this.numeroRegistro = numeroRegistro;
    }

    public LocalDate getDataRegistro() {
        return this.dataRegistro;
    }

    public void setDataRegistro(final LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public String getLocalDesembaraco() {
        return this.localDesembaraco;
    }

    public void setLocalDesembaraco(final String localDesembaraco) {
        StringValidador.tamanho60(localDesembaraco, "Desembaraco Declaracao Importacao");
        this.localDesembaraco = localDesembaraco;
    }

    public String getUfDesembaraco() {
        return this.ufDesembaraco;
    }

    public void setUfDesembaraco(final DFUnidadeFederativa ufDesembaraco) {
        this.ufDesembaraco = ufDesembaraco.getCodigo();
    }

    public LocalDate getDataDesembaraco() {
        return this.dataDesembaraco;
    }

    public void setDataDesembaraco(final LocalDate dataDesembaraco) {
        this.dataDesembaraco = dataDesembaraco;
    }

    public NFViaTransporteInternacional getTransporteInternacional() {
        return this.transporteInternacional;
    }

    public void setTransporteInternacional(final NFViaTransporteInternacional transporteInternacional) {
        this.transporteInternacional = transporteInternacional;
    }

    public String getValorAFRMM() {
        return this.valorAFRMM;
    }

    public void setValorAFRMM(final BigDecimal valorAFRMM) {
        this.valorAFRMM = BigDecimalParser.tamanho15Com2CasasDecimais(valorAFRMM, "Valor AFRMM Declaracao Importacao");
    }

    public NFFormaImportacaoIntermediacao getFormaImportacaoIntermediacao() {
        return this.formaImportacaoIntermediacao;
    }

    public void setFormaImportacaoIntermediacao(final NFFormaImportacaoIntermediacao formaImportacaoIntermediacao) {
        this.formaImportacaoIntermediacao = formaImportacaoIntermediacao;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(final String cnpj) {
        StringValidador.cnpj(cnpj);
        this.cnpj = cnpj;
    }

    public String getUfTerceiro() {
        return this.ufTerceiro;
    }

    public void setUfTerceiro(final DFUnidadeFederativa ufTerceiro) {
        this.ufTerceiro = ufTerceiro.getCodigo();
    }

    public String getCodigoExportador() {
        return this.codigoExportador;
    }

    public void setCodigoExportador(final String codigoExportador) {
        StringValidador.tamanho60(codigoExportador, "Codigo Exportador Declaracao Importacao");
        this.codigoExportador = codigoExportador;
    }

    public List<NFNotaInfoItemProdutoDeclaracaoImportacaoAdicao> getAdicoes() {
        return this.adicoes;
    }

    public void setAdicoes(final List<NFNotaInfoItemProdutoDeclaracaoImportacaoAdicao> adicoes) {
        this.adicoes = adicoes;
    }
}