package br.indie.fiscal4j.transformers;

import br.indie.fiscal4j.classes.NFUnidadeFederativa;
import org.simpleframework.xml.transform.Transform;

class NFUnidadeFederativaTransformer implements Transform<NFUnidadeFederativa> {

    @Override
    public NFUnidadeFederativa read(final String codigo) throws Exception {
        return NFUnidadeFederativa.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFUnidadeFederativa unidadeFederativa) throws Exception {
        return unidadeFederativa.getCodigoIbge();
    }
}