package br.indie.fiscal4j.nfe.classes.evento.inutilizacao;

import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.nfe.classes.nota.assinatura.DFSignature;
import br.indie.fiscal4j.nfe.validadores.BigDecimalParser;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;

@Root(name = "inutNFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class NFEnviaEventoInutilizacao extends DFBase {

    @Attribute(name = "versao", required = true)
    private String versao;

    @Element(name = "infInut", required = true)
    private NFEventoInutilizacaoDados dados;

    @Element(name = "Signature", required = false)
    private DFSignature assinatura;

    public String getVersao() {
        return this.versao;
    }

    public void setVersao(final BigDecimal versao) {
        this.versao = BigDecimalParser.tamanho5Com2CasasDecimais(versao, "Versao");
    }

    public NFEventoInutilizacaoDados getDados() {
        return this.dados;
    }

    public void setDados(final NFEventoInutilizacaoDados dados) {
        this.dados = dados;
    }

    public DFSignature getAssinatura() {
        return this.assinatura;
    }

    public void setAssinatura(final DFSignature assinatura) {
        this.assinatura = assinatura;
    }
}