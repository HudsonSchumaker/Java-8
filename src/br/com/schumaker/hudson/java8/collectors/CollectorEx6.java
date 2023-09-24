package br.com.schumaker.hudson.java8.collectors;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 *
 * @author Hudson Schumaker
 */
public class CollectorEx6 {

    public static void main(String[] args) {
        // Get Min or Max String/Char
        String maxChar = Stream.of("H", "T", "D", "I", "J")
                .max(Comparator.comparing(String::valueOf))
                .get();

        String minChar = Stream.of("H", "T", "D", "I", "J")
                .min(Comparator.comparing(String::valueOf))
                .get();

        System.out.println("maxChar = " + maxChar);
        System.out.println("minChar = " + minChar);
    }
}
