package br.com.schumaker.hudson.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamEx8 {
    public static void main(String[] args) {

        // Filtering:
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");

        // Filter elements starting with "a"
        List<String> filteredList = strings.stream()
                .filter(s -> s.startsWith("a"))
                .collect(Collectors.toList()); // Collect the filtered elements into a list

        filteredList.forEach(System.out::println);

        // Mapping:
        List<String> fruits = Arrays.asList("apple", "banana", "cherry");

        // Map the fruits to their lengths
        List<Integer> fruitLengths = fruits.stream()
                .map(String::length)
                .collect(Collectors.toList());

        fruitLengths.forEach(System.out::println);

        // Sorting and Ordering:
        List<String> fruits2 = Arrays.asList("cherry", "banana", "apple");

        // Sort the fruits alphabetically
        List<String> sortedFruits = fruits2.stream()
                .sorted()
                .collect(Collectors.toList());

        sortedFruits.forEach(System.out::println);

        // Reducing:
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Calculate the sum of all numbers
        int sum = numbers.stream()
                .reduce(0, Integer::sum); // Initial value is 0, .reduce(0, (a, b) -> a + b);

        System.out.println(sum);


        // Aggregation:
        List<String> fruits3 = Arrays.asList("apple", "banana", "cherry", "date");

        // Collect fruits into a comma-separated string
        String joinedFruits = fruits3.stream()
                .collect(Collectors.joining(", "));

        System.out.println(joinedFruits);

        // Grouping:
        List<String> fruits4 = Arrays.asList("apple", "banana", "cherry", "date");

        // Group fruits by their first letter
        Map<Character, List<String>> groupedFruits = fruits4.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        for (var f : groupedFruits.entrySet()) {
            System.out.println(f);
        }

        // Parallel Streams:
        List<String> fruits5 = Arrays.asList("apple", "banana", "cherry", "date", "avocado");

        // Use parallel stream for faster processing
        long count = fruits5.parallelStream()
                .filter(s -> s.startsWith("a"))
                .count();

        System.out.println(count);

        // Stream API for Primitives:
        int[] numbers2 = {1, 2, 3, 4, 5};

        // Calculate the sum of all numbers using IntStream
        int sum2 = IntStream.of(numbers2)
                .sum();

        System.out.println(sum2);


        // Flattening a List of Strings into Characters:
        List<String> words = Arrays.asList("hello", "world");
        List<Character> characters = words.stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char) c)) // Flatten into characters
                .collect(Collectors.toList());

        characters.forEach(System.out::println);

        // Resulting characters: ['h', 'e', 'l', 'l', 'o', 'w', 'o', 'r', 'l', 'd']

        // Flattening Nested Lists:
        List<List<Integer>> nestedLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        List<Integer> flattenedList = nestedLists.stream()
                .flatMap(List::stream) // Flatten the nested lists
                .collect(Collectors.toList());

        flattenedList.forEach(System.out::println);

        // Resulting flattenedList: [1, 2, 3, 4, 5, 6, 7, 8]

    }
}
