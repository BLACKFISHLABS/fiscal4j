package br.indie.fiscal4j.classes.lote.envio;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import br.indie.fiscal4j.classes.NFAmbiente;
import br.indie.fiscal4j.classes.NFUnidadeFederativa;
import org.joda.time.LocalDateTime;
import org.junit.Assert;
import org.junit.Test;

public class NFLoteEnvioRetornoTest {

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final NFLoteEnvioRetorno retorno = new NFLoteEnvioRetorno();
        retorno.setAmbiente(NFAmbiente.HOMOLOGACAO);
        retorno.setDataRecebimento(new LocalDateTime(2014, 1, 1, 10, 10, 10));
        retorno.setInfoRecebimento(FabricaDeObjetosFake.getNFLoteEnvioRetornoRecebimentoInfo());
        retorno.setMotivo("kdosfksodf");
        retorno.setStatus("iejsasfisf");
        retorno.setUf(NFUnidadeFederativa.BA);
        retorno.setVersao("2.00");
        retorno.setVersaoAplicacao("2.00");

        final String xmlEsperado = "<retEnviNFe versao=\"2.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><tpAmb>2</tpAmb><verAplic>2.00</verAplic><cStat>iejsasfisf</cStat><xMotivo>kdosfksodf</xMotivo><cUF>29</cUF><dhRecbto>2014-01-01T10:10:10-02:00</dhRecbto><infRec><nRec>845e40545</nRec><tMed>430kfszodkgvre</tMed></infRec></retEnviNFe>";
        Assert.assertEquals(xmlEsperado, retorno.toString());
    }
}