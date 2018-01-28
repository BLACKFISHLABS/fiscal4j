package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.DFUnidadeFederativa;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Element;

public class NFNotaInfoTransportador extends DFBase {
    private static final long serialVersionUID = -6810459713123616929L;

    @Element(name = "CNPJ", required = false)
    private String cnpj;

    @Element(name = "CPF", required = false)
    private String cpf;

    @Element(name = "xNome", required = false)
    private String razaoSocial;

    @Element(name = "IE", required = false)
    private String inscricaoEstadual;

    @Element(name = "xEnder", required = false)
    private String enderecoComplemento;

    @Element(name = "xMun", required = false)
    private String nomeMunicipio;

    @Element(name = "UF", required = false)
    private String uf;

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(final String cnpj) {
        if (this.cpf != null) {
            throw new IllegalStateException("Nao pode ter CPF e CNPJ ao mesmo tempo");
        }
        StringValidador.cnpj(cnpj);
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(final String cpf) {
        if (this.cnpj != null) {
            throw new IllegalStateException("Nao pode ter CPF e CNPJ ao mesmo tempo");
        }
        StringValidador.cpf(cpf);
        this.cpf = cpf;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(final String razaoSocial) {
        StringValidador.tamanho60(razaoSocial, "Razao Social Transportador");
        this.razaoSocial = razaoSocial;
    }

    public String getInscricaoEstadual() {
        return this.inscricaoEstadual;
    }

    public void setInscricaoEstadual(final String inscricaoEstadual) {
        StringValidador.inscricaoEstadual(inscricaoEstadual);
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getEnderecoComplemento() {
        return this.enderecoComplemento;
    }

    public void setEnderecoComplemento(final String enderecoComplemento) {
        this.enderecoComplemento = enderecoComplemento;
    }

    public String getNomeMunicipio() {
        return this.nomeMunicipio;
    }

    public void setNomeMunicipio(final String nomeMunicipio) {
        StringValidador.tamanho60(nomeMunicipio, "Nome Municipio Transportador");
        this.nomeMunicipio = nomeMunicipio;
    }

    public String getUf() {
        return this.uf;
    }

    public void setUf(final DFUnidadeFederativa uf) {
        this.uf = uf.getCodigo();
    }
}