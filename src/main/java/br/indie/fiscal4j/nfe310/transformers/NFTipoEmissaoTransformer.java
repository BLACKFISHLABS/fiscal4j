package br.indie.fiscal4j.nfe310.transformers;

import br.indie.fiscal4j.nfe310.classes.NFTipoEmissao;
import org.simpleframework.xml.transform.Transform;

public class NFTipoEmissaoTransformer implements Transform<NFTipoEmissao> {

    @Override
    public NFTipoEmissao read(final String codigo) throws Exception {
        return NFTipoEmissao.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFTipoEmissao tipo) throws Exception {
        return tipo.getCodigo();
    }
}