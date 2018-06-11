package br.indie.fiscal4j.mdfe3.classes.lote.envio;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.mdfe3.classes.nota.MDFe;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * Created by Eldevan Nery Junior on 08/11/17.
 *
 * Envio de Lote MDF-e para concessão de autorização.
 *
 */
@Root(name = "enviMDFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/mdfe")
public class MDFEnvioLote extends DFBase {

    @Attribute(name = "versao")
    private String versao = MDFe.VERSAO;

    /**
     * Tipo Identificador de controle do envio do lote. Número seqüencial auto-incremental,
     * de controle correspondente ao identificador único do lote enviado.
     * A responsabilidade de gerar e controlar esse número é do próprio contribuinte.
     */
    @Element(name = "idLote")
    private String idLote;

    /**
     * Informações MDF-e
     */
    @Element(name = "MDFe")
    private MDFe mdfe;

    public String getIdLote() {
        return this.idLote;
    }

    public void setIdLote(final String idLote) {
        StringValidador.tamanho15N(idLote, "ID do Lote do MDFe");
        this.idLote = idLote;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        StringValidador.equals(MDFe.VERSAO, versao);
        this.versao = versao;
    }

    public MDFe getMdfe() {
        return mdfe;
    }

    public void setMdfe(MDFe mdfe) {
        this.mdfe = mdfe;
    }
}