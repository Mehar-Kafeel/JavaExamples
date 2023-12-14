package org.vend.javaexamples.java8.functionalinterface;

public class InterfaceImpl implements InterfaceA, InterfaceB{

    public static void main(String[] args) {

    }

    @Override
    public void println() {

    }

    @Override
    public void defaultPrintln() {
        InterfaceA.super.defaultPrintln();
    }
}
