package br.indie.fiscal4j.cte200.classes.cte;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.DFUnidadeFederativa;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "emiDocAnt")
public class CTInfoDocumentoAnteriorEmissor extends DFBase {
    private static final long serialVersionUID = -8415355745574025080L;

    @Element(name = "CNPJ")
    private String cnpj;

    @Element(name = "CPF")
    private String cpf;

    @Element(name = "IE")
    private String inscricaoEstadual;

    @Element(name = "UF")
    private DFUnidadeFederativa uf;

    @Element(name = "xNome")
    private String razaoSocial;

    @ElementList(name = "idDocAnt", inline = true)
    private List<CTInfoDocumentoAnteriorIndentificacao> identificacoesDocumentoAnterior;

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

    public DFUnidadeFederativa getUf() {
        return this.uf;
    }

    public void setUf(final DFUnidadeFederativa uf) {
        this.uf = uf;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(final String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public List<CTInfoDocumentoAnteriorIndentificacao> getIdentificacoesDocumentoAnterior() {
        return this.identificacoesDocumentoAnterior;
    }

    public void setIdentificacoesDocumentoAnterior(final List<CTInfoDocumentoAnteriorIndentificacao> identificacoesDocumentoAnterior) {
        this.identificacoesDocumentoAnterior = identificacoesDocumentoAnterior;
    }

}
