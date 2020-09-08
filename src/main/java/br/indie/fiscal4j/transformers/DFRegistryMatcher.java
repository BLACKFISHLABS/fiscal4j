package br.indie.fiscal4j.transformers;

import br.indie.fiscal4j.DFAmbiente;
import br.indie.fiscal4j.DFModelo;
import br.indie.fiscal4j.DFPais;
import br.indie.fiscal4j.DFUnidadeFederativa;
import br.indie.fiscal4j.mdfe3.classes.def.*;
import br.indie.fiscal4j.mdfe3.transformers.*;
import br.indie.fiscal4j.nfe.NFTipoEmissao;
import br.indie.fiscal4j.nfe.transformers.NFTipoEmissaoTransformer;
import org.simpleframework.xml.transform.RegistryMatcher;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class DFRegistryMatcher extends RegistryMatcher {

    public DFRegistryMatcher() {
        super.bind(DFModelo.class, new DFModeloTransformer());
        super.bind(DFAmbiente.class, new DFAmbienteTransformer());
        super.bind(LocalDate.class, new DFLocalDateTransformer());
        super.bind(LocalTime.class, new DFLocalTimeTransformer());
        super.bind(ZonedDateTime.class, new DFDateTimeTransformer());
        super.bind(LocalDateTime.class, new DFLocalDateTimeTransformer());
        super.bind(ZonedDateTime.class, new DFZonedDateTimeTransformer());
        super.bind(DFUnidadeFederativa.class, new DFUnidadeFederativaTransformer());
        super.bind(NFTipoEmissao.class, new NFTipoEmissaoTransformer());
        super.bind(DFPais.class, new DFPaisTransformer());

        // NFE 4.00
        super.bind(br.indie.fiscal4j.nfe400.classes.NFTipo.class, new br.indie.fiscal4j.nfe400.transformers.NFTipoTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.NFOrigem.class, new br.indie.fiscal4j.nfe400.transformers.NFOrigemTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.NFSituacao.class, new br.indie.fiscal4j.nfe400.transformers.NFSituacaoTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.NFFinalidade.class, new br.indie.fiscal4j.nfe400.transformers.NFFinalidadeTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.NFTipoImpressao.class, new br.indie.fiscal4j.nfe400.transformers.NFTipoImpressaoTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.NFOrigemProcesso.class, new br.indie.fiscal4j.nfe400.transformers.NFOrigemProcessoTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.nota.NFOperadoraCartao.class, new br.indie.fiscal4j.nfe400.transformers.NFOperadoraCartaoTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.NFProcessoEmissor.class, new br.indie.fiscal4j.nfe400.transformers.NFProgramaEmissorTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.NFModalidadeFrete.class, new br.indie.fiscal4j.nfe400.transformers.NFModalidadeFreteTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.NFRegimeTributario.class, new br.indie.fiscal4j.nfe400.transformers.NFRegimeTributarioTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.NFNotaInfoVeiculoCor.class, new br.indie.fiscal4j.nfe400.transformers.NFNotaInfoVeiculoCorTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.nota.NFMeioPagamento.class, new br.indie.fiscal4j.nfe400.transformers.NFMeioPagamentoTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.NFIndicadorFormaPagamento.class, new br.indie.fiscal4j.nfe400.transformers.NFIndicadorFormaPagamentoTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.NFNotaInfoTipoVeiculo.class, new br.indie.fiscal4j.nfe400.transformers.NFNotaInfoTipoVeiculoTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.cadastro.NFSituacaoContribuinte.class, new br.indie.fiscal4j.nfe400.transformers.NFSituacaoContribuinteTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.NFNotaInfoEspecieVeiculo.class, new br.indie.fiscal4j.nfe400.transformers.NFNotaInfoEspecieVeiculoTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.NFProdutoCompoeValorNota.class, new br.indie.fiscal4j.nfe400.transformers.NFProdutoCompoeValorNotaTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.nota.NFTipoIntegracaoPagamento.class, new br.indie.fiscal4j.nfe400.transformers.NFTipoIntegracaoPagamentoTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.nota.NFIndicadorIEDestinatario.class, new br.indie.fiscal4j.nfe400.transformers.NFIndicadorIEDestinatarioTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.nota.NFOperacaoConsumidorFinal.class, new br.indie.fiscal4j.nfe400.transformers.NFOperacaoConsumidorFinalTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.NFNotaInfoCombustivelTipo.class, new br.indie.fiscal4j.nfe400.transformers.NFNotaInfoCombustivelTipoTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.cadastro.NFIndicadorContribuinteCTe.class, new br.indie.fiscal4j.nfe400.transformers.NFIndicadorContribuinteCTTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.cadastro.NFIndicadorContribuinteNFe.class, new br.indie.fiscal4j.nfe400.transformers.NFIndicadorContribuinteNFeTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.NFNotaMotivoDesoneracaoICMS.class, new br.indie.fiscal4j.nfe400.transformers.NFNotaMotivoDesoneracaoICMSTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.lote.envio.NFLoteIndicadorProcessamento.class, new br.indie.fiscal4j.nfe400.transformers.NFLoteIndicadorProcessamentoTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.nota.NFViaTransporteInternacional.class, new br.indie.fiscal4j.nfe400.transformers.NFViaTransporteInternacionalTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.nota.NFIndicadorPresencaComprador.class, new br.indie.fiscal4j.nfe400.transformers.NFIndicadorPresencaCompradorTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.nota.NFFormaImportacaoIntermediacao.class, new br.indie.fiscal4j.nfe400.transformers.NFFormaImportacaoIntermediacaoTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.nota.NFIndicadorEscalaRelevante.class, new br.indie.fiscal4j.nfe400.transformers.NFIndicadorEscalaRelevanteTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.NFNotaInfoImpostoTributacaoICMS.class, new br.indie.fiscal4j.nfe400.transformers.NFNotaInfoImpostoTributacaoICMSTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.NFNotaInfoSituacaoTributariaIPI.class, new br.indie.fiscal4j.nfe400.transformers.NFNotaInfoSituacaoTributariaIPITransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.NFNotaInfoSituacaoTributariaPIS.class, new br.indie.fiscal4j.nfe400.transformers.NFNotaInfoSituacaoTributariaPISTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.NFNotaInfoItemModalidadeBCICMSST.class, new br.indie.fiscal4j.nfe400.transformers.NFnotaInfoItemModalidadeBCICMSSTTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.nota.NFNotaInfoRegimeEspecialTributacao.class, new br.indie.fiscal4j.nfe400.transformers.NFNotaInfoRegimeEspecialTributacaoTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.NFNotaInfoSituacaoTributariaCOFINS.class, new br.indie.fiscal4j.nfe400.transformers.NFNotaInfoSituacaoTributariaCOFINSTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.NFNotaInfoItemProdutoArmamentoTipo.class, new br.indie.fiscal4j.nfe400.transformers.NFNotaInfoItemProdutoArmamentoTipoTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.nota.NFIdentificadorLocalDestinoOperacao.class, new br.indie.fiscal4j.nfe400.transformers.NFIdentificadorLocalDestinoOperacaoTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.NFNotaInfoItemProdutoVeiculoCondicao.class, new br.indie.fiscal4j.nfe400.transformers.NFNotaInfoItemProdutoVeiculoCondicaoTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.NFNotaInfoItemProdutoVeiculoRestricao.class, new br.indie.fiscal4j.nfe400.transformers.NFNotaInfoItemProdutoVeiculoRestricaoTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.nota.NFNotaInfoItemIndicadorIncentivoFiscal.class, new br.indie.fiscal4j.nfe400.transformers.NFNotaInfoItemIndicadorIncentivoFiscalTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.nota.NFNotaInfoItemIndicadorExigibilidadeISS.class, new br.indie.fiscal4j.nfe400.transformers.NFNotaInfoItemIndicadorExigibilidadeISSTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.NFNotaSituacaoOperacionalSimplesNacional.class, new br.indie.fiscal4j.nfe400.transformers.NFNotaSituacaoOperacionalSimplesNacionalTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.NFNotaInfoItemProdutoVeiculoTipoOperacao.class, new br.indie.fiscal4j.nfe400.transformers.NFNotaInfoItemProdutoVeiculoTipoOperacaoTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.NFNotaInfoItemProdutoVeiculoCondicaoChassi.class, new br.indie.fiscal4j.nfe400.transformers.NFNotaInfoItemProdutoVeiculoCondicaoChassiTransformer());
        super.bind(br.indie.fiscal4j.nfe400.classes.NFNotaInfoItemModalidadeBCICMS.class, new br.indie.fiscal4j.nfe400.transformers.NFNotaInfoItemModalidadeBCICMSTransformer());

        // CTe 300
        super.bind(br.indie.fiscal4j.cte300.classes.CTTipoEmissao.class, new br.indie.fiscal4j.cte300.transformes.CTTipoEmissaoTransformer());
        super.bind(br.indie.fiscal4j.cte300.classes.CTFinalidade.class, new br.indie.fiscal4j.cte300.transformes.CTFinalidadeTransformes());
        super.bind(br.indie.fiscal4j.cte300.classes.CTProcessoEmissao.class, new br.indie.fiscal4j.cte300.transformes.CTProcessoEmissaoTransformer());
        super.bind(br.indie.fiscal4j.cte300.classes.CTModal.class, new br.indie.fiscal4j.cte300.transformes.CTModalTransformer());
        super.bind(br.indie.fiscal4j.cte300.classes.CTTipoServico.class, new br.indie.fiscal4j.cte300.transformes.CTTipoServicoTransformer());
        super.bind(br.indie.fiscal4j.cte300.classes.CTRetirada.class, new br.indie.fiscal4j.cte300.transformes.CTRetiradaTransformer());
        super.bind(br.indie.fiscal4j.cte300.classes.CTIndicadorTomador.class, new br.indie.fiscal4j.cte300.transformes.CTIndicadorTomadorTransformer());
        super.bind(br.indie.fiscal4j.cte300.classes.CTTipoImpressao.class, new br.indie.fiscal4j.cte300.transformes.CTTipoImpressaoTransformes());
        super.bind(br.indie.fiscal4j.cte300.classes.CTTomadorServico.class, new br.indie.fiscal4j.cte300.transformes.CTTomadorServicoTransformer());
        super.bind(br.indie.fiscal4j.cte300.classes.CTTipoPrazoDataEntrega.class, new br.indie.fiscal4j.cte300.transformes.CTTipoPrazoDataEntregaTransformer());
        super.bind(br.indie.fiscal4j.cte300.classes.CTTipoPrazoHoraEntrega.class, new br.indie.fiscal4j.cte300.transformes.CTTipoPrazoHoraEntregaTransformer());
        super.bind(br.indie.fiscal4j.cte300.classes.CTUnidadeMedida.class, new br.indie.fiscal4j.cte300.transformes.CTUnidadeMedidaTransformer());
        super.bind(br.indie.fiscal4j.cte300.classes.CTModeloNF.class, new br.indie.fiscal4j.cte300.transformes.CTModeloNFTransformer());
        super.bind(br.indie.fiscal4j.cte300.classes.CTTipoUnidadeCarga.class, new br.indie.fiscal4j.cte300.transformes.CTTipoUnidadeCargaTransformer());
        super.bind(br.indie.fiscal4j.cte300.classes.CTTipoUnidadeTransporte.class, new br.indie.fiscal4j.cte300.transformes.CTTipoUnidadeTransporteTransformer());
        super.bind(br.indie.fiscal4j.cte300.classes.CTTipoDocumento.class, new br.indie.fiscal4j.cte300.transformes.CTTipoDocumentoTransformer());
        super.bind(br.indie.fiscal4j.cte300.classes.CTTipoDocumentoTransporteAnterior.class, new br.indie.fiscal4j.cte300.transformes.CTTipoDocumentoTransporteAnteriorTransformer());
        super.bind(br.indie.fiscal4j.cte300.classes.CTCodigoSituacaoTributariaICMS.class, new br.indie.fiscal4j.cte300.transformes.CTCodigoSituacaoTributariaICMSTransformer());
        super.bind(br.indie.fiscal4j.cte300.classes.CTInformacoesManuseio.class, new br.indie.fiscal4j.cte300.transformes.CTInformacoesManuseioTransformer());
        super.bind(br.indie.fiscal4j.cte300.classes.CTClasseTarifa.class, new br.indie.fiscal4j.cte300.transformes.CTClasseTarifaTransformer());
        super.bind(br.indie.fiscal4j.cte300.classes.CTUnidadeMedidaProdPerigosos.class, new br.indie.fiscal4j.cte300.transformes.CTUnidadeMedidaProdPerigososTransformer());
        super.bind(br.indie.fiscal4j.cte300.classes.CTTipoDirecao.class, new br.indie.fiscal4j.cte300.transformes.CTTipoDirecaoTransformer());
        super.bind(br.indie.fiscal4j.cte300.classes.CTTipoTrafego.class, new br.indie.fiscal4j.cte300.transformes.CTTipoTrafegoTransformer());
        super.bind(br.indie.fiscal4j.cte300.classes.CTTipoFerrovia.class, new br.indie.fiscal4j.cte300.transformes.CTTipoFerroviaTransformer());
        super.bind(br.indie.fiscal4j.cte300.classes.CTIndicadoNegociavel.class, new br.indie.fiscal4j.cte300.transformes.CTIndicadoNegociavelTransformer());

        // MDF-e
        super.bind(MDFModalidadeTransporte.class, new MDFModalidadeTransporteTransformer());
        super.bind(MDFProcessoEmissao.class, new MDFProcessoEmissaoTransformer());
        super.bind(MDFTipoCargaProdutoPredominante.class, new MDFTipoCargaProdutoPredominanteTransformer());
        super.bind(MDFTipoCarroceria.class, new MDFTipoCarroceriaTransformer());
        super.bind(MDFTipoEmissao.class, new MDFTipoEmissaoTransformer());
        super.bind(MDFTipoEmitente.class, new MDFTipoEmitenteTransformer());
        super.bind(MDFTipoInfPag.class, new MDFTipoInfPagTransformer());
        super.bind(MDFTipoInfPagComp.class, new MDFTipoInfPagCompTransformer());
        super.bind(MDFTipoProprietario.class, new MDFTipoProprietarioTransformer());
        super.bind(MDFTipoRodado.class, new MDFTipoRodadoTransformer());
        super.bind(MDFTipoTranportador.class, new MDFTipoTranportadorTransformer());
        super.bind(MDFTipoUnidadeCarga.class, new MDFTipoUnidadeCargaTransformer());
        super.bind(MDFTipoUnidadeTransporte.class, new MDFTipoUnidadeTransporteTransformer());
        super.bind(MDFUnidadeMedidaPesoBrutoCarga.class, new MDFUnidadeMedidaPesoBrutoCargaTransformer());
        super.bind(MDFTipoResponsavelSeguro.class, new MDFTipoResponsavelSeguroTransformer());
    }
}