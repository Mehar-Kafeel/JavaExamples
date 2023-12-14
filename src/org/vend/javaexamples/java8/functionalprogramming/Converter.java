package org.vend.javaexamples.java8.functionalprogramming;

@FunctionalInterface
public interface Converter<F,T> {
    T convert(F from);
}
