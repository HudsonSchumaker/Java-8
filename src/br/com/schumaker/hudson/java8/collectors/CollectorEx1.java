package br.com.schumaker.hudson.java8.collectors;

import br.com.schumaker.hudson.java8.lambdas.Usuario;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author hudson schumaker
 */
public class CollectorEx1 {
    public static void main(String[] args) {
        //BiFunction para method reference chamar construtor q recebe 2 parametros
        BiFunction<String, Integer, Usuario> factory = Usuario::new;
        Usuario user1 = factory.apply("Henrique Schumaker", 50);
        Usuario user2 = factory.apply("Humberto Schumaker", 80);
        Usuario user4 = factory.apply("Hudson Schumaker", 10);
        Usuario user5 = factory.apply("Gabriel Schumaker", 90);
        Usuario user6 = factory.apply("Nikolas Schumaker", 40);
        Usuario user10 = factory.apply("Wilson Schumaker", 1300);
        Usuario user3 = factory.apply("Hugo Schumaker", 10);
        Usuario user7 = factory.apply("Elisabeth Schumaker", 5);
        Usuario user8 = factory.apply("Eliza Schumaker", 1000);
        Usuario user9 = factory.apply("Marcos Schumaker", 100);
        List<Usuario> usuarios = Arrays.asList(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10);
        
        //Filtra adiciona em uma lista
        List<Usuario> maisQue100 = usuarios.stream()
                .filter(u -> u.getPontos()>100)
                .collect(toList());

        //Filtra adiciona em uma lista e imprime
        usuarios.stream()
                .filter(u -> u.getPontos() >100)
                .collect(toList())
                .forEach((u) -> System.out.println(u));
    }
}