package br.indie.fiscal4j.nfe.transformers;

import br.indie.fiscal4j.nfe.classes.NFNotaInfoItemProdutoVeiculoCondicaoChassi;
import org.simpleframework.xml.transform.Transform;

class NFNotaInfoItemProdutoVeiculoCondicaoChassiTransformer implements Transform<NFNotaInfoItemProdutoVeiculoCondicaoChassi> {

    @Override
    public NFNotaInfoItemProdutoVeiculoCondicaoChassi read(final String codigo) throws Exception {
        return NFNotaInfoItemProdutoVeiculoCondicaoChassi.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFNotaInfoItemProdutoVeiculoCondicaoChassi tipo) throws Exception {
        return tipo.getCodigo();
    }
}