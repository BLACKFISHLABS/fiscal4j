package br.indie.fiscal4j.nfe.transformers;

import br.indie.fiscal4j.nfe.classes.NFProcessoEmissor;
import org.simpleframework.xml.transform.Transform;

class NFProgramaEmissorTransformer implements Transform<NFProcessoEmissor> {

    @Override
    public NFProcessoEmissor read(final String codigo) throws Exception {
        return NFProcessoEmissor.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFProcessoEmissor tipo) throws Exception {
        return tipo.getCodigo();
    }
}