package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.nfe.validadores.BigDecimalParser;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class DFNotaInfoItemImposto extends DFBase {

    @Element(name = "vTotTrib", required = false)
    private String valorTotalTributos;

    @Element(name = "ICMS", required = false)
    private DFNotaInfoItemImpostoICMS icms;

    @Element(name = "IPI", required = false)
    private DFNotaInfoItemImpostoIPI ipi;

    @Element(name = "II", required = false)
    private DFNotaInfoItemImpostoImportacao impostoImportacao;

    @Element(name = "ISSQN", required = false)
    private DFNotaInfoItemImpostoISSQN issqn;

    @Element(name = "PIS", required = false)
    private DFNotaInfoItemImpostoPIS pis;

    @Element(name = "PISST", required = false)
    private DFNotaInfoItemImpostoPISST pisst;

    @Element(name = "COFINS", required = false)
    private DFNotaInfoItemImpostoCOFINS cofins;

    @Element(name = "COFINSST", required = false)
    private DFNotaInfoItemImpostoCOFINSST cofinsst;

    @Element(name = "ICMSUFDest", required = false)
    private DFNotaInfoItemImpostoICMSUFDestino icmsUfDestino;

    public void setIcms(final DFNotaInfoItemImpostoICMS icms) {
        if (this.issqn != null) {
            throw new IllegalStateException("ICMS, IPI e II sao mutuamente exclusivo com ISSQN");
        }
        this.icms = icms;
    }

    public void setIpi(final DFNotaInfoItemImpostoIPI ipi) {
        if (this.issqn != null) {
            throw new IllegalStateException("ICMS, IPI e II sao mutuamente exclusivo com ISSQN");
        }
        this.ipi = ipi;
    }

    public void setImpostoImportacao(final DFNotaInfoItemImpostoImportacao impostoImportacao) {
        if (this.issqn != null) {
            throw new IllegalStateException("ICMS, IPI e II sao mutuamente exclusivo com ISSQN");
        }
        this.impostoImportacao = impostoImportacao;
    }

    public void setIssqn(final DFNotaInfoItemImpostoISSQN issqn) {
        if (this.icms != null || this.ipi != null || this.impostoImportacao != null) {
            throw new IllegalStateException("ICMS, IPI e II sao mutuamente exclusivo com ISSQN");
        }
        this.issqn = issqn;
    }

    public void setPis(final DFNotaInfoItemImpostoPIS pis) {
        this.pis = pis;
    }

    public void setPisst(final DFNotaInfoItemImpostoPISST pisst) {
        this.pisst = pisst;
    }

    public void setCofins(final DFNotaInfoItemImpostoCOFINS cofins) {
        this.cofins = cofins;
    }

    public void setCofinsst(final DFNotaInfoItemImpostoCOFINSST cofinsst) {
        this.cofinsst = cofinsst;
    }

    public void setValorTotalTributos(final BigDecimal valorTotalTributos) {
        this.valorTotalTributos = BigDecimalParser.tamanho15Com2CasasDecimais(valorTotalTributos, "Valor Total Tributos");
    }

    public String getValorTotalTributos() {
        return this.valorTotalTributos;
    }

    public DFNotaInfoItemImpostoICMS getIcms() {
        return this.icms;
    }

    public DFNotaInfoItemImpostoIPI getIpi() {
        return this.ipi;
    }

    public DFNotaInfoItemImpostoImportacao getImpostoImportacao() {
        return this.impostoImportacao;
    }

    public DFNotaInfoItemImpostoISSQN getIssqn() {
        return this.issqn;
    }

    public DFNotaInfoItemImpostoPIS getPis() {
        return this.pis;
    }

    public DFNotaInfoItemImpostoPISST getPisst() {
        return this.pisst;
    }

    public DFNotaInfoItemImpostoCOFINS getCofins() {
        return this.cofins;
    }

    public DFNotaInfoItemImpostoCOFINSST getCofinsst() {
        return this.cofinsst;
    }

    public DFNotaInfoItemImpostoICMSUFDestino getIcmsUfDestino() {
        return icmsUfDestino;
    }

    public void setIcmsUfDestino(DFNotaInfoItemImpostoICMSUFDestino icmsUfDestino) {
        this.icmsUfDestino = icmsUfDestino;
    }
}