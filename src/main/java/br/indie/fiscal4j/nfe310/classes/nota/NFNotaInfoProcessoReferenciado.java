package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.nfe310.classes.NFOrigemProcesso;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Element;

public class NFNotaInfoProcessoReferenciado extends DFBase {
    private static final long serialVersionUID = -5213086059996742347L;

    @Element(name = "nProc", required = true)
    private String identificadorProcessoOuAtoConcessorio;

    @Element(name = "indProc", required = true)
    private NFOrigemProcesso indicadorOrigemProcesso;

    public String getIdentificadorProcessoOuAtoConcessorio() {
        return this.identificadorProcessoOuAtoConcessorio;
    }

    public void setIdentificadorProcessoOuAtoConcessorio(final String identificadorProcessoOuAtoConcessorio) {
        StringValidador.tamanho60(identificadorProcessoOuAtoConcessorio, "Identificador Processo Ou Ato Concessorio Processo Referenciado");
        this.identificadorProcessoOuAtoConcessorio = identificadorProcessoOuAtoConcessorio;
    }

    public NFOrigemProcesso getIndicadorOrigemProcesso() {
        return this.indicadorOrigemProcesso;
    }

    public void setIndicadorOrigemProcesso(final NFOrigemProcesso indicadorOrigemProcesso) {
        this.indicadorOrigemProcesso = indicadorOrigemProcesso;
    }
}