package br.indie.fiscal4j.mdfe3.classes.nota;

import br.indie.fiscal4j.validadores.DFStringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by Eldevan Nery Junior on 08/11/17.
 * <p>
 * Nota Fiscal Eletronica.
 */
public class MDFInfoInformacoesNFe {

    /**
     * Nota Fiscal Eletronica - Chave de Acesso
     */
    @Element(name = "chNFe")
    private String chaveNFe;
    /**
     * Segundo código de barras
     */
    @Element(name = "SegCodBarra", required = false)
    private String segCodBarra;
    /**
     * Indicador de Reentrega
     */
    @Element(name = "indReentrega", required = false)
    private String indicadorReentrega;

    /**
     * Informações das Unidades de Transporte.
     */
    @ElementList(entry = "infUnidTransp", inline = true, required = false)
    private List<MDFInfoInformacoesDFeTipoUnidadeTransporte> informacoesUnidadeTransporte;

    /**
     * Preenchido quando for  transporte de produtos classificados pela ONU como perigosos.
     */
    @ElementList(entry = "peri", inline = true, required = false)
    private List<MDFInfoPerigosos> perigosos;

    public String getChaveNFe() {
        return chaveNFe;
    }

    public void setChaveNFe(String chaveNFe) {
        DFStringValidador.exatamente44N(chaveNFe, "Chave NF-e informações");
        this.chaveNFe = chaveNFe;
    }

    public String getSegCodBarra() {
        return segCodBarra;
    }

    public void setSegCodBarra(String segCodBarra) {
        this.segCodBarra = DFStringValidador.validador(segCodBarra, "Segundo codigo barras", 36, true, true);
    }

    public String getIndicadorReentrega() {
        return indicadorReentrega;
    }

    public void setIndicadorReentrega(String indicadorReentrega) {
        DFStringValidador.equals("1", indicadorReentrega);
        this.indicadorReentrega = indicadorReentrega;
    }

    public List<MDFInfoInformacoesDFeTipoUnidadeTransporte> getInformacoesUnidadeTransporte() {
        return informacoesUnidadeTransporte;
    }

    public void setInformacoesUnidadeTransporte(List<MDFInfoInformacoesDFeTipoUnidadeTransporte> informacoesUnidadeTransporte) {
        this.informacoesUnidadeTransporte = informacoesUnidadeTransporte;
    }

    public List<MDFInfoPerigosos> getPerigosos() {
        return perigosos;
    }

    public void setPerigosos(List<MDFInfoPerigosos> perigosos) {
        this.perigosos = perigosos;
    }
}