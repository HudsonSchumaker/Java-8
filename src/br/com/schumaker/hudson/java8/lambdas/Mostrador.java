package br.com.schumaker.hudson.java8.lambdas;

import br.com.schumaker.hudson.java8.lambdas.Usuario;
import java.util.function.Consumer;

/**
 *
 * @author hudsonschumaker
 */

//Classe que implementa  java.util.function.Consumer, que tem um único método, o accept. 
//Ela é uma nova interface do Java 8, assim como todo o pacote do java.util.function
public class Mostrador implements Consumer<Usuario>{
    @Override
    public void accept(Usuario u) {
        System.out.println(u.getNome());
    }
}
