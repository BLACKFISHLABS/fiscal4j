package br.indie.fiscal4j.nfe400.transformers;

import br.indie.fiscal4j.nfe400.classes.NFNotaInfoSituacaoTributariaCOFINS;
import org.simpleframework.xml.transform.Transform;

public class NFNotaInfoSituacaoTributariaCOFINSTransformer implements Transform<NFNotaInfoSituacaoTributariaCOFINS> {

    @Override
    public NFNotaInfoSituacaoTributariaCOFINS read(final String codigo) throws Exception {
        return NFNotaInfoSituacaoTributariaCOFINS.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFNotaInfoSituacaoTributariaCOFINS situacaoTributariaCOFINS) throws Exception {
        return situacaoTributariaCOFINS.getCodigo();
    }
}