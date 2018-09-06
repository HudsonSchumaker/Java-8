package br.com.schumaker.hudson.java8.lambdas.ex1;

import br.com.schumaker.hudson.java8.lambdas.Usuario;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author hudson schumaker
 */
public class UseUsuarioOldWay {

    public static void main(String args[]) {
        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);
        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
        for (Usuario u : usuarios) {
            System.out.println(u.getNome());
        }
    }
}