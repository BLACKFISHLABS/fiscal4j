package br.indie.fiscal4j.mdfe3.classes.nota;

import br.indie.fiscal4j.validadores.DFListValidador;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by Eldevan Nery Junior on 06/11/17.
 * <p>
 * Informações dos Documentos fiscais vinculados ao manifesto.
 */
public class MDFInfoInformacoesDocumentos {

    /**
     * Informações dos Municípios de descarregamento
     */
    @ElementList(entry = "infMunDescarga", inline = true)
    private List<MDFInfoInformacoesMunicipioDescarga> informacoesMunicipioDescargas;

    public List<MDFInfoInformacoesMunicipioDescarga> getInformacoesMunicipioDescargas() {
        return informacoesMunicipioDescargas;
    }

    public void setInformacoesMunicipioDescargas(List<MDFInfoInformacoesMunicipioDescarga> informacoesMunicipioDescargas) {
        this.informacoesMunicipioDescargas = DFListValidador.validaListaObrigatoria(informacoesMunicipioDescargas, 1000, "Lista de Municípios de descarregamento");
    }
}