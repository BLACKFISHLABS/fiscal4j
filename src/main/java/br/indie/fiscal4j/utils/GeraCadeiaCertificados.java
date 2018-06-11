package br.indie.fiscal4j.utils;

import br.indie.fiscal4j.DFAmbiente;
import br.indie.fiscal4j.cte300.classes.CTAutorizador31;
import br.indie.fiscal4j.mdfe3.classes.MDFAutorizador3;
import br.indie.fiscal4j.nfe400.classes.NFAutorizador400;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.*;
import java.io.ByteArrayOutputStream;
import java.net.URI;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public abstract class GeraCadeiaCertificados {

    private static final int PORT = 443;
    private static final String PROTOCOL = "TLS";
    private static final Logger LOGGER = LoggerFactory.getLogger(GeraCadeiaCertificados.class);

    public static byte[] geraCadeiaCertificados(final String senha) throws Exception {
        final KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null, senha.toCharArray());
        try (ByteArrayOutputStream out = new ByteArrayOutputStream()) {

            for (final NFAutorizador400 aut : NFAutorizador400.values()) {
                // Para NFe...
                final String urlNFH = aut.getNfeStatusServico(DFAmbiente.HOMOLOGACAO);
                if (StringUtils.isNotBlank(urlNFH)) {
                    final String host = new URI(urlNFH).getHost();
                    GeraCadeiaCertificados.get(keyStore, host, GeraCadeiaCertificados.PORT);
                }

                final String urlNFP = aut.getNfeStatusServico(DFAmbiente.PRODUCAO);
                if (StringUtils.isNotBlank(urlNFP)) {
                    final String host = new URI(urlNFP).getHost();
                    GeraCadeiaCertificados.get(keyStore, host, GeraCadeiaCertificados.PORT);
                }

                // Para NFCe...
                final String urlNFCH = aut.getNfceStatusServico(DFAmbiente.HOMOLOGACAO);
                if (StringUtils.isNotBlank(urlNFCH)) {
                    final String host = new URI(urlNFCH).getHost();
                    GeraCadeiaCertificados.get(keyStore, host, GeraCadeiaCertificados.PORT);
                }

                final String urlNFCP = aut.getNfceStatusServico(DFAmbiente.PRODUCAO);
                if (StringUtils.isNotBlank(urlNFCP)) {
                    final String host = new URI(urlNFCP).getHost();
                    GeraCadeiaCertificados.get(keyStore, host, GeraCadeiaCertificados.PORT);
                }
            }

            // MDFE
            for (final MDFAutorizador3 aut : MDFAutorizador3.values()) {
                final String urlMDFeH = aut.getMDFeStatusServico(DFAmbiente.HOMOLOGACAO);
                if (StringUtils.isNotBlank(urlMDFeH)) {
                    final String host = new URI(urlMDFeH).getHost();
                    GeraCadeiaCertificados.get(keyStore, host, GeraCadeiaCertificados.PORT);
                }
            }

            for (final MDFAutorizador3 aut : MDFAutorizador3.values()) {
                final String urlMDFeP = aut.getMDFeStatusServico(DFAmbiente.PRODUCAO);
                if (StringUtils.isNotBlank(urlMDFeP)) {
                    final String host = new URI(urlMDFeP).getHost();
                    GeraCadeiaCertificados.get(keyStore, host, GeraCadeiaCertificados.PORT);
                }
            }

            // CTe
            for (final CTAutorizador31 aut : CTAutorizador31.values()) {
                final String urlCTeH = aut.getCteStatusServico(DFAmbiente.HOMOLOGACAO);
                if (StringUtils.isNotBlank(urlCTeH)) {
                    final String host = new URI(urlCTeH).getHost();
                    GeraCadeiaCertificados.get(keyStore, host, GeraCadeiaCertificados.PORT);
                }
            }

            for (final CTAutorizador31 aut : CTAutorizador31.values()) {
                final String urlCTeP = aut.getCteStatusServico(DFAmbiente.PRODUCAO);
                if (StringUtils.isNotBlank(urlCTeP)) {
                    final String host = new URI(urlCTeP).getHost();
                    GeraCadeiaCertificados.get(keyStore, host, GeraCadeiaCertificados.PORT);
                }
            }

            keyStore.store(out, senha.toCharArray());
            return out.toByteArray();
        }
    }

    private static void get(final KeyStore keyStore, final String host, final int port) throws Exception {
        final TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);

        final X509TrustManager defaultTrustManager = (X509TrustManager) trustManagerFactory.getTrustManagers()[0];
        final SavingTrustManager savingTrustManager = new SavingTrustManager(defaultTrustManager);

        final SSLContext sslContext = SSLContext.getInstance(GeraCadeiaCertificados.PROTOCOL);
        sslContext.init(null, new TrustManager[]{savingTrustManager}, null);

        GeraCadeiaCertificados.LOGGER.info(String.format("Abrindo conexao para o servidor: %s:%s", host, port));
        try (SSLSocket sslSocket = (SSLSocket) sslContext.getSocketFactory().createSocket(host, port)) {
            sslSocket.setSoTimeout(10000);
            sslSocket.startHandshake();
        } catch (final Exception e) {
            GeraCadeiaCertificados.LOGGER.error(String.format("[%s] %s", host, e.toString()));
        }

        // se conseguir obter a cadeia de certificados, adiciona no keystore
        if (savingTrustManager.chain != null) {
            GeraCadeiaCertificados.LOGGER.info(String.format("Certificados enviados pelo servidor: %s", savingTrustManager.chain.length));
            final MessageDigest sha1 = MessageDigest.getInstance("SHA1");
            final MessageDigest md5 = MessageDigest.getInstance("MD5");
            for (int i = 0; i < savingTrustManager.chain.length; i++) {
                final X509Certificate certificate = savingTrustManager.chain[i];
                sha1.update(certificate.getEncoded());
                md5.update(certificate.getEncoded());

                final String alias = String.format("%s.%s", host, i + 1);
                keyStore.setCertificateEntry(alias, certificate);
                GeraCadeiaCertificados.LOGGER.info(String.format("Adicionado certificado no keystore com o alias: %s", alias));
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