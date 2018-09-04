package br.com.schumaker.hudson.java8.lambdas.ex4;

import br.com.schumaker.hudson.java8.lambdas.Usuario;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author hudsonschumaker
 */
public class UseUsuarioLambda4 {
    
    public static void main(String... args) {

        Usuario user1 = new Usuario("Henrique Schumaker", 150);
        Usuario user2 = new Usuario("Humberto Schumaker", 120);
        Usuario user3 = new Usuario("Hugo Schumaker", 190);
        Usuario user4 = new Usuario("Hudson Schumaker", 190);
        List<Usuario> usuarios = Arrays.asList(user1, user2, user3, user4);
        
        Collections.reverse(usuarios);

        //Enfim Lambada - 1
        Consumer<Usuario> mostrador1 = (Usuario u) -> {System.out.println(u.getNome());};
        usuarios.forEach(mostrador1);
        
        Collections.reverse(usuarios);
        
        //Enfim Lambada - 2
        Consumer<Usuario> mostrador2 = u -> {System.out.println(u.getNome());};
        usuarios.forEach(mostrador2);
        
        //Enfim Lambada - 3
        Consumer<Usuario> mostrador3 = u -> System.out.println(u.getNome());
        usuarios.forEach(mostrador3);
        
        //Tornar usuarios moderadores
        usuarios.forEach(u -> u.tornaModerador());

        //Sem mostrador
        usuarios.forEach((u) -> {
            System.out.println(u.toString());
        });
    }
}
