package br.indie.fiscal4j.cte300.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.cte300.classes.CTCodigoSituacaoTributariaICMS;
import br.indie.fiscal4j.validadores.BigDecimalValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;

/**
 * @author Caio
 * @info Prestação sujeito à tributação normal do ICMS
 */

@Root(name = "ICMS00")
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTeNotaInfoInformacoesRelativasImpostosICMS00 extends DFBase {
    private static final long serialVersionUID = 3076530089256111200L;

    @Element(name = "CST")
    private CTCodigoSituacaoTributariaICMS codigoSituacaoTributaria;

    @Element(name = "vBC")
    private String baseCalculoICMS;

    @Element(name = "pICMS")
    private String aliquotaICMS;

    @Element(name = "vICMS")
    private String valorICMS;

    public CTeNotaInfoInformacoesRelativasImpostosICMS00() {
        this.codigoSituacaoTributaria = null;
        this.baseCalculoICMS = null;
        this.aliquotaICMS = null;
        this.valorICMS = null;
    }

    public CTCodigoSituacaoTributariaICMS getCodigoSituacaoTributaria() {
        return this.codigoSituacaoTributaria;
    }

    /**
     * classificação Tributária do Serviço<br>
     * 00 - tributação normal ICMS
     */
    public void setCodigoSituacaoTributaria(final CTCodigoSituacaoTributariaICMS codigoSituacaoTributaria) {
        this.codigoSituacaoTributaria = codigoSituacaoTributaria;
    }

    public String getBaseCalculoICMS() {
        return this.baseCalculoICMS;
    }

    /**
     * Valor da BC do ICMS
     */
    public void setBaseCalculoICMS(final BigDecimal baseCalculoICMS) {
        this.baseCalculoICMS = BigDecimalValidador.tamanho15Com2CasasDecimais(baseCalculoICMS, "Valor da BC do ICMS");
    }

    public String getAliquotaICMS() {
        return this.aliquotaICMS;
    }

    /**
     * Alíquota do ICMS
     */
    public void setAliquotaICMS(final BigDecimal aliquotaICMS) {
        this.aliquotaICMS = BigDecimalValidador.tamanho5Com2CasasDecimais(aliquotaICMS, "Alíquota do ICMS");
    }

    public String getValorICMS() {
        return this.valorICMS;
    }

    /**
     * Valor do ICMS
     */
    public void setValorICMS(final BigDecimal valorICMS) {
        this.valorICMS = BigDecimalValidador.tamanho15Com2CasasDecimais(valorICMS, "Valor do ICMS");
    }
}
