package br.indie.fiscal4j.utils;

import br.indie.fiscal4j.DFConfig;
import org.apache.commons.httpclient.params.HttpConnectionParams;
import org.apache.commons.httpclient.protocol.ProtocolSocketFactory;

import javax.net.ssl.*;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;

public class DFSocketFactory implements ProtocolSocketFactory {

    private final DFConfig config;
    private final SSLContext sslContext;

    public DFSocketFactory(final DFConfig config) throws UnrecoverableKeyException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        this.config = config;
        this.sslContext = this.createSSLContext(config);
    }

    @Override
    public Socket createSocket(final String host, final int port, final InetAddress localAddress, final int localPort, final HttpConnectionParams params) throws IOException {
        final Socket socket = this.sslContext.getSocketFactory().createSocket();
        ((SSLSocket) socket).setEnabledProtocols(this.config.getSSLProtocolos());
        socket.bind(new InetSocketAddress(localAddress, localPort));
        socket.connect(new InetSocketAddress(host, port), 60000);
        return socket;
    }

    @Override
    public Socket createSocket(final String host, final int port, final InetAddress clientHost, final int clientPort) throws IOException {
        return this.sslContext.getSocketFactory().createSocket(host, port, clientHost, clientPort);
    }

    @Override
    public Socket createSocket(final String host, final int port) throws IOException {
        return this.sslContext.getSocketFactory().createSocket(host, port);
    }

    private SSLContext createSSLContext(final DFConfig config) throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException, UnrecoverableKeyException {
        final KeyManager[] keyManagers = this.createKeyManagers(config);
        final TrustManager[] trustManagers = this.createTrustManagers(config);
        final SSLContext sslContext = SSLContext.getInstance(config.getSSLProtocolos()[0]);
        sslContext.init(keyManagers, trustManagers, null);
        return sslContext;
    }

    private KeyManager[] createKeyManagers(final DFConfig config) throws UnrecoverableKeyException, KeyStoreException, NoSuchAlgorithmException {
        return new KeyManager[]{new br.indie.fiscal4j.utils.DFKeyManager(config)};
    }

    private TrustManager[] createTrustManagers(final DFConfig config) throws KeyStoreException, NoSuchAlgorithmException {
        final TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(config.getCadeiaCertificadosKeyStore());
        return trustManagerFactory.getTrustManagers();
    }

}