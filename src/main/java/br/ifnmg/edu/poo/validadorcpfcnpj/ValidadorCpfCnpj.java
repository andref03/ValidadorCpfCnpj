package br.ifnmg.edu.poo.validadorcpfcnpj;

/**
 * Esta classe contém o método main, com os testes realizados.
 * @author André (@andref03)
 */
public class ValidadorCpfCnpj {

    public static void main(String[] args) {

        System.out.println(">> TESTE 01)\nCPF: 14230703058\nResposta: "
                + (ValidadorMetodos.isCpfValido(14230703058L) ? "Valido" : "Invalido"));
        System.out.println();

        System.out.println(">> TESTE 02)\nCPF: 142.307.030-58\nResposta: "
                + (ValidadorMetodos.isCpfValido("142.307.030-58") ? "Valido" : "Invalido"));
        System.out.println();

        System.out.println(">> TESTE 03)\nCPF: 230703058\nResposta: "
                + (ValidadorMetodos.isCpfValido(230703058L) ? "Valido" : "Invalido"));
        System.out.println();

        System.out.println(">> TESTE 04)\nCPF: 002.307.030-58\nResposta: "
                + (ValidadorMetodos.isCpfValido("002.307.030-58") ? "Valido" : "Invalido"));
        System.out.println();

        System.out.println(">> TESTE 05)\nCPF: 456789014\nResposta: "
                + (ValidadorMetodos.isCpfValido(456789014L) ? "Valido" : "Invalido"));
        System.out.println();

        System.out.println(">> TESTE 06)\nCNPJ: 35.017.120/0001-86\nResposta: "
                + (ValidadorMetodos.isCnpjValido("35.017.120/0001-86") ? "Valido" : "Invalido"));
        System.out.println();

        System.out.println(">> TESTE 07)\nCNPJ: 35017120000186\nResposta: "
                + (ValidadorMetodos.isCnpjValido(35017120000186L) ? "Valido" : "Invalido"));
        System.out.println();

        System.out.println(">> TESTE 08)\nCNPJ: 35.017.120/0001-88\nResposta: "
                + (ValidadorMetodos.isCnpjValido("35.017.120/0001-88") ? "Valido" : "Invalido"));
        System.out.println();

    }
}
