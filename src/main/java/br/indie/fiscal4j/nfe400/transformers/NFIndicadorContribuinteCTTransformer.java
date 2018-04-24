package br.indie.fiscal4j.nfe400.transformers;

import br.indie.fiscal4j.nfe400.classes.cadastro.NFIndicadorContribuinteCTe;
import org.simpleframework.xml.transform.Transform;

public class NFIndicadorContribuinteCTTransformer implements Transform<NFIndicadorContribuinteCTe> {

    @Override
    public NFIndicadorContribuinteCTe read(final String codigo) throws Exception {
        return NFIndicadorContribuinteCTe.valueOfCodigo(Integer.parseInt(codigo));
    }

    @Override
    public String write(final NFIndicadorContribuinteCTe indicador) throws Exception {
        return String.valueOf(indicador.getCodigo());
    }
}