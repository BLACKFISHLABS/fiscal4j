package br.indie.fiscal4j.nfe400.transformers;

import br.indie.fiscal4j.nfe400.classes.nota.NFIndicadorSomaPISST;
import org.simpleframework.xml.transform.Transform;

public class NFIndicadorSomaPISSTTransformer implements Transform<NFIndicadorSomaPISST> {

    @Override
    public NFIndicadorSomaPISST read(final String codigo) {
        return NFIndicadorSomaPISST.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFIndicadorSomaPISST indicadorPresencaComprador) {
        return indicadorPresencaComprador.getCodigo();
    }
}