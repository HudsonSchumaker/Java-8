package br.com.schumaker.hudson.java8.generics;

public class GenericMethod {
    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        String[] strArray = { "apple", "banana", "cherry" };

        Integer lastInt = Utilities.getLastItem(intArray);
        String lastStr = Utilities.getLastItem(strArray);

        System.out.println("Last Integer: " + lastInt);
        System.out.println("Last String: " + lastStr);
    }
}
