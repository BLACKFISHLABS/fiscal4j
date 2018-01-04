package br.indie.fiscal4j.nfe.classes.evento.inutilizacao;

import br.indie.fiscal4j.nfe.classes.nota.assinatura.DFSignature;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFRetornoEventoInutilizacaoTest {

    @Test
    public void deveObterVersaoComoFoiSetado() {
        final NFRetornoEventoInutilizacao eventoInutilizacao = new NFRetornoEventoInutilizacao();
        final String versao = "1.30";
        eventoInutilizacao.setVersao(new BigDecimal(versao));
        Assert.assertEquals(versao, eventoInutilizacao.getVersao());
    }

    @Test
    public void deveObterDadosComoFoiSetado() {
        final NFRetornoEventoInutilizacao eventoInutilizacao = new NFRetornoEventoInutilizacao();
        final NFRetornoEventoInutilizacaoDados dados = new NFRetornoEventoInutilizacaoDados();
        eventoInutilizacao.setDados(dados);
        Assert.assertEquals(dados, eventoInutilizacao.getDados());
    }

    @Test
    public void deveObterAssinaturaComoFoiSetado() {
        final NFEnviaEventoInutilizacao eventoInutilizacao = new NFEnviaEventoInutilizacao();
        final DFSignature assinatura = new DFSignature();
        final String signatureValue = "signature";
        assinatura.setSignatureValue(signatureValue);
        eventoInutilizacao.setAssinatura(assinatura);
        Assert.assertEquals(assinatura, eventoInutilizacao.getAssinatura());
    }
}
