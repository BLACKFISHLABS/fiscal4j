package br.indie.fiscal4j.cte300.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.DFStringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "infRespTec")
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTeNotaInfoResponsavelTecnico extends DFBase {

    @Element(name = "CNPJ")
    private String cnpj;

    @Element(name = "xContato")
    private String contatoNome;

    @Element(name = "email")
    private String email;

    @Element(name = "fone")
    private String telefone;

    @Element(name = "idCSRT", required = false)
    private String idCSRT;

    @Element(name = "hashCSRT", required = false)
    private String hashCSRT;

    public String getCnpj() {
        return cnpj;
    }

    public CTeNotaInfoResponsavelTecnico setCnpj(String cnpj) {
        DFStringValidador.cnpj(cnpj);
        this.cnpj = cnpj;
        return this;
    }

    public String getContatoNome() {
        return contatoNome;
    }

    public CTeNotaInfoResponsavelTecnico setContatoNome(String contatoNome) {
        DFStringValidador.tamanho2ate60(contatoNome, "Responsavel tecnico");
        this.contatoNome = contatoNome;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public CTeNotaInfoResponsavelTecnico setEmail(String email) {
        DFStringValidador.email(email, "Responsavel tecnico ");
        DFStringValidador.validaIntervalo(email, 6, 60, "Responsavel tecnico");
        this.email = email;
        return this;
    }

    public String getTelefone() {
        return telefone;
    }

    public CTeNotaInfoResponsavelTecnico setTelefone(String telefone) {
        DFStringValidador.telefone(telefone, "Responsavel tecnico");
        this.telefone = telefone;
        return this;
    }

    public String getIdCSRT() {
        return idCSRT;
    }

    public void setIdCSRT(String idCSRT) {
        DFStringValidador.exatamente2N(idCSRT, "Responsavel tecnico");
        this.idCSRT = idCSRT;
    }

    public String getHashCSRT() {
        return hashCSRT;
    }

    public void setHashCSRT(String hashCSRT) {
        DFStringValidador.isBase64(hashCSRT, "HASH CSRT em Responsavel tecnico");
        this.hashCSRT = hashCSRT;
    }

}
