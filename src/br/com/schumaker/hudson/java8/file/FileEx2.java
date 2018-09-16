package br.com.schumaker.hudson.java8.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author hudsonschumaker
 */
public class FileEx2 {
    public static void main(String[] args) throws IOException {
        Files.list(Paths.get("/Users/hudsonschumaker/NetBeansProjects/Poo/src/br/com/schumaker/hudson/oo/heranca"))
                .filter(p -> p.toString().endsWith(".java"))
                .forEach(System.out::println);
    }
}
