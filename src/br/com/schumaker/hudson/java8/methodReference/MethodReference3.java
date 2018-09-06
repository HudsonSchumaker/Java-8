package br.com.schumaker.hudson.java8.methodReference;

import br.com.schumaker.hudson.java8.lambdas.Usuario;
import java.util.ArrayList;
import static java.util.Comparator.comparingInt;
import java.util.List;

/**
 *
 * @author hudsonschumaker
 */
public class MethodReference3 {
    public static void main(String... args) {
        Usuario henrique = new Usuario("Henrique Schumaker", 150);
        Usuario humberto = new Usuario("Humberto Schumaker", 120);
        
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(henrique);
        usuarios.add(humberto);

        //method reference chamando metodo 
        Runnable bloco1 = henrique::tornaModerador;
        bloco1.run();
        
        //lambda chamando metodo e passando para runnable
        Runnable bloco2 = () -> humberto.tornaModerador();
        bloco2.run();
        
        //Comparar com methods reference usando comparingInt para evitar autoBoxing
        usuarios.sort(comparingInt(Usuario::getPontos));
        
        //Lambda
        usuarios.forEach(u-> System.out.println(u.toString()));    
     }
}