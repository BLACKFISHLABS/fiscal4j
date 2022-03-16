package br.indie.fiscal4j.nfe400.transformers;

import br.indie.fiscal4j.nfe400.classes.nota.NFTipoAtoConcessorio;
import org.simpleframework.xml.transform.Transform;

public class NFTipoAtoConcessorioTransformer implements Transform<NFTipoAtoConcessorio> {


    @Override
    public NFTipoAtoConcessorio read(String value) throws Exception {
        return NFTipoAtoConcessorio.valueOfCodigo(value);
    }

    @Override
    public String write(NFTipoAtoConcessorio value) throws Exception {
        return value.getCodigo();
    }
}
