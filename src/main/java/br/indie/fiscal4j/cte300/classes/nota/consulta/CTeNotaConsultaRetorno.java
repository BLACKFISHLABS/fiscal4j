package br.indie.fiscal4j.cte300.classes.nota.consulta;

import br.indie.fiscal4j.DFAmbiente;
import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.DFUnidadeFederativa;
import br.indie.fiscal4j.cte300.classes.enviolote.consulta.CTeProtocolo;
import br.indie.fiscal4j.cte300.classes.evento.cancelamento.CTeProtocoloEventoCancelamento;
import br.indie.fiscal4j.cte300.classes.evento.cancelamento.CTeRetornoCancelamento;
import org.simpleframework.xml.*;

import java.util.List;

@Root(name = "retConsSitCTe", strict = false)
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTeNotaConsultaRetorno extends DFBase {
    private static final long serialVersionUID = 3229234247371007557L;

    @Attribute(name = "versao")
    private String versao;

    @Element(name = "tpAmb")
    private DFAmbiente ambiente;

    @Element(name = "verAplic")
    private String versaoAplicacao;

    @Element(name = "cStat")
    private String status;

    @Element(name = "xMotivo")
    private String motivo;

    @Element(name = "cUF")
    private DFUnidadeFederativa uf;

    @Element(name = "protCTe", required = false)
    protected CTeProtocolo protocolo;

    @Element(name = "retCancCTe", required = false)
    private CTeRetornoCancelamento protocoloCancelamento;

    @ElementList(entry = "procEventoCTe", inline = true, required = false)
    private List<CTeProtocoloEventoCancelamento> protocoloEvento;

    public CTeNotaConsultaRetorno() {
        this.versao = null;
        this.ambiente = null;
        this.versaoAplicacao = null;
        this.status = null;
        this.motivo = null;
        this.uf = null;
        this.protocolo = null;
    }

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

    public CTeProtocolo getProtocolo() {
        return this.protocolo;
    }

    public void setProtocolo(final CTeProtocolo protocolo) {
        this.protocolo = protocolo;
    }

}