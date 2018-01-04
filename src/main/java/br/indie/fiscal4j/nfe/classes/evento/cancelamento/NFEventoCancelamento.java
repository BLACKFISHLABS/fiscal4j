package br.indie.fiscal4j.nfe.classes.evento.cancelamento;

import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.nfe.classes.nota.assinatura.DFSignature;
import br.indie.fiscal4j.nfe.validadores.BigDecimalParser;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;

@Root(name = "evento")
public class NFEventoCancelamento extends DFBase {

    @Attribute(name = "versao", required = true)
    private String versao;

    @Element(name = "infEvento", required = true)
    private NFInfoEventoCancelamento infoEvento;

    @Element(name = "Signature", required = false)
    private DFSignature assinatura;

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

    public void setAssinatura(final DFSignature assinatura) {
        this.assinatura = assinatura;
    }

    public DFSignature getAssinatura() {
        return this.assinatura;
    }
}