package br.indie.fiscal4j.nfe310.transformers;

import br.indie.fiscal4j.nfe310.classes.NFNotaMotivoDesoneracaoICMS;
import org.simpleframework.xml.transform.Transform;

public class NFNotaMotivoDesoneracaoICMSTransformer implements Transform<NFNotaMotivoDesoneracaoICMS> {

    @Override
    public NFNotaMotivoDesoneracaoICMS read(final String codigo) throws Exception {
        return NFNotaMotivoDesoneracaoICMS.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFNotaMotivoDesoneracaoICMS desoneracaoICMS) throws Exception {
        return desoneracaoICMS.getCodigo();
    }
}