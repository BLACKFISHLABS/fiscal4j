package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import br.indie.fiscal4j.common.DFUnidadeFederativa;
import org.junit.Assert;
import org.junit.Test;

public class NFNotaInfoLocalTest {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNomeMunicipioComTamanhoInvalido() {
        try {
            new DFNotaInfoLocal().setNomeMunicipio("");
        } catch (final IllegalStateException e) {
            new DFNotaInfoLocal().setNomeMunicipio("YHTewrLNvzYaBmSbwxkDYcEZTCMORFVPAc6t6C5p0Bfu1globey70KWnaHHa1");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNumeroComTamanhoInvalido() {
        try {
            new DFNotaInfoLocal().setNumero("");
        } catch (final IllegalStateException e) {
            new DFNotaInfoLocal().setNumero("YHTewrLNvzYaBmSbwxkDYcEZTCMORFVPAc6t6C5p0Bfu1globey70KWnaHHa1");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirLogradouroComTamanhoInvalido() {
        try {
            new DFNotaInfoLocal().setLogradouro("");
        } catch (final IllegalStateException e) {
            new DFNotaInfoLocal().setLogradouro("YHTewrLNvzYaBmSbwxkDYcEZTCMORFVPAc6t6C5p0Bfu1globey70KWnaHHa1");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirComplementoComTamanhoInvalido() {
        try {
            new DFNotaInfoLocal().setComplemento("");
        } catch (final IllegalStateException e) {
            new DFNotaInfoLocal().setComplemento("YHTewrLNvzYaBmSbwxkDYcEZTCMORFVPAc6t6C5p0Bfu1globey70KWnaHHa1");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCodigoMunicipioComTamanhoInvalido() {
        try {
            new DFNotaInfoLocal().setCodigoMunicipio("123456");
        } catch (final IllegalStateException e) {
            new DFNotaInfoLocal().setCodigoMunicipio("12345678");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCNPJComTamanhoInvalido() {
        try {
            new DFNotaInfoLocal().setCnpj("1234567890123");
        } catch (final IllegalStateException e) {
            new DFNotaInfoLocal().setCnpj("123456789012345");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCPFComTamanhoInvalido() {
        try {
            new DFNotaInfoLocal().setCpf("1234567890");
        } catch (final IllegalStateException e) {
            new DFNotaInfoLocal().setCpf("123456789012");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCNPJSetadoQuandoCPFEstaSetado() {
        final DFNotaInfoLocal entrega = new DFNotaInfoLocal();
        entrega.setCpf("12345678901");
        entrega.setCnpj("12345678901234");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCPFSetadoQuandoCNPJEstaSetado() {
        final DFNotaInfoLocal entrega = new DFNotaInfoLocal();
        entrega.setCnpj("12345678901234");
        entrega.setCpf("12345678901");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirBairroNulo() {
        final DFNotaInfoLocal entrega = new DFNotaInfoLocal();
        entrega.setCnpj("12345678901234");
        entrega.setCodigoMunicipio("9999999");
        entrega.setComplemento("ifyKIg3j3eZtlNVAj3XJYZiJCrul6VLL85E7x6Kx6DVeChwlRLEkCQn7k5pe");
        entrega.setLogradouro("t59le7pl2eVn390y026Ebgh3HXtvEBzsMp4BzZJEwIazezToxeeKJCvm1GoG");
        entrega.setNomeMunicipio("OpXKhaHINo7OwLkVGvRq43HNwyBAgXTKcarl6Jsq8NzOBs70eZM4zL6fELOI");
        entrega.setNumero("YHTewrLNvzYaBmSbwxkDYcEZTCMORFVPAc6t6C5p0Bfu1globey70KWnaHHa");
        entrega.setUf(DFUnidadeFederativa.AC);
        entrega.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCodigoMunicipioNulo() {
        final DFNotaInfoLocal entrega = new DFNotaInfoLocal();
        entrega.setBairro("JE17uXBNBnYTSTSQgqXcGLOR6f22SnahtFHr5MoHQZtZhTowVe3SVwl57kil");
        entrega.setCnpj("12345678901234");
        entrega.setComplemento("ifyKIg3j3eZtlNVAj3XJYZiJCrul6VLL85E7x6Kx6DVeChwlRLEkCQn7k5pe");
        entrega.setLogradouro("t59le7pl2eVn390y026Ebgh3HXtvEBzsMp4BzZJEwIazezToxeeKJCvm1GoG");
        entrega.setNomeMunicipio("OpXKhaHINo7OwLkVGvRq43HNwyBAgXTKcarl6Jsq8NzOBs70eZM4zL6fELOI");
        entrega.setNumero("YHTewrLNvzYaBmSbwxkDYcEZTCMORFVPAc6t6C5p0Bfu1globey70KWnaHHa");
        entrega.setUf(DFUnidadeFederativa.AC);
        entrega.toString();
    }

    @Test
    public void devePermitirComplementoNulo() {
        final DFNotaInfoLocal entrega = new DFNotaInfoLocal();
        entrega.setBairro("JE17uXBNBnYTSTSQgqXcGLOR6f22SnahtFHr5MoHQZtZhTowVe3SVwl57kil");
        entrega.setCnpj("12345678901234");
        entrega.setCodigoMunicipio("9999999");
        entrega.setLogradouro("t59le7pl2eVn390y026Ebgh3HXtvEBzsMp4BzZJEwIazezToxeeKJCvm1GoG");
        entrega.setNomeMunicipio("OpXKhaHINo7OwLkVGvRq43HNwyBAgXTKcarl6Jsq8NzOBs70eZM4zL6fELOI");
        entrega.setNumero("YHTewrLNvzYaBmSbwxkDYcEZTCMORFVPAc6t6C5p0Bfu1globey70KWnaHHa");
        entrega.setUf(DFUnidadeFederativa.AC);
        entrega.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirLogradouroNulo() {
        final DFNotaInfoLocal entrega = new DFNotaInfoLocal();
        entrega.setBairro("JE17uXBNBnYTSTSQgqXcGLOR6f22SnahtFHr5MoHQZtZhTowVe3SVwl57kil");
        entrega.setCnpj("12345678901234");
        entrega.setCodigoMunicipio("9999999");
        entrega.setComplemento("ifyKIg3j3eZtlNVAj3XJYZiJCrul6VLL85E7x6Kx6DVeChwlRLEkCQn7k5pe");
        entrega.setNomeMunicipio("OpXKhaHINo7OwLkVGvRq43HNwyBAgXTKcarl6Jsq8NzOBs70eZM4zL6fELOI");
        entrega.setNumero("YHTewrLNvzYaBmSbwxkDYcEZTCMORFVPAc6t6C5p0Bfu1globey70KWnaHHa");
        entrega.setUf(DFUnidadeFederativa.AC);
        entrega.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNomeMunicipioNulo() {
        final DFNotaInfoLocal entrega = new DFNotaInfoLocal();
        entrega.setBairro("JE17uXBNBnYTSTSQgqXcGLOR6f22SnahtFHr5MoHQZtZhTowVe3SVwl57kil");
        entrega.setCnpj("12345678901234");
        entrega.setCodigoMunicipio("9999999");
        entrega.setComplemento("ifyKIg3j3eZtlNVAj3XJYZiJCrul6VLL85E7x6Kx6DVeChwlRLEkCQn7k5pe");
        entrega.setLogradouro("t59le7pl2eVn390y026Ebgh3HXtvEBzsMp4BzZJEwIazezToxeeKJCvm1GoG");
        entrega.setNumero("YHTewrLNvzYaBmSbwxkDYcEZTCMORFVPAc6t6C5p0Bfu1globey70KWnaHHa");
        entrega.setUf(DFUnidadeFederativa.AC);
        entrega.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNumeroNulo() {
        final DFNotaInfoLocal entrega = new DFNotaInfoLocal();
        entrega.setBairro("JE17uXBNBnYTSTSQgqXcGLOR6f22SnahtFHr5MoHQZtZhTowVe3SVwl57kil");
        entrega.setCnpj("12345678901234");
        entrega.setCodigoMunicipio("9999999");
        entrega.setComplemento("ifyKIg3j3eZtlNVAj3XJYZiJCrul6VLL85E7x6Kx6DVeChwlRLEkCQn7k5pe");
        entrega.setLogradouro("t59le7pl2eVn390y026Ebgh3HXtvEBzsMp4BzZJEwIazezToxeeKJCvm1GoG");
        entrega.setNomeMunicipio("OpXKhaHINo7OwLkVGvRq43HNwyBAgXTKcarl6Jsq8NzOBs70eZM4zL6fELOI");
        entrega.setUf(DFUnidadeFederativa.AC);
        entrega.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirUFNulo() {
        final DFNotaInfoLocal entrega = new DFNotaInfoLocal();
        entrega.setBairro("JE17uXBNBnYTSTSQgqXcGLOR6f22SnahtFHr5MoHQZtZhTowVe3SVwl57kil");
        entrega.setCnpj("12345678901234");
        entrega.setCodigoMunicipio("9999999");
        entrega.setComplemento("ifyKIg3j3eZtlNVAj3XJYZiJCrul6VLL85E7x6Kx6DVeChwlRLEkCQn7k5pe");
        entrega.setLogradouro("t59le7pl2eVn390y026Ebgh3HXtvEBzsMp4BzZJEwIazezToxeeKJCvm1GoG");
        entrega.setNomeMunicipio("OpXKhaHINo7OwLkVGvRq43HNwyBAgXTKcarl6Jsq8NzOBs70eZM4zL6fELOI");
        entrega.setNumero("YHTewrLNvzYaBmSbwxkDYcEZTCMORFVPAc6t6C5p0Bfu1globey70KWnaHHa");
        entrega.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<DFNotaInfoLocal><CNPJ>12345678901234</CNPJ><xLgr>t59le7pl2eVn390y026Ebgh3HXtvEBzsMp4BzZJEwIazezToxeeKJCvm1GoG</xLgr><nro>YHTewrLNvzYaBmSbwxkDYcEZTCMORFVPAc6t6C5p0Bfu1globey70KWnaHHa</nro><xCpl>ifyKIg3j3eZtlNVAj3XJYZiJCrul6VLL85E7x6Kx6DVeChwlRLEkCQn7k5pe</xCpl><xBairro>JE17uXBNBnYTSTSQgqXcGLOR6f22SnahtFHr5MoHQZtZhTowVe3SVwl57kil</xBairro><cMun>9999999</cMun><xMun>OpXKhaHINo7OwLkVGvRq43HNwyBAgXTKcarl6Jsq8NzOBs70eZM4zL6fELOI</xMun><UF>RS</UF></DFNotaInfoLocal>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoLocal().toString());
    }
}