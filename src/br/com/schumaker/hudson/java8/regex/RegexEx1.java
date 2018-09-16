package br.com.schumaker.hudson.java8.regex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 *
 * @author hudsonschumaker
 */
public class RegexEx1 {
    public static void main(String[] args) {
        // Input list
        List<String> emails = Arrays.asList("hudson@example.com", "hugo@yahoo.com",
                            "henrique@google.com", "humberto@example.com");
        
        // Compile regex as predicate
        //Predicate<String> emailFilter = Pattern
        //                 .compile("^(.+)@example.com$")
        //               .asPredicate();
        // Apply predicate filter  in line
        List<String> desiredEmails = emails
                                    .stream()
                                    .filter(Pattern.compile("^(.+)@example.com$").asPredicate())
                                    .collect(Collectors.<String>toList());
 
        // Now perform desired operation
        desiredEmails.forEach(System.out::println);
    }
}