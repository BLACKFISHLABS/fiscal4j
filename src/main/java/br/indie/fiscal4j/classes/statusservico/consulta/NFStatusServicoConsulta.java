package br.indie.fiscal4j.classes.statusservico.consulta;

import br.indie.fiscal4j.classes.NFAmbiente;
import br.indie.fiscal4j.classes.NFBase;
import br.indie.fiscal4j.classes.NFUnidadeFederativa;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "consStatServ")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class NFStatusServicoConsulta extends NFBase {

    @Attribute(name = "versao", required = true)
    private String versao;

    @Element(name = "tpAmb", required = true)
    private NFAmbiente ambiente;

    @Element(name = "cUF", required = true)
    private NFUnidadeFederativa uf;

    @Element(name = "xServ", required = true)
    private String servico;

    public NFStatusServicoConsulta() {
        this.versao = null;
        this.ambiente = null;
        this.uf = null;
        this.servico = null;
    }

    public String getVersao() {
        return this.versao;
    }

    public void setVersao(final String versao) {
        this.versao = versao;
    }

    public NFAmbiente getAmbiente() {
        return this.ambiente;
    }

    public void setAmbiente(final NFAmbiente ambiente) {
        this.ambiente = ambiente;
    }

    public NFUnidadeFederativa getUf() {
        return this.uf;
    }

    public void setUf(final NFUnidadeFederativa uf) {
        this.uf = uf;
    }

    public String getServico() {
        return this.servico;
    }

    public void setServico(final String servico) {
        this.servico = servico;
    }
}