package br.indie.fiscal4j.transformers;

import br.indie.fiscal4j.classes.NFAmbiente;
import org.simpleframework.xml.transform.Transform;

class NFAmbienteTransformer implements Transform<NFAmbiente> {

    @Override
    public NFAmbiente read(final String codigo) throws Exception {
        return NFAmbiente.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFAmbiente ambiente) throws Exception {
        return ambiente.getCodigo();
    }
}