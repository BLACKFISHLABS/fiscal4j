package br.indie.fiscal4j.danfe;

import br.indie.fiscal4j.nfe400.classes.nota.consulta.NFProtocoloEvento;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRXmlDataSource;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class CCeDanfeReport {

    private NFProtocoloEvento evento;

    public CCeDanfeReport(NFProtocoloEvento evento) {
        this.evento = evento;
    }

    public byte[] gerarDanfeCCe() throws Exception {
        return toPDF(createJasperPrintCCe());
    }

    private JasperPrint createJasperPrintCCe() throws IOException, SAXException, ParserConfigurationException, JRException {
        InputStream in = NFDanfeReport.class.getClassLoader().getResourceAsStream("danfe/cce/CCE.jasper");
        Map<String, Object> parameters = new HashMap<>();
        return JasperFillManager.fillReport(in, parameters, new JRXmlDataSource(convertStringXMl2DOM(evento.toString()), "/"));
    }

    private Document convertStringXMl2DOM(String xml) throws ParserConfigurationException, IOException, SAXException {
        try (StringReader stringReader = new StringReader(xml)) {
            InputSource inputSource = new InputSource();
            inputSource.setCharacterStream(stringReader);
            return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputSource);
        }
    }

    private static byte[] toPDF(JasperPrint print) throws JRException {
        return JasperExportManager.exportReportToPdf(print);
    }
}
