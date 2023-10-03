package br.com.schumaker.hudson.java8.generics;

public class Utilities {
    public static <T> T getLastItem(T[] array) {
        if (array.length == 0) {
            return null;
        }
        return array[array.length - 1];
    }
}


