package br.com.schumaker.hudson.java8.methodReference;

import br.com.schumaker.hudson.java8.lambdas.Usuario;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author hudsonschumaker
 */

public class MethodReference1 {
     public static void main(String... args) {

        Usuario user1 = new Usuario("Henrique Schumaker", 150);
        Usuario user2 = new Usuario("Humberto Schumaker", 120);
        Usuario user3 = new Usuario("Hugo Schumaker", 190);
        Usuario user4 = new Usuario("Hudson Schumaker", 190);
        List<Usuario> usuarios = Arrays.asList(user1, user2, user3, user4);
        
        Collections.reverse(usuarios);
        
        //Tornar usuarios moderadores com method reference
        usuarios.forEach(Usuario::tornaModerador);
        
        //Sem mostrador sem {} pq só tem uma instrução
        usuarios.forEach(u -> System.out.println(u.toString()));
     }
}
