package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.common.DFBase;
import org.simpleframework.xml.Element;

public class DFNotaInfoItemImpostoICMS extends DFBase {

    private boolean isSelecionado = false;

    @Element(name = "ICMS00", required = false)
    private DFNotaInfoItemImpostoICMS00 icms00;

    @Element(name = "ICMS10", required = false)
    private DFNotaInfoItemImpostoICMS10 icms10;

    @Element(name = "ICMS20", required = false)
    private DFNotaInfoItemImpostoICMS20 icms20;

    @Element(name = "ICMS30", required = false)
    private DFNotaInfoItemImpostoICMS30 icms30;

    @Element(name = "ICMS40", required = false)
    private DFNotaInfoItemImpostoICMS40 icms40;

    @Element(name = "ICMS51", required = false)
    private DFNotaInfoItemImpostoICMS51 icms51;

    @Element(name = "ICMS60", required = false)
    private DFNotaInfoItemImpostoICMS60 icms60;

    @Element(name = "ICMS70", required = false)
    private DFNotaInfoItemImpostoICMS70 icms70;

    @Element(name = "ICMS90", required = false)
    private DFNotaInfoItemImpostoICMS90 icms90;

    @Element(name = "ICMSPart", required = false)
    private DFNotaInfoItemImpostoICMSPartilhado icmsPartilhado;

    @Element(name = "ICMSST", required = false)
    private DFNotaInfoItemImpostoICMSST icmsst;

    @Element(name = "ICMSSN101", required = false)
    private DFNotaInfoItemImpostoICMSSN101 icmssn101;

    @Element(name = "ICMSSN102", required = false)
    private DFNotaInfoItemImpostoICMSSN102 icmssn102;

    @Element(name = "ICMSSN201", required = false)
    private DFNotaInfoItemImpostoICMSSN201 icmssn201;

    @Element(name = "ICMSSN202", required = false)
    private DFNotaInfoItemImpostoICMSSN202 icmssn202;

    @Element(name = "ICMSSN500", required = false)
    private DFNotaInfoItemImpostoICMSSN500 icmssn500;

    @Element(name = "ICMSSN900", required = false)
    private DFNotaInfoItemImpostoICMSSN900 icmssn900;

    public void setIcms00(final DFNotaInfoItemImpostoICMS00 icms00) {
        this.validaApenasUmSelecionado();
        this.icms00 = icms00;
    }

    public void setIcms10(final DFNotaInfoItemImpostoICMS10 icms10) {
        this.validaApenasUmSelecionado();
        this.icms10 = icms10;
    }

    public void setIcms20(final DFNotaInfoItemImpostoICMS20 icms20) {
        this.validaApenasUmSelecionado();
        this.icms20 = icms20;
    }

    public void setIcms30(final DFNotaInfoItemImpostoICMS30 icms30) {
        this.validaApenasUmSelecionado();
        this.icms30 = icms30;
    }

    public void setIcms40(final DFNotaInfoItemImpostoICMS40 icms40) {
        this.validaApenasUmSelecionado();
        this.icms40 = icms40;
    }

    public void setIcms51(final DFNotaInfoItemImpostoICMS51 icms51) {
        this.validaApenasUmSelecionado();
        this.icms51 = icms51;
    }

    public void setIcms60(final DFNotaInfoItemImpostoICMS60 icms60) {
        this.validaApenasUmSelecionado();
        this.icms60 = icms60;
    }

    public void setIcms70(final DFNotaInfoItemImpostoICMS70 icms70) {
        this.validaApenasUmSelecionado();
        this.icms70 = icms70;
    }

    public void setIcms90(final DFNotaInfoItemImpostoICMS90 icms90) {
        this.validaApenasUmSelecionado();
        this.icms90 = icms90;
    }

    public void setIcmsPartilhado(final DFNotaInfoItemImpostoICMSPartilhado icmsPartilhado) {
        this.validaApenasUmSelecionado();
        this.icmsPartilhado = icmsPartilhado;
    }

    public void setIcmsst(final DFNotaInfoItemImpostoICMSST icmsst) {
        this.validaApenasUmSelecionado();
        this.icmsst = icmsst;
    }

    public void setIcmssn101(final DFNotaInfoItemImpostoICMSSN101 icmssn101) {
        this.validaApenasUmSelecionado();
        this.icmssn101 = icmssn101;
    }

    public void setIcmssn102(final DFNotaInfoItemImpostoICMSSN102 icmssn102) {
        this.validaApenasUmSelecionado();
        this.icmssn102 = icmssn102;
    }

    public void setIcmssn201(final DFNotaInfoItemImpostoICMSSN201 icmssn201) {
        this.validaApenasUmSelecionado();
        this.icmssn201 = icmssn201;
    }

    public void setIcmssn202(final DFNotaInfoItemImpostoICMSSN202 icmssn202) {
        this.validaApenasUmSelecionado();
        this.icmssn202 = icmssn202;
    }

    public void setIcmssn500(final DFNotaInfoItemImpostoICMSSN500 icmssn500) {
        this.validaApenasUmSelecionado();
        this.icmssn500 = icmssn500;
    }

    public void setIcmssn900(final DFNotaInfoItemImpostoICMSSN900 icmssn900) {
        this.validaApenasUmSelecionado();
        this.icmssn900 = icmssn900;
    }

    private void validaApenasUmSelecionado() {
        if (this.isSelecionado) {
            throw new IllegalStateException("Ja possui ICMS selecionado");
        }
        this.isSelecionado = true;
    }

    public boolean isSelecionado() {
        return this.isSelecionado;
    }

    public DFNotaInfoItemImpostoICMS00 getIcms00() {
        return this.icms00;
    }

    public DFNotaInfoItemImpostoICMS10 getIcms10() {
        return this.icms10;
    }

    public DFNotaInfoItemImpostoICMS20 getIcms20() {
        return this.icms20;
    }

    public DFNotaInfoItemImpostoICMS30 getIcms30() {
        return this.icms30;
    }

    public DFNotaInfoItemImpostoICMS40 getIcms40() {
        return this.icms40;
    }

    public DFNotaInfoItemImpostoICMS51 getIcms51() {
        return this.icms51;
    }

    public DFNotaInfoItemImpostoICMS60 getIcms60() {
        return this.icms60;
    }

    public DFNotaInfoItemImpostoICMS70 getIcms70() {
        return this.icms70;
    }

    public DFNotaInfoItemImpostoICMS90 getIcms90() {
        return this.icms90;
    }

    public DFNotaInfoItemImpostoICMSPartilhado getIcmsPartilhado() {
        return this.icmsPartilhado;
    }

    public DFNotaInfoItemImpostoICMSST getIcmsst() {
        return this.icmsst;
    }

    public DFNotaInfoItemImpostoICMSSN101 getIcmssn101() {
        return this.icmssn101;
    }

    public DFNotaInfoItemImpostoICMSSN102 getIcmssn102() {
        return this.icmssn102;
    }

    public DFNotaInfoItemImpostoICMSSN201 getIcmssn201() {
        return this.icmssn201;
    }

    public DFNotaInfoItemImpostoICMSSN202 getIcmssn202() {
        return this.icmssn202;
    }

    public DFNotaInfoItemImpostoICMSSN500 getIcmssn500() {
        return this.icmssn500;
    }

    public DFNotaInfoItemImpostoICMSSN900 getIcmssn900() {
        return this.icmssn900;
    }
}