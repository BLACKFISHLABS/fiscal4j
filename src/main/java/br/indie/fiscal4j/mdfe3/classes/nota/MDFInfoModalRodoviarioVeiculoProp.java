package br.indie.fiscal4j.mdfe3.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.DFUnidadeFederativa;
import br.indie.fiscal4j.mdfe3.classes.def.MDFTipoProprietario;
import org.simpleframework.xml.Element;

public class MDFInfoModalRodoviarioVeiculoProp extends DFBase {
    private static final long serialVersionUID = 6851210038399361723L;

    @Element(name = "CPF", required = false)
    private String cpf;

    @Element(name = "CNPJ", required = false)
    private String cnpj;

    @Element(name = "RNTRC")
    private String registroNacionalTransportes;

    @Element(name = "xNome")
    private String razaoSocial;

    @Element(name = "IE")
    private String inscricaoEstadual;

    @Element(name = "UF")
    private String unidadeFederativa;

    @Element(name = "tpProp", required = false)
    private MDFTipoProprietario tipoProprietario;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRegistroNacionalTransportes() {
        return registroNacionalTransportes;
    }

    public void setRegistroNacionalTransportes(String registroNacionalTransportes) {
        this.registroNacionalTransportes = registroNacionalTransportes;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getUnidadeFederativa() {
        return unidadeFederativa;
    }

    public void setUnidadeFederativa(DFUnidadeFederativa unidadeFederativa) {
        this.unidadeFederativa = unidadeFederativa.getCodigo();
    }

    public MDFTipoProprietario getTipoProprietario() {
        return tipoProprietario;
    }

    public void setTipoProprietario(MDFTipoProprietario tipoProprietario) {
        this.tipoProprietario = tipoProprietario;
    }
}
