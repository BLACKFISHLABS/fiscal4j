package br.indie.fiscal4j.nfe400.transformers;

import br.indie.fiscal4j.nfe400.classes.nota.NFIndicadorIEDestinatario;
import org.simpleframework.xml.transform.Transform;

public class NFIndicadorIEDestinatarioTransformer implements Transform<NFIndicadorIEDestinatario> {

    @Override
    public NFIndicadorIEDestinatario read(final String codigo) throws Exception {
        return NFIndicadorIEDestinatario.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFIndicadorIEDestinatario destinatario) throws Exception {
        return destinatario.getCodigo();
    }
}