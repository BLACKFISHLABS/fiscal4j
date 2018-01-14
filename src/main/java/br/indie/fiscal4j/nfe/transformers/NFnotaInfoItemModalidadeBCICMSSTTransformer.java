package br.indie.fiscal4j.nfe.transformers;

import br.indie.fiscal4j.nfe.classes.NFNotaInfoItemModalidadeBCICMSST;
import org.simpleframework.xml.transform.Transform;

public class NFnotaInfoItemModalidadeBCICMSSTTransformer implements Transform<NFNotaInfoItemModalidadeBCICMSST> {

    @Override
    public NFNotaInfoItemModalidadeBCICMSST read(final String codigo) throws Exception {
        return NFNotaInfoItemModalidadeBCICMSST.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFNotaInfoItemModalidadeBCICMSST modalidadeBCICMSST) throws Exception {
        return modalidadeBCICMSST.getCodigo();
    }
}