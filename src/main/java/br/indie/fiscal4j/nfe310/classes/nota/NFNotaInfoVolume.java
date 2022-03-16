package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.DFBigDecimalValidador;
import br.indie.fiscal4j.validadores.DFListValidador;
import br.indie.fiscal4j.validadores.DFStringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class NFNotaInfoVolume extends DFBase {
    private static final long serialVersionUID = -7649649556872297786L;

    @Element(name = "qVol", required = false)
    private BigInteger quantidadeVolumesTransportados;

    @Element(name = "esp", required = false)
    private String especieVolumesTransportados;

    @Element(name = "marca", required = false)
    private String marca;

    @Element(name = "nVol", required = false)
    private String numeracaoVolumesTransportados;

    @Element(name = "pesoL", required = false)
    private String pesoLiquido;

    @Element(name = "pesoB", required = false)
    private String pesoBruto;

    @ElementList(entry = "lacres", inline = true, required = false)
    private List<NFNotaInfoLacre> lacres;

    public void setQuantidadeVolumesTransportados(final BigInteger quantidadeVolumesTransportados) {
        this.quantidadeVolumesTransportados = quantidadeVolumesTransportados;
    }

    public void setNumeracaoVolumesTransportados(final String numeracaoVolumesTransportados) {
        DFStringValidador.tamanho60(numeracaoVolumesTransportados, "Numeracao Volumes Transportados");
        this.numeracaoVolumesTransportados = numeracaoVolumesTransportados;
    }

    public void setEspecieVolumesTransportados(final String especieVolumesTransportados) {
        DFStringValidador.tamanho60(especieVolumesTransportados, "Especie Volumes Transportados");
        this.especieVolumesTransportados = especieVolumesTransportados;
    }

    public void setMarca(final String marca) {
        DFStringValidador.tamanho60(marca, "Marca Volume");
        this.marca = marca;
    }

    public void setPesoLiquido(final BigDecimal pesoLiquido) {
        this.pesoLiquido = DFBigDecimalValidador.tamanho15Com3CasasDecimais(pesoLiquido, "Peso Liquido Volume");
    }

    public void setPesoBruto(final BigDecimal pesoBruto) {
        this.pesoBruto = DFBigDecimalValidador.tamanho15Com3CasasDecimais(pesoBruto, "Peso Bruto Volume");
    }

    public void setLacres(final List<NFNotaInfoLacre> lacres) {
        DFListValidador.tamanho5000(lacres, "Lacres");
        this.lacres = lacres;
    }

    public BigInteger getQuantidadeVolumesTransportados() {
        return this.quantidadeVolumesTransportados;
    }

    public String getEspecieVolumesTransportados() {
        return this.especieVolumesTransportados;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getNumeracaoVolumesTransportados() {
        return this.numeracaoVolumesTransportados;
    }

    public String getPesoLiquido() {
        return this.pesoLiquido;
    }

    public String getPesoBruto() {
        return this.pesoBruto;
    }

    public List<NFNotaInfoLacre> getLacres() {
        return this.lacres;
    }
}