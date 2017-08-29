package br.indie.fiscal4j.classes.nota.consulta;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import br.indie.fiscal4j.classes.NFAmbiente;
import br.indie.fiscal4j.classes.NFProtocolo;
import br.indie.fiscal4j.classes.NFUnidadeFederativa;
import br.indie.fiscal4j.classes.evento.cancelamento.NFRetornoCancelamento;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class NFNotaConsultaRetornoTest {

    @Test
    public void deveObterVersaoComoFoiSetado() {
        final NFNotaConsultaRetorno consultaRetorno = new NFNotaConsultaRetorno();
        final String versao = "3.10";
        consultaRetorno.setVersao(versao);
        Assert.assertEquals(versao, consultaRetorno.getVersao());
    }

    @Test
    public void deveObterAmbienteComoFoiSetado() {
        final NFNotaConsultaRetorno consultaRetorno = new NFNotaConsultaRetorno();
        final NFAmbiente ambiente = NFAmbiente.HOMOLOGACAO;
        consultaRetorno.setAmbiente(ambiente);
        Assert.assertEquals(ambiente, consultaRetorno.getAmbiente());
    }

    @Test
    public void deveObterChaveComoFoiSetado() {
        final NFNotaConsultaRetorno consultaRetorno = new NFNotaConsultaRetorno();
        final String chave = "70460574637515066066966657989989378421243260";
        consultaRetorno.setChave(chave);
        Assert.assertEquals(chave, consultaRetorno.getChave());
    }

    @Test
    public void deveObterDataHoraReciboComoFoiSetado() {
        final NFNotaConsultaRetorno consultaRetorno = new NFNotaConsultaRetorno();
        final LocalDateTime dataHoraRecibo = LocalDateTime.parse("2010-10-10 10:10:10", DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss"));
        consultaRetorno.setDataHoraRecibo(dataHoraRecibo);
        Assert.assertEquals(dataHoraRecibo, consultaRetorno.getDataHoraRecibo());
    }

    @Test
    public void deveObterMotivoComoFoiSetado() {
        final NFNotaConsultaRetorno consultaRetorno = new NFNotaConsultaRetorno();
        final String motivo = "Motivo simples";
        consultaRetorno.setMotivo(motivo);
        Assert.assertEquals(motivo, consultaRetorno.getMotivo());
    }

    @Test
    public void deveObterProtocoloComoFoiSetado() {
        final NFNotaConsultaRetorno consultaRetorno = new NFNotaConsultaRetorno();
        final NFProtocolo protocolo = FabricaDeObjetosFake.getNFProtocolo();
        consultaRetorno.setProtocolo(protocolo);
        Assert.assertEquals(protocolo, consultaRetorno.getProtocolo());
    }

    @Test
    public void deveObterStatusComoFoiSetado() {
        final NFNotaConsultaRetorno consultaRetorno = new NFNotaConsultaRetorno();
        final String status = "190";
        consultaRetorno.setStatus(status);
        Assert.assertEquals(status, consultaRetorno.getStatus());
    }

    @Test
    public void deveObterUfComoFoiSetado() {
        final NFNotaConsultaRetorno consultaRetorno = new NFNotaConsultaRetorno();
        final NFUnidadeFederativa unidadeFederativa = NFUnidadeFederativa.AL;
        consultaRetorno.setUf(unidadeFederativa);
        Assert.assertEquals(unidadeFederativa, consultaRetorno.getUf());
    }

    @Test
    public void deveObterVersaoAplicativoComoFoiSetado() {
        final NFNotaConsultaRetorno consultaRetorno = new NFNotaConsultaRetorno();
        final String versaoAplicacao = "v10.0";
        consultaRetorno.setVersaoAplicacao(versaoAplicacao);
        Assert.assertEquals(versaoAplicacao, consultaRetorno.getVersaoAplicacao());
    }

    @Test
    public void deveObterProtocoloCancelamentoComoFoiSetado() {
        final NFNotaConsultaRetorno consultaRetorno = new NFNotaConsultaRetorno();
        final NFRetornoCancelamento protocoloCancelamento = new NFRetornoCancelamento();
        consultaRetorno.setProtocoloCancelamento(protocoloCancelamento);
        Assert.assertEquals(protocoloCancelamento, consultaRetorno.getProtocoloCancelamento());
    }

    @Test
    public void deveObterProtocoloEventoComoFoiSetado() {
        final NFNotaConsultaRetorno consultaRetorno = new NFNotaConsultaRetorno();
        final List<NFProtocoloEvento> protocoloEvento = new ArrayList<>();
        consultaRetorno.setProtocoloEvento(protocoloEvento);
        Assert.assertEquals(protocoloEvento, consultaRetorno.getProtocoloEvento());
    }
}