package br.indie.fiscal4j.nfe.classes.distribuicao;

import br.indie.fiscal4j.DFBase;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

@Root(name = "docZip")
public class NFDistribuicaoDocumentoZip extends DFBase {
    private static final long serialVersionUID = 3028041532565616921L;

    @Text
    private String value;

    @Attribute(name = "NSU")
    private String nsu;

    @Attribute(name = "schema")
    private String schema;

    public String getValue() {
        return this.value;
    }

    public String getNsu() {
        return this.nsu;
    }

    public NFDistribuicaoDocumentoZip setNsu(final String nsu) {
        this.nsu = nsu;
        return this;
    }

    public String getSchema() {
        return this.schema;
    }

    public NFDistribuicaoDocumentoZip setSchema(final String schema) {
        this.schema = schema;
        return this;
    }

    public NFDistribuicaoDocumentoZip setValue(final String value) {
        this.value = value;
        return this;
    }

}