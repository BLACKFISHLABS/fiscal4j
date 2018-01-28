package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

public class NFNotaInfoObservacao extends DFBase {
    private static final long serialVersionUID = 7420062278238333996L;

    @Attribute(name = "xCampo", required = true)
    private String identificacaoCampo;

    @Element(name = "xTexto", required = true)
    private String conteudoCampo;

    public String getConteudoCampo() {
        return this.conteudoCampo;
    }

    public void setConteudoCampo(final String conteudoCampo) {
        StringValidador.tamanho60(conteudoCampo, "Conteudo Campo Obs");
        this.conteudoCampo = conteudoCampo;
    }

    public String getIdentificacaoCampo() {
        return this.identificacaoCampo;
    }

    public void setIdentificacaoCampo(final String identificacaoCampo) {
        StringValidador.tamanho20(identificacaoCampo, "Identificacao Campo Obs");
        this.identificacaoCampo = identificacaoCampo;
    }
}