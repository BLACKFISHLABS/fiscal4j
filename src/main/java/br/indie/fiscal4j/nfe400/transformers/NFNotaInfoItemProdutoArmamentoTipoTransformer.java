package br.indie.fiscal4j.nfe400.transformers;

import br.indie.fiscal4j.nfe400.classes.NFNotaInfoItemProdutoArmamentoTipo;
import org.simpleframework.xml.transform.Transform;

public class NFNotaInfoItemProdutoArmamentoTipoTransformer implements Transform<NFNotaInfoItemProdutoArmamentoTipo> {

    @Override
    public NFNotaInfoItemProdutoArmamentoTipo read(final String codigo) throws Exception {
        return NFNotaInfoItemProdutoArmamentoTipo.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFNotaInfoItemProdutoArmamentoTipo tipo) throws Exception {
        return tipo.getCodigo();
    }
}