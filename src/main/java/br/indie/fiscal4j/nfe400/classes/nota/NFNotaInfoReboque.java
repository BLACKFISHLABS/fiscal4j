package br.indie.fiscal4j.nfe400.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.DFUnidadeFederativa;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Element;

public class NFNotaInfoReboque extends DFBase {
    private static final long serialVersionUID = 5653075594659818560L;

    @Element(name = "placa")
    private String placaVeiculo;

    @Element(name = "UF")
    private String uf;

    @Element(name = "RNTC", required = false)
    private String registroNacionalTransportadorCarga;

    public void setPlacaVeiculo(final String placaVeiculo) {
        StringValidador.placaDeVeiculo(placaVeiculo);
        this.placaVeiculo = placaVeiculo;
    }

    public void setUf(final DFUnidadeFederativa uf) {
        this.uf = uf.getCodigo();
    }

    public void setRegistroNacionalTransportadorCarga(final String registroNacionalTransportadorCarga) {
        StringValidador.tamanho20(registroNacionalTransportadorCarga, "Registro Nacional Transportador Carga Reboque");
        this.registroNacionalTransportadorCarga = registroNacionalTransportadorCarga;
    }

    public String getPlacaVeiculo() {
        return this.placaVeiculo;
    }

    public String getUf() {
        return this.uf;
    }

    public String getRegistroNacionalTransportadorCarga() {
        return this.registroNacionalTransportadorCarga;
    }
}