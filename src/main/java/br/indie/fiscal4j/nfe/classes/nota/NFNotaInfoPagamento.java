package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.nfe.validadores.BigDecimalParser;
import br.indie.fiscal4j.nfe.validadores.ListValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.math.BigDecimal;
import java.util.List;

public class NFNotaInfoPagamento extends DFBase {

    @ElementList(entry = "detPag", inline = true, required = true)
    private List<NFNotaInfoDetalhamentoPagamento> detalhamentoPagamento;

    @Element(name = "vTroco", required = false)
    private String valorTroco;

    public void setValorTroco(BigDecimal valorTroco) {
        this.valorTroco = BigDecimalParser.tamanho15Com2CasasDecimais(valorTroco, "Valor do Troco");
    }

    public void setDetalhamentoPagamento(final List<NFNotaInfoDetalhamentoPagamento> detalhamentoPagamento) {
        ListValidador.tamanho100(detalhamentoPagamento, "Grupo de detalhamento da forma de pagamento");
        this.detalhamentoPagamento = detalhamentoPagamento;
    }

    public String getValorTroco() {
        return valorTroco;
    }

    public List<NFNotaInfoDetalhamentoPagamento> getDetalhamentoPagamento() {
        return detalhamentoPagamento;
    }
}