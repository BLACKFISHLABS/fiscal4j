package br.indie.fiscal4j.nfe.transformers;

import br.indie.fiscal4j.common.DFUnidadeFederativa;
import org.simpleframework.xml.transform.Transform;

class NFUnidadeFederativaTransformer implements Transform<DFUnidadeFederativa> {

    @Override
    public DFUnidadeFederativa read(final String codigo) throws Exception {
        return DFUnidadeFederativa.valueOfCodigo(codigo);
    }

    @Override
    public String write(final DFUnidadeFederativa unidadeFederativa) throws Exception {
        return unidadeFederativa.getCodigoIbge();
    }
}