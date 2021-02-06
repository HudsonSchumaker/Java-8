package br.com.schumaker.hudson.java8.streams;

import br.com.schumaker.hudson.java8.lambdas.Usuario;
import java.util.ArrayList;
import java.util.List;
import static java.util.Comparator.comparingInt;

/**
 *
 * @author Hudson Schumaker
 */
public class StreamEx1Refinado {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Henrique Schumaker", 50);
        Usuario user2 = new Usuario("Humberto Schumaker", 120);
        Usuario user3 = new Usuario("Hugo Schumaker", 190);
        Usuario user4 = new Usuario("Hudson Schumaker", 10);
        Usuario user5 = new Usuario("Gabriel Schumaker", 90);
        Usuario user6 = new Usuario("Nikolas Schumaker", 290);
        Usuario user7 = new Usuario("Elisabeth Schumaker", 195);
        Usuario user8 = new Usuario("Eliza Schumaker", 1000);
        Usuario user9 = new Usuario("Marcos Schumaker", 100);
        Usuario user10 = new Usuario("Wilson Schumaker", 1300);
        
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);
        usuarios.add(user4);
        usuarios.add(user5);
        usuarios.add(user6);
        usuarios.add(user7);
        usuarios.add(user8);
        usuarios.add(user9);
        usuarios.add(user10);
        
        // sem importação estatica
        // usuarios.sort(Comparator.comparingInt(Usuario::getPontos).reversed());
        usuarios.sort(comparingInt(Usuario::getPontos).reversed());
        
        // sublista com for each e reference method
        usuarios.subList(0, 5).forEach(Usuario::tornaModerador);
        
        // Java8
        // Lambda para imprimir lista
        usuarios.forEach(u -> System.out.println(u));
        
        System.out.println("------------------------------------------------------------------------------------------------------");
        
        // method reference para imprimir lista
        usuarios.forEach(System.out::println);
    }
}
