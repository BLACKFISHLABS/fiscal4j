package br.indie.fiscal4j.nfe.validadores;

import java.math.BigInteger;

public class BigIntegerValidador {

    public static void tamanho12(final BigInteger valor, final String info) {
        if (valor.compareTo(new BigInteger("999999999999")) > 0) {
            throw new NumberFormatException(String.format("%s com tamanho maior que 12", info));
        }
    }

    public static void tamanho11(final BigInteger valor, final String info) {
        if (valor.compareTo(new BigInteger("99999999999")) > 0) {
            throw new NumberFormatException(String.format("%s com tamanho maior que 11", info));
        }
    }
}