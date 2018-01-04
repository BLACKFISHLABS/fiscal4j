package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.nfe.validadores.BigDecimalParser;
import br.indie.fiscal4j.nfe.validadores.StringValidador;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class DFNotaInfoCanaDeducao extends DFBase {
    @Element(name = "xDed", required = true)
    private String descricaoDeducao;

    @Element(name = "vDed", required = true)
    private String valorDeducao;

    public void setDescricaoDeducao(final String descricaoDeducao) {
        StringValidador.tamanho60(descricaoDeducao, "Descricao Deducao");
        this.descricaoDeducao = descricaoDeducao;
    }

    public void setValorDeducao(final BigDecimal valorDeducao) {
        this.valorDeducao = BigDecimalParser.tamanho15Com2CasasDecimais(valorDeducao, "Valor Deducao");
    }

    public String getDescricaoDeducao() {
        return this.descricaoDeducao;
    }

    public String getValorDeducao() {
        return this.valorDeducao;
    }
}