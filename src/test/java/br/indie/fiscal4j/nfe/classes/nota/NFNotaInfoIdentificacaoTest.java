package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import br.indie.fiscal4j.common.DFAmbiente;
import br.indie.fiscal4j.common.DFModelo;
import br.indie.fiscal4j.common.DFUnidadeFederativa;
import br.indie.fiscal4j.nfe.classes.*;
import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NFNotaInfoIdentificacaoTest {

    @Test
    public void devePermitirReferenciadasComTamanhoInvalido() {
        final List<DFInfoReferenciada> referenciadas = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            referenciadas.add(new DFInfoReferenciada());
        }
        new DFNotaInfoIdentificacao().setReferenciadas(referenciadas);
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirReferenciadasComTamanhoInvalido() {
        final List<DFInfoReferenciada> referenciadas = new ArrayList<>();
        for (int i = 0; i < 501; i++) {
            referenciadas.add(new DFInfoReferenciada());
        }
        new DFNotaInfoIdentificacao().setReferenciadas(referenciadas);
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirVersaoEmissorComTamanhoInvalido() {
        try {
            new DFNotaInfoIdentificacao().setVersaoEmissor("");
        } catch (final IllegalStateException e) {
            new DFNotaInfoIdentificacao().setVersaoEmissor("532ng7VURPgovC5BYaZy1");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirJustificativaEntradaContingenciaComTamanhoInvalido() {
        try {
            new DFNotaInfoIdentificacao().setJustificativaEntradaContingencia("b1Aj7VBU5I0LDt");
        } catch (final IllegalStateException e) {
            new DFNotaInfoIdentificacao().setJustificativaEntradaContingencia("b1Aj7VBU5I0LDthlrWTk73otsFXSVbiNYyAgGZjLYT0pftpjhGzQEAtnolQoAEB3omnxNq8am4iMqwwviuaXRHjiYWY7YaPITlDN7cDN9obnhEqhDhkgKphRBY5frTfD6unwTB4w7j6hpY2zNNzWwbNJzPGgDmQ8WhBDnpq1fQOilrcDspY7SGkNDfjxpGTQyNSNsmF4B2uHHLhGhhxG2qVq2bFUvHFqSL8atQAuYpyn3wplW21v88N96PnF0MEV1");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirSerieComTamanhoInvalido() {
        new DFNotaInfoIdentificacao().setSerie("1000");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNumeroNotaComTamanhoInvalido() {
        new DFNotaInfoIdentificacao().setNumeroNota("1000000000");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNaturezaOperacaoComTamanhoInvalido() {
        try {
            new DFNotaInfoIdentificacao().setNaturezaOperacao("");
        } catch (final IllegalStateException e) {
            new DFNotaInfoIdentificacao().setNaturezaOperacao("qGYcW8I1iak14NF7vnfc8XpPYkrHWB5J7Vm3eOAe57azf1fVP7vEOY7TrRVQ1");
        }
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirDigitoVerificadorComTamanhoInvalido() {
        new DFNotaInfoIdentificacao().setDigitoVerificador(10);
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCodigoRandomicoComTamanhoInvalido() {
        try {
            new DFNotaInfoIdentificacao().setCodigoRandomico("9999999");
        } catch (final IllegalStateException e) {
            new DFNotaInfoIdentificacao().setCodigoRandomico("100000000");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCodigoMunicipioComTamanhoInvalido() {
        try {
            new DFNotaInfoIdentificacao().setCodigoMunicipio("qGYcW8");
        } catch (final IllegalStateException e) {
            new DFNotaInfoIdentificacao().setCodigoMunicipio("qGYcW8I1");
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirIndicadorPresencaCompradorNulo() {
        final DFNotaInfoIdentificacao identificacao = new DFNotaInfoIdentificacao();
        identificacao.setAmbiente(DFAmbiente.PRODUCAO);
        identificacao.setCodigoMunicipio("1612675");
        identificacao.setCodigoRandomico("99999999");
        identificacao.setDataHoraEmissao(new DateTime(2010, 10, 27, 10, 10, 10));
        identificacao.setDataHoraSaidaOuEntrada(new DateTime(2013, 9, 24, 10, 10, 10));
        identificacao.setDigitoVerificador(8);
        identificacao.setFinalidade(NFFinalidade.NORMAL);
        identificacao.setFormaPagamento(NFFormaPagamentoPrazo.A_PRAZO);
        identificacao.setModelo(DFModelo.NFE);
        identificacao.setNaturezaOperacao("qGYcW8I1iak14NF7vnfc8XpPYkrHWB5J7Vm3eOAe57azf1fVP7vEOY7TrRVQ");
        identificacao.setNumeroNota("999999999");
        identificacao.setProgramaEmissor(NFProcessoEmissor.CONTRIBUINTE);
        identificacao.setReferenciadas(Collections.singletonList(FabricaDeObjetosFake.getNFInfoReferenciada()));
        identificacao.setSerie("999");
        identificacao.setTipo(NFTipo.ENTRADA);
        identificacao.setTipoEmissao(NFTipoEmissao.EMISSAO_NORMAL);
        identificacao.setTipoImpressao(NFTipoImpressao.DANFE_NORMAL_PAISAGEM);
        identificacao.setUf(DFUnidadeFederativa.SC);
        identificacao.setVersaoEmissor("532ng7VURPgovC5BYaZy");
        identificacao.setDataHoraContigencia(new DateTime(2014, 10, 10, 10, 10, 10));
        identificacao.setJustificativaEntradaContingencia("b1Aj7VBU5I0LDthlrWTk73otsFXSVbiNYyAgGZjLYT0pftpjhGzQEAtnolQoAEB3omnxNq8am4iMqwwviuaXRHjiYWY7YaPITlDN7cDN9obnhEqhDhkgKphRBY5frTfD6unwTB4w7j6hpY2zNNzWwbNJzPGgDmQ8WhBDnpq1fQOilrcDspY7SGkNDfjxpGTQyNSNsmF4B2uHHLhGhhxG2qVq2bFUvHFqSL8atQAuYpyn3wplW21v88N96PnF0MEV");
        identificacao.setIdentificadorLocalDestinoOperacao(NFIdentificadorLocalDestinoOperacao.OPERACAO_INTERNA);
        identificacao.setOperacaoConsumidorFinal(NFOperacaoConsumidorFinal.SIM);
        identificacao.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirOperacaoConsumidorFinalNulo() {
        final DFNotaInfoIdentificacao identificacao = new DFNotaInfoIdentificacao();
        identificacao.setAmbiente(DFAmbiente.PRODUCAO);
        identificacao.setCodigoMunicipio("1612675");
        identificacao.setCodigoRandomico("99999999");
        identificacao.setDataHoraEmissao(new DateTime(2010, 10, 27, 10, 10, 10));
        identificacao.setDataHoraSaidaOuEntrada(new DateTime(2013, 9, 24, 10, 10, 10));
        identificacao.setDigitoVerificador(8);
        identificacao.setFinalidade(NFFinalidade.NORMAL);
        identificacao.setFormaPagamento(NFFormaPagamentoPrazo.A_PRAZO);
        identificacao.setModelo(DFModelo.NFE);
        identificacao.setNaturezaOperacao("qGYcW8I1iak14NF7vnfc8XpPYkrHWB5J7Vm3eOAe57azf1fVP7vEOY7TrRVQ");
        identificacao.setNumeroNota("999999999");
        identificacao.setProgramaEmissor(NFProcessoEmissor.CONTRIBUINTE);
        identificacao.setReferenciadas(Collections.singletonList(FabricaDeObjetosFake.getNFInfoReferenciada()));
        identificacao.setSerie("999");
        identificacao.setTipo(NFTipo.ENTRADA);
        identificacao.setTipoEmissao(NFTipoEmissao.EMISSAO_NORMAL);
        identificacao.setTipoImpressao(NFTipoImpressao.DANFE_NORMAL_PAISAGEM);
        identificacao.setUf(DFUnidadeFederativa.SC);
        identificacao.setVersaoEmissor("532ng7VURPgovC5BYaZy");
        identificacao.setDataHoraContigencia(new DateTime(2014, 10, 10, 10, 10, 10));
        identificacao.setJustificativaEntradaContingencia("b1Aj7VBU5I0LDthlrWTk73otsFXSVbiNYyAgGZjLYT0pftpjhGzQEAtnolQoAEB3omnxNq8am4iMqwwviuaXRHjiYWY7YaPITlDN7cDN9obnhEqhDhkgKphRBY5frTfD6unwTB4w7j6hpY2zNNzWwbNJzPGgDmQ8WhBDnpq1fQOilrcDspY7SGkNDfjxpGTQyNSNsmF4B2uHHLhGhhxG2qVq2bFUvHFqSL8atQAuYpyn3wplW21v88N96PnF0MEV");
        identificacao.setIdentificadorLocalDestinoOperacao(NFIdentificadorLocalDestinoOperacao.OPERACAO_INTERNA);
        identificacao.setIndicadorPresencaComprador(NFIndicadorPresencaComprador.NAO_APLICA);
        identificacao.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirIdentificadorLocalDestinoOperacaoNulo() {
        final DFNotaInfoIdentificacao identificacao = new DFNotaInfoIdentificacao();
        identificacao.setAmbiente(DFAmbiente.PRODUCAO);
        identificacao.setCodigoMunicipio("1612675");
        identificacao.setCodigoRandomico("99999999");
        identificacao.setDataHoraEmissao(new DateTime(2010, 10, 27, 10, 10, 10));
        identificacao.setDataHoraSaidaOuEntrada(new DateTime(2013, 9, 24, 10, 10, 10));
        identificacao.setDigitoVerificador(8);
        identificacao.setFinalidade(NFFinalidade.NORMAL);
        identificacao.setFormaPagamento(NFFormaPagamentoPrazo.A_PRAZO);
        identificacao.setModelo(DFModelo.NFE);
        identificacao.setNaturezaOperacao("qGYcW8I1iak14NF7vnfc8XpPYkrHWB5J7Vm3eOAe57azf1fVP7vEOY7TrRVQ");
        identificacao.setNumeroNota("999999999");
        identificacao.setProgramaEmissor(NFProcessoEmissor.CONTRIBUINTE);
        identificacao.setReferenciadas(Collections.singletonList(FabricaDeObjetosFake.getNFInfoReferenciada()));
        identificacao.setSerie("999");
        identificacao.setTipo(NFTipo.ENTRADA);
        identificacao.setTipoEmissao(NFTipoEmissao.EMISSAO_NORMAL);
        identificacao.setTipoImpressao(NFTipoImpressao.DANFE_NORMAL_PAISAGEM);
        identificacao.setUf(DFUnidadeFederativa.SC);
        identificacao.setVersaoEmissor("532ng7VURPgovC5BYaZy");
        identificacao.setDataHoraContigencia(new DateTime(2014, 10, 10, 10, 10, 10));
        identificacao.setJustificativaEntradaContingencia("b1Aj7VBU5I0LDthlrWTk73otsFXSVbiNYyAgGZjLYT0pftpjhGzQEAtnolQoAEB3omnxNq8am4iMqwwviuaXRHjiYWY7YaPITlDN7cDN9obnhEqhDhkgKphRBY5frTfD6unwTB4w7j6hpY2zNNzWwbNJzPGgDmQ8WhBDnpq1fQOilrcDspY7SGkNDfjxpGTQyNSNsmF4B2uHHLhGhhxG2qVq2bFUvHFqSL8atQAuYpyn3wplW21v88N96PnF0MEV");
        identificacao.setOperacaoConsumidorFinal(NFOperacaoConsumidorFinal.SIM);
        identificacao.setIndicadorPresencaComprador(NFIndicadorPresencaComprador.NAO_APLICA);
        identificacao.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirAmbienteNulo() {
        final DFNotaInfoIdentificacao identificacao = new DFNotaInfoIdentificacao();
        identificacao.setCodigoMunicipio("1612675");
        identificacao.setCodigoRandomico("99999999");
        identificacao.setDataHoraEmissao(new DateTime(2010, 10, 27, 10, 10, 10));
        identificacao.setDataHoraSaidaOuEntrada(new DateTime(2013, 9, 24, 10, 10, 10));
        identificacao.setDigitoVerificador(8);
        identificacao.setFinalidade(NFFinalidade.NORMAL);
        identificacao.setFormaPagamento(NFFormaPagamentoPrazo.A_PRAZO);
        identificacao.setModelo(DFModelo.NFE);
        identificacao.setNaturezaOperacao("qGYcW8I1iak14NF7vnfc8XpPYkrHWB5J7Vm3eOAe57azf1fVP7vEOY7TrRVQ");
        identificacao.setNumeroNota("999999999");
        identificacao.setProgramaEmissor(NFProcessoEmissor.CONTRIBUINTE);
        identificacao.setReferenciadas(Collections.singletonList(FabricaDeObjetosFake.getNFInfoReferenciada()));
        identificacao.setSerie("999");
        identificacao.setTipo(NFTipo.ENTRADA);
        identificacao.setTipoEmissao(NFTipoEmissao.EMISSAO_NORMAL);
        identificacao.setTipoImpressao(NFTipoImpressao.DANFE_NORMAL_PAISAGEM);
        identificacao.setUf(DFUnidadeFederativa.SC);
        identificacao.setVersaoEmissor("532ng7VURPgovC5BYaZy");
        identificacao.setDataHoraContigencia(new DateTime(2014, 10, 10, 10, 10, 10));
        identificacao.setJustificativaEntradaContingencia("b1Aj7VBU5I0LDthlrWTk73otsFXSVbiNYyAgGZjLYT0pftpjhGzQEAtnolQoAEB3omnxNq8am4iMqwwviuaXRHjiYWY7YaPITlDN7cDN9obnhEqhDhkgKphRBY5frTfD6unwTB4w7j6hpY2zNNzWwbNJzPGgDmQ8WhBDnpq1fQOilrcDspY7SGkNDfjxpGTQyNSNsmF4B2uHHLhGhhxG2qVq2bFUvHFqSL8atQAuYpyn3wplW21v88N96PnF0MEV");
        identificacao.setIdentificadorLocalDestinoOperacao(NFIdentificadorLocalDestinoOperacao.OPERACAO_INTERNA);
        identificacao.setOperacaoConsumidorFinal(NFOperacaoConsumidorFinal.SIM);
        identificacao.setIndicadorPresencaComprador(NFIndicadorPresencaComprador.NAO_APLICA);
        identificacao.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCodigoMunicipioNulo() {
        final DFNotaInfoIdentificacao identificacao = new DFNotaInfoIdentificacao();
        identificacao.setAmbiente(DFAmbiente.PRODUCAO);
        identificacao.setCodigoRandomico("99999999");
        identificacao.setDataHoraEmissao(new DateTime(2010, 10, 27, 10, 10, 10));
        identificacao.setDataHoraSaidaOuEntrada(new DateTime(2013, 9, 24, 10, 10, 10));
        identificacao.setDigitoVerificador(8);
        identificacao.setFinalidade(NFFinalidade.NORMAL);
        identificacao.setFormaPagamento(NFFormaPagamentoPrazo.A_PRAZO);
        identificacao.setModelo(DFModelo.NFE);
        identificacao.setNaturezaOperacao("qGYcW8I1iak14NF7vnfc8XpPYkrHWB5J7Vm3eOAe57azf1fVP7vEOY7TrRVQ");
        identificacao.setNumeroNota("999999999");
        identificacao.setProgramaEmissor(NFProcessoEmissor.CONTRIBUINTE);
        identificacao.setReferenciadas(Collections.singletonList(FabricaDeObjetosFake.getNFInfoReferenciada()));
        identificacao.setSerie("999");
        identificacao.setTipo(NFTipo.ENTRADA);
        identificacao.setTipoEmissao(NFTipoEmissao.EMISSAO_NORMAL);
        identificacao.setTipoImpressao(NFTipoImpressao.DANFE_NORMAL_PAISAGEM);
        identificacao.setUf(DFUnidadeFederativa.SC);
        identificacao.setVersaoEmissor("532ng7VURPgovC5BYaZy");
        identificacao.setDataHoraContigencia(new DateTime(2014, 10, 10, 10, 10, 10));
        identificacao.setJustificativaEntradaContingencia("b1Aj7VBU5I0LDthlrWTk73otsFXSVbiNYyAgGZjLYT0pftpjhGzQEAtnolQoAEB3omnxNq8am4iMqwwviuaXRHjiYWY7YaPITlDN7cDN9obnhEqhDhkgKphRBY5frTfD6unwTB4w7j6hpY2zNNzWwbNJzPGgDmQ8WhBDnpq1fQOilrcDspY7SGkNDfjxpGTQyNSNsmF4B2uHHLhGhhxG2qVq2bFUvHFqSL8atQAuYpyn3wplW21v88N96PnF0MEV");
        identificacao.setIdentificadorLocalDestinoOperacao(NFIdentificadorLocalDestinoOperacao.OPERACAO_INTERNA);
        identificacao.setOperacaoConsumidorFinal(NFOperacaoConsumidorFinal.SIM);
        identificacao.setIndicadorPresencaComprador(NFIndicadorPresencaComprador.NAO_APLICA);
        identificacao.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCodigoRandomicoNulo() {
        final DFNotaInfoIdentificacao identificacao = new DFNotaInfoIdentificacao();
        identificacao.setAmbiente(DFAmbiente.PRODUCAO);
        identificacao.setCodigoMunicipio("1612675");
        identificacao.setDataHoraEmissao(new DateTime(2010, 10, 27, 10, 10, 10));
        identificacao.setDataHoraSaidaOuEntrada(new DateTime(2013, 9, 24, 10, 10, 10));
        identificacao.setDigitoVerificador(8);
        identificacao.setFinalidade(NFFinalidade.NORMAL);
        identificacao.setFormaPagamento(NFFormaPagamentoPrazo.A_PRAZO);
        identificacao.setModelo(DFModelo.NFE);
        identificacao.setNaturezaOperacao("qGYcW8I1iak14NF7vnfc8XpPYkrHWB5J7Vm3eOAe57azf1fVP7vEOY7TrRVQ");
        identificacao.setNumeroNota("999999999");
        identificacao.setProgramaEmissor(NFProcessoEmissor.CONTRIBUINTE);
        identificacao.setReferenciadas(Collections.singletonList(FabricaDeObjetosFake.getNFInfoReferenciada()));
        identificacao.setSerie("999");
        identificacao.setTipo(NFTipo.ENTRADA);
        identificacao.setTipoEmissao(NFTipoEmissao.EMISSAO_NORMAL);
        identificacao.setTipoImpressao(NFTipoImpressao.DANFE_NORMAL_PAISAGEM);
        identificacao.setUf(DFUnidadeFederativa.SC);
        identificacao.setVersaoEmissor("532ng7VURPgovC5BYaZy");
        identificacao.setDataHoraContigencia(new DateTime(2014, 10, 10, 10, 10, 10));
        identificacao.setJustificativaEntradaContingencia("b1Aj7VBU5I0LDthlrWTk73otsFXSVbiNYyAgGZjLYT0pftpjhGzQEAtnolQoAEB3omnxNq8am4iMqwwviuaXRHjiYWY7YaPITlDN7cDN9obnhEqhDhkgKphRBY5frTfD6unwTB4w7j6hpY2zNNzWwbNJzPGgDmQ8WhBDnpq1fQOilrcDspY7SGkNDfjxpGTQyNSNsmF4B2uHHLhGhhxG2qVq2bFUvHFqSL8atQAuYpyn3wplW21v88N96PnF0MEV");
        identificacao.setIdentificadorLocalDestinoOperacao(NFIdentificadorLocalDestinoOperacao.OPERACAO_INTERNA);
        identificacao.setOperacaoConsumidorFinal(NFOperacaoConsumidorFinal.SIM);
        identificacao.setIndicadorPresencaComprador(NFIndicadorPresencaComprador.NAO_APLICA);
        identificacao.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirDataEmissaoNulo() {
        final DFNotaInfoIdentificacao identificacao = new DFNotaInfoIdentificacao();
        identificacao.setAmbiente(DFAmbiente.PRODUCAO);
        identificacao.setCodigoMunicipio("1612675");
        identificacao.setCodigoRandomico("99999999");
        identificacao.setDataHoraSaidaOuEntrada(new DateTime(2013, 9, 24, 10, 10, 10));
        identificacao.setDigitoVerificador(8);
        identificacao.setFinalidade(NFFinalidade.NORMAL);
        identificacao.setFormaPagamento(NFFormaPagamentoPrazo.A_PRAZO);
        identificacao.setModelo(DFModelo.NFE);
        identificacao.setNaturezaOperacao("qGYcW8I1iak14NF7vnfc8XpPYkrHWB5J7Vm3eOAe57azf1fVP7vEOY7TrRVQ");
        identificacao.setNumeroNota("999999999");
        identificacao.setProgramaEmissor(NFProcessoEmissor.CONTRIBUINTE);
        identificacao.setReferenciadas(Collections.singletonList(FabricaDeObjetosFake.getNFInfoReferenciada()));
        identificacao.setSerie("999");
        identificacao.setTipo(NFTipo.ENTRADA);
        identificacao.setTipoEmissao(NFTipoEmissao.EMISSAO_NORMAL);
        identificacao.setTipoImpressao(NFTipoImpressao.DANFE_NORMAL_PAISAGEM);
        identificacao.setUf(DFUnidadeFederativa.SC);
        identificacao.setVersaoEmissor("532ng7VURPgovC5BYaZy");
        identificacao.setDataHoraContigencia(new DateTime(2014, 10, 10, 10, 10, 10));
        identificacao.setJustificativaEntradaContingencia("b1Aj7VBU5I0LDthlrWTk73otsFXSVbiNYyAgGZjLYT0pftpjhGzQEAtnolQoAEB3omnxNq8am4iMqwwviuaXRHjiYWY7YaPITlDN7cDN9obnhEqhDhkgKphRBY5frTfD6unwTB4w7j6hpY2zNNzWwbNJzPGgDmQ8WhBDnpq1fQOilrcDspY7SGkNDfjxpGTQyNSNsmF4B2uHHLhGhhxG2qVq2bFUvHFqSL8atQAuYpyn3wplW21v88N96PnF0MEV");
        identificacao.setIdentificadorLocalDestinoOperacao(NFIdentificadorLocalDestinoOperacao.OPERACAO_INTERNA);
        identificacao.setOperacaoConsumidorFinal(NFOperacaoConsumidorFinal.SIM);
        identificacao.setIndicadorPresencaComprador(NFIndicadorPresencaComprador.NAO_APLICA);
        identificacao.toString();
    }

    @Test
    public void devePermitirDataSaidaNulo() {
        final DFNotaInfoIdentificacao identificacao = new DFNotaInfoIdentificacao();
        identificacao.setAmbiente(DFAmbiente.PRODUCAO);
        identificacao.setCodigoMunicipio("1612675");
        identificacao.setCodigoRandomico("99999999");
        identificacao.setDataHoraEmissao(new DateTime(2010, 10, 27, 10, 10, 10));
        identificacao.setDigitoVerificador(8);
        identificacao.setFinalidade(NFFinalidade.NORMAL);
        identificacao.setFormaPagamento(NFFormaPagamentoPrazo.A_PRAZO);
        identificacao.setModelo(DFModelo.NFE);
        identificacao.setNaturezaOperacao("qGYcW8I1iak14NF7vnfc8XpPYkrHWB5J7Vm3eOAe57azf1fVP7vEOY7TrRVQ");
        identificacao.setNumeroNota("999999999");
        identificacao.setProgramaEmissor(NFProcessoEmissor.CONTRIBUINTE);
        identificacao.setReferenciadas(Collections.singletonList(FabricaDeObjetosFake.getNFInfoReferenciada()));
        identificacao.setSerie("999");
        identificacao.setTipo(NFTipo.ENTRADA);
        identificacao.setTipoEmissao(NFTipoEmissao.EMISSAO_NORMAL);
        identificacao.setTipoImpressao(NFTipoImpressao.DANFE_NORMAL_PAISAGEM);
        identificacao.setUf(DFUnidadeFederativa.SC);
        identificacao.setVersaoEmissor("532ng7VURPgovC5BYaZy");
        identificacao.setDataHoraContigencia(new DateTime(2014, 10, 10, 10, 10, 10));
        identificacao.setJustificativaEntradaContingencia("b1Aj7VBU5I0LDthlrWTk73otsFXSVbiNYyAgGZjLYT0pftpjhGzQEAtnolQoAEB3omnxNq8am4iMqwwviuaXRHjiYWY7YaPITlDN7cDN9obnhEqhDhkgKphRBY5frTfD6unwTB4w7j6hpY2zNNzWwbNJzPGgDmQ8WhBDnpq1fQOilrcDspY7SGkNDfjxpGTQyNSNsmF4B2uHHLhGhhxG2qVq2bFUvHFqSL8atQAuYpyn3wplW21v88N96PnF0MEV");
        identificacao.setIdentificadorLocalDestinoOperacao(NFIdentificadorLocalDestinoOperacao.OPERACAO_INTERNA);
        identificacao.setOperacaoConsumidorFinal(NFOperacaoConsumidorFinal.SIM);
        identificacao.setIndicadorPresencaComprador(NFIndicadorPresencaComprador.NAO_APLICA);
        identificacao.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirDigitoVerificadorNulo() {
        final DFNotaInfoIdentificacao identificacao = new DFNotaInfoIdentificacao();
        identificacao.setAmbiente(DFAmbiente.PRODUCAO);
        identificacao.setCodigoMunicipio("1612675");
        identificacao.setCodigoRandomico("99999999");
        identificacao.setDataHoraEmissao(new DateTime(2010, 10, 27, 10, 10, 10));
        identificacao.setDataHoraSaidaOuEntrada(new DateTime(2013, 9, 24, 10, 10, 10));
        identificacao.setFinalidade(NFFinalidade.NORMAL);
        identificacao.setFormaPagamento(NFFormaPagamentoPrazo.A_PRAZO);
        identificacao.setModelo(DFModelo.NFE);
        identificacao.setNaturezaOperacao("qGYcW8I1iak14NF7vnfc8XpPYkrHWB5J7Vm3eOAe57azf1fVP7vEOY7TrRVQ");
        identificacao.setNumeroNota("999999999");
        identificacao.setProgramaEmissor(NFProcessoEmissor.CONTRIBUINTE);
        identificacao.setReferenciadas(Collections.singletonList(FabricaDeObjetosFake.getNFInfoReferenciada()));
        identificacao.setSerie("999");
        identificacao.setTipo(NFTipo.ENTRADA);
        identificacao.setTipoEmissao(NFTipoEmissao.EMISSAO_NORMAL);
        identificacao.setTipoImpressao(NFTipoImpressao.DANFE_NORMAL_PAISAGEM);
        identificacao.setUf(DFUnidadeFederativa.SC);
        identificacao.setVersaoEmissor("532ng7VURPgovC5BYaZy");
        identificacao.setDataHoraContigencia(new DateTime(2014, 10, 10, 10, 10, 10));
        identificacao.setJustificativaEntradaContingencia("b1Aj7VBU5I0LDthlrWTk73otsFXSVbiNYyAgGZjLYT0pftpjhGzQEAtnolQoAEB3omnxNq8am4iMqwwviuaXRHjiYWY7YaPITlDN7cDN9obnhEqhDhkgKphRBY5frTfD6unwTB4w7j6hpY2zNNzWwbNJzPGgDmQ8WhBDnpq1fQOilrcDspY7SGkNDfjxpGTQyNSNsmF4B2uHHLhGhhxG2qVq2bFUvHFqSL8atQAuYpyn3wplW21v88N96PnF0MEV");
        identificacao.setIdentificadorLocalDestinoOperacao(NFIdentificadorLocalDestinoOperacao.OPERACAO_INTERNA);
        identificacao.setOperacaoConsumidorFinal(NFOperacaoConsumidorFinal.SIM);
        identificacao.setIndicadorPresencaComprador(NFIndicadorPresencaComprador.NAO_APLICA);
        identificacao.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirFinalidadeNulo() {
        final DFNotaInfoIdentificacao identificacao = new DFNotaInfoIdentificacao();
        identificacao.setAmbiente(DFAmbiente.PRODUCAO);
        identificacao.setCodigoMunicipio("1612675");
        identificacao.setCodigoRandomico("99999999");
        identificacao.setDataHoraEmissao(new DateTime(2010, 10, 27, 10, 10, 10));
        identificacao.setDataHoraSaidaOuEntrada(new DateTime(2013, 9, 24, 10, 10, 10));
        identificacao.setDigitoVerificador(8);
        identificacao.setFormaPagamento(NFFormaPagamentoPrazo.A_PRAZO);
        identificacao.setModelo(DFModelo.NFE);
        identificacao.setNaturezaOperacao("qGYcW8I1iak14NF7vnfc8XpPYkrHWB5J7Vm3eOAe57azf1fVP7vEOY7TrRVQ");
        identificacao.setNumeroNota("999999999");
        identificacao.setProgramaEmissor(NFProcessoEmissor.CONTRIBUINTE);
        identificacao.setReferenciadas(Collections.singletonList(FabricaDeObjetosFake.getNFInfoReferenciada()));
        identificacao.setSerie("999");
        identificacao.setTipo(NFTipo.ENTRADA);
        identificacao.setTipoEmissao(NFTipoEmissao.EMISSAO_NORMAL);
        identificacao.setTipoImpressao(NFTipoImpressao.DANFE_NORMAL_PAISAGEM);
        identificacao.setUf(DFUnidadeFederativa.SC);
        identificacao.setVersaoEmissor("532ng7VURPgovC5BYaZy");
        identificacao.setDataHoraContigencia(new DateTime(2014, 10, 10, 10, 10, 10));
        identificacao.setJustificativaEntradaContingencia("b1Aj7VBU5I0LDthlrWTk73otsFXSVbiNYyAgGZjLYT0pftpjhGzQEAtnolQoAEB3omnxNq8am4iMqwwviuaXRHjiYWY7YaPITlDN7cDN9obnhEqhDhkgKphRBY5frTfD6unwTB4w7j6hpY2zNNzWwbNJzPGgDmQ8WhBDnpq1fQOilrcDspY7SGkNDfjxpGTQyNSNsmF4B2uHHLhGhhxG2qVq2bFUvHFqSL8atQAuYpyn3wplW21v88N96PnF0MEV");
        identificacao.setIdentificadorLocalDestinoOperacao(NFIdentificadorLocalDestinoOperacao.OPERACAO_INTERNA);
        identificacao.setOperacaoConsumidorFinal(NFOperacaoConsumidorFinal.SIM);
        identificacao.setIndicadorPresencaComprador(NFIndicadorPresencaComprador.NAO_APLICA);
        identificacao.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirFormaPagamentoNulo() {
        final DFNotaInfoIdentificacao identificacao = new DFNotaInfoIdentificacao();
        identificacao.setAmbiente(DFAmbiente.PRODUCAO);
        identificacao.setCodigoMunicipio("1612675");
        identificacao.setCodigoRandomico("99999999");
        identificacao.setDataHoraEmissao(new DateTime(2010, 10, 27, 10, 10, 10));
        identificacao.setDataHoraSaidaOuEntrada(new DateTime(2013, 9, 24, 10, 10, 10));
        identificacao.setDigitoVerificador(8);
        identificacao.setFinalidade(NFFinalidade.NORMAL);
        identificacao.setModelo(DFModelo.NFE);
        identificacao.setNaturezaOperacao("qGYcW8I1iak14NF7vnfc8XpPYkrHWB5J7Vm3eOAe57azf1fVP7vEOY7TrRVQ");
        identificacao.setNumeroNota("999999999");
        identificacao.setProgramaEmissor(NFProcessoEmissor.CONTRIBUINTE);
        identificacao.setReferenciadas(Collections.singletonList(FabricaDeObjetosFake.getNFInfoReferenciada()));
        identificacao.setSerie("999");
        identificacao.setTipo(NFTipo.ENTRADA);
        identificacao.setTipoEmissao(NFTipoEmissao.EMISSAO_NORMAL);
        identificacao.setTipoImpressao(NFTipoImpressao.DANFE_NORMAL_PAISAGEM);
        identificacao.setUf(DFUnidadeFederativa.SC);
        identificacao.setVersaoEmissor("532ng7VURPgovC5BYaZy");
        identificacao.setDataHoraContigencia(new DateTime(2014, 10, 10, 10, 10, 10));
        identificacao.setJustificativaEntradaContingencia("b1Aj7VBU5I0LDthlrWTk73otsFXSVbiNYyAgGZjLYT0pftpjhGzQEAtnolQoAEB3omnxNq8am4iMqwwviuaXRHjiYWY7YaPITlDN7cDN9obnhEqhDhkgKphRBY5frTfD6unwTB4w7j6hpY2zNNzWwbNJzPGgDmQ8WhBDnpq1fQOilrcDspY7SGkNDfjxpGTQyNSNsmF4B2uHHLhGhhxG2qVq2bFUvHFqSL8atQAuYpyn3wplW21v88N96PnF0MEV");
        identificacao.setIdentificadorLocalDestinoOperacao(NFIdentificadorLocalDestinoOperacao.OPERACAO_INTERNA);
        identificacao.setOperacaoConsumidorFinal(NFOperacaoConsumidorFinal.SIM);
        identificacao.setIndicadorPresencaComprador(NFIndicadorPresencaComprador.NAO_APLICA);
        identificacao.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirModeloNulo() {
        final DFNotaInfoIdentificacao identificacao = new DFNotaInfoIdentificacao();
        identificacao.setAmbiente(DFAmbiente.PRODUCAO);
        identificacao.setCodigoMunicipio("1612675");
        identificacao.setCodigoRandomico("99999999");
        identificacao.setDataHoraEmissao(new DateTime(2010, 10, 27, 10, 10, 10));
        identificacao.setDataHoraSaidaOuEntrada(new DateTime(2013, 9, 24, 10, 10, 10));
        identificacao.setDigitoVerificador(8);
        identificacao.setFinalidade(NFFinalidade.NORMAL);
        identificacao.setFormaPagamento(NFFormaPagamentoPrazo.A_PRAZO);
        identificacao.setNaturezaOperacao("qGYcW8I1iak14NF7vnfc8XpPYkrHWB5J7Vm3eOAe57azf1fVP7vEOY7TrRVQ");
        identificacao.setNumeroNota("999999999");
        identificacao.setProgramaEmissor(NFProcessoEmissor.CONTRIBUINTE);
        identificacao.setReferenciadas(Collections.singletonList(FabricaDeObjetosFake.getNFInfoReferenciada()));
        identificacao.setSerie("999");
        identificacao.setTipo(NFTipo.ENTRADA);
        identificacao.setTipoEmissao(NFTipoEmissao.EMISSAO_NORMAL);
        identificacao.setTipoImpressao(NFTipoImpressao.DANFE_NORMAL_PAISAGEM);
        identificacao.setUf(DFUnidadeFederativa.SC);
        identificacao.setVersaoEmissor("532ng7VURPgovC5BYaZy");
        identificacao.setDataHoraContigencia(new DateTime(2014, 10, 10, 10, 10, 10));
        identificacao.setJustificativaEntradaContingencia("b1Aj7VBU5I0LDthlrWTk73otsFXSVbiNYyAgGZjLYT0pftpjhGzQEAtnolQoAEB3omnxNq8am4iMqwwviuaXRHjiYWY7YaPITlDN7cDN9obnhEqhDhkgKphRBY5frTfD6unwTB4w7j6hpY2zNNzWwbNJzPGgDmQ8WhBDnpq1fQOilrcDspY7SGkNDfjxpGTQyNSNsmF4B2uHHLhGhhxG2qVq2bFUvHFqSL8atQAuYpyn3wplW21v88N96PnF0MEV");
        identificacao.setIdentificadorLocalDestinoOperacao(NFIdentificadorLocalDestinoOperacao.OPERACAO_INTERNA);
        identificacao.setOperacaoConsumidorFinal(NFOperacaoConsumidorFinal.SIM);
        identificacao.setIndicadorPresencaComprador(NFIndicadorPresencaComprador.NAO_APLICA);
        identificacao.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNaturezaOperacaoNulo() {
        final DFNotaInfoIdentificacao identificacao = new DFNotaInfoIdentificacao();
        identificacao.setAmbiente(DFAmbiente.PRODUCAO);
        identificacao.setCodigoMunicipio("1612675");
        identificacao.setCodigoRandomico("99999999");
        identificacao.setDataHoraEmissao(new DateTime(2010, 10, 27, 10, 10, 10));
        identificacao.setDataHoraSaidaOuEntrada(new DateTime(2013, 9, 24, 10, 10, 10));
        identificacao.setDigitoVerificador(8);
        identificacao.setFinalidade(NFFinalidade.NORMAL);
        identificacao.setFormaPagamento(NFFormaPagamentoPrazo.A_PRAZO);
        identificacao.setModelo(DFModelo.NFE);
        identificacao.setNumeroNota("999999999");
        identificacao.setProgramaEmissor(NFProcessoEmissor.CONTRIBUINTE);
        identificacao.setReferenciadas(Collections.singletonList(FabricaDeObjetosFake.getNFInfoReferenciada()));
        identificacao.setSerie("999");
        identificacao.setTipo(NFTipo.ENTRADA);
        identificacao.setTipoEmissao(NFTipoEmissao.EMISSAO_NORMAL);
        identificacao.setTipoImpressao(NFTipoImpressao.DANFE_NORMAL_PAISAGEM);
        identificacao.setUf(DFUnidadeFederativa.SC);
        identificacao.setVersaoEmissor("532ng7VURPgovC5BYaZy");
        identificacao.setDataHoraContigencia(new DateTime(2014, 10, 10, 10, 10, 10));
        identificacao.setJustificativaEntradaContingencia("b1Aj7VBU5I0LDthlrWTk73otsFXSVbiNYyAgGZjLYT0pftpjhGzQEAtnolQoAEB3omnxNq8am4iMqwwviuaXRHjiYWY7YaPITlDN7cDN9obnhEqhDhkgKphRBY5frTfD6unwTB4w7j6hpY2zNNzWwbNJzPGgDmQ8WhBDnpq1fQOilrcDspY7SGkNDfjxpGTQyNSNsmF4B2uHHLhGhhxG2qVq2bFUvHFqSL8atQAuYpyn3wplW21v88N96PnF0MEV");
        identificacao.setIdentificadorLocalDestinoOperacao(NFIdentificadorLocalDestinoOperacao.OPERACAO_INTERNA);
        identificacao.setOperacaoConsumidorFinal(NFOperacaoConsumidorFinal.SIM);
        identificacao.setIndicadorPresencaComprador(NFIndicadorPresencaComprador.NAO_APLICA);
        identificacao.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNumeroNotaNulo() {
        final DFNotaInfoIdentificacao identificacao = new DFNotaInfoIdentificacao();
        identificacao.setAmbiente(DFAmbiente.PRODUCAO);
        identificacao.setCodigoMunicipio("1612675");
        identificacao.setCodigoRandomico("99999999");
        identificacao.setDataHoraEmissao(new DateTime(2010, 10, 27, 10, 10, 10));
        identificacao.setDataHoraSaidaOuEntrada(new DateTime(2013, 9, 24, 10, 10, 10));
        identificacao.setDigitoVerificador(8);
        identificacao.setFinalidade(NFFinalidade.NORMAL);
        identificacao.setFormaPagamento(NFFormaPagamentoPrazo.A_PRAZO);
        identificacao.setModelo(DFModelo.NFE);
        identificacao.setNaturezaOperacao("qGYcW8I1iak14NF7vnfc8XpPYkrHWB5J7Vm3eOAe57azf1fVP7vEOY7TrRVQ");
        identificacao.setProgramaEmissor(NFProcessoEmissor.CONTRIBUINTE);
        identificacao.setReferenciadas(Collections.singletonList(FabricaDeObjetosFake.getNFInfoReferenciada()));
        identificacao.setSerie("999");
        identificacao.setTipo(NFTipo.ENTRADA);
        identificacao.setTipoEmissao(NFTipoEmissao.EMISSAO_NORMAL);
        identificacao.setTipoImpressao(NFTipoImpressao.DANFE_NORMAL_PAISAGEM);
        identificacao.setUf(DFUnidadeFederativa.SC);
        identificacao.setVersaoEmissor("532ng7VURPgovC5BYaZy");
        identificacao.setDataHoraContigencia(new DateTime(2014, 10, 10, 10, 10, 10));
        identificacao.setJustificativaEntradaContingencia("b1Aj7VBU5I0LDthlrWTk73otsFXSVbiNYyAgGZjLYT0pftpjhGzQEAtnolQoAEB3omnxNq8am4iMqwwviuaXRHjiYWY7YaPITlDN7cDN9obnhEqhDhkgKphRBY5frTfD6unwTB4w7j6hpY2zNNzWwbNJzPGgDmQ8WhBDnpq1fQOilrcDspY7SGkNDfjxpGTQyNSNsmF4B2uHHLhGhhxG2qVq2bFUvHFqSL8atQAuYpyn3wplW21v88N96PnF0MEV");
        identificacao.setIdentificadorLocalDestinoOperacao(NFIdentificadorLocalDestinoOperacao.OPERACAO_INTERNA);
        identificacao.setOperacaoConsumidorFinal(NFOperacaoConsumidorFinal.SIM);
        identificacao.setIndicadorPresencaComprador(NFIndicadorPresencaComprador.NAO_APLICA);
        identificacao.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirProgramaEmissorNulo() {
        final DFNotaInfoIdentificacao identificacao = new DFNotaInfoIdentificacao();
        identificacao.setAmbiente(DFAmbiente.PRODUCAO);
        identificacao.setCodigoMunicipio("1612675");
        identificacao.setCodigoRandomico("99999999");
        identificacao.setDataHoraEmissao(new DateTime(2010, 10, 27, 10, 10, 10));
        identificacao.setDataHoraSaidaOuEntrada(new DateTime(2013, 9, 24, 10, 10, 10));
        identificacao.setDigitoVerificador(8);
        identificacao.setFinalidade(NFFinalidade.NORMAL);
        identificacao.setFormaPagamento(NFFormaPagamentoPrazo.A_PRAZO);
        identificacao.setModelo(DFModelo.NFE);
        identificacao.setNaturezaOperacao("qGYcW8I1iak14NF7vnfc8XpPYkrHWB5J7Vm3eOAe57azf1fVP7vEOY7TrRVQ");
        identificacao.setNumeroNota("999999999");
        identificacao.setReferenciadas(Collections.singletonList(FabricaDeObjetosFake.getNFInfoReferenciada()));
        identificacao.setSerie("999");
        identificacao.setTipo(NFTipo.ENTRADA);
        identificacao.setTipoEmissao(NFTipoEmissao.EMISSAO_NORMAL);
        identificacao.setTipoImpressao(NFTipoImpressao.DANFE_NORMAL_PAISAGEM);
        identificacao.setUf(DFUnidadeFederativa.SC);
        identificacao.setVersaoEmissor("532ng7VURPgovC5BYaZy");
        identificacao.setDataHoraContigencia(new DateTime(2014, 10, 10, 10, 10, 10));
        identificacao.setJustificativaEntradaContingencia("b1Aj7VBU5I0LDthlrWTk73otsFXSVbiNYyAgGZjLYT0pftpjhGzQEAtnolQoAEB3omnxNq8am4iMqwwviuaXRHjiYWY7YaPITlDN7cDN9obnhEqhDhkgKphRBY5frTfD6unwTB4w7j6hpY2zNNzWwbNJzPGgDmQ8WhBDnpq1fQOilrcDspY7SGkNDfjxpGTQyNSNsmF4B2uHHLhGhhxG2qVq2bFUvHFqSL8atQAuYpyn3wplW21v88N96PnF0MEV");
        identificacao.setIdentificadorLocalDestinoOperacao(NFIdentificadorLocalDestinoOperacao.OPERACAO_INTERNA);
        identificacao.setOperacaoConsumidorFinal(NFOperacaoConsumidorFinal.SIM);
        identificacao.setIndicadorPresencaComprador(NFIndicadorPresencaComprador.NAO_APLICA);
        identificacao.toString();
    }

    @Test
    public void devePermitirReferenciadasNulo() {
        final DFNotaInfoIdentificacao identificacao = new DFNotaInfoIdentificacao();
        identificacao.setAmbiente(DFAmbiente.PRODUCAO);
        identificacao.setCodigoMunicipio("1612675");
        identificacao.setCodigoRandomico("99999999");
        identificacao.setDataHoraEmissao(new DateTime(2010, 10, 27, 10, 10, 10));
        identificacao.setDataHoraSaidaOuEntrada(new DateTime(2013, 9, 24, 10, 10, 10));
        identificacao.setDigitoVerificador(8);
        identificacao.setFinalidade(NFFinalidade.NORMAL);
        identificacao.setFormaPagamento(NFFormaPagamentoPrazo.A_PRAZO);
        identificacao.setModelo(DFModelo.NFE);
        identificacao.setNaturezaOperacao("qGYcW8I1iak14NF7vnfc8XpPYkrHWB5J7Vm3eOAe57azf1fVP7vEOY7TrRVQ");
        identificacao.setNumeroNota("999999999");
        identificacao.setProgramaEmissor(NFProcessoEmissor.CONTRIBUINTE);
        identificacao.setSerie("999");
        identificacao.setTipo(NFTipo.ENTRADA);
        identificacao.setTipoEmissao(NFTipoEmissao.EMISSAO_NORMAL);
        identificacao.setTipoImpressao(NFTipoImpressao.DANFE_NORMAL_PAISAGEM);
        identificacao.setUf(DFUnidadeFederativa.SC);
        identificacao.setVersaoEmissor("532ng7VURPgovC5BYaZy");
        identificacao.setDataHoraContigencia(new DateTime(2014, 10, 10, 10, 10, 10));
        identificacao.setJustificativaEntradaContingencia("b1Aj7VBU5I0LDthlrWTk73otsFXSVbiNYyAgGZjLYT0pftpjhGzQEAtnolQoAEB3omnxNq8am4iMqwwviuaXRHjiYWY7YaPITlDN7cDN9obnhEqhDhkgKphRBY5frTfD6unwTB4w7j6hpY2zNNzWwbNJzPGgDmQ8WhBDnpq1fQOilrcDspY7SGkNDfjxpGTQyNSNsmF4B2uHHLhGhhxG2qVq2bFUvHFqSL8atQAuYpyn3wplW21v88N96PnF0MEV");
        identificacao.setIdentificadorLocalDestinoOperacao(NFIdentificadorLocalDestinoOperacao.OPERACAO_INTERNA);
        identificacao.setOperacaoConsumidorFinal(NFOperacaoConsumidorFinal.SIM);
        identificacao.setIndicadorPresencaComprador(NFIndicadorPresencaComprador.NAO_APLICA);
        identificacao.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirSerieNulo() {
        final DFNotaInfoIdentificacao identificacao = new DFNotaInfoIdentificacao();
        identificacao.setAmbiente(DFAmbiente.PRODUCAO);
        identificacao.setCodigoMunicipio("1612675");
        identificacao.setCodigoRandomico("99999999");
        identificacao.setDataHoraEmissao(new DateTime(2010, 10, 27, 10, 10, 10));
        identificacao.setDataHoraSaidaOuEntrada(new DateTime(2013, 9, 24, 10, 10, 10));
        identificacao.setDigitoVerificador(8);
        identificacao.setFinalidade(NFFinalidade.NORMAL);
        identificacao.setFormaPagamento(NFFormaPagamentoPrazo.A_PRAZO);
        identificacao.setModelo(DFModelo.NFE);
        identificacao.setNaturezaOperacao("qGYcW8I1iak14NF7vnfc8XpPYkrHWB5J7Vm3eOAe57azf1fVP7vEOY7TrRVQ");
        identificacao.setNumeroNota("999999999");
        identificacao.setProgramaEmissor(NFProcessoEmissor.CONTRIBUINTE);
        identificacao.setReferenciadas(Collections.singletonList(FabricaDeObjetosFake.getNFInfoReferenciada()));
        identificacao.setTipo(NFTipo.ENTRADA);
        identificacao.setTipoEmissao(NFTipoEmissao.EMISSAO_NORMAL);
        identificacao.setTipoImpressao(NFTipoImpressao.DANFE_NORMAL_PAISAGEM);
        identificacao.setUf(DFUnidadeFederativa.SC);
        identificacao.setVersaoEmissor("532ng7VURPgovC5BYaZy");
        identificacao.setDataHoraContigencia(new DateTime(2014, 10, 10, 10, 10, 10));
        identificacao.setJustificativaEntradaContingencia("b1Aj7VBU5I0LDthlrWTk73otsFXSVbiNYyAgGZjLYT0pftpjhGzQEAtnolQoAEB3omnxNq8am4iMqwwviuaXRHjiYWY7YaPITlDN7cDN9obnhEqhDhkgKphRBY5frTfD6unwTB4w7j6hpY2zNNzWwbNJzPGgDmQ8WhBDnpq1fQOilrcDspY7SGkNDfjxpGTQyNSNsmF4B2uHHLhGhhxG2qVq2bFUvHFqSL8atQAuYpyn3wplW21v88N96PnF0MEV");
        identificacao.setIdentificadorLocalDestinoOperacao(NFIdentificadorLocalDestinoOperacao.OPERACAO_INTERNA);
        identificacao.setOperacaoConsumidorFinal(NFOperacaoConsumidorFinal.SIM);
        identificacao.setIndicadorPresencaComprador(NFIndicadorPresencaComprador.NAO_APLICA);
        identificacao.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirTipoNulo() {
        final DFNotaInfoIdentificacao identificacao = new DFNotaInfoIdentificacao();
        identificacao.setAmbiente(DFAmbiente.PRODUCAO);
        identificacao.setCodigoMunicipio("1612675");
        identificacao.setCodigoRandomico("99999999");
        identificacao.setDataHoraEmissao(new DateTime(2010, 10, 27, 10, 10, 10));
        identificacao.setDataHoraSaidaOuEntrada(new DateTime(2013, 9, 24, 10, 10, 10));
        identificacao.setDigitoVerificador(8);
        identificacao.setFinalidade(NFFinalidade.NORMAL);
        identificacao.setFormaPagamento(NFFormaPagamentoPrazo.A_PRAZO);
        identificacao.setModelo(DFModelo.NFE);
        identificacao.setNaturezaOperacao("qGYcW8I1iak14NF7vnfc8XpPYkrHWB5J7Vm3eOAe57azf1fVP7vEOY7TrRVQ");
        identificacao.setNumeroNota("999999999");
        identificacao.setProgramaEmissor(NFProcessoEmissor.CONTRIBUINTE);
        identificacao.setReferenciadas(Collections.singletonList(FabricaDeObjetosFake.getNFInfoReferenciada()));
        identificacao.setSerie("999");
        identificacao.setTipoEmissao(NFTipoEmissao.EMISSAO_NORMAL);
        identificacao.setTipoImpressao(NFTipoImpressao.DANFE_NORMAL_PAISAGEM);
        identificacao.setUf(DFUnidadeFederativa.SC);
        identificacao.setVersaoEmissor("532ng7VURPgovC5BYaZy");
        identificacao.setDataHoraContigencia(new DateTime(2014, 10, 10, 10, 10, 10));
        identificacao.setJustificativaEntradaContingencia("b1Aj7VBU5I0LDthlrWTk73otsFXSVbiNYyAgGZjLYT0pftpjhGzQEAtnolQoAEB3omnxNq8am4iMqwwviuaXRHjiYWY7YaPITlDN7cDN9obnhEqhDhkgKphRBY5frTfD6unwTB4w7j6hpY2zNNzWwbNJzPGgDmQ8WhBDnpq1fQOilrcDspY7SGkNDfjxpGTQyNSNsmF4B2uHHLhGhhxG2qVq2bFUvHFqSL8atQAuYpyn3wplW21v88N96PnF0MEV");
        identificacao.setIdentificadorLocalDestinoOperacao(NFIdentificadorLocalDestinoOperacao.OPERACAO_INTERNA);
        identificacao.setOperacaoConsumidorFinal(NFOperacaoConsumidorFinal.SIM);
        identificacao.setIndicadorPresencaComprador(NFIndicadorPresencaComprador.NAO_APLICA);
        identificacao.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirTipoEmissaoNulo() {
        final DFNotaInfoIdentificacao identificacao = new DFNotaInfoIdentificacao();
        identificacao.setAmbiente(DFAmbiente.PRODUCAO);
        identificacao.setCodigoMunicipio("1612675");
        identificacao.setCodigoRandomico("99999999");
        identificacao.setDataHoraEmissao(new DateTime(2010, 10, 27, 10, 10, 10));
        identificacao.setDataHoraSaidaOuEntrada(new DateTime(2013, 9, 24, 10, 10, 10));
        identificacao.setDigitoVerificador(8);
        identificacao.setFinalidade(NFFinalidade.NORMAL);
        identificacao.setFormaPagamento(NFFormaPagamentoPrazo.A_PRAZO);
        identificacao.setModelo(DFModelo.NFE);
        identificacao.setNaturezaOperacao("qGYcW8I1iak14NF7vnfc8XpPYkrHWB5J7Vm3eOAe57azf1fVP7vEOY7TrRVQ");
        identificacao.setNumeroNota("999999999");
        identificacao.setProgramaEmissor(NFProcessoEmissor.CONTRIBUINTE);
        identificacao.setReferenciadas(Collections.singletonList(FabricaDeObjetosFake.getNFInfoReferenciada()));
        identificacao.setSerie("999");
        identificacao.setTipo(NFTipo.ENTRADA);
        identificacao.setTipoImpressao(NFTipoImpressao.DANFE_NORMAL_PAISAGEM);
        identificacao.setUf(DFUnidadeFederativa.SC);
        identificacao.setVersaoEmissor("532ng7VURPgovC5BYaZy");
        identificacao.setDataHoraContigencia(new DateTime(2014, 10, 10, 10, 10, 10));
        identificacao.setJustificativaEntradaContingencia("b1Aj7VBU5I0LDthlrWTk73otsFXSVbiNYyAgGZjLYT0pftpjhGzQEAtnolQoAEB3omnxNq8am4iMqwwviuaXRHjiYWY7YaPITlDN7cDN9obnhEqhDhkgKphRBY5frTfD6unwTB4w7j6hpY2zNNzWwbNJzPGgDmQ8WhBDnpq1fQOilrcDspY7SGkNDfjxpGTQyNSNsmF4B2uHHLhGhhxG2qVq2bFUvHFqSL8atQAuYpyn3wplW21v88N96PnF0MEV");
        identificacao.setIdentificadorLocalDestinoOperacao(NFIdentificadorLocalDestinoOperacao.OPERACAO_INTERNA);
        identificacao.setOperacaoConsumidorFinal(NFOperacaoConsumidorFinal.SIM);
        identificacao.setIndicadorPresencaComprador(NFIndicadorPresencaComprador.NAO_APLICA);
        identificacao.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirTipoImpressaoNulo() {
        final DFNotaInfoIdentificacao identificacao = new DFNotaInfoIdentificacao();
        identificacao.setAmbiente(DFAmbiente.PRODUCAO);
        identificacao.setCodigoMunicipio("1612675");
        identificacao.setCodigoRandomico("99999999");
        identificacao.setDataHoraEmissao(new DateTime(2010, 10, 27, 10, 10, 10));
        identificacao.setDataHoraSaidaOuEntrada(new DateTime(2013, 9, 24, 10, 10, 10));
        identificacao.setDigitoVerificador(8);
        identificacao.setFinalidade(NFFinalidade.NORMAL);
        identificacao.setFormaPagamento(NFFormaPagamentoPrazo.A_PRAZO);
        identificacao.setModelo(DFModelo.NFE);
        identificacao.setNaturezaOperacao("qGYcW8I1iak14NF7vnfc8XpPYkrHWB5J7Vm3eOAe57azf1fVP7vEOY7TrRVQ");
        identificacao.setNumeroNota("999999999");
        identificacao.setProgramaEmissor(NFProcessoEmissor.CONTRIBUINTE);
        identificacao.setReferenciadas(Collections.singletonList(FabricaDeObjetosFake.getNFInfoReferenciada()));
        identificacao.setSerie("999");
        identificacao.setTipo(NFTipo.ENTRADA);
        identificacao.setTipoEmissao(NFTipoEmissao.EMISSAO_NORMAL);
        identificacao.setUf(DFUnidadeFederativa.SC);
        identificacao.setVersaoEmissor("532ng7VURPgovC5BYaZy");
        identificacao.setDataHoraContigencia(new DateTime(2014, 10, 10, 10, 10, 10));
        identificacao.setJustificativaEntradaContingencia("b1Aj7VBU5I0LDthlrWTk73otsFXSVbiNYyAgGZjLYT0pftpjhGzQEAtnolQoAEB3omnxNq8am4iMqwwviuaXRHjiYWY7YaPITlDN7cDN9obnhEqhDhkgKphRBY5frTfD6unwTB4w7j6hpY2zNNzWwbNJzPGgDmQ8WhBDnpq1fQOilrcDspY7SGkNDfjxpGTQyNSNsmF4B2uHHLhGhhxG2qVq2bFUvHFqSL8atQAuYpyn3wplW21v88N96PnF0MEV");
        identificacao.setIdentificadorLocalDestinoOperacao(NFIdentificadorLocalDestinoOperacao.OPERACAO_INTERNA);
        identificacao.setOperacaoConsumidorFinal(NFOperacaoConsumidorFinal.SIM);
        identificacao.setIndicadorPresencaComprador(NFIndicadorPresencaComprador.NAO_APLICA);
        identificacao.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirUfNulo() {
        final DFNotaInfoIdentificacao identificacao = new DFNotaInfoIdentificacao();
        identificacao.setAmbiente(DFAmbiente.PRODUCAO);
        identificacao.setCodigoMunicipio("1612675");
        identificacao.setCodigoRandomico("99999999");
        identificacao.setDataHoraEmissao(new DateTime(2010, 10, 27, 10, 10, 10));
        identificacao.setDataHoraSaidaOuEntrada(new DateTime(2013, 9, 24, 10, 10, 10));
        identificacao.setDigitoVerificador(8);
        identificacao.setFinalidade(NFFinalidade.NORMAL);
        identificacao.setFormaPagamento(NFFormaPagamentoPrazo.A_PRAZO);
        identificacao.setModelo(DFModelo.NFE);
        identificacao.setNaturezaOperacao("qGYcW8I1iak14NF7vnfc8XpPYkrHWB5J7Vm3eOAe57azf1fVP7vEOY7TrRVQ");
        identificacao.setNumeroNota("999999999");
        identificacao.setProgramaEmissor(NFProcessoEmissor.CONTRIBUINTE);
        identificacao.setReferenciadas(Collections.singletonList(FabricaDeObjetosFake.getNFInfoReferenciada()));
        identificacao.setSerie("999");
        identificacao.setTipo(NFTipo.ENTRADA);
        identificacao.setTipoEmissao(NFTipoEmissao.EMISSAO_NORMAL);
        identificacao.setTipoImpressao(NFTipoImpressao.DANFE_NORMAL_PAISAGEM);
        identificacao.setVersaoEmissor("532ng7VURPgovC5BYaZy");
        identificacao.setDataHoraContigencia(new DateTime(2014, 10, 10, 10, 10, 10));
        identificacao.setJustificativaEntradaContingencia("b1Aj7VBU5I0LDthlrWTk73otsFXSVbiNYyAgGZjLYT0pftpjhGzQEAtnolQoAEB3omnxNq8am4iMqwwviuaXRHjiYWY7YaPITlDN7cDN9obnhEqhDhkgKphRBY5frTfD6unwTB4w7j6hpY2zNNzWwbNJzPGgDmQ8WhBDnpq1fQOilrcDspY7SGkNDfjxpGTQyNSNsmF4B2uHHLhGhhxG2qVq2bFUvHFqSL8atQAuYpyn3wplW21v88N96PnF0MEV");
        identificacao.setIdentificadorLocalDestinoOperacao(NFIdentificadorLocalDestinoOperacao.OPERACAO_INTERNA);
        identificacao.setOperacaoConsumidorFinal(NFOperacaoConsumidorFinal.SIM);
        identificacao.setIndicadorPresencaComprador(NFIndicadorPresencaComprador.NAO_APLICA);
        identificacao.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirVersaoEmissorNulo() {
        final DFNotaInfoIdentificacao identificacao = new DFNotaInfoIdentificacao();
        identificacao.setAmbiente(DFAmbiente.PRODUCAO);
        identificacao.setCodigoMunicipio("1612675");
        identificacao.setCodigoRandomico("99999999");
        identificacao.setDataHoraEmissao(new DateTime(2010, 10, 27, 10, 10, 10));
        identificacao.setDataHoraSaidaOuEntrada(new DateTime(2013, 9, 24, 10, 10, 10));
        identificacao.setDigitoVerificador(8);
        identificacao.setFinalidade(NFFinalidade.NORMAL);
        identificacao.setFormaPagamento(NFFormaPagamentoPrazo.A_PRAZO);
        identificacao.setModelo(DFModelo.NFE);
        identificacao.setNaturezaOperacao("qGYcW8I1iak14NF7vnfc8XpPYkrHWB5J7Vm3eOAe57azf1fVP7vEOY7TrRVQ");
        identificacao.setNumeroNota("999999999");
        identificacao.setProgramaEmissor(NFProcessoEmissor.CONTRIBUINTE);
        identificacao.setReferenciadas(Collections.singletonList(FabricaDeObjetosFake.getNFInfoReferenciada()));
        identificacao.setSerie("999");
        identificacao.setTipo(NFTipo.ENTRADA);
        identificacao.setTipoEmissao(NFTipoEmissao.EMISSAO_NORMAL);
        identificacao.setTipoImpressao(NFTipoImpressao.DANFE_NORMAL_PAISAGEM);
        identificacao.setUf(DFUnidadeFederativa.SC);
        identificacao.setDataHoraContigencia(new DateTime(2014, 10, 10, 10, 10, 10));
        identificacao.setJustificativaEntradaContingencia("b1Aj7VBU5I0LDthlrWTk73otsFXSVbiNYyAgGZjLYT0pftpjhGzQEAtnolQoAEB3omnxNq8am4iMqwwviuaXRHjiYWY7YaPITlDN7cDN9obnhEqhDhkgKphRBY5frTfD6unwTB4w7j6hpY2zNNzWwbNJzPGgDmQ8WhBDnpq1fQOilrcDspY7SGkNDfjxpGTQyNSNsmF4B2uHHLhGhhxG2qVq2bFUvHFqSL8atQAuYpyn3wplW21v88N96PnF0MEV");
        identificacao.setIdentificadorLocalDestinoOperacao(NFIdentificadorLocalDestinoOperacao.OPERACAO_INTERNA);
        identificacao.setOperacaoConsumidorFinal(NFOperacaoConsumidorFinal.SIM);
        identificacao.setIndicadorPresencaComprador(NFIndicadorPresencaComprador.NAO_APLICA);
        identificacao.toString();
    }

    @Test
    public void devePermitirDataHoraContigenciaNulo() {
        final DFNotaInfoIdentificacao identificacao = new DFNotaInfoIdentificacao();
        identificacao.setAmbiente(DFAmbiente.PRODUCAO);
        identificacao.setCodigoMunicipio("1612675");
        identificacao.setCodigoRandomico("99999999");
        identificacao.setDataHoraEmissao(new DateTime(2010, 10, 27, 10, 10, 10));
        identificacao.setDataHoraSaidaOuEntrada(new DateTime(2013, 9, 24, 10, 10, 10));
        identificacao.setDigitoVerificador(8);
        identificacao.setFinalidade(NFFinalidade.NORMAL);
        identificacao.setFormaPagamento(NFFormaPagamentoPrazo.A_PRAZO);
        identificacao.setModelo(DFModelo.NFE);
        identificacao.setNaturezaOperacao("qGYcW8I1iak14NF7vnfc8XpPYkrHWB5J7Vm3eOAe57azf1fVP7vEOY7TrRVQ");
        identificacao.setNumeroNota("999999999");
        identificacao.setProgramaEmissor(NFProcessoEmissor.CONTRIBUINTE);
        identificacao.setReferenciadas(Collections.singletonList(FabricaDeObjetosFake.getNFInfoReferenciada()));
        identificacao.setSerie("999");
        identificacao.setTipo(NFTipo.ENTRADA);
        identificacao.setTipoEmissao(NFTipoEmissao.EMISSAO_NORMAL);
        identificacao.setTipoImpressao(NFTipoImpressao.DANFE_NORMAL_PAISAGEM);
        identificacao.setUf(DFUnidadeFederativa.SC);
        identificacao.setVersaoEmissor("532ng7VURPgovC5BYaZy");
        identificacao.setJustificativaEntradaContingencia("b1Aj7VBU5I0LDthlrWTk73otsFXSVbiNYyAgGZjLYT0pftpjhGzQEAtnolQoAEB3omnxNq8am4iMqwwviuaXRHjiYWY7YaPITlDN7cDN9obnhEqhDhkgKphRBY5frTfD6unwTB4w7j6hpY2zNNzWwbNJzPGgDmQ8WhBDnpq1fQOilrcDspY7SGkNDfjxpGTQyNSNsmF4B2uHHLhGhhxG2qVq2bFUvHFqSL8atQAuYpyn3wplW21v88N96PnF0MEV");
        identificacao.setIdentificadorLocalDestinoOperacao(NFIdentificadorLocalDestinoOperacao.OPERACAO_INTERNA);
        identificacao.setOperacaoConsumidorFinal(NFOperacaoConsumidorFinal.SIM);
        identificacao.setIndicadorPresencaComprador(NFIndicadorPresencaComprador.NAO_APLICA);
        identificacao.toString();
    }

    @Test
    public void devePermitirJustificativaEntradaContingenciaNulo() {
        final DFNotaInfoIdentificacao identificacao = new DFNotaInfoIdentificacao();
        identificacao.setAmbiente(DFAmbiente.PRODUCAO);
        identificacao.setCodigoMunicipio("1612675");
        identificacao.setCodigoRandomico("99999999");
        identificacao.setDataHoraEmissao(new DateTime(2010, 10, 27, 10, 10, 10));
        identificacao.setDataHoraSaidaOuEntrada(new DateTime(2013, 9, 24, 10, 10, 10));
        identificacao.setDigitoVerificador(8);
        identificacao.setFinalidade(NFFinalidade.NORMAL);
        identificacao.setFormaPagamento(NFFormaPagamentoPrazo.A_PRAZO);
        identificacao.setModelo(DFModelo.NFE);
        identificacao.setNaturezaOperacao("qGYcW8I1iak14NF7vnfc8XpPYkrHWB5J7Vm3eOAe57azf1fVP7vEOY7TrRVQ");
        identificacao.setNumeroNota("999999999");
        identificacao.setProgramaEmissor(NFProcessoEmissor.CONTRIBUINTE);
        identificacao.setReferenciadas(Collections.singletonList(FabricaDeObjetosFake.getNFInfoReferenciada()));
        identificacao.setSerie("999");
        identificacao.setTipo(NFTipo.ENTRADA);
        identificacao.setTipoEmissao(NFTipoEmissao.EMISSAO_NORMAL);
        identificacao.setTipoImpressao(NFTipoImpressao.DANFE_NORMAL_PAISAGEM);
        identificacao.setUf(DFUnidadeFederativa.SC);
        identificacao.setVersaoEmissor("532ng7VURPgovC5BYaZy");
        identificacao.setDataHoraContigencia(new DateTime(2014, 10, 10, 10, 10, 10));
        identificacao.setIdentificadorLocalDestinoOperacao(NFIdentificadorLocalDestinoOperacao.OPERACAO_INTERNA);
        identificacao.setOperacaoConsumidorFinal(NFOperacaoConsumidorFinal.SIM);
        identificacao.setIndicadorPresencaComprador(NFIndicadorPresencaComprador.NAO_APLICA);
        identificacao.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<DFNotaInfoIdentificacao><cUF>43</cUF><cNF>99999999</cNF><natOp>qGYcW8I1iak14NF7vnfc8XpPYkrHWB5J7Vm3eOAe57azf1fVP7vEOY7TrRVQ</natOp><indPag>1</indPag><mod>55</mod><serie>999</serie><nNF>999999999</nNF><dhEmi>2010-10-27T10:10:10-02:00</dhEmi><dhSaiEnt>2013-09-24T10:10:10-03:00</dhSaiEnt><tpNF>0</tpNF><idDest>1</idDest><cMunFG>1612675</cMunFG><tpImp>2</tpImp><tpEmis>1</tpEmis><cDV>8</cDV><tpAmb>1</tpAmb><finNFe>1</finNFe><indFinal>1</indFinal><indPres>0</indPres><procEmi>0</procEmi><verProc>532ng7VURPgovC5BYaZy</verProc><dhCont>2014-10-10T10:10:10-03:00</dhCont><xJust>b1Aj7VBU5I0LDthlrWTk73otsFXSVbiNYyAgGZjLYT0pftpjhGzQEAtnolQoAEB3omnxNq8am4iMqwwviuaXRHjiYWY7YaPITlDN7cDN9obnhEqhDhkgKphRBY5frTfD6unwTB4w7j6hpY2zNNzWwbNJzPGgDmQ8WhBDnpq1fQOilrcDspY7SGkNDfjxpGTQyNSNsmF4B2uHHLhGhhxG2qVq2bFUvHFqSL8atQAuYpyn3wplW21v88N96PnF0MEV</xJust><NFref><refCTe>19506188293993666630760813709064781438945816</refCTe></NFref></DFNotaInfoIdentificacao>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoIdentificacao().toString());
    }
}