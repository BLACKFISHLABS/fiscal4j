package br.indie.fiscal4j.nfe310.webservices;

import br.indie.fiscal4j.nfe310.NFeConfig;
import org.apache.commons.httpclient.params.HttpConnectionParams;
import org.apache.commons.httpclient.protocol.ProtocolSocketFactory;

import javax.net.ssl.*;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.*;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public class NFSocketFactory implements ProtocolSocketFactory {

    private final NFeConfig config;
    private final SSLContext context;

    public NFSocketFactory(final NFeConfig config) throws CertificateException, UnrecoverableKeyException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException, IOException {
        this.config = config;
        this.context = NFSocketFactory.createSSLContext(config);
    }

    private static SSLContext createSSLContext(final NFeConfig config) throws UnrecoverableKeyException, CertificateException, NoSuchAlgorithmException, KeyStoreException, IOException, KeyManagementException {
        final KeyManager[] keyManagers = NFSocketFactory.createKeyManagers(config);
        final TrustManager[] trustManagers = NFSocketFactory.createTrustManagers(config);
        final SSLContext sslContext = SSLContext.getInstance(config.getSSLProtocolo());
        sslContext.init(keyManagers, trustManagers, null);
        return sslContext;
    }

    private static KeyManager[] createKeyManagers(final NFeConfig config) throws UnrecoverableKeyException, KeyStoreException, NoSuchAlgorithmException, CertificateException, IOException {
        final String alias = config.getCertificadoAlias() != null ? config.getCertificadoAlias() : config.getCertificadoKeyStore().aliases().nextElement();
        final X509Certificate certificate = (X509Certificate) config.getCertificadoKeyStore().getCertificate(alias);
        final PrivateKey privateKey = (PrivateKey) config.getCertificadoKeyStore().getKey(alias, config.getCertificadoSenha().toCharArray());
        return new KeyManager[]{new NFKeyManager(certificate, privateKey)};
    }

    private static TrustManager[] createTrustManagers(final NFeConfig config) throws KeyStoreException, NoSuchAlgorithmException, CertificateException, IOException {
        final TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(config.getCadeiaCertificadosKeyStore());
        return trustManagerFactory.getTrustManagers();
    }

    @Override
    public Socket createSocket(final String host, final int port, final InetAddress localAddress, final int localPort, final HttpConnectionParams params) throws IOException {
        final Socket socket = this.context.getSocketFactory().createSocket();
        ((SSLSocket) socket).setEnabledProtocols(new String[]{this.config.getSSLProtocolo()});
        socket.bind(new InetSocketAddress(localAddress, localPort));
        socket.connect(new InetSocketAddress(host, port), 60000);
        return socket;
    }

    @Override
    public Socket createSocket(final String host, final int port, final InetAddress clientHost, final int clientPort) throws IOException {
        return this.context.getSocketFactory().createSocket(host, port, clientHost, clientPort);
    }

    @Override
    public Socket createSocket(final String host, final int port) throws IOException {
        return this.context.getSocketFactory().createSocket(host, port);
    }

    private static class NFKeyManager implements X509KeyManager {
        private final X509Certificate certificate;
        private final PrivateKey privateKey;

        NFKeyManager(final X509Certificate certificate, final PrivateKey privateKey) {
            this.certificate = certificate;
            this.privateKey = privateKey;
        }

        @Override
        public String chooseClientAlias(final String[] arg0, final Principal[] arg1, final Socket arg2) {
            return this.certificate.getIssuerDN().getName();
        }

        @Override
        public String chooseServerAlias(final String arg0, final Principal[] arg1, final Socket arg2) {
            return null;
        }

        @Override
        public X509Certificate[] getCertificateChain(final String arg0) {
            return new X509Certificate[]{this.certificate};
        }

        @Override
        public String[] getClientAliases(final String arg0, final Principal[] arg1) {
            return new String[]{this.certificate.getIssuerDN().getName()};
        }

        @Override
        public PrivateKey getPrivateKey(final String arg0) {
            return this.privateKey;
        }

        @Override
        public String[] getServerAliases(final String arg0, final Principal[] arg1) {
            return null;
        }
    }
}
