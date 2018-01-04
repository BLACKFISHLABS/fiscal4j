package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.nfe.classes.NFModalidadeFrete;
import br.indie.fiscal4j.nfe.validadores.ListValidador;
import br.indie.fiscal4j.nfe.validadores.StringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

public class DFNotaInfoTransporte extends DFBase {
    @Element(name = "modFrete", required = true)
    private NFModalidadeFrete modalidadeFrete;

    @Element(name = "transporta", required = false)
    private DFNotaInfoTransportador transportador;

    @Element(name = "retTransp", required = false)
    private DFNotaInfoRetencaoICMSTransporte icmsTransporte;

    @Element(name = "veicTransp", required = false)
    private DFNotaInfoVeiculo veiculo;

    @ElementList(entry = "reboque", inline = true, required = false)
    private List<DFNotaInfoReboque> reboques;

    @Element(name = "vagao", required = false)
    private String vagao;

    @Element(name = "balsa", required = false)
    private String balsa;

    @ElementList(entry = "vol", inline = true, required = false)
    private List<DFNotaInfoVolume> volumes;

    public void setModalidadeFrete(final NFModalidadeFrete modalidadeFrete) {
        this.modalidadeFrete = modalidadeFrete;
    }

    public void setTransportador(final DFNotaInfoTransportador transportador) {
        this.transportador = transportador;
    }

    public void setIcmsTransporte(final DFNotaInfoRetencaoICMSTransporte icmsTransporte) {
        this.icmsTransporte = icmsTransporte;
    }

    public void setVeiculo(final DFNotaInfoVeiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void setReboques(final List<DFNotaInfoReboque> reboques) {
        ListValidador.tamanho5(reboques, "Reboques");
        this.reboques = reboques;
    }

    public void setVolumes(final List<DFNotaInfoVolume> volumes) {
        ListValidador.tamanho5000(volumes, "Volumes");
        this.volumes = volumes;
    }

    public void setVagao(final String vagao) {
        StringValidador.tamanho20(vagao, "Vagao");
        this.vagao = vagao;
    }

    public void setBalsa(final String balsa) {
        StringValidador.tamanho20(balsa, "Balsa");
        this.balsa = balsa;
    }

    public NFModalidadeFrete getModalidadeFrete() {
        return this.modalidadeFrete;
    }

    public DFNotaInfoTransportador getTransportador() {
        return this.transportador;
    }

    public DFNotaInfoRetencaoICMSTransporte getIcmsTransporte() {
        return this.icmsTransporte;
    }

    public DFNotaInfoVeiculo getVeiculo() {
        return this.veiculo;
    }

    public List<DFNotaInfoReboque> getReboques() {
        return this.reboques;
    }

    public String getVagao() {
        return this.vagao;
    }

    public String getBalsa() {
        return this.balsa;
    }

    public List<DFNotaInfoVolume> getVolumes() {
        return this.volumes;
    }
}