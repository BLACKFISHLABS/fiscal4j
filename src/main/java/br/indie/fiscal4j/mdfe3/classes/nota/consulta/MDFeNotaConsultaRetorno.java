package br.indie.fiscal4j.mdfe3.classes.nota.consulta;

import br.indie.fiscal4j.DFAmbiente;
import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.DFUnidadeFederativa;
import br.indie.fiscal4j.mdfe3.classes.MDFProtocolo;
import br.indie.fiscal4j.mdfe3.classes.nota.evento.MDFeProtocoloEvento;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.util.List;


@Root(name = "retConsSitMDFe", strict = false)
@Namespace(reference = "http://www.portalfiscal.inf.br/mdfe")
public class MDFeNotaConsultaRetorno extends DFBase {

    @Attribute(name = "versao", required = true)
    private String versao;

    @Element(name = "tpAmb", required = true)
    private DFAmbiente ambiente;

    @Element(name = "verAplic", required = true)
    private String versaoAplicacao;

    @Element(name = "cStat", required = true)
    private String status;

    @Element(name = "xMotivo", required = true)
    private String motivo;

    @Element(name = "cUF", required = true)
    private DFUnidadeFederativa uf;

    @Element(name = "protMDFe", required = false)
    protected MDFProtocolo protocolo;

    @ElementList(entry = "procEventoMDFe", inline = true, required = false)
    private List<MDFeProtocoloEvento> protocoloEvento;

    public String getVersao() {
        return this.versao;
    }

    public void setVersao(final String versao) {
        this.versao = versao;
    }

    public DFAmbiente getAmbiente() {
        return this.ambiente;
    }

    public void setAmbiente(final DFAmbiente ambiente) {
        this.ambiente = ambiente;
    }

    public String getVersaoAplicacao() {
        return this.versaoAplicacao;
    }

    public void setVersaoAplicacao(final String versaoAplicacao) {
        this.versaoAplicacao = versaoAplicacao;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public String getMotivo() {
        return this.motivo;
    }

    public void setMotivo(final String motivo) {
        this.motivo = motivo;
    }

    public DFUnidadeFederativa getUf() {
        return this.uf;
    }

    public void setUf(final DFUnidadeFederativa uf) {
        this.uf = uf;
    }

    public MDFProtocolo getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(MDFProtocolo protocolo) {
        this.protocolo = protocolo;
    }

    public List<MDFeProtocoloEvento> getProtocoloEvento() {
        return protocoloEvento;
    }

    public void setProtocoloEvento(List<MDFeProtocoloEvento> protocoloEvento) {
        this.protocoloEvento = protocoloEvento;
    }
}