package org.vend.javaexamples.java9.stream;

import java.util.stream.Stream;

public class Tester {

    public static void main(String[] args) {

        Stream.of("O", "K", "A", "", "Y").takeWhile(s -> !s.isEmpty()).forEach(System.out::print);
        Stream.of("O", "K", "A", "", "Y").dropWhile(s -> !s.isEmpty()).forEach(System.out::println);
    }
}
