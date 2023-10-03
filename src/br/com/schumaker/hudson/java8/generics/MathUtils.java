package br.com.schumaker.hudson.java8.generics;

public class MathUtils {
    public static <T extends Number> double sum(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }
}