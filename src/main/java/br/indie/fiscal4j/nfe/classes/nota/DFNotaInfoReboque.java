package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.common.DFUnidadeFederativa;
import br.indie.fiscal4j.nfe.validadores.StringValidador;
import org.simpleframework.xml.Element;

public class DFNotaInfoReboque extends DFBase {
    @Element(name = "placa", required = true)
    private String placaVeiculo;

    @Element(name = "UF", required = true)
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