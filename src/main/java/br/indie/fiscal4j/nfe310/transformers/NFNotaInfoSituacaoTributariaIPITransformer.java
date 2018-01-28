package br.indie.fiscal4j.nfe310.transformers;

import br.indie.fiscal4j.nfe310.classes.NFNotaInfoSituacaoTributariaIPI;
import org.simpleframework.xml.transform.Transform;

public class NFNotaInfoSituacaoTributariaIPITransformer implements Transform<NFNotaInfoSituacaoTributariaIPI> {

    @Override
    public NFNotaInfoSituacaoTributariaIPI read(final String codigo) throws Exception {
        return NFNotaInfoSituacaoTributariaIPI.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFNotaInfoSituacaoTributariaIPI situacaoTributariaIPI) throws Exception {
        return situacaoTributariaIPI.getCodigo();
    }
}