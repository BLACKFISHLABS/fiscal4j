package br.indie.fiscal4j.cte200.classes.cte;

import br.indie.fiscal4j.DFBase;
import org.simpleframework.xml.Element;

public class CTInfoDestinatario extends DFBase {
    private static final long serialVersionUID = 6538067070586588164L;

    @Element(name = "CNPJ", required = false)
    private String cnpj;

    @Element(name = "CPF", required = false)
    private String cpf;

    @Element(name = "IE", required = false)
    private String inscricaoEstadual;

    @Element(name = "xNome")
    private String razaoSocial;

    @Element(name = "fone", required = false)
    private String fone;

    @Element(name = "ISUF", required = false)
    private String iSuf;

    @Element(name = "enderDest")
    private CTInfoEndereco endereco;

    @Element(name = "email", required = false)
    private String email;

    @Element(name = "locEnt", required = false)
    private CTInfoLocalColetaEntrega localEntrega;

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(final String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(final String cpf) {
        this.cpf = cpf;
    }

    public String getInscricaoEstadual() {
        return this.inscricaoEstadual;
    }

    public void setInscricaoEstadual(final String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(final String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getFone() {
        return this.fone;
    }

    public void setFone(final String fone) {
        this.fone = fone;
    }

    public String getiSuf() {
        return this.iSuf;
    }

    public void setiSuf(final String iSuf) {
        this.iSuf = iSuf;
    }

    public CTInfoEndereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(final CTInfoEndereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public CTInfoLocalColetaEntrega getLocalEntrega() {
        return this.localEntrega;
    }

    public void setLocalEntrega(final CTInfoLocalColetaEntrega localEntrega) {
        this.localEntrega = localEntrega;
    }

}
