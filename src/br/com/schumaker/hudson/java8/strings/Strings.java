package br.com.schumaker.hudson.java8.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Strings {

    public static void main(String... args) {
        String str = "Hudson Luiz Sales Schumaker";
        var result = maxOccurenceCharacter(str);



        var x = 0;
    }

    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static String removeCharacter(String str, char ch) {
        // return str.replaceAll(Pattern.quote(String.valueOf(ch)), "");

        return str.chars()
                .filter(c -> c != ch)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }

    public static String removeDuplicates(String str) {
        return Arrays.stream(str.split(""))
                .distinct()
                .collect(Collectors.joining());
    }

    public static Pair<Character, Long> maxOccurenceCharacter(String str) {

        return str.chars()
                .filter(c -> Character.isWhitespace(c) == false) // ignoring space
                .mapToObj(c -> (char) c)                         // map from char to Character
                .collect(groupingBy(c -> c, counting()))
                .entrySet()
                .stream().parallel()
                .max(comparingByValue())
                .map(p -> Pair.of(p.getKey(), p.getValue()))
                .orElse(Pair.of(Character.MIN_VALUE, -1L));
    }


}
