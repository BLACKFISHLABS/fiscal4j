package br.indie.fiscal4j.nfe.classes.evento.downloadnf;

import br.indie.fiscal4j.common.DFBase;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "procNFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class NFDownloadNFeRetornoInfoProcNfe extends DFBase {

    @Attribute(name = "schema", required = false)
    private String schema;

    @Element(name = "nfeProc", required = true)//ver coma var ser tratado esse elemento
    private Any any;

    @Element(name = "procNFeGrupoZip", required = false)
    private NFDownloadNFeRetornoInfoProcNfeGrupoZip grupoZip;

    public NFDownloadNFeRetornoInfoProcNfe() {
        this.schema = null;
        this.any = null;
        this.grupoZip = null;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(final String schema) {
        this.schema = schema;
    }

    public Any getAny() {
        return any;
    }

    public void setAny(final Any any) {
        this.any = any;
    }

    public NFDownloadNFeRetornoInfoProcNfeGrupoZip getGrupoZip() {
        return grupoZip;
    }

    public void setGrupoZip(final NFDownloadNFeRetornoInfoProcNfeGrupoZip grupoZip) {
        this.grupoZip = grupoZip;
    }
}
