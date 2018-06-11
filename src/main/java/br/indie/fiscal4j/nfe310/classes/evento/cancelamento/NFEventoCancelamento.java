package br.indie.fiscal4j.nfe310.classes.evento.cancelamento;

import java.math.BigDecimal;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.nfe310.classes.nota.assinatura.NFSignature;
import br.indie.fiscal4j.validadores.BigDecimalParser;

@Root(name = "evento")
public class NFEventoCancelamento extends DFBase {
    private static final long serialVersionUID = -8466800561585040324L;

    @Attribute(name = "versao", required = true)
    private String versao;

    @Element(name = "infEvento", required = true)
    private NFInfoEventoCancelamento infoEvento;

    @Element(name = "Signature", required = false)
    private NFSignature assinatura;

    public void setVersao(final BigDecimal versao) {
        this.versao = BigDecimalParser.tamanho5Com2CasasDecimais(versao, "Versao");
    }

    public NFInfoEventoCancelamento getInfoEvento() {
        return this.infoEvento;
    }

    public String getVersao() {
        return this.versao;
    }

    public void setInfoEvento(final NFInfoEventoCancelamento infoEvento) {
        this.infoEvento = infoEvento;
    }

    public void setAssinatura(final NFSignature assinatura) {
        this.assinatura = assinatura;
    }

    public NFSignature getAssinatura() {
        return this.assinatura;
    }
}