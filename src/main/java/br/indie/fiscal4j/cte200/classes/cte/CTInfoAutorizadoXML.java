package br.indie.fiscal4j.cte200.classes.cte;

import br.indie.fiscal4j.DFBase;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "autXML")
public class CTInfoAutorizadoXML extends DFBase {
    private static final long serialVersionUID = 7510024008615524921L;

    @Element(name = "CNPJ", required = false)
    private String cnpj;

    @Element(name = "CPF", required = false)
    private String cpf;

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

}
