package br.indie.fiscal4j.classes.nota;

import br.indie.fiscal4j.classes.NFBase;
import br.indie.fiscal4j.classes.NFNotaInfoSituacaoTributariaCOFINS;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoCOFINSQuantidade extends NFBase {

    @Element(name = "CST", required = true)
    private NFNotaInfoSituacaoTributariaCOFINS situacaoTributaria;

    @Element(name = "qBCProd", required = true)
    private String quantidadeVendida;

    @Element(name = "vAliqProd", required = true)
    private String valorAliquota;

    @Element(name = "vCOFINS", required = true)
    private String valorTributo;

    public NFNotaInfoItemImpostoCOFINSQuantidade() {
        this.situacaoTributaria = null;
        this.quantidadeVendida = null;
        this.valorAliquota = null;
        this.valorTributo = null;
    }

    public void setSituacaoTributaria(final NFNotaInfoSituacaoTributariaCOFINS situacaoTributaria) {
        if (!NFNotaInfoSituacaoTributariaCOFINS.OPERACAO_TRIBUTAVEL_QUANTIDADE_VENDIDA_POR_ALIQUOTA_POR_UNIDADE_PRODUTO.equals(situacaoTributaria)) {
            throw new IllegalStateException("Situacao tributaria invalida");
        }
        this.situacaoTributaria = situacaoTributaria;
    }

    public void setQuantidadeVendida(final BigDecimal quantidadeVendida) {
        this.quantidadeVendida = BigDecimalParser.tamanho16ComAte4CasasDecimais(quantidadeVendida, "Quantidade Vendida COFINS Item Qtde");
    }

    public void setValorAliquota(final BigDecimal valorAliquota) {
        this.valorAliquota = BigDecimalParser.tamanho15Com4CasasDecimais(valorAliquota, "Valor Aliquota COFINS Item Qtde");
    }

    public void setValorTributo(final BigDecimal valorTributo) {
        this.valorTributo = BigDecimalParser.tamanho15Com2CasasDecimais(valorTributo, "Valor Tributo COFINS Item Qtde");
    }

    public NFNotaInfoSituacaoTributariaCOFINS getSituacaoTributaria() {
        return this.situacaoTributaria;
    }

    public String getQuantidadeVendida() {
        return this.quantidadeVendida;
    }

    public String getValorAliquota() {
        return this.valorAliquota;
    }

    public String getValorTributo() {
        return this.valorTributo;
    }
}
