package br.indie.fiscal4j.utils;

import br.indie.fiscal4j.DFAmbiente;
import br.indie.fiscal4j.DFLog;
import br.indie.fiscal4j.cte300.classes.CTAutorizador31;
import br.indie.fiscal4j.mdfe3.classes.MDFAutorizador3;
import br.indie.fiscal4j.nfe310.classes.NFAutorizador31;
import br.indie.fiscal4j.nfe400.classes.NFAutorizador400;
import org.apache.commons.lang3.StringUtils;

import javax.net.ssl.*;
import java.io.ByteArrayOutputStream;
import java.net.URI;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public abstract class DFCadeiaCertificados implements DFLog {

    private static final int PORT = 443;
    private static final String PROTOCOL = "TLS";
    private static final int TIMEOUT_WS = 30;

    public static byte[] geraCadeiaCertificados(final String senha) throws Exception {
        final KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null, senha.toCharArray());
        try (ByteArrayOutputStream out = new ByteArrayOutputStream()) {

            for (final NFAutorizador31 aut : NFAutorizador31.values()) {
                // Para NFe...
                final String urlNF = aut.getNfeStatusServico(DFAmbiente.HOMOLOGACAO);
                if (StringUtils.isNotBlank(urlNF)) {
                    final String host = new URI(urlNF).getHost();
                    DFCadeiaCertificados.get(keyStore, host);
                }

                final String urlNFProd = aut.getNfeStatusServico(DFAmbiente.PRODUCAO);
                if (StringUtils.isNotBlank(urlNFProd)) {
                    final String host = new URI(urlNFProd).getHost();
                    DFCadeiaCertificados.get(keyStore, host);
                }

                // Para NFCe...
                final String urlNFC = aut.getNfceStatusServico(DFAmbiente.HOMOLOGACAO);
                if (StringUtils.isNotBlank(urlNFC)) {
                    final String host = new URI(urlNFC).getHost();
                    DFCadeiaCertificados.get(keyStore, host);
                }

                final String urlNFCProd = aut.getNfceStatusServico(DFAmbiente.PRODUCAO);
                if (StringUtils.isNotBlank(urlNFCProd)) {
                    final String host = new URI(urlNFCProd).getHost();
                    DFCadeiaCertificados.get(keyStore, host);
                }
            }

            for (final NFAutorizador400 aut : NFAutorizador400.values()) {
                // Para NFe...
                final String urlNF = aut.getNfeStatusServico(DFAmbiente.HOMOLOGACAO);
                if (StringUtils.isNotBlank(urlNF)) {
                    final String host = new URI(urlNF).getHost();
                    DFCadeiaCertificados.get(keyStore, host);
                }

                final String urlNFProd = aut.getNfeStatusServico(DFAmbiente.PRODUCAO);
                if (StringUtils.isNotBlank(urlNFProd)) {
                    final String host = new URI(urlNFProd).getHost();
                    DFCadeiaCertificados.get(keyStore, host);
                }

                // Para NFCe...
                final String urlNFC = aut.getNfceStatusServico(DFAmbiente.HOMOLOGACAO);
                if (StringUtils.isNotBlank(urlNFC)) {
                    final String host = new URI(urlNFC).getHost();
                    DFCadeiaCertificados.get(keyStore, host);
                }

                final String urlNFCProd = aut.getNfceStatusServico(DFAmbiente.PRODUCAO);
                if (StringUtils.isNotBlank(urlNFCProd)) {
                    final String host = new URI(urlNFCProd).getHost();
                    DFCadeiaCertificados.get(keyStore, host);
                }
            }

            // MDFE
            for (final MDFAutorizador3 aut : MDFAutorizador3.values()) {
                final String urlMDFe = aut.getMDFeStatusServico(DFAmbiente.HOMOLOGACAO);
                if (StringUtils.isNotBlank(urlMDFe)) {
                    final String host = new URI(urlMDFe).getHost();
                    DFCadeiaCertificados.get(keyStore, host);
                }
            }

            for (final MDFAutorizador3 aut : MDFAutorizador3.values()) {
                final String urlMDFe = aut.getMDFeStatusServico(DFAmbiente.PRODUCAO);
                if (StringUtils.isNotBlank(urlMDFe)) {
                    final String host = new URI(urlMDFe).getHost();
                    DFCadeiaCertificados.get(keyStore, host);
                }
            }

            // CTe
            for (final CTAutorizador31 aut : CTAutorizador31.values()) {
                final String urlCTe = aut.getCteStatusServico(DFAmbiente.HOMOLOGACAO);
                if (StringUtils.isNotBlank(urlCTe)) {
                    final String host = new URI(urlCTe).getHost();
                    DFCadeiaCertificados.get(keyStore, host);
                }
            }

            for (final CTAutorizador31 aut : CTAutorizador31.values()) {
                final String urlCTe = aut.getCteStatusServico(DFAmbiente.PRODUCAO);
                if (StringUtils.isNotBlank(urlCTe)) {
                    final String host = new URI(urlCTe).getHost();
                    DFCadeiaCertificados.get(keyStore, host);
                }
            }

            keyStore.store(out, senha.toCharArray());
            return out.toByteArray();
        }
    }

    private static void get(final KeyStore keyStore, final String host) throws Exception {
        final TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);

        final X509TrustManager defaultTrustManager = (X509TrustManager) trustManagerFactory.getTrustManagers()[0];
        final SavingTrustManager savingTrustManager = new SavingTrustManager(defaultTrustManager);

        final SSLContext sslContext = SSLContext.getInstance(DFCadeiaCertificados.PROTOCOL);
        sslContext.init(null, new TrustManager[]{savingTrustManager}, null);

        DFLog.getLogger(DFCadeiaCertificados.class).debug("Abrindo conexao para o servidor: {}:{}", host, DFCadeiaCertificados.PORT);
        try (SSLSocket sslSocket = (SSLSocket) sslContext.getSocketFactory().createSocket(host, DFCadeiaCertificados.PORT)) {
            sslSocket.setSoTimeout(TIMEOUT_WS * 1000);
            sslSocket.startHandshake();
        } catch (final Exception e) {
            DFLog.getLogger(DFCadeiaCertificados.class).error(String.format("[%s] %s", host, e.toString()));
        }

        // se conseguir obter a cadeia de certificados, adiciona no keystore
        if (savingTrustManager.chain != null) {
            DFLog.getLogger(DFCadeiaCertificados.class).debug("Certificados enviados pelo servidor: {}", savingTrustManager.chain.length);
            final MessageDigest sha1 = MessageDigest.getInstance("SHA1");
            final MessageDigest md5 = MessageDigest.getInstance("MD5");
            for (int i = 0; i < savingTrustManager.chain.length; i++) {
                final X509Certificate certificate = savingTrustManager.chain[i];
                sha1.update(certificate.getEncoded());
                md5.update(certificate.getEncoded());

                final String alias = String.format("%s.%s", host, i + 1);
                keyStore.setCertificateEntry(alias, certificate);
                DFLog.getLogger(DFCadeiaCertificados.class).debug("Adicionado certificado no keystore com o alias: {}", alias);
            }
        }
    }

    private static class SavingTrustManager implements X509TrustManager {
        private final X509TrustManager trustManager;
        private X509Certificate[] chain;

        SavingTrustManager(final X509TrustManager trustManager) {
            this.trustManager = trustManager;
        }

        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return this.trustManager.getAcceptedIssuers();
        }

        @Override
        public void checkClientTrusted(final X509Certificate[] chain, final String authType) throws CertificateException {
            this.trustManager.checkClientTrusted(chain, authType);
        }

        @Override
        public void checkServerTrusted(final X509Certificate[] chain, final String authType) throws CertificateException {
            this.chain = chain;
            this.trustManager.checkServerTrusted(chain, authType);
        }
    }
}
