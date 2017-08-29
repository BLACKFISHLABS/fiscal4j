package br.indie.fiscal4j.transformers;

import br.indie.fiscal4j.classes.NFNotaInfoVeiculoCor;
import org.simpleframework.xml.transform.Transform;

public class NFNotaInfoVeiculoCorTransformer implements Transform<NFNotaInfoVeiculoCor> {

    @Override
    public NFNotaInfoVeiculoCor read(final String codigoVeiculoCor) throws Exception {
        return NFNotaInfoVeiculoCor.valueOfCodigo(codigoVeiculoCor);
    }

    @Override
    public String write(final NFNotaInfoVeiculoCor veiculoCor) throws Exception {
        return veiculoCor.getCodigo();
    }
}