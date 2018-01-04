package br.indie.fiscal4j.nfe.classes.statusservico;

import br.indie.fiscal4j.common.DFAmbiente;
import br.indie.fiscal4j.common.DFUnidadeFederativa;
import br.indie.fiscal4j.nfe.classes.statusservico.consulta.DFStatusServicoConsulta;
import org.junit.Assert;
import org.junit.Test;

public class NFStatusServicoConsultaTest {

    @Test
    public void deveObterVersaoComoFoiSetado() {
        final DFStatusServicoConsulta servicoConsulta = new DFStatusServicoConsulta();
        final String versao = "4.00";
        servicoConsulta.setVersao(versao);
        Assert.assertEquals(versao, servicoConsulta.getVersao());
    }

    @Test
    public void deveObterAmbienteComoFoiSetado() {
        final DFStatusServicoConsulta servicoConsulta = new DFStatusServicoConsulta();
        final DFAmbiente ambiente = DFAmbiente.HOMOLOGACAO;
        servicoConsulta.setAmbiente(ambiente);
        Assert.assertEquals(ambiente, servicoConsulta.getAmbiente());
    }

    @Test
    public void deveObterUFComoFoiSetado() {
        final DFStatusServicoConsulta servicoConsulta = new DFStatusServicoConsulta();
        final DFUnidadeFederativa unidadeFederativa = DFUnidadeFederativa.SP;
        servicoConsulta.setUf(unidadeFederativa);
        Assert.assertEquals(unidadeFederativa, servicoConsulta.getUf());
    }

    @Test
    public void deveObterServicoComoFoiSetado() {
        final DFStatusServicoConsulta servicoConsulta = new DFStatusServicoConsulta();
        final String servico = "STATUS";
        servicoConsulta.setServico(servico);
        Assert.assertEquals(servico, servicoConsulta.getServico());
    }
}