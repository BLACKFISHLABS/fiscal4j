package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.nfe310.classes.*;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import br.indie.fiscal4j.validadores.IntegerValidador;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NFNotaInfoItemProdutoVeiculo extends DFBase {
    private static final long serialVersionUID = -8723829235875523827L;

    @Element(name = "tpOp", required = true)
    private NFNotaInfoItemProdutoVeiculoTipoOperacao tipoOperacao;

    @Element(name = "chassi", required = true)
    private String chassi;

    @Element(name = "cCor", required = true)
    private String codigoCor;

    @Element(name = "xCor", required = true)
    private String descricaoCor;

    @Element(name = "pot", required = true)
    private String potencia;

    @Element(name = "cilin", required = true)
    private String cilindrada;

    @Element(name = "pesoL", required = true)
    private String pesoLiquido;

    @Element(name = "pesoB", required = true)
    private String pesoBruto;

    @Element(name = "nSerie", required = true)
    private String numeroSerie;

    @Element(name = "tpComb", required = true)
    private NFNotaInfoCombustivelTipo tipoCombustivel;

    @Element(name = "nMotor", required = true)
    private String numeroMotor;

    @Element(name = "CMT", required = true)
    private String capacidadeMaximaTracao;

    @Element(name = "dist", required = true)
    private String distanciaEntreEixos;

    @Element(name = "anoMod", required = true)
    private Integer anoModeloFabricacao;

    @Element(name = "anoFab", required = true)
    private Integer anoFabricacao;

    @Element(name = "tpPint", required = true)
    private String tipoPintura;

    @Element(name = "tpVeic", required = true)
    private NFNotaInfoTipoVeiculo tipoVeiculo;

    @Element(name = "espVeic", required = true)
    private NFNotaInfoEspecieVeiculo especieVeiculo;

    @Element(name = "VIN", required = true)
    private NFNotaInfoItemProdutoVeiculoCondicaoChassi condicaoChassi;

    @Element(name = "condVeic", required = true)
    private NFNotaInfoItemProdutoVeiculoCondicao condicao;

    @Element(name = "cMod", required = true)
    private String codigoMarcaModelo;

    @Element(name = "cCorDENATRAN", required = true)
    private NFNotaInfoVeiculoCor corDENATRAN;

    @Element(name = "lota", required = true)
    private Integer lotacao;

    @Element(name = "tpRest", required = true)
    private NFNotaInfoItemProdutoVeiculoRestricao restricao;

    public void setCodigoCorDENATRAN(final NFNotaInfoVeiculoCor corDENATRAN) {
        this.corDENATRAN = corDENATRAN;
    }

    public NFNotaInfoItemProdutoVeiculoTipoOperacao getTipoOperacao() {
        return this.tipoOperacao;
    }

    public void setTipoOperacao(final NFNotaInfoItemProdutoVeiculoTipoOperacao tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public String getChassi() {
        return this.chassi;
    }

    public void setChassi(final String chassi) {
        StringValidador.exatamente17(chassi, "Chassi Veiculo");
        this.chassi = chassi;
    }

    public String getCodigoCor() {
        return this.codigoCor;
    }

    public void setCodigoCor(final String codigoCor) {
        StringValidador.exatamente4(codigoCor, "Codigo Cor Veiculo");
        this.codigoCor = codigoCor;
    }

    public String getDescricaoCor() {
        return this.descricaoCor;
    }

    public void setDescricaoCor(final String descricaoCor) {
        StringValidador.tamanho40(descricaoCor, "Descricao Cor Veiculo");
        this.descricaoCor = descricaoCor;
    }

    public String getPotencia() {
        return this.potencia;
    }

    public void setPotencia(final String potencia) {
        StringValidador.exatamente4(potencia, "Potencia Veiculo");
        this.potencia = potencia;
    }

    public String getCilindrada() {
        return this.cilindrada;
    }

    public void setCilindrada(final String cilindrada) {
        StringValidador.exatamente4(cilindrada, "Cilindrada Veiculo");
        this.cilindrada = cilindrada;
    }

    public String getPesoLiquido() {
        return this.pesoLiquido;
    }

    public void setPesoLiquido(final BigDecimal pesoLiquido) {
        this.pesoLiquido = BigDecimalParser.tamanho9Com4CasasDecimais(pesoLiquido, "Peso Liquido Veiculo");
    }

    public String getPesoBruto() {
        return this.pesoBruto;
    }

    public void setPesoBruto(final BigDecimal pesoBruto) {
        this.pesoBruto = BigDecimalParser.tamanho9Com4CasasDecimais(pesoBruto, "Peso Bruto Veiculo");
    }

    public String getNumeroSerie() {
        return this.numeroSerie;
    }

    public void setNumeroSerie(final String numeroSerie) {
        StringValidador.exatamente9(numeroSerie, "Numero Serie Veiculo");
        this.numeroSerie = numeroSerie;
    }

    public NFNotaInfoCombustivelTipo getTipoCombustivel() {
        return this.tipoCombustivel;
    }

    public void setTipoCombustivel(final NFNotaInfoCombustivelTipo tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getNumeroMotor() {
        return this.numeroMotor;
    }

    public void setNumeroMotor(final String numeroMotor) {
        StringValidador.exatamente21(numeroMotor, "Numero Motor Veiculo");
        this.numeroMotor = numeroMotor;
    }

    public String getCapacidadeMaximaTracao() {
        return this.capacidadeMaximaTracao;
    }

    public void setCapacidadeMaximaTracao(final BigDecimal capacidadeMaximaTracao) {
        this.capacidadeMaximaTracao = BigDecimalParser.tamanho9Com4CasasDecimais(capacidadeMaximaTracao, "Capacidade Maxima Tracao Veiculo");
    }

    public String getDistanciaEntreEixos() {
        return this.distanciaEntreEixos;
    }

    public void setDistanciaEntreEixos(final String distanciaEntreEixos) {
        StringValidador.exatamente4(distanciaEntreEixos, "Distancia Entre Eixos Veiculo");
        this.distanciaEntreEixos = distanciaEntreEixos;
    }

    public Integer getAnoModeloFabricacao() {
        return this.anoModeloFabricacao;
    }

    public void setAnoModeloFabricacao(final int anoModeloFabricacao) {
        IntegerValidador.exatamente4(anoModeloFabricacao, "Ano Modelo Fabricacao Veiculo");
        this.anoModeloFabricacao = anoModeloFabricacao;
    }

    public Integer getAnoFabricacao() {
        return this.anoFabricacao;
    }

    public void setAnoFabricacao(final int anoFabricacao) {
        IntegerValidador.exatamente4(anoFabricacao, "Ano Fabricacao Veiculo");
        this.anoFabricacao = anoFabricacao;
    }

    public String getTipoPintura() {
        return this.tipoPintura;
    }

    public void setTipoPintura(final String tipoPintura) {
        StringValidador.exatamente1(tipoPintura, "Tipo Pintura Veiculo");
        this.tipoPintura = tipoPintura;
    }

    public NFNotaInfoTipoVeiculo getTipoVeiculo() {
        return this.tipoVeiculo;
    }

    public void setTipoVeiculo(final NFNotaInfoTipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public NFNotaInfoEspecieVeiculo getEspecieVeiculo() {
        return this.especieVeiculo;
    }

    public void setEspecieVeiculo(final NFNotaInfoEspecieVeiculo especieVeiculo) {
        this.especieVeiculo = especieVeiculo;
    }

    public NFNotaInfoItemProdutoVeiculoCondicaoChassi getCondicaoChassi() {
        return this.condicaoChassi;
    }

    public void setCondicaoChassi(final NFNotaInfoItemProdutoVeiculoCondicaoChassi condicaoChassi) {
        this.condicaoChassi = condicaoChassi;
    }

    public NFNotaInfoItemProdutoVeiculoCondicao getCondicao() {
        return this.condicao;
    }

    public void setCondicao(final NFNotaInfoItemProdutoVeiculoCondicao condicao) {
        this.condicao = condicao;
    }

    public String getCodigoMarcaModelo() {
        return this.codigoMarcaModelo;
    }

    public void setCodigoMarcaModelo(final String codigoMarcaModelo) {
        StringValidador.exatamente6N(codigoMarcaModelo, "Codigo Marca Modelo Veiculo");
        this.codigoMarcaModelo = codigoMarcaModelo;
    }

    public NFNotaInfoVeiculoCor getCorDENATRAN() {
        return this.corDENATRAN;
    }

    public Integer getLotacao() {
        return this.lotacao;
    }

    public void setLotacao(final int lotacao) {
        IntegerValidador.tamanho3(lotacao, "Lotacao Veiculo");
        this.lotacao = lotacao;
    }

    public NFNotaInfoItemProdutoVeiculoRestricao getRestricao() {
        return this.restricao;
    }

    public void setRestricao(final NFNotaInfoItemProdutoVeiculoRestricao restricao) {
        this.restricao = restricao;
    }
}