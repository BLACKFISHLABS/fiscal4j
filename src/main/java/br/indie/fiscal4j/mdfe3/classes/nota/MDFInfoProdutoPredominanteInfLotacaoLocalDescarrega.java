package br.indie.fiscal4j.mdfe3.classes.nota;

import br.indie.fiscal4j.DFBase;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * <h1>Informações da localização do descarregamento do MDF-e de carga lotação</h1>
 */
@Root(name = "infLocalDescarrega")
@Namespace(reference = "http://www.portalfiscal.inf.br/mdfe")
public class MDFInfoProdutoPredominanteInfLotacaoLocalDescarrega extends DFBase {
    private static final long serialVersionUID = -5711457880712720488L;

    @Element(name = "CEP", required = false)
    private String CEP;

    @Element(name = "latitude", required = false)
    private Float latitude;

    @Element(name = "longitude", required = false)
    private Float longitude;

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

}
