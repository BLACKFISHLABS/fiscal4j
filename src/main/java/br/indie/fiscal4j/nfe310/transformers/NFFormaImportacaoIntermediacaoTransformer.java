package br.indie.fiscal4j.nfe310.transformers;

import br.indie.fiscal4j.nfe310.classes.nota.NFFormaImportacaoIntermediacao;
import org.simpleframework.xml.transform.Transform;

public class NFFormaImportacaoIntermediacaoTransformer implements Transform<NFFormaImportacaoIntermediacao> {

    @Override
    public NFFormaImportacaoIntermediacao read(final String codigo) {
        return NFFormaImportacaoIntermediacao.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFFormaImportacaoIntermediacao intermediacao) {
        return intermediacao.getCodigo();
    }
}