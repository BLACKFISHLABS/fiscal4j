package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.DFUnidadeFederativa;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NFNotaInfoItemProdutoCombustivel extends DFBase {
    private static final long serialVersionUID = -2899516480924530882L;

    @Element(name = "cProdANP", required = true)
    private String codigoProdutoANP;

    @Element(name = "pMixGN", required = false)
    private String percentualGasNatural;

    @Element(name = "CODIF", required = false)
    private String codigoAutorizacaoCOFIF;

    @Element(name = "qTemp", required = false)
    private String quantidade;

    @Element(name = "UFCons", required = true)
    private String uf;

    @Element(name = "CIDE", required = false)
    private NFNotaInfoItemProdutoCombustivelCIDE cide;

    @Element(name = "encerrante", required = false)
    private NFNotaInfoItemProdutoCombustivelEncerrante encerrante;

    public NFNotaInfoItemProdutoCombustivel() {
        this.codigoProdutoANP = null;
        this.codigoAutorizacaoCOFIF = null;
        this.quantidade = null;
        this.uf = null;
        this.cide = null;
        this.encerrante = null;
    }

    public void setCodigoAutorizacaoCODIF(final String codigoAutorizacaoCODIF) {
        StringValidador.tamanho21(codigoAutorizacaoCODIF, "Codigo Autorizacao CODIF Combustivel");
        this.codigoAutorizacaoCOFIF = codigoAutorizacaoCODIF;
    }

    public String getCodigoProdutoANP() {
        return this.codigoProdutoANP;
    }

    public void setCodigoProdutoANP(final String codigoProdutoANP) {
        StringValidador.exatamente9(codigoProdutoANP, "Codigo Produto ANP Combustivel");
        this.codigoProdutoANP = codigoProdutoANP;
    }

    public String getPercentualGasNatural() {
        return this.percentualGasNatural;
    }

    public void setPercentualGasNatural(final BigDecimal percentualGasNatural) {
        this.percentualGasNatural = BigDecimalParser.tamanho5Com2CasasDecimais(percentualGasNatural, "Percentual Gas Natural Combustivel");
    }

    public String getCodigoAutorizacaoCOFIF() {
        return this.codigoAutorizacaoCOFIF;
    }

    public String getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(final BigDecimal quantidade) {
        this.quantidade = BigDecimalParser.tamanho16Com4CasasDecimais(quantidade, "Quantidade Combustivel");
    }

    public String getUf() {
        return this.uf;
    }

    public void setUf(final DFUnidadeFederativa uf) {
        this.uf = uf.getCodigo();
    }

    public NFNotaInfoItemProdutoCombustivelCIDE getCide() {
        return this.cide;
    }

    public void setCide(final NFNotaInfoItemProdutoCombustivelCIDE cide) {
        this.cide = cide;
    }

    public NFNotaInfoItemProdutoCombustivelEncerrante getEncerrante() {
        return encerrante;
    }

    public void setEncerrante(final NFNotaInfoItemProdutoCombustivelEncerrante encerrante) {
        this.encerrante = encerrante;
    }
}