package org.vend.javaexamples.java8.lambdaexpressions;

import java.util.Arrays;
import java.util.List;

public class Practice {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        numbers.forEach(x -> System.out.println(x*x));
    }
}
