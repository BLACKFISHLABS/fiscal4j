package br.indie.fiscal4j.nfe400.transformers;

import br.indie.fiscal4j.nfe400.classes.lote.envio.NFLoteIndicadorProcessamento;
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