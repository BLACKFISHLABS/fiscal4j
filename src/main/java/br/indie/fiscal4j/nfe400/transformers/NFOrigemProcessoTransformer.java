package br.indie.fiscal4j.nfe400.transformers;

import br.indie.fiscal4j.nfe400.classes.NFOrigemProcesso;
import org.simpleframework.xml.transform.Transform;

public class NFOrigemProcessoTransformer implements Transform<NFOrigemProcesso> {

    @Override
    public NFOrigemProcesso read(final String codigo) {
        return NFOrigemProcesso.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFOrigemProcesso origemProcesso) {
        return origemProcesso.getCodigo();
    }
}