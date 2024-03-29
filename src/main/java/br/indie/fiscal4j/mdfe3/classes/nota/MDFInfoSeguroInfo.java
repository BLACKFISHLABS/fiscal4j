package br.indie.fiscal4j.mdfe3.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.DFStringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * Created by Eldevan Nery Junior on 07/12/17. Informações da seguradora.
 */

@Root(name = "infSeg")
@Namespace(reference = "http://www.portalfiscal.inf.br/mdfe")
public class MDFInfoSeguroInfo extends DFBase {
    private static final long serialVersionUID = 4018991399177455416L;

    @Element(name = "xSeg")
    private String seguradora;

    @Element(name = "CNPJ")
    private String cnpj;

    public MDFInfoSeguroInfo() {
        this.seguradora = null;
        this.cnpj = null;
    }

    public String getSeguradora() {
        return this.seguradora;
    }

    /**
     * Nome da Seguradora
     */
    public void setSeguradora(final String seguradora) {
        DFStringValidador.tamanho30(seguradora, "Nome da Seguradora");
        this.seguradora = seguradora;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    /**
     * Número do CNPJ da seguradora. Obrigatório apenas se responsável pelo seguro for (2) responsável pela contratação do transporte - pessoa jurídica.
     */
    public void setCnpj(final String cnpj) {
        DFStringValidador.cnpj(cnpj);
        this.cnpj = cnpj;
    }
}
