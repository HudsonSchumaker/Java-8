package br.com.schumaker.hudson.java8.lambdas.ex6;

/**
 *
 * @author Hudson Schumaker
 * @param <T>
 */

@FunctionalInterface
public interface Validador<T> {
    boolean valida(T t);
}
