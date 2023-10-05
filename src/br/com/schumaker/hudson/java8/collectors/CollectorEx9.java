package br.com.schumaker.hudson.java8.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorEx9 {
    public static void main(String... args) {
        String result = String.join(" ", "how", "are", "you"); // how are you
        System.out.println(result);

        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date","blackberry", "avocado");

        result = String.join(", ",  fruits);
        System.out.println(result);

    }

    public static String joinByDelimiter(char delimiter, String... args) {
        return Arrays.stream(args, 0, args.length)
                .collect(Collectors.joining(String.valueOf(delimiter)));
    }
}
