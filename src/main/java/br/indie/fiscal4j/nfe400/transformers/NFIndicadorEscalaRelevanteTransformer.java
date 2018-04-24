package br.indie.fiscal4j.nfe400.transformers;

import br.indie.fiscal4j.nfe400.classes.nota.NFIndicadorEscalaRelevante;
import org.simpleframework.xml.transform.Transform;

public class NFIndicadorEscalaRelevanteTransformer implements Transform<NFIndicadorEscalaRelevante> {

    @Override
    public NFIndicadorEscalaRelevante read(final String codigo) throws Exception {
        return NFIndicadorEscalaRelevante.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFIndicadorEscalaRelevante nfIndicadorEscalaRelevante) throws Exception {
        return nfIndicadorEscalaRelevante.getCodigo();
    }
}