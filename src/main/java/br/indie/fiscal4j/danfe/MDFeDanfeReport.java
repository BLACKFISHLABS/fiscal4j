package br.indie.fiscal4j.danfe;

import br.indie.fiscal4j.mdfe3.classes.nota.MDFProcessado;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRXmlDataSource;
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
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class MDFeDanfeReport {

    private final MDFProcessado processado;
    private final Map<String, Object> parameters;

    public MDFeDanfeReport(String xml) {
        this(new DFParser().mdfProcessadaParaObjeto(xml));
    }

    public MDFeDanfeReport(MDFProcessado processado) {
        this.processado = processado;
        this.parameters = new HashMap<>();
    }

    public byte[] gerarDanfeMDFe(byte[] logoEmpresa, String rodape) throws Exception {
        return toPDF(createJasperPrintMDFe(logoEmpresa, rodape));
    }

    private static byte[] toPDF(JasperPrint print) throws JRException {
        return JasperExportManager.exportReportToPdf(print);
    }

    private JasperPrint createJasperPrintMDFe(byte[] logoEmpresa, String rodape) throws IOException, JRException, ParserConfigurationException, SAXException, WriterException {
        try (InputStream in = MDFeDanfeReport.class.getClassLoader().getResourceAsStream("danfe/mdfe/DAMDFeRetratoA4.jasper")) {
            final JRPropertiesUtil jrPropertiesUtil = JRPropertiesUtil.getInstance(DefaultJasperReportsContext.getInstance());
            jrPropertiesUtil.setProperty("net.sf.jasperreports.xpath.executer.factory", "net.sf.jasperreports.engine.util.xml.JaxenXPathExecuterFactory");

            parameters.put("LOGO", (logoEmpresa == null ? null : new ByteArrayInputStream(logoEmpresa)));
            parameters.put("QR_CODE", gerarQRCode());
            return JasperFillManager.fillReport(in, parameters, new JRXmlDataSource(convertStringXMl2DOM(processado.toString()), "/mdfeProc"));
        }
    }

    private BufferedImage gerarQRCode() throws WriterException {
        int size = 250;
        Map<EncodeHintType, Object> hintMap = new EnumMap<>(EncodeHintType.class);
        hintMap.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        hintMap.put(EncodeHintType.MARGIN, 1); /* default = 4 */
        hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);

        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix byteMatrix = qrCodeWriter.encode(processado.getMdfe().getMdfInfoSuplementar().getQrCodMDFe(),
                BarcodeFormat.QR_CODE, size, size, hintMap);
        int byteMatrixWidth = byteMatrix.getWidth();
        BufferedImage image = new BufferedImage(byteMatrixWidth, byteMatrixWidth, BufferedImage.TYPE_INT_RGB);
        image.createGraphics();

        Graphics2D graphics = (Graphics2D) image.getGraphics();
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, byteMatrixWidth, byteMatrixWidth);
        graphics.setColor(Color.BLACK);

        for (int i = 0; i < byteMatrixWidth; i++) {
            for (int j = 0; j < byteMatrixWidth; j++) {
                if (byteMatrix.get(i, j)) {
                    graphics.fillRect(i, j, 1, 1);
                }
            }
        }
        return image;
    }

    private Document convertStringXMl2DOM(String xml) throws ParserConfigurationException, IOException, SAXException {
        try (StringReader stringReader = new StringReader(xml)) {
            InputSource inputSource = new InputSource();
            inputSource.setCharacterStream(stringReader);
            return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputSource);
        }
    }

}