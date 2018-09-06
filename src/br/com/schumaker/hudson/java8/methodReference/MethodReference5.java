package br.com.schumaker.hudson.java8.methodReference;

import br.com.schumaker.hudson.java8.lambdas.Usuario;
import java.util.function.Supplier;

/**
 *
 * @author hudson schumaker
 */
public class MethodReference5 {
    public static void main(String... args) {
        Supplier<Usuario> factory = Usuario::new;
        Usuario novo = factory.get();
        
        novo.tornaModerador();
        System.out.println(novo);
    }
}