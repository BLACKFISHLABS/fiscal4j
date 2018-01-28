package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import br.indie.fiscal4j.validadores.BigIntegerValidador;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NFNotaInfoItemExportacaoIndireta extends DFBase {
    private static final long serialVersionUID = 2911935204123851926L;

    @Element(name = "nRE", required = true)
    private BigInteger numeroRegistroExportacao;

    @Element(name = "chNFe", required = true)
    private String chaveAcessoNFe;

    @Element(name = "qExport", required = true)
    private String quantidadeItemEfetivamenteExportado;

    public String getChaveAcessoNFe() {
        return this.chaveAcessoNFe;
    }

    public void setChaveAcessoNFe(final String chaveAcessoNFe) {
        StringValidador.exatamente44N(chaveAcessoNFe, "Chave de Acesso NFe");
        this.chaveAcessoNFe = chaveAcessoNFe;
    }

    public BigInteger getNumeroRegistroExportacao() {
        return this.numeroRegistroExportacao;
    }

    public void setNumeroRegistroExportacao(final BigInteger numeroRegistroExportacao) {
        BigIntegerValidador.tamanho12(numeroRegistroExportacao, "Numero Registro Exportacao");
        this.numeroRegistroExportacao = numeroRegistroExportacao;
    }

    public String getQuantidadeItemEfetivamenteExportado() {
        return this.quantidadeItemEfetivamenteExportado;
    }

    public void setQuantidadeItemEfetivamenteExportado(final BigDecimal quantidadeItemEfetivamenteExportado) {
        this.quantidadeItemEfetivamenteExportado = BigDecimalParser.tamanho15comAte4CasasDecimais(quantidadeItemEfetivamenteExportado, "Quantidade Item Evetivamente Exportado");
    }
}