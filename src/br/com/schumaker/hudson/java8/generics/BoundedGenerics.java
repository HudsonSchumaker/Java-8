package br.com.schumaker.hudson.java8.generics;

public class BoundedGenerics {
    public static void main(String[] args) {
        double intSum = MathUtils.sum(5, 10);
        double doubleSum = MathUtils.sum(3.5, 2.7);

        System.out.println("Integer Sum: " + intSum);
        System.out.println("Double Sum: " + doubleSum);
    }
}
