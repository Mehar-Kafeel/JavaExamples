package org.vend.javaexamples.java8.lambdaexpressions;

import java.util.ArrayList;

public class LambdaExpression3 {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(50);
        arr.add(23);
        arr.add(12);
        arr.add(32);
        arr.add(31);

        arr.forEach(n -> System.out.println(n));

        System.out.println("Even numbers");
        arr.forEach(n -> {
            if(n % 2 == 0)
                System.out.println(n);
        });
    }
}
