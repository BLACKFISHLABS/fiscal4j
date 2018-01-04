package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import br.indie.fiscal4j.common.DFUnidadeFederativa;
import org.joda.time.LocalDate;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NFNotaInfoAvulsaTest {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCnpjComTamanhoInvalido() {
        try {
            new DFNotaInfoAvulsa().setCnpj("1234567890123");
        } catch (final IllegalStateException e) {
            new DFNotaInfoAvulsa().setCnpj("123456789012345");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirFoneComTamanhoInvalido() {
        try {
            new DFNotaInfoAvulsa().setFone("12345");
        } catch (final IllegalStateException e) {
            new DFNotaInfoAvulsa().setFone("123456789012345");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirMatriculaAgenteComTamanhoInvalido() {
        try {
            new DFNotaInfoAvulsa().setMatriculaAgente("");
        } catch (final IllegalStateException e) {
            new DFNotaInfoAvulsa().setMatriculaAgente("Nn5PPREBbkfmmk4lBFwgvkuKg8prnY5CPqHIzqGiD1lTnZJ37nAZ4NBc8XwM1");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNomeAgenteComTamanhoInvalido() {
        try {
            new DFNotaInfoAvulsa().setNomeAgente("");
        } catch (final IllegalStateException e) {
            new DFNotaInfoAvulsa().setNomeAgente("Nn5PPREBbkfmmk4lBFwgvkuKg8prnY5CPqHIzqGiD1lTnZJ37nAZ4NBc8XwM1");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNumeroDocumentoArrecadacaoReceitaComTamanhoInvalido() {
        try {
            new DFNotaInfoAvulsa().setNumeroDocumentoArrecadacaoReceita("");
        } catch (final IllegalStateException e) {
            new DFNotaInfoAvulsa().setNumeroDocumentoArrecadacaoReceita("Nn5PPREBbkfmmk4lBFwgvkuKg8prnY5CPqHIzqGiD1lTnZJ37nAZ4NBc8XwM1");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirOrgaoEmitenteComTamanhoInvalido() {
        try {
            new DFNotaInfoAvulsa().setOrgaoEmitente("");
        } catch (final IllegalStateException e) {
            new DFNotaInfoAvulsa().setOrgaoEmitente("Nn5PPREBbkfmmk4lBFwgvkuKg8prnY5CPqHIzqGiD1lTnZJ37nAZ4NBc8XwM1");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirReparticaoFiscalEmitenteComTamanhoInvalido() {
        try {
            new DFNotaInfoAvulsa().setReparticaoFiscalEmitente("");
        } catch (final IllegalStateException e) {
            new DFNotaInfoAvulsa().setReparticaoFiscalEmitente("Nn5PPREBbkfmmk4lBFwgvkuKg8prnY5CPqHIzqGiD1lTnZJ37nAZ4NBc8XwM1");
        }
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorTotalConstanteDocumentoArrecadacaoReceitaComTamanhoInvalido() {
        new DFNotaInfoAvulsa().setValorTotalConstanteDocumentoArrecadacaoReceita(new BigDecimal("10000000000000"));
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCnpjNulo() {
        final DFNotaInfoAvulsa avulsa = new DFNotaInfoAvulsa();
        avulsa.setDataEmissaoDocumentoArrecadacao(new LocalDate(2014, 1, 13));
        avulsa.setDataPagamentoDocumentoArrecadacao(new LocalDate(2014, 3, 21));
        avulsa.setFone("81579357");
        avulsa.setMatriculaAgente("Nn5PPREBbkfmmk4lBFwgvkuKg8prnY5CPqHIzqGiD1lTnZJ37nAZ4NBc8XwM");
        avulsa.setNomeAgente("lkLip3hIYSAIzH3Tf1LWQsaybqB76V66lMgWBcHVwcOKInuJ8mGUyY8DT4NL");
        avulsa.setNumeroDocumentoArrecadacaoReceita("qqDt1f1ulcahrBnUH0otPFkjYqD2tH4ktYsR71WSYZLFW1zZObAqajHHkyxi");
        avulsa.setOrgaoEmitente("qNre0x2eJthUYIoKBuBbbGSeA4R2wrDLxNwCuDFkYD54flBLbBBMakGDgQUV");
        avulsa.setReparticaoFiscalEmitente("YQFmDI2HBjjfZpRjR2ghwmSo1oWk5QgUEYf2oG46uEHwY4zsXyH1ORSr8oq3");
        avulsa.setUf(DFUnidadeFederativa.SC);
        avulsa.setValorTotalConstanteDocumentoArrecadacaoReceita(new BigDecimal("999999999999.99"));
        avulsa.toString();
    }

    @Test
    public void devePermitirDataEmissaoDocumentoArrecadacaoNulo() {
        final DFNotaInfoAvulsa avulsa = new DFNotaInfoAvulsa();
        avulsa.setCnpj("12345678901234");
        avulsa.setDataPagamentoDocumentoArrecadacao(new LocalDate(2014, 3, 21));
        avulsa.setFone("81579357");
        avulsa.setMatriculaAgente("Nn5PPREBbkfmmk4lBFwgvkuKg8prnY5CPqHIzqGiD1lTnZJ37nAZ4NBc8XwM");
        avulsa.setNomeAgente("lkLip3hIYSAIzH3Tf1LWQsaybqB76V66lMgWBcHVwcOKInuJ8mGUyY8DT4NL");
        avulsa.setNumeroDocumentoArrecadacaoReceita("qqDt1f1ulcahrBnUH0otPFkjYqD2tH4ktYsR71WSYZLFW1zZObAqajHHkyxi");
        avulsa.setOrgaoEmitente("qNre0x2eJthUYIoKBuBbbGSeA4R2wrDLxNwCuDFkYD54flBLbBBMakGDgQUV");
        avulsa.setReparticaoFiscalEmitente("YQFmDI2HBjjfZpRjR2ghwmSo1oWk5QgUEYf2oG46uEHwY4zsXyH1ORSr8oq3");
        avulsa.setUf(DFUnidadeFederativa.SC);
        avulsa.setValorTotalConstanteDocumentoArrecadacaoReceita(new BigDecimal("999999999999.99"));
        avulsa.toString();
    }

    @Test
    public void devePermitirDataPagamentoDocumentoArrecadacaoNulo() {
        final DFNotaInfoAvulsa avulsa = new DFNotaInfoAvulsa();
        avulsa.setCnpj("12345678901234");
        avulsa.setDataEmissaoDocumentoArrecadacao(new LocalDate(2014, 1, 13));
        avulsa.setFone("81579357");
        avulsa.setMatriculaAgente("Nn5PPREBbkfmmk4lBFwgvkuKg8prnY5CPqHIzqGiD1lTnZJ37nAZ4NBc8XwM");
        avulsa.setNomeAgente("lkLip3hIYSAIzH3Tf1LWQsaybqB76V66lMgWBcHVwcOKInuJ8mGUyY8DT4NL");
        avulsa.setNumeroDocumentoArrecadacaoReceita("qqDt1f1ulcahrBnUH0otPFkjYqD2tH4ktYsR71WSYZLFW1zZObAqajHHkyxi");
        avulsa.setOrgaoEmitente("qNre0x2eJthUYIoKBuBbbGSeA4R2wrDLxNwCuDFkYD54flBLbBBMakGDgQUV");
        avulsa.setReparticaoFiscalEmitente("YQFmDI2HBjjfZpRjR2ghwmSo1oWk5QgUEYf2oG46uEHwY4zsXyH1ORSr8oq3");
        avulsa.setUf(DFUnidadeFederativa.SC);
        avulsa.setValorTotalConstanteDocumentoArrecadacaoReceita(new BigDecimal("999999999999.99"));
        avulsa.toString();
    }

    @Test
    public void devePermitirFoneNulo() {
        final DFNotaInfoAvulsa avulsa = new DFNotaInfoAvulsa();
        avulsa.setCnpj("12345678901234");
        avulsa.setDataEmissaoDocumentoArrecadacao(new LocalDate(2014, 1, 13));
        avulsa.setDataPagamentoDocumentoArrecadacao(new LocalDate(2014, 3, 21));
        avulsa.setMatriculaAgente("Nn5PPREBbkfmmk4lBFwgvkuKg8prnY5CPqHIzqGiD1lTnZJ37nAZ4NBc8XwM");
        avulsa.setNomeAgente("lkLip3hIYSAIzH3Tf1LWQsaybqB76V66lMgWBcHVwcOKInuJ8mGUyY8DT4NL");
        avulsa.setNumeroDocumentoArrecadacaoReceita("qqDt1f1ulcahrBnUH0otPFkjYqD2tH4ktYsR71WSYZLFW1zZObAqajHHkyxi");
        avulsa.setOrgaoEmitente("qNre0x2eJthUYIoKBuBbbGSeA4R2wrDLxNwCuDFkYD54flBLbBBMakGDgQUV");
        avulsa.setReparticaoFiscalEmitente("YQFmDI2HBjjfZpRjR2ghwmSo1oWk5QgUEYf2oG46uEHwY4zsXyH1ORSr8oq3");
        avulsa.setUf(DFUnidadeFederativa.SC);
        avulsa.setValorTotalConstanteDocumentoArrecadacaoReceita(new BigDecimal("999999999999.99"));
        avulsa.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirMatriculaAgenteNulo() {
        final DFNotaInfoAvulsa avulsa = new DFNotaInfoAvulsa();
        avulsa.setCnpj("12345678901234");
        avulsa.setDataEmissaoDocumentoArrecadacao(new LocalDate(2014, 1, 13));
        avulsa.setDataPagamentoDocumentoArrecadacao(new LocalDate(2014, 3, 21));
        avulsa.setFone("81579357");
        avulsa.setNomeAgente("lkLip3hIYSAIzH3Tf1LWQsaybqB76V66lMgWBcHVwcOKInuJ8mGUyY8DT4NL");
        avulsa.setNumeroDocumentoArrecadacaoReceita("qqDt1f1ulcahrBnUH0otPFkjYqD2tH4ktYsR71WSYZLFW1zZObAqajHHkyxi");
        avulsa.setOrgaoEmitente("qNre0x2eJthUYIoKBuBbbGSeA4R2wrDLxNwCuDFkYD54flBLbBBMakGDgQUV");
        avulsa.setReparticaoFiscalEmitente("YQFmDI2HBjjfZpRjR2ghwmSo1oWk5QgUEYf2oG46uEHwY4zsXyH1ORSr8oq3");
        avulsa.setUf(DFUnidadeFederativa.SC);
        avulsa.setValorTotalConstanteDocumentoArrecadacaoReceita(new BigDecimal("999999999999.99"));
        avulsa.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNomeAgenteNulo() {
        final DFNotaInfoAvulsa avulsa = new DFNotaInfoAvulsa();
        avulsa.setCnpj("12345678901234");
        avulsa.setDataEmissaoDocumentoArrecadacao(new LocalDate(2014, 1, 13));
        avulsa.setDataPagamentoDocumentoArrecadacao(new LocalDate(2014, 3, 21));
        avulsa.setFone("81579357");
        avulsa.setMatriculaAgente("Nn5PPREBbkfmmk4lBFwgvkuKg8prnY5CPqHIzqGiD1lTnZJ37nAZ4NBc8XwM");
        avulsa.setNumeroDocumentoArrecadacaoReceita("qqDt1f1ulcahrBnUH0otPFkjYqD2tH4ktYsR71WSYZLFW1zZObAqajHHkyxi");
        avulsa.setOrgaoEmitente("qNre0x2eJthUYIoKBuBbbGSeA4R2wrDLxNwCuDFkYD54flBLbBBMakGDgQUV");
        avulsa.setReparticaoFiscalEmitente("YQFmDI2HBjjfZpRjR2ghwmSo1oWk5QgUEYf2oG46uEHwY4zsXyH1ORSr8oq3");
        avulsa.setUf(DFUnidadeFederativa.SC);
        avulsa.setValorTotalConstanteDocumentoArrecadacaoReceita(new BigDecimal("999999999999.99"));
        avulsa.toString();
    }

    @Test
    public void devePermitirNumeroDocumentoArrecadacaoReceitaNulo() {
        final DFNotaInfoAvulsa avulsa = new DFNotaInfoAvulsa();
        avulsa.setCnpj("12345678901234");
        avulsa.setDataEmissaoDocumentoArrecadacao(new LocalDate(2014, 1, 13));
        avulsa.setDataPagamentoDocumentoArrecadacao(new LocalDate(2014, 3, 21));
        avulsa.setFone("81579357");
        avulsa.setMatriculaAgente("Nn5PPREBbkfmmk4lBFwgvkuKg8prnY5CPqHIzqGiD1lTnZJ37nAZ4NBc8XwM");
        avulsa.setNomeAgente("lkLip3hIYSAIzH3Tf1LWQsaybqB76V66lMgWBcHVwcOKInuJ8mGUyY8DT4NL");
        avulsa.setOrgaoEmitente("qNre0x2eJthUYIoKBuBbbGSeA4R2wrDLxNwCuDFkYD54flBLbBBMakGDgQUV");
        avulsa.setReparticaoFiscalEmitente("YQFmDI2HBjjfZpRjR2ghwmSo1oWk5QgUEYf2oG46uEHwY4zsXyH1ORSr8oq3");
        avulsa.setUf(DFUnidadeFederativa.SC);
        avulsa.setValorTotalConstanteDocumentoArrecadacaoReceita(new BigDecimal("999999999999.99"));
        avulsa.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirOrgaoEmitenteNulo() {
        final DFNotaInfoAvulsa avulsa = new DFNotaInfoAvulsa();
        avulsa.setCnpj("12345678901234");
        avulsa.setDataEmissaoDocumentoArrecadacao(new LocalDate(2014, 1, 13));
        avulsa.setDataPagamentoDocumentoArrecadacao(new LocalDate(2014, 3, 21));
        avulsa.setFone("81579357");
        avulsa.setMatriculaAgente("Nn5PPREBbkfmmk4lBFwgvkuKg8prnY5CPqHIzqGiD1lTnZJ37nAZ4NBc8XwM");
        avulsa.setNomeAgente("lkLip3hIYSAIzH3Tf1LWQsaybqB76V66lMgWBcHVwcOKInuJ8mGUyY8DT4NL");
        avulsa.setNumeroDocumentoArrecadacaoReceita("qqDt1f1ulcahrBnUH0otPFkjYqD2tH4ktYsR71WSYZLFW1zZObAqajHHkyxi");
        avulsa.setReparticaoFiscalEmitente("YQFmDI2HBjjfZpRjR2ghwmSo1oWk5QgUEYf2oG46uEHwY4zsXyH1ORSr8oq3");
        avulsa.setUf(DFUnidadeFederativa.SC);
        avulsa.setValorTotalConstanteDocumentoArrecadacaoReceita(new BigDecimal("999999999999.99"));
        avulsa.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirReparticaoFiscalEmitenteNulo() {
        final DFNotaInfoAvulsa avulsa = new DFNotaInfoAvulsa();
        avulsa.setCnpj("12345678901234");
        avulsa.setDataEmissaoDocumentoArrecadacao(new LocalDate(2014, 1, 13));
        avulsa.setDataPagamentoDocumentoArrecadacao(new LocalDate(2014, 3, 21));
        avulsa.setFone("81579357");
        avulsa.setMatriculaAgente("Nn5PPREBbkfmmk4lBFwgvkuKg8prnY5CPqHIzqGiD1lTnZJ37nAZ4NBc8XwM");
        avulsa.setNomeAgente("lkLip3hIYSAIzH3Tf1LWQsaybqB76V66lMgWBcHVwcOKInuJ8mGUyY8DT4NL");
        avulsa.setNumeroDocumentoArrecadacaoReceita("qqDt1f1ulcahrBnUH0otPFkjYqD2tH4ktYsR71WSYZLFW1zZObAqajHHkyxi");
        avulsa.setOrgaoEmitente("qNre0x2eJthUYIoKBuBbbGSeA4R2wrDLxNwCuDFkYD54flBLbBBMakGDgQUV");
        avulsa.setUf(DFUnidadeFederativa.SC);
        avulsa.setValorTotalConstanteDocumentoArrecadacaoReceita(new BigDecimal("999999999999.99"));
        avulsa.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirUFNulo() {
        final DFNotaInfoAvulsa avulsa = new DFNotaInfoAvulsa();
        avulsa.setCnpj("12345678901234");
        avulsa.setDataEmissaoDocumentoArrecadacao(new LocalDate(2014, 1, 13));
        avulsa.setDataPagamentoDocumentoArrecadacao(new LocalDate(2014, 3, 21));
        avulsa.setFone("81579357");
        avulsa.setMatriculaAgente("Nn5PPREBbkfmmk4lBFwgvkuKg8prnY5CPqHIzqGiD1lTnZJ37nAZ4NBc8XwM");
        avulsa.setNomeAgente("lkLip3hIYSAIzH3Tf1LWQsaybqB76V66lMgWBcHVwcOKInuJ8mGUyY8DT4NL");
        avulsa.setNumeroDocumentoArrecadacaoReceita("qqDt1f1ulcahrBnUH0otPFkjYqD2tH4ktYsR71WSYZLFW1zZObAqajHHkyxi");
        avulsa.setOrgaoEmitente("qNre0x2eJthUYIoKBuBbbGSeA4R2wrDLxNwCuDFkYD54flBLbBBMakGDgQUV");
        avulsa.setReparticaoFiscalEmitente("YQFmDI2HBjjfZpRjR2ghwmSo1oWk5QgUEYf2oG46uEHwY4zsXyH1ORSr8oq3");
        avulsa.setValorTotalConstanteDocumentoArrecadacaoReceita(new BigDecimal("999999999999.99"));
        avulsa.toString();
    }

    @Test
    public void devePermitirValorTotalConstanteDocumentoArrecadacaoReceitaNulo() {
        final DFNotaInfoAvulsa avulsa = new DFNotaInfoAvulsa();
        avulsa.setCnpj("12345678901234");
        avulsa.setDataEmissaoDocumentoArrecadacao(new LocalDate(2014, 1, 13));
        avulsa.setDataPagamentoDocumentoArrecadacao(new LocalDate(2014, 3, 21));
        avulsa.setFone("81579357");
        avulsa.setMatriculaAgente("Nn5PPREBbkfmmk4lBFwgvkuKg8prnY5CPqHIzqGiD1lTnZJ37nAZ4NBc8XwM");
        avulsa.setNomeAgente("lkLip3hIYSAIzH3Tf1LWQsaybqB76V66lMgWBcHVwcOKInuJ8mGUyY8DT4NL");
        avulsa.setNumeroDocumentoArrecadacaoReceita("qqDt1f1ulcahrBnUH0otPFkjYqD2tH4ktYsR71WSYZLFW1zZObAqajHHkyxi");
        avulsa.setOrgaoEmitente("qNre0x2eJthUYIoKBuBbbGSeA4R2wrDLxNwCuDFkYD54flBLbBBMakGDgQUV");
        avulsa.setReparticaoFiscalEmitente("YQFmDI2HBjjfZpRjR2ghwmSo1oWk5QgUEYf2oG46uEHwY4zsXyH1ORSr8oq3");
        avulsa.setUf(DFUnidadeFederativa.SC);
        avulsa.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<DFNotaInfoAvulsa><CNPJ>12345678901234</CNPJ><xOrgao>qNre0x2eJthUYIoKBuBbbGSeA4R2wrDLxNwCuDFkYD54flBLbBBMakGDgQUV</xOrgao><matr>Nn5PPREBbkfmmk4lBFwgvkuKg8prnY5CPqHIzqGiD1lTnZJ37nAZ4NBc8XwM</matr><xAgente>lkLip3hIYSAIzH3Tf1LWQsaybqB76V66lMgWBcHVwcOKInuJ8mGUyY8DT4NL</xAgente><fone>81579357</fone><UF>RS</UF><nDAR>qqDt1f1ulcahrBnUH0otPFkjYqD2tH4ktYsR71WSYZLFW1zZObAqajHHkyxi</nDAR><dEmi>2014-01-13</dEmi><vDAR>999999999999.99</vDAR><repEmi>YQFmDI2HBjjfZpRjR2ghwmSo1oWk5QgUEYf2oG46uEHwY4zsXyH1ORSr8oq3</repEmi><dPag>2014-03-21</dPag></DFNotaInfoAvulsa>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoAvulsa().toString());
    }
}