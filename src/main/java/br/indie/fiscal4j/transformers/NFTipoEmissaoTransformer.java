package br.indie.fiscal4j.transformers;

import br.indie.fiscal4j.classes.NFTipoEmissao;
import org.simpleframework.xml.transform.Transform;

class NFTipoEmissaoTransformer implements Transform<NFTipoEmissao> {

    @Override
    public NFTipoEmissao read(final String codigo) throws Exception {
        return NFTipoEmissao.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFTipoEmissao tipo) throws Exception {
        return tipo.getCodigo();
    }
}