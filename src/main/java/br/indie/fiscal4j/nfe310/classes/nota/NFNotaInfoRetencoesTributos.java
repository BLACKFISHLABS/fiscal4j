package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NFNotaInfoRetencoesTributos extends DFBase {
    private static final long serialVersionUID = 8153484835418045075L;

    @Element(name = "vRetPIS", required = false)
    private String valorRetidoPIS;

    @Element(name = "vRetCOFINS", required = false)
    private String valorRetidoCOFINS;

    @Element(name = "vRetCSLL", required = false)
    private String valorRetidoCSLL;

    @Element(name = "vBCIRRF", required = false)
    private String baseCalculoIRRF;

    @Element(name = "vIRRF", required = false)
    private String valorRetidoIRRF;

    @Element(name = "vBCRetPrev", required = false)
    private String baseCalculoRetencaoPrevidenciaSocial;

    @Element(name = "vRetPrev", required = false)
    private String valorRetencaoPrevidenciaSocial;

    public String getValorRetidoPIS() {
        return this.valorRetidoPIS;
    }

    public void setValorRetidoPIS(final BigDecimal valorRetidoPIS) {
        this.valorRetidoPIS = BigDecimalParser.tamanho15Com2CasasDecimais(valorRetidoPIS, "Valor Retido PIS");
    }

    public String getValorRetidoCOFINS() {
        return this.valorRetidoCOFINS;
    }

    public void setValorRetidoCOFINS(final BigDecimal valorRetidoCOFINS) {
        this.valorRetidoCOFINS = BigDecimalParser.tamanho15Com2CasasDecimais(valorRetidoCOFINS, "Valor Retido COFINS");
    }

    public String getValorRetidoCSLL() {
        return this.valorRetidoCSLL;
    }

    public void setValorRetidoCSLL(final BigDecimal valorRetidoCSLL) {
        this.valorRetidoCSLL = BigDecimalParser.tamanho15Com2CasasDecimais(valorRetidoCSLL, "Valor Retido CSLL");
    }

    public String getBaseCalculoIRRF() {
        return this.baseCalculoIRRF;
    }

    public void setBaseCalculoIRRF(final BigDecimal baseCalculoIRRF) {
        this.baseCalculoIRRF = BigDecimalParser.tamanho15Com2CasasDecimais(baseCalculoIRRF, "BC IRRF Retencao Tributos");
    }

    public String getValorRetidoIRRF() {
        return this.valorRetidoIRRF;
    }

    public void setValorRetidoIRRF(final BigDecimal valorRetidoIRRF) {
        this.valorRetidoIRRF = BigDecimalParser.tamanho15Com2CasasDecimais(valorRetidoIRRF, "Valor Retido IRRF");
    }

    public String getBaseCalculoRetencaoPrevidenciaSocial() {
        return this.baseCalculoRetencaoPrevidenciaSocial;
    }

    public void setBaseCalculoRetencaoPrevidenciaSocial(final BigDecimal baseCalculoRetencaoPrevidenciaSocial) {
        this.baseCalculoRetencaoPrevidenciaSocial = BigDecimalParser.tamanho15Com2CasasDecimais(baseCalculoRetencaoPrevidenciaSocial, "BC Retencao Previdencia Social");
    }

    public String getValorRetencaoPrevidenciaSocial() {
        return this.valorRetencaoPrevidenciaSocial;
    }

    public void setValorRetencaoPrevidenciaSocial(final BigDecimal valorRetencaoPrevidenciaSocial) {
        this.valorRetencaoPrevidenciaSocial = BigDecimalParser.tamanho15Com2CasasDecimais(valorRetencaoPrevidenciaSocial, "Valor Retencao Previdencia Social");
    }
}