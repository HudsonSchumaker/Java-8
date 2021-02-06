package br.com.schumaker.hudson.java8.streams;

import br.com.schumaker.hudson.java8.lambdas.Usuario;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author hudson schumaker
 */
public class FiltarListaOldWayEx1 {
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
        
        // Criar classe anonima pra 
        Collections.sort(usuarios, new Comparator<Usuario>(){
            @Override
            public int compare(Usuario u1, Usuario u2){
                return u1.getPontos() - u2.getPontos();
            }
        });
        
        Collections.reverse(usuarios);
        List<Usuario> top5 = usuarios.subList(0, 5);
        
        for(Usuario u : top5){
            u.tornaModerador();
        }
        
        for(Usuario u : usuarios){
            System.out.println(u);
        }
    }
}
