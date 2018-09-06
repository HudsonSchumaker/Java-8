package br.com.schumaker.hudson.java8.methodReference;

import br.com.schumaker.hudson.java8.lambdas.Usuario;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 *
 * @author hudson schumaker
 */
public class MethodReference6 {
    public static void main(String... args) {
        Function<String, Usuario> factory = Usuario::new;
        Usuario henrique = factory.apply("Henrique Schumaker");
        Usuario humberto = factory.apply("Humberto Schumaker");
        
        List<Usuario> usuarios = Arrays.asList(henrique, humberto);
        
        //Tornar usuarios moderadores com method reference
        usuarios.forEach(Usuario::tornaModerador);
        
        //method reference para imprimir 
        usuarios.forEach(System.out::println);
    }
}