package br.indie.fiscal4j.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoCadaDeducaoTest {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirDescricaoDeducaoVazia() {
        new NFNotaInfoCanaDeducao().setDescricaoDeducao("");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirDeducaoMaiorQue60caracteres() {
        new NFNotaInfoCanaDeducao().setDescricaoDeducao("67TgthEHf2gowJBy4PZ3ulgaDDAi80s27pIzYK6DJORNAPqL7vJ5ZbQShDcAW");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirDescricaoDeducaoNulo() {
        final NFNotaInfoCanaDeducao infoCanaDeducao = new NFNotaInfoCanaDeducao();
        infoCanaDeducao.setValorDeducao(new BigDecimal("1000"));
        infoCanaDeducao.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirDeducaoNulo() {
        final NFNotaInfoCanaDeducao infoCanaDeducao = new NFNotaInfoCanaDeducao();
        infoCanaDeducao.setDescricaoDeducao("67TgthEHf2gowJBy4PZ3ulgaDDAi80s27pIzYK6DJORNAPqL7vJ5ZbQShDcA");
        infoCanaDeducao.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<NFNotaInfoCanaDeducao><xDed>67TgthEHf2gowJBy4PZ3ulgaDDAi80s27pIzYK6DJORNAPqL7vJ5ZbQShDcA</xDed><vDed>1000.00</vDed></NFNotaInfoCanaDeducao>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoCanaDeducao().toString());
    }
}