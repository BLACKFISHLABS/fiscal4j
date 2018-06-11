package br.indie.fiscal4j.transformers;

import br.indie.fiscal4j.DFPais;
import org.simpleframework.xml.transform.Transform;

/**
 * Created by Eldevan Nery Junior on 07/05/18.
 *
 * Define os Classe de tranformação para a classe br.indie.fiscal4j.DFPais.java em XML e vice-versa.
 *
 */
public class DFPaisTransformer implements Transform<DFPais> {

    @Override
    public DFPais read(final String codigo) {
        return DFPais.valueOfCodigo(codigo);
    }

    @Override
    public String write(final DFPais unidadeFederativa) {
        return unidadeFederativa.getCodigo().toString();
    }
}