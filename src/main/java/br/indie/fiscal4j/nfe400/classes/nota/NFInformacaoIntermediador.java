package br.indie.fiscal4j.nfe400.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.DFStringValidador;
import org.simpleframework.xml.Element;

public class NFInformacaoIntermediador extends DFBase {

    private static final long serialVersionUID = 6503767013114482248L;

    @Element(name = "CNPJ", required = true)
    private String cnpj;

    @Element(name = "idCadIntTran", required = true)
    private String idCadIntTran;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        DFStringValidador.cnpj(cnpj);
        this.cnpj = cnpj;
    }

    public String getIdCadIntTran() {
        return idCadIntTran;
    }

    public void setIdCadIntTran(String idCadIntTran) {
        DFStringValidador.tamanho2ate60(idCadIntTran, "idCadIntTran");
        this.idCadIntTran = idCadIntTran;
    }
}
