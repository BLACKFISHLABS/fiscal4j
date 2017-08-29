package br.indie.fiscal4j.classes.evento.cancelamento;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import br.indie.fiscal4j.classes.NFAmbiente;
import br.indie.fiscal4j.classes.NFUnidadeFederativa;
import br.indie.fiscal4j.classes.evento.NFEventoRetorno;
import br.indie.fiscal4j.classes.evento.NFInfoEventoRetorno;
import org.joda.time.LocalDateTime;
import org.junit.Assert;
import org.junit.Test;

public class NFProtocoloEventoCancelamentoTest {

    @Test
    public void deveObterVersaoComoFoiSetado() {
        final NFProtocoloEventoCancelamento procEvento = new NFProtocoloEventoCancelamento();
        procEvento.setVersao("1.00");
        Assert.assertEquals("1.00", procEvento.getVersao());
    }

    @Test
    public void deveObterEventoComoFoiSetado() {
        final NFProtocoloEventoCancelamento procEvento = new NFProtocoloEventoCancelamento();
        procEvento.setEvento(FabricaDeObjetosFake.getNFEventoCancelamento());
        Assert.assertEquals(FabricaDeObjetosFake.getNFEventoCancelamento().getVersao(), procEvento.getEvento().getVersao());
    }

    @Test
    public void deveObterEventoRetornoComoFoiSetado() {
        final NFProtocoloEventoCancelamento procEvento = new NFProtocoloEventoCancelamento();
        final NFEventoRetorno eventoRetorno = new NFEventoRetorno();
        eventoRetorno.setVersao("1.0");
        procEvento.setEventoRetorno(eventoRetorno);
        Assert.assertEquals(eventoRetorno.getVersao(), procEvento.getInfoEventoRetorno().getVersao());
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final NFProtocoloEventoCancelamento procEvento = new NFProtocoloEventoCancelamento();
        procEvento.setVersao("1.00");

        final NFEventoRetorno eventoRetorno = new NFEventoRetorno();
        eventoRetorno.setVersao("1.0");

        final NFInfoEventoRetorno infoEventoRetorno = new NFInfoEventoRetorno();
        infoEventoRetorno.setAmbiente(NFAmbiente.PRODUCAO);
        infoEventoRetorno.setChave("hluU2zKt4QK5bEktOiGfpZw64535p2A4Z5m5egLQbMpjnCH48c1aw6");
        infoEventoRetorno.setCodigoStatus(1);
        infoEventoRetorno.setCpnj("99999999999999");
        infoEventoRetorno.setDataHoraRegistro(new LocalDateTime(2016, 11, 30, 2, 30, 0, 0));
        infoEventoRetorno.setDescricaoEvento("sdskjdkjdsdcklkjdsakndcsakjdckdljsdckjasldnclakjdsalkdcskdjacdsadcsacd");
        infoEventoRetorno.setId("123456789123456789123456789123456789123456789");
        infoEventoRetorno.setMotivo("asdsdsjdslkdjsaldjsldk");
        infoEventoRetorno.setNumeroProtocolo("999999999999999");
        infoEventoRetorno.setOrgao(NFUnidadeFederativa.GO);
        infoEventoRetorno.setTipoEvento("110111");
        infoEventoRetorno.setVersaoAplicativo("SVRS201601161016");

        eventoRetorno.setInfoEventoRetorno(infoEventoRetorno);

        procEvento.setEventoRetorno(eventoRetorno);
        procEvento.setEvento(FabricaDeObjetosFake.getNFEventoCancelamento());

        final String xmlEsperado = "<procEventoNFe versao=\"1.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><evento versao=\"3.10\"><infEvento Id=\"hluU2zKt4QK5bEktOiGfpZw64535p2A4Z5m5egLQbMpjnCH48c1aw6\"><cOrgao>42</cOrgao><tpAmb>2</tpAmb><CNPJ>12345678901234</CNPJ><chNFe>81568004734874930428983724940883089298523837</chNFe><dhEvento>2014-01-01T10:10:10-02:00</dhEvento><tpEvento>123456</tpEvento><nSeqEvento>2</nSeqEvento><verEvento>2.49</verEvento><detEvento versao=\"3.10\"><descEvento>Cancelamento</descEvento><nProt>123456789012345</nProt><xJust>Justificativa qualquer coisa</xJust></detEvento></infEvento></evento><retEvento versao=\"1.0\"><infEvento Id=\"123456789123456789123456789123456789123456789\"><tpAmb>1</tpAmb><verAplic>SVRS201601161016</verAplic><cOrgao>52</cOrgao><cStat>1</cStat><xMotivo>asdsdsjdslkdjsaldjsldk</xMotivo><chNFe>hluU2zKt4QK5bEktOiGfpZw64535p2A4Z5m5egLQbMpjnCH48c1aw6</chNFe><tpEvento>110111</tpEvento><xEvento>sdskjdkjdsdcklkjdsakndcsakjdckdljsdckjasldnclakjdsalkdcskdjacdsadcsacd</xEvento><CNPJDest>99999999999999</CNPJDest><dhRegEvento>2016-11-30T02:30:00-02:00</dhRegEvento><nProt>999999999999999</nProt></infEvento></retEvento></procEventoNFe>";
        Assert.assertEquals(xmlEsperado, procEvento.toString());
    }
}
