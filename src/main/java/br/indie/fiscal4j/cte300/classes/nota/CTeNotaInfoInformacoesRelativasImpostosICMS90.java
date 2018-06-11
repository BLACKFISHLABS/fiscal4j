package br.indie.fiscal4j.cte300.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.cte300.classes.CTCodigoSituacaoTributariaICMS;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;

/**
 * @author Caio
 * @info ICMS Outros
 */

@Root(name = "ICMS90")
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTeNotaInfoInformacoesRelativasImpostosICMS90 extends DFBase {
    private static final long serialVersionUID = -1396788244008831402L;

    @Element(name = "CST", required = true)
    private CTCodigoSituacaoTributariaICMS codigoSituacaoTributaria;

    @Element(name = "pRedBC", required = false)
    private String aliquotaReducaoBaseCalculo;

    @Element(name = "vBC", required = true)
    private String baseCalculoICMS;

    @Element(name = "pICMS", required = true)
    private String aliquotaICMS;

    @Element(name = "vICMS", required = true)
    private String valorICMS;

    @Element(name = "vCred", required = false)
    private String valorCredito;

    public CTeNotaInfoInformacoesRelativasImpostosICMS90() {
        this.codigoSituacaoTributaria = null;
        this.aliquotaReducaoBaseCalculo = null;
        this.baseCalculoICMS = null;
        this.aliquotaICMS = null;
        this.valorICMS = null;
        this.valorCredito = null;
    }

    public CTCodigoSituacaoTributariaICMS getCodigoSituacaoTributaria() {
        return this.codigoSituacaoTributaria;
    }

    /**
     * Classificação Tributária do Serviço<br>
     * 90 - ICMS outros
     */
    public void setCodigoSituacaoTributaria(final CTCodigoSituacaoTributariaICMS codigoSituacaoTributaria) {
        this.codigoSituacaoTributaria = codigoSituacaoTributaria;
    }

    public String getAliquotaReducaoBaseCalculo() {
        return this.aliquotaReducaoBaseCalculo;
    }

    /**
     * Percentual de redução da BC
     */
    public void setAliquotaReducaoBaseCalculo(final BigDecimal aliquotaReducaoBaseCalculo) {
        this.aliquotaReducaoBaseCalculo = BigDecimalParser.tamanho5Com2CasasDecimais(aliquotaReducaoBaseCalculo, "Percentual de redução da BC");
    }

    public String getBaseCalculoICMS() {
        return this.baseCalculoICMS;
    }

    /**
     * Valor da BC do ICMS
     */
    public void setBaseCalculoICMS(final BigDecimal baseCalculoICMS) {
        this.baseCalculoICMS = BigDecimalParser.tamanho15Com2CasasDecimais(baseCalculoICMS, "Valor da BC do ICMS");
    }

    public String getAliquotaICMS() {
        return this.aliquotaICMS;
    }

    /**
     * Alíquota do ICMS
     */
    public void setAliquotaICMS(final BigDecimal aliquotaICMS) {
        this.aliquotaICMS = BigDecimalParser.tamanho5Com2CasasDecimais(aliquotaICMS, "Alíquota do ICMS");
    }

    public String getValorICMS() {
        return this.valorICMS;
    }

    /**
     * Valor do ICMS
     */
    public void setValorICMS(final BigDecimal valorICMS) {
        this.valorICMS = BigDecimalParser.tamanho15Com2CasasDecimais(valorICMS, "Valor do ICMS");
    }

    public String getValorCredito() {
        return this.valorCredito;
    }

    /**
     * Valor do Crédito Outorgado/Presumido
     */
    public void setValorCredito(final BigDecimal valorCredito) {
        this.valorCredito = BigDecimalParser.tamanho15Com2CasasDecimais(valorCredito, "Valor do Crédito Outorgado/Presumido");
    }
}
