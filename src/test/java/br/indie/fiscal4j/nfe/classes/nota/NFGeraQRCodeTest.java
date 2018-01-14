package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import br.indie.fiscal4j.common.DFUnidadeFederativa;
import br.indie.fiscal4j.nfe.NFeConfig;
import br.indie.fiscal4j.nfe.utils.NFGeraQRCode;
import org.junit.Assert;
import org.junit.Test;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

public class NFGeraQRCodeTest {

    //EXEMPLO DO MANUAL DA RECEITA
    private static final String URL_TEST = "?chNFe=28140300156225000131650110000151341562040824&nVersao=100&tpAmb=2&cDest=13017959000181&dhEmi=323031342d30332d31385431303a35353a33332d30333a3030&vNF=60.90&vICMS=12.75&digVal=797a4759685578312f5859597a6b7357422b6650523351633530633d&cIdToken=000001&cHashQRCode=fb49da11e94fccbbccb6862617f7d77163ab6bc2";

    @Test
    public void geraQRCodeConformeEsperado() throws NoSuchAlgorithmException {
        final NFNota nota = FabricaDeObjetosFake.getNotaQRCode();
        nota.setInfoSuplementar(new NFNotaInfoSuplementar());
        nota.getInfoSuplementar().setQrCode(new NFGeraQRCode(nota, this.createConfigTest()).getQRCode());

        final String urlEsperada = nota.getInfo().getIdentificacao().getUf().getQrCodeHomologacao() + NFGeraQRCodeTest.URL_TEST;
        Assert.assertEquals(urlEsperada, nota.getInfoSuplementar().getQrCode());
    }

    @Test
    public void geraSHA1() throws Exception {
        final String entrada = "chNFe=28140300156225000131650110000151341562040824&nVersao=100&tpAmb=1&cDest=13017959000181&dhEmi=323031342d30332d31385431303a35353a33332d30333a3030&vNF=60.90&vICMS=12.75&digVal=797a4759685578312f5859597a6b7357422b6650523351633530633d&cIdToken=000001SEU-CODIGO-CSC-CONTRIBUINTE-36-CARACTERES";
        final String saida = NFGeraQRCode.sha1(entrada);
        Assert.assertEquals(saida, "329f9d7b9fc5650372c1b2699ab88e9e22e0d33a");
    }

    private NFeConfig createConfigTest() {
        return new NFeConfig() {
            @Override
            public Integer getCodigoSegurancaContribuinteID() {
                return 1;
            }

            @Override
            public String getCodigoSegurancaContribuinte() {
                return "SEU-CODIGO-CSC-CONTRIBUINTE-36-CARACTERES";
            }

            @Override
            public DFUnidadeFederativa getCUF() {
                return DFUnidadeFederativa.SE;
            }

            @Override
            public KeyStore getCertificadoKeyStore() throws KeyStoreException {
                return null;
            }

            @Override
            public String getCertificadoSenha() {
                return null;
            }

            @Override
            public KeyStore getCadeiaCertificadosKeyStore() throws KeyStoreException {
                return null;
            }

            @Override
            public String getCadeiaCertificadosSenha() {
                return null;
            }

            @Override
            public String getCertificadoAlias() {
                return null;
            }
        };
    }
}