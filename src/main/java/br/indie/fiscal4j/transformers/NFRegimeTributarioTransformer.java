package br.indie.fiscal4j.transformers;

import br.indie.fiscal4j.classes.NFRegimeTributario;
import org.simpleframework.xml.transform.Transform;

class NFRegimeTributarioTransformer implements Transform<NFRegimeTributario> {

    @Override
    public NFRegimeTributario read(final String codigo) throws Exception {
        return NFRegimeTributario.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFRegimeTributario tipo) throws Exception {
        return tipo.getCodigo();
    }
}