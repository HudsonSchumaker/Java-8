package br.com.schumaker.hudson.java8.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdasGeneral {

    public static void main(String[] args) {

        // Using Lambdas with Streams:
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using lambda with forEach to print each number
        numbers.forEach(number -> System.out.println(number));

        // Using lambda with map to square each number
        List<Integer> squaredNumbers = numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());


        // Predicate Using Lambda:
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date");

        // Using lambda with filter to find fruits starting with "a"
        List<String> filteredFruits = fruits.stream()
                .filter(fruit -> fruit.startsWith("a"))
                .collect(Collectors.toList());

        // Comparator Using Lambda:
        List<String> fruitsA = Arrays.asList("apple", "banana", "cherry", "date");

        // Using lambda with sorted to sort fruits by length
        List<String> sortedFruits = fruitsA.stream()
                .sorted((fruit1, fruit2) -> Integer.compare(fruit1.length(), fruit2.length()))
                .collect(Collectors.toList());

        // Runnable Using Lambda:
        // Using lambda to create a Runnable
        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello, world!");
            }
        };

        // Functional Interface with Lambda:
        // Using a lambda expression with a functional interface
        Function<Integer, Integer> square = (num) -> num * num;
        int result = square.apply(5); // result will be 25


        // Consumer Interface with Lambda:
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);

        // Using a lambda expression with a Consumer to print each number
        numbers2.forEach((n) -> {
            System.out.println("Processing number: " + n);
        });

    }
}
