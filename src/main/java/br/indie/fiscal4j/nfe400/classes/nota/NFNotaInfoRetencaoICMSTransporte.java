package br.indie.fiscal4j.nfe400.classes.nota;

import java.math.BigDecimal;

import org.simpleframework.xml.Element;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import br.indie.fiscal4j.validadores.IntegerValidador;
import br.indie.fiscal4j.validadores.StringValidador;

public class NFNotaInfoRetencaoICMSTransporte extends DFBase {
    private static final long serialVersionUID = -5222569391852128441L;

    @Element(name = "vServ", required = true)
    private String valorServico;

    @Element(name = "vBCRet", required = true)
    private String bcRetencaoICMS;

    @Element(name = "pICMSRet", required = true)
    private String aliquotaRetencao;

    @Element(name = "vICMSRet", required = true)
    private String valorICMSRetido;

    @Element(name = "CFOP", required = true)
    private Integer cfop;

    @Element(name = "cMunFG", required = true)
    private String codigoMunicipioOcorrenciaFatoGeradorICMSTransporte;

    public void setValorServico(final BigDecimal valorServico) {
        this.valorServico = BigDecimalParser.tamanho15Com2CasasDecimais(valorServico, "Valor Servico Retencao ICMS Transporte");
    }

    public void setBcRetencaoICMS(final BigDecimal bcRetencaoICMS) {
        this.bcRetencaoICMS = BigDecimalParser.tamanho15Com2CasasDecimais(bcRetencaoICMS, "BC Retencao ICMS Transporte");
    }

    public void setAliquotaRetencao(final BigDecimal aliquotaRetencao) {
        this.aliquotaRetencao = BigDecimalParser.tamanho7ComAte4CasasDecimais(aliquotaRetencao, "Aliquota Retencao ICMS Transporte");
    }

    public void setValorICMSRetido(final BigDecimal valorICMSRetido) {
        this.valorICMSRetido = BigDecimalParser.tamanho15Com2CasasDecimais(valorICMSRetido, "Valor ICMS Retido Transporte");
    }

    public void setCfop(final Integer cfop) {
        IntegerValidador.tamanho4(cfop, "CFOP Retencao ICMS Transporte");
        this.cfop = cfop;
    }

    public void setCodigoMunicipioOcorrenciaFatoGeradorICMSTransporte(final String codigoMunicioOcorrenciaFatoGeradorICMSTransporte) {
        StringValidador.exatamente7N(codigoMunicioOcorrenciaFatoGeradorICMSTransporte, "Codigo Municipio Ocorrencia Fato Gerador ICMS Transporte");
        this.codigoMunicipioOcorrenciaFatoGeradorICMSTransporte = codigoMunicioOcorrenciaFatoGeradorICMSTransporte;
    }

    public String getValorServico() {
        return this.valorServico;
    }

    public String getBcRetencaoICMS() {
        return this.bcRetencaoICMS;
    }

    public String getAliquotaRetencao() {
        return this.aliquotaRetencao;
    }

    public String getValorICMSRetido() {
        return this.valorICMSRetido;
    }

    public Integer getCfop() {
        return this.cfop;
    }

    public String getCodigoMunicipioOcorrenciaFatoGeradorICMSTransporte() {
        return this.codigoMunicipioOcorrenciaFatoGeradorICMSTransporte;
    }
}