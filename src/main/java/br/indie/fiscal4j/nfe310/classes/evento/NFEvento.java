package br.indie.fiscal4j.nfe310.classes.evento;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.nfe310.classes.nota.assinatura.NFSignature;
import br.indie.fiscal4j.validadores.BigDecimalValidador;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NFEvento extends DFBase {
    private static final long serialVersionUID = 8494204773888020693L;

    @Attribute(name = "versao")
    private String versao;

    @Element(name = "infEvento")
    private NFInfoEvento infoEvento;

    @Element(name = "Signature", required = false)
    private NFSignature assinatura;

    public void setVersao(final BigDecimal versao) {
        this.versao = BigDecimalValidador.tamanho5Com2CasasDecimais(versao, "Versao");
    }

    public NFInfoEvento getInfoEvento() {
        return this.infoEvento;
    }

    public String getVersao() {
        return this.versao;
    }

    public void setInfoEvento(final NFInfoEvento infoEvento) {
        this.infoEvento = infoEvento;
    }

    public void setAssinatura(final NFSignature assinatura) {
        this.assinatura = assinatura;
    }

    public NFSignature getAssinatura() {
        return this.assinatura;
    }
}