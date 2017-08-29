package br.indie.fiscal4j.transformers;

import br.indie.fiscal4j.classes.nota.NFNotaInfoRegimeEspecialTributacao;
import org.simpleframework.xml.transform.Transform;

public class NFNotaInfoRegimeEspecialTributacaoTransformer implements Transform<NFNotaInfoRegimeEspecialTributacao> {

    @Override
    public NFNotaInfoRegimeEspecialTributacao read(final String codigo) throws Exception {
        return NFNotaInfoRegimeEspecialTributacao.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFNotaInfoRegimeEspecialTributacao tributacao) throws Exception {
        return tributacao.getCodigo();
    }
}