package br.indie.fiscal4j.nfe310.transformers;

import br.indie.fiscal4j.nfe310.classes.NFNotaSituacaoOperacionalSimplesNacional;
import org.simpleframework.xml.transform.Transform;

public class NFNotaSituacaoOperacionalSimplesNacionalTransformer implements Transform<NFNotaSituacaoOperacionalSimplesNacional> {

    @Override
    public NFNotaSituacaoOperacionalSimplesNacional read(final String codigo) {
        return NFNotaSituacaoOperacionalSimplesNacional.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFNotaSituacaoOperacionalSimplesNacional situacaoOperacional) {
        return situacaoOperacional.getCodigo();
    }
}