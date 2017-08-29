package br.indie.fiscal4j.transformers;

import br.indie.fiscal4j.classes.lote.envio.NFLoteIndicadorProcessamento;
import org.simpleframework.xml.transform.Transform;

public class NFLoteIndicadorProcessamentoTransformer implements Transform<NFLoteIndicadorProcessamento> {

    @Override
    public NFLoteIndicadorProcessamento read(final String codigo) throws Exception {
        return NFLoteIndicadorProcessamento.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFLoteIndicadorProcessamento indicadorProcessamento) throws Exception {
        return indicadorProcessamento.getCodigo();
    }
}