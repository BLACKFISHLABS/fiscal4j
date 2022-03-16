package br.indie.fiscal4j.cte.webservices.distribuicao;

import br.indie.fiscal4j.DFUnidadeFederativa;
import br.indie.fiscal4j.cte.classes.distribuicao.CTDistribuicaoConsultaNSU;
import br.indie.fiscal4j.cte.classes.distribuicao.CTDistribuicaoInt;
import br.indie.fiscal4j.cte.classes.distribuicao.CTDistribuicaoNSU;
import br.indie.fiscal4j.cte200.classes.CTAutorizador;
import br.indie.fiscal4j.cte300.CTeConfig;
import br.indie.fiscal4j.nfe.NFeConfig;
import br.indie.fiscal4j.nfe.classes.distribuicao.NFDistribuicaoIntRetorno;
import br.indie.fiscal4j.utils.DFSocketFactory;
import br.indie.fiscal4j.validadores.DFXMLValidador;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.apache.commons.httpclient.protocol.Protocol;
import org.apache.commons.lang3.StringUtils;

import javax.xml.stream.XMLStreamException;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.rmi.RemoteException;
import java.util.Base64;
import java.util.zip.GZIPInputStream;

public class WSDistribuicaoCTe {

    private final CTeConfig config;

    public WSDistribuicaoCTe(final CTeConfig config) {
        this.config = config;
    }

    /**
     * Metodo para consultar os conhecimentos de transporte e retorna uma String<br>
     * E importante salvar esta String para nao perder nenhuma informacao<br>
     * A receita nao disponibiliza o conhecimento varias vezes para consultar, retorna rejeicao: Consumo indevido
     */
    @Deprecated
    public static String consultar(final CTDistribuicaoInt distDFeInt, final NFeConfig config) throws Exception {
        Protocol.registerProtocol("https", new Protocol("https", new DFSocketFactory(config), 443));
        try {
            final OMElement ome = AXIOMUtil.stringToOM(distDFeInt.toString());

            final CTeDistribuicaoDFeSoapStub.CteDadosMsg_type0 dadosMsgType0 = new CTeDistribuicaoDFeSoapStub.CteDadosMsg_type0();
            dadosMsgType0.setExtraElement(ome);

            final CTeDistribuicaoDFeSoapStub.CteDistDFeInteresse distDFeInteresse = new CTeDistribuicaoDFeSoapStub.CteDistDFeInteresse();
            distDFeInteresse.setCteDadosMsg(dadosMsgType0);

            final CTeDistribuicaoDFeSoapStub stub = new CTeDistribuicaoDFeSoapStub(CTAutorizador.AN.getDistribuicaoDFe(config.getAmbiente()), config);
            final CTeDistribuicaoDFeSoapStub.CteDistDFeInteresseResponse result = stub.cteDistDFeInteresse(distDFeInteresse);

            return result.getCteDistDFeInteresseResult().getExtraElement().toString();
        } catch (RemoteException | XMLStreamException e) {
            throw new Exception(e.getMessage());
        }
    }

    public NFDistribuicaoIntRetorno consultar(final String cpfOuCnpj, final DFUnidadeFederativa uf, final String nsu, final String ultNsu) throws Exception {
        try {
            String xmlEnvio = this.gerarCTeDistribuicaoInt(cpfOuCnpj, uf, nsu, ultNsu).toString();

            DFXMLValidador.validaDistribuicaoCTe(xmlEnvio);

            final OMElement ome = AXIOMUtil.stringToOM(xmlEnvio);

            final CTeDistribuicaoDFeSoapStub.CteDadosMsg_type0 dadosMsgType0 = new CTeDistribuicaoDFeSoapStub.CteDadosMsg_type0();
            dadosMsgType0.setExtraElement(ome);

            final CTeDistribuicaoDFeSoapStub.CteDistDFeInteresse distDFeInteresse = new CTeDistribuicaoDFeSoapStub.CteDistDFeInteresse();
            distDFeInteresse.setCteDadosMsg(dadosMsgType0);

            final CTeDistribuicaoDFeSoapStub stub = new CTeDistribuicaoDFeSoapStub(CTAutorizador.AN.getDistribuicaoDFe(config.getAmbiente()), config);
            final CTeDistribuicaoDFeSoapStub.CteDistDFeInteresseResponse result = stub.cteDistDFeInteresse(distDFeInteresse);
            return this.config.getPersister().read(NFDistribuicaoIntRetorno.class, result.getCteDistDFeInteresseResult().getExtraElement().toString());
        } catch (RemoteException | XMLStreamException e) {
            throw new Exception(e.getMessage());
        }
    }

    private CTDistribuicaoInt gerarCTeDistribuicaoInt(final String cpfOuCnpj, final DFUnidadeFederativa uf, final String nsu, final String ultNsu) {
        final CTDistribuicaoInt distDFeInt = new CTDistribuicaoInt();
        distDFeInt.setVersao("1.00");
        distDFeInt.setAmbiente(this.config.getAmbiente());
        distDFeInt.setUnidadeFederativaAutor(uf);

        if (cpfOuCnpj.length() == 11) {
            distDFeInt.setCpf(cpfOuCnpj);
        } else {
            distDFeInt.setCnpj(cpfOuCnpj);
        }

        if (StringUtils.isNotBlank(ultNsu)) {
            distDFeInt.setDistribuicao(new CTDistribuicaoNSU().setUltimoNSU(ultNsu));
        } else {
            distDFeInt.setConsulta(new CTDistribuicaoConsultaNSU().setNsu(nsu));
        }
        return distDFeInt;
    }

    public static String decodeGZipToXml(final String conteudoEncode) throws Exception {
        if (conteudoEncode == null || conteudoEncode.length() == 0) {
            return "";
        }
        final byte[] conteudo = Base64.getDecoder().decode(conteudoEncode);//java 8
        //final byte[] conteudo = DatatypeConverter.parseBase64Binary(conteudoEncode);//java 7
        try (GZIPInputStream gis = new GZIPInputStream(new ByteArrayInputStream(conteudo))) {
            try (BufferedReader bf = new BufferedReader(new InputStreamReader(gis, StandardCharsets.UTF_8))) {
                StringBuilder outStr = new StringBuilder();
                String line;
                while ((line = bf.readLine()) != null) {
                    outStr.append(line);
                }
                return outStr.toString();
            }
        }
    }
}
