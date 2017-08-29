package br.indie.fiscal4j.classes.evento.inutilizacao;

import br.indie.fiscal4j.classes.NFBase;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;

@Root(name = "retInutNFe")
public class NFRetornoEventoInutilizacao extends NFBase {

    @Attribute(name = "versao", required = true)
    private String versao;

    @Element(name = "infInut", required = true)
    private NFRetornoEventoInutilizacaoDados dados;

    public NFRetornoEventoInutilizacaoDados getDados() {
        return this.dados;
    }

    public void setDados(final NFRetornoEventoInutilizacaoDados dados) {
        this.dados = dados;
    }

    public String getVersao() {
        return this.versao;
    }

    public void setVersao(final BigDecimal versao) {
        this.versao = BigDecimalParser.tamanho5Com2CasasDecimais(versao, "Versao");
    }
}