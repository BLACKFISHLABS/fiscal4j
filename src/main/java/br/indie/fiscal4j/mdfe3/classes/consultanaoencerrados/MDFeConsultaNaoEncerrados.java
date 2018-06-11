package br.indie.fiscal4j.mdfe3.classes.consultanaoencerrados;

import br.indie.fiscal4j.DFAmbiente;
import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;

/**
 * Created by Eldevan Nery Junior on 22/11/17.
 * <p>
 * Tipo Pedido de Consulta MDF-e Não Encerrados.
 */
@Root(name = "consMDFeNaoEnc")
@Namespace(reference = "http://www.portalfiscal.inf.br/mdfe")
public class MDFeConsultaNaoEncerrados extends DFBase {

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
        this.versao = BigDecimalParser.tamanho4Com2CasasDecimais(versao, "Versao Nota Consulta");
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public void setAmbiente(final DFAmbiente ambiente) {
        this.ambiente = ambiente;
    }

    public void setServico(final String servico) {
        StringValidador.equals("CONSULTAR NÃO ENCERRADOS", servico);
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
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = StringValidador.cnpj(cnpj, "CNPJ do emitente");
    }
}