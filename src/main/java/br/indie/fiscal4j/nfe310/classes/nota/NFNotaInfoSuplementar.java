package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "infNFeSupl")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class NFNotaInfoSuplementar extends DFBase {
    private static final long serialVersionUID = -7212144193264841151L;

    @Element(data = true, name = "qrCode", required = true)
    private String qrCode;

    public String getQrCode() {
        return this.qrCode;
    }

    public void setQrCode(final String qrCode) {
        StringValidador.tamanho100a600(qrCode, "QR Code");
        this.qrCode = qrCode;
    }
}