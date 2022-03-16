package br.indie.fiscal4j.nfe400.classes.nota;

import br.indie.fiscal4j.DFBase;
import org.simpleframework.xml.Element;

public class NFNotaInfoItemProdutoDetalhamento extends DFBase {
    private static final long serialVersionUID = 4756407184060968887L;

    @Element(name = "cProdFisco")
    private String codigoFiscalProduto;

    @Element(name = "cOperNFF")
    private String codigoOperacaoNFF;

    public String getCodigoFiscalProduto() {
        return codigoFiscalProduto;
    }

    public void setCodigoFiscalProduto(String codigoFiscalProduto) {
        this.codigoFiscalProduto = codigoFiscalProduto;
    }

    public String getCodigoOperacaoNFF() {
        return codigoOperacaoNFF;
    }

    public void setCodigoOperacaoNFF(String codigoOperacaoNFF) {
        this.codigoOperacaoNFF = codigoOperacaoNFF;
    }
}