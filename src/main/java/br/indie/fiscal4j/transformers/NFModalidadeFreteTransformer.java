package br.indie.fiscal4j.transformers;

import br.indie.fiscal4j.classes.NFModalidadeFrete;
import org.simpleframework.xml.transform.Transform;

public class NFModalidadeFreteTransformer implements Transform<NFModalidadeFrete> {

    @Override
    public NFModalidadeFrete read(final String codigo) throws Exception {
        return NFModalidadeFrete.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFModalidadeFrete modalidadeFrete) throws Exception {
        return modalidadeFrete.getCodigo();
    }
}