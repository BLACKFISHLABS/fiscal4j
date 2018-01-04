package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.nfe.validadores.ListValidador;
import br.indie.fiscal4j.nfe.validadores.StringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

public class DFNotaInfoInformacoesAdicionais extends DFBase {
    @Element(name = "infAdFisco", required = false)
    private String informacoesAdicionaisInteresseFisco;

    @Element(name = "infCpl", required = false)
    private String informacoesComplementaresInteresseContribuinte;

    @ElementList(entry = "obsCont", inline = true, required = false)
    private List<DFNotaInfoObservacao> observacoesContribuinte;

    @ElementList(entry = "obsFisco", inline = true, required = false)
    private List<DFNotaInfoObservacao> observacoesFisco;

    @ElementList(entry = "procRef", inline = true, required = false)
    private List<DFNotaInfoProcessoReferenciado> processosRefenciado;

    public void setInformacoesAdicionaisInteresseFisco(final String informacoesAdicionaisInteresseFisco) {
        StringValidador.tamanho2000(informacoesAdicionaisInteresseFisco, "Informacoes Adicionais Interesse Fisco");
        this.informacoesAdicionaisInteresseFisco = informacoesAdicionaisInteresseFisco;
    }

    public void setInformacoesComplementaresInteresseContribuinte(final String informacoesComplementaresInteresseContribuinte) {
        StringValidador.tamanho5000(informacoesComplementaresInteresseContribuinte, "Informacoes Adicionais Interesse Contribuinte");
        this.informacoesComplementaresInteresseContribuinte = informacoesComplementaresInteresseContribuinte;
    }

    public void setObservacoesContribuinte(final List<DFNotaInfoObservacao> observacoesContribuinte) {
        ListValidador.tamanho10(observacoesContribuinte, "Observacoes Contribuinte");
        this.observacoesContribuinte = observacoesContribuinte;
    }

    public void setObservacoesFisco(final List<DFNotaInfoObservacao> observacoesFisco) {
        ListValidador.tamanho10(observacoesFisco, "Observacoes Fisco");
        this.observacoesFisco = observacoesFisco;
    }

    public void setProcessosRefenciado(final List<DFNotaInfoProcessoReferenciado> processosRefenciado) {
        ListValidador.tamanho100(processosRefenciado, "Processos Referenciados");
        this.processosRefenciado = processosRefenciado;
    }

    public String getInformacoesAdicionaisInteresseFisco() {
        return this.informacoesAdicionaisInteresseFisco;
    }

    public String getInformacoesComplementaresInteresseContribuinte() {
        return this.informacoesComplementaresInteresseContribuinte;
    }

    public List<DFNotaInfoObservacao> getObservacoesContribuinte() {
        return this.observacoesContribuinte;
    }

    public List<DFNotaInfoObservacao> getObservacoesFisco() {
        return this.observacoesFisco;
    }

    public List<DFNotaInfoProcessoReferenciado> getProcessosRefenciado() {
        return this.processosRefenciado;
    }
}