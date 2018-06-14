package br.indie.fiscal4j.danfe;

import br.indie.fiscal4j.DFAmbiente;
import br.indie.fiscal4j.DFModelo;
import br.indie.fiscal4j.nfe400.classes.nota.NFNotaProcessada;
import br.indie.fiscal4j.nfe400.parsers.DFParser;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.engine.data.JRXmlDataSource;
import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.List;

public class NFDanfeReport {

    private NFNotaProcessada nota;

    public NFDanfeReport(String xml) {
        this(new DFParser().notaProcessadaParaObjeto(xml));
    }

    public NFDanfeReport(NFNotaProcessada nota) {
        this.nota = nota;
    }

    public byte[] gerarDanfeNFe(byte[] logoEmpresa) throws Exception {
        return toPDF(createJasperPrintNFe(logoEmpresa));
    }

    public byte[] gerarDanfeNFCe(String informacoesComplementares, boolean mostrarMsgFinalizacao, NFCePagamento... pags) throws Exception {
        return toPDF(createJasperPrintNFCe(informacoesComplementares, mostrarMsgFinalizacao, pags));
    }

    private static byte[] toPDF(JasperPrint print) throws JRException {
        return JasperExportManager.exportReportToPdf(print);
    }

    public JasperPrint createJasperPrintNFe(byte[] logoEmpresa) throws IOException, ParserConfigurationException, SAXException, JRException {
        if (!DFModelo.NFE.equals(nota.getNota().getInfo().getIdentificacao().getModelo())) {
            throw new IllegalStateException("Nao e possivel gerar DANFe NFe de uma NFCe");
        }

        try (InputStream in = NFDanfeReport.class.getClassLoader().getResourceAsStream("danfe/nfe/DANFE_NFE_RETRATO.jasper");
             InputStream subDuplicatas = NFDanfeReport.class.getClassLoader().getResourceAsStream("danfe/nfe/DANFE_NFE_DUPLICATAS.jasper")) {
            final JRPropertiesUtil jrPropertiesUtil = JRPropertiesUtil.getInstance(DefaultJasperReportsContext.getInstance());
            jrPropertiesUtil.setProperty("net.sf.jasperreports.xpath.executer.factory", "net.sf.jasperreports.engine.util.xml.JaxenXPathExecuterFactory");

            Map<String, Object> parameters = new HashMap<>();
            parameters.put("SUBREPORT_DUPLICATAS", subDuplicatas);
            parameters.put("LOGO_EMPRESA", (logoEmpresa == null ? null : new ByteArrayInputStream(logoEmpresa)));

            return JasperFillManager.fillReport(in, parameters, new JRXmlDataSource(convertStringXMl2DOM(nota.toString()), "/nfeProc/NFe/infNFe/det"));
        }
    }

    private Document convertStringXMl2DOM(String xml) throws ParserConfigurationException, IOException, SAXException {
        try (StringReader stringReader = new StringReader(xml)) {
            InputSource inputSource = new InputSource();
            inputSource.setCharacterStream(stringReader);
            return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputSource);
        }
    }

    private JasperPrint createJasperPrintNFCe(String informacoesComplementares, boolean mostrarMsgFinalizacao, NFCePagamento... pags)
            throws IOException, WriterException, JRException {
        if (!DFModelo.NFCE.equals(nota.getNota().getInfo().getIdentificacao().getModelo())) {
            throw new IllegalStateException("Nao e possivel gerar DANFe NFCe de uma NFe");
        }

        try (InputStream in = NFDanfeReport.class.getClassLoader().getResourceAsStream("danfe/nfce/DANFE_NFCE.jasper");
             InputStream subItens = NFDanfeReport.class.getClassLoader().getResourceAsStream("danfe/nfce/DANFE_NFCE_ITENS.jasper");
             InputStream subPagamentos = NFDanfeReport.class.getClassLoader().getResourceAsStream("danfe/nfce/DANFE_NFCE_PAGAMENTOS.jasper")) {

            boolean homologacao = nota.getNota().getInfo().getIdentificacao().getAmbiente().equals(DFAmbiente.HOMOLOGACAO);
            List<NFCePagamento> pgtos = Arrays.asList(pags);

            Map<String, Object> parameters = new HashMap<>();
            parameters.put("SUBREL", subItens);
            parameters.put("SUBREL_PAGAMENTOS", subPagamentos);
            parameters.put("PAGAMENTOS", pgtos);
            parameters.put("QR_CODE", gerarQRCode());
            parameters.put("CHAVE_ACESSO_FORMATADA", formatarChaveAcesso());
            parameters.put("INFORMACOES_COMPLEMENTARES", informacoesComplementares);
            parameters.put("MOSTRAR_MSG_FINALIZACAO", mostrarMsgFinalizacao);
            parameters.put("URL_CONSULTA", homologacao ? nota.getNota().getInfo().getIdentificacao().getUf().getQrCodeHomologacao() :
                    nota.getNota().getInfo().getIdentificacao().getUf().getQrCodeProducao());

            parameters.put("DATA_EMISSAO", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").format(nota.getNota().getInfo().getIdentificacao().getDataHoraEmissao()));
            parameters.put("DATA_RECEBIMENTO", nota.getProtocolo().getProtocoloInfo().getDataRecebimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

            return JasperFillManager.fillReport(in, parameters, new JRBeanArrayDataSource(new Object[]{nota}));
        }
    }

    private String formatarChaveAcesso() {
        return StringUtils.join(nota.getNota().getInfo().getChaveAcesso().split("(?<=\\G....)"), " ");
    }

    private BufferedImage gerarQRCode() throws WriterException {
        int size = 250;
        Map<EncodeHintType, Object> hintMap = new EnumMap<>(EncodeHintType.class);
        hintMap.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        hintMap.put(EncodeHintType.MARGIN, 1); /* default = 4 */
        hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);

        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix byteMatrix = qrCodeWriter.encode(nota.getNota().getInfoSuplementar().getQrCode(),
                BarcodeFormat.QR_CODE, size, size, hintMap);
        int crunchifyWidth = byteMatrix.getWidth();
        BufferedImage image = new BufferedImage(crunchifyWidth, crunchifyWidth, BufferedImage.TYPE_INT_RGB);
        image.createGraphics();

        Graphics2D graphics = (Graphics2D) image.getGraphics();
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, crunchifyWidth, crunchifyWidth);
        graphics.setColor(Color.BLACK);

        for (int i = 0; i < crunchifyWidth; i++) {
            for (int j = 0; j < crunchifyWidth; j++) {
                if (byteMatrix.get(i, j)) {
                    graphics.fillRect(i, j, 1, 1);
                }
            }
        }
        return image;
    }

    public static class NFCePagamento {

        private String formaPagamento;
        private BigDecimal valor;

        public NFCePagamento(String formaPagamento, BigDecimal valor) {
            this.formaPagamento = formaPagamento;
            this.valor = valor;
        }

        public String getFormaPagamento() {
            return formaPagamento;
        }

        public void setFormaPagamento(String formaPagamento) {
            this.formaPagamento = formaPagamento;
        }

        public BigDecimal getValor() {
            return valor;
        }

        public void setValor(BigDecimal valor) {
            this.valor = valor;
        }
    }
}