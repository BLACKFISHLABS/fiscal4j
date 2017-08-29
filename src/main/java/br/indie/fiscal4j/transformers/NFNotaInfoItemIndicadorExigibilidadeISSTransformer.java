package br.indie.fiscal4j.transformers;

import br.indie.fiscal4j.classes.nota.NFNotaInfoItemIndicadorExigibilidadeISS;
import org.simpleframework.xml.transform.Transform;

public class NFNotaInfoItemIndicadorExigibilidadeISSTransformer implements Transform<NFNotaInfoItemIndicadorExigibilidadeISS> {

    @Override
    public NFNotaInfoItemIndicadorExigibilidadeISS read(final String codigo) throws Exception {
        return NFNotaInfoItemIndicadorExigibilidadeISS.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFNotaInfoItemIndicadorExigibilidadeISS exigibilidadeISS) throws Exception {
        return exigibilidadeISS.getCodigo();
    }
}