package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.BigDecimalValidador;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoICMSUFDestino extends DFBase {
    private static final long serialVersionUID = -3012887551710007397L;

    @Element(name = "vBCUFDest")
    private String valorBaseCalculoDestino;

    @Element(name = "pFCPUFDest")
    private String percentualRelativoFundoCombatePobrezaDestino;

    @Element(name = "pICMSUFDest")
    private String percentualAliquotaInternaDestino;

    @Element(name = "pICMSInter")
    private String percentualInterestadual;

    @Element(name = "pICMSInterPart")
    private String percentualProvisorioPartilha;

    @Element(name = "vFCPUFDest")
    private String valorRelativoFundoCombatePobrezaDestino;

    @Element(name = "vICMSUFDest")
    private String valorICMSInterestadualDestino;

    @Element(name = "vICMSUFRemet")
    private String valorICMSInterestadualRemetente;

    public String getValorBaseCalculoDestino() {
        return this.valorBaseCalculoDestino;
    }

    public void setValorBaseCalculoDestino(final BigDecimal valorBaseCalculoDestino) {
        this.valorBaseCalculoDestino = BigDecimalValidador.tamanho15Com2CasasDecimais(valorBaseCalculoDestino, "Valor BC Destino");
    }

    public String getPercentualRelativoFundoCombatePobrezaDestino() {
        return this.percentualRelativoFundoCombatePobrezaDestino;
    }

    public void setPercentualRelativoFundoCombatePobrezaDestino(final BigDecimal percentualRelativoFundoCombatePobrezaDestino) {
        this.percentualRelativoFundoCombatePobrezaDestino = BigDecimalValidador.tamanho7ComAte4CasasDecimais(percentualRelativoFundoCombatePobrezaDestino, "Percentual Relativo Fundo Combate Pobreza Destino");
    }

    public String getPercentualAliquotaInternaDestino() {
        return this.percentualAliquotaInternaDestino;
    }

    public void setPercentualAliquotaInternaDestino(final BigDecimal percentualAliquotaInternaDestino) {
        this.percentualAliquotaInternaDestino = BigDecimalValidador.tamanho7ComAte4CasasDecimais(percentualAliquotaInternaDestino, "Percentual Aliquota Interna Destino");
    }

    public String getPercentualInterestadual() {
        return this.percentualInterestadual;
    }

    public void setPercentualInterestadual(final BigDecimal percentualInterestadual) {
        this.percentualInterestadual = BigDecimalValidador.tamanho7ComAte4CasasDecimais(percentualInterestadual, "Percentual Interestadual ICMS UF Destino");
    }

    public String getPercentualProvisorioPartilha() {
        return this.percentualProvisorioPartilha;
    }

    public void setPercentualProvisorioPartilha(final BigDecimal percentualProvisorioPartilha) {
        this.percentualProvisorioPartilha = BigDecimalValidador.tamanho7ComAte4CasasDecimais(percentualProvisorioPartilha, "Percentual Provisorio Partilha ICMS UF Destino");
    }

    public String getValorRelativoFundoCombatePobrezaDestino() {
        return this.valorRelativoFundoCombatePobrezaDestino;
    }

    public void setValorRelativoFundoCombatePobrezaDestino(final BigDecimal valorRelativoFundoCombatePobrezaDestino) {
        this.valorRelativoFundoCombatePobrezaDestino = BigDecimalValidador.tamanho15Com2CasasDecimais(valorRelativoFundoCombatePobrezaDestino, "Valor Relativo Fundo Combate Pobreza Destino");
    }

    public String getValorICMSInterestadualDestino() {
        return this.valorICMSInterestadualDestino;
    }

    public void setValorICMSInterestadualDestino(final BigDecimal valorICMSInterestadualDestino) {
        this.valorICMSInterestadualDestino = BigDecimalValidador.tamanho15Com2CasasDecimais(valorICMSInterestadualDestino, "Valor ICMS Interestadual ICMS UF Destino");
    }

    public String getValorICMSInterestadualRemetente() {
        return this.valorICMSInterestadualRemetente;
    }

    public void setValorICMSInterestadualRemetente(final BigDecimal valorICMSInterestadualRemetente) {
        this.valorICMSInterestadualRemetente = BigDecimalValidador.tamanho15Com2CasasDecimais(valorICMSInterestadualRemetente, "Valor ICMS Interestadual Remetente ICMS UF Destino");
    }
}