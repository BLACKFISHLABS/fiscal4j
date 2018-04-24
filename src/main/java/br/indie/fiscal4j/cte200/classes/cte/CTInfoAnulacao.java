package br.indie.fiscal4j.cte200.classes.cte;

import br.indie.fiscal4j.DFBase;
import org.joda.time.LocalDate;
import org.simpleframework.xml.Element;

public class CTInfoAnulacao extends DFBase {
    private static final long serialVersionUID = -1791655256752167342L;

    @Element(name = "chCTe")
    private String chaveAcessoAnulado;

    @Element(name = "dEmi")
    private LocalDate dataEmissaoDeclaracao;

    public String getChaveAcessoAnulado() {
        return this.chaveAcessoAnulado;
    }

    public void setChaveAcessoAnulado(final String chaveAcessoAnulado) {
        this.chaveAcessoAnulado = chaveAcessoAnulado;
    }

    public LocalDate getDataEmissaoDeclaracao() {
        return this.dataEmissaoDeclaracao;
    }

    public void setDataEmissaoDeclaracao(final LocalDate dataEmissaoDeclaracao) {
        this.dataEmissaoDeclaracao = dataEmissaoDeclaracao;
    }

}
