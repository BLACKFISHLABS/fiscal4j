package br.indie.fiscal4j.nfe;

import br.indie.fiscal4j.common.DFAmbiente;
import br.indie.fiscal4j.common.DFUnidadeFederativa;
import br.indie.fiscal4j.nfe.classes.NFTipoEmissao;

import java.security.KeyStore;
import java.security.KeyStoreException;

/**
 * Configuração basica do sistema de notas fiscais.
 */
public abstract class NFeConfig {

    public static final String VERSAO_NFE = "4.00";
    public static final String NFE_NAMESPACE = "http://www.portalfiscal.inf.br/nfe";

    /**
     * Indica o ambiente de trabalho, se em produção ou homologação.
     *
     * @return Ambiente de trabalho.
     */
    public DFAmbiente getAmbiente() {
        return DFAmbiente.HOMOLOGACAO;
    }

    /**
     * Unidade da federação do emissor das notas.
     *
     * @return Unidade da federação do emissor.
     */
    public abstract DFUnidadeFederativa getCUF();

    /**
     * KeyStore contendo o certificado pessoal do emissor. <br>
     * Esse certificado é fornecido por uma autoridade certificadora. <br>
     * Em caso de dúvidas, consulte seu contador.
     *
     * @return KeyStore do certificado pessoal.
     * @throws KeyStoreException Caso não consiga carregar o KeyStore.
     */
    public abstract KeyStore getCertificadoKeyStore() throws KeyStoreException;

    /**
     * Retorna o nome do alias do certificado dentro do {@link KeyStore} retornado por {@link #getCertificadoKeyStore()}.
     * Caso seja retornado {@code null}, será utilizado o primeiro alias do {@link KeyStore}.
     *
     * @return o nome do alias do certificado ou {@code null}
     */
    public String getCertificadoAlias() {
        return null;
    }

    /**
     * Senha do certificado pessoal do emissor, contido dentro do KeyStore do certificado.
     *
     * @return Senha do certificado.
     * @see #getCertificadoKeyStore()
     */
    public abstract String getCertificadoSenha();

    /**
     * KeyStore contendo a cadeia de certificados da SEFAZ de destino. <br>
     * Para gerar a cadeia, use o utilitário fornecido com a biblioteca:<br>
     * FileUtils.writeByteArrayToFile(new File("/tmp/producao.cacerts"), NFGeraCadeiaCertificados.geraCadeiaCertificados(DFAmbiente.PRODUCAO, "senha"));
     *
     * @return KeyStore da cadeia de certificados.
     * @throws KeyStoreException Caso nao consiga carregar o KeyStore.
     */
    public abstract KeyStore getCadeiaCertificadosKeyStore() throws KeyStoreException;

    /**
     * Senha da cadeia de certificados, contida dentro do KeyStore da cadeia.
     *
     * @return Senha da cadeia de certificados.
     * @see #getCadeiaCertificadosKeyStore()
     */
    public abstract String getCadeiaCertificadosSenha();

    /**
     * ID de contribuinte, somente para NFCe.
     *
     * @return ID do contribuinte.
     */
    public Integer getCodigoSegurancaContribuinteID() {
        return null;
    }

    /**
     * Codigo de seguranca do contribuinte, com 36 caracteres, somente para NFCe.
     *
     * @return Codigo de segurança do contribuinte.
     */
    public String getCodigoSegurancaContribuinte() {
        return null;
    }

    /**
     * Tipo da emissão das notas (se normal ou em contingência).
     *
     * @return Tipo da emissão das notas.
     */
    public NFTipoEmissao getTipoEmissao() {
        return NFTipoEmissao.EMISSAO_NORMAL;
    }

    /**
     * Protocolo de SSL, usado pela SEFAZ para receber as notas.
     *
     * @return Protocolo SSL da SEFAZ de origem.
     */
    public String getSSLProtocolo() {
        return "TLSv1";
    }
}