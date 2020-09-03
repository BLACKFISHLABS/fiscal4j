package br.indie.fiscal4j.mdfe3.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.mdfe3.classes.def.MDFTipoCargaProdutoPredominante;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * <h1>Grupo de informações do Produto predominante da carga do MDF-e </h1>
 */
@Root(name = "prodPred")
@Namespace(reference = "http://www.portalfiscal.inf.br/mdfe")
public class MDFInfoProdutoPredominante extends DFBase {
    private static final long serialVersionUID = -5711457880712720488L;

    /**
     * Tipo da Carga. Conforme Resolução ANTT nº. 5.849/2019.
     */
    @Element(name = "tpCarga", required = true)
    private MDFTipoCargaProdutoPredominante tpCarga;

    @Element(name = "xProd", required = true)
    private String xProd;

    @Element(name = "cEAN")
    private String cEAN;

    @Element(name = "NCM")
    private String NCM;

    @Element(name = "infLotacao")
    private MDFInfoProdutoPredominanteInfLotacao infLotacao;

    public MDFTipoCargaProdutoPredominante getTpCarga() {
        return tpCarga;
    }

    public void setTpCarga(MDFTipoCargaProdutoPredominante tpCarga) {
        this.tpCarga = tpCarga;
    }

    public String getXProd() {
        return xProd;
    }

    public void setXProd(String xProd) {
        this.xProd = xProd;
    }

    public String getCEAN() {
        return cEAN;
    }

    public void setCEAN(String cEAN) {
        this.cEAN = cEAN;
    }

    public String getNCM() {
        return NCM;
    }

    public void setNCM(String NCM) {
        this.NCM = NCM;
    }

    public MDFInfoProdutoPredominanteInfLotacao getInfLotacao() {
        return infLotacao;
    }

    public void setInfLotacao(MDFInfoProdutoPredominanteInfLotacao infLotacao) {
        this.infLotacao = infLotacao;
    }

}
