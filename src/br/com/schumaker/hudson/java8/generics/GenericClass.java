package br.com.schumaker.hudson.java8.generics;

public class GenericClass {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(42);
        Box<String> strBox = new Box<>("Hello, Generics!");

        System.out.println(intBox);
        System.out.println(strBox);
    }
}
