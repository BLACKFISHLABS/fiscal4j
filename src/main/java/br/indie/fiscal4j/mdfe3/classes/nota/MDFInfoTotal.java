package br.indie.fiscal4j.mdfe3.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.mdfe3.classes.def.MDFUnidadeMedidaPesoBrutoCarga;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

/**
 * <p>
 * Totalizadores da carga transportada e seus documentos fiscais.
 */
public class MDFInfoTotal extends DFBase {

    /**
     * Quantidade total de CT-e relacionados no Manifesto.
     */
    @Element(name = "qCTe", required = false)
    private String qtdeCTe;
    /**
     * Quantidade total de NF-e relacionadas no Manifesto
     */
    @Element(name = "qNFe", required = false)
    private String qtdeNFe;
    /**
     * Quantidade total de MDF-e relacionados no Manifesto Aquaviário
     */
    @Element(name = "qMDFe", required = false)
    private String qtdeMDFe;
    /**
     * Valor total da carga / mercadorias transportadas
     */
    @Element(name = "vCarga")
    private String valorTotalCarga;

    /**
     * Unidade de medida do Peso Bruto da Carga / Mercadorias transportadas.
     */
    @Element(name = "cUnid")
    private MDFUnidadeMedidaPesoBrutoCarga unidadeMedidaPesoBrutoCarga;

    /**
     * Peso Bruto Total da Carga / Mercadorias transportadas.
     */
    @Element(name = "qCarga")
    private String pesoCarga;

    public String getQtdeCTe() {
        return qtdeCTe;
    }

    public void setQtdeCTe(String qtdeCTe) {
        this.qtdeCTe = StringValidador.validador(qtdeCTe, "Total CT-e no MDF-e",
                6, false, true);
    }

    public String getQtdeNFe() {
        return qtdeNFe;
    }

    public void setQtdeNFe(String qtdeNFe) {
        this.qtdeNFe = StringValidador.validador(qtdeNFe, "Total NF-e no MDF-e",
                6, false, true);
    }

    public String getQtdeMDFe() {
        return qtdeMDFe;
    }

    public void setQtdeMDFe(String qtdeMDFe) {
        this.qtdeMDFe = StringValidador.validador(qtdeMDFe, "Total MDF-e no MDF-e relacionados no Manifesto Aquaviário",
                6, false, true);
    }

    public String getValorTotalCarga() {
        return valorTotalCarga;
    }

    public void setValorTotalCarga(BigDecimal valorTotalCarga) {
        this.valorTotalCarga = BigDecimalParser.tamanho13Com2CasasDecimais(valorTotalCarga,
                "Valor total da carga ");
    }

    public MDFUnidadeMedidaPesoBrutoCarga getUnidadeMedidaPesoBrutoCarga() {
        return unidadeMedidaPesoBrutoCarga;
    }

    public void setUnidadeMedidaPesoBrutoCarga(MDFUnidadeMedidaPesoBrutoCarga unidadeMedidaPesoBrutoCarga) {
        this.unidadeMedidaPesoBrutoCarga = unidadeMedidaPesoBrutoCarga;
    }

    public String getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(BigDecimal pesoCarga) {
        this.pesoCarga = BigDecimalParser.validaTamanho(pesoCarga,
                "Peso Bruto da Carga", 11, 4, true);
    }
}
