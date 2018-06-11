package br.indie.fiscal4j.nfe310.transformers;

import br.indie.fiscal4j.nfe310.classes.NFNotaInfoItemProdutoVeiculoRestricao;
import org.simpleframework.xml.transform.Transform;

public class NFNotaInfoItemProdutoVeiculoRestricaoTransformer implements Transform<NFNotaInfoItemProdutoVeiculoRestricao> {

    @Override
    public NFNotaInfoItemProdutoVeiculoRestricao read(final String codigo) {
        return NFNotaInfoItemProdutoVeiculoRestricao.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFNotaInfoItemProdutoVeiculoRestricao tipo) {
        return tipo.getCodigo();
    }
}