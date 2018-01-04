package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.FabricaDeObjetosFake;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NFNotaInfoVolumeTest {

    @Test
    public void devePermitirLacresComTamanhoInvalido() {
        final List<DFNotaInfoLacre> lacres = new ArrayList<>();
        for (int i = 0; i < 5000; i++) {
            lacres.add(new DFNotaInfoLacre());
        }
        new DFNotaInfoVolume().setLacres(lacres);
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirLacresComTamanhoInvalido() {
        final List<DFNotaInfoLacre> lacres = new ArrayList<>();
        for (int i = 0; i < 5001; i++) {
            lacres.add(new DFNotaInfoLacre());
        }
        new DFNotaInfoVolume().setLacres(lacres);
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNumerocaoVolumesComTamanhoInvalido() {
        try {
            new DFNotaInfoVolume().setNumeracaoVolumesTransportados("");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
            new DFNotaInfoVolume().setNumeracaoVolumesTransportados("mcBUtZwnI5DKj2YZNAcLP7W9h6j1xKmF5SX1BTKmsvyg0H5xSrfVw8HGn8eb1");
        }
        Assert.fail("Validacao nao funcionou");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirMarcaComTaamnhoInvalido() {
        try {
            new DFNotaInfoVolume().setMarca("");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
            new DFNotaInfoVolume().setMarca("mcBUtZwnI5DKj2YZNAcLP7W9h6j1xKmF5SX1BTKmsvyg0H5xSrfVw8HGn8eb1");
        }
        Assert.fail("Validacao nao funcionou");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirEspecieVolumesTransportadosComTamanhoInvalido() {
        try {
            new DFNotaInfoVolume().setEspecieVolumesTransportados("");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
            new DFNotaInfoVolume().setEspecieVolumesTransportados("mcBUtZwnI5DKj2YZNAcLP7W9h6j1xKmF5SX1BTKmsvyg0H5xSrfVw8HGn8eb1");
        }
        Assert.fail("Validacao nao funcionou");
    }

    @Test
    public void devePermitirLacresNulo() {
        final DFNotaInfoVolume volume = new DFNotaInfoVolume();
        volume.setEspecieVolumesTransportados("3Qf46HFs7FcWlhuQqLJ96vsrgJHu6B5ZXmmwMZ1RtvQVOV4Yp6M9VNqn5Ecb");
        volume.setMarca("lc0w13Xw2PxsSD4u4q3N6Qix9ZuCFm0HXo6BxBmKnjVbh9Xwy3k9UwBNfuYo");
        volume.setNumeracaoVolumesTransportados("mcBUtZwnI5DKj2YZNAcLP7W9h6j1xKmF5SX1BTKmsvyg0H5xSrfVw8HGn8eb");
        volume.setPesoBruto(new BigDecimal("1.358"));
        volume.setPesoLiquido(new BigDecimal("1"));
        volume.setQuantidadeVolumesTransportados(new BigInteger("99999999999"));
        volume.toString();
    }

    @Test
    public void devePermitirQuantidadeVolumesTransportadosNulo() {
        final DFNotaInfoVolume volume = new DFNotaInfoVolume();
        volume.setEspecieVolumesTransportados("3Qf46HFs7FcWlhuQqLJ96vsrgJHu6B5ZXmmwMZ1RtvQVOV4Yp6M9VNqn5Ecb");
        final DFNotaInfoLacre notaInfoLacre = new DFNotaInfoLacre();
        notaInfoLacre.setNumeroLacre("gvmjb9BB2cmwsLbzeR3Bsk8QbA7b1XEgXUhKeS9QZGiwhFnqDtEzS3377MP2");
        volume.setLacres(Collections.singletonList(notaInfoLacre));
        volume.setMarca("lc0w13Xw2PxsSD4u4q3N6Qix9ZuCFm0HXo6BxBmKnjVbh9Xwy3k9UwBNfuYo");
        volume.setNumeracaoVolumesTransportados("mcBUtZwnI5DKj2YZNAcLP7W9h6j1xKmF5SX1BTKmsvyg0H5xSrfVw8HGn8eb");
        volume.setPesoBruto(new BigDecimal("1.358"));
        volume.setPesoLiquido(new BigDecimal("1"));
        volume.toString();
    }

    @Test
    public void devePermitirPesoLiquidoNulo() {
        final DFNotaInfoVolume volume = new DFNotaInfoVolume();
        volume.setEspecieVolumesTransportados("3Qf46HFs7FcWlhuQqLJ96vsrgJHu6B5ZXmmwMZ1RtvQVOV4Yp6M9VNqn5Ecb");
        final DFNotaInfoLacre notaInfoLacre = new DFNotaInfoLacre();
        notaInfoLacre.setNumeroLacre("gvmjb9BB2cmwsLbzeR3Bsk8QbA7b1XEgXUhKeS9QZGiwhFnqDtEzS3377MP2");
        volume.setLacres(Collections.singletonList(notaInfoLacre));
        volume.setMarca("lc0w13Xw2PxsSD4u4q3N6Qix9ZuCFm0HXo6BxBmKnjVbh9Xwy3k9UwBNfuYo");
        volume.setNumeracaoVolumesTransportados("mcBUtZwnI5DKj2YZNAcLP7W9h6j1xKmF5SX1BTKmsvyg0H5xSrfVw8HGn8eb");
        volume.setPesoBruto(new BigDecimal("1.358"));
        volume.setQuantidadeVolumesTransportados(new BigInteger("99999999999"));
        volume.toString();
    }

    @Test
    public void devePermitirPesoBrutoNulo() {
        final DFNotaInfoVolume volume = new DFNotaInfoVolume();
        volume.setEspecieVolumesTransportados("3Qf46HFs7FcWlhuQqLJ96vsrgJHu6B5ZXmmwMZ1RtvQVOV4Yp6M9VNqn5Ecb");
        final DFNotaInfoLacre notaInfoLacre = new DFNotaInfoLacre();
        notaInfoLacre.setNumeroLacre("gvmjb9BB2cmwsLbzeR3Bsk8QbA7b1XEgXUhKeS9QZGiwhFnqDtEzS3377MP2");
        volume.setLacres(Collections.singletonList(notaInfoLacre));
        volume.setMarca("lc0w13Xw2PxsSD4u4q3N6Qix9ZuCFm0HXo6BxBmKnjVbh9Xwy3k9UwBNfuYo");
        volume.setNumeracaoVolumesTransportados("mcBUtZwnI5DKj2YZNAcLP7W9h6j1xKmF5SX1BTKmsvyg0H5xSrfVw8HGn8eb");
        volume.setPesoLiquido(new BigDecimal("1"));
        volume.setQuantidadeVolumesTransportados(new BigInteger("99999999999"));
        volume.toString();
    }

    @Test
    public void devePermitirNumeracaoVolumesTransportadosNulo() {
        final DFNotaInfoVolume volume = new DFNotaInfoVolume();
        volume.setEspecieVolumesTransportados("3Qf46HFs7FcWlhuQqLJ96vsrgJHu6B5ZXmmwMZ1RtvQVOV4Yp6M9VNqn5Ecb");
        final DFNotaInfoLacre notaInfoLacre = new DFNotaInfoLacre();
        notaInfoLacre.setNumeroLacre("gvmjb9BB2cmwsLbzeR3Bsk8QbA7b1XEgXUhKeS9QZGiwhFnqDtEzS3377MP2");
        volume.setLacres(Collections.singletonList(notaInfoLacre));
        volume.setMarca("lc0w13Xw2PxsSD4u4q3N6Qix9ZuCFm0HXo6BxBmKnjVbh9Xwy3k9UwBNfuYo");
        volume.setPesoBruto(new BigDecimal("1.358"));
        volume.setPesoLiquido(new BigDecimal("1"));
        volume.setQuantidadeVolumesTransportados(new BigInteger("99999999999"));
        volume.toString();
    }

    @Test
    public void devePermitirMarcaNulo() {
        final DFNotaInfoVolume volume = new DFNotaInfoVolume();
        volume.setEspecieVolumesTransportados("3Qf46HFs7FcWlhuQqLJ96vsrgJHu6B5ZXmmwMZ1RtvQVOV4Yp6M9VNqn5Ecb");
        final DFNotaInfoLacre notaInfoLacre = new DFNotaInfoLacre();
        notaInfoLacre.setNumeroLacre("gvmjb9BB2cmwsLbzeR3Bsk8QbA7b1XEgXUhKeS9QZGiwhFnqDtEzS3377MP2");
        volume.setLacres(Collections.singletonList(notaInfoLacre));
        volume.setNumeracaoVolumesTransportados("mcBUtZwnI5DKj2YZNAcLP7W9h6j1xKmF5SX1BTKmsvyg0H5xSrfVw8HGn8eb");
        volume.setPesoBruto(new BigDecimal("1.358"));
        volume.setPesoLiquido(new BigDecimal("1"));
        volume.setQuantidadeVolumesTransportados(new BigInteger("99999999999"));
        volume.toString();
    }

    @Test
    public void devePermitirEspecieVolumesTransportadosNulo() {
        final DFNotaInfoVolume volume = new DFNotaInfoVolume();
        final DFNotaInfoLacre notaInfoLacre = new DFNotaInfoLacre();
        notaInfoLacre.setNumeroLacre("gvmjb9BB2cmwsLbzeR3Bsk8QbA7b1XEgXUhKeS9QZGiwhFnqDtEzS3377MP2");
        volume.setLacres(Collections.singletonList(notaInfoLacre));
        volume.setMarca("lc0w13Xw2PxsSD4u4q3N6Qix9ZuCFm0HXo6BxBmKnjVbh9Xwy3k9UwBNfuYo");
        volume.setNumeracaoVolumesTransportados("mcBUtZwnI5DKj2YZNAcLP7W9h6j1xKmF5SX1BTKmsvyg0H5xSrfVw8HGn8eb");
        volume.setPesoBruto(new BigDecimal("1.358"));
        volume.setPesoLiquido(new BigDecimal("1"));
        volume.setQuantidadeVolumesTransportados(new BigInteger("99999999999"));
        volume.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<DFNotaInfoVolume><qVol>99999999999</qVol><esp>3Qf46HFs7FcWlhuQqLJ96vsrgJHu6B5ZXmmwMZ1RtvQVOV4Yp6M9VNqn5Ecb</esp><marca>lc0w13Xw2PxsSD4u4q3N6Qix9ZuCFm0HXo6BxBmKnjVbh9Xwy3k9UwBNfuYo</marca><nVol>mcBUtZwnI5DKj2YZNAcLP7W9h6j1xKmF5SX1BTKmsvyg0H5xSrfVw8HGn8eb</nVol><pesoL>1.000</pesoL><pesoB>1.358</pesoB><lacres><nLacre>gvmjb9BB2cmwsLbzeR3Bsk8QbA7b1XEgXUhKeS9QZGiwhFnqDtEzS3377MP2</nLacre></lacres></DFNotaInfoVolume>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoVolume().toString());
    }
}