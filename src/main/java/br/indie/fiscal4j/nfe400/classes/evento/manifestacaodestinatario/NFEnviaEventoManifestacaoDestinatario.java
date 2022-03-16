package br.indie.fiscal4j.nfe400.classes.evento.manifestacaodestinatario;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.DFBigDecimalValidador;
import br.indie.fiscal4j.validadores.DFListValidador;
import br.indie.fiscal4j.validadores.DFStringValidador;
import org.simpleframework.xml.*;

import java.math.BigDecimal;
import java.util.List;

@Root(name = "envEvento")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class NFEnviaEventoManifestacaoDestinatario extends DFBase {
    private static final long serialVersionUID = 8496530539655487485L;

    @Attribute(name = "versao")
    private String versao;

    @Element(name = "idLote")
    private String idLote;

    @ElementList(entry = "evento", inline = true)
    private List<NFEventoManifestacaoDestinatario> evento;

    public void setVersao(final BigDecimal versao) {
        this.versao = DFBigDecimalValidador.tamanho5Com2CasasDecimais(versao, "Versao");
    }

    public String getVersao() {
        return this.versao;
    }

    public String getIdLote() {
        return this.idLote;
    }

    public void setIdLote(final String idLote) {
        DFStringValidador.tamanho15N(idLote, "ID do Lote");
        this.idLote = idLote;
    }

    public List<NFEventoManifestacaoDestinatario> getEvento() {
        return this.evento;
    }

    public void setEvento(final List<NFEventoManifestacaoDestinatario> evento) {
        DFListValidador.tamanho20(evento, "Evento de Manifesta\u00e7\u00e3o do Destinat\u00e1rio");
        this.evento = evento;
    }
}