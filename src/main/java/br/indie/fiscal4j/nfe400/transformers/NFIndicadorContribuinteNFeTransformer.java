package br.indie.fiscal4j.nfe400.transformers;

import br.indie.fiscal4j.nfe400.classes.cadastro.NFIndicadorContribuinteNFe;
import org.simpleframework.xml.transform.Transform;

public class NFIndicadorContribuinteNFeTransformer implements Transform<NFIndicadorContribuinteNFe> {

    @Override
    public NFIndicadorContribuinteNFe read(final String codigoIndicador) throws Exception {
        return NFIndicadorContribuinteNFe.valueOfCodigo(Integer.parseInt(codigoIndicador));
    }

    @Override
    public String write(final NFIndicadorContribuinteNFe indicador) throws Exception {
        return String.valueOf(indicador.getCodigo());
    }
}
