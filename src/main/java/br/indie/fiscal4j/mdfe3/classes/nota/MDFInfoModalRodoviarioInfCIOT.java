package br.indie.fiscal4j.mdfe3.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.DFStringValidador;
import org.simpleframework.xml.Element;

/**
 * Created by Eldevan Nery Junior on 01/11/17.
 * <h1>Dados do CIOT(Código Identificador da Operação de Transporte)</h1>
 */
public class MDFInfoModalRodoviarioInfCIOT extends DFBase {
    private static final long serialVersionUID = -493243755664595267L;

    /**
     * <p>
     * Código Identificador da Operação de Transporte. Também Conhecido como conta frete
     * </p>
     */
    @Element(name = "CIOT")
    private String ciot;

    /**
     * <p>
     * Número do CPF responsável pela geração do CIOT.
     * </p>
     */
    @Element(name = "CPF", required = false)
    private String cpf;

    /**
     * <p>
     * Número do CNPJ responsável pela geração do CIOT.
     * </p>
     */
    @Element(name = "CNPJ", required = false)
    private String cnpj;

    public String getCiot() {
        return this.ciot;
    }

    public void setCiot(final String ciot) {
        this.ciot = DFStringValidador.validador(ciot, "CIOT", 12, true, true);
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(final String cpf) {
        if (this.cnpj != null) {
            throw new IllegalStateException("Nao deve setar CPF se CNPJ esteja setado em infCIOT");
        }
        DFStringValidador.cpf(cpf);
        this.cpf = cpf;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(final String cnpj) {
        if (this.cpf != null) {
            throw new IllegalStateException("Nao deve setar CNPJ se CPF esteja setado em infCIOT");
        }
        DFStringValidador.cnpj(cnpj);
        this.cnpj = cnpj;
    }
}
