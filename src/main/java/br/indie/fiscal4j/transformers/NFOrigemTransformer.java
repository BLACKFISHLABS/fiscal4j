package br.indie.fiscal4j.transformers;

import br.indie.fiscal4j.classes.NFOrigem;
import org.simpleframework.xml.transform.Transform;

class NFOrigemTransformer implements Transform<NFOrigem> {

    @Override
    public NFOrigem read(final String codigo) throws Exception {
        return NFOrigem.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFOrigem origem) throws Exception {
        return origem.getCodigo();
    }
}