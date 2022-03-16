package br.indie.fiscal4j.nfe400.utils;

import br.indie.fiscal4j.DFAmbiente;
import br.indie.fiscal4j.DFUnidadeFederativa;
import br.indie.fiscal4j.nfe.NFeConfig;
import br.indie.fiscal4j.nfe400.classes.nota.NFNota;
import org.apache.commons.lang3.StringUtils;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class NFGeraQRCode {

    private final NFNota nota;
    private final NFeConfig config;

    public NFGeraQRCode(final NFNota nota, final NFeConfig config) {
        this.nota = nota;
        this.config = config;
    }

    public String getQRCodev2() throws NoSuchAlgorithmException {
        String url = this.config.getAmbiente().equals(DFAmbiente.PRODUCAO) ? this.nota.getInfo().getIdentificacao().getUf().getQrCodeProducao() : this.nota.getInfo().getIdentificacao().getUf().getQrCodeHomologacao();

        if (StringUtils.isBlank(url)) {
            throw new IllegalArgumentException("URL para consulta do QRCode nao informada para uf " + this.nota.getInfo().getIdentificacao().getUf() + "!");
        }
        if (StringUtils.isBlank(this.config.getCodigoSegurancaContribuinte())) {
            throw new IllegalArgumentException("CSC nao informado nas configuracoes!");
        }
        if ((this.config.getCodigoSegurancaContribuinteID() == null) || (this.config.getCodigoSegurancaContribuinteID() == 0)) {
            throw new IllegalArgumentException("IdCSC nao informado nas configuracoes!");
        }

        final StringBuilder parametros = new StringBuilder();
        parametros.append(this.nota.getInfo().getChaveAcesso()).append("|"); // Chave de Acesso da NFC-e
        parametros.append("2").append("|"); // Versao do QRCode
        parametros.append(this.config.getAmbiente().getCodigo()).append("|");
        parametros.append(this.config.getCodigoSegurancaContribuinteID());

        return url.concat("?p=").concat(parametros.toString().concat("|").concat(StringUtils.upperCase(NFGeraQRCode.createHash(parametros.toString(), this.config.getCodigoSegurancaContribuinte()))));
    }

    public String getQRCode() throws NoSuchAlgorithmException {
        String url = this.config.getAmbiente().equals(DFAmbiente.PRODUCAO) ? this.nota.getInfo().getIdentificacao().getUf().getQrCodeProducao() : this.nota.getInfo().getIdentificacao().getUf().getQrCodeHomologacao();

        /* FIXME TODO Workaround para corrigir erro :
         *<cStat>395</cStat><xMotivo>Endereco do site da UF da Consulta via QR-Code diverge do previsto. Novo endereco:http://www.fazenda.pr.gov.br/nfce/qrcode</xMotivo>
         * corrigir em DFUnidadeFederativa quando a URL da versao 3.10 do PR for desabilitada.
         */
        if (this.nota.getInfo().getIdentificacao().getUf().equals(DFUnidadeFederativa.PR) && this.nota.getInfo().getVersao().equals("4.00")) {
            url = "http://www.fazenda.pr.gov.br/nfce/qrcode";
        }

        if (StringUtils.isBlank(url)) {
            throw new IllegalArgumentException("URL para consulta do QRCode nao informada para uf " + this.nota.getInfo().getIdentificacao().getUf() + "!");
        }
        if (StringUtils.isBlank(this.config.getCodigoSegurancaContribuinte())) {
            throw new IllegalArgumentException("CSC nao informado nas configuracoes!");
        }
        if ((this.config.getCodigoSegurancaContribuinteID() == null) || (this.config.getCodigoSegurancaContribuinteID() == 0)) {
            throw new IllegalArgumentException("IdCSC nao informado nas configuracoes!");
        }

        final ZonedDateTime dt = this.nota.getInfo().getIdentificacao().getDataHoraEmissao();
        final String dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX").format(dt);

        final String cpfj = this.nota.getInfo().getDestinatario() == null ? null : this.nota.getInfo().getDestinatario().getCpfj();

        // Monta os parametros do qrcode: https://www.sefaz.rs.gov.br/NFCE/NFCE-COM.aspx?chNFe=43160493062776000117650010000012891000012891&nVersao=100&tpAmb=1&cDest=00400437031&dhEmi=323031362d30342d31355431363a32313a35312d30333a3030&vNF=88.00&vICMS=0.00&digVal=787971704e2f7771446134687070486e6b6b6c34705a39536a36633d&cIdToken=000001&cHashQRCode=852E4B5BC4EB9BF65484AEEBB06BE4A65F0E8E13
        final StringBuilder parametros = new StringBuilder();
        parametros.append("chNFe=").append(this.nota.getInfo().getChaveAcesso()).append("&"); // Chave de Acesso da NFC-e
        parametros.append("nVersao=100").append("&"); // Versao do QRCode
        parametros.append("tpAmb=").append(this.config.getAmbiente().getCodigo()).append("&");

        if (StringUtils.isNotBlank(cpfj)) {
            parametros.append("cDest=").append(cpfj).append("&");// Documento de Identificacao do Consumidor (CNPJ/CPF/ID Estrangeiro)
        }

        parametros.append("dhEmi=").append(NFGeraQRCode.toHex(dtf)).append("&");// Data e Hora de Emissão da NFC-e
        parametros.append("vNF=").append(this.nota.getInfo().getTotal().getIcmsTotal().getValorTotalNFe()).append("&"); // Valor Total da NFC-e
        parametros.append("vICMS=").append(this.nota.getInfo().getTotal().getIcmsTotal().getValorTotalICMS()).append("&");// NFC-e Valor Total ICMS na NFC-e
        parametros.append("digVal=").append(NFGeraQRCode.toHex(this.nota.getAssinatura().getSignedInfo().getReference().getDigestValue())).append("&");// Digest Value da NFC-e
        parametros.append("cIdToken=").append(String.format("%06d", this.config.getCodigoSegurancaContribuinteID()));// Identificador do CSC – Codigo de Seguranca do Contribuinte no Banco de Dados da SEFAZ

        // retorna a url do qrcode
        return url + "?" + parametros + "&cHashQRCode=" + NFGeraQRCode.createHash(parametros.toString(), this.config.getCodigoSegurancaContribuinte());
    }

    public static String createHash(final String campos, final String csc) throws NoSuchAlgorithmException {
        return NFGeraQRCode.sha1(campos + csc);
    }

    public static String toHex(final String arg) {
        return String.format("%040x", new BigInteger(1, arg.getBytes(StandardCharsets.UTF_8)));
    }

    public static String sha1(final String input) throws NoSuchAlgorithmException {
        final StringBuilder sb = new StringBuilder();
        for (final byte element : MessageDigest.getInstance("SHA1").digest(input.getBytes(StandardCharsets.UTF_8))) {
            sb.append(Integer.toString((element & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }

    public String urlConsultaChaveAcesso() {
        return this.config.getAmbiente().equals(DFAmbiente.PRODUCAO) ? this.nota.getInfo().getIdentificacao().getUf().getConsultaChaveAcessoProducao() : this.nota.getInfo().getIdentificacao().getUf().getConsultaChaveAcessoHomologacao();
    }
}
