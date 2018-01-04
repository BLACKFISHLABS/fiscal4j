package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.nfe.validadores.BigDecimalParser;
import br.indie.fiscal4j.nfe.validadores.ListValidador;
import br.indie.fiscal4j.nfe.validadores.StringValidador;
import org.simpleframework.xml.*;

import java.math.BigDecimal;
import java.util.List;

@Root(name = "infNFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class DFNotaInfo extends DFBase {

    public static final String IDENT = "NFe";

    @Attribute(name = "Id", required = true)
    private String identificador;

    @Attribute(name = "versao", required = true)
    private String versao;

    @Element(name = "ide", required = true)
    private DFNotaInfoIdentificacao identificacao;

    @Element(name = "emit", required = true)
    private DFNotaInfoEmitente emitente;

    @Element(name = "avulsa", required = false)
    private DFNotaInfoAvulsa avulsa;

    @Element(name = "dest", required = false)
    private DFNotaInfoDestinatario destinatario;

    @Element(name = "retirada", required = false)
    private DFNotaInfoLocal retirada;

    @Element(name = "entrega", required = false)
    private DFNotaInfoLocal entrega;

    @ElementList(entry = "autXML", inline = true, required = false)
    private List<DFPessoaAutorizadaDownloadNFe> pessoasAutorizadasDownloadNFe;

    @ElementList(entry = "det", inline = true, required = true)
    private List<DFNotaInfoItem> itens;

    @Element(name = "total", required = true)
    private DFNotaInfoTotal total;

    @Element(name = "transp", required = true)
    private DFNotaInfoTransporte transporte;

    @Element(name = "cobr", required = false)
    private DFNotaInfoCobranca cobranca;

    @ElementList(entry = "pag", inline = true, required = false)
    private List<DFNotaInfoPagamento> pagamentos;

    @Element(name = "infAdic", required = false)
    private DFNotaInfoInformacoesAdicionais informacoesAdicionais;

    @Element(name = "exporta", required = false)
    private DFNotaInfoExportacao exportacao;

    @Element(name = "compra", required = false)
    private DFNotaInfoCompra compra;

    @Element(name = "cana", required = false)
    private DFNotaInfoCana cana;

    /**
     * Pega a chave de acesso a partir do identificador.
     *
     * @return Chave de acesso.
     */
    public String getChaveAcesso() {
        return this.identificador.replace(DFNotaInfo.IDENT, "");
    }

    public void setIdentificador(final String identificador) {
        StringValidador.exatamente44N(identificador, "Identificador");
        this.identificador = DFNotaInfo.IDENT + identificador;
    }

    public String getIdentificador() {
        return this.identificador;
    }

    public void setVersao(final BigDecimal versao) {
        this.versao = BigDecimalParser.tamanho4Com2CasasDecimais(versao, "Versao");
    }

    public DFNotaInfoIdentificacao getIdentificacao() {
        return this.identificacao;
    }

    public void setIdentificacao(final DFNotaInfoIdentificacao identificacao) {
        this.identificacao = identificacao;
    }

    public void setEmitente(final DFNotaInfoEmitente emitente) {
        this.emitente = emitente;
    }

    public void setAvulsa(final DFNotaInfoAvulsa avulsa) {
        this.avulsa = avulsa;
    }

    public DFNotaInfoDestinatario getDestinatario() {
        return this.destinatario;
    }

    public void setDestinatario(final DFNotaInfoDestinatario destinatario) {
        this.destinatario = destinatario;
    }

    public void setItens(final List<DFNotaInfoItem> itens) {
        ListValidador.tamanho990(itens, "Itens da Nota");
        this.itens = itens;
    }

    public void setRetirada(final DFNotaInfoLocal retirada) {
        this.retirada = retirada;
    }

    public void setEntrega(final DFNotaInfoLocal entrega) {
        this.entrega = entrega;
    }

    public void setCobranca(final DFNotaInfoCobranca cobranca) {
        this.cobranca = cobranca;
    }

    public void setTotal(final DFNotaInfoTotal total) {
        this.total = total;
    }

    public void setTransporte(final DFNotaInfoTransporte transporte) {
        this.transporte = transporte;
    }

    public void setInformacoesAdicionais(final DFNotaInfoInformacoesAdicionais informacoesAdicionais) {
        this.informacoesAdicionais = informacoesAdicionais;
    }

    public void setExportacao(final DFNotaInfoExportacao exportacao) {
        this.exportacao = exportacao;
    }

    public void setCompra(final DFNotaInfoCompra compra) {
        this.compra = compra;
    }

    public void setCana(final DFNotaInfoCana cana) {
        this.cana = cana;
    }

    public void setPessoasAutorizadasDownloadNFe(final List<DFPessoaAutorizadaDownloadNFe> pessoasAutorizadasDownloadNFe) {
        ListValidador.tamanho10(pessoasAutorizadasDownloadNFe, "Pessoas Autorizadas Download NFe");
        this.pessoasAutorizadasDownloadNFe = pessoasAutorizadasDownloadNFe;
    }

    public void setPagamentos(final List<DFNotaInfoPagamento> pagamentos) {
        ListValidador.tamanho100(pagamentos, "Pagamentos");
        this.pagamentos = pagamentos;
    }

    public String getVersao() {
        return this.versao;
    }

    public DFNotaInfoEmitente getEmitente() {
        return this.emitente;
    }

    public DFNotaInfoAvulsa getAvulsa() {
        return this.avulsa;
    }

    public DFNotaInfoLocal getRetirada() {
        return this.retirada;
    }

    public DFNotaInfoLocal getEntrega() {
        return this.entrega;
    }

    public List<DFPessoaAutorizadaDownloadNFe> getPessoasAutorizadasDownloadNFe() {
        return this.pessoasAutorizadasDownloadNFe;
    }

    public List<DFNotaInfoItem> getItens() {
        return this.itens;
    }

    public DFNotaInfoTotal getTotal() {
        return this.total;
    }

    public DFNotaInfoTransporte getTransporte() {
        return this.transporte;
    }

    public DFNotaInfoCobranca getCobranca() {
        return this.cobranca;
    }

    public List<DFNotaInfoPagamento> getPagamentos() {
        return this.pagamentos;
    }

    public DFNotaInfoInformacoesAdicionais getInformacoesAdicionais() {
        return this.informacoesAdicionais;
    }

    public DFNotaInfoExportacao getExportacao() {
        return this.exportacao;
    }

    public DFNotaInfoCompra getCompra() {
        return this.compra;
    }

    public DFNotaInfoCana getCana() {
        return this.cana;
    }
}