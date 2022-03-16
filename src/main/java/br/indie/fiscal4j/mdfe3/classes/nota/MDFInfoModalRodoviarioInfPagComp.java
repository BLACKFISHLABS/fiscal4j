package br.indie.fiscal4j.mdfe3.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.mdfe3.classes.def.MDFTipoInfPagComp;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;

/**
 * Created by Edivaldo Merlo Stens on 29/06/20.
 * <h1>Componentes do Pagamento do Frete.</h1>
 */
@Root(name = "Comp")
public class MDFInfoModalRodoviarioInfPagComp extends DFBase {

    private static final long serialVersionUID = 3657414548123273405L;

    /**
     * Tipo do Componente: 01 - Vale Pedágio; 02 - Impostos, taxas e
     * contribuições; 03 - Despesas (bancárias, meios de pagamento, outras); 99
     * – Outros.
     */
    @Element(name = "tpComp", required = true)
    private MDFTipoInfPagComp tpComp;

    /**
     * Valor do Componente
     */
    @Element(name = "vComp", required = true)
    private BigDecimal vComp;

    /**
     * Descrição do componente do tipo Outros
     */
    @Element(name = "xComp", required = false)
    private String xComp;

    public MDFTipoInfPagComp getTpComp() {
        return tpComp;
    }

    public void setTpComp(MDFTipoInfPagComp tpComp) {
        this.tpComp = tpComp;
    }

    public BigDecimal getVComp() {
        return vComp;
    }

    public void setVComp(BigDecimal vComp) {
        this.vComp = vComp;
    }

    public String getXComp() {
        return xComp;
    }

    public void setXComp(String xComp) {
        this.xComp = xComp;
    }

}
