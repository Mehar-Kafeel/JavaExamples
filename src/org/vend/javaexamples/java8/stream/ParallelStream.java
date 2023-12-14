package org.vend.javaexamples.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

    public static void main(String[] args) {
        int max =   1000000;
        List<Integer> numbers = new ArrayList<>(max);

        for(int i=0 ; i < max ; i++) {
            int randomNumber = (int) Math.random() * 10000000;
            numbers.add(randomNumber);
        }

        long timeStart = System.currentTimeMillis();
        numbers.stream().sorted().count();
        long timeEnd = System.currentTimeMillis();
        System.out.println("Sequential sort took: " + (timeEnd - timeStart));

        timeStart = System.currentTimeMillis();
        numbers.parallelStream().sorted().count();
        timeEnd = System.currentTimeMillis();
        System.out.println("Parallel sort took: " + (timeEnd - timeStart));

    }

}
