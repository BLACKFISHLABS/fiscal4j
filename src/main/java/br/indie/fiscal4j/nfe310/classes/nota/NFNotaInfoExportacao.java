package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.DFUnidadeFederativa;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Element;

public class NFNotaInfoExportacao extends DFBase {
    private static final long serialVersionUID = 3726297203738653822L;

    @Element(name = "UFSaidaPais", required = true)
    private String ufEmbarqueProduto;

    @Element(name = "xLocExporta", required = true)
    private String localEmbarqueProdutos;

    @Element(name = "xLocDespacho", required = false)
    private String localDespachoProdutos;

    public String getLocalDespachoProdutos() {
        return this.localDespachoProdutos;
    }

    public void setLocalDespachoProdutos(final String localDespachoProdutos) {
        StringValidador.tamanho60(localDespachoProdutos, "Local Despacho Produtos");
        this.localDespachoProdutos = localDespachoProdutos;
    }

    public String getLocalEmbarqueProdutos() {
        return this.localEmbarqueProdutos;
    }

    public void setLocalEmbarqueProdutos(final String localEmbarqueProdutos) {
        StringValidador.tamanho60(localEmbarqueProdutos, "Local Embarque Produtos");
        this.localEmbarqueProdutos = localEmbarqueProdutos;
    }

    public String getUfEmbarqueProduto() {
        return this.ufEmbarqueProduto;
    }

    public void setUfEmbarqueProduto(final DFUnidadeFederativa ufEmbarqueProduto) {
        this.ufEmbarqueProduto = ufEmbarqueProduto.getCodigo();
    }
}