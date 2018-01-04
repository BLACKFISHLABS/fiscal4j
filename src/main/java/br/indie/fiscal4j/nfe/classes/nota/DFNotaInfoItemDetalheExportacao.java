package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.nfe.validadores.BigIntegerValidador;
import org.simpleframework.xml.Element;

import java.math.BigInteger;

public class DFNotaInfoItemDetalheExportacao extends DFBase {

    @Element(name = "nDraw", required = false)
    private BigInteger atoConcessorioDrawback;

    @Element(name = "exportInd", required = false)
    private DFNotaInfoItemExportacaoIndireta exportacaoIndireta;

    public void setNumeroAtoConcessorioDrawback(final BigInteger numeroAtoConcessorioDrawback) {
        BigIntegerValidador.tamanho11(numeroAtoConcessorioDrawback, "Numero Ato Concessorio");
        this.atoConcessorioDrawback = numeroAtoConcessorioDrawback;
    }

    public void setExportacaoIndireta(final DFNotaInfoItemExportacaoIndireta exportacaoIndireta) {
        this.exportacaoIndireta = exportacaoIndireta;
    }

    public BigInteger getAtoConcessorioDrawback() {
        return this.atoConcessorioDrawback;
    }

    public DFNotaInfoItemExportacaoIndireta getExportacaoIndireta() {
        return this.exportacaoIndireta;
    }
}