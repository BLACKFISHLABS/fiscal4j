package br.indie.fiscal4j.nfe.transformers;

import br.indie.fiscal4j.common.DFModelo;
import org.simpleframework.xml.transform.Transform;

class NFModeloTransformer implements Transform<DFModelo> {

    @Override
    public DFModelo read(final String codigo) throws Exception {
        return DFModelo.valueOfCodigo(codigo);
    }

    @Override
    public String write(final DFModelo tipo) throws Exception {
        return tipo.getCodigo();
    }
}