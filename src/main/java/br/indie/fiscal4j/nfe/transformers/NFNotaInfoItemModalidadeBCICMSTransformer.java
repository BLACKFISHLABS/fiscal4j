package br.indie.fiscal4j.nfe.transformers;

import br.indie.fiscal4j.nfe.classes.NFNotaInfoItemModalidadeBCICMS;
import org.simpleframework.xml.transform.Transform;

class NFNotaInfoItemModalidadeBCICMSTransformer implements Transform<NFNotaInfoItemModalidadeBCICMS> {

    @Override
    public NFNotaInfoItemModalidadeBCICMS read(final String codigo) throws Exception {
        return NFNotaInfoItemModalidadeBCICMS.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFNotaInfoItemModalidadeBCICMS modalidade) throws Exception {
        return modalidade.getCodigo();
    }
}