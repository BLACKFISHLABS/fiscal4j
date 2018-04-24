package br.indie.fiscal4j.nfe400.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.nfe400.classes.NFNotaInfoSituacaoTributariaPIS;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoPISQuantidade extends DFBase {
    private static final long serialVersionUID = 8768801743177271906L;

    @Element(name = "CST", required = true)
    private NFNotaInfoSituacaoTributariaPIS situacaoTributaria;

    @Element(name = "qBCProd", required = true)
    private String quantidadeVendida;

    @Element(name = "vAliqProd", required = true)
    private String valorAliquota;

    @Element(name = "vPIS", required = true)
    private String valorTributo;

    public NFNotaInfoItemImpostoPISQuantidade() {
        this.situacaoTributaria = null;
        this.quantidadeVendida = null;
        this.valorAliquota = null;
        this.valorTributo = null;
    }

    public void setSituacaoTributaria(final NFNotaInfoSituacaoTributariaPIS situacaoTributaria) {
        if (!NFNotaInfoSituacaoTributariaPIS.OPERACAO_TRIBUTAVEL_QUANTIDADE_VENDIDA_POR_ALIQUOTA_POR_UNIDADE_PRODUTO.equals(situacaoTributaria)) {
            throw new IllegalStateException("Situacao tributaria invalido no item PIS Quantidade");
        }

        this.situacaoTributaria = situacaoTributaria;
    }

    public void setQuantidadeVendida(final BigDecimal quantidadeVendida) {
        this.quantidadeVendida = BigDecimalParser.tamanho16ComAte4CasasDecimais(quantidadeVendida, "Quantidade Vendida PIS Qtde Item");
    }

    public void setValorAliquota(final BigDecimal valorAliquota) {
        this.valorAliquota = BigDecimalParser.tamanho15Com4CasasDecimais(valorAliquota, "Valor Aliquota PIS Qtde Item");
    }

    public void setValorTributo(final BigDecimal valorTributo) {
        this.valorTributo = BigDecimalParser.tamanho15Com2CasasDecimais(valorTributo, "Valor Tributo PIS Qtde Item");
    }

    public NFNotaInfoSituacaoTributariaPIS getSituacaoTributaria() {
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