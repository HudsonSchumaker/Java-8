package br.com.schumaker.hudson.java8.lambdas.ex3;

import br.com.schumaker.hudson.java8.lambdas.Usuario;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author hudsonschumaker
 */
public class UseUsuarioLambda3 {

    public static void main(String... args) {

        Usuario user1 = new Usuario("Henrique Schumaker", 150);
        Usuario user2 = new Usuario("Humberto Schumaker", 120);
        Usuario user3 = new Usuario("Hugo Schumaker", 190);
        Usuario user4 = new Usuario("Hudson Schumaker", 190);
        List<Usuario> usuarios = Arrays.asList(user1, user2, user3, user4);

        //Sem criar a varial local de mostrador
        usuarios.forEach(new Consumer<Usuario>() {
            public void accept(Usuario u) {
                System.out.println(u.getNome());
            }
        });
    }
}
