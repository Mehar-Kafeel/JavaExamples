package org.vend.javaexamples.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class Stream1 {

    public static void main(String[] args) {

        List<String> namesCollection = new ArrayList<>();
        namesCollection.add("Mehar");
        namesCollection.add("Kafeel");
        namesCollection.add("Rayyan");
        namesCollection.add("Laiba");


        namesCollection.stream().forEach(x -> System.out.println(x));
        namesCollection.stream().forEach(System.out::println);
    }
}
