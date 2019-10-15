package br.indie.fiscal4j.cte300.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.BigDecimalValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;

/**
 * @author Caio
 * @info Informações do ICMS de partilha com a UF de término do serviço de transporte na operação interestadual<br>
 * Grupo a ser informado nas prestações interestaduais para consumidor final, não contribuinte do ICMS
 */

@Root(name = "ICMSUFFim")
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTeNotaInfoInformacoesRelativasImpostosICMSPartilha extends DFBase {
    private static final long serialVersionUID = 2502416156810045187L;

    @Element(name = "vBCUFFim")
    private String bcICMS;

    @Element(name = "pFCPUFFim")
    private String aliquotaFCP;

    @Element(name = "pICMSUFFim")
    private String aliquotaInterna;

    @Element(name = "pICMSInter")
    private String aliquotaInterestadual;

    @Element(name = "pICMSInterPart", required = false)
    private String aliquotaPartilha;

    @Element(name = "vFCPUFFim")
    private String valorFCP;

    @Element(name = "vICMSUFFim")
    private String valorUfDestino;

    @Element(name = "vICMSUFIni")
    private String valorUf;

    public CTeNotaInfoInformacoesRelativasImpostosICMSPartilha() {
        this.bcICMS = null;
        this.aliquotaFCP = null;
        this.aliquotaInterna = null;
        this.aliquotaInterestadual = null;
        this.aliquotaPartilha = null;
        this.valorFCP = null;
        this.valorUfDestino = null;
        this.valorUf = null;
    }

    public String getBcICMS() {
        return this.bcICMS;
    }

    /**
     * Valor da BC do ICMS na UF de término da prestação do serviço de transporte
     */
    public void setBcICMS(final BigDecimal bcICMS) {
        this.bcICMS = BigDecimalValidador.tamanho15Com2CasasDecimais(bcICMS, "Valor da BC do ICMS na UF de término da prestação do serviço de transporte");
    }

    public String getAliquotaFCP() {
        return this.aliquotaFCP;
    }

    /**
     * Percentual do ICMS relativo ao Fundo de Combate à pobreza (FCP) na UF de término da prestação do serviço de transporte<br>
     * Alíquota adotada nas operações internas na UF do destinatário
     */
    public void setAliquotaFCP(final BigDecimal aliquotaFCP) {
        this.aliquotaFCP = BigDecimalValidador.tamanho5Com2CasasDecimais(aliquotaFCP, "Percentual do ICMS relativo ao Fundo de Combate à pobreza (FCP)");
    }

    public String getAliquotaInterna() {
        return this.aliquotaInterna;
    }

    /**
     * Alíquota interna da UF de término da prestação do serviço de transporte<br>
     * Alíquota adotada nas operações internas na UF do destinatário
     */
    public void setAliquotaInterna(final BigDecimal aliquotaInterna) {
        this.aliquotaInterna = BigDecimalValidador.tamanho5Com2CasasDecimais(aliquotaInterna, "Alíquota interna da UF de término da prestação do serviço de transporte");
    }

    public String getAliquotaInterestadual() {
        return this.aliquotaInterestadual;
    }

    /**
     * Alíquota interestadual das UF envolvidas
     */
    public void setAliquotaInterestadual(final BigDecimal aliquotaInterestadual) {
        this.aliquotaInterestadual = BigDecimalValidador.tamanho5Com2CasasDecimais(aliquotaInterestadual, "Alíquota interestadual das UF envolvidas");
    }

    public String getAliquotaPartilha() {
        return this.aliquotaPartilha;
    }

    /**
     * Percentual provisório de partilha entre os estados<br>
     * Percentual de partilha para a UF do destinatário:<br>
     * - 40% em 2016;<br>
     * - 60% em 2017;<br>
     * - 80% em 2018;<br>
     * - 100% a partir de 2019.
     */
    public void setAliquotaPartilha(final BigDecimal aliquotaPartilha) {
        this.aliquotaPartilha = BigDecimalValidador.tamanho5Com2CasasDecimais(aliquotaPartilha, "Percentual provisório de partilha entre os estados");
    }

    public String getValorFCP() {
        return this.valorFCP;
    }

    /**
     * Valor do ICMS relativo ao Fundo de Combate á Pobreza (FCP) da UF de término da prestação
     */
    public void setValorFCP(final BigDecimal valorFCP) {
        this.valorFCP = BigDecimalValidador.tamanho15Com2CasasDecimais(valorFCP, "Valor do ICMS relativo ao Fundo de Combate á Pobreza (FCP)");
    }

    public String getValorUfDestino() {
        return this.valorUfDestino;
    }

    /**
     * Valor do ICMS de partilha para a UF de término da prestação do serviço de transporte
     */
    public void setValorUfDestino(final BigDecimal valorUfDestino) {
        this.valorUfDestino = BigDecimalValidador.tamanho15Com2CasasDecimais(valorUfDestino, "Valor do ICMS de partilha para a UF de término da prestação do serviço de transporte");
    }

    public String getValorUf() {
        return this.valorUf;
    }

    /**
     * Valor do ICMS de partilha para a UF de início da prestação do serviço de transporte
     */
    public void setValorUf(final BigDecimal valorUf) {
        this.valorUf = BigDecimalValidador.tamanho15Com2CasasDecimais(valorUf, "Valor do ICMS de partilha para a UF de início da prestação do serviço de transporte");
    }
}
