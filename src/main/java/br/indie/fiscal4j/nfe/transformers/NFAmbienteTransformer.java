package br.indie.fiscal4j.nfe.transformers;

import br.indie.fiscal4j.common.DFAmbiente;
import org.simpleframework.xml.transform.Transform;

class NFAmbienteTransformer implements Transform<DFAmbiente> {

    @Override
    public DFAmbiente read(final String codigo) throws Exception {
        return DFAmbiente.valueOfCodigo(codigo);
    }

    @Override
    public String write(final DFAmbiente ambiente) throws Exception {
        return ambiente.getCodigo();
    }
}