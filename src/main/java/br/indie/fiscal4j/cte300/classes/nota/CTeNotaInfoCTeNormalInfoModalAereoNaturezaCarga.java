package br.indie.fiscal4j.cte300.classes.nota;

import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.cte300.classes.CTInformacoesManuseio;
import br.indie.fiscal4j.validadores.StringValidador;

/**
 * @author Caio
 * @info Natureza da carga
 */

@Root(name = "natCarga")
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTeNotaInfoCTeNormalInfoModalAereoNaturezaCarga extends DFBase {
    private static final long serialVersionUID = -1575890990806454810L;

    @Element(name = "xDime", required = false)
    private String dimensao;

    @ElementList(name = "cInfManu", inline = false, required = false)
    private List<CTInformacoesManuseio> informacoesManuseio;

    public CTeNotaInfoCTeNormalInfoModalAereoNaturezaCarga() {
        this.dimensao = null;
        this.informacoesManuseio = null;
    }

    public String getDimensao() {
        return this.dimensao;
    }

    /**
     * Dimensão<br>
     * Formato:1234X1234X1234 (cm). Esse campo deve sempre que possível ser preenchido. Entretanto, quando for impossível o preenchimento das dimensões, fica obrigatório o preenchimento da cubagem em metro cúbico do leiaute do CT-e da estrutura genérica (infQ).
     */
    public void setDimensao(final String dimensao) {
        StringValidador.tamanho5a14(dimensao, "Dimensão");
        this.dimensao = dimensao;
    }

    public List<CTInformacoesManuseio> getInformacoesManuseio() {
        return this.informacoesManuseio;
    }

    /**
     * Informações de manuseio<br>
     * 01 - certificado do expedidor para embarque de animal vivo;<br>
     * 02 - artigo perigoso conforme Declaração do Expedidor anexa;<br>
     * 03 - somente em aeronave cargueira;<br>
     * 04 - artigo perigoso - declaração do expedidor não requerida;<br>
     * 05 - artigo perigoso em quantidade isenta;<br>
     * 06 - gelo seco para refrigeração (especificar no campo observações a quantidade);<br>
     * 07 - não restrito (especificar a Disposição Especial no campo observações);<br>
     * 08 - artigo perigoso em carga consolidada (especificar a quantidade no campo observações)<br>
     * ; 09 - autorização da autoridade governamental anexa (especificar no campo observações);<br>
     * 10 – baterias de íons de lítio em conformidade com a Seção II da PI965 – CAO<br>
     * ; 11 - baterias de íons de lítio em conformidade com a Seção II da PI966<br>
     * ; 12 - baterias de íons de lítio em conformidade com a Seção II da PI967<br>
     * ; 13 – baterias de metal lítio em conformidade com a Seção II da PI968 — CAO;<br>
     * 14 - baterias de metal lítio em conformidade com a Seção II da PI969;<br>
     * 15 - baterias de metal lítio em conformidade com a Seção II da PI970<br>
     * ; 99 - outro (especificar no campo observações)
     */
    public void setInformacoesManuseio(final List<CTInformacoesManuseio> informacoesManuseio) {
        this.informacoesManuseio = informacoesManuseio;
    }
}
