package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.nfe.validadores.StringValidador;
import org.simpleframework.xml.Element;

public class DFInfoCupomFiscalReferenciado extends DFBase {
    @Element(name = "mod", required = true)
    private String modeloDocumentoFiscal;

    @Element(name = "nECF", required = true)
    private String numeroOrdemSequencialECF;

    @Element(name = "nCOO", required = true)
    private String numeroContadorOrdemOperacao;

    public void setModeloDocumentoFiscal(final String modeloDocumentoFiscal) {
        StringValidador.exatamente2(modeloDocumentoFiscal, "Modelo Documento Fiscal");
        this.modeloDocumentoFiscal = modeloDocumentoFiscal;
    }

    public void setNumeroOrdemSequencialECF(final String numeroOrdemSequencialECF) {
        StringValidador.exatamente3(numeroOrdemSequencialECF, "Numero Ordem Sequencial ECF");
        this.numeroOrdemSequencialECF = numeroOrdemSequencialECF;
    }

    public void setNumeroContadorOrdemOperacao(final String numeroContadorOrdemOperacao) {
        StringValidador.exatamente6(numeroContadorOrdemOperacao, "Numero Contador Ordem Operacao");
        this.numeroContadorOrdemOperacao = numeroContadorOrdemOperacao;
    }

    public String getModeloDocumentoFiscal() {
        return this.modeloDocumentoFiscal;
    }

    public String getNumeroContadorOrdemOperacao() {
        return this.numeroContadorOrdemOperacao;
    }

    public String getNumeroOrdemSequencialECF() {
        return this.numeroOrdemSequencialECF;
    }
}