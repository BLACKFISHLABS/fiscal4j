package br.indie.fiscal4j.nfe.transformers;

import br.indie.fiscal4j.nfe.classes.NFFormaPagamentoPrazo;
import org.simpleframework.xml.transform.Transform;

class NFFormaPagamentoTransformer implements Transform<NFFormaPagamentoPrazo> {

    @Override
    public NFFormaPagamentoPrazo read(final String codigo) throws Exception {
        return NFFormaPagamentoPrazo.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFFormaPagamentoPrazo formaPagamento) throws Exception {
        return formaPagamento.getCodigo();
    }
}
