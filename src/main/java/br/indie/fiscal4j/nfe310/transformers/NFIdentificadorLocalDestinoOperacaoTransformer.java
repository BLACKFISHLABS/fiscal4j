package br.indie.fiscal4j.nfe310.transformers;

import br.indie.fiscal4j.nfe310.classes.nota.NFIdentificadorLocalDestinoOperacao;
import org.simpleframework.xml.transform.Transform;

public class NFIdentificadorLocalDestinoOperacaoTransformer implements Transform<NFIdentificadorLocalDestinoOperacao> {

    @Override
    public NFIdentificadorLocalDestinoOperacao read(final String codigoOperacao) {
        return NFIdentificadorLocalDestinoOperacao.valueOfCodigo(codigoOperacao);
    }

    @Override
    public String write(final NFIdentificadorLocalDestinoOperacao operacao) {
        return operacao.getCodigo();
    }
}