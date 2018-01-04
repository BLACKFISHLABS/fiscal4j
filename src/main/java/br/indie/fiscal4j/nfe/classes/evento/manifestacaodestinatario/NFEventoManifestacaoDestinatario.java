package br.indie.fiscal4j.nfe.classes.evento.manifestacaodestinatario;

import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.nfe.validadores.BigDecimalParser;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NFEventoManifestacaoDestinatario extends DFBase {

    @Attribute(name = "versao", required = true)
    private String versao;

    @Element(name = "infEvento", required = true)
    private NFInfoEventoManifestacaoDestinatario infoEvento;

    @Element(name = "Signature", required = false)
    private String assinatura;

    public void setVersao(final BigDecimal versao) {
        this.versao = BigDecimalParser.tamanho5Com2CasasDecimais(versao, "Versao");
    }

    public NFInfoEventoManifestacaoDestinatario getInfoEvento() {
        return this.infoEvento;
    }

    public String getVersao() {
        return this.versao;
    }

    public void setInfoEvento(final NFInfoEventoManifestacaoDestinatario infoEvento) {
        this.infoEvento = infoEvento;
    }

    public void setAssinatura(final String assinatura) {
        this.assinatura = assinatura;
    }

    public String getAssinatura() {
        return this.assinatura;
    }
}