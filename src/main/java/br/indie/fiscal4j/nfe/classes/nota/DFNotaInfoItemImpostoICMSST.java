package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.nfe.classes.NFNotaInfoImpostoTributacaoICMS;
import br.indie.fiscal4j.nfe.classes.NFOrigem;
import br.indie.fiscal4j.nfe.validadores.BigDecimalParser;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class DFNotaInfoItemImpostoICMSST extends DFBase {

    @Element(name = "orig", required = true)
    private NFOrigem origem;

    @Element(name = "CST", required = true)
    private NFNotaInfoImpostoTributacaoICMS situacaoTributaria;

    @Element(name = "vBCSTRet", required = true)
    private String valorBCICMSSTRetidoUFRemetente;

    @Element(name = "vICMSSTRet", required = true)
    private String valorICMSSTRetidoUFRemetente;

    @Element(name = "vBCSTDest", required = true)
    private String valorBCICMSSTUFDestino;

    @Element(name = "vICMSSTDest", required = true)
    private String valorICMSSTUFDestino;

    public void setOrigem(final NFOrigem origem) {
        this.origem = origem;
    }

    public void setSituacaoTributaria(final NFNotaInfoImpostoTributacaoICMS situacaoTributaria) {
        this.situacaoTributaria = situacaoTributaria;
    }

    public void setValorBCICMSSTRetidoUFRemetente(final BigDecimal valorBCICMSSTRetidoUFRemetente) {
        this.valorBCICMSSTRetidoUFRemetente = BigDecimalParser.tamanho15Com2CasasDecimais(valorBCICMSSTRetidoUFRemetente, "Valor BC ICMS ST Retido UF Remetente");
    }

    public void setValorICMSSTRetidoUFRemetente(final BigDecimal valorICMSSTRetidoUFRemetente) {
        this.valorICMSSTRetidoUFRemetente = BigDecimalParser.tamanho15Com2CasasDecimais(valorICMSSTRetidoUFRemetente, "Valor ICMS ST Retido UF Remetente");
    }

    public void setValorBCICMSSTUFDestino(final BigDecimal valorBCICMSSTUFDestino) {
        this.valorBCICMSSTUFDestino = BigDecimalParser.tamanho15Com2CasasDecimais(valorBCICMSSTUFDestino, "Valor BC ICMS ST UF Destino");
    }

    public void setValorICMSSTUFDestino(final BigDecimal valorICMSSTUFDestino) {
        this.valorICMSSTUFDestino = BigDecimalParser.tamanho15Com2CasasDecimais(valorICMSSTUFDestino, "Valor ICMS ST UF Destino");
    }

    public NFOrigem getOrigem() {
        return this.origem;
    }

    public NFNotaInfoImpostoTributacaoICMS getSituacaoTributaria() {
        return this.situacaoTributaria;
    }

    public String getValorBCICMSSTRetidoUFRemetente() {
        return this.valorBCICMSSTRetidoUFRemetente;
    }

    public String getValorICMSSTRetidoUFRemetente() {
        return this.valorICMSSTRetidoUFRemetente;
    }

    public String getValorBCICMSSTUFDestino() {
        return this.valorBCICMSSTUFDestino;
    }

    public String getValorICMSSTUFDestino() {
        return this.valorICMSSTUFDestino;
    }
}