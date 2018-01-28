package br.indie.fiscal4j.nfe310.transformers;

import br.indie.fiscal4j.nfe310.classes.NFOrigemProcesso;
import org.simpleframework.xml.transform.Transform;

public class NFOrigemProcessoTransformer implements Transform<NFOrigemProcesso> {

    @Override
    public NFOrigemProcesso read(final String codigo) throws Exception {
        return NFOrigemProcesso.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFOrigemProcesso origemProcesso) throws Exception {
        return origemProcesso.getCodigo();
    }
}