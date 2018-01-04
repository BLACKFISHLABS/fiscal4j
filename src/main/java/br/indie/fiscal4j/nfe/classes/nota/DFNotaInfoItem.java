package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.nfe.validadores.IntegerValidador;
import br.indie.fiscal4j.nfe.validadores.StringValidador;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

public class DFNotaInfoItem extends DFBase {

    @Attribute(name = "nItem", required = true)
    private Integer numeroItem;

    @Element(name = "prod", required = true)
    private DFNotaInfoItemProduto produto;

    @Element(name = "imposto", required = true)
    private DFNotaInfoItemImposto imposto;

    @Element(name = "impostoDevol", required = false)
    private DFImpostoDevolvido impostoDevolvido;

    @Element(name = "infAdProd", required = false)
    private String informacoesAdicionais;

    public void setNumeroItem(final Integer numeroItem) {
        IntegerValidador.tamanho3maximo990(numeroItem, "Numero do Item");
        this.numeroItem = numeroItem;
    }

    public void setInformacoesAdicionais(final String informacoesAdicionais) {
        StringValidador.tamanho500(informacoesAdicionais, "Informacoes Adicionais do Item");
        this.informacoesAdicionais = informacoesAdicionais;
    }

    public void setProduto(final DFNotaInfoItemProduto produto) {
        this.produto = produto;
    }

    public void setImposto(final DFNotaInfoItemImposto imposto) {
        this.imposto = imposto;
    }

    public Integer getNumeroItem() {
        return this.numeroItem;
    }

    public DFNotaInfoItemProduto getProduto() {
        return this.produto;
    }

    public DFNotaInfoItemImposto getImposto() {
        return this.imposto;
    }

    public String getInformacoesAdicionais() {
        return this.informacoesAdicionais;
    }

    public DFImpostoDevolvido getImpostoDevolvido() {
        return this.impostoDevolvido;
    }

    public void setImpostoDevolvido(final DFImpostoDevolvido impostoDevolvido) {
        this.impostoDevolvido = impostoDevolvido;
    }
}