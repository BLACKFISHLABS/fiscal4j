package br.indie.fiscal4j.classes.nota;

import br.indie.fiscal4j.classes.NFBase;
import br.indie.fiscal4j.classes.NFNotaInfoSituacaoTributariaCOFINS;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoCOFINSAliquota extends NFBase {

    @Element(name = "CST", required = true)
    private NFNotaInfoSituacaoTributariaCOFINS situacaoTributaria;

    @Element(name = "vBC", required = true)
    private String valorBaseCalulo;

    @Element(name = "pCOFINS", required = true)
    private String percentualAliquota;

    @Element(name = "vCOFINS", required = true)
    private String valor;

    public void setSituacaoTributaria(final NFNotaInfoSituacaoTributariaCOFINS situacaoTributaria) {
        if (!NFNotaInfoSituacaoTributariaCOFINS.OPERACAO_TRIBUTAVEL_CUMULATIVO_NAO_CUMULATIVO.equals(situacaoTributaria) && !NFNotaInfoSituacaoTributariaCOFINS.OPERACAO_TRIBUTAVEL_ALIQUOTA_DIFERENCIADA.equals(situacaoTributaria)) {
            throw new IllegalStateException("Situacao tributaria invalido");
        }

        this.situacaoTributaria = situacaoTributaria;
    }

    public void setValorBaseCalulo(final BigDecimal valorBaseCalulo) {
        this.valorBaseCalulo = BigDecimalParser.tamanho15Com2CasasDecimais(valorBaseCalulo, "Valor Base de Calculo COFINS Item");
    }

    public void setPercentualAliquota(final BigDecimal aliquota) {
        this.percentualAliquota = BigDecimalParser.tamanho7ComAte4CasasDecimais(aliquota, "Aliquota COFINS Item");
    }

    public void setValor(final BigDecimal valor) {
        this.valor = BigDecimalParser.tamanho15Com2CasasDecimais(valor, "Valor COFINS Item");
    }

    public NFNotaInfoSituacaoTributariaCOFINS getSituacaoTributaria() {
        return this.situacaoTributaria;
    }

    public String getValorBaseCalulo() {
        return this.valorBaseCalulo;
    }

    public String getPercentualAliquota() {
        return this.percentualAliquota;
    }

    public String getValor() {
        return this.valor;
    }
}