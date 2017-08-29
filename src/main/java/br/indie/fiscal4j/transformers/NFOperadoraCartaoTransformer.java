package br.indie.fiscal4j.transformers;

import br.indie.fiscal4j.classes.nota.NFOperadoraCartao;
import org.simpleframework.xml.transform.Transform;

public class NFOperadoraCartaoTransformer implements Transform<NFOperadoraCartao> {

    @Override
    public NFOperadoraCartao read(final String codigo) throws Exception {
        return NFOperadoraCartao.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFOperadoraCartao operadoraCartao) throws Exception {
        return operadoraCartao.getCodigo();
    }
}