package br.indie.fiscal4j.nfe400.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.BigDecimalValidador;
import br.indie.fiscal4j.validadores.BigIntegerValidador;
import br.indie.fiscal4j.validadores.IntegerValidador;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NFNotaInfoItemProdutoDeclaracaoImportacaoAdicao extends DFBase {
    private static final long serialVersionUID = -7286071184901675008L;

    @Element(name = "nAdicao")
    private Integer numero;

    @Element(name = "nSeqAdic")
    private Integer sequencial;

    @Element(name = "cFabricante")
    private String codigoFabricante;

    @Element(name = "vDescDI", required = false)
    private String desconto;

    @Element(name = "nDraw", required = false)
    private BigInteger numeroAtoConcessorioDrawback;

    public void setNumero(final Integer numero) {
        IntegerValidador.tamanho3(numero, "Numero Declaracao Importacao Adicao");
        this.numero = numero;
    }

    public void setSequencial(final Integer sequencial) {
        IntegerValidador.tamanho3(sequencial, "Sequencial Declaracao Importacao Adicao");
        this.sequencial = sequencial;
    }

    public void setCodigoFabricante(final String codigoFabricante) {
        StringValidador.tamanho60(codigoFabricante, "Codigo Fabricante Declaracao Importacao Adicao");
        this.codigoFabricante = codigoFabricante;
    }

    public void setDesconto(final BigDecimal desconto) {
        this.desconto = BigDecimalValidador.tamanho15Com2CasasDecimais(desconto, "Desconto Declaracao Importacao Adicao");
    }

    public void setNumeroAtoConcessorioDrawback(final BigInteger numeroAtoConcessorioDrawback) {
        BigIntegerValidador.tamanho11(numeroAtoConcessorioDrawback, "Numero Ato Concessorio Declaracao Importacao Adicao");
        this.numeroAtoConcessorioDrawback = numeroAtoConcessorioDrawback;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public Integer getSequencial() {
        return this.sequencial;
    }

    public String getCodigoFabricante() {
        return this.codigoFabricante;
    }

    public String getDesconto() {
        return this.desconto;
    }

    public BigInteger getNumeroAtoConcessorioDrawback() {
        return this.numeroAtoConcessorioDrawback;
    }
}