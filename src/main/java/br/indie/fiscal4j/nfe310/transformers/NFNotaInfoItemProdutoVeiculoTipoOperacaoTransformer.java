package br.indie.fiscal4j.nfe310.transformers;

import br.indie.fiscal4j.nfe310.classes.NFNotaInfoItemProdutoVeiculoTipoOperacao;
import org.simpleframework.xml.transform.Transform;

public class NFNotaInfoItemProdutoVeiculoTipoOperacaoTransformer implements Transform<NFNotaInfoItemProdutoVeiculoTipoOperacao> {

    @Override
    public NFNotaInfoItemProdutoVeiculoTipoOperacao read(final String codigo) {
        return NFNotaInfoItemProdutoVeiculoTipoOperacao.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFNotaInfoItemProdutoVeiculoTipoOperacao tipo) {
        return tipo.getCodigo();
    }
}