package br.indie.fiscal4j.nfe400.classes.evento;

import br.indie.fiscal4j.DFAmbiente;
import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.DFUnidadeFederativa;
import br.indie.fiscal4j.nfe400.converters.NFStringNullToEmptyConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

import java.util.List;

@Root(name = "retEnvEvento")
public class NFEnviaEventoRetorno extends DFBase {
    private static final long serialVersionUID = 8581761565026410859L;

    @Attribute(name = "versao", required = true)
    private String versao;

    // O Converter StringNullConverter esta sendo utilizado para resolver um problema da autorizadora SVAN, que esta retornandoo atributo idLote vazio.
    @Element(name = "idLote", required = true)
    @Convert(NFStringNullToEmptyConverter.class)
    private String idLote;

    @Element(name = "tpAmb", required = true)
    private DFAmbiente ambiente;

    @Element(name = "verAplic", required = true)
    private String versaoAplicativo;

    @Element(name = "cOrgao", required = true)
    private DFUnidadeFederativa orgao;

    @Element(name = "cStat", required = true)
    private Integer codigoStatusReposta;

    @Element(name = "xMotivo", required = true)
    private String motivo;

    @ElementList(entry = "retEvento", inline = true, required = false)
    private List<NFEventoRetorno> eventoRetorno;

    public String getVersao() {
        return this.versao;
    }

    public String getIdLote() {
        return this.idLote;
    }

    public DFAmbiente getAmbiente() {
        return this.ambiente;
    }

    public String getVersaoAplicativo() {
        return this.versaoAplicativo;
    }

    public DFUnidadeFederativa getOrgao() {
        return this.orgao;
    }

    public Integer getCodigoStatusReposta() {
        return this.codigoStatusReposta;
    }

    public String getMotivo() {
        return this.motivo;
    }

    public List<NFEventoRetorno> getEventoRetorno() {
        return this.eventoRetorno;
    }

    public void setVersao(final String versao) {
        this.versao = versao;
    }

    public void setIdLote(final String idLote) {
        this.idLote = idLote;
    }

    public void setAmbiente(final DFAmbiente ambiente) {
        this.ambiente = ambiente;
    }

    public void setVersaoAplicativo(final String versaoAplicativo) {
        this.versaoAplicativo = versaoAplicativo;
    }

    public void setOrgao(final DFUnidadeFederativa orgao) {
        this.orgao = orgao;
    }

    public void setCodigoStatusReposta(final Integer codigoStatusReposta) {
        this.codigoStatusReposta = codigoStatusReposta;
    }

    public void setMotivo(final String motivo) {
        this.motivo = motivo;
    }

    public void setEventoRetorno(final List<NFEventoRetorno> eventoRetorno) {
        this.eventoRetorno = eventoRetorno;
    }
}