package br.com.schumaker.hudson.java8.lambdas.ex7;

/**
 *
 * @author hudson schumaker
 */

public class UsaValidadorCep {
    
    public static void main(String[] args) {
        System.out.println(ValidadorCEP.validaCep("2567-88-99"));
        System.out.println(ValidadorCEP.validaCep("25673-899"));
    }
}