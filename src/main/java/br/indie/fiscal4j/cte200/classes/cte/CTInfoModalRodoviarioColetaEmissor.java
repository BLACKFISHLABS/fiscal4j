package br.indie.fiscal4j.cte200.classes.cte;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.DFUnidadeFederativa;
import org.simpleframework.xml.Element;

public class CTInfoModalRodoviarioColetaEmissor extends DFBase {
    private static final long serialVersionUID = 611625457516005270L;

    @Element(name = "CNPJ")
    private String cnpj;

    @Element(name = "cInt", required = false)
    private String codigoInterno;

    @Element(name = "IE")
    private String inscricaoEstadual;

    @Element(name = "UF")
    private DFUnidadeFederativa unidadeFederativa;

    @Element(name = "fone", required = false)
    private String fone;

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(final String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCodigoInterno() {
        return this.codigoInterno;
    }

    public void setCodigoInterno(final String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public String getInscricaoEstadual() {
        return this.inscricaoEstadual;
    }

    public void setInscricaoEstadual(final String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public DFUnidadeFederativa getUnidadeFederativa() {
        return this.unidadeFederativa;
    }

    public void setUnidadeFederativa(final DFUnidadeFederativa unidadeFederativa) {
        this.unidadeFederativa = unidadeFederativa;
    }

    public String getFone() {
        return this.fone;
    }

    public void setFone(final String fone) {
        this.fone = fone;
    }

}
