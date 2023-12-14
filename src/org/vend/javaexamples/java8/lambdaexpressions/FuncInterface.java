package org.vend.javaexamples.java8.lambdaexpressions;

interface FuncInterface {

    void fun(int x);

    default void normalFun() {
        System.out.println("Hello");
    }
}
