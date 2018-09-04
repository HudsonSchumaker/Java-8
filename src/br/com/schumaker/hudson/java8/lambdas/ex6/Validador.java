package br.com.schumaker.hudson.java8.lambdas.ex6;

/**
 *
 * @author hudsonschumaker
 * @param <T>
 */


@FunctionalInterface
public interface Validador<T> {
    boolean valida(T t);
}