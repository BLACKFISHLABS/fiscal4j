package br.indie.fiscal4j.mdfe3.classes.nota.evento;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.DFStringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * Created by Edivaldo Merlo Stens on 19/02/20.
 */
@Root(name = "infDoc")
@Namespace(reference = "http://www.portalfiscal.inf.br/mdfe")
public class MDFeEnviaEventoIncluirDFeInfDoc extends DFBase {

    /**
     * Município de Descarregamento.
     */
    @Element(name = "cMunDescarga")
    private String codigoMunicipioDescarga;
    /**
     * Nome do Município de Descarregamento
     */
    @Element(name = "xMunDescarga")
    private String nomeMunicipioDescarga;

    @Element(name = "chNFe")
    private String chNFe;

    public String getMunicipioDescarga() {
        return codigoMunicipioDescarga;
    }

    public void setCodigoMunicipioDescarga(String codigoMunicipioDescarga) {
        this.codigoMunicipioDescarga = DFStringValidador.validaIntervalo(codigoMunicipioDescarga, 7, 7, "codigo municipio descarga", true);
    }

    public String getNomeMunicipioDescarga() {
        return nomeMunicipioDescarga;
    }

    public void setNomeMunicipioDescarga(String nomeMunicipioDescarga) {
        this.nomeMunicipioDescarga = DFStringValidador.validaIntervalo(nomeMunicipioDescarga, 2, 60, "Nome do Município de Descarregamento");
    }

    public String getChNFe() {
        return chNFe;
    }

    public void setChNFe(String chNFe) {
        DFStringValidador.exatamente44N(chNFe, "Chave NF-e informações");
        this.chNFe = chNFe;
    }

}
