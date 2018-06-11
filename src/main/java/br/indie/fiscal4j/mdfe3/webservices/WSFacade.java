package br.indie.fiscal4j.mdfe3.webservices;

import br.indie.fiscal4j.DFSocketFactory;
import br.indie.fiscal4j.DFUnidadeFederativa;
import br.indie.fiscal4j.mdfe3.MDFeConfig;
import br.indie.fiscal4j.mdfe3.classes.consultaRecibo.MDFeConsultaReciboRetorno;
import br.indie.fiscal4j.mdfe3.classes.consultanaoencerrados.MDFeConsultaNaoEncerradosRetorno;
import br.indie.fiscal4j.mdfe3.classes.consultastatusservico.MDFeConsStatServRet;
import br.indie.fiscal4j.mdfe3.classes.lote.envio.MDFEnvioLote;
import br.indie.fiscal4j.mdfe3.classes.lote.envio.MDFEnvioLoteRetornoDados;
import br.indie.fiscal4j.mdfe3.classes.nota.consulta.MDFeNotaConsultaRetorno;
import br.indie.fiscal4j.mdfe3.classes.nota.evento.MDFeRetorno;
import org.apache.commons.httpclient.protocol.Protocol;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.time.LocalDate;

public class WSFacade {


    private final WSStatusConsulta wsStatusConsulta;
    private final WSRecepcaoLote wsRecepcaoLote;
    private final WSNotaConsulta wsNotaConsulta;
    private final WSCancelamento wsCancelamento;
    private final WSEncerramento wsEncerramento;
    private final WSConsultaRecibo wsConsultaRecibo;
    private final WSConsultaNaoEncerrados wsConsultaNaoEncerrados;

//	private final WSRecepcaoLoteRetorno wsRecepcaoLoteRetorno;

    public WSFacade(final MDFeConfig config) throws IOException, KeyManagementException, UnrecoverableKeyException, KeyStoreException, NoSuchAlgorithmException, CertificateException {
        Protocol.registerProtocol("https", new Protocol("https", new DFSocketFactory(config), 443));
        this.wsStatusConsulta = new WSStatusConsulta(config);
        this.wsRecepcaoLote = new WSRecepcaoLote(config);
//        this.wsRecepcaoLoteRetorno = new WSRecepcaoLoteRetorno(config);
        this.wsNotaConsulta = new WSNotaConsulta(config);
        this.wsCancelamento = new WSCancelamento(config);
        this.wsEncerramento = new WSEncerramento(config);
        this.wsConsultaRecibo = new WSConsultaRecibo(config);
        this.wsConsultaNaoEncerrados = new WSConsultaNaoEncerrados(config);
    }

    /**
     * Faz o envio do lote para a SEFAZ
     *
     * @param mdfEnvioLote a ser eviado para a SEFAZ
     * @return dados do retorno do envio do lote e o xml assinado
     * @throws Exception caso nao consiga gerar o xml ou problema de conexao com o sefaz
     */
    public MDFEnvioLoteRetornoDados envioRecepcaoLote(MDFEnvioLote mdfEnvioLote) throws Exception {
        return this.wsRecepcaoLote.envioRecepcao(mdfEnvioLote);
    }

    /**
     * Faz a consulta de status responsavel pela UF, no caso apenas o RS está disponível
     *
     * @param uf uf UF que deseja consultar o status do sefaz responsavel
     * @return dados da consulta de status retornado pelo webservice
     * @throws Exception caso nao consiga gerar o xml ou problema de conexao com o sefaz
     */
    public MDFeConsStatServRet consultaStatus(final DFUnidadeFederativa uf) throws Exception {
        return this.wsStatusConsulta.consultaStatus(uf);
    }

    /**
     * @return
     * @throws Exception
     * @see #consultaStatus(DFUnidadeFederativa)
     */
    public MDFeConsStatServRet consultaStatus() throws Exception {
        return this.wsStatusConsulta.consultaStatus(DFUnidadeFederativa.RS);
    }

    /**
     * Faz a consulta do MDF-e
     *
     * @param chaveDeAcesso chave de acesso do MDF-e
     * @return dados da consulta da nota retornado pelo webservice
     * @throws Exception caso nao consiga gerar o xml ou problema de conexao com o sefaz
     */
    public MDFeNotaConsultaRetorno consultaMdfe(final String chaveDeAcesso) throws Exception {
        return this.wsNotaConsulta.consultaNota(chaveDeAcesso);
    }

    /**
     * Faz o cancelamento do MDFe
     *
     * @param chave           chave de acesso da nota
     * @param numeroProtocolo numero do protocolo da nota
     * @param motivo          motivo do cancelamento
     * @return dados do cancelamento da nota retornado pelo webservice
     * @throws Exception caso nao consiga gerar o xml ou problema de conexao com o sefaz
     */
    public MDFeRetorno cancelaMdfe(final String chave, final String numeroProtocolo, final String motivo) throws Exception {
        return this.wsCancelamento.cancelaNota(chave, numeroProtocolo, motivo);
    }

    /**
     * Faz o cancelamento da nota com evento ja assinado
     * ATENCAO: Esse metodo deve ser utilizado para assinaturas A3
     *
     * @param chave             chave de acesso da nota
     * @param eventoAssinadoXml evento ja assinado em formato XML
     * @return dados do cancelamento da nota retornado pelo webservice
     * @throws Exception caso nao consiga gerar o xml ou problema de conexao com o sefaz
     */
    public MDFeRetorno cancelaMdfeAssinado(final String chave, final String eventoAssinadoXml) throws Exception {
        return this.wsCancelamento.cancelaNotaAssinada(chave, eventoAssinadoXml);
    }

    /**
     * Faz o cancelamento do MDFe
     *
     * @param chaveAcesso     chave de acesso da nota
     * @param numeroProtocolo numero do protocolo da nota
     * @return dados do encerramento da nota retornado pelo webservice
     * @throws Exception caso nao consiga gerar o xml ou problema de conexao com o sefaz
     */
    public MDFeRetorno encerramento(final String chaveAcesso, final String numeroProtocolo
            , final String codigoMunicipio, final LocalDate dataEncerramento, final DFUnidadeFederativa unidadeFederativa) throws Exception {
        return this.wsEncerramento.encerraMdfe(chaveAcesso, numeroProtocolo, codigoMunicipio, dataEncerramento, unidadeFederativa);
    }

    /**
     * Faz a consulta do recibo do MDF-e
     *
     * @param numeroRecibo recibo do processamento do arquivo MDF-e
     * @return dados da consulta da nota retornado pelo webservice
     * @throws Exception caso nao consiga gerar o xml ou problema de conexao com o sefaz
     */
    public MDFeConsultaReciboRetorno consultaRecibo(final String numeroRecibo) throws Exception {
        return this.wsConsultaRecibo.consultaRecibo(numeroRecibo);
    }

    /**
     * Faz a consulta do recibo do MDF-e
     *
     * @param cnpj CNPJ do Emitente do MDF-e
     * @return Retorno de Pedido de Consulta MDF-e não Encerrados
     * @throws Exception caso nao consiga gerar o xml ou problema de conexao com o sefaz
     */
    public MDFeConsultaNaoEncerradosRetorno consultaNaoEncerrados(final String cnpj) throws Exception {
        return this.wsConsultaNaoEncerrados.consultaNaoEncerrados(cnpj);
    }

}