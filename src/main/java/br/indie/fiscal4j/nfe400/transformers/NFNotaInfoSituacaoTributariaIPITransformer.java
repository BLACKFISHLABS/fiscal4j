package br.indie.fiscal4j.nfe400.transformers;

import br.indie.fiscal4j.nfe400.classes.NFNotaInfoSituacaoTributariaIPI;
import org.simpleframework.xml.transform.Transform;

public class NFNotaInfoSituacaoTributariaIPITransformer implements Transform<NFNotaInfoSituacaoTributariaIPI> {

    @Override
    public NFNotaInfoSituacaoTributariaIPI read(final String codigo) {
        return NFNotaInfoSituacaoTributariaIPI.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFNotaInfoSituacaoTributariaIPI situacaoTributariaIPI) {
        return situacaoTributariaIPI.getCodigo();
    }
}