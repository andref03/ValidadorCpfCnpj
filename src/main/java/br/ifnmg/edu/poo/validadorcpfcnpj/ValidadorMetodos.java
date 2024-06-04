package br.ifnmg.edu.poo.validadorcpfcnpj;

/**
 * Classe que contém os métodos responsáveis pela validação de CPF's e CNPJ's.
 * @author André (@andref03)
 */
public class ValidadorMetodos {

    private static boolean isCpf;

    private static int obterDigito(long fonte, int pos) {

        long posit = pos;
        long retorno;

        if (isCpf) {
            posit = (long) Math.pow(10, (11 - pos));
        } else {
            posit = (long) Math.pow(10, (14 - pos));
        }

        retorno = fonte / posit;
        retorno = retorno % 10;
        return (int) retorno;
    }

    public static boolean isCpfValido(long cpfLong) {

        isCpf = true;

        int soma = 0;
        int resto;
        int primeiroDigito;
        int segundoDigito;

        for (int i = 1; i < 10; i++) {
            soma += obterDigito(cpfLong, i) * (i);
        }

        resto = soma % 11;

        if (resto == 10) {
            resto = 0;
        }

        primeiroDigito = resto;

        soma = 0;

        for (int i = 1; i < 11; i++) {
            soma += obterDigito(cpfLong, i) * (i - 1);
        }

        resto = soma % 11;

        if (resto == 10) {
            resto = 0;
        }

        segundoDigito = resto;

        if (primeiroDigito == obterDigito(cpfLong, 10)
                && segundoDigito == obterDigito(cpfLong, 11)) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isCpfValido(String cpfString) {
        String newCpfString = cpfString.replaceAll("[.-]", "");
        long cpfLong = Long.parseLong(newCpfString);
        return isCpfValido(cpfLong);
    }

    public static boolean isCnpjValido(long cnpjLong) {

        isCpf = false;

        int soma = 0;
        int resto;
        int primeiroDigito;
        int segundoDigito;

        for (int i = 1; i < 5; i++) {
            soma += obterDigito(cnpjLong, i) * (i + 5);
        }

        for (int i = 5; i < 13; i++) {
            soma += obterDigito(cnpjLong, i) * (i - 3);
        }

        resto = soma % 11;
        if (resto == 10) {
            resto = 0;
        }
        primeiroDigito = resto;

        soma = 0;

        for (int i = 1; i < 6; i++) {
            soma += obterDigito(cnpjLong, i) * (i + 4);
        }

        for (int i = 6; i < 14; i++) {
            soma += obterDigito(cnpjLong, i) * (i - 4);
        }

        resto = soma % 11;
        if (resto == 10) {
            resto = 0;
        }
        segundoDigito = resto;

        if (primeiroDigito == obterDigito(cnpjLong, 13)
                && segundoDigito == obterDigito(cnpjLong, 14)) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isCnpjValido(String cnpjString) {
        String newCnpjString = cnpjString.replaceAll("[./-]", "");
        long cnpjLong = Long.parseLong(newCnpjString);
        return isCnpjValido(cnpjLong);
    }
}
