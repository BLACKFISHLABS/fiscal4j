package br.indie.fiscal4j.danfe;

import br.indie.fiscal4j.mdfe3.classes.nota.MDFeProcessada;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRXmlDataSource;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class MDFeDanfeReport {

    private final MDFeProcessada mdFeProcessada;
    private Map<String, Object> parameters;

    public MDFeDanfeReport(MDFeProcessada mdFeProcessada) {
        this.mdFeProcessada = mdFeProcessada;
        this.parameters = new HashMap<>();
    }

    public byte[] gerarDanfeMDFe(byte[] logoEmpresa, String rodape) throws Exception {
        return toPDF(createJasperPrintMDFe(logoEmpresa, rodape));
    }

    private static byte[] toPDF(JasperPrint print) throws JRException {
        return JasperExportManager.exportReportToPdf(print);
    }

    private JasperPrint createJasperPrintMDFe(byte[] logoEmpresa, String rodape) throws IOException, JRException, ParserConfigurationException, SAXException {
        try (InputStream in = MDFeDanfeReport.class.getClassLoader().getResourceAsStream("danfe/mdfe/DANFE_MDFE_RODO_RETRATO.jasper")) {
            final JRPropertiesUtil jrPropertiesUtil = JRPropertiesUtil.getInstance(DefaultJasperReportsContext.getInstance());
            jrPropertiesUtil.setProperty("net.sf.jasperreports.xpath.executer.factory", "net.sf.jasperreports.engine.util.xml.JaxenXPathExecuterFactory");

            parameters.put("LOGO_EMPRESA", (logoEmpresa == null ? null : new ByteArrayInputStream(logoEmpresa)));
            parameters.put("RODAPE", rodape);

            return JasperFillManager.fillReport(in, parameters, new JRXmlDataSource(convertStringXMl2DOM(mdFeProcessada.toString()), "/mdfeProc"));
        }
    }

    private Document convertStringXMl2DOM(String xml) throws ParserConfigurationException, IOException, SAXException {
        try (StringReader stringReader = new StringReader(xml)) {
            InputSource inputSource = new InputSource();
            inputSource.setCharacterStream(stringReader);
            return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputSource);
        }
    }

}