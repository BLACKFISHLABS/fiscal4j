package br.indie.fiscal4j.transformers;

import br.indie.fiscal4j.classes.NFNotaInfoTipoVeiculo;
import org.simpleframework.xml.transform.Transform;

public class NFNotaInfoTipoVeiculoTransformer implements Transform<NFNotaInfoTipoVeiculo> {

    @Override
    public NFNotaInfoTipoVeiculo read(final String codigoTipoVeiculo) throws Exception {
        return NFNotaInfoTipoVeiculo.valueOfCodigo(codigoTipoVeiculo);
    }

    @Override
    public String write(final NFNotaInfoTipoVeiculo tipoVeiculo) throws Exception {
        return tipoVeiculo.getCodigo();
    }
}