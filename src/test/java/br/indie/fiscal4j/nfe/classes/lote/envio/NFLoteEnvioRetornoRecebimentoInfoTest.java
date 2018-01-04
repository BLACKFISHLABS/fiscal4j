package br.indie.fiscal4j.nfe.classes.lote.envio;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import org.junit.Assert;
import org.junit.Test;

public class NFLoteEnvioRetornoRecebimentoInfoTest {

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<DFLoteEnvioRetornoRecebimentoInfo><nRec>845e40545</nRec><tMed>430kfszodkgvre</tMed></DFLoteEnvioRetornoRecebimentoInfo>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFLoteEnvioRetornoRecebimentoInfo().toString());
    }
}