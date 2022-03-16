package br.indie.fiscal4j.cte300.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.DFStringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * @author Caio
 * @info Informações de Seguro do Multimodal
 */

@Root(name = "seg")
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTeNotaInfoCTeNormalInfoModalMultiModalSeguro extends DFBase {
    private static final long serialVersionUID = -866058288053801394L;

    @Element(name = "infSeg")
    private CTeNotaInfoCTeNormalInfoModalMultiModalSeguroInfo info;

    @Element(name = "nApol")
    private String apolice;

    @Element(name = "nAver")
    private String averbacao;

    public CTeNotaInfoCTeNormalInfoModalMultiModalSeguro() {
        this.info = null;
        this.apolice = null;
        this.averbacao = null;
    }

    public CTeNotaInfoCTeNormalInfoModalMultiModalSeguroInfo getInfo() {
        return this.info;
    }

    /**
     * Informações da seguradora
     */
    public void setInfo(final CTeNotaInfoCTeNormalInfoModalMultiModalSeguroInfo info) {
        this.info = info;
    }

    public String getApolice() {
        return this.apolice;
    }

    /**
     * Número da Apólice<br>
     * Obrigatório pela lei 11.442/07 (RCTRC)
     */
    public void setApolice(final String apolice) {
        DFStringValidador.tamanho20(apolice, "Número da Apólice");
        this.apolice = apolice;
    }

    public String getAverbacao() {
        return this.averbacao;
    }

    /**
     * Número da Averbação<br>
     * Não é obrigatório, pois muitas averbações ocorrem aapós a emissão do CT, mensalmente, por exemplo.
     */
    public void setAverbacao(final String averbacao) {
        DFStringValidador.tamanho20(averbacao, "Número da Averbação");
        this.averbacao = averbacao;
    }
}
