package br.indie.fiscal4j.transformers;

import br.indie.fiscal4j.DFUnidadeFederativa;
import org.simpleframework.xml.transform.Transform;

public class DFUnidadeFederativaTransformer implements Transform<DFUnidadeFederativa> {

    @Override
    public DFUnidadeFederativa read(final String codigo) throws Exception {
        return DFUnidadeFederativa.valueOfCodigo(codigo);
    }

    @Override
    public String write(final DFUnidadeFederativa unidadeFederativa) throws Exception {
        return unidadeFederativa.getCodigoIbge();
    }
}