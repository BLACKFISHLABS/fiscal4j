package br.indie.fiscal4j.nfe310.transformers;

import br.indie.fiscal4j.nfe310.classes.NFNotaInfoEspecieVeiculo;
import org.simpleframework.xml.transform.Transform;

public class NFNotaInfoEspecieVeiculoTransformer implements Transform<NFNotaInfoEspecieVeiculo> {

    @Override
    public NFNotaInfoEspecieVeiculo read(final String codigoEspecieVeiculo) {
        return NFNotaInfoEspecieVeiculo.valueOfCodigo(codigoEspecieVeiculo);
    }

    @Override
    public String write(final NFNotaInfoEspecieVeiculo especieVeiculo) {
        return especieVeiculo.getCodigo();
    }
}