package br.indie.fiscal4j.nfe400.transformers;

import br.indie.fiscal4j.nfe400.classes.nota.NFIndicadorIntermediador;
import org.simpleframework.xml.transform.Transform;

public class NFIndicadorIntermediadorTransformer implements Transform<NFIndicadorIntermediador> {

    @Override
    public NFIndicadorIntermediador read(final String codigo) {
        return NFIndicadorIntermediador.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFIndicadorIntermediador indicadorPresencaComprador) {
        return indicadorPresencaComprador.getCodigo();
    }
}