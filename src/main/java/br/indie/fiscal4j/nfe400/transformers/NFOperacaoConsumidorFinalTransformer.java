package br.indie.fiscal4j.nfe400.transformers;

import br.indie.fiscal4j.nfe400.classes.nota.NFOperacaoConsumidorFinal;
import org.simpleframework.xml.transform.Transform;

public class NFOperacaoConsumidorFinalTransformer implements Transform<NFOperacaoConsumidorFinal> {

    @Override
    public NFOperacaoConsumidorFinal read(final String codigo) throws Exception {
        return NFOperacaoConsumidorFinal.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFOperacaoConsumidorFinal operacao) throws Exception {
        return operacao.getCodigo();
    }
}