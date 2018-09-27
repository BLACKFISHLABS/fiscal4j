package br.indie.fiscal4j.cte200.classes.cte;

import br.indie.fiscal4j.DFBase;
import org.simpleframework.xml.Element;

public class CTInfoTomadorICMS extends DFBase {
    private static final long serialVersionUID = 173570142447312716L;

    @Element(name = "refNFe")
    private String chaveAcessoNFe;

    @Element(name = "refNF")
    private CTInfoTomadorICMSDocumento informacaoDocumentoTomador;

    @Element(name = "refCte")
    private String chaveAcessoCte;

    public String getChaveAcessoNFe() {
        return this.chaveAcessoNFe;
    }

    public void setChaveAcessoNFe(final String chaveAcessoNFe) {
        this.chaveAcessoNFe = chaveAcessoNFe;
    }

    public CTInfoTomadorICMSDocumento getInformacaoDocumentoTomador() {
        return this.informacaoDocumentoTomador;
    }

    public void setInformacaoDocumentoTomador(final CTInfoTomadorICMSDocumento informacaoDocumentoTomador) {
        this.informacaoDocumentoTomador = informacaoDocumentoTomador;
    }

    public String getChaveAcessoCte() {
        return this.chaveAcessoCte;
    }

    public void setChaveAcessoCte(final String chaveAcessoCte) {
        this.chaveAcessoCte = chaveAcessoCte;
    }

}
