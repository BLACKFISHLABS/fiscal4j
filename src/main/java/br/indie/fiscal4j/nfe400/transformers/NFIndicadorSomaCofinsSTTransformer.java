package br.indie.fiscal4j.nfe400.transformers;

import br.indie.fiscal4j.nfe400.classes.nota.NFIndicadorSomaCofinsST;
import org.simpleframework.xml.transform.Transform;

public class NFIndicadorSomaCofinsSTTransformer implements Transform<NFIndicadorSomaCofinsST> {

    @Override
    public NFIndicadorSomaCofinsST read(final String codigo) {
        return NFIndicadorSomaCofinsST.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFIndicadorSomaCofinsST indicadorPresencaComprador) {
        return indicadorPresencaComprador.getCodigo();
    }
}