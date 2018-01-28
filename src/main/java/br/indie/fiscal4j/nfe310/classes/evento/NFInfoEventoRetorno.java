package br.indie.fiscal4j.nfe310.classes.evento;

import br.indie.fiscal4j.DFAmbiente;
import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.DFUnidadeFederativa;
import org.joda.time.LocalDateTime;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

public class NFInfoEventoRetorno extends DFBase {
    private static final long serialVersionUID = 3251078839113682275L;

    @Attribute(name = "Id", required = false)
    private String id;

    @Element(name = "tpAmb", required = true)
    private DFAmbiente ambiente;

    @Element(name = "verAplic", required = true)
    private String versaoAplicativo;

    @Element(name = "cOrgao", required = true)
    private DFUnidadeFederativa orgao;

    @Element(name = "cStat", required = true)
    private Integer codigoStatus;

    @Element(name = "xMotivo", required = true)
    private String motivo;

    @Element(name = "chNFe", required = false)
    private String chave;

    @Element(name = "tpEvento", required = false)
    private String tipoEvento;

    @Element(name = "xEvento", required = false)
    private String descricaoEvento;

    @Element(name = "nSeqEvento", required = false)
    private Integer numeroSequencialEvento;

    @Element(name = "CNPJDest", required = false)
    private String cpnj;

    @Element(name = "CPFDest", required = false)
    private String cpf;

    @Element(name = "emailDest", required = false)
    private String email;

    @Element(name = "dhRegEvento", required = true)
    private LocalDateTime dataHoraRegistro;

    @Element(name = "nProt", required = false)
    private String numeroProtocolo;

    public String getId() {
        return this.id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public DFAmbiente getAmbiente() {
        return this.ambiente;
    }

    public void setAmbiente(final DFAmbiente ambiente) {
        this.ambiente = ambiente;
    }

    public String getVersaoAplicativo() {
        return this.versaoAplicativo;
    }

    public void setVersaoAplicativo(final String versaoAplicativo) {
        this.versaoAplicativo = versaoAplicativo;
    }

    public DFUnidadeFederativa getOrgao() {
        return this.orgao;
    }

    public void setOrgao(final DFUnidadeFederativa orgao) {
        this.orgao = orgao;
    }

    public Integer getCodigoStatus() {
        return this.codigoStatus;
    }

    public void setCodigoStatus(final Integer codigoStatus) {
        this.codigoStatus = codigoStatus;
    }

    public String getMotivo() {
        return this.motivo;
    }

    public void setMotivo(final String motivo) {
        this.motivo = motivo;
    }

    public String getChave() {
        return this.chave;
    }

    public void setChave(final String chave) {
        this.chave = chave;
    }

    public String getTipoEvento() {
        return this.tipoEvento;
    }

    public void setTipoEvento(final String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getDescricaoEvento() {
        return this.descricaoEvento;
    }

    public void setDescricaoEvento(final String descricaoEvento) {
        this.descricaoEvento = descricaoEvento;
    }

    public Integer getNumeroSequencialEvento() {
        return this.numeroSequencialEvento;
    }

    public void setNumeroSequencialEvento(final Integer numeroSequencialEvento) {
        this.numeroSequencialEvento = numeroSequencialEvento;
    }

    public String getCpnj() {
        return this.cpnj;
    }

    public void setCpnj(final String cpnj) {
        this.cpnj = cpnj;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(final String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public LocalDateTime getDataHoraRegistro() {
        return this.dataHoraRegistro;
    }

    public void setDataHoraRegistro(final LocalDateTime dataHoraRegistro) {
        this.dataHoraRegistro = dataHoraRegistro;
    }

    public String getNumeroProtocolo() {
        return this.numeroProtocolo;
    }

    public void setNumeroProtocolo(final String numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
    }
}