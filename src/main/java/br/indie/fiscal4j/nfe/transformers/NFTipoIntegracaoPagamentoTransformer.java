package br.indie.fiscal4j.nfe.transformers;

import br.indie.fiscal4j.nfe.classes.nota.NFTipoIntegracaoPagamento;
import org.simpleframework.xml.transform.Transform;

class NFTipoIntegracaoPagamentoTransformer implements Transform<NFTipoIntegracaoPagamento> {

    @Override
    public NFTipoIntegracaoPagamento read(final String codigo) throws Exception {
        return NFTipoIntegracaoPagamento.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFTipoIntegracaoPagamento tipo) throws Exception {
        return tipo.getCodigo();
    }
}