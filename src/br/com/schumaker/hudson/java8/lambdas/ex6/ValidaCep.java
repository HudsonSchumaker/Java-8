package br.com.schumaker.hudson.java8.lambdas.ex6;

/**
 *
 * @author Hudson Schumaker
 */

public class ValidaCep {

    public static void main(String[] args) {

        // Classe anonima
        Validador<String> validadorCEP = new Validador<String>() {
            public boolean valida(String valor) {
                return valor.matches("[0-9]{5}-[0-9]{3}");
            }
        };

        System.out.println(validadorCEP.valida("444-444"));
        System.out.println(validadorCEP.valida("27623-000"));

        // Lambda
        Validador<String> validadorCEP2 = cep -> cep.matches("[0-9]{5}-[0-9]{3}");

        System.out.println(validadorCEP2.valida("444-444"));
        System.out.println(validadorCEP2.valida("27623-000"));
    }
}
