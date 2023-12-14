package org.vend.javaexamples.java8.lambdaexpressions;

public class LambdaExpression2 {
    public static void main(String[] args) {
        FuncInterface fObj = (x) -> System.out.println(x*2);
        fObj.fun(10);
    }
}
