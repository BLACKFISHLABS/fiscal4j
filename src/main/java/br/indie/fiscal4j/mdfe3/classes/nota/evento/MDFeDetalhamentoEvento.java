package br.indie.fiscal4j.mdfe3.classes.nota.evento;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.mdfe3.classes.nota.evento.cancelamento.MDFeEnviaEventoCancelamento;
import br.indie.fiscal4j.validadores.BigDecimalValidador;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

/**
 * Created by Eldevan Nery Junior on 17/11/17.
 */
public class MDFeDetalhamentoEvento extends DFBase {

    private static final long serialVersionUID = 4567286592593410285L;

    @Attribute(name = "versaoEvento")
    private String versaoEvento;

    @Element(name = "evCancMDFe", required = false)
    private MDFeEnviaEventoCancelamento mdFeEnviaEventoCancelamento;

    @Element(name = "evMDFeRegPassagem", required = false)
    private MDFeEnviaEventoRegistroPassagem eventoRegistroPassagem;

    @Element(name = "evMDFeRegPassagemAuto", required = false)
    private MDFeEnviaEventoRegistroPassagemAutomatica eventoRegistroPassagemAutomatica;

    @Element(name = "evEncMDFe", required = false)
    private MDFeEnviaEventoEncerramento enviaEventoEncerramento;

    @Element(name = "evIncCondutorMDFe", required = false)
    private MDFeEnviaEventoIncluirCondutor enviaEventoIncluirCondutor;

    @Element(name = "evIncDFeMDFe", required = false)
    private MDFeEnviaEventoIncluirDFe enviaEventoIncluirDFe;

    public String getVersaoEvento() {
        return this.versaoEvento;
    }

    public void setVersaoEvento(final BigDecimal versaoEvento) {
        this.versaoEvento = BigDecimalValidador.tamanho5Com2CasasDecimais(versaoEvento, "versao do Evento");
    }

    public MDFeEnviaEventoCancelamento getMdFeEnviaEventoCancelamento() {
        return this.mdFeEnviaEventoCancelamento;
    }

    public void setMdFeEnviaEventoCancelamento(final MDFeEnviaEventoCancelamento mdFeEnviaEventoCancelamento) {
        this.mdFeEnviaEventoCancelamento = mdFeEnviaEventoCancelamento;
    }

    public MDFeEnviaEventoRegistroPassagem getEventoRegistroPassagem() {
        return this.eventoRegistroPassagem;
    }

    public void setEventoRegistroPassagem(final MDFeEnviaEventoRegistroPassagem eventoRegistroPassagem) {
        this.eventoRegistroPassagem = eventoRegistroPassagem;
    }

    public MDFeEnviaEventoRegistroPassagemAutomatica getEventoRegistroPassagemAutomatica() {
        return this.eventoRegistroPassagemAutomatica;
    }

    public void setEventoRegistroPassagemAutomatica(final MDFeEnviaEventoRegistroPassagemAutomatica eventoRegistroPassagemAutomatica) {
        this.eventoRegistroPassagemAutomatica = eventoRegistroPassagemAutomatica;
    }

    public MDFeEnviaEventoEncerramento getEnviaEventoEncerramento() {
        return this.enviaEventoEncerramento;
    }

    public void setEnviaEventoEncerramento(final MDFeEnviaEventoEncerramento enviaEventoEncerramento) {
        this.enviaEventoEncerramento = enviaEventoEncerramento;
    }

    public MDFeEnviaEventoIncluirCondutor getEnviaEventoIncluirCondutor() {
        return enviaEventoIncluirCondutor;
    }

    public void setEnviaEventoIncluirCondutor(MDFeEnviaEventoIncluirCondutor enviaEventoIncluirCondutor) {
        this.enviaEventoIncluirCondutor = enviaEventoIncluirCondutor;
    }

    public MDFeEnviaEventoIncluirDFe getEnviaEventoIncluirDFe() {
        return enviaEventoIncluirDFe;
    }

    public void setEnviaEventoIncluirDFe(MDFeEnviaEventoIncluirDFe enviaEventoIncluirDFe) {
        this.enviaEventoIncluirDFe = enviaEventoIncluirDFe;
    }

}
