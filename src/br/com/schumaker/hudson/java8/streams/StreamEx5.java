package br.com.schumaker.hudson.java8.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author hudsonschumaker
 */
public class StreamEx5 {

    public static void main(String[] args) {
        Stream.of("bus", "car", "bycle", "flight", "train")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
    }
}