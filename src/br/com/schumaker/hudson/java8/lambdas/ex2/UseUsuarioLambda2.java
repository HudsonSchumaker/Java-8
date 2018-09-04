package br.com.schumaker.hudson.java8.lambdas.ex2;

import br.com.schumaker.hudson.java8.lambdas.Usuario;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author hudsonschumaker
 */
public class UseUsuarioLambda2 {

    public static void main(String... args) {

        Usuario user1 = new Usuario("Henrique Schumaker", 150);
        Usuario user2 = new Usuario("Humberto Schumaker", 120);
        Usuario user3 = new Usuario("Hugo Schumaker", 190);
        Usuario user4 = new Usuario("Hudson Schumaker", 190);
        List<Usuario> usuarios = Arrays.asList(user1, user2, user3, user4);

        //Usando classe anonima... Curiosamente a referencia diamond nao funciona aqui
        Consumer<Usuario> mostrador = new Consumer<Usuario>() {
            @Override
            public void accept(Usuario u) {
                System.out.println(u.getNome());
            }
        };

        usuarios.forEach(mostrador);
    }
}
