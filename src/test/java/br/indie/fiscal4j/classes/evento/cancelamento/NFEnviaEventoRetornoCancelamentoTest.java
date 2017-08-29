package br.indie.fiscal4j.classes.evento.cancelamento;

import br.indie.fiscal4j.classes.evento.NFEnviaEventoRetorno;
import br.indie.fiscal4j.persister.NFPersister;
import org.junit.Assert;
import org.junit.Test;

public class NFEnviaEventoRetornoCancelamentoTest {

    @Test
    public void deveReceberIdLoteVazio() throws Exception {
        String xml = "<retEnvEvento versao=\"1.00\"><idLote/><tpAmb>1</tpAmb><verAplic>Serpro.Sped.NFe.Sefaz.Evento_1.0.1</verAplic><cOrgao>53</cOrgao><cStat>128</cStat><xMotivo>Lote de evento processado</xMotivo><retEvento versao=\"1.00\"><infEvento Id=\"ID422160008693146\"><tpAmb>1</tpAmb><verAplic>Serpro.Sped.NFe.Sefaz.Evento_1.0.1</verAplic><cOrgao>22</cOrgao><cStat>135</cStat><xMotivo>Evento registrado e vinculado a NF-e</xMotivo><chNFe>22160773815060000217550010000002881396616175</chNFe><tpEvento>110111</tpEvento><nSeqEvento>1</nSeqEvento><dhRegEvento>2016-07-05T09:25:19-03:00</dhRegEvento><nProt>422160008693146</nProt></infEvento></retEvento></retEnvEvento>";
        Assert.assertNotNull(new NFPersister().read(NFEnviaEventoRetorno.class, xml));
    }
}