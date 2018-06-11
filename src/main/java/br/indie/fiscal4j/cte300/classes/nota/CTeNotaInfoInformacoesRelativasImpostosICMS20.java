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
 * @info Prestação sujeito à tributação com redução de BC do ICMS
 */

@Root(name = "ICMS20")
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTeNotaInfoInformacoesRelativasImpostosICMS20 extends DFBase {
    private static final long serialVersionUID = 8005865742494337097L;

    @Element(name = "CST", required = true)
    private CTCodigoSituacaoTributariaICMS codigoSituacaoTributaria;

    @Element(name = "pRedBC", required = true)
    private String aliquotaReducaoBaseCalculoICMS;

    @Element(name = "vBC", required = true)
    private String baseCalculoICMS;

    @Element(name = "pICMS", required = true)
    private String aliquotaICMS;

    @Element(name = "vICMS", required = true)
    private String valorICMS;

    public CTeNotaInfoInformacoesRelativasImpostosICMS20() {
        this.codigoSituacaoTributaria = null;
        this.aliquotaReducaoBaseCalculoICMS = null;
        this.baseCalculoICMS = null;
        this.aliquotaICMS = null;
        this.valorICMS = null;
    }

    public CTCodigoSituacaoTributariaICMS getCodigoSituacaoTributaria() {
        return this.codigoSituacaoTributaria;
    }

    /**
     * Classificação Tributária do serviço<br>
     * 20 - tributação com BC reduzida do ICMS
     */
    public void setCodigoSituacaoTributaria(final CTCodigoSituacaoTributariaICMS codigoSituacaoTributaria) {
        this.codigoSituacaoTributaria = codigoSituacaoTributaria;
    }

    public String getAliquotaReducaoBaseCalculoICMS() {
        return this.aliquotaReducaoBaseCalculoICMS;
    }

    /**
     * Percentual de redução da BC
     */
    public void setAliquotaReducaoBaseCalculoICMS(final BigDecimal aliquotaReducaoBaseCalculoICMS) {
        this.aliquotaReducaoBaseCalculoICMS = BigDecimalParser.tamanho5Com2CasasDecimais(aliquotaReducaoBaseCalculoICMS, "Percentual de redução da BC");
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
}
