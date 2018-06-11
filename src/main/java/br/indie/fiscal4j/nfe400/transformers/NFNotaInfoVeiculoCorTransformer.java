package br.indie.fiscal4j.nfe400.transformers;

import br.indie.fiscal4j.nfe400.classes.NFNotaInfoVeiculoCor;
import org.simpleframework.xml.transform.Transform;

public class NFNotaInfoVeiculoCorTransformer implements Transform<NFNotaInfoVeiculoCor> {

    @Override
    public NFNotaInfoVeiculoCor read(final String codigoVeiculoCor) {
        return NFNotaInfoVeiculoCor.valueOfCodigo(codigoVeiculoCor);
    }

    @Override
    public String write(final NFNotaInfoVeiculoCor veiculoCor) {
        return veiculoCor.getCodigo();
    }
}