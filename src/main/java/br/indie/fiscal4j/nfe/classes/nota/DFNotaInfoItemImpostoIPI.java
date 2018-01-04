package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.nfe.validadores.BigIntegerValidador;
import br.indie.fiscal4j.nfe.validadores.StringValidador;
import org.simpleframework.xml.Element;

import java.math.BigInteger;

public class DFNotaInfoItemImpostoIPI extends DFBase {

    @Element(name = "clEnq", required = false)
    private String classeEnquadramento;

    @Element(name = "CNPJProd", required = false)
    private String cnpjProdutor;

    @Element(name = "cSelo", required = false)
    private String codigoSelo;

    @Element(name = "qSelo", required = false)
    private BigInteger quantidadeSelo;

    @Element(name = "cEnq", required = true)
    private String codigoEnquadramento;

    @Element(name = "IPITrib", required = false)
    private DFNotaInfoItemImpostoIPITributado tributado;

    @Element(name = "IPINT", required = false)
    private DFNotaInfoItemImpostoIPINaoTributado naoTributado;

    public DFNotaInfoItemImpostoIPI() {
        this.classeEnquadramento = null;
        this.cnpjProdutor = null;
        this.codigoSelo = null;
        this.quantidadeSelo = null;
        this.codigoEnquadramento = null;
        this.tributado = null;
        this.naoTributado = null;
    }

    public void setClasseEnquadramento(final String classeEnquadramento) {
        StringValidador.exatamente5(classeEnquadramento, "Classe Enquadramento IPI Item");
        this.classeEnquadramento = classeEnquadramento;
    }

    public void setCnpjProdutor(final String cnpjProdutor) {
        StringValidador.cnpj(cnpjProdutor);
        this.cnpjProdutor = cnpjProdutor;
    }

    public void setCodigoSelo(final String codigoSelo) {
        StringValidador.tamanho60(codigoSelo, "Codigo Selo IPI Item");
        this.codigoSelo = codigoSelo;
    }

    public void setQuantidadeSelo(final BigInteger quantidadeSelo) {
        BigIntegerValidador.tamanho12(quantidadeSelo, "Quantidade Selo IPI Item");
        this.quantidadeSelo = quantidadeSelo;
    }

    public void setCodigoEnquadramento(final String codigoEnquadramento) {
        StringValidador.exatamente3(codigoEnquadramento, "Codigo Enquadramento IPI Item");
        this.codigoEnquadramento = codigoEnquadramento;
    }

    public void setTributado(final DFNotaInfoItemImpostoIPITributado tributado) {
        if (this.naoTributado != null) {
            throw new IllegalStateException("IPI tributado e nao tributado sao mutuamente exclusivos");
        }
        this.tributado = tributado;
    }

    public void setNaoTributado(final DFNotaInfoItemImpostoIPINaoTributado naoTributado) {
        if (this.tributado != null) {
            throw new IllegalStateException("IPI tributado e nao tributado sao mutuamente exclusivos");
        }
        this.naoTributado = naoTributado;
    }

    public String getClasseEnquadramento() {
        return this.classeEnquadramento;
    }

    public String getCnpjProdutor() {
        return this.cnpjProdutor;
    }

    public String getCodigoSelo() {
        return this.codigoSelo;
    }

    public BigInteger getQuantidadeSelo() {
        return this.quantidadeSelo;
    }

    public String getCodigoEnquadramento() {
        return this.codigoEnquadramento;
    }

    public DFNotaInfoItemImpostoIPITributado getTributado() {
        return this.tributado;
    }

    public DFNotaInfoItemImpostoIPINaoTributado getNaoTributado() {
        return this.naoTributado;
    }
}