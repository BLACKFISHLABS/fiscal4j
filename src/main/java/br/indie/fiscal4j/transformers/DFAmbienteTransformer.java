package br.indie.fiscal4j.transformers;

import br.indie.fiscal4j.DFAmbiente;
import org.simpleframework.xml.transform.Transform;

public class DFAmbienteTransformer implements Transform<DFAmbiente> {

    @Override
    public DFAmbiente read(final String codigo) throws Exception {
        return DFAmbiente.valueOfCodigo(codigo);
    }

    @Override
    public String write(final DFAmbiente ambiente) throws Exception {
        return ambiente.getCodigo();
    }
}