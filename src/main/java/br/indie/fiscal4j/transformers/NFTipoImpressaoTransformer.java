package br.indie.fiscal4j.transformers;

import br.indie.fiscal4j.classes.NFTipoImpressao;
import org.simpleframework.xml.transform.Transform;

class NFTipoImpressaoTransformer implements Transform<NFTipoImpressao> {

    @Override
    public NFTipoImpressao read(final String codigo) throws Exception {
        return NFTipoImpressao.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFTipoImpressao tipo) throws Exception {
        return tipo.getCodigo();
    }
}