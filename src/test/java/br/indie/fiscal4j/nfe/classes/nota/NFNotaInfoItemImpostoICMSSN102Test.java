package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.nfe.classes.NFNotaSituacaoOperacionalSimplesNacional;
import br.indie.fiscal4j.nfe.classes.NFOrigem;
import org.junit.Assert;
import org.junit.Test;

public class NFNotaInfoItemImpostoICMSSN102Test {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirOrigemNulo() {
        final DFNotaInfoItemImpostoICMSSN102 icmssn102 = new DFNotaInfoItemImpostoICMSSN102();
        icmssn102.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.IMUNE);
        icmssn102.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirSituacaoOperacaoSNNulo() {
        final DFNotaInfoItemImpostoICMSSN102 icmssn102 = new DFNotaInfoItemImpostoICMSSN102();
        icmssn102.setOrigem(NFOrigem.NACIONAL);
        icmssn102.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final DFNotaInfoItemImpostoICMSSN102 icms102 = new DFNotaInfoItemImpostoICMSSN102();
        icms102.setOrigem(NFOrigem.ESTRANGEIRA_ADQUIRIDA_MERCADO_INTERNO);
        icms102.setSituacaoOperacaoSN(NFNotaSituacaoOperacionalSimplesNacional.IMUNE);

        final String xmlEsperado = "<DFNotaInfoItemImpostoICMSSN102><orig>2</orig><CSOSN>300</CSOSN></DFNotaInfoItemImpostoICMSSN102>";
        Assert.assertEquals(xmlEsperado, icms102.toString());
    }
}