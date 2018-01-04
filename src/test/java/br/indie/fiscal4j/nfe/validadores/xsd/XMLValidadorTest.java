package br.indie.fiscal4j.nfe.validadores.xsd;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import br.indie.fiscal4j.NFeConfigFake;
import br.indie.fiscal4j.nfe.assinatura.AssinaturaDigital;
import org.junit.Assert;
import org.junit.Test;

public class XMLValidadorTest {

    @Test
    public void deveValidarLote() throws Exception {
        final String loteXml = FabricaDeObjetosFake.getNFLoteEnvio().toString();
        final String loteXmlAssinado = new AssinaturaDigital(new NFeConfigFake()).assinarDocumento(loteXml);
        Assert.assertTrue(XMLValidador.validaLote(loteXmlAssinado));
    }

    @Test
    public void deveValidarNota() throws Exception {
        final String notaXml = FabricaDeObjetosFake.getNFNota().toString();
        final String notaXmlAssinada = new AssinaturaDigital(new NFeConfigFake()).assinarDocumento(notaXml);
        Assert.assertTrue(XMLValidador.validaNota(notaXmlAssinada));
    }
}