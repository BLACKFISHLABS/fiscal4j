package br.indie.fiscal4j.cte300.classes.nota;

import java.math.BigDecimal;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.cte300.classes.CTTipoUnidadeCarga;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import br.indie.fiscal4j.validadores.StringValidador;

/**
 * @author Caio
 * @info Informações das Unidades de Carga (Containeres/ULD/Outros)<br>
 *       Dispositivo de carga utilizada (Unit Load Device - ULD) significa todo tipo de contêiner de carga, vagão, contêiner de avião, palete de aeronave com rede ou palete de aeronave com rede sobre um iglu.
 */

@Root(name = "infUnidCarga")
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTeNotaInfoCTeNormalInfoDocumentosInfoUnidadeCarga extends DFBase {
    private static final long serialVersionUID = -3462616457147475669L;

    @Element(name = "tpUnidCarga", required = true)
    private CTTipoUnidadeCarga unidadeCarga;

    @Element(name = "idUnidCarga", required = true)
    private String identificacaoCarga;

    @Element(name = "lacUnidCarga", required = false)
    private List<CTeNotaInfoCTeNormalInfoDocumentosLacre> lacre;

    @Element(name = "qtdRat", required = false)
    private String quantidadeRateada;

    public CTeNotaInfoCTeNormalInfoDocumentosInfoUnidadeCarga() {
        this.unidadeCarga = null;
        this.identificacaoCarga = null;
        this.lacre = null;
        this.quantidadeRateada = null;
    }

    public CTTipoUnidadeCarga getUnidadeCarga() {
        return this.unidadeCarga;
    }

    /**
     * Tipo da Unidade de Carga<br>
     * 1 - Container<br>
     * 2 - ULD<br>
     * 3 - Pallet<br>
     * 4 - Outros
     */
    public void setUnidadeCarga(final CTTipoUnidadeCarga unidadeCarga) {
        this.unidadeCarga = unidadeCarga;
    }

    public String getIdentificacaoCarga() {
        return this.identificacaoCarga;
    }

    /**
     * Identificação da Unidade de Carga<br>
     * Informar a identificação da unidade de carga, por exemplo: número do container.
     */
    public void setIdentificacaoCarga(final String identificacaoCarga) {
        StringValidador.tamanho20(identificacaoCarga, "Identificação da Unidade de Carga");
        this.identificacaoCarga = identificacaoCarga;
    }

    public List<CTeNotaInfoCTeNormalInfoDocumentosLacre> getLacre() {
        return this.lacre;
    }

    /**
     * Lacres das Unidades de Carga
     */
    public void setLacre(final List<CTeNotaInfoCTeNormalInfoDocumentosLacre> lacre) {
        this.lacre = lacre;
    }

    public String getQuantidadeRateada() {
        return this.quantidadeRateada;
    }

    /**
     * Quantidade rateada (Peso,Volume)
     */
    public void setQuantidadeRateada(final BigDecimal quantidadeRateada) {
        this.quantidadeRateada = BigDecimalParser.tamanho5Com2CasasDecimais(quantidadeRateada, "Quantidade rateada (Peso,Volume)");
    }
}
