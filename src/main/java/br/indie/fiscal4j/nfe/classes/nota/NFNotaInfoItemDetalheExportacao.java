package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.nfe.validadores.BigIntegerValidador;
import org.simpleframework.xml.Element;

import java.math.BigInteger;

public class NFNotaInfoItemDetalheExportacao extends DFBase {

    @Element(name = "nDraw", required = false)
    private BigInteger atoConcessorioDrawback;

    @Element(name = "exportInd", required = false)
    private NFNotaInfoItemExportacaoIndireta exportacaoIndireta;

    public void setNumeroAtoConcessorioDrawback(final BigInteger numeroAtoConcessorioDrawback) {
        BigIntegerValidador.tamanho11(numeroAtoConcessorioDrawback, "Numero Ato Concessorio");
        this.atoConcessorioDrawback = numeroAtoConcessorioDrawback;
    }

    public void setExportacaoIndireta(final NFNotaInfoItemExportacaoIndireta exportacaoIndireta) {
        this.exportacaoIndireta = exportacaoIndireta;
    }

    public BigInteger getAtoConcessorioDrawback() {
        return this.atoConcessorioDrawback;
    }

    public NFNotaInfoItemExportacaoIndireta getExportacaoIndireta() {
        return this.exportacaoIndireta;
    }
}