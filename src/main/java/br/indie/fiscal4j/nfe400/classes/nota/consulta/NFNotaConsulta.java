package br.indie.fiscal4j.nfe400.classes.nota.consulta;

import br.indie.fiscal4j.DFAmbiente;
import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.BigDecimalValidador;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;

@Root(name = "consSitNFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class NFNotaConsulta extends DFBase {
    private static final long serialVersionUID = 6261821910786634620L;

    @Attribute(name = "versao")
    private String versao;

    @Element(name = "tpAmb")
    private DFAmbiente ambiente;

    @Element(name = "xServ")
    private String servico;

    @Element(name = "chNFe")
    private String chave;

    public void setVersao(final BigDecimal versao) {
        this.versao = BigDecimalValidador.tamanho4Com2CasasDecimais(versao, "Versao Nota Consulta");
    }

    public void setAmbiente(final DFAmbiente ambiente) {
        this.ambiente = ambiente;
    }

    public void setServico(final String servico) {
        this.servico = servico;
    }

    public void setChave(final String chave) {
        StringValidador.exatamente44N(chave, "Chave de Acesso Nota Consulta");
        this.chave = chave;
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

    public String getChave() {
        return this.chave;
    }
}