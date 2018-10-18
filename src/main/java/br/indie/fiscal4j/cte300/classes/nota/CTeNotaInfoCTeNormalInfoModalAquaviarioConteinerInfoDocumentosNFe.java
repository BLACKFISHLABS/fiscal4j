package br.indie.fiscal4j.cte300.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;

/**
 * @author Caio
 * @info Informações das NFe
 */

@Root(name = "infNFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTeNotaInfoCTeNormalInfoModalAquaviarioConteinerInfoDocumentosNFe extends DFBase {
    private static final long serialVersionUID = -2556091825989274041L;

    @Element(name = "chave", required = true)
    private String chave;

    @Element(name = "unidRat", required = false)
    private String unidadeRateada;

    public CTeNotaInfoCTeNormalInfoModalAquaviarioConteinerInfoDocumentosNFe() {
        this.chave = null;
        this.unidadeRateada = null;
    }

    public String getChave() {
        return this.chave;
    }

    /**
     * Chave de acesso da NF-e
     */
    public void setChave(final String chave) {
        StringValidador.exatamente44N(chave, "Chave de acesso da NF-e");
        this.chave = chave;
    }

    public String getUnidadeRateada() {
        return this.unidadeRateada;
    }

    /**
     * Unidade de medida rateada (Peso,Volume)
     */
    public void setUnidadeRateada(final BigDecimal unidadeRateada) {
        this.unidadeRateada = BigDecimalParser.tamanho5Com2CasasDecimais(unidadeRateada, "Unidade de medida rateada (Peso,Volume)");
    }
}
