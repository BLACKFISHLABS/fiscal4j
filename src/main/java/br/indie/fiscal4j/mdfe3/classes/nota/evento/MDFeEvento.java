package br.indie.fiscal4j.mdfe3.classes.nota.evento;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.nfe400.classes.nota.assinatura.NFSignature;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;

@Root(name = "eventoMDFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/mdfe")
public class MDFeEvento extends DFBase {

    @Attribute(name = "versao")
    private String versao;

    @Element(name = "infEvento")
    private MDFeInfoEvento infoEvento;

    @Element(name = "Signature", required = false)
    private NFSignature assinatura;

    public String getVersao() {
        return versao;
    }

    public void setVersao(final BigDecimal versao) {
        this.versao = BigDecimalParser.tamanho5Com2CasasDecimais(versao, "Versao");
    }

    public MDFeInfoEvento getInfoEvento() {
        return infoEvento;
    }

    public void setInfoEvento(MDFeInfoEvento infoEvento) {
        this.infoEvento = infoEvento;
    }

    public NFSignature getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(NFSignature assinatura) {
        this.assinatura = assinatura;
    }
}