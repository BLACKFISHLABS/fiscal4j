package br.indie.fiscal4j.nfe.classes;

import br.indie.fiscal4j.common.DFAmbiente;
import br.indie.fiscal4j.common.DFUnidadeFederativa;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class NFAutorizador4Test {

    @Test
    public void deveBuscarCorretamenteURLsWebServiceAM() {
        final NFAutorizador4 autorizador = NFAutorizador4.AM;
        Assert.assertEquals("", autorizador.getConsultaCadastro(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homnfe.sefaz.am.gov.br/services2/services/NfeAutorizacao4", autorizador.getNfeAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homnfe.sefaz.am.gov.br/services2/services/NfeConsulta4", autorizador.getNfeConsultaProtocolo(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homnfe.sefaz.am.gov.br/services2/services/NfeRetAutorizacao4", autorizador.getNfeRetAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homnfe.sefaz.am.gov.br/services2/services/NfeStatusServico4", autorizador.getNfeStatusServico(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homnfe.sefaz.am.gov.br/services2/services/RecepcaoEvento4", autorizador.getRecepcaoEvento(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homnfe.sefaz.am.gov.br/services2/services/NfeInutilizacao4", autorizador.getNfeInutilizacao(DFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("", autorizador.getConsultaCadastro(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeConsultaProtocolo(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeRetAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeStatusServico(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getRecepcaoEvento(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeInutilizacao(DFAmbiente.PRODUCAO));
    }

    @Test
    public void deveBuscarCorretamenteURLsWebServiceAN() {
        final NFAutorizador4 autorizador = NFAutorizador4.AN;
        Assert.assertEquals("https://hom.nfe.fazenda.gov.br/NFeRecepcaoEvento4/NFeRecepcaoEvento4.asmx", autorizador.getRecepcaoEvento(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getRecepcaoEventoAN(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getNFeDistribuicaoDFe(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getNfeDownloadNF(DFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("", autorizador.getRecepcaoEvento(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getRecepcaoEventoAN(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNFeDistribuicaoDFe(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeDownloadNF(DFAmbiente.PRODUCAO));
    }

    @Test
    public void deveBuscarCorretamenteURLWebServiceBA() {
        final NFAutorizador4 autorizador = NFAutorizador4.BA;
        Assert.assertEquals("https://hnfe.sefaz.ba.gov.br/webservices/CadConsultaCadastro4/CadConsultaCadastro4.asmx", autorizador.getConsultaCadastro(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hnfe.sefaz.ba.gov.br/webservices/NFeAutorizacao4/NFeAutorizacao4.asmx", autorizador.getNfeAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hnfe.sefaz.ba.gov.br/webservices/NFeConsultaProtocolo4/NFeConsultaProtocolo4.asmx", autorizador.getNfeConsultaProtocolo(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hnfe.sefaz.ba.gov.br/webservices/NFeRetAutorizacao4/NFeRetAutorizacao4.asmx", autorizador.getNfeRetAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hnfe.sefaz.ba.gov.br/webservices/NFeStatusServico4/NFeStatusServico4.asmx", autorizador.getNfeStatusServico(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hnfe.sefaz.ba.gov.br/webservices/NFeRecepcaoEvento4/NFeRecepcaoEvento4.asmx", autorizador.getRecepcaoEvento(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hnfe.sefaz.ba.gov.br/webservices/NFeInutilizacao4/NFeInutilizacao4.asmx", autorizador.getNfeInutilizacao(DFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("", autorizador.getConsultaCadastro(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeConsultaProtocolo(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeRetAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeStatusServico(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getRecepcaoEvento(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeInutilizacao(DFAmbiente.PRODUCAO));
    }

    @Test
    public void deveBuscarCorretamenteURLWebServiceCE() {
        final NFAutorizador4 autorizador = NFAutorizador4.CE;
        Assert.assertEquals("", autorizador.getConsultaCadastro(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfeh.sefaz.ce.gov.br/nfe4/services/NFeAutorizacao4?WSDL", autorizador.getNfeAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfeh.sefaz.ce.gov.br/nfe4/services/NFeConsultaProtocolo4?WSDL", autorizador.getNfeConsultaProtocolo(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfeh.sefaz.ce.gov.br/nfe4/services/NFeRetAutorizacao4?WSDL", autorizador.getNfeRetAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfeh.sefaz.ce.gov.br/nfe4/services/NFeStatusServico4?WSDL", autorizador.getNfeStatusServico(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getRecepcaoEvento(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfeh.sefaz.ce.gov.br/nfe4/services/NFeInutilizacao4?WSDL", autorizador.getNfeInutilizacao(DFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("", autorizador.getConsultaCadastro(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeConsultaProtocolo(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeRetAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeStatusServico(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getRecepcaoEvento(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeInutilizacao(DFAmbiente.PRODUCAO));
    }

    @Test
    public void deveBuscarCorretamenteURLWebServiceGO() {
        final NFAutorizador4 autorizador = NFAutorizador4.GO;
        Assert.assertEquals("https://homolog.sefaz.go.gov.br/nfe/services/CadConsultaCadastro4?wsdl", autorizador.getConsultaCadastro(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homolog.sefaz.go.gov.br/nfe/services/NFeAutorizacao4?wsdl", autorizador.getNfeAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homolog.sefaz.go.gov.br/nfe/services/NFeConsultaProtocolo4?wsdl", autorizador.getNfeConsultaProtocolo(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homolog.sefaz.go.gov.br/nfe/services/NFeRetAutorizacao4?wsdl", autorizador.getNfeRetAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homolog.sefaz.go.gov.br/nfe/services/NFeStatusServico4?wsdl", autorizador.getNfeStatusServico(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homolog.sefaz.go.gov.br/nfe/services/NFeRecepcaoEvento4?wsdl", autorizador.getRecepcaoEvento(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homolog.sefaz.go.gov.br/nfe/services/NFeInutilizacao4?wsdl", autorizador.getNfeInutilizacao(DFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("", autorizador.getConsultaCadastro(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeConsultaProtocolo(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeRetAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeStatusServico(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getRecepcaoEvento(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeInutilizacao(DFAmbiente.PRODUCAO));
    }

    @Test
    public void deveBuscarCorretamenteURLWebServiceMA() {
        final NFAutorizador4 autorizador = NFAutorizador4.MA;
        Assert.assertEquals("https://hom.sefazvirtual.fazenda.gov.br/NFeAutorizacao4/NFeAutorizacao4.asmx", autorizador.getNfeAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hom.sefazvirtual.fazenda.gov.br/NFeConsultaProtocolo4/NFeConsultaProtocolo4.asmx", autorizador.getNfeConsultaProtocolo(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hom.sefazvirtual.fazenda.gov.br/NFeRetAutorizacao4/NFeRetAutorizacao4.asmx", autorizador.getNfeRetAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hom.sefazvirtual.fazenda.gov.br/NFeStatusServico4/NFeStatusServico4.asmx", autorizador.getNfeStatusServico(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hom.sefazvirtual.fazenda.gov.br/NFeRecepcaoEvento4/NFeRecepcaoEvento4.asmx", autorizador.getRecepcaoEvento(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hom.sefazvirtual.fazenda.gov.br/NFeInutilizacao4/NFeInutilizacao4.asmx", autorizador.getNfeInutilizacao(DFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("", autorizador.getNfeAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeConsultaProtocolo(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeRetAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeStatusServico(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getRecepcaoEvento(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeInutilizacao(DFAmbiente.PRODUCAO));

        Assert.assertEquals("", autorizador.getNfceAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getNfceConsultaProtocolo(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getNfceInutilizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getNfceRecepcaoEvento(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getNfceRetAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getNfceStatusServico(DFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("", autorizador.getNfceAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfceConsultaProtocolo(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfceInutilizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfceRecepcaoEvento(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfceRetAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfceStatusServico(DFAmbiente.PRODUCAO));
    }

    @Test
    public void deveBuscarCorretamenteURLWebServiceMG() {
        final NFAutorizador4 autorizador = NFAutorizador4.MG;
        Assert.assertEquals("", autorizador.getConsultaCadastro(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hnfe.fazenda.mg.gov.br/nfe2/services/NFeAutorizacao4", autorizador.getNfeAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hnfe.fazenda.mg.gov.br/nfe2/services/NFeConsulta4", autorizador.getNfeConsultaProtocolo(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hnfe.fazenda.mg.gov.br/nfe2/services/NFeRetAutorizacao4", autorizador.getNfeRetAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hnfe.fazenda.mg.gov.br/nfe2/services/NFeStatusServico4", autorizador.getNfeStatusServico(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getRecepcaoEvento(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getNfeInutilizacao(DFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("", autorizador.getConsultaCadastro(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeConsultaProtocolo(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeRetAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeStatusServico(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getRecepcaoEvento(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeInutilizacao(DFAmbiente.PRODUCAO));
    }

    @Test
    public void deveBuscarCorretamenteURLWebServiceMS() {
        final NFAutorizador4 autorizador = NFAutorizador4.MS;
        Assert.assertEquals("", autorizador.getConsultaCadastro(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.ms.gov.br/ws/NFeAutorizacao4", autorizador.getNfeAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.ms.gov.br/ws/NFeConsultaProtocolo4", autorizador.getNfeConsultaProtocolo(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.ms.gov.br/ws/NFeRetAutorizacao4", autorizador.getNfeRetAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.ms.gov.br/ws/NFeStatusServico4", autorizador.getNfeStatusServico(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.ms.gov.br/ws/NFeRecepcaoEvento4", autorizador.getRecepcaoEvento(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.ms.gov.br/ws/NFeInutilizacao4", autorizador.getNfeInutilizacao(DFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("", autorizador.getConsultaCadastro(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeConsultaProtocolo(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeRetAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeStatusServico(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getRecepcaoEvento(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeInutilizacao(DFAmbiente.PRODUCAO));

        Assert.assertEquals("", autorizador.getNfceAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getNfceConsultaProtocolo(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getNfceInutilizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getNfceRecepcaoEvento(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getNfceRetAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getNfceStatusServico(DFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("", autorizador.getNfceAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfceConsultaProtocolo(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfceInutilizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfceRecepcaoEvento(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfceRetAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfceStatusServico(DFAmbiente.PRODUCAO));
    }

    @Test
    public void deveBuscarCorretamenteURLWebServiceMT() {
        final NFAutorizador4 autorizador = NFAutorizador4.MT;
        Assert.assertEquals("", autorizador.getConsultaCadastro(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getNfeAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getNfeConsultaProtocolo(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getNfeRetAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getNfeStatusServico(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getRecepcaoEvento(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getNfeInutilizacao(DFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("", autorizador.getConsultaCadastro(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeConsultaProtocolo(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeRetAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeStatusServico(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getRecepcaoEvento(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeInutilizacao(DFAmbiente.PRODUCAO));
    }

    @Test
    public void deveBuscarCorretamenteURLWebServicePA() {
        final NFAutorizador4 autorizador = NFAutorizador4.PA;
        Assert.assertEquals("https://hom.sefazvirtual.fazenda.gov.br/NFeAutorizacao4/NFeAutorizacao4.asmx", autorizador.getNfeAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hom.sefazvirtual.fazenda.gov.br/NFeConsultaProtocolo4/NFeConsultaProtocolo4.asmx", autorizador.getNfeConsultaProtocolo(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hom.sefazvirtual.fazenda.gov.br/NFeRetAutorizacao4/NFeRetAutorizacao4.asmx", autorizador.getNfeRetAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hom.sefazvirtual.fazenda.gov.br/NFeStatusServico4/NFeStatusServico4.asmx", autorizador.getNfeStatusServico(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hom.sefazvirtual.fazenda.gov.br/NFeRecepcaoEvento4/NFeRecepcaoEvento4.asmx", autorizador.getRecepcaoEvento(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hom.sefazvirtual.fazenda.gov.br/NFeInutilizacao4/NFeInutilizacao4.asmx", autorizador.getNfeInutilizacao(DFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("", autorizador.getNfeAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeConsultaProtocolo(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeRetAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeStatusServico(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getRecepcaoEvento(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeInutilizacao(DFAmbiente.PRODUCAO));

        Assert.assertEquals("", autorizador.getNfceAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getNfceConsultaProtocolo(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getNfceInutilizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getNfceRecepcaoEvento(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getNfceRetAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getNfceStatusServico(DFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("", autorizador.getNfceAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfceConsultaProtocolo(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfceInutilizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfceRecepcaoEvento(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfceRetAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfceStatusServico(DFAmbiente.PRODUCAO));

    }

    @Test
    public void deveBuscarCorretamenteURLWebServicePE() {
        final NFAutorizador4 autorizador = NFAutorizador4.PE;
        Assert.assertEquals("", autorizador.getNfeAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getNfeConsultaProtocolo(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getNfeRetAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getNfeStatusServico(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getRecepcaoEvento(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getConsultaCadastro(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getNfeInutilizacao(DFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("", autorizador.getNfeAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeConsultaProtocolo(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeRetAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeStatusServico(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getRecepcaoEvento(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getConsultaCadastro(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeInutilizacao(DFAmbiente.PRODUCAO));
    }

    @Test
    public void deveBuscarCorretamenteURLWebServicePI() {
        final NFAutorizador4 autorizador = NFAutorizador4.PI;
        Assert.assertEquals("https://hom.sefazvirtual.fazenda.gov.br/NFeAutorizacao4/NFeAutorizacao4.asmx", autorizador.getNfeAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hom.sefazvirtual.fazenda.gov.br/NFeConsultaProtocolo4/NFeConsultaProtocolo4.asmx", autorizador.getNfeConsultaProtocolo(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hom.sefazvirtual.fazenda.gov.br/NFeRetAutorizacao4/NFeRetAutorizacao4.asmx", autorizador.getNfeRetAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hom.sefazvirtual.fazenda.gov.br/NFeStatusServico4/NFeStatusServico4.asmx", autorizador.getNfeStatusServico(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hom.sefazvirtual.fazenda.gov.br/NFeRecepcaoEvento4/NFeRecepcaoEvento4.asmx", autorizador.getRecepcaoEvento(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hom.sefazvirtual.fazenda.gov.br/NFeInutilizacao4/NFeInutilizacao4.asmx", autorizador.getNfeInutilizacao(DFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("", autorizador.getNfeAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeConsultaProtocolo(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeRetAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeStatusServico(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getRecepcaoEvento(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeInutilizacao(DFAmbiente.PRODUCAO));

        Assert.assertEquals("", autorizador.getNfceAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getNfceConsultaProtocolo(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getNfceInutilizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getNfceRecepcaoEvento(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getNfceRetAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("", autorizador.getNfceStatusServico(DFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("", autorizador.getNfceAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfceConsultaProtocolo(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfceInutilizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfceRecepcaoEvento(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfceRetAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfceStatusServico(DFAmbiente.PRODUCAO));
    }

    @Test
    public void deveBuscarCorretamenteURLWebServicePR() {
        final NFAutorizador4 autorizador = NFAutorizador4.PR;
        Assert.assertEquals("https://homologacao.nfe.sefa.pr.gov.br/nfe/CadConsultaCadastro4?wsdl", autorizador.getConsultaCadastro(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.sefa.pr.gov.br/nfe/NFeAutorizacao4?wsdl", autorizador.getNfeAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.sefa.pr.gov.br/nfe/NFeConsultaProtocolo4?wsdl", autorizador.getNfeConsultaProtocolo(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.sefa.pr.gov.br/nfe/NFeRetAutorizacao4?wsdl", autorizador.getNfeRetAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.sefa.pr.gov.br/nfe/NFeStatusServico4?wsdl", autorizador.getNfeStatusServico(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.sefa.pr.gov.br/nfe/NFeRecepcaoEvento4?wsdl", autorizador.getRecepcaoEvento(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.sefa.pr.gov.br/nfe/NFeInutilizacao4?wsdl", autorizador.getNfeInutilizacao(DFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("https://nfe.sefa.pr.gov.br/nfe/CadConsultaCadastro4?wsdl", autorizador.getConsultaCadastro(DFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefa.pr.gov.br/nfe/NFeAutorizacao4?wsdl", autorizador.getNfeAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefa.pr.gov.br/nfe/NFeConsultaProtocolo4?wsdl", autorizador.getNfeConsultaProtocolo(DFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefa.pr.gov.br/nfe/NFeRetAutorizacao4?wsdl", autorizador.getNfeRetAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefa.pr.gov.br/nfe/NFeStatusServico4?wsdl", autorizador.getNfeStatusServico(DFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefa.pr.gov.br/nfe/NFeRecepcaoEvento4?wsdl", autorizador.getRecepcaoEvento(DFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefa.pr.gov.br/nfe/NFeInutilizacao4?wsdl", autorizador.getNfeInutilizacao(DFAmbiente.PRODUCAO));
    }

    @Test
    public void deveBuscarCorretamenteURLWebServiceRS() {
        final NFAutorizador4 autorizador = NFAutorizador4.RS;
        Assert.assertEquals("", autorizador.getConsultaCadastro(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfe-homologacao.sefazrs.rs.gov.br/ws/NfeAutorizacao/NFeAutorizacao4.asmx", autorizador.getNfeAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfe-homologacao.sefazrs.rs.gov.br/ws/NfeConsulta/NfeConsulta4.asmx", autorizador.getNfeConsultaProtocolo(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfe-homologacao.sefazrs.rs.gov.br/ws/NfeRetAutorizacao/NFeRetAutorizacao4.asmx", autorizador.getNfeRetAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfe-homologacao.sefazrs.rs.gov.br/ws/NfeStatusServico/NfeStatusServico4.asmx", autorizador.getNfeStatusServico(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfe-homologacao.sefazrs.rs.gov.br/ws/recepcaoevento/recepcaoevento4.asmx", autorizador.getRecepcaoEvento(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfe-homologacao.sefazrs.rs.gov.br/ws/nfeinutilizacao/nfeinutilizacao4.asmx", autorizador.getNfeInutilizacao(DFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("", autorizador.getConsultaCadastro(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeConsultaProtocolo(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeRetAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeStatusServico(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getRecepcaoEvento(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeInutilizacao(DFAmbiente.PRODUCAO));
    }

    @Test
    public void deveBuscarCorretamenteURLWebServiceSP() {
        final NFAutorizador4 autorizador = NFAutorizador4.SP;
        Assert.assertEquals("https://homologacao.nfe.fazenda.sp.gov.br/ws/cadconsultacadastro4.asmx", autorizador.getConsultaCadastro(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.fazenda.sp.gov.br/ws/nfeautorizacao4.asmx", autorizador.getNfeAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.fazenda.sp.gov.br/ws/nfeconsultaprotocolo4.asmx", autorizador.getNfeConsultaProtocolo(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.fazenda.sp.gov.br/ws/nferetautorizacao4.asmx", autorizador.getNfeRetAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.fazenda.sp.gov.br/ws/nfestatusservico4.asmx", autorizador.getNfeStatusServico(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.fazenda.sp.gov.br/ws/nferecepcaoevento4.asmx", autorizador.getRecepcaoEvento(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.fazenda.sp.gov.br/ws/nfeinutilizacao4.asmx", autorizador.getNfeInutilizacao(DFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("", autorizador.getConsultaCadastro(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeConsultaProtocolo(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeRetAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeStatusServico(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getRecepcaoEvento(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeInutilizacao(DFAmbiente.PRODUCAO));
    }

    @Test
    public void deveBuscarCorretamenteURLWebServiceSCAN() {
        final NFAutorizador4 autorizador = NFAutorizador4.SCAN;
        Assert.assertEquals("https://hom.svc.fazenda.gov.br/NFeAutorizacao4/NFeAutorizacao4.asmx", autorizador.getNfeAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hom.svc.fazenda.gov.br/NFeConsultaProtocolo4/NFeConsultaProtocolo4.asmx", autorizador.getNfeConsultaProtocolo(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hom.svc.fazenda.gov.br/NFeRetAutorizacao4/NFeRetAutorizacao4.asmx", autorizador.getNfeRetAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hom.svc.fazenda.gov.br/NFeStatusServico4/NFeStatusServico4.asmx", autorizador.getNfeStatusServico(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hom.svc.fazenda.gov.br/NFeRecepcaoEvento4/NFeRecepcaoEvento4.asmx", autorizador.getRecepcaoEvento(DFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("", autorizador.getNfeAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeConsultaProtocolo(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeRetAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeStatusServico(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getRecepcaoEvento(DFAmbiente.PRODUCAO));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void naoPodeInutilizarNotasNoSCANEmProducao() {
        NFAutorizador4.SCAN.getNfeInutilizacao(DFAmbiente.PRODUCAO);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void naoPodeInutilizarNotasNoSCANEmHomologacao() {
        NFAutorizador4.SCAN.getNfeInutilizacao(DFAmbiente.HOMOLOGACAO);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void naoPodeConsultarCadastroNoSCANEmHomologacao() {
        NFAutorizador4.SCAN.getConsultaCadastro(DFAmbiente.HOMOLOGACAO);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void naoPodeConsultarCadastroNoSCANEmProducao() {
        NFAutorizador4.SCAN.getConsultaCadastro(DFAmbiente.PRODUCAO);
    }

    @Test
    public void naoDeveTerUFsAtreladaAoSCAN() {
        Assert.assertArrayEquals(new DFUnidadeFederativa[]{}, NFAutorizador4.SCAN.getUFs());
    }

    @Test
    public void deveBuscarCorretamenteURLWebServiceSVRS() {
        final NFAutorizador4 autorizador = NFAutorizador4.SVRS;
        Assert.assertEquals("", autorizador.getConsultaCadastro(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfe-homologacao.svrs.rs.gov.br/ws/NfeAutorizacao/NFeAutorizacao4.asmx", autorizador.getNfeAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfe-homologacao.svrs.rs.gov.br/ws/NfeConsulta/NfeConsulta4.asmx", autorizador.getNfeConsultaProtocolo(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfe-homologacao.svrs.rs.gov.br/ws/NfeRetAutorizacao/NFeRetAutorizacao4.asmx", autorizador.getNfeRetAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfe-homologacao.svrs.rs.gov.br/ws/NfeStatusServico/NfeStatusServico4.asmx", autorizador.getNfeStatusServico(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfe-homologacao.svrs.rs.gov.br/ws/recepcaoevento/recepcaoevento4.asmx", autorizador.getRecepcaoEvento(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfe-homologacao.svrs.rs.gov.br/ws/nfeinutilizacao/nfeinutilizacao4.asmx", autorizador.getNfeInutilizacao(DFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("", autorizador.getConsultaCadastro(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeConsultaProtocolo(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeRetAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeStatusServico(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getRecepcaoEvento(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeInutilizacao(DFAmbiente.PRODUCAO));
    }

    @Test
    public void deveBuscarCorretamenteURLWebServiceSVAN() {
        final NFAutorizador4 autorizador = NFAutorizador4.SVAN;
        Assert.assertEquals("https://hom.sefazvirtual.fazenda.gov.br/NFeAutorizacao4/NFeAutorizacao4.asmx", autorizador.getNfeAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hom.sefazvirtual.fazenda.gov.br/NFeRetAutorizacao4/NFeRetAutorizacao4.asmx", autorizador.getNfeRetAutorizacao(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hom.sefazvirtual.fazenda.gov.br/NFeConsultaProtocolo4/NFeConsultaProtocolo4.asmx", autorizador.getNfeConsultaProtocolo(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hom.sefazvirtual.fazenda.gov.br/NFeStatusServico4/NFeStatusServico4.asmx", autorizador.getNfeStatusServico(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hom.sefazvirtual.fazenda.gov.br/NFeRecepcaoEvento4/NFeRecepcaoEvento4.asmx", autorizador.getRecepcaoEvento(DFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hom.sefazvirtual.fazenda.gov.br/NFeInutilizacao4/NFeInutilizacao4.asmx", autorizador.getNfeInutilizacao(DFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("", autorizador.getNfeAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeRetAutorizacao(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeConsultaProtocolo(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeStatusServico(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getRecepcaoEvento(DFAmbiente.PRODUCAO));
        Assert.assertEquals("", autorizador.getNfeInutilizacao(DFAmbiente.PRODUCAO));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void deveLancarExcecaoCasoTenteObterServicoIndisponivelSVAN() {
        NFAutorizador4.SVAN.getConsultaCadastro(DFAmbiente.HOMOLOGACAO);
    }

    @Test
    public void deveObterAsFederacoesQueSVANEhResponsavel() {
        Assert.assertTrue(Arrays.deepEquals(NFAutorizador4.SVAN.getUFs(), new DFUnidadeFederativa[]{}));
    }

    @Test
    public void deveObterAutorizadorPelaUF() {
        Assert.assertEquals(NFAutorizador4.SVRS, NFAutorizador4.valueOfCodigoUF(DFUnidadeFederativa.AC));
        Assert.assertEquals(NFAutorizador4.SVRS, NFAutorizador4.valueOfCodigoUF(DFUnidadeFederativa.SC));
        Assert.assertEquals(NFAutorizador4.SP, NFAutorizador4.valueOfCodigoUF(DFUnidadeFederativa.SP));
    }

    @Test(expected = IllegalStateException.class)
    public void deveLancarExcecaoCasoRecebaUFNaoMapeada() {
        NFAutorizador4.valueOfCodigoUF(DFUnidadeFederativa.EX);
    }

    @Test
    public void deveObterAutorizadorDeChaveDeAcessoNFe() {
        Assert.assertEquals(NFAutorizador4.SVRS, NFAutorizador4.valueOfChaveAcesso("42306447535430986810252619468905605824735937"));
    }

    @Test
    public void deveObterSCANCasoEstejaEmContigencia() {
        Assert.assertEquals(NFAutorizador4.SCAN, NFAutorizador4.valueOfChaveAcesso("41170705325301000169550020000608246000000003"));
    }

    @Test
    public void deveObterSCRSCasoEstejaEmContigencia() {
        Assert.assertEquals(NFAutorizador4.SVRS, NFAutorizador4.valueOfChaveAcesso("41170705325301000169550020000608247000000003"));
    }

    @Test
    public void deveObterSVCRS() {
        Assert.assertEquals(NFAutorizador4.SVRS, NFAutorizador4.valueOfTipoEmissao(NFTipoEmissao.CONTINGENCIA_SVCRS, DFUnidadeFederativa.RS));
    }

    @Test
    public void deveObterSVCAN() {
        Assert.assertEquals(NFAutorizador4.SCAN, NFAutorizador4.valueOfTipoEmissao(NFTipoEmissao.CONTINGENCIA_SVCAN, DFUnidadeFederativa.RS));
    }

    @Test
    public void deveObterEmissorNormal() {
        Assert.assertEquals(NFAutorizador4.RS, NFAutorizador4.valueOfTipoEmissao(NFTipoEmissao.EMISSAO_NORMAL, DFUnidadeFederativa.RS));
    }

    @Test
    public void deveObterTodasAsUFsDoSVRS() {
        final List<DFUnidadeFederativa> ufsDaSVRS = Arrays.asList(DFUnidadeFederativa.AC, DFUnidadeFederativa.AL, DFUnidadeFederativa.AP, DFUnidadeFederativa.DF, DFUnidadeFederativa.ES, DFUnidadeFederativa.PA, DFUnidadeFederativa.PB, DFUnidadeFederativa.RJ, DFUnidadeFederativa.RN, DFUnidadeFederativa.RO, DFUnidadeFederativa.RR, DFUnidadeFederativa.SC, DFUnidadeFederativa.SE, DFUnidadeFederativa.TO);
        Assert.assertTrue(ufsDaSVRS.equals(Arrays.asList(NFAutorizador4.SVRS.getUFs())));
    }

    @Test
    public void deveObterEmissorNormalCasoEstejaContingenciaFSDA() {
        Assert.assertEquals(NFAutorizador4.RS, NFAutorizador4.valueOfTipoEmissao(NFTipoEmissao.CONTINGENCIA_FSDA, DFUnidadeFederativa.RS));
    }

    @Test
    public void deveObterEmissorNormalCasoEstejaContingenciaOffline() {
        Assert.assertEquals(NFAutorizador4.RS, NFAutorizador4.valueOfTipoEmissao(NFTipoEmissao.CONTIGENCIA_OFFLINE, DFUnidadeFederativa.RS));
    }
}