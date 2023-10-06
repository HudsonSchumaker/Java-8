package br.com.schumaker.hudson.java8.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueEx1 {
    public static void main(String... args) {
        Queue<String> products = new ArrayDeque<>();
        products.add("p1");
        products.add("p2");
        products.add("p3");

        System.out.print(products.peek()); // retrieve, but do not remove
        System.out.print(products.poll()); // retrieve and remove
        System.out.println();

        products.forEach(System.out::print);
    }
}
