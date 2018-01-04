package br.indie.fiscal4j.nfe.transformers;

import br.indie.fiscal4j.nfe.classes.NFNotaInfoItemProdutoVeiculoTipoOperacao;
import org.simpleframework.xml.transform.Transform;

class NFNotaInfoItemProdutoVeiculoTipoOperacaoTransformer implements Transform<NFNotaInfoItemProdutoVeiculoTipoOperacao> {

    @Override
    public NFNotaInfoItemProdutoVeiculoTipoOperacao read(final String codigo) throws Exception {
        return NFNotaInfoItemProdutoVeiculoTipoOperacao.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFNotaInfoItemProdutoVeiculoTipoOperacao tipo) throws Exception {
        return tipo.getCodigo();
    }
}