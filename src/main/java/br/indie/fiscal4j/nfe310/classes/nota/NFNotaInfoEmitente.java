package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.nfe310.classes.NFEndereco;
import br.indie.fiscal4j.nfe310.classes.NFRegimeTributario;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Element;

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

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(final String cnpj) {
        if (this.cpf != null && cnpj != null) {
            throw new IllegalStateException("Nao pode setar CNPJ caso CPF esteja setado");
        }
        StringValidador.cnpj(cnpj);
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(final String cpf) {
        if (this.cnpj != null && cpf != null) {
            throw new IllegalStateException("Nao pode setar CPF caso CNPJ esteja setado");
        }
        StringValidador.cpf(cpf);
        this.cpf = cpf;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(final String razaoSocial) {
        StringValidador.tamanho60(razaoSocial, "Razao Social Emitente");
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public void setNomeFantasia(final String nomeFantasia) {
        StringValidador.tamanho60(nomeFantasia, "Nome Fantasia Emitente");
        this.nomeFantasia = nomeFantasia;
    }

    public NFEndereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(final NFEndereco endereco) {
        this.endereco = endereco;
    }

    public String getInscricaoEstadual() {
        return this.inscricaoEstadual;
    }

    public void setInscricaoEstadual(final String inscricaoEstadual) {
        StringValidador.inscricaoEstadual(inscricaoEstadual);
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getInscricaoEstadualSubstituicaoTributaria() {
        return this.inscricaoEstadualSubstituicaoTributaria;
    }

    public void setInscricaoEstadualSubstituicaoTributaria(final String inscricaoEstadualSubstituicaoTributaria) {
        StringValidador.inscricaoEstadualSemIsencao(inscricaoEstadualSubstituicaoTributaria);
        this.inscricaoEstadualSubstituicaoTributaria = inscricaoEstadualSubstituicaoTributaria;
    }

    public String getInscricaoMunicipal() {
        return this.inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(final String inscricaoMunicipal) {
        StringValidador.tamanho15(inscricaoMunicipal, "IM Emitente");
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public String getClassificacaoNacionalAtividadesEconomicas() {
        return this.classificacaoNacionalAtividadesEconomicas;
    }

    public void setClassificacaoNacionalAtividadesEconomicas(final String classificacaoNacionalAtividadesEconomicas) {
        StringValidador.exatamente7N(classificacaoNacionalAtividadesEconomicas, "CNAE Emitente");
        this.classificacaoNacionalAtividadesEconomicas = classificacaoNacionalAtividadesEconomicas;
    }

    public NFRegimeTributario getRegimeTributario() {
        return this.regimeTributario;
    }

    public void setRegimeTributario(final NFRegimeTributario regimeTributario) {
        this.regimeTributario = regimeTributario;
    }
}