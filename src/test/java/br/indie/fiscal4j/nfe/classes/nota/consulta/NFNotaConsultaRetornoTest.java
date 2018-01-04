package br.indie.fiscal4j.nfe.classes.nota.consulta;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import br.indie.fiscal4j.common.DFAmbiente;
import br.indie.fiscal4j.common.DFUnidadeFederativa;
import br.indie.fiscal4j.nfe.classes.NFProtocolo;
import br.indie.fiscal4j.nfe.classes.evento.cancelamento.NFRetornoCancelamento;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class NFNotaConsultaRetornoTest {

    @Test
    public void deveObterVersaoComoFoiSetado() {
        final DFNotaConsultaRetorno consultaRetorno = new DFNotaConsultaRetorno();
        final String versao = "4.00";
        consultaRetorno.setVersao(versao);
        Assert.assertEquals(versao, consultaRetorno.getVersao());
    }

    @Test
    public void deveObterAmbienteComoFoiSetado() {
        final DFNotaConsultaRetorno consultaRetorno = new DFNotaConsultaRetorno();
        final DFAmbiente ambiente = DFAmbiente.HOMOLOGACAO;
        consultaRetorno.setAmbiente(ambiente);
        Assert.assertEquals(ambiente, consultaRetorno.getAmbiente());
    }

    @Test
    public void deveObterChaveComoFoiSetado() {
        final DFNotaConsultaRetorno consultaRetorno = new DFNotaConsultaRetorno();
        final String chave = "70460574637515066066966657989989378421243260";
        consultaRetorno.setChave(chave);
        Assert.assertEquals(chave, consultaRetorno.getChave());
    }

    @Test
    public void deveObterDataHoraReciboComoFoiSetado() {
        final DFNotaConsultaRetorno consultaRetorno = new DFNotaConsultaRetorno();
        final LocalDateTime dataHoraRecibo = LocalDateTime.parse("2010-10-10 10:10:10", DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss"));
        consultaRetorno.setDataHoraRecibo(dataHoraRecibo);
        Assert.assertEquals(dataHoraRecibo, consultaRetorno.getDataHoraRecibo());
    }

    @Test
    public void deveObterMotivoComoFoiSetado() {
        final DFNotaConsultaRetorno consultaRetorno = new DFNotaConsultaRetorno();
        final String motivo = "Motivo simples";
        consultaRetorno.setMotivo(motivo);
        Assert.assertEquals(motivo, consultaRetorno.getMotivo());
    }

    @Test
    public void deveObterProtocoloComoFoiSetado() {
        final DFNotaConsultaRetorno consultaRetorno = new DFNotaConsultaRetorno();
        final NFProtocolo protocolo = FabricaDeObjetosFake.getNFProtocolo();
        consultaRetorno.setProtocolo(protocolo);
        Assert.assertEquals(protocolo, consultaRetorno.getProtocolo());
    }

    @Test
    public void deveObterStatusComoFoiSetado() {
        final DFNotaConsultaRetorno consultaRetorno = new DFNotaConsultaRetorno();
        final String status = "190";
        consultaRetorno.setStatus(status);
        Assert.assertEquals(status, consultaRetorno.getStatus());
    }

    @Test
    public void deveObterUfComoFoiSetado() {
        final DFNotaConsultaRetorno consultaRetorno = new DFNotaConsultaRetorno();
        final DFUnidadeFederativa unidadeFederativa = DFUnidadeFederativa.AL;
        consultaRetorno.setUf(unidadeFederativa);
        Assert.assertEquals(unidadeFederativa, consultaRetorno.getUf());
    }

    @Test
    public void deveObterVersaoAplicativoComoFoiSetado() {
        final DFNotaConsultaRetorno consultaRetorno = new DFNotaConsultaRetorno();
        final String versaoAplicacao = "v10.0";
        consultaRetorno.setVersaoAplicacao(versaoAplicacao);
        Assert.assertEquals(versaoAplicacao, consultaRetorno.getVersaoAplicacao());
    }

    @Test
    public void deveObterProtocoloCancelamentoComoFoiSetado() {
        final DFNotaConsultaRetorno consultaRetorno = new DFNotaConsultaRetorno();
        final NFRetornoCancelamento protocoloCancelamento = new NFRetornoCancelamento();
        consultaRetorno.setProtocoloCancelamento(protocoloCancelamento);
        Assert.assertEquals(protocoloCancelamento, consultaRetorno.getProtocoloCancelamento());
    }

    @Test
    public void deveObterProtocoloEventoComoFoiSetado() {
        final DFNotaConsultaRetorno consultaRetorno = new DFNotaConsultaRetorno();
        final List<DFProtocoloEvento> protocoloEvento = new ArrayList<>();
        consultaRetorno.setProtocoloEvento(protocoloEvento);
        Assert.assertEquals(protocoloEvento, consultaRetorno.getProtocoloEvento());
    }
}