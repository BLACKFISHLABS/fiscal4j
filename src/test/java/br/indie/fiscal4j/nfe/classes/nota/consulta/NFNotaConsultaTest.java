package br.indie.fiscal4j.nfe.classes.nota.consulta;

import br.indie.fiscal4j.common.DFAmbiente;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaConsultaTest {

    @Test
    public void deveObterVersaoComoFoiSetado() {
        final DFNotaConsulta notaConsulta = new DFNotaConsulta();
        final String versao = "4.00";
        notaConsulta.setVersao(new BigDecimal(versao));
        Assert.assertEquals(versao, notaConsulta.getVersao());
    }

    @Test
    public void deveObterAmbienteComoFoiSetado() {
        final DFNotaConsulta notaConsulta = new DFNotaConsulta();
        final DFAmbiente ambiente = DFAmbiente.HOMOLOGACAO;
        notaConsulta.setAmbiente(ambiente);
        Assert.assertEquals(ambiente, notaConsulta.getAmbiente());
    }

    @Test
    public void deveObterServicoComoFoiSetado() {
        final DFNotaConsulta notaConsulta = new DFNotaConsulta();
        final String servico = "CONSULTAR";
        notaConsulta.setServico(servico);
        Assert.assertEquals(servico, notaConsulta.getServico());
    }

    @Test
    public void deveObterChaveComoFoiSetado() {
        final DFNotaConsulta notaConsulta = new DFNotaConsulta();
        final String chave = "40153917432140336471309459374276926791686520";
        notaConsulta.setChave(chave);
        Assert.assertEquals(chave, notaConsulta.getChave());
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirChaveComTamanhoInvalido() {
        try {
            new DFNotaConsulta().setChave("4015391743214033647130945937427692679168652");
            Assert.fail();
        } catch (final IllegalStateException e) {
            new DFNotaConsulta().setChave("401539174321403364713094593742769267916865212");
            Assert.fail();
        }
    }
}