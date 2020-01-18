package br.indie.fiscal4j.nfe400.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.nfe400.classes.NFNotaInfoSituacaoTributariaCOFINS;
import br.indie.fiscal4j.validadores.BigDecimalValidador;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class NFNotaInfoItemImpostoCOFINSAliquota extends DFBase {
    private static final long serialVersionUID = -8079337130690627887L;

    private static final List<NFNotaInfoSituacaoTributariaCOFINS> SITUACOES_VALIDAS = Arrays.asList(NFNotaInfoSituacaoTributariaCOFINS.OPERACAO_TRIBUTAVEL_CUMULATIVO_NAO_CUMULATIVO, NFNotaInfoSituacaoTributariaCOFINS.OPERACAO_TRIBUTAVEL_ALIQUOTA_DIFERENCIADA);

    @Element(name = "CST")
    private NFNotaInfoSituacaoTributariaCOFINS situacaoTributaria;

    @Element(name = "vBC")
    private String valorBaseCalculo;

    @Element(name = "pCOFINS")
    private String percentualAliquota;

    @Element(name = "vCOFINS")
    private String valor;

    public void setSituacaoTributaria(final NFNotaInfoSituacaoTributariaCOFINS situacaoTributaria) {
        if (!NFNotaInfoItemImpostoCOFINSAliquota.SITUACOES_VALIDAS.contains(situacaoTributaria)) {
            throw new IllegalStateException("Situacao tributaria invalido no item COFINS Aliquota.");
        }
        this.situacaoTributaria = situacaoTributaria;
    }

    public void setValorBaseCalculo(final BigDecimal valorBaseCalulo) {
        this.valorBaseCalculo = BigDecimalValidador.tamanho15Com2CasasDecimais(valorBaseCalulo, "Valor Base de Calculo COFINS Item");
    }

    public void setPercentualAliquota(final BigDecimal aliquota) {
        this.percentualAliquota = BigDecimalValidador.tamanho7ComAte4CasasDecimais(aliquota, "Aliquota COFINS Item");
    }

    public void setValor(final BigDecimal valor) {
        this.valor = BigDecimalValidador.tamanho15Com2CasasDecimais(valor, "Valor COFINS Item");
    }

    public NFNotaInfoSituacaoTributariaCOFINS getSituacaoTributaria() {
        return this.situacaoTributaria;
    }

    public String getValorBaseCalculo() {
        return this.valorBaseCalculo;
    }

    public String getPercentualAliquota() {
        return this.percentualAliquota;
    }

    public String getValor() {
        return this.valor;
    }
}
