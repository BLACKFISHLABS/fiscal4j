package br.indie.fiscal4j.cte200.transformers;

import br.indie.fiscal4j.cte200.classes.CTFormaPagamento;
import org.simpleframework.xml.transform.Transform;

public class CTFormaPagamentoTransformer implements Transform<CTFormaPagamento> {

    @Override
    public CTFormaPagamento read(final String codigo) throws Exception {
        return CTFormaPagamento.valueOfCodigo(codigo);
    }

    @Override
    public String write(final CTFormaPagamento tipo) throws Exception {
        return tipo.getCodigo();
    }
}