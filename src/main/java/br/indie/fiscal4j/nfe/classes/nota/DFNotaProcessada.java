package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.nfe.classes.NFProtocolo;
import br.indie.fiscal4j.nfe.validadores.BigDecimalParser;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;

@Root(name = "nfeProc")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class DFNotaProcessada extends DFBase {

    @Attribute(name = "versao")
    private String versao;

    @Element(name = "NFe")
    private DFNota nota;

    @Element(name = "protNFe")
    private NFProtocolo protocolo;

    public DFNota getNota() {
        return this.nota;
    }

    public String getVersao() {
        return this.versao;
    }

    public NFProtocolo getProtocolo() {
        return this.protocolo;
    }

    public void setNota(final DFNota nota) {
        this.nota = nota;
    }

    public void setProtocolo(final NFProtocolo protocolo) {
        this.protocolo = protocolo;
    }

    public void setVersao(final BigDecimal versao) {
        this.versao = BigDecimalParser.tamanho4Com2CasasDecimais(versao, "Versao Nota Processada");
    }
}