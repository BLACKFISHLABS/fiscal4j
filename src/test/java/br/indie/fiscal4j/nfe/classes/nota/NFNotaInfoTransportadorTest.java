package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import br.indie.fiscal4j.common.DFUnidadeFederativa;
import org.junit.Assert;
import org.junit.Test;

public class NFNotaInfoTransportadorTest {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNomeMunicipioTamanhoInvalido() {
        final DFNotaInfoTransportador transportador = new DFNotaInfoTransportador();
        try {
            transportador.setNomeMunicipio("");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
            transportador.setNomeMunicipio("4lb4Qv5yi9oYq7s8fF98a0EEv98oAxl0CIs5gzyKNVp1skE3IHD9Z7JbjHCn1");
        }
        Assert.fail("Validacao nao funcionou");
    }

    @Test
    public void devePermitirNomeMunicipioValido() {
        final DFNotaInfoTransportador transportador = new DFNotaInfoTransportador();
        transportador.setNomeMunicipio("a");
        transportador.setNomeMunicipio("4lb4Qv5yi9oYq7s8fF98a0EEv98oAxl0CIs5gzyKNVp1skE3IHD9Z7JbjHCn");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirRazaoSocialInvalido() {
        final DFNotaInfoTransportador transportador = new DFNotaInfoTransportador();
        try {
            transportador.setRazaoSocial("");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
            transportador.setRazaoSocial("4lb4Qv5yi9oYq7s8fF98a0EEv98oAxl0CIs5gzyKNVp1skE3IHD9Z7JbjHCn1");
        }
        Assert.fail("Validacao nao funcionou");
    }

    @Test
    public void devePermitirRazaoSocialValido() {
        final DFNotaInfoTransportador transportador = new DFNotaInfoTransportador();
        transportador.setRazaoSocial("4lb4Qv5yi9oYq7s8fF98a0EEv98oAxl0CIs5gzyKNVp1skE3IHD9Z7JbjHCn");
        transportador.setRazaoSocial("A");
    }

    @Test
    public void devePermitirInscricaoEstadualValido() {
        final DFNotaInfoTransportador transportador = new DFNotaInfoTransportador();
        transportador.setInscricaoEstadual("");
        transportador.setInscricaoEstadual("ISENTO");
        transportador.setInscricaoEstadual("12");
        transportador.setInscricaoEstadual("12345678901234");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirInscricaoEstadualInvalido() {
        final DFNotaInfoTransportador transportador = new DFNotaInfoTransportador();
        try {
            transportador.setInscricaoEstadual("I");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
            transportador.setInscricaoEstadual("ISENTOISENTOISE");
        }
        Assert.fail("Validacao nao funcionou");
    }

    @Test
    public void devePermitirUFNulo() {
        final DFNotaInfoTransportador transportador = new DFNotaInfoTransportador();
        transportador.setCnpj("34843274000164");
        transportador.setEnderecoComplemento("D8nOWsHxI5K4RgYTUGwWgIKajhiUf4Q7aOOmaTV2wnYV0kQ5MezOjqfoPcNY");
        transportador.setInscricaoEstadual("");
        transportador.setNomeMunicipio("4lb4Qv5yi9oYq7s8fF98a0EEv98oAxl0CIs5gzyKNVp1skE3IHD9Z7JbjHCn");
        transportador.setRazaoSocial("4lb4Qv5yi9oYq7s8fF98a0EEv98oAxl0CIs5gzyKNVp1skE3IHD9Z7JbjHCn");
        transportador.toString();
    }

    @Test
    public void devePermitirNomeMunicipioNulo() {
        final DFNotaInfoTransportador transportador = new DFNotaInfoTransportador();
        transportador.setCnpj("34843274000164");
        transportador.setEnderecoComplemento("D8nOWsHxI5K4RgYTUGwWgIKajhiUf4Q7aOOmaTV2wnYV0kQ5MezOjqfoPcNY");
        transportador.setInscricaoEstadual("");
        transportador.setRazaoSocial("4lb4Qv5yi9oYq7s8fF98a0EEv98oAxl0CIs5gzyKNVp1skE3IHD9Z7JbjHCn");
        transportador.setUf(DFUnidadeFederativa.SP);
        transportador.toString();
    }

    @Test
    public void devePermitirEnderecoComplementoNulo() {
        final DFNotaInfoTransportador transportador = new DFNotaInfoTransportador();
        transportador.setCnpj("34843274000164");
        transportador.setInscricaoEstadual("");
        transportador.setNomeMunicipio("4lb4Qv5yi9oYq7s8fF98a0EEv98oAxl0CIs5gzyKNVp1skE3IHD9Z7JbjHCn");
        transportador.setRazaoSocial("4lb4Qv5yi9oYq7s8fF98a0EEv98oAxl0CIs5gzyKNVp1skE3IHD9Z7JbjHCn");
        transportador.setUf(DFUnidadeFederativa.SP);
        transportador.toString();
    }

    @Test
    public void devePermitirInscricaoEstadualNulo() {
        final DFNotaInfoTransportador transportador = new DFNotaInfoTransportador();
        transportador.setCnpj("34843274000164");
        transportador.setEnderecoComplemento("D8nOWsHxI5K4RgYTUGwWgIKajhiUf4Q7aOOmaTV2wnYV0kQ5MezOjqfoPcNY");
        transportador.setNomeMunicipio("4lb4Qv5yi9oYq7s8fF98a0EEv98oAxl0CIs5gzyKNVp1skE3IHD9Z7JbjHCn");
        transportador.setRazaoSocial("4lb4Qv5yi9oYq7s8fF98a0EEv98oAxl0CIs5gzyKNVp1skE3IHD9Z7JbjHCn");
        transportador.setUf(DFUnidadeFederativa.SP);
        transportador.toString();
    }

    @Test
    public void devePermitirRazaoSocialNulo() {
        final DFNotaInfoTransportador transportador = new DFNotaInfoTransportador();
        transportador.setCnpj("34843274000164");
        transportador.setEnderecoComplemento("D8nOWsHxI5K4RgYTUGwWgIKajhiUf4Q7aOOmaTV2wnYV0kQ5MezOjqfoPcNY");
        transportador.setInscricaoEstadual("");
        transportador.setNomeMunicipio("4lb4Qv5yi9oYq7s8fF98a0EEv98oAxl0CIs5gzyKNVp1skE3IHD9Z7JbjHCn");
        transportador.setRazaoSocial("4lb4Qv5yi9oYq7s8fF98a0EEv98oAxl0CIs5gzyKNVp1skE3IHD9Z7JbjHCn");
        transportador.setUf(DFUnidadeFederativa.SP);
        transportador.toString();
    }

    @Test
    public void devePermitirCPFNulo() {
        final DFNotaInfoTransportador transportador = new DFNotaInfoTransportador();
        transportador.setCnpj("34843274000164");
        transportador.setEnderecoComplemento("D8nOWsHxI5K4RgYTUGwWgIKajhiUf4Q7aOOmaTV2wnYV0kQ5MezOjqfoPcNY");
        transportador.setInscricaoEstadual("");
        transportador.setNomeMunicipio("4lb4Qv5yi9oYq7s8fF98a0EEv98oAxl0CIs5gzyKNVp1skE3IHD9Z7JbjHCn");
        transportador.setRazaoSocial("4lb4Qv5yi9oYq7s8fF98a0EEv98oAxl0CIs5gzyKNVp1skE3IHD9Z7JbjHCn");
        transportador.setUf(DFUnidadeFederativa.SP);
        transportador.toString();
    }

    @Test
    public void devePermitirCNPJNulo() {
        final DFNotaInfoTransportador transportador = new DFNotaInfoTransportador();
        transportador.setCpf("13484327401");
        transportador.setEnderecoComplemento("D8nOWsHxI5K4RgYTUGwWgIKajhiUf4Q7aOOmaTV2wnYV0kQ5MezOjqfoPcNY");
        transportador.setInscricaoEstadual("");
        transportador.setNomeMunicipio("4lb4Qv5yi9oYq7s8fF98a0EEv98oAxl0CIs5gzyKNVp1skE3IHD9Z7JbjHCn");
        transportador.setRazaoSocial("4lb4Qv5yi9oYq7s8fF98a0EEv98oAxl0CIs5gzyKNVp1skE3IHD9Z7JbjHCn");
        transportador.setUf(DFUnidadeFederativa.SP);
        transportador.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirSetarCPFCasoCNPJEstejaSetado() {
        final DFNotaInfoTransportador nfNotaInfoTransportador = new DFNotaInfoTransportador();
        nfNotaInfoTransportador.setCpf("13484327401");
        nfNotaInfoTransportador.setCnpj("34843274000164");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirSetarCNPJCasoCPFEstejaSetado() {
        final DFNotaInfoTransportador nfNotaInfoTransportador = new DFNotaInfoTransportador();
        nfNotaInfoTransportador.setCnpj("34843274000164");
        nfNotaInfoTransportador.setCpf("13484327401");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCPFInvalido() {
        try {
            new DFNotaInfoTransportador().setCpf("134843274012");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
            new DFNotaInfoTransportador().setCpf("1348432740");
        }
        Assert.fail("Validacao nao funcionou");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCNPJInvalido() {
        try {
            new DFNotaInfoTransportador().setCnpj("348432740001641");
            Assert.fail("validacao nao funcionou");
        } catch (final IllegalStateException e) {
            new DFNotaInfoTransportador().setCnpj("3484327400016");
        }
        Assert.fail("validacao nao funcionou");
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<DFNotaInfoTransportador><CNPJ>34843274000164</CNPJ><xNome>4lb4Qv5yi9oYq7s8fF98a0EEv98oAxl0CIs5gzyKNVp1skE3IHD9Z7JbjHCn</xNome><IE>ISENTO</IE><xEnder>D8nOWsHxI5K4RgYTUGwWgIKajhiUf4Q7aOOmaTV2wnYV0kQ5MezOjqfoPcNY</xEnder><xMun>4lb4Qv5yi9oYq7s8fF98a0EEv98oAxl0CIs5gzyKNVp1skE3IHD9Z7JbjHCn</xMun><UF>SP</UF></DFNotaInfoTransportador>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoTransportador().toString());
    }
}