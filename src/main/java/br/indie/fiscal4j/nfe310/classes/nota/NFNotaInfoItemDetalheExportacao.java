package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.BigIntegerValidador;
import org.simpleframework.xml.Element;

import java.math.BigInteger;

public class NFNotaInfoItemDetalheExportacao extends DFBase {
    private static final long serialVersionUID = 8265188954413940773L;

    @Element(name = "nDraw", required = false)
    private BigInteger atoConcessorioDrawback;

    @Element(name = "exportInd", required = false)
    private NFNotaInfoItemExportacaoIndireta exportacaoIndireta;

    public void setNumeroAtoConcessorioDrawback(final BigInteger numeroAtoConcessorioDrawback) {
        BigIntegerValidador.tamanho11(numeroAtoConcessorioDrawback, "Numero Ato Concessorio");
        this.atoConcessorioDrawback = numeroAtoConcessorioDrawback;
    }

    public BigInteger getAtoConcessorioDrawback() {
        return this.atoConcessorioDrawback;
    }

    public NFNotaInfoItemExportacaoIndireta getExportacaoIndireta() {
        return this.exportacaoIndireta;
    }

    public void setExportacaoIndireta(final NFNotaInfoItemExportacaoIndireta exportacaoIndireta) {
        this.exportacaoIndireta = exportacaoIndireta;
    }
}