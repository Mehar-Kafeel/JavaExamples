package org.vend.javaexamples.java8.functionalprogramming;

@FunctionalInterface
public interface BonusCalculator {

    public void calcBonus(int x);

    public default void greetMessage() {
        System.out.println("default method");
    }

    public static void check() {
        System.out.println("Static method");
    }
}
