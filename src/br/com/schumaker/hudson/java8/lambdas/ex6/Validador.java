package br.com.schumaker.hudson.java8.lambdas.ex6;

/**
 *
 * @author hudson schumaker
 * @param <T>
 */

@FunctionalInterface
public interface Validador<T> {
    boolean valida(T t);
}