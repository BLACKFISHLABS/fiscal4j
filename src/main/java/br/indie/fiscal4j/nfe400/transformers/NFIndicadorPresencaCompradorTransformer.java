package br.indie.fiscal4j.nfe400.transformers;

import br.indie.fiscal4j.nfe400.classes.nota.NFIndicadorPresencaComprador;
import org.simpleframework.xml.transform.Transform;

public class NFIndicadorPresencaCompradorTransformer implements Transform<NFIndicadorPresencaComprador> {

    @Override
    public NFIndicadorPresencaComprador read(final String codigo) throws Exception {
        return NFIndicadorPresencaComprador.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFIndicadorPresencaComprador indicadorPresencaComprador) throws Exception {
        return indicadorPresencaComprador.getCodigo();
    }
}