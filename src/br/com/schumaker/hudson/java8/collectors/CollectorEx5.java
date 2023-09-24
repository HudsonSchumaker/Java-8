package br.com.schumaker.hudson.java8.collectors;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 *
 * @author Hudson Schumaker
 */
public class CollectorEx5 {
    public static void main(String[] args) {
        // Get Min or Max Number
        Integer maxNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .max(Comparator.comparing(Integer::valueOf))
                .get();

        Integer minNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .min(Comparator.comparing(Integer::valueOf))
                .get();

        System.out.println("maxNumber = " + maxNumber);
        System.out.println("minNumber = " + minNumber);
    }
}
