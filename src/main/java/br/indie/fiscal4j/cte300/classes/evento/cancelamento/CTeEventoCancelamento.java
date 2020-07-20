package br.indie.fiscal4j.cte300.classes.evento.cancelamento;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.nfe400.classes.nota.assinatura.NFSignature;
import br.indie.fiscal4j.validadores.BigDecimalValidador;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;

@Root(name = "eventoCTe")
public class CTeEventoCancelamento extends DFBase {
    private static final long serialVersionUID = -8363617761063438288L;

    @Attribute(name = "versao")
    private String versao;

    @Element(name = "infEvento")
    private CTeInfoEventoCancelamento infoEvento;

    @Element(name = "Signature", required = false)
    private NFSignature assinatura;

    public String getVersao() {
        return this.versao;
    }

    public void setVersao(final BigDecimal versao) {
        this.versao = BigDecimalValidador.tamanho5Com2CasasDecimais(versao, "Versao");
    }

    public CTeInfoEventoCancelamento getInfoEvento() {
        return this.infoEvento;
    }

    public void setInfoEvento(final CTeInfoEventoCancelamento infoEvento) {
        this.infoEvento = infoEvento;
    }

    public NFSignature getAssinatura() {
        return this.assinatura;
    }

    public void setAssinatura(final NFSignature assinatura) {
        this.assinatura = assinatura;
    }
}