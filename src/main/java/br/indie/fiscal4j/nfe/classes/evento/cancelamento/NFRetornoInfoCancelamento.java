package br.indie.fiscal4j.nfe.classes.evento.cancelamento;

import br.indie.fiscal4j.common.DFAmbiente;
import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.common.DFUnidadeFederativa;
import br.indie.fiscal4j.nfe.classes.nota.assinatura.NFSignature;
import org.joda.time.LocalDateTime;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

public class NFRetornoInfoCancelamento extends DFBase {

    @Attribute(name = "ID", required = false)
    private String identificador;

    @Element(name = "tpAmb", required = true)
    private DFAmbiente ambiente;

    @Element(name = "verAplic", required = true)
    private String versaoAplicacao;

    @Element(name = "cStat", required = true)
    private String codigoStatus;

    @Element(name = "xMotivo", required = true)
    private String motivo;

    @Element(name = "cUF", required = true)
    private DFUnidadeFederativa uf;

    @Element(name = "chNFe", required = false)
    private String chave;

    @Element(name = "dhRecbto", required = false)
    private LocalDateTime datahoraRecebimento;

    @Element(name = "nProt", required = false)
    private String numeroProtocolo;

    @Element(name = "Signature", required = false)
    private NFSignature assinatura;

    public String getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(final String identificador) {
        this.identificador = identificador;
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

    public String getCodigoStatus() {
        return this.codigoStatus;
    }

    public void setCodigoStatus(final String codigoStatus) {
        this.codigoStatus = codigoStatus;
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

    public String getChave() {
        return this.chave;
    }

    public void setChave(final String chave) {
        this.chave = chave;
    }

    public LocalDateTime getDatahoraRecebimento() {
        return this.datahoraRecebimento;
    }

    public void setDatahoraRecebimento(final LocalDateTime datahoraRecebimento) {
        this.datahoraRecebimento = datahoraRecebimento;
    }

    public String getNumeroProtocolo() {
        return this.numeroProtocolo;
    }

    public void setNumeroProtocolo(final String numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
    }

    public NFSignature getAssinatura() {
        return this.assinatura;
    }

    public void setAssinatura(final NFSignature assinatura) {
        this.assinatura = assinatura;
    }
}