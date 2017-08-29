package br.indie.fiscal4j.transformers;

import br.indie.fiscal4j.classes.NFTipo;
import org.simpleframework.xml.transform.Transform;

class NFTipoTransformer implements Transform<NFTipo> {

    @Override
    public NFTipo read(final String codigo) throws Exception {
        return NFTipo.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFTipo tipo) throws Exception {
        return tipo.getCodigo();
    }
}