package br.indie.fiscal4j;

import br.indie.fiscal4j.common.DFAmbiente;
import br.indie.fiscal4j.common.DFModelo;
import br.indie.fiscal4j.common.DFUnidadeFederativa;
import br.indie.fiscal4j.nfe.classes.*;
import br.indie.fiscal4j.nfe.classes.evento.NFEvento;
import br.indie.fiscal4j.nfe.classes.evento.NFInfoEvento;
import br.indie.fiscal4j.nfe.classes.evento.NFTipoEvento;
import br.indie.fiscal4j.nfe.classes.evento.cancelamento.NFEnviaEventoCancelamento;
import br.indie.fiscal4j.nfe.classes.evento.cancelamento.NFEventoCancelamento;
import br.indie.fiscal4j.nfe.classes.evento.cancelamento.NFInfoCancelamento;
import br.indie.fiscal4j.nfe.classes.evento.cancelamento.NFInfoEventoCancelamento;
import br.indie.fiscal4j.nfe.classes.evento.cartacorrecao.NFEnviaEventoCartaCorrecao;
import br.indie.fiscal4j.nfe.classes.evento.inutilizacao.NFEnviaEventoInutilizacao;
import br.indie.fiscal4j.nfe.classes.evento.inutilizacao.NFEventoInutilizacaoDados;
import br.indie.fiscal4j.nfe.classes.evento.manifestacaodestinatario.NFEventoManifestacaoDestinatario;
import br.indie.fiscal4j.nfe.classes.evento.manifestacaodestinatario.NFInfoEventoManifestacaoDestinatario;
import br.indie.fiscal4j.nfe.classes.evento.manifestacaodestinatario.NFInfoManifestacaoDestinatario;
import br.indie.fiscal4j.nfe.classes.lote.envio.DFLoteEnvio;
import br.indie.fiscal4j.nfe.classes.lote.envio.DFLoteEnvioRetornoRecebimentoInfo;
import br.indie.fiscal4j.nfe.classes.lote.envio.NFLoteIndicadorProcessamento;
import br.indie.fiscal4j.nfe.classes.nota.*;
import br.indie.fiscal4j.nfe.classes.nota.assinatura.DFReference;
import br.indie.fiscal4j.nfe.classes.nota.assinatura.DFSignature;
import br.indie.fiscal4j.nfe.classes.nota.assinatura.DFSignedInfo;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class FabricaDeObjetosFake {

    public static DFInformacaoImpostoDevolvido getNFInformacaoImpostoDevolvido() {
        final DFInformacaoImpostoDevolvido informacaoImpostoDevolvido = new DFInformacaoImpostoDevolvido();
        informacaoImpostoDevolvido.setValorIPIDevolvido(new BigDecimal("9999999999999.99"));
        return informacaoImpostoDevolvido;
    }

    public static DFImpostoDevolvido getNFImpostoDevolvido() {
        final DFImpostoDevolvido impostoDevolvido = new DFImpostoDevolvido();
        impostoDevolvido.setInformacaoIPIDevolvido(FabricaDeObjetosFake.getNFInformacaoImpostoDevolvido());
        impostoDevolvido.setPercentualDevolucao(new BigDecimal("100"));
        return impostoDevolvido;
    }

    public static DFNotaInfoItemImpostoICMSUFDestino getNFNotaaInfoItemImpostoICMSUFDestino() {
        final DFNotaInfoItemImpostoICMSUFDestino icmsUFDestino = new DFNotaInfoItemImpostoICMSUFDestino();
        icmsUFDestino.setPercentualAliquotaInternaDestino(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualInterestadual(new BigDecimal("7.00"));
        icmsUFDestino.setPercentualProvisorioPartilha(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualRelativoFundoCombatePobrezaDestino(new BigDecimal("999.9999"));
        icmsUFDestino.setValorBaseCalculoDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualRemetente(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorRelativoFundoCombatePobrezaDestino(new BigDecimal("9999999999999.99"));
        return icmsUFDestino;
    }

    public static NFEnviaEventoCancelamento getNFEnviaEventoCancelamento() {
        final NFEnviaEventoCancelamento enviaEvento = new NFEnviaEventoCancelamento();
        enviaEvento.setEvento(Collections.singletonList(getNFEventoCancelamento()));
        enviaEvento.setIdLote(Long.toString(DateTime.now().getMillis()));
        enviaEvento.setVersao(new BigDecimal("1.00"));
        return enviaEvento;
    }

    public static NFEventoCancelamento getNFEventoCancelamento() {
        final NFEventoCancelamento eventoCancelamento = new NFEventoCancelamento();
        eventoCancelamento.setVersao(new BigDecimal("4.00"));
        eventoCancelamento.setInfoEvento(FabricaDeObjetosFake.getNFInfoEventoCancelamento());
        return eventoCancelamento;
    }

    public static NFInfoEventoCancelamento getNFInfoEventoCancelamento() {
        final NFInfoEventoCancelamento infoEventoCancelamento = new NFInfoEventoCancelamento();
        infoEventoCancelamento.setAmbiente(DFAmbiente.HOMOLOGACAO);
        infoEventoCancelamento.setCancelamento(FabricaDeObjetosFake.getNFInfoCancelamento());
        infoEventoCancelamento.setChave("81568004734874930428983724940883089298523837");
        infoEventoCancelamento.setCnpj("12345678901234");
        infoEventoCancelamento.setCodigoEvento("123456");
        infoEventoCancelamento.setDataHoraEvento(new DateTime(2014, 1, 1, 10, 10, 10));
        infoEventoCancelamento.setId("hluU2zKt4QK5bEktOiGfpZw64535p2A4Z5m5egLQbMpjnCH48c1aw6");
        infoEventoCancelamento.setNumeroSequencialEvento(2);
        infoEventoCancelamento.setOrgao(DFUnidadeFederativa.SC);
        infoEventoCancelamento.setCodigoEvento("123456");
        infoEventoCancelamento.setVersaoEvento(new BigDecimal("2.49"));
        return infoEventoCancelamento;
    }

    public static NFInfoCancelamento getNFInfoCancelamento() {
        final NFInfoCancelamento infoCancelamento = new NFInfoCancelamento();
        infoCancelamento.setDescricaoEvento("Cancelamento");
        infoCancelamento.setProtocoloAutorizacao("123456789012345");
        infoCancelamento.setVersao(new BigDecimal("4.00"));
        infoCancelamento.setJustificativa("Justificativa qualquer coisa");

        return infoCancelamento;
    }

    public static NFEventoInutilizacaoDados getNFEventoCancelamentoDados() {
        final NFEventoInutilizacaoDados dados = new NFEventoInutilizacaoDados();
        dados.setAmbiente(DFAmbiente.HOMOLOGACAO);
        dados.setAno(15);
        dados.setCnpj("12345678901234");
        dados.setIdentificador("ID55605654557305333405403926218856863798956");
        dados.setJustificativa("u2MGhwXFQDFtSuKsLkmgowBZNNhOWBL4JKIqYnIj5iDPTAUqHSwKL1O2olgmZwigRS1P58Zoc1qDxzqmvv3hBE1LYuLHNPbFXuLwM5ZxvH7xfSpnkX5VBGjrkR3cuiXLr1uz3chFb9JrNY5xU3X0eF9Byc2Q9TkPbFyPj7iRwwQVMNt6FGvpUyRMHGmhSDYhFRD2Dst0UaauvA4V0breWHyN4WUSEm9z377jXHNwtVLQQCxB2wcEIZGWVIT4CF5");
        dados.setModeloDocumentoFiscal("55");
        dados.setNomeServico("INUTILIZAR");
        dados.setNumeroNFInicial("1");
        dados.setNumeroNFFinal("999999999");
        dados.setSerie("999");
        dados.setUf(DFUnidadeFederativa.SC);
        return dados;
    }

    public static NFEnviaEventoInutilizacao getNFEnviaEventoInutilizacao() {
        final NFEnviaEventoInutilizacao enviaEvento = new NFEnviaEventoInutilizacao();
        enviaEvento.setVersao(new BigDecimal("1.00"));
        enviaEvento.setDados(FabricaDeObjetosFake.getNFEventoInutilizacaoDados());
        return enviaEvento;
    }

    public static NFEventoInutilizacaoDados getNFEventoInutilizacaoDados() {
        final Integer anoInutilizacaoNumeracao = 16;
        final String cnpjEmitente = "12345678901234";
        final DFModelo modelo = DFModelo.NFE;
        final String numeroInicial = "123456789";
        final String numeroFinal = "987654321";
        final String serie = "123";
        final DFUnidadeFederativa uf = DFUnidadeFederativa.SC;

        final NFEventoInutilizacaoDados dados = new NFEventoInutilizacaoDados();
        dados.setAmbiente(DFAmbiente.HOMOLOGACAO);
        dados.setAno(anoInutilizacaoNumeracao);
        dados.setCnpj(cnpjEmitente);
        dados.setJustificativa("u2MGhwXFQDFtSuKsLkmgowBZNNhOWBL4JKIqYnIj5iDPTAUqHSwKL1O2olgmZwigRS1P58Zoc1qDxzqmvv3hBE1LYuLHNPbFXuLwM5ZxvH7xfSpnkX5VBGjrkR3cuiXLr1uz3chFb9JrNY5xU3X0eF9Byc2Q9TkPbFyPj7iRwwQVMNt6FGvpUyRMHGmhSDYhFRD2Dst0UaauvA4V0breWHyN4WUSEm9z377jXHNwtVLQQCxB2wcEIZGWVIT4CF5");
        dados.setModeloDocumentoFiscal(modelo.getCodigo());
        dados.setNomeServico("INUTILIZAR");
        dados.setNumeroNFInicial(numeroInicial);
        dados.setNumeroNFFinal(numeroFinal);
        dados.setSerie(serie);
        dados.setUf(uf);
        final String numeroInicialTamanhoMaximo = StringUtils.leftPad(numeroInicial, 9, "0");
        final String numeroFinalTamanhoMaximo = StringUtils.leftPad(numeroFinal, 9, "0");
        final String serieTamanhoMaximo = StringUtils.leftPad(serie, 3, "0");
        dados.setIdentificador("ID" + uf.getCodigoIbge() + String.valueOf(anoInutilizacaoNumeracao) + cnpjEmitente + modelo.getCodigo() + serieTamanhoMaximo + numeroInicialTamanhoMaximo + numeroFinalTamanhoMaximo);
        return dados;
    }

    public static NFEventoManifestacaoDestinatario getNFEventoManifestacaoDestinatario() {
        final NFEventoManifestacaoDestinatario eventoManifestacaoDestinatario = new NFEventoManifestacaoDestinatario();
        eventoManifestacaoDestinatario.setVersao(new BigDecimal("4.00"));
        eventoManifestacaoDestinatario.setInfoEvento(FabricaDeObjetosFake.getNFInfoEventoManifestacaoDestinatario());
        return eventoManifestacaoDestinatario;
    }

    public static NFInfoEventoManifestacaoDestinatario getNFInfoEventoManifestacaoDestinatario() {
        final NFInfoEventoManifestacaoDestinatario infoEventoManifestacaoDestinatario = new NFInfoEventoManifestacaoDestinatario();
        infoEventoManifestacaoDestinatario.setAmbiente(DFAmbiente.HOMOLOGACAO);
        infoEventoManifestacaoDestinatario.setManifestacaoDestinatario(FabricaDeObjetosFake.getNFInfoManifestacaoDestinatario());
        infoEventoManifestacaoDestinatario.setChave("81568004734874930428983724940883089298523837");
        infoEventoManifestacaoDestinatario.setCnpj("12345678901234");
        infoEventoManifestacaoDestinatario.setCodigoEvento("123456");
        infoEventoManifestacaoDestinatario.setDataHoraEvento(new DateTime(2014, 1, 1, 10, 10, 10));
        infoEventoManifestacaoDestinatario.setId("hluU2zKt4QK5bEktOiGfpZw64535p2A4Z5m5egLQbMpjnCH48c1aw6");
        infoEventoManifestacaoDestinatario.setNumeroSequencialEvento(2);
        infoEventoManifestacaoDestinatario.setOrgao(DFUnidadeFederativa.SC);
        infoEventoManifestacaoDestinatario.setCodigoEvento("123456");
        infoEventoManifestacaoDestinatario.setVersaoEvento(new BigDecimal("2.49"));
        return infoEventoManifestacaoDestinatario;
    }

    public static NFInfoManifestacaoDestinatario getNFInfoManifestacaoDestinatario() {
        final NFInfoManifestacaoDestinatario infoManifestacaoDestinatario = new NFInfoManifestacaoDestinatario();
        infoManifestacaoDestinatario.setDescricaoEvento("Operacao nao Realizada");
        infoManifestacaoDestinatario.setVersao(new BigDecimal("4.00"));
        infoManifestacaoDestinatario.setJustificativa("Justificativa qualquer coisa");
        return infoManifestacaoDestinatario;
    }

    public static NFEnviaEventoCartaCorrecao getNFEnviaEventoCartaCorrecao() {
        final NFEnviaEventoCartaCorrecao enviaEvento = new NFEnviaEventoCartaCorrecao();
        enviaEvento.setEvento(Collections.singletonList(getNFEventoCartaCorrecao()));
        enviaEvento.setIdLote(Long.toString(DateTime.now().getMillis()));
        enviaEvento.setVersao(new BigDecimal("1.00"));
        return enviaEvento;
    }

    public static NFEvento getNFEventoCartaCorrecao() {
        final NFEvento evento = new NFEvento();
        evento.setInfoEvento(FabricaDeObjetosFake.getNFInfoEventoCartaCorrecao());
        evento.setVersao(new BigDecimal("1.00"));
        return evento;
    }

    public static NFInfoEvento getNFInfoEventoCartaCorrecao() {
        final NFInfoEvento infoEvento = new NFInfoEvento();
        infoEvento.setAmbiente(DFAmbiente.HOMOLOGACAO);
        infoEvento.setDadosEvento(FabricaDeObjetosFake.getNFInfoCartaCorrecao());
        infoEvento.setChave("81568004734874930428983724940883089298523837");
        infoEvento.setCnpj("02224343323426");
        infoEvento.setDataHoraEvento(new DateTime(2014, 1, 1, 10, 10, 10));
        infoEvento.setId("ID1101108156800473487493042898372494088308929852383799");
        infoEvento.setNumeroSequencialEvento(99);
        infoEvento.setOrgao(DFUnidadeFederativa.SC);
        infoEvento.setTipoEvento("110110");
        infoEvento.setVersaoEvento(new BigDecimal("1.00"));
        return infoEvento;
    }

    public static NFTipoEvento getNFInfoCartaCorrecao() {
        final NFTipoEvento cartaCorrecao = new NFTipoEvento();
        cartaCorrecao.setCondicaoUso("A Carta de Correcao e disciplinada pelo paragrafo 1o-A do art. 7o do Convenio S/N, de 15 de dezembro de 1970 e pode ser utilizada para regularizacao de erro ocorrido na emissao de documento fiscal, desde que o erro nao esteja relacionado com: I - as variaveis que determinam o valor do imposto tais como: base de calculo, aliquota, diferenca de preco, quantidade, valor da operacao ou da prestacao; II - a correcao de dados cadastrais que implique mudanca do remetente ou do destinatario; III - a data de emissao ou de saida.");
        cartaCorrecao.setTextoCorrecao("GtsYuGiKh9h9w3v9CYm7SUUSPo2a5P1TXDzA3CX5p7SFwgFUZVKT4RLLKJKLX6M8gYyr0QG3fPA4ahffeVcB7avzf6C2SWISJ3l251NvnpIM3VATTyBfm5MJxZljegXvc79jhUtotiwt2iUn2x4W2XFRwQHuKnZvkXGuOr4BoX94gGCFuxXus59okD0scjbnPar6ToOpzW86xNn7mGwmAbUJJJTgrikR1GSi03TeiLT9grSizvPqMHgbXFSKOYyBvjWyK3wlhqLrzAvnynunibUnZFEEZNjglyWSItEocQwvUHM5VvOmKu0oIrUB64m6FBXqku3m8zHTAxMoevq8fpabWZGnqtEbBl9hJRRNBDhmbkNg48OXTHNjqO6vpeoEl7EGhR2rrCHuQMgLXKsvFTBVcCblfbKwJ7tCzhQWfgN8KOH0OHpqCnMVk4WBSjNcn5gt0SiXq8bFEDOsvKt62LnPsKCsE9A59P6SBJFG8A1E4T7XuyItBUSZoY0e0pBAVBwJuOUFobCR138KGPFAGa5hDDQv0Pnu9nyDEuOUYD7me3kAGTq9U4Ln7cyg5FbENwY6EcKp6mY5FjaXez0tW0hKRKaXfuk7ojExtv8f3plvSL9HY5ZO10wS64GMhRlEbrzUAW3Pucq2m2e2xm39sbFhatXbfxhT3coSEhPRfMRCxkw30yzfhAclOtF2gH7EoUIZ517mMPqS1NGp4F4unpCf58DaTg5c8phyAlWD96Io9jueeN2QIs6aGVEcRzYsQGpnwXgTYxX2LeLvxeu4aET4Jvh4OFq0jQ3Xby6c5pMkNLktjtR83u7wsQWwiSOivVBp4HAW2wGevLbY7kNougJmMIPLAjtATFKExjuBJylvV2DQYBnVfbg5ApmW0n0V8LiKb2L5TxBK5ISO8PhtMvrJcSJIjFVOSMe1yEAsLfUbfpUCX42yOs0rXImjyn0AsfmqzMf9YVLByE3s6aVGItY2TgQI2zkjBSgDi1vR");
        cartaCorrecao.setDescricaoEvento("Carta de Correcao");
        cartaCorrecao.setVersao(new BigDecimal("1.00"));
        return cartaCorrecao;
    }

    public static DFNotaInfoPagamento getNFNotaInfoPagamento() {
        final DFNotaInfoPagamento pagamento = new DFNotaInfoPagamento();
        pagamento.setCartao(FabricaDeObjetosFake.getNFNotaInfoCartao());
        pagamento.setValorPagamento(new BigDecimal("999999999999.99"));
        pagamento.setFormaPagamentoMoeda(NFFormaPagamentoMoeda.CARTAO_CREDITO);
        return pagamento;
    }

    public static DFNotaInfoCartao getNFNotaInfoCartao() {
        final DFNotaInfoCartao cartao = new DFNotaInfoCartao();
        cartao.setCnpj("12345678901234");
        cartao.setNumeroAutorizacaoOperacaoCartao("9ItpS1hBk3TyhjUB3I90");
        cartao.setOperadoraCartao(NFOperadoraCartao.MASTERCARD);
        cartao.setTipoIntegracao(NFTipoIntegracaoPagamento.INTEGRADO);
        return cartao;
    }

    public static DFNotaInfoItemExportacaoIndireta getNFNotaInfoItemExportacaoIndireta() {
        final DFNotaInfoItemExportacaoIndireta exportacaoIndireta = new DFNotaInfoItemExportacaoIndireta();
        exportacaoIndireta.setChaveAcessoNFe("99921995966146649003423495876439081543214139");
        exportacaoIndireta.setNumeroRegistroExportacao(new BigInteger("999999999999"));
        exportacaoIndireta.setQuantidadeItemEfetivamenteExportado(new BigDecimal("9999999999.9999"));
        return exportacaoIndireta;
    }

    public static DFLoteEnvio getNFLoteEnvio() {
        final DFLoteEnvio loteEnvio = new DFLoteEnvio();
        loteEnvio.setIdLote("333972757970401");
        loteEnvio.setVersao("4.00");
        loteEnvio.setNotas(Collections.singletonList(FabricaDeObjetosFake.getNFNota1()));
        loteEnvio.setIndicadorProcessamento(NFLoteIndicadorProcessamento.PROCESSAMENTO_ASSINCRONO);
        return loteEnvio;
    }

    public static DFNota getNFNota1() {
        final DFNota nota = new DFNota();
        final DFNotaInfo info = new DFNotaInfo();
        info.setAvulsa(FabricaDeObjetosFake.getNFNotaInfoAvulsa());
        info.setCana(FabricaDeObjetosFake.getNFNotaInfoCana());
        info.setCobranca(FabricaDeObjetosFake.getNFNotaInfoCobranca());
        info.setCompra(FabricaDeObjetosFake.getNFNotaInfoCompra());
        info.setDestinatario(FabricaDeObjetosFake.getNFNotaInfoDestinatario());
        info.setEmitente(FabricaDeObjetosFake.getNFNotaInfoEmitente());
        info.setEntrega(FabricaDeObjetosFake.getNFNotaInfoLocal());
        info.setExportacao(FabricaDeObjetosFake.getNFNotaInfoExportacao());
        info.setIdentificador("89172658591754401086218048846976493475937081");
        info.setInformacoesAdicionais(FabricaDeObjetosFake.getNFNotaInfoInformacoesAdicionais());
        info.setPessoasAutorizadasDownloadNFe(Collections.singletonList(FabricaDeObjetosFake.getPessoaAutorizadaDownloadNFe()));

        final DFNotaInfoItem item = new DFNotaInfoItem();
        final DFNotaInfoItemImposto imposto = new DFNotaInfoItemImposto();

        final DFNotaInfoItemImpostoCOFINS cofins = new DFNotaInfoItemImpostoCOFINS();
        cofins.setAliquota(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSAliquota());

        imposto.setCofins(cofins);
        imposto.setCofinsst(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSST());
        imposto.setIssqn(FabricaDeObjetosFake.getNFNotaInfoItemImpostoISSQN());

        final DFNotaInfoItemImpostoPIS pis = new DFNotaInfoItemImpostoPIS();
        pis.setAliquota(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISAliquota());

        imposto.setPis(pis);
        imposto.setPisst(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISST());
        imposto.setValorTotalTributos(new BigDecimal("999999999999.99"));

        item.setImposto(imposto);
        item.setNumeroItem(990);
        item.setProduto(FabricaDeObjetosFake.getProdutoMedicamento());
        item.setImpostoDevolvido(FabricaDeObjetosFake.getNFImpostoDevolvido());

        info.setItens(Collections.singletonList(item));
        info.setRetirada(FabricaDeObjetosFake.getNFNotaInfoLocal());
        info.setTotal(FabricaDeObjetosFake.getNFNotaInfoTotal());
        info.setTransporte(FabricaDeObjetosFake.getNFNotaInfoTransporte());
        info.setVersao(new BigDecimal("4.00"));

        final DFInfoReferenciada referenciada = new DFInfoReferenciada();
        referenciada.setChaveAcesso("19506188293993666630760813709064781438945816");

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
        identificacao.setReferenciadas(Collections.singletonList(referenciada));
        identificacao.setSerie("999");
        identificacao.setTipo(NFTipo.ENTRADA);
        identificacao.setTipoEmissao(NFTipoEmissao.EMISSAO_NORMAL);
        identificacao.setTipoImpressao(NFTipoImpressao.DANFE_NORMAL_PAISAGEM);
        identificacao.setUf(DFUnidadeFederativa.RS);
        identificacao.setVersaoEmissor("532ng7VURPgovC5BYaZy");
        identificacao.setDataHoraContigencia(new DateTime(2014, 10, 10, 10, 10, 10));
        identificacao.setJustificativaEntradaContingencia("b1Aj7VBU5I0LDthlrWTk73otsFXSVbiNYyAgGZjLYT0pftpjhGzQEAtnolQoAEB3omnxNq8am4iMqwwviuaXRHjiYWY7YaPITlDN7cDN9obnhEqhDhkgKphRBY5frTfD6unwTB4w7j6hpY2zNNzWwbNJzPGgDmQ8WhBDnpq1fQOilrcDspY7SGkNDfjxpGTQyNSNsmF4B2uHHLhGhhxG2qVq2bFUvHFqSL8atQAuYpyn3wplW21v88N96PnF0MEV");
        identificacao.setIdentificadorLocalDestinoOperacao(NFIdentificadorLocalDestinoOperacao.OPERACAO_INTERNA);
        identificacao.setOperacaoConsumidorFinal(NFOperacaoConsumidorFinal.SIM);
        identificacao.setIndicadorPresencaComprador(NFIndicadorPresencaComprador.NAO_APLICA);
        info.setIdentificacao(identificacao);
        nota.setInfo(info);
        return nota;
    }

    public static DFNotaInfoIdentificacao getInfoIdentificacaoDeTeste() {
        final DFNotaInfoIdentificacao identificacao = new DFNotaInfoIdentificacao();
        identificacao.setAmbiente(DFAmbiente.HOMOLOGACAO);
        identificacao.setCodigoMunicipio("4314902");
        identificacao.setCodigoRandomico("99999999");
        identificacao.setDataHoraEmissao(DateTime.now());
        identificacao.setDataHoraSaidaOuEntrada(DateTime.now());
        identificacao.setDigitoVerificador(8);
        identificacao.setFinalidade(NFFinalidade.NORMAL);
        identificacao.setFormaPagamento(NFFormaPagamentoPrazo.A_PRAZO);
        identificacao.setModelo(DFModelo.NFE);
        identificacao.setNaturezaOperacao("qGYcW8I1iak14NF7vnfc8XpPYkrHWB5J7Vm3eOAe57azf1fVP7vEOY7TrRVQ");
        identificacao.setSerie("101");
        identificacao.setNumeroNota("4314902");
        identificacao.setProgramaEmissor(NFProcessoEmissor.CONTRIBUINTE);
        identificacao.setTipo(NFTipo.ENTRADA);
        identificacao.setTipoEmissao(NFTipoEmissao.EMISSAO_NORMAL);
        identificacao.setTipoImpressao(NFTipoImpressao.DANFE_NORMAL_PAISAGEM);
        identificacao.setUf(DFUnidadeFederativa.SC);
        identificacao.setVersaoEmissor("532ng7VURPgovC5BYaZy");
        identificacao.setIdentificadorLocalDestinoOperacao(NFIdentificadorLocalDestinoOperacao.OPERACAO_INTERNA);
        identificacao.setOperacaoConsumidorFinal(NFOperacaoConsumidorFinal.SIM);
        identificacao.setIndicadorPresencaComprador(NFIndicadorPresencaComprador.NAO_APLICA);
        return identificacao;
    }

    public static DFPessoaAutorizadaDownloadNFe getPessoaAutorizadaDownloadNFe() {
        final DFPessoaAutorizadaDownloadNFe pessoa = new DFPessoaAutorizadaDownloadNFe();
        pessoa.setCnpj("12345678901234");
        return pessoa;
    }

    private static DFNotaInfoItemProduto getProdutoMedicamento() {
        final DFNotaInfoItemProduto produtoMedicamento = new DFNotaInfoItemProduto();
        produtoMedicamento.setCfop("1302");
        produtoMedicamento.setCodigo("ohVRInAS7jw8LNDP4WWjssSjBHK8nJRERnAeRMcsUokF3YItT93fBto3zZcq");
        produtoMedicamento.setCodigoDeBarras("36811963532505");
        produtoMedicamento.setCodigoDeBarrasTributavel("36811963532505");
        produtoMedicamento.setCampoeValorNota(NFProdutoCompoeValorNota.SIM);
        produtoMedicamento.setDeclaracoesImportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoDeclaracaoImportacao()));
        produtoMedicamento.setDescricao("OBS0ztekCoG0DSSVcQwPKRV2fV842Pye7mED13P4zoDczcXi4AMNvQ7BKBLnHtLc2Z9fuIY1pcKmXSK1IJQSLEs5QWvVGyC74DyJuIM0X7L0cqWPZQii5JtP");
        produtoMedicamento.setExtipi("999");
        produtoMedicamento.setNcm("99999999");
        produtoMedicamento.setNumeroPedidoCliente("NNxQ9nrQ3HCe5Mc");
        produtoMedicamento.setNumeroPedidoItemCliente(999999);
        produtoMedicamento.setQuantidadeComercial(new BigDecimal("9999999999.9999"));
        produtoMedicamento.setQuantidadeTributavel(new BigDecimal("9999999999.9999"));
        produtoMedicamento.setUnidadeComercial("Bta64y");
        produtoMedicamento.setUnidadeTributavel("7wqG4h");
        produtoMedicamento.setValorDesconto(new BigDecimal("999999999999.99"));
        produtoMedicamento.setValorFrete(new BigDecimal("999999999999.99"));
        produtoMedicamento.setValorOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        produtoMedicamento.setValorSeguro(new BigDecimal("999999999999.99"));
        produtoMedicamento.setValorTotalBruto(new BigDecimal("999999999999.99"));
        produtoMedicamento.setValorUnitario(new BigDecimal("9999999999.9999999999"));
        produtoMedicamento.setValorUnitarioTributavel(new BigDecimal("9999999999.9999999999"));
        produtoMedicamento.setVeiculo(FabricaDeObjetosFake.getNFNotaInfoItemProdutoVeiculo());
        produtoMedicamento.setNomeclaturaValorAduaneiroEstatistica(Collections.singletonList("AZ0123"));
        return produtoMedicamento;
    }

    public static DFNota getNFNota() {
        final DFNota nota = new DFNota();
        nota.setInfo(FabricaDeObjetosFake.getNFNotaInfo());
        return nota;
    }

    public static DFNotaProcessada getNFNotaProcessada() {
        final DFNotaProcessada notaProcessada = new DFNotaProcessada();
        notaProcessada.setNota(FabricaDeObjetosFake.getNFNota1());
        notaProcessada.setProtocolo(FabricaDeObjetosFake.getNFProtocolo());
        notaProcessada.setVersao(new BigDecimal("4.00"));
        return notaProcessada;
    }

    public static DFLoteEnvioRetornoRecebimentoInfo getNFLoteEnvioRetornoRecebimentoInfo() {
        final DFLoteEnvioRetornoRecebimentoInfo recebimentoInfo = new DFLoteEnvioRetornoRecebimentoInfo();
        recebimentoInfo.setRecibo("845e40545");
        recebimentoInfo.setTempoMedio("430kfszodkgvre");
        return recebimentoInfo;
    }

    public static NFProtocolo getNFProtocolo() {
        final NFProtocolo protocolo = new NFProtocolo();
        protocolo.setProtocoloInfo(FabricaDeObjetosFake.getNFProtocoloInfo());
        protocolo.setVersao("4.00");
        return protocolo;
    }

    public static NFProtocoloInfo getNFProtocoloInfo() {
        final NFProtocoloInfo info = new NFProtocoloInfo();
        info.setAmbiente(DFAmbiente.HOMOLOGACAO);
        info.setChave("EAIOjea");
        info.setDataRecebimento("2014-06-10T09:00:00-03:00");
        info.setMotivo("jsoaosk");
        info.setNumeroProtocolo("490309504");
        info.setStatus("OK");
        info.setValidador("gfsfgsrg");
        info.setVersaoAplicacao("4.00");
        info.setIdentificador("ID798456123");
        return info;
    }

    public static DFNotaInfo getNFNotaInfo() {
        final DFNotaInfo info = new DFNotaInfo();
        info.setAvulsa(FabricaDeObjetosFake.getNFNotaInfoAvulsa());
        info.setCana(FabricaDeObjetosFake.getNFNotaInfoCana());
        info.setCobranca(FabricaDeObjetosFake.getNFNotaInfoCobranca());
        info.setCompra(FabricaDeObjetosFake.getNFNotaInfoCompra());
        info.setDestinatario(FabricaDeObjetosFake.getNFNotaInfoDestinatario());
        info.setEmitente(FabricaDeObjetosFake.getNFNotaInfoEmitente());
        info.setEntrega(FabricaDeObjetosFake.getNFNotaInfoLocal());
        info.setExportacao(FabricaDeObjetosFake.getNFNotaInfoExportacao());
        info.setPagamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoPagamento()));
        info.setIdentificacao(FabricaDeObjetosFake.getNFNotaInfoIdentificacao());
        info.setIdentificador("89172658591754401086218048846976493475937081");
        info.setInformacoesAdicionais(FabricaDeObjetosFake.getNFNotaInfoInformacoesAdicionais());
        info.setItens(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItem()));
        info.setRetirada(FabricaDeObjetosFake.getNFNotaInfoLocal());
        info.setTotal(FabricaDeObjetosFake.getNFNotaInfoTotal());
        info.setTransporte(FabricaDeObjetosFake.getNFNotaInfoTransporte());
        info.setVersao(new BigDecimal("4.00"));
        info.setPessoasAutorizadasDownloadNFe(Collections.singletonList(FabricaDeObjetosFake.getPessoaAutorizadaDownloadNFe()));
        return info;
    }

    public static DFNota getNotaQRCode() {
        //CAMPOS CONTIDOS NO EXEMPLO DO MANUAL DA RECEITA PARA GERAÇÃO DO QRCODE
        DFNota nota = new DFNota();
        nota.setInfo(new DFNotaInfo());
        nota.getInfo().setIdentificador("28140300156225000131650110000151341562040824");

        nota.getInfo().setDestinatario(new DFNotaInfoDestinatario());
        nota.getInfo().getDestinatario().setCnpj("13017959000181");

        nota.getInfo().setIdentificacao(new DFNotaInfoIdentificacao());
        nota.getInfo().getIdentificacao().setDataHoraEmissao(DateTime.parse("2014-03-18T10:55:33-03:00"));
        nota.getInfo().getIdentificacao().setUf(DFUnidadeFederativa.SE);

        nota.getInfo().setTotal(new DFNotaInfoTotal());
        nota.getInfo().getTotal().setIcmsTotal(new DFNotaInfoICMSTotal());
        nota.getInfo().getTotal().getIcmsTotal().getValorTotalNFe();
        nota.getInfo().getTotal().getIcmsTotal().setValorTotalNFe(new BigDecimal("60.90"));
        nota.getInfo().getTotal().getIcmsTotal().setValorTotalICMS(new BigDecimal("12.75"));

        nota.setAssinatura(new DFSignature());
        nota.getAssinatura().setSignedInfo(new DFSignedInfo());
        nota.getAssinatura().getSignedInfo().setReference(new DFReference());
        nota.getAssinatura().getSignedInfo().getReference().setDigestValue("yzGYhUx1/XYYzksWB+fPR3Qc50c=");

        return nota;
    }

    public static DFNotaInfoTransporte getNFNotaInfoTransporte() {
        final DFNotaInfoTransporte transporte = new DFNotaInfoTransporte();
        transporte.setIcmsTransporte(FabricaDeObjetosFake.getNFNotaInfoRetencaoICMSTransporte());
        transporte.setModalidadeFrete(NFModalidadeFrete.SEM_FRETE);
        transporte.setReboques(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoReboque()));
        transporte.setTransportador(FabricaDeObjetosFake.getNFNotaInfoTransportador());
        transporte.setVolumes(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoVolume()));
        return transporte;
    }

    public static DFNotaInfoTotal getNFNotaInfoTotal() {
        final DFNotaInfoTotal total = new DFNotaInfoTotal();
        total.setIcmsTotal(FabricaDeObjetosFake.getNFNotaInfoICMSTotal());
        total.setIssqnTotal(FabricaDeObjetosFake.getNFNotaInfoISSQNTotal());
        total.setRetencoesTributos(FabricaDeObjetosFake.getNFNotaInfoRetencoesTributos());
        return total;
    }

    public static DFNotaInfoItem getNFNotaInfoItem() {
        final DFNotaInfoItem item = new DFNotaInfoItem();
        item.setImposto(FabricaDeObjetosFake.getNFNotaInfoItemImposto());
        item.setInformacoesAdicionais("R3s36BVI9k15xOe3hnlEpZRpPHEom9inv4hE1oo8hzHYG8X6D9sQjt6oLYiH6yToSFM95zueMhE4s270GB7iLUKcQTRHWLcHb1TU2fSYx2NAz5ZflI3hoTnN8zmqJtGzneaNpDRA5gJW7wxMg9IXIuUCxg25MlIQ46AbDQNc3HLl82g3awWKigBMli0bUEWIMf8C2GG2sB2Y9w1GnsfiDvw7RUuU5vATfWWvYFRCehm2UpDhBlrBjjXcWKYzXsT3x2PNtCC82JqY1nkKrgt2AHCPUjM0tCQk5EHFcssb8I0Rkc4s8aNcARXtFrBzmWqXDQPmCpLIGaAo7LlypOKKaqUNqkRkf8c930p8HaRDvQJealZsVnpwJn3Ev7yEaBZ9INe5PXFwkTQEfpNE3B8IokFMh0aUbu8mfzjKLBazSKW2qA4faIo2Wp5FmOmTzCMiPqznOq3Bl0zM4wmuo0rOXbswjaCUzPB0KpM8Yaze9TArOEDrV6Li");
        item.setNumeroItem(990);
        item.setProduto(FabricaDeObjetosFake.getNFNotaInfoItemProduto());
        item.setImpostoDevolvido(FabricaDeObjetosFake.getNFImpostoDevolvido());
        return item;
    }

    public static DFNotaInfoInformacoesAdicionais getNFNotaInfoInformacoesAdicionais() {
        final DFNotaInfoInformacoesAdicionais infoAdicionais = new DFNotaInfoInformacoesAdicionais();
        infoAdicionais.setInformacoesAdicionaisInteresseFisco("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");
        infoAdicionais.setInformacoesComplementaresInteresseContribuinte("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");

        final ArrayList<DFNotaInfoObservacao> observacoesFisco = new ArrayList<>();
        observacoesFisco.add(FabricaDeObjetosFake.getNFNotaInfoObservacao());
        infoAdicionais.setObservacoesFisco(observacoesFisco);

        final ArrayList<DFNotaInfoObservacao> observacoesContribuinte = new ArrayList<>();
        observacoesContribuinte.add(FabricaDeObjetosFake.getNFNotaInfoObservacao());
        infoAdicionais.setObservacoesContribuinte(observacoesContribuinte);

        final ArrayList<DFNotaInfoProcessoReferenciado> processosRefenciado = new ArrayList<>();
        processosRefenciado.add(FabricaDeObjetosFake.getNFNotaInfoProcessoReferenciado());
        infoAdicionais.setProcessosRefenciado(processosRefenciado);
        return infoAdicionais;
    }

    public static DFNotaInfoIdentificacao getNFNotaInfoIdentificacao() {
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
        identificacao.setUf(DFUnidadeFederativa.RS);
        identificacao.setVersaoEmissor("532ng7VURPgovC5BYaZy");
        identificacao.setDataHoraContigencia(new DateTime(2014, 10, 10, 10, 10, 10));
        identificacao.setJustificativaEntradaContingencia("b1Aj7VBU5I0LDthlrWTk73otsFXSVbiNYyAgGZjLYT0pftpjhGzQEAtnolQoAEB3omnxNq8am4iMqwwviuaXRHjiYWY7YaPITlDN7cDN9obnhEqhDhkgKphRBY5frTfD6unwTB4w7j6hpY2zNNzWwbNJzPGgDmQ8WhBDnpq1fQOilrcDspY7SGkNDfjxpGTQyNSNsmF4B2uHHLhGhhxG2qVq2bFUvHFqSL8atQAuYpyn3wplW21v88N96PnF0MEV");
        identificacao.setIdentificadorLocalDestinoOperacao(NFIdentificadorLocalDestinoOperacao.OPERACAO_INTERNA);
        identificacao.setOperacaoConsumidorFinal(NFOperacaoConsumidorFinal.SIM);
        identificacao.setIndicadorPresencaComprador(NFIndicadorPresencaComprador.NAO_APLICA);
        return identificacao;
    }

    public static DFNotaInfoExportacao getNFNotaInfoExportacao() {
        final DFNotaInfoExportacao exportacao = new DFNotaInfoExportacao();
        exportacao.setUfEmbarqueProduto(DFUnidadeFederativa.RS);
        exportacao.setLocalEmbarqueProdutos("xEb99u9TExujbhMIcO9u9ycsZAg2gtKzIFgsUogoVjuyDAhnlkZz3I5Hpccm");
        exportacao.setLocalDespachoProdutos("xEb99u9TExujbhMIcO9u9ycsZAg2gtKzIFgsUogoVjuyDAhnlkZz3I5Hpccm");
        return exportacao;
    }

    public static DFNotaInfoLocal getNFNotaInfoLocal() {
        final DFNotaInfoLocal local = new DFNotaInfoLocal();
        local.setBairro("JE17uXBNBnYTSTSQgqXcGLOR6f22SnahtFHr5MoHQZtZhTowVe3SVwl57kil");
        local.setCnpj("12345678901234");
        local.setCodigoMunicipio("9999999");
        local.setComplemento("ifyKIg3j3eZtlNVAj3XJYZiJCrul6VLL85E7x6Kx6DVeChwlRLEkCQn7k5pe");
        local.setLogradouro("t59le7pl2eVn390y026Ebgh3HXtvEBzsMp4BzZJEwIazezToxeeKJCvm1GoG");
        local.setNomeMunicipio("OpXKhaHINo7OwLkVGvRq43HNwyBAgXTKcarl6Jsq8NzOBs70eZM4zL6fELOI");
        local.setNumero("YHTewrLNvzYaBmSbwxkDYcEZTCMORFVPAc6t6C5p0Bfu1globey70KWnaHHa");
        local.setUf(DFUnidadeFederativa.RS);
        return local;
    }

    public static DFNotaInfoEmitente getNFNotaInfoEmitente() {
        final DFNotaInfoEmitente emitente = new DFNotaInfoEmitente();
        emitente.setClassificacaoNacionalAtividadesEconomicas("0111111");
        emitente.setCpf("12345678901");
        emitente.setEndereco(FabricaDeObjetosFake.getNFEndereco());
        emitente.setInscricaoEstadual("12345678901234");
        emitente.setInscricaoEstadualSubstituicaoTributaria("84371964648860");
        emitente.setInscricaoMunicipal("zjfBnFVG8TBq8iW");
        emitente.setNomeFantasia("TKuTABBqcwEOeMwQepTIAvhOPx8qDf8Q5C8fbGgjonxl1ML9NErg9yVk2bGn");
        emitente.setRazaoSocial("Rhass3yMarv7W26gljGNMGXXyPZfSFDEiN472mTU7UWxokviyHMfeD7vCVg3");
        emitente.setRegimeTributario(NFRegimeTributario.NORMAL);
        return emitente;
    }

    public static DFNotaInfoDestinatario getNFNotaInfoDestinatario() {
        final DFNotaInfoDestinatario destinatario = new DFNotaInfoDestinatario();
        destinatario.setCnpj("12345678901234");
        destinatario.setEmail("ivU3ctXKzImStrYzRpDTXRyCfSzxlEe5GTbeyVZ1OlIvgKGLJJMJlaKtYj8K");
        destinatario.setEndereco(FabricaDeObjetosFake.getNFEndereco());
        destinatario.setInscricaoEstadual("13245678901234");
        destinatario.setInscricaoSuframa("999999999");
        destinatario.setRazaoSocial("F7HL85M9v7jW5lX4Z9V7sF3kshuj967gj4uACEmpmVQgM9yYeQAgaY5EcSfR");
        destinatario.setIndicadorIEDestinatario(NFIndicadorIEDestinatario.NAO_CONTRIBUINTE);
        destinatario.setInscricaoMunicipal("5ow5E1mZQPe1VUR");
        return destinatario;
    }

    public static DFNotaInfoCompra getNFNotaInfoCompra() {
        final DFNotaInfoCompra compra = new DFNotaInfoCompra();
        compra.setContrato("9tQtearTIcXmO9vxNr3TPhSaItw5mk3zyTVlf2aIFXqqvtXrHoa0qPWKzUzc");
        compra.setNotaDeEmpenho("abcefghijklmnopqrstuvx");
        compra.setPedido("1kG8gghJ0YTrUZnt00BJlOsFCtj43eV5mEHHXUzp3rD6QwwUwX4GPavXkMB1");
        return compra;
    }

    public static DFNotaInfoCobranca getNFNotaInfoCobranca() {
        final DFNotaInfoCobranca cobranca = new DFNotaInfoCobranca();
        cobranca.setFatura(FabricaDeObjetosFake.getNFNotaInfoFatura());
        cobranca.setDuplicatas(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoDuplicata()));
        return cobranca;
    }

    public static DFNotaInfoAvulsa getNFNotaInfoAvulsa() {
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
        avulsa.setUf(DFUnidadeFederativa.RS);
        avulsa.setValorTotalConstanteDocumentoArrecadacaoReceita(new BigDecimal("999999999999.99"));
        return avulsa;
    }

    public static DFInfoReferenciada getNFInfoReferenciada() {
        final DFInfoReferenciada referenciada = new DFInfoReferenciada();
        referenciada.setChaveAcessoCTReferenciada("19506188293993666630760813709064781438945816");
        return referenciada;
    }

    public static DFInfoModelo1Por1AReferenciada getNFInfoModelo1Por1AReferenciada() {
        final DFInfoModelo1Por1AReferenciada referenciada = new DFInfoModelo1Por1AReferenciada();
        referenciada.setAnoMesEmissaoNFe("1408");
        referenciada.setCnpj("12345678901234");

        referenciada.setModeloDocumentoFiscal("01");
        referenciada.setNumeroDocumentoFiscal("999999999");
        referenciada.setSerie(999);
        referenciada.setUf(DFUnidadeFederativa.RS);
        return referenciada;
    }

    public static DFInfoProdutorRuralReferenciada getNFInfoProdutorRuralReferenciada() {
        final DFInfoProdutorRuralReferenciada referenciada = new DFInfoProdutorRuralReferenciada();
        referenciada.setAnoMesEmissao("1402");
        referenciada.setCnpjEmitente("12345678901234");
        referenciada.setIeEmitente("789456");
        referenciada.setModeloDocumentoFiscal("IE");
        referenciada.setNumeroDocumentoFiscal(999999);
        referenciada.setSerieDocumentoFiscal(999);
        referenciada.setUfEmitente(DFUnidadeFederativa.RS);
        return referenciada;
    }

    public static DFInfoCupomFiscalReferenciado getNFInfoCupomFiscalReferenciado() {
        final DFInfoCupomFiscalReferenciado referenciado = new DFInfoCupomFiscalReferenciado();
        referenciado.setModeloDocumentoFiscal("55");
        referenciado.setNumeroContadorOrdemOperacao("NUQvJH");
        referenciado.setNumeroOrdemSequencialECF("a71");
        return referenciado;
    }

    public static NFEndereco getNFEndereco() {
        final NFEndereco endereco = new NFEndereco();
        endereco.setBairro("67LQFlXOBK0JqAE1rFi2CEyUGW5Z8QmmHhzmZ9GABVLKa9AbV0uFR0onl7nU");
        endereco.setCep("88095550");
        endereco.setCodigoMunicipio("9999999");
        endereco.setCodigoPais("1058");
        endereco.setComplemento("Fr3gSvoAeKbGpQD3r98KFeB50P3Gq14XBVsv5fpiaBvJ3HTOpREiwYGs20Xw");
        endereco.setDescricaoMunicipio("s1Cr2hWP6bptQ80A9vWBuTaODR1U82LtKQi1DEm3LsAXu9AbkSeCtfXJVTKG");
        endereco.setLogradouro("NKwaAJ5ZJ49aQYmqBvxMhBzkGUqvtXnqusGEtjDzKCXPGwrEZCS8LGKHyBbV");
        endereco.setNumero("11mzXHR8rZTgfE35EqfGhiShiIwQfLCAziFDXVgs3EjLSPkZkCvfGNLMEf5y");
        endereco.setTelefone("12345678901324");
        endereco.setUf(DFUnidadeFederativa.RS);
        return endereco;
    }

    public static DFNotaInfoItemDetalheExportacao getNFNotaInfoItemDetalheExportacao() {
        final DFNotaInfoItemDetalheExportacao detalheExportacao = new DFNotaInfoItemDetalheExportacao();
        detalheExportacao.setExportacaoIndireta(FabricaDeObjetosFake.getNFNotaInfoItemExportacaoIndireta());
        detalheExportacao.setNumeroAtoConcessorioDrawback(new BigInteger("99999999999"));
        return detalheExportacao;
    }

    public static DFNotaInfoItemProduto getNFNotaInfoItemProduto() {
        final DFNotaInfoItemProduto produto = new DFNotaInfoItemProduto();
        produto.setCfop("1302");
        produto.setCodigo("ohVRInAS7jw8LNDP4WWjssSjBHK8nJRERnAeRMcsUokF3YItT93fBto3zZcq");
        produto.setCodigoDeBarras("36811963532505");
        produto.setCodigoDeBarrasTributavel("36811963532505");
        produto.setCampoeValorNota(NFProdutoCompoeValorNota.SIM);
        produto.setDeclaracoesImportacao(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoDeclaracaoImportacao()));
        produto.setDescricao("OBS0ztekCoG0DSSVcQwPKRV2fV842Pye7mED13P4zoDczcXi4AMNvQ7BKBLnHtLc2Z9fuIY1pcKmXSK1IJQSLEs5QWvVGyC74DyJuIM0X7L0cqWPZQii5JtP");
        produto.setExtipi("999");
        produto.setCodigoEspecificadorSituacaoTributaria("9999999");
        produto.setMedicamentos(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoMedicamento()));
        produto.setNcm("99999999");
        produto.setNumeroPedidoCliente("NNxQ9nrQ3HCe5Mc");
        produto.setNumeroPedidoItemCliente(999999);
        produto.setQuantidadeComercial(new BigDecimal("9999999999.9999"));
        produto.setQuantidadeTributavel(new BigDecimal("9999999999.9999"));
        produto.setUnidadeComercial("Bta64y");
        produto.setUnidadeTributavel("7wqG4h");
        produto.setValorDesconto(new BigDecimal("999999999999.99"));
        produto.setValorFrete(new BigDecimal("999999999999.99"));
        produto.setValorOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        produto.setValorSeguro(new BigDecimal("999999999999.99"));
        produto.setValorTotalBruto(new BigDecimal("999999999999.99"));
        produto.setValorUnitario(new BigDecimal("9999999999.9999999999"));
        produto.setNomeclaturaValorAduaneiroEstatistica(Collections.singletonList("AZ0123"));
        produto.setValorUnitarioTributavel(new BigDecimal("9999999999.9999999999"));
        return produto;
    }

    public static DFNotaInfoItemImposto getNFNotaInfoItemImposto() {
        final DFNotaInfoItemImposto imposto = new DFNotaInfoItemImposto();
        imposto.setCofins(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINS());
        imposto.setCofinsst(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSST());
        imposto.setIcms(FabricaDeObjetosFake.getNFNotaInfoItemImpostoICMS());
        imposto.setImpostoImportacao(FabricaDeObjetosFake.getNFNotaInfoItemImpostoImportacao());
        imposto.setIpi(FabricaDeObjetosFake.getNFNotaInfoItemImpostoIPI());
        imposto.setPis(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPIS());
        imposto.setPisst(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISST());
        imposto.setIcmsUfDestino(FabricaDeObjetosFake.getNFNotaaInfoItemImpostoICMSUFDestino());
        imposto.setValorTotalTributos(new BigDecimal("999999999999.99"));
        return imposto;
    }

    public static DFNotaInfoItemProdutoVeiculo getNFNotaInfoItemProdutoVeiculo() {
        final DFNotaInfoItemProdutoVeiculo produtoVeiculo = new DFNotaInfoItemProdutoVeiculo();
        produtoVeiculo.setAnoFabricacao(2014);
        produtoVeiculo.setAnoModeloFabricacao(2014);
        produtoVeiculo.setCapacidadeMaximaTracao(new BigDecimal("9999.9999"));
        produtoVeiculo.setChassi("B31YTE9INXEYDMO4C");
        produtoVeiculo.setCilindrada("ohNx");
        produtoVeiculo.setCodigoCor("123A");
        produtoVeiculo.setCodigoCorDENATRAN(NFNotaInfoVeiculoCor.FANTASIA);
        produtoVeiculo.setCodigoMarcaModelo("542562");
        produtoVeiculo.setCondicao(NFNotaInfoItemProdutoVeiculoCondicao.ACABADO);
        produtoVeiculo.setCondicaoChassi(NFNotaInfoItemProdutoVeiculoCondicaoChassi.NORMAL);
        produtoVeiculo.setDescricaoCor("tjRQlvBqVsFLDWUCaOeaXRbV1ipOZH3W5H7Ic2p9");
        produtoVeiculo.setDistanciaEntreEixos("9999");
        produtoVeiculo.setEspecieVeiculo(NFNotaInfoEspecieVeiculo.CORRIDA);
        produtoVeiculo.setLotacao(999);
        produtoVeiculo.setNumeroMotor("u1DU8GZRzJZzevuY49IB9");
        produtoVeiculo.setNumeroSerie("XBxVyiVVD");
        produtoVeiculo.setPesoBruto(new BigDecimal("9999.9999"));
        produtoVeiculo.setPesoLiquido(new BigDecimal("9999.9999"));
        produtoVeiculo.setPotencia("GZRz");
        produtoVeiculo.setRestricao(NFNotaInfoItemProdutoVeiculoRestricao.PENHOR);
        produtoVeiculo.setTipoCombustivel(NFNotaInfoCombustivelTipo.GASOLINA);
        produtoVeiculo.setTipoOperacao(NFNotaInfoItemProdutoVeiculoTipoOperacao.OUTROS);
        produtoVeiculo.setTipoPintura("A");
        produtoVeiculo.setTipoVeiculo(NFNotaInfoTipoVeiculo.AUTOMOVEL);
        return produtoVeiculo;
    }

    public static DFNotaInfoItemProdutoMedicamento getNFNotaInfoItemProdutoMedicamento() {
        final DFNotaInfoItemProdutoMedicamento medicamento = new DFNotaInfoItemProdutoMedicamento();
        medicamento.setDataFabricacao(new LocalDate(2014, 1, 1));
        medicamento.setDataValidade(new LocalDate(2015, 1, 1));
        medicamento.setLote("yq50jVDZsvQVNuWoS45U");
        medicamento.setPrecoMaximoConsumidor(new BigDecimal("999999999999.99"));
        medicamento.setQuantidade(new BigDecimal("9999999.999"));
        return medicamento;
    }

    public static DFNotaInfoItemProdutoDeclaracaoImportacao getNFNotaInfoItemProdutoDeclaracaoImportacao() {
        final DFNotaInfoItemProdutoDeclaracaoImportacao declaraoImportacao = new DFNotaInfoItemProdutoDeclaracaoImportacao();
        declaraoImportacao.setAdicoes(Collections.singletonList(FabricaDeObjetosFake.getNFNotaInfoItemProdutoDeclaracaoImportacaoAdicao()));
        declaraoImportacao.setCodigoExportador("E9jBqM65b0MiCiRnYil203iNGJOSZs8iU1KGmQsj2N0kw6QMuvhbsQosFGcU");
        declaraoImportacao.setDataDesembaraco(new LocalDate(2014, 1, 1));
        declaraoImportacao.setDataRegistro(new LocalDate(2014, 2, 2));
        declaraoImportacao.setLocalDesembaraco("kiVfWKB94ggsrWND0XBXwEjJkoiTXhkmX9qKGKzjpnEHHp852bDkYeEUkzpU");
        declaraoImportacao.setNumeroRegistro("ZRJihqWLyHnb");
        declaraoImportacao.setUfDesembaraco(DFUnidadeFederativa.RS);
        declaraoImportacao.setTransporteInternacional(NFViaTransporteInternacional.AEREA);
        declaraoImportacao.setValorAFRMM(new BigDecimal("999999999999.99"));
        declaraoImportacao.setFormaImportacaoIntermediacao(NFFormaImportacaoIntermediacao.IMPORTACAO_ENCOMENDA);
        declaraoImportacao.setCnpj("12345678901234");
        declaraoImportacao.setUfTerceiro(DFUnidadeFederativa.RS);
        return declaraoImportacao;
    }

    public static DFNotaInfoItemProdutoCombustivel getNFNotaInfoItemProdutoCombustivel() {
        final DFNotaInfoItemProdutoCombustivel combustivel = new DFNotaInfoItemProdutoCombustivel();
        combustivel.setCide(FabricaDeObjetosFake.getNFNotaInfoItemProdutoCombustivelCIDE());
        combustivel.setCodigoAutorizacaoCODIF("Cirh89sPDDbnFAzZMPpmG");
        combustivel.setCodigoProdutoANP("999999999");
        combustivel.setQuantidade(new BigDecimal("99999999999.9999"));
        combustivel.setUf(DFUnidadeFederativa.RS);
        combustivel.setPercentualGasNatural(new BigDecimal("99.99"));
        return combustivel;
    }

    public static DFNotaInfoItemProdutoArmamento getNFNotaInfoItemProdutoArmamento() {
        final DFNotaInfoItemProdutoArmamento armamento = new DFNotaInfoItemProdutoArmamento();
        armamento.setDescricao("lkVlEEeoLx8TnDSJ7ZfB0ohZacch9JMIT0lEOsXkSI1KDOWcOI3PjKe6QMAUeLitJ0aAi1LIGpKmN0sVZtp00qqzmgfySvraI98bmPN0RreMa1eDZwLQG2o46TT3vMHkZgBRZ6ofxUCLjUEgU7b2YZynsUuM3szCDup0TuUCjBULJEB8TTr4rCcLD1rCeVBljaFoclt16oQXio2UUEYXjgcCVpftSE0uamx3Ni2GCwlUQ4CCBAaVZv7VA79xWrMV");
        armamento.setNumeroSerieArma("G2LeQIr4F");
        armamento.setNumeroSerieCano("DCXuiWRlE");
        armamento.setTipo(NFNotaInfoItemProdutoArmamentoTipo.PERMITIDO);
        return armamento;
    }

    public static DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao getNFNotaInfoItemProdutoDeclaracaoImportacaoAdicao() {
        final DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao importacaoAdicao = new DFNotaInfoItemProdutoDeclaracaoImportacaoAdicao();
        importacaoAdicao.setCodigoFabricante("sA2FBRFMMNgF1AKRDDXYOlc3zGvzEc69l6zQ5O5uAUe82XZ3szQfw01DW0Ki");
        importacaoAdicao.setDesconto(new BigDecimal("999999999999.99"));
        importacaoAdicao.setNumero(999);
        importacaoAdicao.setSequencial(999);
        importacaoAdicao.setNumeroAtoConcessorioDrawback(new BigInteger("99999999999"));
        return importacaoAdicao;
    }

    public static DFNotaInfoItemProdutoCombustivelCIDE getNFNotaInfoItemProdutoCombustivelCIDE() {
        final DFNotaInfoItemProdutoCombustivelCIDE cide = new DFNotaInfoItemProdutoCombustivelCIDE();
        cide.setQuantidadeBCCIDE(new BigDecimal("99999999999.9999"));
        cide.setValor(new BigDecimal("999999999999.99"));
        cide.setValorAliquota(new BigDecimal("9999999999.9999"));
        return cide;
    }

    public static DFNotaInfoItemImpostoPIS getNFNotaInfoItemImpostoPIS() {
        final DFNotaInfoItemImpostoPIS pis = new DFNotaInfoItemImpostoPIS();
        pis.setAliquota(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISAliquota());
        return pis;
    }

    public static DFNotaInfoItemImpostoISSQN getNFNotaInfoItemImpostoISSQN() {
        final DFNotaInfoItemImpostoISSQN impostoISSQN = new DFNotaInfoItemImpostoISSQN();
        impostoISSQN.setCodigoMunicipio(9999999);
        impostoISSQN.setItemListaServicos("25.01");
        impostoISSQN.setValor(new BigDecimal("999999999999.99"));
        impostoISSQN.setValorAliquota(new BigDecimal("99.99"));
        impostoISSQN.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        impostoISSQN.setCodigoMunicipioIncidenciaImposto("3813816");
        impostoISSQN.setCodigoPais("8486");
        impostoISSQN.setCodigoServico("VfsQTgAm60yAqyOMUOIp");
        impostoISSQN.setIndicadorExigibilidadeISS(NFNotaInfoItemIndicadorExigibilidadeISS.EXIGIVEL);
        impostoISSQN.setIndicadorIncentivoFiscal(NFNotaInfoItemIndicadorIncentivoFiscal.SIM);
        impostoISSQN.setNumeroProcesso("Sw4CSjke5lhAzlBrzFgKuNjtrRSVfO");
        impostoISSQN.setValorDeducao(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorDescontoCondicionado(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorDescontoIncondicionado(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorOutro(new BigDecimal("99999999999.99"));
        impostoISSQN.setValorRetencaoISS(new BigDecimal("99999999999.99"));
        return impostoISSQN;
    }

    public static DFNotaInfoItemImpostoIPI getNFNotaInfoItemImpostoIPI() {
        final DFNotaInfoItemImpostoIPI ipi = new DFNotaInfoItemImpostoIPI();
        ipi.setClasseEnquadramento("157br");
        ipi.setCnpjProdutor("12345678901234");
        ipi.setCodigoEnquadramento("aT2");
        ipi.setCodigoSelo("iNEFifS1jexTxcCvgjlQ186nR6JAwM2koyjbWKA1DJSLmZy432GoSwoygXc5");
        ipi.setQuantidadeSelo(new BigInteger("999999999999"));
        ipi.setTributado(FabricaDeObjetosFake.getNFNotaInfoItemImpostoIPITributado());
        return ipi;
    }

    public static DFNotaInfoItemImpostoImportacao getNFNotaInfoItemImpostoImportacao() {
        final DFNotaInfoItemImpostoImportacao importacao = new DFNotaInfoItemImpostoImportacao();
        importacao.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        importacao.setValorDespesaAduaneira(new BigDecimal("999999999999.99"));
        importacao.setValorImpostoImportacao(new BigDecimal("999999999999.99"));
        importacao.setValorIOF(new BigDecimal("999999999999.99"));
        return importacao;
    }

    public static DFNotaInfoItemImpostoCOFINS getNFNotaInfoItemImpostoCOFINS() {
        final DFNotaInfoItemImpostoCOFINS cofins = new DFNotaInfoItemImpostoCOFINS();
        cofins.setAliquota(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSAliquota());
        return cofins;
    }

    public static DFNotaInfoItemImpostoICMS getNFNotaInfoItemImpostoICMS() {
        final DFNotaInfoItemImpostoICMS icms = new DFNotaInfoItemImpostoICMS();
        icms.setIcms00(FabricaDeObjetosFake.getNFNotaInfoItemImpostoICMS00());
        return icms;
    }

    public static DFNotaInfoItemImpostoICMS00 getNFNotaInfoItemImpostoICMS00() {
        final DFNotaInfoItemImpostoICMS00 icms00 = new DFNotaInfoItemImpostoICMS00();
        icms00.setModalidadeBCICMS(NFNotaInfoItemModalidadeBCICMS.PAUTA);
        icms00.setOrigem(NFOrigem.NACIONAL);
        icms00.setPercentualAliquota(new BigDecimal("99.99"));
        icms00.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.TRIBUTACAO_INTEGRALMENTE);
        icms00.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        icms00.setValorTributo(new BigDecimal("999999999999.99"));
        return icms00;
    }

    public static DFNotaInfoItemImpostoIPITributado getNFNotaInfoItemImpostoIPITributado() {
        final DFNotaInfoItemImpostoIPITributado ipiTributado = new DFNotaInfoItemImpostoIPITributado();
        ipiTributado.setSituacaoTributaria(NFNotaInfoSituacaoTributariaIPI.OUTRAS_ENTRADAS);
        ipiTributado.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        ipiTributado.setPercentualAliquota(new BigDecimal("99.99"));
        ipiTributado.setValorTributo(new BigDecimal("999999999999.99"));
        return ipiTributado;
    }

    public static DFNotaInfoItemImpostoIPINaoTributado getNFNotaInfoItemImpostoIPINaoTributado() {
        final DFNotaInfoItemImpostoIPINaoTributado ipiNaoTributado = new DFNotaInfoItemImpostoIPINaoTributado();
        ipiNaoTributado.setSituacaoTributaria(NFNotaInfoSituacaoTributariaIPI.SAIDA_ISENTA);
        return ipiNaoTributado;
    }

    public static DFNotaInfoItemImpostoPISST getNFNotaInfoItemImpostoPISST() {
        final DFNotaInfoItemImpostoPISST impostoPISST = new DFNotaInfoItemImpostoPISST();
        impostoPISST.setValorAliquota(new BigDecimal("9999999999.9999"));
        impostoPISST.setQuantidadeVendida(new BigDecimal("99999999999.9999"));
        impostoPISST.setValorTributo(new BigDecimal("999999999999.99"));
        return impostoPISST;
    }

    public static DFNotaInfoItemImpostoPISQuantidade getNFNotaInfoItemImpostoPISQuantidade() {
        final DFNotaInfoItemImpostoPISQuantidade pisQuantidade = new DFNotaInfoItemImpostoPISQuantidade();
        pisQuantidade.setQuantidadeVendida(new BigDecimal("99999999999.9999"));
        pisQuantidade.setSituacaoTributaria(NFNotaInfoSituacaoTributariaPIS.OPERACAO_TRIBUTAVEL_QUANTIDADE_VENDIDA_POR_ALIQUOTA_POR_UNIDADE_PRODUTO);
        pisQuantidade.setValorAliquota(new BigDecimal("9999999999.9999"));
        pisQuantidade.setValorTributo(new BigDecimal("999999999999.99"));
        return pisQuantidade;
    }

    public static DFNotaInfoItemImpostoPISOutrasOperacoes getNFNotaInfoItemImpostoPISOutrasOperacoes() {
        final DFNotaInfoItemImpostoPISOutrasOperacoes pisOutrasOperacoes = new DFNotaInfoItemImpostoPISOutrasOperacoes();
        pisOutrasOperacoes.setSituacaoTributaria(NFNotaInfoSituacaoTributariaPIS.OUTRAS_OPERACOES_SAIDA);
        pisOutrasOperacoes.setQuantidadeVendida(new BigDecimal("99999999999.9999"));
        pisOutrasOperacoes.setValorAliquota(new BigDecimal("9999999999.9999"));
        pisOutrasOperacoes.setValorTributo(new BigDecimal("999999999999.99"));
        return pisOutrasOperacoes;
    }

    public static DFNotaInfoItemImpostoPISNaoTributado getNFNotaInfoItemImpostoPISNaoTributado() {
        final DFNotaInfoItemImpostoPISNaoTributado pisNaoTributado = new DFNotaInfoItemImpostoPISNaoTributado();
        pisNaoTributado.setSituacaoTributaria(NFNotaInfoSituacaoTributariaPIS.OPERACAO_TRIBUTAVEL_MONOFASICA_ALIQUOTA_ZERO);
        return pisNaoTributado;
    }

    public static DFNotaInfoItemImpostoPISAliquota getNFNotaInfoItemImpostoPISAliquota() {
        final DFNotaInfoItemImpostoPISAliquota pisAliquota = new DFNotaInfoItemImpostoPISAliquota();
        pisAliquota.setPercentualAliquota(new BigDecimal("99.99"));
        pisAliquota.setSituacaoTributaria(NFNotaInfoSituacaoTributariaPIS.OPERACAO_TRIBUTAVEL_CUMULATIVO_NAO_CUMULATIVO);
        pisAliquota.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        pisAliquota.setValorTributo(new BigDecimal("999999999999.99"));
        return pisAliquota;
    }

    public static DFNotaInfoItemImpostoCOFINSST getNFNotaInfoItemImpostoCOFINSST() {
        final DFNotaInfoItemImpostoCOFINSST cofins = new DFNotaInfoItemImpostoCOFINSST();
        cofins.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        cofins.setPercentualAliquota(new BigDecimal("99.99"));
        cofins.setValorCOFINS(new BigDecimal("999999999999"));
        return cofins;
    }

    public static DFNotaInfoItemImpostoCOFINSQuantidade getNFNotaInfoItemImpostoCOFINSQuantidade() {
        final DFNotaInfoItemImpostoCOFINSQuantidade cofinsQuantidade = new DFNotaInfoItemImpostoCOFINSQuantidade();
        cofinsQuantidade.setQuantidadeVendida(new BigDecimal("99999999999.9999"));
        cofinsQuantidade.setSituacaoTributaria(NFNotaInfoSituacaoTributariaCOFINS.OPERACAO_TRIBUTAVEL_QUANTIDADE_VENDIDA_POR_ALIQUOTA_POR_UNIDADE_PRODUTO);
        cofinsQuantidade.setValorAliquota(new BigDecimal("9999999999"));
        cofinsQuantidade.setValorTributo(new BigDecimal("999999999999"));
        return cofinsQuantidade;
    }

    public static DFNotaInfoItemImpostoCOFINSOutrasOperacoes getNFNotaInfoItemImpostoCOFINSOutrasOperacoes() {
        final DFNotaInfoItemImpostoCOFINSOutrasOperacoes outrasOperacoes = new DFNotaInfoItemImpostoCOFINSOutrasOperacoes();
        outrasOperacoes.setPercentualCOFINS(new BigDecimal("99.99"));
        outrasOperacoes.setQuantidadeVendida(new BigDecimal("99999999999.9999"));
        outrasOperacoes.setSituacaoTributaria(NFNotaInfoSituacaoTributariaCOFINS.OUTRAS_OPERACOES_SAIDA);
        outrasOperacoes.setValorAliquota(new BigDecimal("9999999999"));
        outrasOperacoes.setValorBaseCalculo(new BigDecimal("999999999999"));
        outrasOperacoes.setValorCOFINS(new BigDecimal("999999999999"));
        return outrasOperacoes;
    }

    public static DFNotaInfoItemImpostoCOFINSNaoTributavel getNFNotaInfoItemImpostoCOFINSNaoTributavel() {
        final DFNotaInfoItemImpostoCOFINSNaoTributavel cofinsNaoTributado = new DFNotaInfoItemImpostoCOFINSNaoTributavel();
        cofinsNaoTributado.setSituacaoTributaria(NFNotaInfoSituacaoTributariaCOFINS.OPERACAO_TRIBUTAVEL_MONOFASICA_ALIQUOTA_ZERO);
        return cofinsNaoTributado;
    }

    public static DFNotaInfoItemImpostoCOFINSAliquota getNFNotaInfoItemImpostoCOFINSAliquota() {
        final DFNotaInfoItemImpostoCOFINSAliquota cofinsAliquota = new DFNotaInfoItemImpostoCOFINSAliquota();
        cofinsAliquota.setPercentualAliquota(new BigDecimal("99.99"));
        cofinsAliquota.setSituacaoTributaria(NFNotaInfoSituacaoTributariaCOFINS.OPERACAO_TRIBUTAVEL_CUMULATIVO_NAO_CUMULATIVO);
        cofinsAliquota.setValor(new BigDecimal("999999999999.99"));
        cofinsAliquota.setValorBaseCalulo(new BigDecimal("999999999999.99"));
        return cofinsAliquota;
    }

    public static DFNotaInfoRetencoesTributos getNFNotaInfoRetencoesTributos() {
        final DFNotaInfoRetencoesTributos retencoesTributos = new DFNotaInfoRetencoesTributos();
        retencoesTributos.setBaseCalculoIRRF(new BigDecimal("999999999999.99"));
        retencoesTributos.setBaseCalculoRetencaoPrevidenciaSocial(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetencaoPrevidenciaSocial(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetidoCOFINS(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetidoCSLL(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetidoIRRF(new BigDecimal("999999999999.99"));
        retencoesTributos.setValorRetidoPIS(new BigDecimal("999999999999.99"));
        return retencoesTributos;
    }

    public static DFNotaInfoISSQNTotal getNFNotaInfoISSQNTotal() {
        final DFNotaInfoISSQNTotal issqnTotal = new DFNotaInfoISSQNTotal();
        issqnTotal.setBaseCalculoISS(new BigDecimal("999999999999.99"));
        issqnTotal.setValorCOFINSsobreServicos(new BigDecimal("999999999999.99"));
        issqnTotal.setValorPISsobreServicos(new BigDecimal("999999999999.99"));
        issqnTotal.setValorTotalISS(new BigDecimal("999999999999.99"));
        issqnTotal.setValorTotalServicosSobNaoIncidenciaNaoTributadosICMS(new BigDecimal("999999999999.99"));
        issqnTotal.setDataPrestacaoServico(new LocalDate(2014, 1, 1));
        issqnTotal.setValorDeducao(new BigDecimal("999999999999.99"));
        issqnTotal.setValorOutros(new BigDecimal("999999999999.99"));
        issqnTotal.setValorTotalDescontoIncondicionado(new BigDecimal("999999999999.99"));
        issqnTotal.setValorTotalDescontoCondicionado(new BigDecimal("999999999999.99"));
        issqnTotal.setValorTotalRetencaoISS(new BigDecimal("999999999999.99"));
        issqnTotal.setTributacao(NFNotaInfoRegimeEspecialTributacao.SOCIEDADE_PROFISSIONAIS);
        return issqnTotal;
    }

    public static DFNotaInfoICMSTotal getNFNotaInfoICMSTotal() {
        final DFNotaInfoICMSTotal icmsTotal = new DFNotaInfoICMSTotal();
        icmsTotal.setBaseCalculoICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setOutrasDespesasAcessorias(new BigDecimal("999999999999.99"));
        icmsTotal.setBaseCalculoICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorCOFINS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorPIS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDesconto(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalDosProdutosServicos(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalFrete(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMS(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalICMSST(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalII(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalIPI(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalNFe(new BigDecimal("999999999999.99"));
        icmsTotal.setValorTotalSeguro(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSDesonerado(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSFundoCombatePobreza(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaDestinatario(new BigDecimal("999999999999.99"));
        icmsTotal.setValorICMSPartilhaRementente(new BigDecimal("999999999999.99"));
        return icmsTotal;
    }

    public static DFNotaInfoVeiculo getNFNotaInfoVeiculo() {
        final DFNotaInfoVeiculo veiculo = new DFNotaInfoVeiculo();
        veiculo.setPlacaVeiculo("MKZ8159");
        veiculo.setRegistroNacionalTransportadorCarga("8Io5YKSKW1qy3v7zGwLx");
        veiculo.setUf(DFUnidadeFederativa.SP);
        return veiculo;
    }

    public static DFNotaInfoTransportador getNFNotaInfoTransportador() {
        final DFNotaInfoTransportador transportador = new DFNotaInfoTransportador();
        transportador.setCnpj("34843274000164");
        transportador.setEnderecoComplemento("D8nOWsHxI5K4RgYTUGwWgIKajhiUf4Q7aOOmaTV2wnYV0kQ5MezOjqfoPcNY");
        transportador.setInscricaoEstadual("ISENTO");
        transportador.setNomeMunicipio("4lb4Qv5yi9oYq7s8fF98a0EEv98oAxl0CIs5gzyKNVp1skE3IHD9Z7JbjHCn");
        transportador.setRazaoSocial("4lb4Qv5yi9oYq7s8fF98a0EEv98oAxl0CIs5gzyKNVp1skE3IHD9Z7JbjHCn");
        transportador.setUf(DFUnidadeFederativa.SP);
        return transportador;
    }

    public static DFNotaInfoReboque getNFNotaInfoReboque() {
        final DFNotaInfoReboque reboque = new DFNotaInfoReboque();
        reboque.setPlacaVeiculo("MKZ4891");
        reboque.setUf(DFUnidadeFederativa.SC);
        return reboque;
    }

    public static DFNotaInfoRetencaoICMSTransporte getNFNotaInfoRetencaoICMSTransporte() {
        final DFNotaInfoRetencaoICMSTransporte retencaoICMSTransporte = new DFNotaInfoRetencaoICMSTransporte();
        retencaoICMSTransporte.setAliquotaRetencao(new BigDecimal("99.99"));
        retencaoICMSTransporte.setBcRetencaoICMS(new BigDecimal("999999999999.99"));
        retencaoICMSTransporte.setCfop(5351);
        retencaoICMSTransporte.setCodigoMunicipioOcorrenciaFatoGeradorICMSTransporte("9999999");
        retencaoICMSTransporte.setValorICMSRetido(new BigDecimal("999999999999.99"));
        retencaoICMSTransporte.setValorServico(new BigDecimal("999999999999.99"));
        return retencaoICMSTransporte;
    }

    public static DFNotaInfoCanaDeducao getNFNotaInfoCanaDeducao() {
        final DFNotaInfoCanaDeducao infoCanaDeducao = new DFNotaInfoCanaDeducao();
        infoCanaDeducao.setDescricaoDeducao("67TgthEHf2gowJBy4PZ3ulgaDDAi80s27pIzYK6DJORNAPqL7vJ5ZbQShDcA");
        infoCanaDeducao.setValorDeducao(new BigDecimal("1000"));
        return infoCanaDeducao;
    }

    public static DFNotaInfoCanaFornecimentoDiario getNFNotaInfoCanaFornecimentoDiario() {
        final DFNotaInfoCanaFornecimentoDiario canaFornecimentoDiario = new DFNotaInfoCanaFornecimentoDiario();
        canaFornecimentoDiario.setDia(15);
        canaFornecimentoDiario.setQuantidade(new BigDecimal("3"));
        return canaFornecimentoDiario;
    }

    public static DFNotaInfoCana getNFNotaInfoCana() {
        final DFNotaInfoCana infoCana = new DFNotaInfoCana();
        infoCana.setDeducoes(new ArrayList<DFNotaInfoCanaDeducao>());
        final ArrayList<DFNotaInfoCanaFornecimentoDiario> infosCanaFornecimentoDario = new ArrayList<>();
        infosCanaFornecimentoDario.add(FabricaDeObjetosFake.getNFNotaInfoCanaFornecimentoDiario());
        infoCana.setFornecimentosDiario(infosCanaFornecimentoDario);
        infoCana.setReferencia("06/2013");
        infoCana.setSafra("2013/2014");
        infoCana.setValorFornecimento(new BigDecimal("900"));
        infoCana.setValorLiquidoFornecimento(new BigDecimal("980"));
        infoCana.setValorTotalDeducao(new BigDecimal("2000.70"));
        infoCana.setQuantidadeTotalAnterior(new BigDecimal("10"));
        infoCana.setQuantidadeTotalGeral(new BigDecimal("80"));
        infoCana.setQuantidadeTotalMes(new BigDecimal("30.0000001"));

        return infoCana;
    }

    public static DFNotaInfoObservacao getNFNotaInfoObservacao() {
        final DFNotaInfoObservacao observacao = new DFNotaInfoObservacao();
        observacao.setIdentificacaoCampo("kRkrK4FGWOn27RSjYjMB");
        observacao.setConteudoCampo("ML73tIXUvsLEMijwgwjHVRfpP6upxiuipvEcQcSp8fpV402GXe3nXEHXJKJo");
        return observacao;
    }

    public static DFNotaInfoProcessoReferenciado getNFNotaInfoProcessoReferenciado() {
        final DFNotaInfoProcessoReferenciado processoReferenciado = new DFNotaInfoProcessoReferenciado();
        processoReferenciado.setIdentificadorProcessoOuAtoConcessorio("SziSRSIRZvYWlxcbmmJfRZsLgVHaHTurUL9ea1kwFe7fssrxTVSK6uaFwGO5");
        processoReferenciado.setIndicadorOrigemProcesso(NFOrigemProcesso.JUSTICA_FEDERAL);
        return processoReferenciado;
    }

    public static DFNotaInfoFatura getNFNotaInfoFatura() {
        final DFNotaInfoFatura fatura = new DFNotaInfoFatura();
        fatura.setNumeroFatura("KDVAp0aewPjmHaTsjbDX1O6NOR9tc7TxGflFLXsMZt2hEKar3oqzZ11uzEQF");
        fatura.setValorDesconto(new BigDecimal("0.15"));
        fatura.setValorLiquidoFatura(new BigDecimal("3000"));
        fatura.setValorOriginalFatura(new BigDecimal("3001.15"));
        return fatura;
    }

    public static DFNotaInfoDuplicata getNFNotaInfoDuplicata() {
        final DFNotaInfoDuplicata duplicata = new DFNotaInfoDuplicata();
        duplicata.setDataVencimento(new LocalDate(2014, 7, 10));
        duplicata.setNumeroDuplicata("TQ49cyOL5KtBAUTF0LShhThpUbtCK1fQH1PH4AMcKzMNLxyDbV957IRhWK8Z");
        duplicata.setValorDuplicata(new BigDecimal("999999.99"));
        return duplicata;
    }

    public static DFNotaInfoVolume getNFNotaInfoVolume() {
        final DFNotaInfoVolume volume = new DFNotaInfoVolume();
        volume.setEspecieVolumesTransportados("3Qf46HFs7FcWlhuQqLJ96vsrgJHu6B5ZXmmwMZ1RtvQVOV4Yp6M9VNqn5Ecb");
        final DFNotaInfoLacre notaInfoLacre = new DFNotaInfoLacre();
        notaInfoLacre.setNumeroLacre("gvmjb9BB2cmwsLbzeR3Bsk8QbA7b1XEgXUhKeS9QZGiwhFnqDtEzS3377MP2");
        volume.setLacres(Collections.singletonList(notaInfoLacre));
        volume.setMarca("lc0w13Xw2PxsSD4u4q3N6Qix9ZuCFm0HXo6BxBmKnjVbh9Xwy3k9UwBNfuYo");
        volume.setNumeracaoVolumesTransportados("mcBUtZwnI5DKj2YZNAcLP7W9h6j1xKmF5SX1BTKmsvyg0H5xSrfVw8HGn8eb");
        volume.setPesoBruto(new BigDecimal("1.358"));
        volume.setPesoLiquido(new BigDecimal("1"));
        volume.setQuantidadeVolumesTransportados(new BigInteger("99999999999"));
        return volume;
    }
}
