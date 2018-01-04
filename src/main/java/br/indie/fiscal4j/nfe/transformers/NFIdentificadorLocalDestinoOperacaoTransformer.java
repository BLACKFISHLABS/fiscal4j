package br.indie.fiscal4j.nfe.transformers;

import br.indie.fiscal4j.nfe.classes.nota.NFIdentificadorLocalDestinoOperacao;
import org.simpleframework.xml.transform.Transform;

public class NFIdentificadorLocalDestinoOperacaoTransformer implements Transform<NFIdentificadorLocalDestinoOperacao> {

    @Override
    public NFIdentificadorLocalDestinoOperacao read(final String codigoOperacao) throws Exception {
        return NFIdentificadorLocalDestinoOperacao.valueOfCodigo(codigoOperacao);
    }

    @Override
    public String write(final NFIdentificadorLocalDestinoOperacao operacao) throws Exception {
        return operacao.getCodigo();
    }
}