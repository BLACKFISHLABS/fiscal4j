package br.indie.fiscal4j.nfe.classes.lote.envio;

import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.nfe.classes.nota.DFNota;
import br.indie.fiscal4j.nfe.validadores.ListValidador;
import br.indie.fiscal4j.nfe.validadores.StringValidador;
import org.simpleframework.xml.*;

import java.util.List;

@Root(name = "enviNFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class DFLoteEnvio extends DFBase {

    @Attribute(name = "versao", required = true)
    private String versao;

    @Element(name = "idLote", required = true)
    private String idLote;

    @Element(name = "indSinc", required = true)
    private NFLoteIndicadorProcessamento indicadorProcessamento;

    @ElementList(name = "NFe", inline = true, required = true)
    List<DFNota> notas;

    public String getIdLote() {
        return this.idLote;
    }

    public void setIdLote(final String idLote) {
        StringValidador.tamanho15N(idLote, "ID do Lote");
        this.idLote = idLote;
    }

    public void setNotas(final List<DFNota> notas) {
        ListValidador.tamanho50(notas, "Notas");
        this.notas = notas;
    }

    public List<DFNota> getNotas() {
        return this.notas;
    }

    public void setVersao(final String versao) {
        this.versao = versao;
    }

    public void setIndicadorProcessamento(final NFLoteIndicadorProcessamento indicadorProcessamento) {
        this.indicadorProcessamento = indicadorProcessamento;
    }

    public String getVersao() {
        return this.versao;
    }

    public NFLoteIndicadorProcessamento getIndicadorProcessamento() {
        return this.indicadorProcessamento;
    }
}