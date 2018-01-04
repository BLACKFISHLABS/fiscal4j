package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.nfe.validadores.StringValidador;
import org.simpleframework.xml.Element;

public class DFInfoReferenciada extends DFBase {

    @Element(name = "refNFe", required = false)
    private String chaveAcesso;

    @Element(name = "refNF", required = false)
    private DFInfoModelo1Por1AReferenciada modelo1por1Referenciada;

    @Element(name = "refNFP", required = false)
    private DFInfoProdutorRuralReferenciada infoNFProdutorRuralReferenciada;

    @Element(name = "refCTe", required = false)
    private String chaveAcessoCTReferenciada;

    @Element(name = "refECF", required = false)
    private DFInfoCupomFiscalReferenciado cupomFiscalReferenciado;

    public void setChaveAcesso(final String chaveAcesso) {
        if (this.modelo1por1Referenciada != null || this.infoNFProdutorRuralReferenciada != null || this.chaveAcessoCTReferenciada != null || this.cupomFiscalReferenciado != null) {
            throw new IllegalStateException("Nao pode setar chave de acesso caso modelo 1 por 1 referenciada esteja setado");
        }
        StringValidador.exatamente44N(chaveAcesso, "Chave de Acesso");
        this.chaveAcesso = chaveAcesso;
    }

    public void setModelo1por1Referenciada(final DFInfoModelo1Por1AReferenciada modelo1por1Referenciada) {
        if (this.chaveAcesso != null || this.infoNFProdutorRuralReferenciada != null || this.chaveAcessoCTReferenciada != null || this.cupomFiscalReferenciado != null) {
            throw new IllegalStateException("Nao pode setar modelo 1 por 1 referenciada caso a chave de acesso esteja setada");
        }
        this.modelo1por1Referenciada = modelo1por1Referenciada;
    }

    public void setChaveAcessoCTReferenciada(final String chaveAcessoCTReferenciada) {
        if (this.modelo1por1Referenciada != null || this.chaveAcesso != null || this.infoNFProdutorRuralReferenciada != null || this.cupomFiscalReferenciado != null) {
            throw new IllegalStateException("Nao pode setar chave de acesso de conhecimento de transporte referenciada caso a chave de acesso esteja setada");
        }
        StringValidador.exatamente44N(chaveAcessoCTReferenciada, "Chave Acesso CT Referenciada");
        this.chaveAcessoCTReferenciada = chaveAcessoCTReferenciada;
    }

    public void setInfoNFProdutorRuralReferenciada(final DFInfoProdutorRuralReferenciada infoNFProdutorRuralReferenciada) {
        if (this.modelo1por1Referenciada != null || this.chaveAcesso != null || this.cupomFiscalReferenciado != null || this.chaveAcessoCTReferenciada != null) {
            throw new IllegalStateException("Nao pode setar nota de produtor rural referenciada caso a chave de acesso esteja setada");
        }
        this.infoNFProdutorRuralReferenciada = infoNFProdutorRuralReferenciada;
    }

    public void setCupomFiscalReferenciado(final DFInfoCupomFiscalReferenciado cupomFiscalReferenciado) {
        if (this.modelo1por1Referenciada != null || this.chaveAcesso != null || this.chaveAcessoCTReferenciada != null || this.infoNFProdutorRuralReferenciada != null) {
            throw new IllegalStateException("Nao pode setar cupom fiscal referenciado caso a chave de acesso esteja setada");
        }
        this.cupomFiscalReferenciado = cupomFiscalReferenciado;
    }

    public String getChaveAcesso() {
        return this.chaveAcesso;
    }

    public DFInfoModelo1Por1AReferenciada getModelo1por1Referenciada() {
        return this.modelo1por1Referenciada;
    }

    public DFInfoProdutorRuralReferenciada getInfoNFProdutorRuralReferenciada() {
        return this.infoNFProdutorRuralReferenciada;
    }

    public String getChaveAcessoCTReferenciada() {
        return this.chaveAcessoCTReferenciada;
    }

    public DFInfoCupomFiscalReferenciado getCupomFiscalReferenciado() {
        return this.cupomFiscalReferenciado;
    }
}