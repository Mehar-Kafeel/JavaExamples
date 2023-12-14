package org.vend.javaexamples.java9.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIterator {

    public static void main(String[] args) {

        //has Next condition has been added in Java9
        IntStream.iterate(2, x -> x<=11, x -> x+3).forEach(System.out::println);

        System.out.println(Stream.ofNullable(1).count());
        System.out.println(Stream.ofNullable(null).count());

    }
}
