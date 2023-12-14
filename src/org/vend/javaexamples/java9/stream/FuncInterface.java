package org.vend.javaexamples.java9.stream;

//Using private method in default method
//Java9 let us allow to create private method which
//can be used in default implementation

public interface FuncInterface {

    public void print();

    private void test() {
        System.out.println("Test");
    }

    public default void callTest() {
        test();
    }
}
