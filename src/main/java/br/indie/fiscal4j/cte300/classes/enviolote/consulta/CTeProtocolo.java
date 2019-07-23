package br.indie.fiscal4j.cte300.classes.enviolote.consulta;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.cte300.classes.nota.assinatura.CTeSignature;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * @author Caio
 * @info Conjunto de CT-es processados, só existe nos casos em que o lote consultado se encontra processado
 */

@Root(name = "protCTe")
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTeProtocolo extends DFBase {
    private static final long serialVersionUID = 4634629801463718104L;

    @Element(name = "infProt", required = false)
    private CTeProtocoloInfo info;

    @Element(name = "Signature", required = false)
    private CTeSignature signature;

    @Attribute(name = "versao")
    private String versao;

    public CTeProtocolo() {
        this.info = null;
        this.signature = null;
        this.versao = null;
    }

    public CTeProtocoloInfo getInfo() {
        return this.info;
    }

    /**
     * Dados do protocolo de status
     */
    public void setInfo(final CTeProtocoloInfo info) {
        this.info = info;
    }

    public CTeSignature getSignature() {
        return this.signature;
    }

    /**
     *
     */
    public void setSignature(final CTeSignature signature) {
        this.signature = signature;
    }

    public String getVersao() {
        return this.versao;
    }

    /**
     *
     */
    public void setVersao(final String versao) {
        this.versao = versao;
    }
}
