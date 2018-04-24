package br.indie.fiscal4j.nfe400.classes.evento;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.nfe400.classes.nota.assinatura.NFSignature;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

public class NFEventoRetorno extends DFBase {
    private static final long serialVersionUID = -3477722335101130748L;

    @Attribute(name = "versao", required = true)
    private String versao;

    @Element(name = "infEvento", required = true)
    private NFInfoEventoRetorno infoEventoRetorno;

    @Element(name = "Signature", required = false)
    private NFSignature assinatura;

    public NFInfoEventoRetorno getInfoEventoRetorno() {
        return this.infoEventoRetorno;
    }

    public void setInfoEventoRetorno(final NFInfoEventoRetorno infoEventoRetorno) {
        this.infoEventoRetorno = infoEventoRetorno;
    }

    public String getVersao() {
        return this.versao;
    }

    public void setVersao(final String versao) {
        this.versao = versao;
    }

    public NFSignature getAssinatura() {
        return this.assinatura;
    }

    public void setAssinatura(final NFSignature assinatura) {
        this.assinatura = assinatura;
    }
}