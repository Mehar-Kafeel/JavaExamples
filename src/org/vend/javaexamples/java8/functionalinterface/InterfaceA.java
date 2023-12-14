package org.vend.javaexamples.java8.functionalinterface;

//A functional interface must has an abstract method.

public interface InterfaceA {

    public Double radius = 3.14;
    public static Double distance = 1.0;
    public final Double decimal = 0.0;
    public static final Double distanceInKm = 5.0;

    private void print() {
        System.out.print("Print me");
    }

    //Abstract method
    public void println();

    default public void defaultPrintln() {
        print();
        System.out.print("Print new line");
        Double radius1 = radius * radius;
    }



}
