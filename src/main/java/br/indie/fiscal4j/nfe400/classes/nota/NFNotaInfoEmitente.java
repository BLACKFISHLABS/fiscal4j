package br.indie.fiscal4j.nfe400.classes.nota;

import org.simpleframework.xml.Element;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.nfe400.classes.NFEndereco;
import br.indie.fiscal4j.nfe400.classes.NFRegimeTributario;
import br.indie.fiscal4j.validadores.StringValidador;

public class NFNotaInfoEmitente extends DFBase {
    private static final long serialVersionUID = -2236869565066526162L;

    @Element(name = "CNPJ", required = false)
    private String cnpj;

    @Element(name = "CPF", required = false)
    private String cpf;

    @Element(name = "xNome", required = true)
    private String razaoSocial;

    @Element(name = "xFant", required = false)
    private String nomeFantasia;

    @Element(name = "enderEmit", required = true)
    private NFEndereco endereco;

    @Element(name = "IE", required = true)
    private String inscricaoEstadual;

    @Element(name = "IEST", required = false)
    private String inscricaoEstadualSubstituicaoTributaria;

    @Element(name = "IM", required = false)
    private String inscricaoMunicipal;

    @Element(name = "CNAE", required = false)
    private String classificacaoNacionalAtividadesEconomicas;

    @Element(name = "CRT", required = true)
    private NFRegimeTributario regimeTributario;

    public void setCnpj(final String cnpj) {
        if (this.cpf != null && cnpj != null) {
            throw new IllegalStateException("Nao pode setar CNPJ caso CPF esteja setado");
        }
        StringValidador.cnpj(cnpj);
        this.cnpj = cnpj;
    }

    public void setCpf(final String cpf) {
        if (this.cnpj != null && cpf != null) {
            throw new IllegalStateException("Nao pode setar CPF caso CNPJ esteja setado");
        }
        StringValidador.cpf(cpf);
        this.cpf = cpf;
    }

    public void setRazaoSocial(final String razaoSocial) {
        StringValidador.tamanho60(razaoSocial, "Razao Social Emitente");
        this.razaoSocial = razaoSocial;
    }

    public void setNomeFantasia(final String nomeFantasia) {
        StringValidador.tamanho60(nomeFantasia, "Nome Fantasia Emitente");
        this.nomeFantasia = nomeFantasia;
    }

    public void setEndereco(final NFEndereco endereco) {
        this.endereco = endereco;
    }

    public void setInscricaoEstadual(final String inscricaoEstadual) {
        StringValidador.inscricaoEstadual(inscricaoEstadual);
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public void setInscricaoEstadualSubstituicaoTributaria(final String inscricaoEstadualSubstituicaoTributaria) {
        StringValidador.inscricaoEstadualSemIsencao(inscricaoEstadualSubstituicaoTributaria);
        this.inscricaoEstadualSubstituicaoTributaria = inscricaoEstadualSubstituicaoTributaria;
    }

    public void setInscricaoMunicipal(final String inscricaoMunicipal) {
        StringValidador.tamanho15(inscricaoMunicipal, "IM Emitente");
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public void setClassificacaoNacionalAtividadesEconomicas(final String classificacaoNacionalAtividadesEconomicas) {
        StringValidador.exatamente7N(classificacaoNacionalAtividadesEconomicas, "CNAE Emitente");
        this.classificacaoNacionalAtividadesEconomicas = classificacaoNacionalAtividadesEconomicas;
    }

    public void setRegimeTributario(final NFRegimeTributario regimeTributario) {
        this.regimeTributario = regimeTributario;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public NFEndereco getEndereco() {
        return this.endereco;
    }

    public String getInscricaoEstadual() {
        return this.inscricaoEstadual;
    }

    public String getInscricaoEstadualSubstituicaoTributaria() {
        return this.inscricaoEstadualSubstituicaoTributaria;
    }

    public String getInscricaoMunicipal() {
        return this.inscricaoMunicipal;
    }

    public String getClassificacaoNacionalAtividadesEconomicas() {
        return this.classificacaoNacionalAtividadesEconomicas;
    }

    public NFRegimeTributario getRegimeTributario() {
        return this.regimeTributario;
    }
}