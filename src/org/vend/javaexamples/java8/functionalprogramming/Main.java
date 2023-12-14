package org.vend.javaexamples.java8.functionalprogramming;

public class Main {
    public static void main(String[] args) {
        Converter<String, Integer> obj = (from) -> Integer.valueOf(from);
        Integer convertedNum = obj.convert("402");
        System.out.println(convertedNum);
        }
    }
