package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.nfe310.classes.NFNotaSituacaoOperacionalSimplesNacional;
import br.indie.fiscal4j.nfe310.classes.NFOrigem;
import br.indie.fiscal4j.validadores.BigDecimalValidador;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoICMSSN500 extends DFBase {
    private static final long serialVersionUID = 83636755742035633L;

    @Element(name = "orig")
    private NFOrigem origem;

    @Element(name = "CSOSN")
    private NFNotaSituacaoOperacionalSimplesNacional situacaoOperacaoSN;

    @Element(name = "vBCSTRet", required = false)
    private String valorBCICMSSTRetido;

    @Element(name = "vICMSSTRet", required = false)
    private String valorICMSSTRetido;

    public void setOrigem(final NFOrigem origem) {
        this.origem = origem;
    }

    public void setSituacaoOperacaoSN(final NFNotaSituacaoOperacionalSimplesNacional situacaoOperacaoSN) {
        this.situacaoOperacaoSN = situacaoOperacaoSN;
    }

    public void setValorBCICMSSTRetido(final BigDecimal valorBCICMSSTRetido) {
        this.valorBCICMSSTRetido = BigDecimalValidador.tamanho15Com2CasasDecimais(valorBCICMSSTRetido, "Valor BC ICMS ST Retido ICMSSN500");
    }

    public void setValorICMSSTRetido(final BigDecimal valorICMSSTRetido) {
        this.valorICMSSTRetido = BigDecimalValidador.tamanho15Com2CasasDecimais(valorICMSSTRetido, "Valor ICMS ST Retido ICMSSN500");
    }

    public NFOrigem getOrigem() {
        return this.origem;
    }

    public NFNotaSituacaoOperacionalSimplesNacional getSituacaoOperacaoSN() {
        return this.situacaoOperacaoSN;
    }

    public String getValorBCICMSSTRetido() {
        return this.valorBCICMSSTRetido;
    }

    public String getValorICMSSTRetido() {
        return this.valorICMSSTRetido;
    }
}