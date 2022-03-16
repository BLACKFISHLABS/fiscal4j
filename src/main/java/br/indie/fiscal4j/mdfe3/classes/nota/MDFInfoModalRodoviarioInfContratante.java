package br.indie.fiscal4j.mdfe3.classes.nota;

import br.indie.fiscal4j.validadores.DFStringValidador;
import org.simpleframework.xml.Element;

/**
 * Created by Eldevan Nery Junior on 01/11/17.
 *
 * <h1>Grupo de informações dos contratantes do serviço de transporte</h1>
 */
public class MDFInfoModalRodoviarioInfContratante {

    /**
     * <p>Número do CPF do contratente do serviço.</p>
     */
    @Element(name = "CPF", required = false)
    private String cpf;

    /**
     * <p>Número do CNPJ do contratante do serviço.</p>
     */
    @Element(name = "CNPJ", required = false)
    private String cnpj;

    /**
     * <p>Identificação de contratante em caso de contratante estrangeiro.</p>
     */
    @Element(name = "idEstrangeiro", required = false)
    private String idEstrangeiro;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (this.cnpj != null || this.idEstrangeiro != null) {
            throw new IllegalStateException("Nao deve setar CPF se CNPJ/IdEstrangeiro esteja setado");
        }
        DFStringValidador.cpf(cpf);
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        if (this.cpf != null || this.idEstrangeiro != null) {
            throw new IllegalStateException("Nao deve setar CNPJ se CPF/IdEstrangeiro esteja setado");
        }
        DFStringValidador.cnpj(cnpj);
        this.cnpj = cnpj;
    }

    public String getIdEstrangeiro() {
        return idEstrangeiro;
    }

    public void setIdEstrangeiro(String idEstrangeiro) {
        if (this.cpf != null || this.cnpj != null) {
            throw new IllegalStateException("Nao deve setar IdEstrangeiro se CPF/CNPJ esteja setado");
        }
        this.idEstrangeiro = idEstrangeiro;
    }

}