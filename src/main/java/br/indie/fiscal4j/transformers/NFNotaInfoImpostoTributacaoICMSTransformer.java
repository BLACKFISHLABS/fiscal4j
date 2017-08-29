package br.indie.fiscal4j.transformers;

import br.indie.fiscal4j.classes.NFNotaInfoImpostoTributacaoICMS;
import org.simpleframework.xml.transform.Transform;

public class NFNotaInfoImpostoTributacaoICMSTransformer implements Transform<NFNotaInfoImpostoTributacaoICMS> {

    @Override
    public NFNotaInfoImpostoTributacaoICMS read(final String icms) throws Exception {
        return NFNotaInfoImpostoTributacaoICMS.valueOfCodigo(icms);
    }

    @Override
    public String write(final NFNotaInfoImpostoTributacaoICMS icms) throws Exception {
        return icms.getCodigo();
    }
}