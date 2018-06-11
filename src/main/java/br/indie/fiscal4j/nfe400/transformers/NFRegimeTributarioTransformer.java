package br.indie.fiscal4j.nfe400.transformers;

import br.indie.fiscal4j.nfe400.classes.NFRegimeTributario;
import org.simpleframework.xml.transform.Transform;

public class NFRegimeTributarioTransformer implements Transform<NFRegimeTributario> {

    @Override
    public NFRegimeTributario read(final String codigo) {
        return NFRegimeTributario.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFRegimeTributario tipo) {
        return tipo.getCodigo();
    }
}