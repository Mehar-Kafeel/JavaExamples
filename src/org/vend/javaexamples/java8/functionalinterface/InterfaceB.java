package org.vend.javaexamples.java8.functionalinterface;

public interface InterfaceB {

    public Double radius = 3.14;
    public static Double distance = 1.0;
    public final Double decimal = 0.0;
    public static final Double distanceInKm = 5.0;

    private void print() {
        System.out.print("Print me");
    }

    public void println();

    default public void defaultPrintln() {
        print();
        System.out.print("Print new line");
        Double radius1 = radius * radius;
    }
}
