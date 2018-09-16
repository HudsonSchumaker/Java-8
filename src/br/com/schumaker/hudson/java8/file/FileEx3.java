package br.com.schumaker.hudson.java8.file;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @author hudsonschumaker
 */
public class FileEx3 {
    public static void main(String[] args) throws IOException {
        Stream<String> strings =
                Files.list(Paths.get("/Users/hudsonschumaker/NetBeansProjects/Poo/src/br/com/schumaker/hudson/oo/heranca"))
                .filter(p -> p.toString().endsWith(".java"))
                .flatMap(p -> lines(p));
        
        strings.forEach(System.out::println);
    } 

    static Stream<String> lines(Path p) {
        try {
            return Files.lines(p);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
