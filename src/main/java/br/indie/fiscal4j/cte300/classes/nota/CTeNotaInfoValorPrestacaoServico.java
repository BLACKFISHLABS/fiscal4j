package br.indie.fiscal4j.cte300.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.BigDecimalValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Caio
 * @info Valores da Prestação de Serviço
 */

@Root(name = "vPrest")
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTeNotaInfoValorPrestacaoServico extends DFBase {
    private static final long serialVersionUID = -5913703822180633261L;

    @Element(name = "vTPrest")
    private String valorTotalPrestacaoServico;

    @Element(name = "vRec")
    private String valorReceber;

    @ElementList(name = "Comp", inline = true, required = false)
    private List<CTeNotaInfoValorPrestacaoServicoComponentesValorPrestacao> componentesValorPrestacao;

    public CTeNotaInfoValorPrestacaoServico() {
        this.valorTotalPrestacaoServico = null;
        this.valorReceber = null;
        this.componentesValorPrestacao = null;
    }

    public String getValorTotalPrestacaoServico() {
        return this.valorTotalPrestacaoServico;
    }

    /**
     * Valor Total da Prestação do Serviço<br>
     * Pode conter zeros quando o CT-e for de complemento de ICMS
     */
    public void setValorTotalPrestacaoServico(final BigDecimal valorTotalPrestacaoServico) {
        this.valorTotalPrestacaoServico = BigDecimalValidador.tamanho15Com2CasasDecimais(valorTotalPrestacaoServico, "Valor Total da Prestação do Serviço");
    }

    public String getValorReceber() {
        return this.valorReceber;
    }

    /**
     * Valor a Receber
     */
    public void setValorReceber(final BigDecimal valorReceber) {
        this.valorReceber = BigDecimalValidador.tamanho15Com2CasasDecimais(valorReceber, "Valor a Receber");
    }

    public List<CTeNotaInfoValorPrestacaoServicoComponentesValorPrestacao> getComponentesValorPrestacao() {
        return this.componentesValorPrestacao;
    }

    /**
     * Componentes do Valor da Prestação
     */
    public void setComponentesValorPrestacao(final List<CTeNotaInfoValorPrestacaoServicoComponentesValorPrestacao> componentesValorPrestacao) {
        this.componentesValorPrestacao = componentesValorPrestacao;
    }
}
