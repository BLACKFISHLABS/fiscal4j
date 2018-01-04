package br.indie.fiscal4j.nfe.classes.evento;

import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.nfe.classes.nota.assinatura.DFSignature;
import br.indie.fiscal4j.nfe.validadores.BigDecimalParser;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NFEvento extends DFBase {

    @Attribute(name = "versao", required = true)
    private String versao;

    @Element(name = "infEvento", required = true)
    private NFInfoEvento infoEvento;

    @Element(name = "Signature", required = false)
    private DFSignature assinatura;

    public void setVersao(final BigDecimal versao) {
        this.versao = BigDecimalParser.tamanho5Com2CasasDecimais(versao, "Versao");
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

    public void setAssinatura(final DFSignature assinatura) {
        this.assinatura = assinatura;
    }

    public DFSignature getAssinatura() {
        return this.assinatura;
    }
}