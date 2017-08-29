package br.indie.fiscal4j.classes.evento.cancelamento;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import br.indie.fiscal4j.classes.NFAmbiente;
import br.indie.fiscal4j.classes.NFUnidadeFederativa;
import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFInfoEventoCancelamentoTest {

    @Test
    public void deveObterAmbienteComoFoiSetado() {
        final NFInfoEventoCancelamento infoEventoCancelamento = new NFInfoEventoCancelamento();
        final NFAmbiente ambiente = NFAmbiente.PRODUCAO;
        infoEventoCancelamento.setAmbiente(ambiente);
        Assert.assertEquals(ambiente, infoEventoCancelamento.getAmbiente());
    }

    @Test
    public void deveObterInfoCancelamentoComoFoiSetado() {
        final NFInfoEventoCancelamento infoEventoCancelamento = new NFInfoEventoCancelamento();
        final NFInfoCancelamento infoCancelamento = FabricaDeObjetosFake.getNFInfoCancelamento();
        infoEventoCancelamento.setCancelamento(infoCancelamento);
        Assert.assertEquals(infoCancelamento, infoEventoCancelamento.getCancelamento());
    }

    @Test
    public void deveObterChaveComoFoiSetado() {
        final NFInfoEventoCancelamento infoEventoCancelamento = new NFInfoEventoCancelamento();
        final String chave = "81568004734874930428983724940883089298523837";
        infoEventoCancelamento.setChave(chave);
        Assert.assertEquals(chave, infoEventoCancelamento.getChave());
    }

    @Test
    public void deveObterCnpjComoFoiSetado() {
        final NFInfoEventoCancelamento infoEventoCancelamento = new NFInfoEventoCancelamento();
        final String cnpj = "12345678901234";
        infoEventoCancelamento.setCnpj(cnpj);
        Assert.assertEquals(cnpj, infoEventoCancelamento.getCnpj());
    }

    @Test
    public void deveObterDataHoraEventoComoFoiSetado() {
        final NFInfoEventoCancelamento infoEventoCancelamento = new NFInfoEventoCancelamento();
        final DateTime dataHoraEvento = new DateTime(2010, 10, 10, 10, 10, 10);
        infoEventoCancelamento.setDataHoraEvento(dataHoraEvento);
        Assert.assertEquals(dataHoraEvento, infoEventoCancelamento.getDataHoraEvento());
    }

    @Test
    public void deveObterIdComoFoiSetado() {
        final NFInfoEventoCancelamento infoEventoCancelamento = new NFInfoEventoCancelamento();
        final String id = "hluU2zKt4QK5bEktOiGfpZw64535p2A4Z5m5egLQbMpjnCH48c1aw6";
        infoEventoCancelamento.setId(id);
        Assert.assertEquals(id, infoEventoCancelamento.getId());
    }

    @Test
    public void deveObterNumeroSequencialEventoComoFoiSetado() {
        final NFInfoEventoCancelamento infoEventoCancelamento = new NFInfoEventoCancelamento();
        final int numeroSequencialEvento = 99;
        infoEventoCancelamento.setNumeroSequencialEvento(numeroSequencialEvento);
        Assert.assertEquals(numeroSequencialEvento, infoEventoCancelamento.getNumeroSequencialEvento());
    }

    @Test
    public void deveObterOrgaoComoFoiSetado() {
        final NFInfoEventoCancelamento infoEventoCancelamento = new NFInfoEventoCancelamento();
        final NFUnidadeFederativa unidadeFederativa = NFUnidadeFederativa.BA;
        infoEventoCancelamento.setOrgao(unidadeFederativa);
        Assert.assertEquals(unidadeFederativa, infoEventoCancelamento.getOrgao());
    }

    @Test
    public void deveObterCodigoEventoComoFoiSetado() {
        final NFInfoEventoCancelamento infoEventoCancelamento = new NFInfoEventoCancelamento();
        final String codigoEvento = "123546";
        infoEventoCancelamento.setCodigoEvento(codigoEvento);
        Assert.assertEquals(codigoEvento, infoEventoCancelamento.getCodigoEvento());
    }

    @Test
    public void deveObterVersaoEventoComoFoiSetado() {
        final NFInfoEventoCancelamento infoEventoCancelamento = new NFInfoEventoCancelamento();
        final BigDecimal versaoEvento = new BigDecimal("3.99");
        infoEventoCancelamento.setVersaoEvento(versaoEvento);
        Assert.assertEquals(versaoEvento.toString(), infoEventoCancelamento.getVersaoEvento());
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<NFInfoEventoCancelamento Id=\"hluU2zKt4QK5bEktOiGfpZw64535p2A4Z5m5egLQbMpjnCH48c1aw6\"><cOrgao>42</cOrgao><tpAmb>2</tpAmb><CNPJ>12345678901234</CNPJ><chNFe>81568004734874930428983724940883089298523837</chNFe><dhEvento>2014-01-01T10:10:10-02:00</dhEvento><tpEvento>123456</tpEvento><nSeqEvento>2</nSeqEvento><verEvento>2.49</verEvento><detEvento versao=\"3.10\"><descEvento>Cancelamento</descEvento><nProt>123456789012345</nProt><xJust>Justificativa qualquer coisa</xJust></detEvento></NFInfoEventoCancelamento>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFInfoEventoCancelamento().toString());
    }
}