package br.indie.fiscal4j.nfe.classes;

import br.indie.fiscal4j.common.DFAmbiente;
import br.indie.fiscal4j.common.DFUnidadeFederativa;
import br.indie.fiscal4j.nfe.parsers.NotaFiscalChaveParser;

import java.util.Arrays;

/**
 * <h1>URLs dos serviços</h1><br>
 * <a href="http://hom.nfe.fazenda.gov.br/portal/webServices.aspx?tipoConteudo=Wak0FwB7dKs=">NFE
 * Homologação</a><br>
 * <a href="http://www.nfe.fazenda.gov.br/portal/webServices.aspx?tipoConteudo=Wak0FwB7dKs=">NFE
 * Produção</a><br>
 * <br>
 * <a href="http://nfce.encat.org/desenvolvedor/webservices-h">NFCE
 * Homologação</a><br>
 * <a href="http://nfce.encat.org/desenvolvedor/webservices-p">NFCE Produção</a>
 */
public enum NFAutorizador4 {

    AM {
        @Override
        public String getNfeAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homnfe.sefaz.am.gov.br/services2/services/NfeAutorizacao4" : "";
        }

        @Override
        public String getNfeRetAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homnfe.sefaz.am.gov.br/services2/services/NfeRetAutorizacao4" : "";
        }

        @Override
        public String getNfeConsultaProtocolo(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homnfe.sefaz.am.gov.br/services2/services/NfeConsulta4" : "";
        }

        @Override
        public String getNfeStatusServico(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homnfe.sefaz.am.gov.br/services2/services/NfeStatusServico4" : "";
        }

        @Override
        public String getRecepcaoEvento(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homnfe.sefaz.am.gov.br/services2/services/RecepcaoEvento4" : "";
        }

        @Override
        public String getConsultaCadastro(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfeInutilizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homnfe.sefaz.am.gov.br/services2/services/NfeInutilizacao4" : "";
        }

        @Override
        public String getNfceAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceRetAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceConsultaProtocolo(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? null : "";
        }

        @Override
        public String getNfceStatusServico(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceRecepcaoEvento(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceInutilizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getRecepcaoEventoAN(final DFAmbiente ambiente) {
            return AN.getRecepcaoEventoAN(ambiente);
        }

        @Override
        public String getNFeDistribuicaoDFe(final DFAmbiente ambiente) {
            throw new UnsupportedOperationException("Nao suportado ainda");
        }

        @Override
        public String getNfeDownloadNF(final DFAmbiente ambiente) {
            return AN.getNfeDownloadNF(ambiente);
        }

        @Override
        public DFUnidadeFederativa[] getUFs() {
            return new DFUnidadeFederativa[]{DFUnidadeFederativa.AM};
        }
    },
    AN {
        @Override
        public String getRecepcaoEvento(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://hom.nfe.fazenda.gov.br/NFeRecepcaoEvento4/NFeRecepcaoEvento4.asmx" : "";
        }

        @Override
        public String getNfeAutorizacao(final DFAmbiente ambiente) {
            return null;
        }

        @Override
        public String getNfeRetAutorizacao(final DFAmbiente ambiente) {
            return null;
        }

        @Override
        public String getNfeConsultaProtocolo(final DFAmbiente ambiente) {
            return null;
        }

        @Override
        public String getNfeStatusServico(final DFAmbiente ambiente) {
            return null;
        }

        @Override
        public String getConsultaCadastro(final DFAmbiente ambiente) {
            return null;
        }

        @Override
        public String getNfeInutilizacao(final DFAmbiente ambiente) {
            return null;
        }

        @Override
        public String getNfceAutorizacao(final DFAmbiente ambiente) {
            return null;
        }

        @Override
        public String getNfceRetAutorizacao(final DFAmbiente ambiente) {
            return null;
        }

        @Override
        public String getNfceConsultaProtocolo(final DFAmbiente ambiente) {
            return null;
        }

        @Override
        public String getNfceStatusServico(final DFAmbiente ambiente) {
            return null;
        }

        @Override
        public String getNfceRecepcaoEvento(final DFAmbiente ambiente) {
            return null;
        }

        @Override
        public String getNfceInutilizacao(final DFAmbiente ambiente) {
            return null;
        }

        @Override
        public String getRecepcaoEventoAN(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNFeDistribuicaoDFe(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfeDownloadNF(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public DFUnidadeFederativa[] getUFs() {
            return new DFUnidadeFederativa[]{};
        }
    },

    BA {
        @Override
        public String getNfeAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://hnfe.sefaz.ba.gov.br/webservices/NFeAutorizacao4/NFeAutorizacao4.asmx" : "";
        }

        @Override
        public String getNfeRetAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://hnfe.sefaz.ba.gov.br/webservices/NFeRetAutorizacao4/NFeRetAutorizacao4.asmx" : "";
        }

        @Override
        public String getNfeConsultaProtocolo(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://hnfe.sefaz.ba.gov.br/webservices/NFeConsultaProtocolo4/NFeConsultaProtocolo4.asmx" : "";
        }

        @Override
        public String getNfeStatusServico(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://hnfe.sefaz.ba.gov.br/webservices/NFeStatusServico4/NFeStatusServico4.asmx" : "";
        }

        @Override
        public String getRecepcaoEvento(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://hnfe.sefaz.ba.gov.br/webservices/NFeRecepcaoEvento4/NFeRecepcaoEvento4.asmx" : "";
        }

        @Override
        public String getConsultaCadastro(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://hnfe.sefaz.ba.gov.br/webservices/CadConsultaCadastro4/CadConsultaCadastro4.asmx" : "";
        }

        @Override
        public String getNfeInutilizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://hnfe.sefaz.ba.gov.br/webservices/NFeInutilizacao4/NFeInutilizacao4.asmx" : "";
        }

        @Override
        public String getNfceAutorizacao(final DFAmbiente ambiente) {
            return SVRS.getNfceAutorizacao(ambiente);
        }

        @Override
        public String getNfceRetAutorizacao(final DFAmbiente ambiente) {
            return SVRS.getNfceRetAutorizacao(ambiente);
        }

        @Override
        public String getNfceConsultaProtocolo(final DFAmbiente ambiente) {
            return SVRS.getNfceConsultaProtocolo(ambiente);
        }

        @Override
        public String getNfceStatusServico(final DFAmbiente ambiente) {
            return SVRS.getNfceStatusServico(ambiente);
        }

        @Override
        public String getNfceRecepcaoEvento(final DFAmbiente ambiente) {
            return SVRS.getNfceRecepcaoEvento(ambiente);
        }

        @Override
        public String getNfceInutilizacao(final DFAmbiente ambiente) {
            return SVRS.getNfceInutilizacao(ambiente);
        }

        @Override
        public String getRecepcaoEventoAN(final DFAmbiente ambiente) {
            return AN.getRecepcaoEventoAN(ambiente);
        }

        @Override
        public String getNFeDistribuicaoDFe(final DFAmbiente ambiente) {
            throw new UnsupportedOperationException("Nao suportado ainda");
        }

        @Override
        public String getNfeDownloadNF(final DFAmbiente ambiente) {
            return AN.getNfeDownloadNF(ambiente);
        }

        @Override
        public DFUnidadeFederativa[] getUFs() {
            return new DFUnidadeFederativa[]{DFUnidadeFederativa.BA};
        }
    },
    CE {
        @Override
        public String getNfeAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://nfeh.sefaz.ce.gov.br/nfe4/services/NFeAutorizacao4?WSDL" : "";
        }

        @Override
        public String getNfeRetAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://nfeh.sefaz.ce.gov.br/nfe4/services/NFeRetAutorizacao4?WSDL" : "";
        }

        @Override
        public String getNfeConsultaProtocolo(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://nfeh.sefaz.ce.gov.br/nfe4/services/NFeConsultaProtocolo4?WSDL" : "";
        }

        @Override
        public String getNfeStatusServico(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://nfeh.sefaz.ce.gov.br/nfe4/services/NFeStatusServico4?WSDL" : "";
        }

        @Override
        public String getRecepcaoEvento(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getConsultaCadastro(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfeInutilizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://nfeh.sefaz.ce.gov.br/nfe4/services/NFeInutilizacao4?WSDL" : "";
        }

        @Override
        public String getNfceAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : null;
        }

        @Override
        public String getNfceRetAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : null;
        }

        @Override
        public String getNfceConsultaProtocolo(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : null;
        }

        @Override
        public String getNfceStatusServico(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : null;
        }

        @Override
        public String getNfceRecepcaoEvento(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : null;
        }

        @Override
        public String getNfceInutilizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : null;
        }

        @Override
        public String getRecepcaoEventoAN(final DFAmbiente ambiente) {
            return AN.getRecepcaoEventoAN(ambiente);
        }

        @Override
        public String getNFeDistribuicaoDFe(final DFAmbiente ambiente) {
            throw new UnsupportedOperationException("Nao suportado ainda");
        }

        @Override
        public String getNfeDownloadNF(final DFAmbiente ambiente) {
            return AN.getNfeDownloadNF(ambiente);
        }

        @Override
        public DFUnidadeFederativa[] getUFs() {
            return new DFUnidadeFederativa[]{DFUnidadeFederativa.CE};
        }
    },
    GO {
        @Override
        public String getNfeAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homolog.sefaz.go.gov.br/nfe/services/NFeAutorizacao4?wsdl" : "";
        }

        @Override
        public String getNfeRetAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homolog.sefaz.go.gov.br/nfe/services/NFeRetAutorizacao4?wsdl" : "";
        }

        @Override
        public String getNfeConsultaProtocolo(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homolog.sefaz.go.gov.br/nfe/services/NFeConsultaProtocolo4?wsdl" : "";
        }

        @Override
        public String getNfeStatusServico(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homolog.sefaz.go.gov.br/nfe/services/NFeStatusServico4?wsdl" : "";
        }

        @Override
        public String getRecepcaoEvento(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homolog.sefaz.go.gov.br/nfe/services/NFeRecepcaoEvento4?wsdl" : "";
        }

        @Override
        public String getConsultaCadastro(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homolog.sefaz.go.gov.br/nfe/services/CadConsultaCadastro4?wsdl" : "";
        }

        @Override
        public String getNfeInutilizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homolog.sefaz.go.gov.br/nfe/services/NFeInutilizacao4?wsdl" : "";
        }

        @Override
        public String getNfceAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceRetAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceConsultaProtocolo(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceStatusServico(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceRecepcaoEvento(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceInutilizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getRecepcaoEventoAN(final DFAmbiente ambiente) {
            return AN.getRecepcaoEventoAN(ambiente);
        }

        @Override
        public String getNFeDistribuicaoDFe(final DFAmbiente ambiente) {
            throw new UnsupportedOperationException("Nao suportado ainda");
        }

        @Override
        public String getNfeDownloadNF(final DFAmbiente ambiente) {
            return AN.getNfeDownloadNF(ambiente);
        }

        @Override
        public DFUnidadeFederativa[] getUFs() {
            return new DFUnidadeFederativa[]{DFUnidadeFederativa.GO};
        }
    },
    MA {
        @Override
        public String getNfeAutorizacao(final DFAmbiente ambiente) {
            return SVAN.getNfeAutorizacao(ambiente);
        }

        @Override
        public String getNfeRetAutorizacao(final DFAmbiente ambiente) {
            return SVAN.getNfeRetAutorizacao(ambiente);
        }

        @Override
        public String getNfeConsultaProtocolo(final DFAmbiente ambiente) {
            return SVAN.getNfeConsultaProtocolo(ambiente);
        }

        @Override
        public String getNfeStatusServico(final DFAmbiente ambiente) {
            return SVAN.getNfeStatusServico(ambiente);
        }

        @Override
        public String getRecepcaoEvento(final DFAmbiente ambiente) {
            return SVAN.getRecepcaoEvento(ambiente);
        }

        @Override
        public String getConsultaCadastro(final DFAmbiente ambiente) {
            return SVAN.getConsultaCadastro(ambiente);
        }

        @Override
        public String getNfeInutilizacao(final DFAmbiente ambiente) {
            return SVAN.getNfeInutilizacao(ambiente);
        }

        @Override
        public String getNfceAutorizacao(final DFAmbiente ambiente) {
            return SVRS.getNfceAutorizacao(ambiente);
        }

        @Override
        public String getNfceRetAutorizacao(final DFAmbiente ambiente) {
            return SVRS.getNfceRetAutorizacao(ambiente);
        }

        @Override
        public String getNfceConsultaProtocolo(final DFAmbiente ambiente) {
            return SVRS.getNfceConsultaProtocolo(ambiente);
        }

        @Override
        public String getNfceStatusServico(final DFAmbiente ambiente) {
            return SVRS.getNfceStatusServico(ambiente);
        }

        @Override
        public String getNfceRecepcaoEvento(final DFAmbiente ambiente) {
            return SVRS.getNfceRecepcaoEvento(ambiente);
        }

        @Override
        public String getNfceInutilizacao(final DFAmbiente ambiente) {
            return SVRS.getNfceInutilizacao(ambiente);
        }

        @Override
        public String getRecepcaoEventoAN(final DFAmbiente ambiente) {
            return AN.getRecepcaoEventoAN(ambiente);
        }

        @Override
        public String getNFeDistribuicaoDFe(final DFAmbiente ambiente) {
            throw new UnsupportedOperationException("Nao suportado ainda");
        }

        @Override
        public String getNfeDownloadNF(final DFAmbiente ambiente) {
            return AN.getNfeDownloadNF(ambiente);
        }

        @Override
        public DFUnidadeFederativa[] getUFs() {
            return new DFUnidadeFederativa[]{DFUnidadeFederativa.MA};
        }
    },
    MG {
        @Override
        public String getNfeAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://hnfe.fazenda.mg.gov.br/nfe2/services/NFeAutorizacao4" : "";
        }

        @Override
        public String getNfeRetAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://hnfe.fazenda.mg.gov.br/nfe2/services/NFeRetAutorizacao4" : "";
        }

        @Override
        public String getNfeConsultaProtocolo(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://hnfe.fazenda.mg.gov.br/nfe2/services/NFeConsulta4" : "";
        }

        @Override
        public String getNfeStatusServico(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://hnfe.fazenda.mg.gov.br/nfe2/services/NFeStatusServico4" : "";
        }

        @Override
        public String getRecepcaoEvento(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getConsultaCadastro(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfeInutilizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceRetAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceConsultaProtocolo(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceStatusServico(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceRecepcaoEvento(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceInutilizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getRecepcaoEventoAN(final DFAmbiente ambiente) {
            return AN.getRecepcaoEventoAN(ambiente);
        }

        @Override
        public String getNFeDistribuicaoDFe(final DFAmbiente ambiente) {
            throw new UnsupportedOperationException("Nao suportado ainda");
        }

        @Override
        public String getNfeDownloadNF(final DFAmbiente ambiente) {
            return AN.getNfeDownloadNF(ambiente);
        }

        @Override
        public DFUnidadeFederativa[] getUFs() {
            return new DFUnidadeFederativa[]{DFUnidadeFederativa.MG};
        }
    },
    MS {
        @Override
        public String getNfeAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfe.ms.gov.br/ws/NFeAutorizacao4" : "";
        }

        @Override
        public String getNfeRetAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfe.ms.gov.br/ws/NFeRetAutorizacao4" : "";
        }

        @Override
        public String getNfeConsultaProtocolo(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfe.ms.gov.br/ws/NFeConsultaProtocolo4" : "";
        }

        @Override
        public String getNfeStatusServico(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfe.ms.gov.br/ws/NFeStatusServico4" : "";
        }

        @Override
        public String getRecepcaoEvento(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfe.ms.gov.br/ws/NFeRecepcaoEvento4" : "";
        }

        @Override
        public String getConsultaCadastro(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfeInutilizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfe.ms.gov.br/ws/NFeInutilizacao4" : "";
        }

        @Override
        public String getNfceAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceRetAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceConsultaProtocolo(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceStatusServico(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceRecepcaoEvento(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceInutilizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getRecepcaoEventoAN(final DFAmbiente ambiente) {
            return AN.getRecepcaoEventoAN(ambiente);
        }

        @Override
        public String getNFeDistribuicaoDFe(final DFAmbiente ambiente) {
            throw new UnsupportedOperationException("Nao suportado ainda");
        }

        @Override
        public String getNfeDownloadNF(final DFAmbiente ambiente) {
            return AN.getNfeDownloadNF(ambiente);
        }

        @Override
        public DFUnidadeFederativa[] getUFs() {
            return new DFUnidadeFederativa[]{DFUnidadeFederativa.MS};
        }
    },
    MT {
        @Override
        public String getNfeAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfeRetAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfeConsultaProtocolo(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfeStatusServico(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getRecepcaoEvento(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getConsultaCadastro(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfeInutilizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceRetAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceConsultaProtocolo(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceStatusServico(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceRecepcaoEvento(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceInutilizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getRecepcaoEventoAN(final DFAmbiente ambiente) {
            return AN.getRecepcaoEventoAN(ambiente);
        }

        @Override
        public String getNFeDistribuicaoDFe(final DFAmbiente ambiente) {
            throw new UnsupportedOperationException("Nao suportado ainda");
        }

        @Override
        public String getNfeDownloadNF(final DFAmbiente ambiente) {
            return AN.getNfeDownloadNF(ambiente);
        }

        @Override
        public DFUnidadeFederativa[] getUFs() {
            return new DFUnidadeFederativa[]{DFUnidadeFederativa.MT};
        }
    },
    PA {
        @Override
        public String getNfeAutorizacao(final DFAmbiente ambiente) {
            return SVAN.getNfeAutorizacao(ambiente);
        }

        @Override
        public String getNfeRetAutorizacao(final DFAmbiente ambiente) {
            return SVAN.getNfeRetAutorizacao(ambiente);
        }

        @Override
        public String getNfeConsultaProtocolo(final DFAmbiente ambiente) {
            return SVAN.getNfeConsultaProtocolo(ambiente);
        }

        @Override
        public String getNfeStatusServico(final DFAmbiente ambiente) {
            return SVAN.getNfeStatusServico(ambiente);
        }

        @Override
        public String getRecepcaoEvento(final DFAmbiente ambiente) {
            return SVAN.getRecepcaoEvento(ambiente);
        }

        @Override
        public String getConsultaCadastro(final DFAmbiente ambiente) {
            return SVAN.getConsultaCadastro(ambiente);
        }

        @Override
        public String getNfeInutilizacao(final DFAmbiente ambiente) {
            return SVAN.getNfeInutilizacao(ambiente);
        }

        @Override
        public String getNfceAutorizacao(final DFAmbiente ambiente) {
            return SVRS.getNfceAutorizacao(ambiente);
        }

        @Override
        public String getNfceRetAutorizacao(final DFAmbiente ambiente) {
            return SVRS.getNfceRetAutorizacao(ambiente);
        }

        @Override
        public String getNfceConsultaProtocolo(final DFAmbiente ambiente) {
            return SVRS.getNfceConsultaProtocolo(ambiente);
        }

        @Override
        public String getNfceStatusServico(final DFAmbiente ambiente) {
            return SVRS.getNfceStatusServico(ambiente);
        }

        @Override
        public String getNfceRecepcaoEvento(final DFAmbiente ambiente) {
            return SVRS.getNfceRecepcaoEvento(ambiente);
        }

        @Override
        public String getNfceInutilizacao(final DFAmbiente ambiente) {
            return SVRS.getNfceInutilizacao(ambiente);
        }

        @Override
        public String getRecepcaoEventoAN(final DFAmbiente ambiente) {
            return AN.getRecepcaoEventoAN(ambiente);
        }

        @Override
        public String getNFeDistribuicaoDFe(final DFAmbiente ambiente) {
            throw new UnsupportedOperationException("Nao suportado ainda");
        }

        @Override
        public String getNfeDownloadNF(final DFAmbiente ambiente) {
            throw new UnsupportedOperationException("Nao suportado ainda");
        }

        @Override
        public DFUnidadeFederativa[] getUFs() {
            return new DFUnidadeFederativa[]{DFUnidadeFederativa.PA};
        }
    },
    PE {
        @Override
        public String getNfeAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfeRetAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfeConsultaProtocolo(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfeStatusServico(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getRecepcaoEvento(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getConsultaCadastro(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfeInutilizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceRetAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceConsultaProtocolo(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceStatusServico(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceRecepcaoEvento(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceInutilizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getRecepcaoEventoAN(final DFAmbiente ambiente) {
            return AN.getRecepcaoEventoAN(ambiente);
        }

        @Override
        public String getNFeDistribuicaoDFe(final DFAmbiente ambiente) {
            throw new UnsupportedOperationException("Nao suportado ainda");
        }

        @Override
        public String getNfeDownloadNF(final DFAmbiente ambiente) {
            return AN.getNfeDownloadNF(ambiente);
        }

        @Override
        public DFUnidadeFederativa[] getUFs() {
            return new DFUnidadeFederativa[]{DFUnidadeFederativa.PE};
        }
    },
    PI {
        @Override
        public String getNfeAutorizacao(final DFAmbiente ambiente) {
            return SVAN.getNfeAutorizacao(ambiente);
        }

        @Override
        public String getNfeRetAutorizacao(final DFAmbiente ambiente) {
            return SVAN.getNfeRetAutorizacao(ambiente);
        }

        @Override
        public String getNfeConsultaProtocolo(final DFAmbiente ambiente) {
            return SVAN.getNfeConsultaProtocolo(ambiente);
        }

        @Override
        public String getNfeStatusServico(final DFAmbiente ambiente) {
            return SVAN.getNfeStatusServico(ambiente);
        }

        @Override
        public String getRecepcaoEvento(final DFAmbiente ambiente) {
            return SVAN.getRecepcaoEvento(ambiente);
        }

        @Override
        public String getConsultaCadastro(final DFAmbiente ambiente) {
            return SVAN.getConsultaCadastro(ambiente);
        }

        @Override
        public String getNfeInutilizacao(final DFAmbiente ambiente) {
            return SVAN.getNfeInutilizacao(ambiente);
        }

        @Override
        public String getNfceAutorizacao(final DFAmbiente ambiente) {
            return SVRS.getNfceAutorizacao(ambiente);
        }

        @Override
        public String getNfceRetAutorizacao(final DFAmbiente ambiente) {
            return SVRS.getNfceRetAutorizacao(ambiente);
        }

        @Override
        public String getNfceConsultaProtocolo(final DFAmbiente ambiente) {
            return SVRS.getNfceConsultaProtocolo(ambiente);
        }

        @Override
        public String getNfceStatusServico(final DFAmbiente ambiente) {
            return SVRS.getNfceStatusServico(ambiente);
        }

        @Override
        public String getNfceRecepcaoEvento(final DFAmbiente ambiente) {
            return SVRS.getNfceRecepcaoEvento(ambiente);
        }

        @Override
        public String getNfceInutilizacao(final DFAmbiente ambiente) {
            return SVRS.getNfceInutilizacao(ambiente);
        }

        @Override
        public String getRecepcaoEventoAN(final DFAmbiente ambiente) {
            return AN.getRecepcaoEventoAN(ambiente);
        }

        @Override
        public String getNFeDistribuicaoDFe(final DFAmbiente ambiente) {
            throw new UnsupportedOperationException("Nao suportado ainda");
        }

        @Override
        public String getNfeDownloadNF(final DFAmbiente ambiente) {
            return AN.getNfeDownloadNF(ambiente);
        }

        @Override
        public DFUnidadeFederativa[] getUFs() {
            return new DFUnidadeFederativa[]{DFUnidadeFederativa.PI};
        }
    },
    PR {
        @Override
        public String getNfeAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfe.sefa.pr.gov.br/nfe/NFeAutorizacao4?wsdl" : "https://nfe.sefa.pr.gov.br/nfe/NFeAutorizacao4?wsdl";
        }

        @Override
        public String getNfeRetAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfe.sefa.pr.gov.br/nfe/NFeRetAutorizacao4?wsdl" : "https://nfe.sefa.pr.gov.br/nfe/NFeRetAutorizacao4?wsdl";
        }

        @Override
        public String getNfeConsultaProtocolo(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfe.sefa.pr.gov.br/nfe/NFeConsultaProtocolo4?wsdl" : "https://nfe.sefa.pr.gov.br/nfe/NFeConsultaProtocolo4?wsdl";
        }

        @Override
        public String getNfeStatusServico(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfe.sefa.pr.gov.br/nfe/NFeStatusServico4?wsdl" : "https://nfe.sefa.pr.gov.br/nfe/NFeStatusServico4?wsdl";
        }

        @Override
        public String getRecepcaoEvento(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "	https://homologacao.nfe.sefa.pr.gov.br/nfe/NFeRecepcaoEvento4?wsdl" : "https://nfe.sefa.pr.gov.br/nfe/NFeRecepcaoEvento4?wsdl";
        }

        @Override
        public String getConsultaCadastro(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfe.sefa.pr.gov.br/nfe/CadConsultaCadastro4?wsdl" : "https://nfe.sefa.pr.gov.br/nfe/CadConsultaCadastro4?wsdl";
        }

        @Override
        public String getNfeInutilizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfe.sefa.pr.gov.br/nfe/NFeInutilizacao4?wsdl" : "https://nfe.sefa.pr.gov.br/nfe/NFeInutilizacao4?wsdl";
        }

        @Override
        public String getNfceAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceRetAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceConsultaProtocolo(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceStatusServico(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceRecepcaoEvento(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceInutilizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getRecepcaoEventoAN(final DFAmbiente ambiente) {
            return AN.getRecepcaoEventoAN(ambiente);
        }

        @Override
        public String getNFeDistribuicaoDFe(final DFAmbiente ambiente) {
            throw new UnsupportedOperationException("Nao suportado ainda");
        }

        @Override
        public String getNfeDownloadNF(final DFAmbiente ambiente) {
            return AN.getNfeDownloadNF(ambiente);
        }

        @Override
        public DFUnidadeFederativa[] getUFs() {
            return new DFUnidadeFederativa[]{DFUnidadeFederativa.PR};
        }
    },
    RS {
        @Override
        public String getNfeAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://nfe-homologacao.sefazrs.rs.gov.br/ws/NfeAutorizacao/NFeAutorizacao4.asmx" : "";
        }

        @Override
        public String getNfeRetAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://nfe-homologacao.sefazrs.rs.gov.br/ws/NfeRetAutorizacao/NFeRetAutorizacao4.asmx" : "";
        }

        @Override
        public String getNfeConsultaProtocolo(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://nfe-homologacao.sefazrs.rs.gov.br/ws/NfeConsulta/NfeConsulta4.asmx" : "";
        }

        @Override
        public String getNfeStatusServico(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://nfe-homologacao.sefazrs.rs.gov.br/ws/NfeStatusServico/NfeStatusServico4.asmx" : "";
        }

        @Override
        public String getRecepcaoEvento(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://nfe-homologacao.sefazrs.rs.gov.br/ws/recepcaoevento/recepcaoevento4.asmx" : "";
        }

        @Override
        public String getConsultaCadastro(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfeInutilizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://nfe-homologacao.sefazrs.rs.gov.br/ws/nfeinutilizacao/nfeinutilizacao4.asmx" : "";
        }

        @Override
        public String getNfceAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceRetAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceConsultaProtocolo(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceStatusServico(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceRecepcaoEvento(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceInutilizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getRecepcaoEventoAN(final DFAmbiente ambiente) {
            return AN.getRecepcaoEventoAN(ambiente);
        }

        @Override
        public String getNFeDistribuicaoDFe(final DFAmbiente ambiente) {
            throw new UnsupportedOperationException("Nao suportado ainda");
        }

        @Override
        public String getNfeDownloadNF(final DFAmbiente ambiente) {
            return AN.getNfeDownloadNF(ambiente);
        }

        @Override
        public DFUnidadeFederativa[] getUFs() {
            return new DFUnidadeFederativa[]{DFUnidadeFederativa.RS};
        }
    },
    SP {
        @Override
        public String getNfeAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfe.fazenda.sp.gov.br/ws/nfeautorizacao4.asmx" : "";
        }

        @Override
        public String getNfeRetAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfe.fazenda.sp.gov.br/ws/nferetautorizacao4.asmx" : "";
        }

        @Override
        public String getNfeConsultaProtocolo(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfe.fazenda.sp.gov.br/ws/nfeconsultaprotocolo4.asmx" : "";
        }

        @Override
        public String getNfeStatusServico(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfe.fazenda.sp.gov.br/ws/nfestatusservico4.asmx" : "";
        }

        @Override
        public String getRecepcaoEvento(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfe.fazenda.sp.gov.br/ws/nferecepcaoevento4.asmx" : "";
        }

        @Override
        public String getConsultaCadastro(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfe.fazenda.sp.gov.br/ws/cadconsultacadastro4.asmx" : "";
        }

        @Override
        public String getNfeInutilizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfe.fazenda.sp.gov.br/ws/nfeinutilizacao4.asmx" : "";
        }

        @Override
        public String getNfceAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfce.fazenda.sp.gov.br/ws/NFeAutorizacao4.asmx" : "";
        }

        @Override
        public String getNfceRetAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfce.fazenda.sp.gov.br/ws/NFeRetAutorizacao4.asmx" : "";
        }

        @Override
        public String getNfceConsultaProtocolo(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfce.fazenda.sp.gov.br/ws/NFeConsultaProtocolo4.asmx" : "";
        }

        @Override
        public String getNfceStatusServico(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfce.fazenda.sp.gov.br/ws/NFeStatusServico4.asmx" : "";
        }

        @Override
        public String getNfceRecepcaoEvento(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfce.fazenda.sp.gov.br/ws/NFeRecepcaoEvento4.asmx" : "";
        }

        @Override
        public String getNfceInutilizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfce.fazenda.sp.gov.br/ws/NFeInutilizacao4.asmx" : "";
        }

        @Override
        public String getRecepcaoEventoAN(final DFAmbiente ambiente) {
            return AN.getRecepcaoEventoAN(ambiente);
        }

        @Override
        public String getNFeDistribuicaoDFe(final DFAmbiente ambiente) {
            throw new UnsupportedOperationException("Nao suportado ainda");
        }

        @Override
        public String getNfeDownloadNF(final DFAmbiente ambiente) {
            return AN.getNfeDownloadNF(ambiente);
        }

        @Override
        public DFUnidadeFederativa[] getUFs() {
            return new DFUnidadeFederativa[]{DFUnidadeFederativa.SP};
        }
    },
    SVRS {
        @Override
        public String getNfeAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://nfe-homologacao.svrs.rs.gov.br/ws/NfeAutorizacao/NFeAutorizacao4.asmx" : "";
        }

        @Override
        public String getNfeRetAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://nfe-homologacao.svrs.rs.gov.br/ws/NfeRetAutorizacao/NFeRetAutorizacao4.asmx" : "";
        }

        @Override
        public String getNfeConsultaProtocolo(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://nfe-homologacao.svrs.rs.gov.br/ws/NfeConsulta/NfeConsulta4.asmx" : "";
        }

        @Override
        public String getNfeStatusServico(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://nfe-homologacao.svrs.rs.gov.br/ws/NfeStatusServico/NfeStatusServico4.asmx" : "";
        }

        @Override
        public String getRecepcaoEvento(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://nfe-homologacao.svrs.rs.gov.br/ws/recepcaoevento/recepcaoevento4.asmx" : "";
        }

        @Override
        public String getConsultaCadastro(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfeInutilizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://nfe-homologacao.svrs.rs.gov.br/ws/nfeinutilizacao/nfeinutilizacao4.asmx" : "";
        }

        @Override
        public String getNfceAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceRetAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceConsultaProtocolo(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceStatusServico(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceRecepcaoEvento(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getNfceInutilizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "" : "";
        }

        @Override
        public String getRecepcaoEventoAN(final DFAmbiente ambiente) {
            return AN.getRecepcaoEventoAN(ambiente);
        }

        @Override
        public String getNFeDistribuicaoDFe(final DFAmbiente ambiente) {
            throw new UnsupportedOperationException("Nao suportado ainda");
        }

        @Override
        public String getNfeDownloadNF(final DFAmbiente ambiente) {
            return AN.getNfeDownloadNF(ambiente);
        }

        @Override
        public DFUnidadeFederativa[] getUFs() {
            return new DFUnidadeFederativa[]{DFUnidadeFederativa.AC, DFUnidadeFederativa.AL, DFUnidadeFederativa.AP, DFUnidadeFederativa.DF, DFUnidadeFederativa.ES, DFUnidadeFederativa.PA, DFUnidadeFederativa.PB, DFUnidadeFederativa.RJ, DFUnidadeFederativa.RN, DFUnidadeFederativa.RO, DFUnidadeFederativa.RR, DFUnidadeFederativa.SC, DFUnidadeFederativa.SE, DFUnidadeFederativa.TO};
        }
    },
    SCAN {
        @Override
        public String getNfeAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://hom.svc.fazenda.gov.br/NFeAutorizacao4/NFeAutorizacao4.asmx" : "";
        }

        @Override
        public String getNfeRetAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://hom.svc.fazenda.gov.br/NFeRetAutorizacao4/NFeRetAutorizacao4.asmx" : "";
        }

        @Override
        public String getNfeConsultaProtocolo(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://hom.svc.fazenda.gov.br/NFeConsultaProtocolo4/NFeConsultaProtocolo4.asmx" : "";
        }

        @Override
        public String getNfeStatusServico(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://hom.svc.fazenda.gov.br/NFeStatusServico4/NFeStatusServico4.asmx" : "";
        }

        @Override
        public String getRecepcaoEvento(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://hom.svc.fazenda.gov.br/NFeRecepcaoEvento4/NFeRecepcaoEvento4.asmx" : "";
        }

        @Override
        public String getConsultaCadastro(final DFAmbiente ambiente) {
            throw new UnsupportedOperationException("SCAN nao possui consulta cadastro");
        }

        @Override
        public String getNfeInutilizacao(final DFAmbiente ambiente) {
            throw new UnsupportedOperationException("SCAN nao possui NFe inutilizacao");
        }

        @Override
        public String getNfceAutorizacao(final DFAmbiente ambiente) {
            return null;
        }

        @Override
        public String getNfceRetAutorizacao(final DFAmbiente ambiente) {
            return null;
        }

        @Override
        public String getNfceConsultaProtocolo(final DFAmbiente ambiente) {
            return null;
        }

        @Override
        public String getNfceStatusServico(final DFAmbiente ambiente) {
            return null;
        }

        @Override
        public String getNfceRecepcaoEvento(final DFAmbiente ambiente) {
            return null;
        }

        @Override
        public String getNfceInutilizacao(final DFAmbiente ambiente) {
            return null;
        }

        @Override
        public String getRecepcaoEventoAN(final DFAmbiente ambiente) {
            return AN.getRecepcaoEventoAN(ambiente);
        }

        @Override
        public String getNFeDistribuicaoDFe(final DFAmbiente ambiente) {
            throw new UnsupportedOperationException("Nao suportado ainda");
        }

        @Override
        public String getNfeDownloadNF(final DFAmbiente ambiente) {
            return AN.getNfeDownloadNF(ambiente);
        }

        @Override
        public DFUnidadeFederativa[] getUFs() {
            return new DFUnidadeFederativa[]{};
        }
    },
    SVAN {
        @Override
        public String getNfeAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://hom.sefazvirtual.fazenda.gov.br/NFeAutorizacao4/NFeAutorizacao4.asmx" : "";
        }

        @Override
        public String getNfeRetAutorizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://hom.sefazvirtual.fazenda.gov.br/NFeRetAutorizacao4/NFeRetAutorizacao4.asmx" : "";
        }

        @Override
        public String getNfeConsultaProtocolo(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://hom.sefazvirtual.fazenda.gov.br/NFeConsultaProtocolo4/NFeConsultaProtocolo4.asmx" : "";
        }

        @Override
        public String getNfeStatusServico(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://hom.sefazvirtual.fazenda.gov.br/NFeStatusServico4/NFeStatusServico4.asmx" : "";
        }

        @Override
        public String getRecepcaoEvento(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://hom.sefazvirtual.fazenda.gov.br/NFeRecepcaoEvento4/NFeRecepcaoEvento4.asmx" : "";
        }

        @Override
        public String getConsultaCadastro(final DFAmbiente ambiente) {
            throw new UnsupportedOperationException("SVAN nao possui consulta cadastro");
        }

        @Override
        public String getNfeInutilizacao(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://hom.sefazvirtual.fazenda.gov.br/NFeInutilizacao4/NFeInutilizacao4.asmx" : "";
        }

        @Override
        public String getNfceAutorizacao(final DFAmbiente ambiente) {
            return null;
        }

        @Override
        public String getNfceRetAutorizacao(final DFAmbiente ambiente) {
            return null;
        }

        @Override
        public String getNfceConsultaProtocolo(final DFAmbiente ambiente) {
            return null;
        }

        @Override
        public String getNfceStatusServico(final DFAmbiente ambiente) {
            return null;
        }

        @Override
        public String getNfceRecepcaoEvento(final DFAmbiente ambiente) {
            return null;
        }

        @Override
        public String getNfceInutilizacao(final DFAmbiente ambiente) {
            return null;
        }

        @Override
        public String getRecepcaoEventoAN(final DFAmbiente ambiente) {
            return AN.getRecepcaoEventoAN(ambiente);
        }

        @Override
        public String getNFeDistribuicaoDFe(final DFAmbiente ambiente) {
            throw new UnsupportedOperationException("Nao suportado ainda");
        }

        @Override
        public String getNfeDownloadNF(final DFAmbiente ambiente) {
            return AN.getNfeDownloadNF(ambiente);
        }

        @Override
        public DFUnidadeFederativa[] getUFs() {
            return new DFUnidadeFederativa[]{};
        }
    };

    public abstract String getNfeAutorizacao(final DFAmbiente ambiente);

    public abstract String getNfeRetAutorizacao(final DFAmbiente ambiente);

    public abstract String getNfeConsultaProtocolo(final DFAmbiente ambiente);

    public abstract String getNfeStatusServico(final DFAmbiente ambiente);

    public abstract String getRecepcaoEvento(final DFAmbiente ambiente);

    public abstract String getConsultaCadastro(final DFAmbiente ambiente);

    public abstract String getNfeInutilizacao(final DFAmbiente ambiente);

    public abstract String getNfceAutorizacao(final DFAmbiente ambiente);

    public abstract String getNfceRetAutorizacao(final DFAmbiente ambiente);

    public abstract String getNfceConsultaProtocolo(final DFAmbiente ambiente);

    public abstract String getNfceStatusServico(final DFAmbiente ambiente);

    public abstract String getNfceRecepcaoEvento(final DFAmbiente ambiente);

    public abstract String getNfceInutilizacao(final DFAmbiente ambiente);

    public abstract String getRecepcaoEventoAN(final DFAmbiente ambiente);

    public abstract String getNFeDistribuicaoDFe(final DFAmbiente ambiente);

    public abstract String getNfeDownloadNF(final DFAmbiente ambiente);

    public abstract DFUnidadeFederativa[] getUFs();

    public static NFAutorizador4 valueOfCodigoUF(final DFUnidadeFederativa uf) {
        for (final NFAutorizador4 autorizador : NFAutorizador4.values()) {
            if (Arrays.asList(autorizador.getUFs()).contains(uf)) {
                return autorizador;
            }
        }
        throw new IllegalStateException(String.format("N\u00e3o existe autorizador para a UF %s", uf.getCodigo()));
    }

    public static NFAutorizador4 valueOfChaveAcesso(final String chaveAcesso) {
        final NotaFiscalChaveParser chaveParser = new NotaFiscalChaveParser(chaveAcesso);
        if (chaveParser.isEmitidaContingenciaSCVRS()) {
            return NFAutorizador4.SVRS;
        } else if (chaveParser.isEmitidaContingenciaSCVAN()) {
            return NFAutorizador4.SCAN;
        } else {
            return NFAutorizador4.valueOfCodigoUF(chaveParser.getNFUnidadeFederativa());
        }
    }

    public static NFAutorizador4 valueOfTipoEmissao(final NFTipoEmissao tpEmissao, final DFUnidadeFederativa uf) {
        switch (tpEmissao) {
            case CONTIGENCIA_OFFLINE:
            case CONTINGENCIA_FSDA:
            case EMISSAO_NORMAL:
                return NFAutorizador4.valueOfCodigoUF(uf);
            case CONTINGENCIA_SVCRS:
                return NFAutorizador4.SVRS;
            case CONTINGENCIA_SVCAN:
                return NFAutorizador4.SCAN;
            default:
                throw new IllegalArgumentException("N\u00e3o ha implementac\u00e3o para o tipo de emiss\u00e3o: " + tpEmissao.getDescricao());
        }
    }
}