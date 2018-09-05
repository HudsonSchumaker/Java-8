package br.com.schumaker.hudson.java8.lambdas.ex7;

/**
 *
 * @author hudsonschumaker
 */

public class ValidadorCEP {

    @FunctionalInterface
    interface Validador<String> {
        boolean valida(String cep);
    }
    
    public static boolean validaCep(String cep){
        Validador<String> validadorCep = c -> c.matches("[0-9]{5}-[0-9]{3}");
        return validadorCep.valida(cep);
    }   
}
