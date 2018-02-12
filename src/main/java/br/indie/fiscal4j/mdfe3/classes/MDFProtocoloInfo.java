package br.indie.fiscal4j.mdfe3.classes;

import br.indie.fiscal4j.DFAmbiente;
import br.indie.fiscal4j.DFBase;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import java.text.SimpleDateFormat;

public class MDFProtocoloInfo extends DFBase {

    @Attribute(name = "Id", required = false)
    private String identificador;

    @Element(name = "tpAmb", required = true)
    private DFAmbiente ambiente;

    @Element(name = "verAplic", required = true)
    private String versaoAplicacao;

    @Element(name = "chMDFe", required = true)
    private String chave;

    @Element(name = "dhRecbto", required = true)
    private String dataRecebimento;

    @Element(name = "nProt", required = false)
    private String numeroProtocolo;

    @Element(name = "digVal", required = false)
    private String validador;

    @Element(name = "cStat", required = true)
    private String status;

    @Element(name = "xMotivo", required = true)
    private String motivo;

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

    public String getChave() {
        return this.chave;
    }

    public void setChave(final String chave) {
        this.chave = chave;
    }

    public LocalDateTime getDataRecebimento() throws Exception {
        try {
            return LocalDateTime.parse(this.dataRecebimento, DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss"));
        } catch (final Exception e) {
            return LocalDateTime.fromDateFields(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").parse(this.dataRecebimento));
        }
    }

    public void setDataRecebimento(final String dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
    }

    public String getNumeroProtocolo() {
        return this.numeroProtocolo;
    }

    public void setNumeroProtocolo(final String numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
    }

    public String getValidador() {
        return this.validador;
    }

    public void setValidador(final String validador) {
        this.validador = validador;
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

    public String getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(final String identificador) {
        this.identificador = identificador;
    }
}