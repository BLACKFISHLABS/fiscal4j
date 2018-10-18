package br.indie.fiscal4j.cte300.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.ListValidador;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * @author Caio
 * @info Emissor do documento anterior
 */

@Root(name = "emiDocAnt")
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTeNotaInfoCTeNormalDocumentosAnterioresEmissorDocumentosAnteriores extends DFBase {
    private static final long serialVersionUID = -3899185054880374521L;

    @Element(name = "CNPJ", required = false)
    private String cnpj;

    @Element(name = "CPF", required = false)
    private String cpf;

    @Element(name = "IE", required = true)
    private String inscricaoEstadual;

    @Element(name = "UF", required = true)
    private String siglaUF;

    @Element(name = "xNome", required = true)
    private String razaoSocial;

    @ElementList(name = "idDocAnt", inline = true, required = false)
    private List<CTeNotaInfoCTeNormalDocumentosAnterioresEmissorDocumentosAnterioresIdentificacao> identificacaoDocumentosAnteriores;

    public CTeNotaInfoCTeNormalDocumentosAnterioresEmissorDocumentosAnteriores() {
        this.cnpj = null;
        this.cpf = null;
        this.inscricaoEstadual = null;
        this.siglaUF = null;
        this.razaoSocial = null;
        this.identificacaoDocumentosAnteriores = null;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    /**
     * Número do CNPJ<br>
     * Em caso de empresa não estabelecida no Brasil, será informado o CNPJ com zeros.Informar os zeros não significativos.
     */
    public void setCnpj(final String cnpj) {
        StringValidador.cnpj(cnpj);
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return this.cpf;
    }

    /**
     * Número do CPF<br>
     * Informar os zeros não significativos.
     */
    public void setCpf(final String cpf) {
        StringValidador.cpf(cpf);
        this.cpf = cpf;
    }

    public String getInscricaoEstadual() {
        return this.inscricaoEstadual;
    }

    /**
     * Inscrição Estadual
     */
    public void setInscricaoEstadual(final String inscricaoEstadual) {
        StringValidador.inscricaoEstadual(inscricaoEstadual);
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getSiglaUF() {
        return this.siglaUF;
    }

    /**
     * Sigla da UF<br>
     * Informar EX para operações com o exterior.
     */
    public void setSiglaUF(final String siglaUF) {
        StringValidador.exatamente2(siglaUF, "Sigla da UF");
        this.siglaUF = siglaUF;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    /**
     * Razão Social ou Nome do expedidor
     */
    public void setRazaoSocial(final String razaoSocial) {
        StringValidador.tamanho60(razaoSocial, "Razão Social ou Nome do expedidor");
        this.razaoSocial = razaoSocial;
    }

    public List<CTeNotaInfoCTeNormalDocumentosAnterioresEmissorDocumentosAnterioresIdentificacao> getIdentificacaoDocumentosAnteriores() {
        return this.identificacaoDocumentosAnteriores;
    }

    /**
     * Informações de identificação dos documentos de Transporte Anterior
     */
    public void setIdentificacaoDocumentosAnteriores(final List<CTeNotaInfoCTeNormalDocumentosAnterioresEmissorDocumentosAnterioresIdentificacao> identificacaoDocumentosAnteriores) {
        ListValidador.tamanho2(identificacaoDocumentosAnteriores, "Informações de identificação dos documentos de Transporte Anterior");
        this.identificacaoDocumentosAnteriores = identificacaoDocumentosAnteriores;
    }
}
