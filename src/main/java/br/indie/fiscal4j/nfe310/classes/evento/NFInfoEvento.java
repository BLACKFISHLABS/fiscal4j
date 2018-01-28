package br.indie.fiscal4j.nfe310.classes.evento;

import br.indie.fiscal4j.DFAmbiente;
import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.DFUnidadeFederativa;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import br.indie.fiscal4j.validadores.IntegerValidador;
import br.indie.fiscal4j.validadores.StringValidador;
import org.joda.time.DateTime;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NFInfoEvento extends DFBase {
    private static final long serialVersionUID = 8878652860997939767L;

    @Attribute(name = "Id", required = true)
    private String id;

    @Element(name = "cOrgao", required = true)
    private DFUnidadeFederativa orgao;

    @Element(name = "tpAmb", required = true)
    private DFAmbiente ambiente;

    @Element(name = "CNPJ", required = false)
    private String cnpj;

    @Element(name = "CPF", required = false)
    private String cpf;

    @Element(name = "chNFe", required = true)
    private String chave;

    @Element(name = "dhEvento", required = true)
    private DateTime dataHoraEvento;

    @Element(name = "tpEvento", required = true)
    private String codigoEvento;

    @Element(name = "nSeqEvento", required = true)
    private Integer numeroSequencialEvento;

    @Element(name = "verEvento", required = true)
    private String versaoEvento;

    @Element(name = "detEvento", required = true)
    private NFTipoEvento dadosEvento;

    public String getId() {
        return this.id;
    }

    public void setId(final String id) {
        StringValidador.exatamente54(id, "Info Evento ID");
        this.id = id;
    }

    public DFAmbiente getAmbiente() {
        return this.ambiente;
    }

    public void setAmbiente(final DFAmbiente ambiente) {
        this.ambiente = ambiente;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(final String cnpj) {
        if (this.cpf != null) {
            throw new IllegalStateException("CPF ja foi setado");
        }
        StringValidador.cnpj(cnpj);
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(final String cpf) {
        if (this.cnpj != null) {
            throw new IllegalStateException("CNPJ ja foi setado");
        }
        StringValidador.cpf(cpf);
        this.cpf = cpf;
    }

    public String getChave() {
        return this.chave;
    }

    public void setChave(final String chave) {
        StringValidador.exatamente44N(chave, "Info Evento Chave");
        this.chave = chave;
    }

    public DateTime getDataHoraEvento() {
        return this.dataHoraEvento;
    }

    public void setDataHoraEvento(final DateTime dataHoraEvento) {
        this.dataHoraEvento = dataHoraEvento;
    }

    public String getCodigoEvento() {
        return this.codigoEvento;
    }

    public void setCodigoEvento(final String codigoEvento) {
        this.codigoEvento = codigoEvento;
    }

    public void setTipoEvento(final String tipoEvento) {
        StringValidador.exatamente6N(tipoEvento, "Tipo Evento");
        this.codigoEvento = tipoEvento;
    }

    public int getNumeroSequencialEvento() {
        return this.numeroSequencialEvento;
    }

    public void setNumeroSequencialEvento(final int numeroSequencialEvento) {
        IntegerValidador.tamanho1a2(numeroSequencialEvento, "Numero Sequencial Evento");
        this.numeroSequencialEvento = numeroSequencialEvento;
    }

    public String getVersaoEvento() {
        return this.versaoEvento;
    }

    public void setVersaoEvento(final BigDecimal versaoEvento) {
        this.versaoEvento = BigDecimalParser.tamanho5Com2CasasDecimais(versaoEvento, "Info Evento Versao");
    }

    public NFTipoEvento getDadosEvento() {
        return this.dadosEvento;
    }

    public void setDadosEvento(final NFTipoEvento cartaCorrecao) {
        this.dadosEvento = cartaCorrecao;
    }

    public DFUnidadeFederativa getOrgao() {
        return this.orgao;
    }

    public void setOrgao(final DFUnidadeFederativa orgao) {
        this.orgao = orgao;
    }
}