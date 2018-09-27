package br.indie.fiscal4j.nfe310.transformers;

import br.indie.fiscal4j.nfe310.classes.cadastro.NFIndicadorContribuinteNFe;
import org.simpleframework.xml.transform.Transform;

public class NFIndicadorContribuinteNFeTransformer implements Transform<NFIndicadorContribuinteNFe> {

    @Override
    public NFIndicadorContribuinteNFe read(final String codigoIndicador) {
        return NFIndicadorContribuinteNFe.valueOfCodigo(Integer.parseInt(codigoIndicador));
    }

    @Override
    public String write(final NFIndicadorContribuinteNFe indicador) {
        return String.valueOf(indicador.getCodigo());
    }
}
