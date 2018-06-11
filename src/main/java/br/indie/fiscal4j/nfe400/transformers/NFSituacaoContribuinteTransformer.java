package br.indie.fiscal4j.nfe400.transformers;

import br.indie.fiscal4j.nfe400.classes.cadastro.NFSituacaoContribuinte;
import org.simpleframework.xml.transform.Transform;

public class NFSituacaoContribuinteTransformer implements Transform<NFSituacaoContribuinte> {

    @Override
    public NFSituacaoContribuinte read(final String codigoSituacaoContribuinte) {
        return NFSituacaoContribuinte.valueOfCodigo(Integer.parseInt(codigoSituacaoContribuinte));
    }

    @Override
    public String write(final NFSituacaoContribuinte situacaoContribuinte) {
        return String.valueOf(situacaoContribuinte.getCodigo());
    }
}