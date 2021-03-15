package br.indie.fiscal4j.validadores;

public class DFCNPJValidador {

    private static final int[] pesoCNPJ = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};

    public static boolean isValidCNPJ(String cnpj) {
        cnpj = cnpj.trim().replace(".", "").replace("-", "");
        if (cnpj.length() != 14) return false;

        int digito1 = calcularDigito(cnpj.substring(0, 12));
        int digito2 = calcularDigito(cnpj.substring(0, 12) + digito1);
        return cnpj.equals(cnpj.substring(0, 12) + digito1 + digito2);
    }

    private static int calcularDigito(String str) {
        int soma = 0;
        for (int indice = str.length() - 1, digito; indice >= 0; indice--) {
            digito = Integer.parseInt(str.substring(indice, indice + 1));
            soma += digito * DFCNPJValidador.pesoCNPJ[DFCNPJValidador.pesoCNPJ.length - str.length() + indice];
        }
        soma = 11 - soma % 11;
        return soma > 9 ? 0 : soma;
    }
}
