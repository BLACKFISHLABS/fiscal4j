package br.indie.fiscal4j.nfe310.transformers;

import br.indie.fiscal4j.nfe310.classes.NFNotaInfoCombustivelTipo;
import org.simpleframework.xml.transform.Transform;

public class NFNotaInfoCombustivelTipoTransformer implements Transform<NFNotaInfoCombustivelTipo> {

    @Override
    public NFNotaInfoCombustivelTipo read(final String codigoCombustivelTipo) {
        return NFNotaInfoCombustivelTipo.valueOfCodigo(codigoCombustivelTipo);
    }

    @Override
    public String write(final NFNotaInfoCombustivelTipo combustivelTipo) {
        return combustivelTipo.getCodigo();
    }
}