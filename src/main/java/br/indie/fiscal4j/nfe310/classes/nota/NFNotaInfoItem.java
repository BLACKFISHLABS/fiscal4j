package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.IntegerValidador;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

public class NFNotaInfoItem extends DFBase {
    private static final long serialVersionUID = 362646693945373643L;

    @Attribute(name = "nItem", required = true)
    private Integer numeroItem;

    @Element(name = "prod", required = true)
    private NFNotaInfoItemProduto produto;

    @Element(name = "imposto", required = true)
    private NFNotaInfoItemImposto imposto;

    @Element(name = "impostoDevol", required = false)
    private NFImpostoDevolvido impostoDevolvido;

    @Element(name = "infAdProd", required = false)
    private String informacoesAdicionais;

    public Integer getNumeroItem() {
        return this.numeroItem;
    }

    public void setNumeroItem(final Integer numeroItem) {
        IntegerValidador.tamanho3maximo990(numeroItem, "Numero do Item");
        this.numeroItem = numeroItem;
    }

    public NFNotaInfoItemProduto getProduto() {
        return this.produto;
    }

    public void setProduto(final NFNotaInfoItemProduto produto) {
        this.produto = produto;
    }

    public NFNotaInfoItemImposto getImposto() {
        return this.imposto;
    }

    public void setImposto(final NFNotaInfoItemImposto imposto) {
        this.imposto = imposto;
    }

    public String getInformacoesAdicionais() {
        return this.informacoesAdicionais;
    }

    public void setInformacoesAdicionais(final String informacoesAdicionais) {
        StringValidador.tamanho500(informacoesAdicionais, "Informacoes Adicionais do Item");
        this.informacoesAdicionais = informacoesAdicionais;
    }

    public NFImpostoDevolvido getImpostoDevolvido() {
        return this.impostoDevolvido;
    }

    public void setImpostoDevolvido(final NFImpostoDevolvido impostoDevolvido) {
        this.impostoDevolvido = impostoDevolvido;
    }
}