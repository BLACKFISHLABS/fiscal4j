package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.DFUnidadeFederativa;
import br.indie.fiscal4j.validadores.IntegerValidador;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Element;

public class NFInfoProdutorRuralReferenciada extends DFBase {
    private static final long serialVersionUID = -2718285687811273188L;

    @Element(name = "cUF", required = true)
    private DFUnidadeFederativa ufEmitente;

    @Element(name = "AAMM", required = true)
    private String anoMesEmissao;

    @Element(name = "CNPJ", required = false)
    private String cnpjEmitente;

    @Element(name = "CPF", required = false)
    private String cpfEmitente;

    @Element(name = "IE", required = true)
    private String ieEmitente;

    @Element(name = "mod", required = true)
    private String modeloDocumentoFiscal;

    @Element(name = "serie", required = true)
    private Integer serieDocumentoFiscal;

    @Element(name = "nNF", required = true)
    private Integer numeroDocumentoFiscal;

    public DFUnidadeFederativa getUfEmitente() {
        return this.ufEmitente;
    }

    public void setUfEmitente(final DFUnidadeFederativa ufEmitente) {
        this.ufEmitente = ufEmitente;
    }

    public String getAnoMesEmissao() {
        return this.anoMesEmissao;
    }

    public void setAnoMesEmissao(final String anoMesEmissao) {
        StringValidador.aamm(anoMesEmissao);
        this.anoMesEmissao = anoMesEmissao;
    }

    public String getCnpjEmitente() {
        return this.cnpjEmitente;
    }

    public void setCnpjEmitente(final String cnpjEmitente) {
        if (this.cpfEmitente != null) {
            throw new IllegalStateException("Nao pode setar CNPJ pois CPF ja esta setado");
        }
        StringValidador.cnpj(cnpjEmitente);
        this.cnpjEmitente = cnpjEmitente;
    }

    public String getCpfEmitente() {
        return this.cpfEmitente;
    }

    public void setCpfEmitente(final String cpfEmitente) {
        if (this.cnpjEmitente != null) {
            throw new IllegalStateException("Nao pode setar CPF pois CNPJ ja esta setado");
        }
        StringValidador.cpf(cpfEmitente);
        this.cpfEmitente = cpfEmitente;
    }

    public String getIeEmitente() {
        return this.ieEmitente;
    }

    public void setIeEmitente(final String ieEmitente) {
        StringValidador.inscricaoEstadual(ieEmitente);
        this.ieEmitente = ieEmitente;
    }

    public String getModeloDocumentoFiscal() {
        return this.modeloDocumentoFiscal;
    }

    public void setModeloDocumentoFiscal(final String modeloDocumentoFiscal) {
        StringValidador.exatamente2(modeloDocumentoFiscal, "Modelo Documento Fiscal");
        this.modeloDocumentoFiscal = modeloDocumentoFiscal;
    }

    public Integer getSerieDocumentoFiscal() {
        return this.serieDocumentoFiscal;
    }

    public void setSerieDocumentoFiscal(final Integer serieDocumentoFiscal) {
        IntegerValidador.tamanho3(serieDocumentoFiscal, "Serie Documento Fiscal");
        this.serieDocumentoFiscal = serieDocumentoFiscal;
    }

    public Integer getNumeroDocumentoFiscal() {
        return this.numeroDocumentoFiscal;
    }

    /**
     * Número do Documento Fiscal - 1 – 999999999
     *
     * @param numeroDocumentoFiscal
     */
    public void setNumeroDocumentoFiscal(final Integer numeroDocumentoFiscal) {
        IntegerValidador.tamanho9(numeroDocumentoFiscal, "Numero Documento Fiscal");
        this.numeroDocumentoFiscal = numeroDocumentoFiscal;
    }
}