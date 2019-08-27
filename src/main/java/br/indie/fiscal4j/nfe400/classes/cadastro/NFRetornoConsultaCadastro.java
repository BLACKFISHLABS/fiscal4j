package br.indie.fiscal4j.nfe400.classes.cadastro;

import br.indie.fiscal4j.DFAmbiente;
import br.indie.fiscal4j.DFBase;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "retConsCad")
public class NFRetornoConsultaCadastro extends DFBase {
    private static final long serialVersionUID = 3536099917870161262L;

    @Attribute(name = "versao", required = false)
    private String versao;

    @Element(name = "tpAmb", required = false)
    private DFAmbiente ambiente;

    @Element(name = "infCons")
    private NFRetornoConsultaCadastroDados dados;

    public NFRetornoConsultaCadastroDados getDados() {
        return this.dados;
    }

    public String getVersao() {
        return this.versao;
    }

    public void setDados(final NFRetornoConsultaCadastroDados dados) {
        this.dados = dados;
    }

    public void setVersao(final String versao) {
        this.versao = versao;
    }

    public DFAmbiente getAmbiente() {
        return this.ambiente;
    }

    public void setAmbiente(final DFAmbiente ambiente) {
        this.ambiente = ambiente;
    }
}