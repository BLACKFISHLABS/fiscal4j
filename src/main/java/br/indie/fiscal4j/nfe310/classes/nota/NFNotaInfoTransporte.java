package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.nfe310.classes.NFModalidadeFrete;
import br.indie.fiscal4j.validadores.DFListValidador;
import br.indie.fiscal4j.validadores.DFStringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

public class NFNotaInfoTransporte extends DFBase {
    private static final long serialVersionUID = 1172316192774549031L;

    @Element(name = "modFrete")
    private NFModalidadeFrete modalidadeFrete;

    @Element(name = "transporta", required = false)
    private NFNotaInfoTransportador transportador;

    @Element(name = "retTransp", required = false)
    private NFNotaInfoRetencaoICMSTransporte icmsTransporte;

    @Element(name = "veicTransp", required = false)
    private NFNotaInfoVeiculo veiculo;

    @ElementList(entry = "reboque", inline = true, required = false)
    private List<NFNotaInfoReboque> reboques;

    @Element(name = "vagao", required = false)
    private String vagao;

    @Element(name = "balsa", required = false)
    private String balsa;

    @ElementList(entry = "vol", inline = true, required = false)
    private List<NFNotaInfoVolume> volumes;

    public void setModalidadeFrete(final NFModalidadeFrete modalidadeFrete) {
        this.modalidadeFrete = modalidadeFrete;
    }

    public void setTransportador(final NFNotaInfoTransportador transportador) {
        this.transportador = transportador;
    }

    public void setIcmsTransporte(final NFNotaInfoRetencaoICMSTransporte icmsTransporte) {
        this.icmsTransporte = icmsTransporte;
    }

    public void setVeiculo(final NFNotaInfoVeiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void setReboques(final List<NFNotaInfoReboque> reboques) {
        DFListValidador.tamanho5(reboques, "Reboques");
        this.reboques = reboques;
    }

    public void setVolumes(final List<NFNotaInfoVolume> volumes) {
        DFListValidador.tamanho5000(volumes, "Volumes");
        this.volumes = volumes;
    }

    public void setVagao(final String vagao) {
        DFStringValidador.tamanho20(vagao, "Vagao");
        this.vagao = vagao;
    }

    public void setBalsa(final String balsa) {
        DFStringValidador.tamanho20(balsa, "Balsa");
        this.balsa = balsa;
    }

    public NFModalidadeFrete getModalidadeFrete() {
        return this.modalidadeFrete;
    }

    public NFNotaInfoTransportador getTransportador() {
        return this.transportador;
    }

    public NFNotaInfoRetencaoICMSTransporte getIcmsTransporte() {
        return this.icmsTransporte;
    }

    public NFNotaInfoVeiculo getVeiculo() {
        return this.veiculo;
    }

    public List<NFNotaInfoReboque> getReboques() {
        return this.reboques;
    }

    public String getVagao() {
        return this.vagao;
    }

    public String getBalsa() {
        return this.balsa;
    }

    public List<NFNotaInfoVolume> getVolumes() {
        return this.volumes;
    }
}