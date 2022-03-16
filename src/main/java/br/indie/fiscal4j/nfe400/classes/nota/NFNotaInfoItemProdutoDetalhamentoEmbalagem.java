package br.indie.fiscal4j.nfe400.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.DFBigDecimalValidador;
import br.indie.fiscal4j.validadores.DFStringValidador;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NFNotaInfoItemProdutoDetalhamentoEmbalagem extends DFBase {
    private static final long serialVersionUID = 4756407184060968887L;

    @Element(name = "xEmb")
    private String embalagemProduto;

    @Element(name = "qVolEmb")
    private String volumeProdutoEmbalagem;

    @Element(name = "uEmb")
    private String unidadeMedidaEmbalagem;

    public String getEmbalagemProduto() {
        return embalagemProduto;
    }

    public void setEmbalagemProduto(String embalagemProduto) {
        DFStringValidador.tamanho1ate8(embalagemProduto, "Embalagem do produto");
        this.embalagemProduto = embalagemProduto;
    }

    public String getVolumeProdutoEmbalagem() {
        return volumeProdutoEmbalagem;
    }

    public void setVolumeProdutoEmbalagem(final BigDecimal volumeProdutoEmbalagem) {
        this.volumeProdutoEmbalagem = DFBigDecimalValidador.tamanho11Com3CasasDecimais(volumeProdutoEmbalagem, "Volume produto embalagem");
        this.volumeProdutoEmbalagem = this.volumeProdutoEmbalagem;
    }

    public String getUnidadeMedidaEmbalagem() {
        return unidadeMedidaEmbalagem;
    }

    public void setUnidadeMedidaEmbalagem(String unidadeMedidaEmbalagem) {
        DFStringValidador.tamanho1ate8(unidadeMedidaEmbalagem, "Unidade de Medida da Embalagem");
        this.unidadeMedidaEmbalagem = unidadeMedidaEmbalagem;
    }
}