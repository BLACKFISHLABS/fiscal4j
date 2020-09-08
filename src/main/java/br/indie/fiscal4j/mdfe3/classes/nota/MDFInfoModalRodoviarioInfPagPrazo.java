package br.indie.fiscal4j.mdfe3.classes.nota;

import br.indie.fiscal4j.DFBase;
import org.apache.commons.lang3.StringUtils;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * <h1>Informações do pagamento a prazo. Obs: Informar somente se indPag for à
 * Prazo</h1>
 */
@Root(name = "infPrazo")
public class MDFInfoModalRodoviarioInfPagPrazo extends DFBase {

    private static final long serialVersionUID = 3657414548123273405L;

    /**
     *
     */
    @Element(name = "nParcela", required = false)
    private String nParcela;

    /**
     *
     */
    @Element(name = "dVenc", required = false)
    private LocalDate dVenc;

    /**
     *
     */
    @Element(name = "vParcela", required = true)
    private BigDecimal vParcela;

    public String getNParcela() {
        return nParcela;
    }

    public void setNParcela(String nParcela) {
        this.nParcela = nParcela != null ? StringUtils.leftPad(nParcela, 3, "0") : null;
    }

    public LocalDate getDVenc() {
        return dVenc;
    }

    public void setDVenc(LocalDate dVenc) {
        this.dVenc = dVenc;
    }

    public BigDecimal getVParcela() {
        return vParcela;
    }

    public void setVParcela(BigDecimal vParcela) {
        this.vParcela = vParcela;
    }

}

