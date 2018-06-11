package br.indie.fiscal4j.cte300.classes.evento;

import java.math.BigDecimal;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.nfe310.classes.nota.assinatura.NFSignature;
import br.indie.fiscal4j.validadores.BigDecimalParser;

public class CTeEventoRetorno extends DFBase {
    private static final long serialVersionUID = -8952520263707135185L;

    @Attribute(name = "versao", required = true)
    private String versao;

    @Element(name = "infEvento", required = true)
    private CTeInfoEventoRetorno infoEventoRetorno;

    @Element(name = "Signature", required = false)
    private NFSignature assinatura;

    public CTeInfoEventoRetorno getInfoEventoRetorno() {
        return this.infoEventoRetorno;
    }

    public void setInfoEventoRetorno(final CTeInfoEventoRetorno infoEventoRetorno) {
        this.infoEventoRetorno = infoEventoRetorno;
    }

    public String getVersao() {
        return this.versao;
    }

    public void setVersao(final BigDecimal versao) {
        this.versao = BigDecimalParser.tamanho4Com2CasasDecimais(versao, "Versao");
    }

    public NFSignature getAssinatura() {
        return this.assinatura;
    }

    public void setAssinatura(final NFSignature assinatura) {
        this.assinatura = assinatura;
    }
}