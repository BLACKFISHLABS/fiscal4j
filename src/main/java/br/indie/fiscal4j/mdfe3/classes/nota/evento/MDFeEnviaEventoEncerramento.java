package br.indie.fiscal4j.mdfe3.classes.nota.evento;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.DFUnidadeFederativa;
import br.indie.fiscal4j.validadores.StringValidador;
import org.joda.time.LocalDate;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * Created by Eldevan Nery Junior on 17/11/17.
 */
@Root(name = "evEncMDFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/mdfe")
public class MDFeEnviaEventoEncerramento extends DFBase {

    @Element(name = "descEvento")
    private String descricaoEvento = "Encerramento";

    @Element(name = "nProt")
    private String protocoloAutorizacao;

    /**
     * Data que o Manifesto foi encerrado
     */
    @Element(name = "dtEnc")
    private LocalDate dataEncerramento;

    /**
     * UF de encerramento do Manifesto
     */
    @Element(name = "cUF")
    private DFUnidadeFederativa uf;

    /**
     * Código do Município de Encerramento do manifesto
     */
    @Element(name = "cMun")
    private String codigoMunicipio;

    public String getProtocoloAutorizacao() {
        return this.protocoloAutorizacao;
    }

    public void setProtocoloAutorizacao(final String protocoloAutorizacao) {
        StringValidador.exatamente15N(protocoloAutorizacao, "Protocolo de Autorizacao");
        this.protocoloAutorizacao = protocoloAutorizacao;
    }

    public String getDescricaoEvento() {
        return this.descricaoEvento;
    }

    public void setDescricaoEvento(final String descricaoEvento) {
        String defaultValue = "Encerramento";
        StringValidador.equals(defaultValue, descricaoEvento);
        this.descricaoEvento = descricaoEvento;
    }

    public DFUnidadeFederativa getUf() {
        return uf;
    }

    public void setUf(DFUnidadeFederativa uf) {
        this.uf = uf;
    }

    public String getCodigoMunicipio() {
        return codigoMunicipio;
    }

    public void setCodigoMunicipio(String codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }

    public LocalDate getDataEncerramento() {
        return dataEncerramento;
    }

    public void setDataEncerramento(LocalDate dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
    }
}