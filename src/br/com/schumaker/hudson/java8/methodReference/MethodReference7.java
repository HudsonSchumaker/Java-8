package br.com.schumaker.hudson.java8.methodReference;

import br.com.schumaker.hudson.java8.lambdas.Usuario;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

/**
 *
 * @author hudson schumaker
 */
public class MethodReference7 {
    public static void main(String... args) {
        BiFunction<String, Integer, Usuario> factory = Usuario::new;
        Usuario henrique = factory.apply("Henrique Schumaker",50);
        Usuario humberto = factory.apply("Humberto Schumaker",60);
        
        List<Usuario> usuarios = Arrays.asList(henrique, humberto);
        
        //Tornar usuarios moderadores com method reference
        usuarios.forEach(Usuario::tornaModerador);
        
        //method reference para imprimir 
        usuarios.forEach(System.out::println);
    }
}