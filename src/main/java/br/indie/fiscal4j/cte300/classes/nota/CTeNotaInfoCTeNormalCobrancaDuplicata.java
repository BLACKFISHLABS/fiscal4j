package br.indie.fiscal4j.cte300.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import br.indie.fiscal4j.validadores.StringValidador;
import org.joda.time.LocalDate;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;

/**
 * @author Caio
 * @info Dados das duplicatas
 */

@Root(name = "dup")
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTeNotaInfoCTeNormalCobrancaDuplicata extends DFBase {
    private static final long serialVersionUID = -1972813975820125568L;

    @Element(name = "nDup", required = false)
    private String numero;

    @Element(name = "dVenc", required = false)
    private LocalDate dataVencimento;

    @Element(name = "vDup", required = false)
    private String valor;

    public CTeNotaInfoCTeNormalCobrancaDuplicata() {
        this.numero = null;
        this.dataVencimento = null;
        this.valor = null;
    }

    public String getNumero() {
        return this.numero;
    }

    /**
     * Número da duplicata
     */
    public void setNumero(final String numero) {
        StringValidador.tamanho60(numero, "Número da duplicata");
        this.numero = numero;
    }

    public LocalDate getDataVencimento() {
        return this.dataVencimento;
    }

    /**
     * Data de vencimento da duplicata (AAAA-MM-DD)
     */
    public void setDataVencimento(final LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getValor() {
        return this.valor;
    }

    /**
     * Valor da duplicata
     */
    public void setValor(final BigDecimal valor) {
        this.valor = BigDecimalParser.tamanho15Com2CasasDecimais(valor, "Valor da duplicata");
    }
}
