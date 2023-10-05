package br.com.schumaker.hudson.java8.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author Hudson Schumaker
 */
public class CollectorEx8 {

    public static void main(String... args) {
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date","blackberry", "avocado");

        Map<String, Integer> mapped = fruits.stream().collect(Collectors.toMap(
                        f -> f,
                        String::length
        ));

        mapped.forEach((k, v) -> System.out.println(k + ": " + v));

    }
}
