package br.indie.fiscal4j.classes.lote.consulta;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import br.indie.fiscal4j.classes.NFAmbiente;
import br.indie.fiscal4j.classes.NFUnidadeFederativa;
import org.joda.time.LocalDateTime;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;

public class NFLoteConsultaRetornoTest {

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final NFLoteConsultaRetorno retorno = new NFLoteConsultaRetorno();
        retorno.setAmbiente(NFAmbiente.HOMOLOGACAO);
        retorno.setMotivo("8CwtnC5gWwUncMBYAZl9p4fvVx8RkCH2EKx2mtUNVA5tLoJsjNWL5CJ6DXNUHTWKpPl6fMKKxA0aXBu6IfmJLIHlPxtF0oZkKrNsGyGpwKqWxvDZ9HQGqscmhtTrp5NbNzk9TOsCJaMU59tF8kOxu0EUZAMLF8bGJteg86T4hQ6ej5Zi0n1Tin0vFAtN1ue68NWrfQWM11VPpqvSXRlaa8qIw1Qal8tWCFGJA0wZpl7eV98bAYL18pt3e71yKcX");
        retorno.setNumeroRecibo("123456789012345");
        retorno.setProtocolos(Collections.singletonList(FabricaDeObjetosFake.getNFProtocolo()));
        retorno.setStatus("eeowo");
        retorno.setUf(NFUnidadeFederativa.SC);
        retorno.setVersao("3.10");
        retorno.setVersaoAplicacao("1.00");
        retorno.setCodigoMessage("dfksfod");
        retorno.setMensagem("sfjoijegiojariogjreiogjseriogjioesrjgoigresij");
        retorno.setDataHoraRecebimento(new LocalDateTime(2014, 10, 10, 10, 10, 10));

        final String xmlEsperado = "<retConsReciNFe versao=\"3.10\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><tpAmb>2</tpAmb><verAplic>1.00</verAplic><nRec>123456789012345</nRec><cStat>eeowo</cStat><dhRecbto>2014-10-10T10:10:10-03:00</dhRecbto><xMotivo>8CwtnC5gWwUncMBYAZl9p4fvVx8RkCH2EKx2mtUNVA5tLoJsjNWL5CJ6DXNUHTWKpPl6fMKKxA0aXBu6IfmJLIHlPxtF0oZkKrNsGyGpwKqWxvDZ9HQGqscmhtTrp5NbNzk9TOsCJaMU59tF8kOxu0EUZAMLF8bGJteg86T4hQ6ej5Zi0n1Tin0vFAtN1ue68NWrfQWM11VPpqvSXRlaa8qIw1Qal8tWCFGJA0wZpl7eV98bAYL18pt3e71yKcX</xMotivo><cUF>42</cUF><cMsg>dfksfod</cMsg><xMsg>sfjoijegiojariogjreiogjseriogjioesrjgoigresij</xMsg><protNFe versao=\"3.10\"><infProt Id=\"ID798456123\"><tpAmb>2</tpAmb><verAplic>3.10</verAplic><chNFe>EAIOjea</chNFe><dhRecbto>2014-06-10T09:00:00-03:00</dhRecbto><nProt>490309504</nProt><digVal>gfsfgsrg</digVal><cStat>OK</cStat><xMotivo>jsoaosk</xMotivo></infProt></protNFe></retConsReciNFe>";
        Assert.assertEquals(xmlEsperado, retorno.toString());
    }
}