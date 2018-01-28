package br.indie.fiscal4j.nfe310.transformers;

import br.indie.fiscal4j.nfe310.classes.NFProdutoCompoeValorNota;
import org.simpleframework.xml.transform.Transform;

public class NFProdutoCompoeValorNotaTransformer implements Transform<NFProdutoCompoeValorNota> {

    @Override
    public NFProdutoCompoeValorNota read(final String codigo) throws Exception {
        return NFProdutoCompoeValorNota.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFProdutoCompoeValorNota tipo) throws Exception {
        return tipo.getCodigo();
    }
}