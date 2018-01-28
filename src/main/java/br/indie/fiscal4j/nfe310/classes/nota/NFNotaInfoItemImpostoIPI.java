package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.BigIntegerValidador;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Element;

import java.math.BigInteger;

public class NFNotaInfoItemImpostoIPI extends DFBase {
    private static final long serialVersionUID = 3354365738012803301L;

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
    private NFNotaInfoItemImpostoIPITributado tributado;

    @Element(name = "IPINT", required = false)
    private NFNotaInfoItemImpostoIPINaoTributado naoTributado;

    public NFNotaInfoItemImpostoIPI() {
        this.classeEnquadramento = null;
        this.cnpjProdutor = null;
        this.codigoSelo = null;
        this.quantidadeSelo = null;
        this.codigoEnquadramento = null;
        this.tributado = null;
        this.naoTributado = null;
    }

    public String getClasseEnquadramento() {
        return this.classeEnquadramento;
    }

    public void setClasseEnquadramento(final String classeEnquadramento) {
        StringValidador.exatamente5(classeEnquadramento, "Classe Enquadramento IPI Item");
        this.classeEnquadramento = classeEnquadramento;
    }

    public String getCnpjProdutor() {
        return this.cnpjProdutor;
    }

    public void setCnpjProdutor(final String cnpjProdutor) {
        StringValidador.cnpj(cnpjProdutor);
        this.cnpjProdutor = cnpjProdutor;
    }

    public String getCodigoSelo() {
        return this.codigoSelo;
    }

    public void setCodigoSelo(final String codigoSelo) {
        StringValidador.tamanho60(codigoSelo, "Codigo Selo IPI Item");
        this.codigoSelo = codigoSelo;
    }

    public BigInteger getQuantidadeSelo() {
        return this.quantidadeSelo;
    }

    public void setQuantidadeSelo(final BigInteger quantidadeSelo) {
        BigIntegerValidador.tamanho12(quantidadeSelo, "Quantidade Selo IPI Item");
        this.quantidadeSelo = quantidadeSelo;
    }

    public String getCodigoEnquadramento() {
        return this.codigoEnquadramento;
    }

    public void setCodigoEnquadramento(final String codigoEnquadramento) {
        StringValidador.exatamente3(codigoEnquadramento, "Codigo Enquadramento IPI Item");
        this.codigoEnquadramento = codigoEnquadramento;
    }

    public NFNotaInfoItemImpostoIPITributado getTributado() {
        return this.tributado;
    }

    public void setTributado(final NFNotaInfoItemImpostoIPITributado tributado) {
        if (this.naoTributado != null) {
            throw new IllegalStateException("IPI tributado e nao tributado sao mutuamente exclusivos");
        }
        this.tributado = tributado;
    }

    public NFNotaInfoItemImpostoIPINaoTributado getNaoTributado() {
        return this.naoTributado;
    }

    public void setNaoTributado(final NFNotaInfoItemImpostoIPINaoTributado naoTributado) {
        if (this.tributado != null) {
            throw new IllegalStateException("IPI tributado e nao tributado sao mutuamente exclusivos");
        }
        this.naoTributado = naoTributado;
    }
}