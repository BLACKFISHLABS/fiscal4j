package br.indie.fiscal4j.nfe310.transformers;

import br.indie.fiscal4j.nfe310.classes.NFNotaInfoSituacaoTributariaCOFINS;
import org.simpleframework.xml.transform.Transform;

public class NFNotaInfoSituacaoTributariaCOFINSTransformer implements Transform<NFNotaInfoSituacaoTributariaCOFINS> {

    @Override
    public NFNotaInfoSituacaoTributariaCOFINS read(final String codigo) {
        return NFNotaInfoSituacaoTributariaCOFINS.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFNotaInfoSituacaoTributariaCOFINS situacaoTributariaCOFINS) {
        return situacaoTributariaCOFINS.getCodigo();
    }
}