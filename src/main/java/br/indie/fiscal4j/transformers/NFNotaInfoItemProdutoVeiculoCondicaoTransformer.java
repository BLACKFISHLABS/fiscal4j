package br.indie.fiscal4j.transformers;

import br.indie.fiscal4j.classes.NFNotaInfoItemProdutoVeiculoCondicao;
import org.simpleframework.xml.transform.Transform;

class NFNotaInfoItemProdutoVeiculoCondicaoTransformer implements Transform<NFNotaInfoItemProdutoVeiculoCondicao> {

    @Override
    public NFNotaInfoItemProdutoVeiculoCondicao read(final String codigo) throws Exception {
        return NFNotaInfoItemProdutoVeiculoCondicao.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFNotaInfoItemProdutoVeiculoCondicao tipo) throws Exception {
        return tipo.getCodigo();
    }
}