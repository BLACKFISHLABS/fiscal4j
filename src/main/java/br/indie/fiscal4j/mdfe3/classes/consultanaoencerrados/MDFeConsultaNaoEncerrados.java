package br.indie.fiscal4j.mdfe3.classes.consultanaoencerrados;

import br.indie.fiscal4j.DFAmbiente;
import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.DFBigDecimalValidador;
import br.indie.fiscal4j.validadores.DFStringValidador;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;

/**
 * Created by Eldevan Nery Junior on 22/11/17. Tipo Pedido de Consulta MDF-e Não Encerrados.
 */
@Root(name = "consMDFeNaoEnc")
@Namespace(reference = "http://www.portalfiscal.inf.br/mdfe")
public class MDFeConsultaNaoEncerrados extends DFBase {
    private static final long serialVersionUID = -6186360215204227213L;

    @Attribute(name = "versao")
    private String versao;

    @Element(name = "tpAmb")
    private DFAmbiente ambiente;

    @Element(name = "xServ")
    private String servico = "CONSULTAR NÃO ENCERRADOS";

    /**
     * CNPJ do Emitente do MDF-e.
     */
    @Element(name = "CNPJ")
    private String cnpj;

    public void setVersao(final BigDecimal versao) {
        this.versao = DFBigDecimalValidador.tamanho4Com2CasasDecimais(versao, "Versao Nota Consulta");
    }

    public void setVersao(final String versao) {
        this.versao = versao;
    }

    public void setAmbiente(final DFAmbiente ambiente) {
        this.ambiente = ambiente;
    }

    public void setServico(final String servico) {
        DFStringValidador.equals("CONSULTAR NÃO ENCERRADOS", servico);
        this.servico = servico;
    }

    public String getVersao() {
        return this.versao;
    }

    public DFAmbiente getAmbiente() {
        return this.ambiente;
    }

    public String getServico() {
        return this.servico;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(final String cnpj) {
        this.cnpj = DFStringValidador.cnpj(cnpj, "CNPJ do emitente");
    }
}