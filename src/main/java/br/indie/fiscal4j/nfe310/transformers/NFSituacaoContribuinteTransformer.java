package br.indie.fiscal4j.nfe310.transformers;

import br.indie.fiscal4j.nfe310.classes.cadastro.NFSituacaoContribuinte;
import org.simpleframework.xml.transform.Transform;

public class NFSituacaoContribuinteTransformer implements Transform<NFSituacaoContribuinte> {

    @Override
    public NFSituacaoContribuinte read(final String codigoSituacaoContribuinte) throws Exception {
        return NFSituacaoContribuinte.valueOfCodigo(Integer.parseInt(codigoSituacaoContribuinte));
    }

    @Override
    public String write(final NFSituacaoContribuinte situacaoContribuinte) throws Exception {
        return String.valueOf(situacaoContribuinte.getCodigo());
    }
}