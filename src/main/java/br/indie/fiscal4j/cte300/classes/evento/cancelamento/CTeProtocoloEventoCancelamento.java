package br.indie.fiscal4j.cte300.classes.evento.cancelamento;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.cte300.classes.evento.CTeEventoRetorno;
import br.indie.fiscal4j.validadores.BigDecimalValidador;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;

@Root(name = "procEventoCTe")
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTeProtocoloEventoCancelamento extends DFBase {
    private static final long serialVersionUID = -5921322695285609605L;

    @Attribute(name = "versao")
    private String versao;

    @Element(name = "eventoCTe")
    private CTeEventoCancelamento evento;

    @Element(name = "retEventoCTe", required = false)
    private CTeEventoRetorno eventoRetorno;

    public String getVersao() {
        return this.versao;
    }

    public void setVersao(final BigDecimal versao) {
        this.versao = BigDecimalValidador.tamanho4Com2CasasDecimais(versao, "Versao");
    }

    public CTeEventoCancelamento getEvento() {
        return this.evento;
    }

    public void setEvento(final CTeEventoCancelamento evento) {
        this.evento = evento;
    }

    public void setEventoRetorno(final CTeEventoRetorno infoEventoRetorno) {
        this.eventoRetorno = infoEventoRetorno;
    }

    public CTeEventoRetorno getEventoRetorno() {
        return this.eventoRetorno;
    }
}
