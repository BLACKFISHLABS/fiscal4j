package br.indie.fiscal4j.mdfe3.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

/**
 * Created by Eldevan Nery Junior on 01/11/17.
 *
 * <p>Informações dos dispositivos do Vale Pedágio.</p>
 */
public class MDFInfoModalRodoviarioPedagioDisp extends DFBase {

    /**
     * <h1> CNPJ da empresa fornecedora do Vale-Pedágio.</h1>
     */
    @Element(name = "CNPJForn")
    private String cnpjFornecedora;

    /**
     * <h1> CNPJ do responsável pelo pagamento do Vale-Pedágio.</h1>
     */
    @Element(name = "CNPJPg", required = false)
    private String cnpjPagadora;

    /**
     * <h1> CPF do responsável pelo pagamento do Vale-Pedágio</h1>
     */
    @Element(name = "CPFPg")
    protected String cpfPagadora;

    /**
     * <h1>Número do comprovante de compra.</h1>
     * <p>  Número de ordem do comprovante de compra do Vale-Pedágio
     * fornecido para cada veículo ou combinação veicular, por viagem.</p>
     */
    @Element(name = "nCompra")
    private String numeroComprovante;

    /**
     * <h1> Valor do Vale-Pedagio</h1>
     */
    @Element(name = "vValePed")
    private String valor;

    public String getCnpjFornecedora() {
        return this.cnpjFornecedora;
    }

    public void setCnpjFornecedora(final String cnpjFornecedora) {
        StringValidador.cnpj(cnpjFornecedora);
        this.cnpjFornecedora = cnpjFornecedora;
    }

    public String getNumeroComprovante() {
        return this.numeroComprovante;
    }

    public void setNumeroComprovante(final String numeroComprovante) {
        StringValidador.tamanho20N(numeroComprovante, "Numero do comprovante de compra");
        this.numeroComprovante = numeroComprovante;
    }

    public String getCnpjPagadora() {
        return this.cnpjPagadora;
    }

    public void setCnpjPagadora(final String cnpjPagadora) {
        if (this.cpfPagadora != null) {
            throw new IllegalStateException("Nao deve setar CNPJ se CPF esteja setado em PedagioDisp ");
        }
        StringValidador.cnpj(cnpjPagadora);
        this.cnpjPagadora = cnpjPagadora;
    }

    public String getValor() {
        return this.valor;
    }

    public void setValor(final BigDecimal valor) {
        this.valor = BigDecimalParser.tamanho13Com2CasasDecimais(valor, "Valor do pedagio");
    }

    public String getCpfPagadora() {
        return cpfPagadora;
    }

    public void setCpfPagadora(String cpfPagadora) {
        if (this.cnpjPagadora != null) {
            throw new IllegalStateException("Nao deve setar CPF se CNPJ esteja setado em PedagioDisp ");
        }
        StringValidador.cpf(cpfPagadora);
        this.cpfPagadora = cpfPagadora;
    }
}
